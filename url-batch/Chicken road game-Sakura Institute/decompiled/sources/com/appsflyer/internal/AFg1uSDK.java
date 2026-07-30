package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.lvl.AppsFlyerLVL;

/* loaded from: classes3.dex */
public final class AFg1uSDK {

    interface AFa1zSDK {
        void AFInAppEventType(String str, Exception exc);

        void AFInAppEventType(String str, String str2);
    }

    public final boolean AFKeystoreWrapper(long j, Context context, final AFa1zSDK aFa1zSDK) {
        try {
            AppsFlyerLVL.checkLicense(j, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFg1uSDK.2
                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1zSDK.AFInAppEventType(str, str2);
                    } else if (str2 == null) {
                        aFa1zSDK.AFInAppEventType("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1zSDK.AFInAppEventType("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }

                public final void onLvlFailure(Exception exc) {
                    aFa1zSDK.AFInAppEventType("onLvlFailure with exception", exc);
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
