package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.FacebookActivity;
import com.facebook.R;
import com.facebook.internal.ab;
import com.facebook.k;
import com.facebook.login.LoginClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class LoginFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private String f6243a;

    /* renamed from: b, reason: collision with root package name */
    private LoginClient f6244b;

    /* renamed from: c, reason: collision with root package name */
    private LoginClient.Request f6245c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6246d;
    private String e;

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6246d = bundle != null;
        if (bundle != null) {
            this.f6244b = (LoginClient) bundle.getParcelable("loginClient");
            this.f6244b.setFragment(this);
            this.e = bundle.getString("challenge");
        } else {
            this.f6244b = new LoginClient(this);
            this.e = ab.a(20);
        }
        this.f6244b.setOnCompletedListener(new LoginClient.b() { // from class: com.facebook.login.LoginFragment.1
            @Override // com.facebook.login.LoginClient.b
            public void a(LoginClient.Result result) {
                LoginFragment.this.a(result);
            }
        });
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        a(activity);
        if (activity.getIntent() != null) {
            Intent intent = activity.getIntent();
            intent.setExtrasClassLoader(LoginClient.Request.class.getClassLoader());
            this.f6245c = (LoginClient.Request) intent.getParcelableExtra("request");
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        this.f6244b.cancelCurrentHandler();
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final View inflate = layoutInflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        this.f6244b.setBackgroundProcessingListener(new LoginClient.a() { // from class: com.facebook.login.LoginFragment.2
            @Override // com.facebook.login.LoginClient.a
            public void a() {
                inflate.findViewById(R.id.com_facebook_login_activity_progress_bar).setVisibility(0);
            }

            @Override // com.facebook.login.LoginClient.a
            public void b() {
                inflate.findViewById(R.id.com_facebook_login_activity_progress_bar).setVisibility(8);
            }
        });
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(LoginClient.Result result) {
        this.f6245c = null;
        int i = result.code == LoginClient.Result.a.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (isAdded()) {
            getActivity().setResult(i, intent);
            getActivity().finish();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f6243a == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            getActivity().finish();
            return;
        }
        if (this.f6246d) {
            FragmentActivity activity = getActivity();
            if ((activity instanceof FacebookActivity) && (this.f6244b.getCurrentHandler() instanceof CustomTabLoginMethodHandler)) {
                ((FacebookActivity) activity).a(null, new k());
            }
        }
        this.f6246d = true;
        this.f6244b.startOrContinueAuth(this.f6245c);
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        super.onPause();
        getActivity().findViewById(R.id.com_facebook_login_activity_progress_bar).setVisibility(8);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f6244b.onActivityResult(i, i2, intent);
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.f6244b);
        bundle.putString("challenge", this.e);
    }

    private void a(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.f6243a = callingActivity.getPackageName();
    }

    public boolean a(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.e);
        } catch (JSONException unused) {
            return false;
        }
    }

    public String a() {
        return this.e;
    }

    LoginClient b() {
        return this.f6244b;
    }
}
