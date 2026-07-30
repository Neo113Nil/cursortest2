package com.baidu.ar;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class gd {

    /* renamed from: a, reason: collision with root package name */
    public static Handler f2339a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (a()) {
            runnable.run();
        } else {
            f2339a.post(runnable);
        }
    }

    public static void a(Runnable runnable, long j8) {
        f2339a.postDelayed(runnable, j8);
    }

    public static boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
