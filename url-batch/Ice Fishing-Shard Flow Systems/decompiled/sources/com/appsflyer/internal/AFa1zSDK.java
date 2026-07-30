package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFa1zSDK {
    public static final AFa1zSDK INSTANCE = new AFa1zSDK();

    private AFa1zSDK() {
    }

    public static final void getCurrencyIso4217Code(AFc1fSDK aFc1fSDK, AFc1kSDK aFc1kSDK) {
        int i2;
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFj1pSDK.getMonetizationNetwork()) {
            AFLogger.afRDLog("OPPO device found");
            i2 = 23;
        } else {
            i2 = 18;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < i2 || appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            AFLogger.afRDLog("OS SDK is=" + i5 + "; no KeyStore usage");
            return;
        }
        AFLogger.afRDLog("OS SDK is=" + i5 + "; use KeyStore");
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(aFc1fSDK.getCurrencyIso4217Code);
        if (aFKeystoreWrapper.getMediationNetwork()) {
            String revenue = aFKeystoreWrapper.getRevenue();
            synchronized (aFKeystoreWrapper.getMediationNetwork) {
                aFKeystoreWrapper.getMonetizationNetwork++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(revenue)));
                try {
                    synchronized (aFKeystoreWrapper.getMediationNetwork) {
                        aFKeystoreWrapper.getRevenue.deleteEntry(revenue);
                    }
                } catch (KeyStoreException e7) {
                    StringBuilder sb = new StringBuilder("Exception ");
                    sb.append(e7.getMessage());
                    sb.append(" occurred");
                    AFLogger.afErrorLog(sb.toString(), e7);
                }
            }
            aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getRevenue());
        } else {
            aFKeystoreWrapper.AFAdRevenueData = AFb1iSDK.getCurrencyIso4217Code(aFc1kSDK.getCurrencyIso4217Code);
            aFKeystoreWrapper.getMonetizationNetwork = 0;
            aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getRevenue());
        }
        appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.AFAdRevenueData());
        appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.getCurrencyIso4217Code()));
    }

    public static String getRevenue() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    public static String getCurrencyIso4217Code() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }
}
