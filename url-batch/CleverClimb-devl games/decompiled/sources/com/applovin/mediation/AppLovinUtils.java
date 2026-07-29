package com.applovin.mediation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;

/* loaded from: classes.dex */
class AppLovinUtils {
    private static final String DEFAULT_ZONE = "";

    static int toAdMobErrorCode(int i) {
        if (i == 204) {
            return 3;
        }
        return i == -102 ? 2 : 0;
    }

    AppLovinUtils() {
    }

    private static class ServerParameterKeys {
        private static final String PLACEMENT = "placement";
        private static final String SDK_KEY = "sdkKey";
        private static final String ZONE_ID = "zone_id";

        private ServerParameterKeys() {
        }
    }

    static AppLovinSdk retrieveSdk(Bundle bundle, Context context) {
        AppLovinSdk appLovinSdk;
        String string = bundle.getString("sdkKey");
        if (!TextUtils.isEmpty(string)) {
            appLovinSdk = AppLovinSdk.getInstance(string, new AppLovinSdkSettings(), context);
        } else {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        appLovinSdk.setPluginVersion(BuildConfig.VERSION_NAME);
        appLovinSdk.setMediationProvider(AppLovinMediationProvider.ADMOB);
        return appLovinSdk;
    }

    static String retrievePlacement(Bundle bundle) {
        if (bundle.containsKey("placement")) {
            return bundle.getString("placement");
        }
        return null;
    }

    static String retrieveZoneId(Bundle bundle) {
        return bundle.containsKey("zone_id") ? bundle.getString("zone_id") : "";
    }

    static boolean shouldMuteAudio(Bundle bundle) {
        return bundle != null && bundle.getBoolean("mute_audio");
    }
}
