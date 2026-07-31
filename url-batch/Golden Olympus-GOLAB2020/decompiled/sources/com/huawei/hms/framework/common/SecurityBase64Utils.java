package com.huawei.hms.framework.common;

import android.util.Base64;
import com.huawei.secure.android.common.util.SafeBase64;

/* loaded from: classes.dex */
public class SecurityBase64Utils {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f14153a = false;

    private static boolean a(String str) {
        ClassLoader classLoader = SecurityBase64Utils.class.getClassLoader();
        if (classLoader == null) {
            return false;
        }
        try {
            classLoader.loadClass(str);
            synchronized (SecurityBase64Utils.class) {
                f14153a = true;
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static byte[] decode(String str, int i4) {
        if (f14153a || a("com.huawei.secure.android.common.util.SafeBase64")) {
            return SafeBase64.decode(str, i4);
        }
        try {
            return Base64.decode(str, i4);
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static String encodeToString(byte[] bArr, int i4) {
        if (f14153a || a("com.huawei.secure.android.common.util.SafeBase64")) {
            return SafeBase64.encodeToString(bArr, i4);
        }
        try {
            return Base64.encodeToString(bArr, i4);
        } catch (Exception unused) {
            return null;
        }
    }
}
