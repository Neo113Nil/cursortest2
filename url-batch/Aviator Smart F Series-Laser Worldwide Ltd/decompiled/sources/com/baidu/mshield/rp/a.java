package com.baidu.mshield.rp;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.mshield.utility.c;

/* loaded from: classes2.dex */
public class a {
    public static String a(Context context) {
        String str = "";
        try {
            com.baidu.mshield.sharedpreferences.a a8 = com.baidu.mshield.sharedpreferences.a.a(context);
            String m8 = a8.m();
            try {
                if (!TextUtils.isEmpty(m8)) {
                    a8.g("");
                }
                return c.a(context);
            } catch (Throwable th) {
                th = th;
                str = m8;
                com.baidu.mshield.utility.a.a(th);
                return str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String b(Context context) {
        String str = "";
        try {
            com.baidu.mshield.sharedpreferences.a a8 = com.baidu.mshield.sharedpreferences.a.a(context);
            String s7 = a8.s();
            try {
                if (!TextUtils.isEmpty(s7)) {
                    a8.k("");
                }
                return c.e(context);
            } catch (Throwable th) {
                th = th;
                str = s7;
                com.baidu.mshield.utility.a.a(th);
                return str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String c(Context context) {
        String str = "";
        try {
            com.baidu.mshield.sharedpreferences.a a8 = com.baidu.mshield.sharedpreferences.a.a(context);
            String u7 = a8.u();
            try {
                if (!TextUtils.isEmpty(u7)) {
                    a8.l("");
                }
                return c.f(context);
            } catch (Throwable th) {
                th = th;
                str = u7;
                com.baidu.mshield.utility.a.a(th);
                return str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
