package com.chartboost.sdk.impl;

import android.util.Log;
import java.io.File;

/* loaded from: classes.dex */
public class aq {

    /* renamed from: a, reason: collision with root package name */
    private static String f3739a = "CBTrace";

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f3740b = a();

    private static boolean a() {
        File b2;
        try {
            if (Log.isLoggable(f3739a, 4) && s.a().c().equals("mounted") && (b2 = s.a().b()) != null) {
                return new File(b2, ".chartboost/log_trace").exists();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void a(String str, String str2) {
        if (f3740b) {
            Log.i(f3739a, str + ": " + str2);
        }
    }

    public static void a(String str, boolean z) {
        if (f3740b) {
            Log.i(f3739a, str + ": " + z);
        }
    }

    public static void a(String str, Object obj) {
        if (f3740b) {
            if (obj != null) {
                Log.i(f3739a, str + ": " + obj.getClass().getName() + " " + obj.hashCode());
                return;
            }
            Log.i(f3739a, str + ": null");
        }
    }

    public static void a(String str) {
        if (f3740b) {
            Log.i(f3739a, str);
        }
    }
}
