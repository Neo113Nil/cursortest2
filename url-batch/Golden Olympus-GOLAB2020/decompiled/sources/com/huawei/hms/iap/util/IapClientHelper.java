package com.huawei.hms.iap.util;

import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes.dex */
public class IapClientHelper {
    private static int a(Intent intent, String str, int i4) {
        if (intent != null) {
            return c.a(intent, str, i4);
        }
        HMSLog.e("IapClientHelper", "parseIntDataFromIntent: intent is null.");
        return -1;
    }

    @Deprecated
    public static int parseAccountFlagFromIntent(Intent intent) {
        return a(intent, "accountFlag", 0);
    }

    public static String parseCarrierIdFromIntent(Intent intent) {
        return a(intent, "carrierId", (String) null);
    }

    public static String parseCountryFromIntent(Intent intent) {
        return a(intent, "country", (String) null);
    }

    public static int parseRespCodeFromIntent(Intent intent) {
        return a(intent, "returnCode", -1);
    }

    public static String parseRespMessageFromIntent(Intent intent) {
        return a(intent, "errMsg", "");
    }

    private static String a(Intent intent, String str, String str2) {
        if (intent != null) {
            return c.a(intent, str, str2);
        }
        HMSLog.i("IapClientHelper", "parseStringDataFromIntent: intent is null.");
        return str2;
    }
}
