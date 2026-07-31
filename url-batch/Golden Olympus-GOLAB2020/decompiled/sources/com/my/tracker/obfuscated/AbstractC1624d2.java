package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* renamed from: com.my.tracker.obfuscated.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1624d2 {
    public static Object a(Context context, String str, Class cls) {
        try {
            return cls.cast(context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData.get(str));
        } catch (Throwable th) {
            AbstractC1708y2.a("SystemUtils: exception when access to application info with key - " + str, th);
            return null;
        }
    }

    public static String a(String str) {
        String str2;
        try {
            str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Throwable th) {
            AbstractC1708y2.a("SystemUtils: error occurred when getting value for property - " + str, th);
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        AbstractC1708y2.a("SystemUtils: value in system properties is null for " + str);
        return null;
    }
}
