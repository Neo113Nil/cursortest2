package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.login.LoginClient;
import defpackage.b4;
import defpackage.fr0;
import defpackage.k4;
import defpackage.kr0;
import defpackage.t3;
import defpackage.x3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class LoginFragment extends fr0 {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_REQUEST = "request";
    private static final String NULL_CALLING_PKG_ERROR_MSG = "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.";
    public static final String REQUEST_KEY = "com.facebook.LoginFragment:Request";
    public static final String RESULT_KEY = "com.facebook.LoginFragment:Result";
    private static final String SAVED_LOGIN_CLIENT = "loginClient";
    private static final String TAG = "LoginFragment";
    private String callingPackage;
    private b4 launcher;
    private LoginClient loginClient;
    private View progressBar;
    private LoginClient.Request request;

    private final Function1<t3, Unit> getLoginMethodHandlerCallback(kr0 kr0Var) {
        return new LoginFragment$getLoginMethodHandlerCallback$1(this, kr0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideSpinner() {
        View view = this.progressBar;
        if (view == null) {
            Intrinsics.f("progressBar");
            throw null;
        }
        view.setVisibility(8);
        onSpinnerHidden();
    }

    private final void initializeCallingPackage(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return;
        }
        this.callingPackage = callingActivity.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(LoginFragment loginFragment, LoginClient.Result result) {
        loginFragment.getClass();
        result.getClass();
        loginFragment.onLoginClientCompleted(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(Function1 function1, t3 t3Var) {
        function1.getClass();
        function1.invoke(t3Var);
    }

    private final void onLoginClientCompleted(LoginClient.Result result) {
        this.request = null;
        int i = result.code == LoginClient.Result.Code.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable(RESULT_KEY, result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        kr0 activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        activity.setResult(i, intent);
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSpinner() {
        View view = this.progressBar;
        if (view == null) {
            Intrinsics.f("progressBar");
            throw null;
        }
        view.setVisibility(0);
        onSpinnerShown();
    }

    public LoginClient createLoginClient() {
        return new LoginClient(this);
    }

    public final b4 getLauncher() {
        b4 b4Var = this.launcher;
        if (b4Var != null) {
            return b4Var;
        }
        Intrinsics.f("launcher");
        throw null;
    }

    public int getLayoutResId() {
        return com.facebook.common.R.layout.com_facebook_login_fragment;
    }

    public final LoginClient getLoginClient() {
        LoginClient loginClient = this.loginClient;
        if (loginClient != null) {
            return loginClient;
        }
        Intrinsics.f(SAVED_LOGIN_CLIENT);
        throw null;
    }

    @Override // defpackage.fr0
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        getLoginClient().onActivityResult(i, i2, intent);
    }

    @Override // defpackage.fr0
    public void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        LoginClient loginClient = bundle != null ? (LoginClient) bundle.getParcelable(SAVED_LOGIN_CLIENT) : null;
        if (loginClient != null) {
            loginClient.setFragment(this);
        } else {
            loginClient = createLoginClient();
        }
        this.loginClient = loginClient;
        getLoginClient().setOnCompletedListener(new k4(8, this));
        kr0 activity = getActivity();
        if (activity == null) {
            return;
        }
        initializeCallingPackage(activity);
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra(REQUEST_KEY)) != null) {
            this.request = (LoginClient.Request) bundleExtra.getParcelable("request");
        }
        b4 registerForActivityResult = registerForActivityResult(new x3(3), new k4(9, getLoginMethodHandlerCallback(activity)));
        registerForActivityResult.getClass();
        this.launcher = registerForActivityResult;
    }

    @Override // defpackage.fr0
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(getLayoutResId(), viewGroup, false);
        View findViewById = inflate.findViewById(com.facebook.common.R.id.com_facebook_login_fragment_progress_bar);
        findViewById.getClass();
        this.progressBar = findViewById;
        getLoginClient().setBackgroundProcessingListener(new LoginClient.BackgroundProcessingListener() { // from class: com.facebook.login.LoginFragment$onCreateView$1
            @Override // com.facebook.login.LoginClient.BackgroundProcessingListener
            public void onBackgroundProcessingStarted() {
                LoginFragment.this.showSpinner();
            }

            @Override // com.facebook.login.LoginClient.BackgroundProcessingListener
            public void onBackgroundProcessingStopped() {
                LoginFragment.this.hideSpinner();
            }
        });
        return inflate;
    }

    @Override // defpackage.fr0
    public void onDestroy() {
        getLoginClient().cancelCurrentHandler();
        super.onDestroy();
    }

    @Override // defpackage.fr0
    public void onPause() {
        super.onPause();
        View view = getView();
        View findViewById = view != null ? view.findViewById(com.facebook.common.R.id.com_facebook_login_fragment_progress_bar) : null;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // defpackage.fr0
    public void onResume() {
        super.onResume();
        if (this.callingPackage != null) {
            getLoginClient().startOrContinueAuth(this.request);
            return;
        }
        Log.e(TAG, NULL_CALLING_PKG_ERROR_MSG);
        kr0 activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // defpackage.fr0
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        bundle.putParcelable(SAVED_LOGIN_CLIENT, getLoginClient());
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public void onSpinnerHidden() {
    }

    public void onSpinnerShown() {
    }
}
