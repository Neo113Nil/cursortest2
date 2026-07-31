package com.bytedance.sdk.openadsdk.bjh.zmn;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.zg;

/* loaded from: classes6.dex */
public class zmn {
    private static HandlerThread fs;
    private static Handler zmn;

    public static Handler zmn() {
        HandlerThread handlerThread;
        try {
            handlerThread = fs;
        } catch (Throwable unused) {
        }
        if (handlerThread != null && handlerThread.isAlive()) {
            if (zmn == null) {
                synchronized (zmn.class) {
                    try {
                        if (zmn == null) {
                            zmn = new Handler(fs.getLooper());
                        }
                    } finally {
                    }
                }
            }
            return zmn;
        }
        synchronized (zmn.class) {
            try {
                HandlerThread handlerThread2 = fs;
                if (handlerThread2 != null) {
                    if (!handlerThread2.isAlive()) {
                    }
                }
                fs = zg.zmn("pag_ev");
                zmn = new Handler(fs.getLooper());
            } finally {
            }
        }
        return zmn;
    }
}
