package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* compiled from: HandlerUtils.java */
/* loaded from: classes.dex */
public class so {
    private static volatile Handler pvs;

    public static Handler pvs() {
        return com.bytedance.sdk.component.so.pvs.pvs.pvs().icD();
    }

    public static Handler icD() {
        if (pvs == null) {
            synchronized (so.class) {
                if (pvs == null) {
                    pvs = new Handler(Looper.getMainLooper());
                }
            }
        }
        return pvs;
    }
}
