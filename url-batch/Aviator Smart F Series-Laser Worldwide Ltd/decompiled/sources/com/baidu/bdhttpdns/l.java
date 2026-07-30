package com.baidu.bdhttpdns;

import android.util.Log;

/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f4276a = false;

    static void a(String str, Object... objArr) {
        if (f4276a) {
            Log.v("BDHttpDns", String.format(str, objArr));
        }
    }

    static void a(boolean z7) {
        f4276a = z7;
    }
}
