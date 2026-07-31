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

    public static final void AFAdRevenueData(AFc1iSDK aFc1iSDK, AFc1pSDK aFc1pSDK) {
        int i4;
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFj1iSDK.getMediationNetwork()) {
            AFLogger.afRDLog("OPPO device found");
            i4 = 23;
        } else {
            i4 = 18;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < i4 || appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            AFLogger.afRDLog("OS SDK is=" + i5 + "; no KeyStore usage");
            return;
        }
        AFLogger.afRDLog("OS SDK is=" + i5 + "; use KeyStore");
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(aFc1iSDK.getMonetizationNetwork);
        if (aFKeystoreWrapper.getRevenue()) {
            String mediationNetwork = aFKeystoreWrapper.getMediationNetwork();
            synchronized (aFKeystoreWrapper.getMonetizationNetwork) {
                aFKeystoreWrapper.AFAdRevenueData++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(mediationNetwork)));
                try {
                    synchronized (aFKeystoreWrapper.getMonetizationNetwork) {
                        aFKeystoreWrapper.getCurrencyIso4217Code.deleteEntry(mediationNetwork);
                    }
                } catch (KeyStoreException e4) {
                    StringBuilder sb = new StringBuilder("Exception ");
                    sb.append(e4.getMessage());
                    sb.append(" occurred");
                    AFLogger.afErrorLog(sb.toString(), e4);
                }
            }
            aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getMediationNetwork());
        } else {
            aFKeystoreWrapper.getRevenue = AFb1iSDK.getRevenue(aFc1pSDK.getMonetizationNetwork);
            aFKeystoreWrapper.AFAdRevenueData = 0;
            aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getMediationNetwork());
        }
        appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.getMonetizationNetwork());
        appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.AFAdRevenueData()));
    }

    public static String getCurrencyIso4217Code() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    public static String getRevenue() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }
}
