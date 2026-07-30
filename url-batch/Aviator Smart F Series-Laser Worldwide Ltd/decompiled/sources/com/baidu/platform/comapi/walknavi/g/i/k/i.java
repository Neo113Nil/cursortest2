package com.baidu.platform.comapi.walknavi.g.i.k;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static Handler f10077a;

    public static void a(Runnable runnable) {
        synchronized (i.class) {
            try {
                if (f10077a == null) {
                    f10077a = new Handler(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f10077a.post(runnable);
    }
}
