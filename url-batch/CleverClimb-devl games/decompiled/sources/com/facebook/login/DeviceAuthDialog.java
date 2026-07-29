package com.facebook.login;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.DialogFragment;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.R;
import com.facebook.internal.ab;
import com.facebook.internal.ac;
import com.facebook.j;
import com.facebook.l;
import com.facebook.login.LoginClient;
import com.facebook.o;
import com.facebook.q;
import com.facebook.s;
import java.util.Date;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DeviceAuthDialog extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private ProgressBar f6224a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f6225b;

    /* renamed from: c, reason: collision with root package name */
    private DeviceAuthMethodHandler f6226c;
    private volatile o e;
    private volatile ScheduledFuture f;
    private volatile RequestState g;
    private Dialog h;

    /* renamed from: d, reason: collision with root package name */
    private AtomicBoolean f6227d = new AtomicBoolean();
    private boolean i = false;

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f6226c = (DeviceAuthMethodHandler) ((LoginFragment) ((FacebookActivity) getActivity()).a()).b().getCurrentHandler();
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            a(requestState);
        }
        return onCreateView;
    }

    @Override // android.support.v4.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        this.h = new Dialog(getActivity(), R.style.com_facebook_auth_dialog);
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.f6224a = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.f6225b = (TextView) inflate.findViewById(R.id.confirmation_code);
        ((Button) inflate.findViewById(R.id.cancel_button)).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.DeviceAuthDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DeviceAuthDialog.this.d();
            }
        });
        ((TextView) inflate.findViewById(R.id.com_facebook_device_auth_instructions)).setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        this.h.setContentView(inflate);
        return this.h;
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.i) {
            return;
        }
        d();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.g != null) {
            bundle.putParcelable("request_state", this.g);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        this.i = true;
        this.f6227d.set(true);
        super.onDestroy();
        if (this.e != null) {
            this.e.cancel(true);
        }
        if (this.f != null) {
            this.f.cancel(true);
        }
    }

    public void a(LoginClient.Request request) {
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.getPermissions()));
        String deviceRedirectUriString = request.getDeviceRedirectUriString();
        if (deviceRedirectUriString != null) {
            bundle.putString("redirect_uri", deviceRedirectUriString);
        }
        bundle.putString("access_token", ac.b() + "|" + ac.c());
        new GraphRequest(null, "device/login", bundle, s.POST, new GraphRequest.b() { // from class: com.facebook.login.DeviceAuthDialog.2
            @Override // com.facebook.GraphRequest.b
            public void a(q qVar) {
                if (qVar.a() != null) {
                    DeviceAuthDialog.this.a(qVar.a().getException());
                    return;
                }
                JSONObject b2 = qVar.b();
                RequestState requestState = new RequestState();
                try {
                    requestState.setUserCode(b2.getString("user_code"));
                    requestState.setRequestCode(b2.getString("code"));
                    requestState.setInterval(b2.getLong("interval"));
                    DeviceAuthDialog.this.a(requestState);
                } catch (JSONException e) {
                    DeviceAuthDialog.this.a(new j(e));
                }
            }
        }).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RequestState requestState) {
        this.g = requestState;
        this.f6225b.setText(requestState.getUserCode());
        this.f6225b.setVisibility(0);
        this.f6224a.setVisibility(8);
        if (requestState.withinLastRefreshWindow()) {
            b();
        } else {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.g.setLastPoll(new Date().getTime());
        this.e = c().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f = DeviceAuthMethodHandler.getBackgroundExecutor().schedule(new Runnable() { // from class: com.facebook.login.DeviceAuthDialog.3
            @Override // java.lang.Runnable
            public void run() {
                DeviceAuthDialog.this.a();
            }
        }, this.g.getInterval(), TimeUnit.SECONDS);
    }

    private GraphRequest c() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.g.getRequestCode());
        return new GraphRequest(null, "device/login_status", bundle, s.POST, new GraphRequest.b() { // from class: com.facebook.login.DeviceAuthDialog.4
            @Override // com.facebook.GraphRequest.b
            public void a(q qVar) {
                if (DeviceAuthDialog.this.f6227d.get()) {
                    return;
                }
                FacebookRequestError a2 = qVar.a();
                if (a2 != null) {
                    int subErrorCode = a2.getSubErrorCode();
                    if (subErrorCode != 1349152) {
                        switch (subErrorCode) {
                            case 1349172:
                            case 1349174:
                                DeviceAuthDialog.this.b();
                                break;
                            case 1349173:
                                break;
                            default:
                                DeviceAuthDialog.this.a(qVar.a().getException());
                                break;
                        }
                        return;
                    }
                    DeviceAuthDialog.this.d();
                    return;
                }
                try {
                    DeviceAuthDialog.this.a(qVar.b().getString("access_token"));
                } catch (JSONException e) {
                    DeviceAuthDialog.this.a(new j(e));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions");
        new GraphRequest(new AccessToken(str, l.i(), "0", null, null, null, null, null), "me", bundle, s.GET, new GraphRequest.b() { // from class: com.facebook.login.DeviceAuthDialog.5
            @Override // com.facebook.GraphRequest.b
            public void a(q qVar) {
                if (DeviceAuthDialog.this.f6227d.get()) {
                    return;
                }
                if (qVar.a() != null) {
                    DeviceAuthDialog.this.a(qVar.a().getException());
                    return;
                }
                try {
                    JSONObject b2 = qVar.b();
                    String string = b2.getString("id");
                    ab.e a2 = ab.a(b2);
                    DeviceAuthDialog.this.f6226c.onSuccess(str, l.i(), string, a2.a(), a2.b(), com.facebook.c.DEVICE_AUTH, null, null);
                    DeviceAuthDialog.this.h.dismiss();
                } catch (JSONException e) {
                    DeviceAuthDialog.this.a(new j(e));
                }
            }
        }).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(j jVar) {
        if (this.f6227d.compareAndSet(false, true)) {
            this.f6226c.onError(jVar);
            this.h.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f6227d.compareAndSet(false, true)) {
            if (this.f6226c != null) {
                this.f6226c.onCancel();
            }
            this.h.dismiss();
        }
    }

    private static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new Parcelable.Creator<RequestState>() { // from class: com.facebook.login.DeviceAuthDialog.RequestState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RequestState createFromParcel(Parcel parcel) {
                return new RequestState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RequestState[] newArray(int i) {
                return new RequestState[i];
            }
        };
        private long interval;
        private long lastPoll;
        private String requestCode;
        private String userCode;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        RequestState() {
        }

        public String getUserCode() {
            return this.userCode;
        }

        public void setUserCode(String str) {
            this.userCode = str;
        }

        public String getRequestCode() {
            return this.requestCode;
        }

        public void setRequestCode(String str) {
            this.requestCode = str;
        }

        public long getInterval() {
            return this.interval;
        }

        public void setInterval(long j) {
            this.interval = j;
        }

        public void setLastPoll(long j) {
            this.lastPoll = j;
        }

        protected RequestState(Parcel parcel) {
            this.userCode = parcel.readString();
            this.requestCode = parcel.readString();
            this.interval = parcel.readLong();
            this.lastPoll = parcel.readLong();
        }

        public boolean withinLastRefreshWindow() {
            return this.lastPoll != 0 && (new Date().getTime() - this.lastPoll) - (this.interval * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.userCode);
            parcel.writeString(this.requestCode);
            parcel.writeLong(this.interval);
            parcel.writeLong(this.lastPoll);
        }
    }
}
