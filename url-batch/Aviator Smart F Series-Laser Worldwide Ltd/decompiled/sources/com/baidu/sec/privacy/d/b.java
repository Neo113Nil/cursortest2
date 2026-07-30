package com.baidu.sec.privacy.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.baidu.mshield.ac.F;
import com.baidu.sec.privacy.f.c;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f10639a = false;

    /* renamed from: b, reason: collision with root package name */
    public static String f10640b = "";

    /* renamed from: c, reason: collision with root package name */
    public static String f10641c = "";

    public static boolean a() {
        try {
            SharedPreferences c8 = c();
            if (c8 == null) {
                c8 = com.baidu.sec.privacy.b.b.a().getSharedPreferences("leroadcfg", 0);
            }
            return c8.getBoolean("s_a_pl", false);
        } catch (Throwable th) {
            c.a(th);
            return false;
        }
    }

    public static boolean b(String str) {
        Method method;
        try {
        } catch (Throwable th) {
            c.a(th);
        }
        if (f10639a) {
            return true;
        }
        if (com.baidu.sec.privacy.b.b.d()) {
            com.baidu.sec.privacy.c c8 = com.baidu.sec.privacy.b.b.c();
            if (c8 != null) {
                f10639a = c8.a();
            }
            return f10639a;
        }
        com.baidu.sec.privacy.a b8 = com.baidu.sec.privacy.b.b.b();
        if (b8 != null) {
            boolean a8 = b8.a();
            f10639a = a8;
            return a8;
        }
        try {
            Class<?> cls = Class.forName("com.baidu." + str + ".ac.F");
            Object invoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(cls, new Object[0]);
            Method[] declaredMethods = Class.forName("com.baidu." + str + ".ac.FI").getDeclaredMethods();
            int length = declaredMethods.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i8];
                if ("cp".equals(method.getName())) {
                    break;
                }
                i8++;
            }
            if (method == null) {
                f10639a = a();
            } else {
                f10639a = ((Boolean) method.invoke(invoke, com.baidu.sec.privacy.b.b.a())).booleanValue();
            }
        } catch (Throwable unused) {
            f10639a = a();
        }
        return f10639a;
    }

    public static SharedPreferences c() {
        return a("getPlatformSharedSharedPreferences");
    }

    public static String a(String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        try {
            SharedPreferences b8 = b();
            if (b8 == null) {
                b8 = com.baidu.sec.privacy.b.b.a().getSharedPreferences(f10641c, 0);
            }
            b8.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            return b8.getString(f10640b, "");
        } catch (Throwable th) {
            c.a(th);
            return "";
        }
    }

    public static void a(String str, boolean z7, com.baidu.sec.privacy.c cVar) {
        try {
            if (!z7) {
                if ("sofire".equals(str)) {
                    str = "";
                }
                f10641c = "leroad" + str + "cfg";
                f10640b = "p_s_p_c";
            } else {
                if (cVar == null) {
                    return;
                }
                f10641c = cVar.b();
                f10640b = cVar.c();
            }
        } catch (Throwable th) {
            c.a(th);
        }
    }

    public static SharedPreferences a(String str) {
        try {
            return (SharedPreferences) F.class.getDeclaredMethod(str, Context.class).invoke(F.class.getDeclaredMethod("getInstance", new Class[0]).invoke(F.class, new Object[0]), com.baidu.sec.privacy.b.b.a());
        } catch (Throwable th) {
            c.a(th);
            return null;
        }
    }

    public static SharedPreferences b() {
        return a("getPlatformPrivateSharedPreferences");
    }
}
