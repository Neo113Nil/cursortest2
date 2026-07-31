package com.huawei.hms.support.api.pay.util;

import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes.dex */
public class a {
    public static int a(Intent intent, String str, int i4) {
        try {
            return intent.getIntExtra(str, i4);
        } catch (Throwable th) {
            HMSLog.e("IntentUtils", "safeGetIntExtra failed, " + th.getMessage());
            return i4;
        }
    }

    public static long a(Intent intent, String str, long j4) {
        try {
            return intent.getLongExtra(str, j4);
        } catch (Throwable th) {
            HMSLog.e("IntentUtils", "safeGetLongExtra failed, " + th.getMessage());
            return j4;
        }
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Throwable th) {
            HMSLog.e("IntentUtils", "safeGetStringExtra failed, " + th.getMessage());
            return "";
        }
    }
}
