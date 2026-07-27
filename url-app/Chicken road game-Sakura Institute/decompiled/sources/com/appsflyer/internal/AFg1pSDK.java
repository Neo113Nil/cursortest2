package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFg1pSDK implements AFg1vSDK {
    private final Context AFInAppEventType;
    private final AppsFlyerProperties values;

    public AFg1pSDK(Context context, AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.AFInAppEventType = context;
        this.values = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final AFg1qSDK valueOf() {
        String string;
        if (!Boolean.parseBoolean(this.values.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.AFInAppEventType);
            int i2 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i4 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i5 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i6 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i2 == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFg1qSDK(i5, i2, i4, i6, str);
        } catch (Exception e4) {
            AFg1fSDK.e$default(AFLogger.INSTANCE, AFg1aSDK.DMA, "TCF data collection exception", e4, false, false, false, false, 120, null);
            return null;
        }
    }
}
