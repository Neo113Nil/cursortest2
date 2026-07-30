package com.baidu.sec.privacy.f;

/* loaded from: classes2.dex */
public class g {
    public static String a(String str, String str2) {
        try {
            Class a8 = com.baidu.sec.privacy.b.b.a(com.baidu.sec.privacy.b.b.a()).a(g.class.getClassLoader(), "android.os.SystemProperties");
            return a8 == null ? str2 : (String) a8.getMethod("get", String.class).invoke(a8, str);
        } catch (Throwable th) {
            c.a(th);
            return str2;
        }
    }
}
