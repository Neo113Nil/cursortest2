package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.R;
import com.facebook.internal.ac;
import com.facebook.q;
import com.facebook.s;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DeviceShareDialogFragment extends DialogFragment {
    private static ScheduledThreadPoolExecutor f;

    /* renamed from: a, reason: collision with root package name */
    private ProgressBar f6338a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f6339b;

    /* renamed from: c, reason: collision with root package name */
    private Dialog f6340c;

    /* renamed from: d, reason: collision with root package name */
    private volatile RequestState f6341d;
    private volatile ScheduledFuture e;
    private ShareContent g;

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            a(requestState);
        }
        return onCreateView;
    }

    @Override // android.support.v4.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        this.f6340c = new Dialog(getActivity(), R.style.com_facebook_auth_dialog);
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.f6338a = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.f6339b = (TextView) inflate.findViewById(R.id.confirmation_code);
        ((Button) inflate.findViewById(R.id.cancel_button)).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.share.internal.DeviceShareDialogFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DeviceShareDialogFragment.this.f6340c.dismiss();
            }
        });
        ((TextView) inflate.findViewById(R.id.com_facebook_device_auth_instructions)).setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        ((TextView) inflate.findViewById(R.id.com_facebook_device_dialog_title)).setText(getString(R.string.com_facebook_share_button_text));
        this.f6340c.setContentView(inflate);
        c();
        return this.f6340c;
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.e != null) {
            this.e.cancel(true);
        }
        a(-1, new Intent());
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f6341d != null) {
            bundle.putParcelable("request_state", this.f6341d);
        }
    }

    private void a(int i, Intent intent) {
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            activity.setResult(i, intent);
            activity.finish();
        }
    }

    private void a() {
        if (isAdded()) {
            getFragmentManager().beginTransaction().remove(this).commit();
        }
    }

    public void a(ShareContent shareContent) {
        this.g = shareContent;
    }

    private Bundle b() {
        ShareContent shareContent = this.g;
        if (shareContent == null) {
            return null;
        }
        if (shareContent instanceof ShareLinkContent) {
            return m.a((ShareLinkContent) shareContent);
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            return m.a((ShareOpenGraphContent) shareContent);
        }
        return null;
    }

    private void c() {
        Bundle b2 = b();
        if (b2 == null || b2.size() == 0) {
            a(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        b2.putString("access_token", ac.b() + "|" + ac.c());
        new GraphRequest(null, "device/share", b2, s.POST, new GraphRequest.b() { // from class: com.facebook.share.internal.DeviceShareDialogFragment.2
            @Override // com.facebook.GraphRequest.b
            public void a(q qVar) {
                FacebookRequestError a2 = qVar.a();
                if (a2 != null) {
                    DeviceShareDialogFragment.this.a(a2);
                    return;
                }
                JSONObject b3 = qVar.b();
                RequestState requestState = new RequestState();
                try {
                    requestState.setUserCode(b3.getString("user_code"));
                    requestState.setExpiresIn(b3.getLong("expires_in"));
                    DeviceShareDialogFragment.this.a(requestState);
                } catch (JSONException unused) {
                    DeviceShareDialogFragment.this.a(new FacebookRequestError(0, "", "Malformed server response"));
                }
            }
        }).j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(FacebookRequestError facebookRequestError) {
        a();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        a(-1, intent);
    }

    private static synchronized ScheduledThreadPoolExecutor d() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            if (f == null) {
                f = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f;
        }
        return scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RequestState requestState) {
        this.f6341d = requestState;
        this.f6339b.setText(requestState.getUserCode());
        this.f6339b.setVisibility(0);
        this.f6338a.setVisibility(8);
        this.e = d().schedule(new Runnable() { // from class: com.facebook.share.internal.DeviceShareDialogFragment.3
            @Override // java.lang.Runnable
            public void run() {
                DeviceShareDialogFragment.this.f6340c.dismiss();
            }
        }, requestState.getExpiresIn(), TimeUnit.SECONDS);
    }

    private static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new Parcelable.Creator<RequestState>() { // from class: com.facebook.share.internal.DeviceShareDialogFragment.RequestState.1
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
        private long expiresIn;
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

        public long getExpiresIn() {
            return this.expiresIn;
        }

        public void setExpiresIn(long j) {
            this.expiresIn = j;
        }

        protected RequestState(Parcel parcel) {
            this.userCode = parcel.readString();
            this.expiresIn = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.userCode);
            parcel.writeLong(this.expiresIn);
        }
    }
}
