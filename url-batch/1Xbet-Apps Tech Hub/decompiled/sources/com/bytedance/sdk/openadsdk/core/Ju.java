package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: InitHelper.java */
/* loaded from: classes2.dex */
public class Ju {
    public static long NB = 0;
    public static volatile boolean pvs = false;
    private static volatile HandlerThread yiw;
    public static AtomicBoolean icD = new AtomicBoolean(false);
    public static long vG = 0;
    private static volatile int sUS = 0;
    public static float Jd = 1.0f;
    private static volatile Handler so = null;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_init_handle", 10);
        yiw = handlerThread;
        handlerThread.start();
        NB = System.currentTimeMillis();
    }

    public static void pvs(long j) {
        NB = j;
    }

    public static long pvs() {
        return NB;
    }

    public static Handler icD() {
        if (yiw == null || !yiw.isAlive()) {
            synchronized (Ju.class) {
                if (yiw == null || !yiw.isAlive()) {
                    HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                    yiw = handlerThread;
                    handlerThread.start();
                    so = new Handler(yiw.getLooper());
                }
            }
        } else if (so == null) {
            synchronized (Ju.class) {
                if (so == null) {
                    so = new Handler(yiw.getLooper());
                }
            }
        }
        return so;
    }

    public static Handler vG() {
        return new Handler(Looper.getMainLooper());
    }

    public static int Jd() {
        return sUS;
    }

    public static void pvs(int i) {
        sUS = i;
    }

    public static boolean NB() {
        return Jd() == 1;
    }

    public static void sUS() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - vG <= WorkRequest.MIN_BACKOFF_MILLIS) {
            return;
        }
        vG = elapsedRealtime;
        com.bytedance.sdk.openadsdk.utils.ae.pvs(new com.bytedance.sdk.component.so.so("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.Ju.1
            @Override // java.lang.Runnable
            public void run() {
                String vG2 = com.bytedance.sdk.openadsdk.core.settings.mnm.vG(mnm.pvs());
                if (TextUtils.equals(vG2, com.bytedance.sdk.openadsdk.core.settings.mnm.pvs)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().pvs(6, true);
                com.bytedance.sdk.openadsdk.core.settings.mnm.pvs = vG2;
            }
        });
    }
}
