package com.appsflyer.internal;

import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFb1iSDK {
    private static String AFAdRevenueData;
    public static final AFb1iSDK INSTANCE = new AFb1iSDK();

    private AFb1iSDK() {
    }

    public static final synchronized void getCurrencyIso4217Code(String str, AFc1jSDK aFc1jSDK) {
        synchronized (AFb1iSDK.class) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(aFc1jSDK, "");
            AFAdRevenueData = str;
            aFc1jSDK.getRevenue("CUSTOM_INSTALL_ID_APPLIED", true);
            aFc1jSDK.getMediationNetwork("AF_INSTALLATION", str);
        }
    }

    public static final synchronized String getCurrencyIso4217Code(AFc1jSDK aFc1jSDK) {
        String str;
        synchronized (AFb1iSDK.class) {
            try {
                Intrinsics.checkNotNullParameter(aFc1jSDK, "");
                if (AFAdRevenueData == null) {
                    String revenue = aFc1jSDK.getRevenue("AF_INSTALLATION", (String) null);
                    if (revenue == null) {
                        revenue = System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
                        aFc1jSDK.getMediationNetwork("AF_INSTALLATION", revenue);
                    }
                    AFAdRevenueData = revenue;
                }
                str = AFAdRevenueData;
                Intrinsics.b(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
