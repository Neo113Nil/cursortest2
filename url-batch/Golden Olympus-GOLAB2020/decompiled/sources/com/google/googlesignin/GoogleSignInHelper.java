package com.google.googlesignin;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public class GoogleSignInHelper {
    private static final String TAG = "SignInFragment";
    public static boolean loggingEnabled = false;

    public static void configure(Activity activity, boolean z4, String str, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str2, String[] strArr, long j4) {
        logDebug("TokenFragment.configure called");
        TokenRequest tokenRequest = new TokenRequest(z4, str, z5, z6, z7, z8, z9, str2, strArr, j4);
        GoogleSignInFragment googleSignInFragment = GoogleSignInFragment.getInstance(activity);
        if (!tokenRequest.isValid()) {
            nativeOnResult(j4, 10, null);
        } else {
            if (googleSignInFragment.submitRequest(tokenRequest)) {
                return;
            }
            logError("There is already a pending authentication token request!");
        }
    }

    public static void disconnect(Activity activity) {
        GoogleSignInFragment.getInstance(activity).disconnect();
    }

    public static void enableDebugLogging(boolean z4) {
        loggingEnabled = z4;
    }

    public static void logDebug(String str) {
        if (loggingEnabled) {
            Log.d(TAG, str);
        }
    }

    public static void logError(String str) {
        Log.e(TAG, str);
    }

    public static void logInfo(String str) {
        if (loggingEnabled) {
            Log.i(TAG, str);
        }
    }

    public static native void nativeOnResult(long j4, int i4, GoogleSignInAccount googleSignInAccount);

    public static void signIn(Activity activity, long j4) {
        logDebug("AuthHelperFragment.authenticate called!");
        if (GoogleSignInFragment.getInstance(activity).startSignIn()) {
            return;
        }
        nativeOnResult(j4, 10, null);
    }

    public static void signInSilently(Activity activity, long j4) {
        logDebug("AuthHelperFragment.signinSilently called!");
        if (GoogleSignInFragment.getInstance(activity).startSignInSilently()) {
            return;
        }
        nativeOnResult(j4, 10, null);
    }

    public static void signOut(Activity activity) {
        GoogleSignInFragment.getInstance(activity).signOut();
    }
}
