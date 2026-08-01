package com.bytedance.sdk.component.sUS.pvs.yiw;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;

/* compiled from: TimerUtils.java */
/* loaded from: classes.dex */
public class pvs {
    private static volatile Handler icD = null;
    private static volatile HandlerThread pvs = null;
    private static int vG = 3000;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        pvs = handlerThread;
        handlerThread.start();
    }

    public static Handler pvs() {
        if (pvs == null || !pvs.isAlive()) {
            synchronized (pvs.class) {
                if (pvs == null || !pvs.isAlive()) {
                    HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                    pvs = handlerThread;
                    handlerThread.start();
                    icD = new Handler(pvs.getLooper());
                }
            }
        } else if (icD == null) {
            synchronized (pvs.class) {
                if (icD == null) {
                    icD = new Handler(pvs.getLooper());
                }
            }
        }
        return icD;
    }

    public static int icD() {
        if (vG <= 0) {
            vG = PathInterpolatorCompat.MAX_NUM_POINTS;
        }
        return vG;
    }
}
