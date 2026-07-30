package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFf1dSDK implements AFf1cSDK {
    private final Context getCurrencyIso4217Code;
    private final AppsFlyerProperties getMonetizationNetwork;

    public AFf1dSDK(Context context, AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.getCurrencyIso4217Code = context;
        this.getMonetizationNetwork = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFf1cSDK
    public final AFf1fSDK getMediationNetwork() {
        String string;
        if (!Boolean.parseBoolean(this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.getCurrencyIso4217Code);
            int i2 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i5 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i7 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i8 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i2 == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFf1fSDK(i7, i2, i5, i8, str);
        } catch (Exception e7) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DMA, "TCF data collection exception", e7, false, false, false, false, 120, null);
            return null;
        }
    }
}
