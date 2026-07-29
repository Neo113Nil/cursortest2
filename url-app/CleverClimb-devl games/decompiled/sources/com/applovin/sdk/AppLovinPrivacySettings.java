package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.sdk.g;

/* loaded from: classes.dex */
public class AppLovinPrivacySettings {
    public static boolean hasUserConsent(Context context) {
        Boolean a2 = g.a(context);
        if (a2 != null) {
            return a2.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUser(Context context) {
        Boolean b2 = g.b(context);
        if (b2 != null) {
            return b2.booleanValue();
        }
        return false;
    }

    public static void setHasUserConsent(boolean z, Context context) {
        if (g.a(z, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z));
        }
    }

    public static void setIsAgeRestrictedUser(boolean z, Context context) {
        if (g.b(z, context)) {
            AppLovinSdk.reinitializeAll();
        }
    }
}
