package com.baidu.ar.util;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class UiThreadUtil {

    /* renamed from: a, reason: collision with root package name */
    public static Handler f3430a = new Handler(Looper.getMainLooper());

    public static boolean isOnUiThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void postDelayed(Runnable runnable, long j8) {
        f3430a.postDelayed(runnable, j8);
    }

    public static void removeCallbacks(Runnable runnable) {
        f3430a.removeCallbacks(runnable);
    }

    public static void removeCallbacksAndMessages() {
        f3430a.removeCallbacksAndMessages(null);
    }

    public static void runOnUiThread(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (isOnUiThread()) {
            runnable.run();
        } else {
            f3430a.post(runnable);
        }
    }
}
