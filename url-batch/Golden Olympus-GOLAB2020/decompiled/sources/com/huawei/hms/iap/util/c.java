package com.huawei.hms.iap.util;

import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes.dex */
public class c {
    public static int a(Intent intent, String str, int i4) {
        try {
            return intent.getIntExtra(str, i4);
        } catch (Throwable th) {
            HMSLog.e("IntentUtils", "safeGetIntExtra failed, " + th.getMessage());
            return i4;
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

    public static String a(Intent intent, String str, String str2) {
        String a4 = a(intent, str);
        return TextUtils.isEmpty(a4) ? str2 : a4;
    }

    public static boolean a(Intent intent, String str, boolean z4) {
        try {
            return intent.getBooleanExtra(str, z4);
        } catch (Throwable th) {
            HMSLog.e("IntentUtils", "safeGetBooleanExtra failed, " + th.getMessage());
            return z4;
        }
    }
}
