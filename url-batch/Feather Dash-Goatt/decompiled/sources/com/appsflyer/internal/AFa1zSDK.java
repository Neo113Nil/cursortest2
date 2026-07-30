package com.appsflyer.internal;

import android.os.Build;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import defpackage.ry0;
import java.security.KeyStoreException;
import kotlin.Metadata;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFa1zSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFc1fSDK;", "p0", "Lcom/appsflyer/internal/AFc1kSDK;", "p1", "", "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFc1fSDK;Lcom/appsflyer/internal/AFc1kSDK;)V", "", "getRevenue", "()Ljava/lang/String;"}, k = 1, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final class AFa1zSDK {
    public static final AFa1zSDK INSTANCE = new AFa1zSDK();

    private AFa1zSDK() {
    }

    public static final void getCurrencyIso4217Code(AFc1fSDK p0, AFc1kSDK p1) {
        p0.getClass();
        p1.getClass();
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFj1pSDK.getMonetizationNetwork()) {
            AFLogger.afRDLog("OPPO device found");
        }
        if (appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            AFLogger.afRDLog("OS SDK is=" + Build.VERSION.SDK_INT + "; no KeyStore usage");
            return;
        }
        AFLogger.afRDLog("OS SDK is=" + Build.VERSION.SDK_INT + "; use KeyStore");
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p0.getCurrencyIso4217Code);
        if (aFKeystoreWrapper.getMediationNetwork()) {
            String revenue = aFKeystoreWrapper.getRevenue();
            synchronized (aFKeystoreWrapper.getMediationNetwork) {
                aFKeystoreWrapper.getMonetizationNetwork++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(revenue)));
                try {
                    synchronized (aFKeystoreWrapper.getMediationNetwork) {
                        aFKeystoreWrapper.getRevenue.deleteEntry(revenue);
                    }
                } catch (KeyStoreException e) {
                    StringBuilder sb = new StringBuilder("Exception ");
                    sb.append(e.getMessage());
                    sb.append(" occurred");
                    AFLogger.afErrorLog(sb.toString(), e);
                }
            }
            aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getRevenue());
        } else {
            aFKeystoreWrapper.AFAdRevenueData = AFb1iSDK.getCurrencyIso4217Code(p1.getCurrencyIso4217Code);
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
