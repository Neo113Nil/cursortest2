package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.lvl.AppsFlyerLVL;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFf1dSDK {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public interface AFa1tSDK {
        void getMonetizationNetwork(String str, String str2);

        void getRevenue(String str, Exception exc);
    }

    public final boolean getRevenue(long j, Context context, final AFa1tSDK aFa1tSDK) {
        try {
            AppsFlyerLVL.checkLicense(j, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFf1dSDK.3
                public final void onLvlFailure(Exception exc) {
                    aFa1tSDK.getRevenue("onLvlFailure with exception", exc);
                }

                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1tSDK.getMonetizationNetwork(str, str2);
                        return;
                    }
                    AFa1tSDK aFa1tSDK2 = aFa1tSDK;
                    if (str2 == null) {
                        aFa1tSDK2.getRevenue("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1tSDK2.getRevenue("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
