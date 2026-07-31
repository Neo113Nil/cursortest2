package com.bytedance.sdk.component.hhw.zmn.nps;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.hhw.zmn.btk;
import com.bytedance.sdk.component.hhw.zmn.nps;

/* loaded from: classes3.dex */
public class zmn {
    private static volatile Handler fs = null;
    private static volatile HandlerThread zmn = null;
    private static int zn = 3000;

    static {
        zn();
    }

    private static void zn() {
        HandlerThread zmn2;
        btk cn = nps.hhw().cn();
        if (cn != null && (zmn2 = cn.zmn("csj_ad_log", 10)) != null) {
            zmn = zmn2;
            return;
        }
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        zmn = handlerThread;
        handlerThread.start();
    }

    public static Handler zmn() {
        if (zmn == null || !zmn.isAlive()) {
            synchronized (zmn.class) {
                try {
                    if (zmn != null) {
                        if (!zmn.isAlive()) {
                        }
                    }
                    zn();
                    fs = new Handler(zmn.getLooper());
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (fs == null) {
            synchronized (zmn.class) {
                try {
                    if (fs == null) {
                        fs = new Handler(zmn.getLooper());
                    }
                } finally {
                }
            }
        }
        return fs;
    }

    public static int fs() {
        if (zn <= 0) {
            zn = 3000;
        }
        return zn;
    }
}
