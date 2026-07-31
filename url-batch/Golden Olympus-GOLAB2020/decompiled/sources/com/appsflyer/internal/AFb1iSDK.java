package com.appsflyer.internal;

import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFb1iSDK {
    public static final AFb1iSDK INSTANCE = new AFb1iSDK();
    private static String getCurrencyIso4217Code;

    private AFb1iSDK() {
    }

    public static final synchronized void getCurrencyIso4217Code(String str, AFc1qSDK aFc1qSDK) {
        synchronized (AFb1iSDK.class) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(aFc1qSDK, "");
            getCurrencyIso4217Code = str;
            aFc1qSDK.getCurrencyIso4217Code("CUSTOM_INSTALL_ID_APPLIED", true);
            aFc1qSDK.getMediationNetwork("AF_INSTALLATION", str);
        }
    }

    public static final synchronized String getRevenue(AFc1qSDK aFc1qSDK) {
        String str;
        synchronized (AFb1iSDK.class) {
            try {
                Intrinsics.checkNotNullParameter(aFc1qSDK, "");
                if (getCurrencyIso4217Code == null) {
                    String AFAdRevenueData = aFc1qSDK.AFAdRevenueData("AF_INSTALLATION", (String) null);
                    if (AFAdRevenueData == null) {
                        AFAdRevenueData = System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
                        aFc1qSDK.getMediationNetwork("AF_INSTALLATION", AFAdRevenueData);
                    }
                    getCurrencyIso4217Code = AFAdRevenueData;
                }
                str = getCurrencyIso4217Code;
                Intrinsics.checkNotNull(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
