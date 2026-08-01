package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFg1ySDK implements AFg1xSDK {
    private final AppsFlyerProperties getMonetizationNetwork;
    private final Context getRevenue;

    public AFg1ySDK(Context context, AppsFlyerProperties appsFlyerProperties) {
        context.getClass();
        appsFlyerProperties.getClass();
        this.getRevenue = context;
        this.getMonetizationNetwork = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1xSDK
    public final AFf1bSDK getMediationNetwork() {
        String string;
        if (!Boolean.parseBoolean(this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.getRevenue);
            int i3 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i10 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i11 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i12 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i3 == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                str = string;
            }
            return new AFf1bSDK(i11, i3, i10, i12, str);
        } catch (Exception e2) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DMA, "TCF data collection exception", e2, false, false, false, false, 120, null);
            return null;
        }
    }
}
