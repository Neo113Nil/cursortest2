package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.lvl.AppsFlyerLVL;

/* loaded from: classes3.dex */
public final class AFg1zSDK {

    interface AFa1ySDK {
        void AFInAppEventType(String str, Exception exc);

        void AFKeystoreWrapper(String str, String str2);
    }

    public final boolean AFInAppEventType(long j, Context context, final AFa1ySDK aFa1ySDK) {
        try {
            AppsFlyerLVL.checkLicense(j, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFg1zSDK.1
                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1ySDK.AFKeystoreWrapper(str, str2);
                    } else if (str2 == null) {
                        aFa1ySDK.AFInAppEventType("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1ySDK.AFInAppEventType("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }

                public final void onLvlFailure(Exception exc) {
                    aFa1ySDK.AFInAppEventType("onLvlFailure with exception", exc);
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
