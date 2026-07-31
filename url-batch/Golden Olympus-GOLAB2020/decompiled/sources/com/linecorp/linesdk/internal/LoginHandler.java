package com.linecorp.linesdk.internal;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import com.linecorp.linesdk.LineApiResponseCode;
import com.linecorp.linesdk.LoginListener;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.LineLoginApi;
import com.linecorp.linesdk.auth.LineLoginResult;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class LoginHandler {
    private static int REQUEST_CODE_LOGIN = 1;
    private static String TAG = "LoginHandler";

    @NonNull
    private ArrayList<LoginListener> loginListeners = new ArrayList<>();

    @NonNull
    private Intent getLoginIntent(@NonNull Activity activity, boolean z4, @NonNull String str, @NonNull LineAuthenticationParams lineAuthenticationParams) {
        return z4 ? LineLoginApi.getLoginIntent(activity, str, lineAuthenticationParams) : LineLoginApi.getLoginIntentWithoutLineAppAuth(activity, str, lineAuthenticationParams);
    }

    private boolean isLoginCanceled(int i4, Intent intent) {
        return i4 != -1 || intent == null;
    }

    private boolean isLoginRequestCode(int i4) {
        return i4 == REQUEST_CODE_LOGIN;
    }

    private boolean isLoginSuccess(LineLoginResult lineLoginResult) {
        return lineLoginResult != null && lineLoginResult.getResponseCode() == LineApiResponseCode.SUCCESS;
    }

    private void onLoginFailure(LineLoginResult lineLoginResult) {
        ArrayList<LoginListener> arrayList = this.loginListeners;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            LoginListener loginListener = arrayList.get(i4);
            i4++;
            loginListener.onLoginFailure(lineLoginResult);
        }
    }

    private void onLoginSuccess(LineLoginResult lineLoginResult) {
        ArrayList<LoginListener> arrayList = this.loginListeners;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            LoginListener loginListener = arrayList.get(i4);
            i4++;
            loginListener.onLoginSuccess(lineLoginResult);
        }
    }

    public void addLoginListener(@NonNull LoginListener loginListener) {
        this.loginListeners.add(loginListener);
    }

    boolean onActivityResult(int i4, int i5, Intent intent) {
        if (!isLoginRequestCode(i4)) {
            Log.w(TAG, "Unexpected login request code");
            return false;
        }
        if (isLoginCanceled(i5, intent)) {
            Log.w(TAG, "Login failed");
            return false;
        }
        LineLoginResult loginResultFromIntent = LineLoginApi.getLoginResultFromIntent(intent);
        if (isLoginSuccess(loginResultFromIntent)) {
            onLoginSuccess(loginResultFromIntent);
            return true;
        }
        onLoginFailure(loginResultFromIntent);
        return true;
    }

    public void performLogin(@NonNull Activity activity, boolean z4, @NonNull String str, @NonNull LineAuthenticationParams lineAuthenticationParams) {
        activity.startActivityForResult(getLoginIntent(activity, z4, str, lineAuthenticationParams), REQUEST_CODE_LOGIN);
    }

    public void removeLoginListener(@NonNull LoginListener loginListener) {
        this.loginListeners.remove(loginListener);
    }

    public void performLogin(@NonNull Activity activity, @NonNull FragmentWrapper fragmentWrapper, boolean z4, @NonNull String str, @NonNull LineAuthenticationParams lineAuthenticationParams) {
        fragmentWrapper.startActivityForResult(getLoginIntent(activity, z4, str, lineAuthenticationParams), REQUEST_CODE_LOGIN);
    }
}
