package com.youappi.sdk.mediation.admob;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.cmplay.base.util.ipc.a;
import com.youappi.sdk.YAErrorCode;
import com.youappi.sdk.YouAPPi;
import org.json.JSONException;

/* loaded from: classes2.dex */
final class YouAppiAdMobUtils {
    private static final String CONSENT_KEY = "consent";

    YouAppiAdMobUtils() {
    }

    static boolean initSdk(String str, Context context, String str2, Bundle bundle) throws JSONException {
        boolean equalsIgnoreCase;
        if (str2 != null) {
            Log.i(str, "Initializing YouAppi SDK with access token: " + str2);
            if (bundle == null || bundle.get(CONSENT_KEY) == null) {
                if (context != null) {
                    try {
                        equalsIgnoreCase = Class.forName("com.google.ads.consent.ConsentInformation").getDeclaredMethod("getConsentStatus", new Class[0]).invoke(Class.forName("com.google.ads.consent.ConsentInformation").getMethod(a.FORCE_STATIC_METHOD, Context.class).invoke(Class.forName("com.google.ads.consent.ConsentInformation"), context), new Object[0]).toString().toLowerCase().equalsIgnoreCase("PERSONALIZED".toLowerCase());
                    } catch (Exception unused) {
                    }
                }
                equalsIgnoreCase = false;
            } else {
                equalsIgnoreCase = ((Boolean) bundle.get(CONSENT_KEY)).booleanValue();
            }
            YouAPPi.init(context, str2, false);
            YouAPPi.getInstance().setUserConsent(equalsIgnoreCase);
            return true;
        }
        Log.e(str, "Failed Initializing YouAppi SDK. Access Token is not configured in AdMob console");
        return false;
    }

    static int toAdMobErrorCode(YAErrorCode yAErrorCode) {
        switch (yAErrorCode) {
            case NO_FILL:
                return 3;
            case PRELOAD_ERROR:
            case SERVER_ERROR:
                return 2;
            default:
                return 0;
        }
    }
}
