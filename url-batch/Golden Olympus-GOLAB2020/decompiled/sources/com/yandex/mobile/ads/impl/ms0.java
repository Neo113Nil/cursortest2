package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.framework.common.BundleUtil;
import java.net.UnknownHostException;

/* loaded from: classes3.dex */
public final class ms0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f29227a = new Object();

    private static String a(String str, Throwable th) {
        String replace;
        synchronized (f29227a) {
            try {
                if (th != null) {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 == null) {
                            replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    }
                } else {
                    replace = null;
                }
            } finally {
            }
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        return str + "\n  " + replace.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2, Throwable th) {
        d(str, a(str2, th));
    }

    public static void c(String str, String str2) {
        synchronized (f29227a) {
            Log.i(str, str2);
        }
    }

    public static void d(String str, String str2) {
        synchronized (f29227a) {
            Log.w(str, str2);
        }
    }

    public static void b(String str, String str2) {
        synchronized (f29227a) {
            Log.e(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        b(str, a(str2, th));
    }

    public static void a(String str, Exception exc) {
        c(BundleUtil.TAG, a(str, (Throwable) exc));
    }

    public static void a(String str, String str2) {
        synchronized (f29227a) {
            Log.d(str, str2);
        }
    }
}
