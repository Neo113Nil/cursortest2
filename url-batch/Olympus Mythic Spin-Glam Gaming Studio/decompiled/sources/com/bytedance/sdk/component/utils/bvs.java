package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes13.dex */
public class bvs {
    private static volatile Handler zmn;

    public static Handler zmn() {
        return com.bytedance.sdk.component.zg.zmn.zmn.zmn().fs();
    }

    public static Handler fs() {
        if (zmn == null) {
            synchronized (bvs.class) {
                try {
                    if (zmn == null) {
                        zmn = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }
}
