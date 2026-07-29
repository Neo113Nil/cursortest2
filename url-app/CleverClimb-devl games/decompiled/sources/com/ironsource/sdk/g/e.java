package com.ironsource.sdk.g;

import android.util.Log;
import com.ironsource.sdk.data.e;

/* compiled from: Logger.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f7205a;

    public static void a(int i) {
        if (e.c.MODE_0.a() == i) {
            f7205a = false;
        } else {
            f7205a = true;
        }
    }

    public static void a(String str, String str2) {
        if (f7205a) {
            Log.i(str, str2);
        }
    }

    public static void b(String str, String str2) {
        if (f7205a) {
            Log.e(str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (f7205a) {
            Log.d(str, str2);
        }
    }
}
