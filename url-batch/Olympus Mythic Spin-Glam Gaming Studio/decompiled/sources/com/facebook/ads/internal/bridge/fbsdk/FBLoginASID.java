package com.facebook.ads.internal.bridge.fbsdk;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.AccessToken;
import com.facebook.infer.annotation.Nullsafe;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class FBLoginASID {
    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String getFBLoginASID() {
        try {
            AccessToken.Companion companion = AccessToken.INSTANCE;
            Object invoke = AccessToken.class.getDeclaredMethod("getCurrentAccessToken", null).invoke(null, null);
            if (invoke != null) {
                return (String) AccessToken.class.getDeclaredMethod("getUserId", null).invoke(invoke, null);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
