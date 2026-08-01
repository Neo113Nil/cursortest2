package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SdkSwitch.java */
/* loaded from: classes2.dex */
public class kj {
    private static final AtomicInteger pvs = new AtomicInteger(1);

    public static boolean pvs() {
        return pvs.get() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static void pvs(int i) {
        boolean z = true;
        if (i == 1 || i == 2) {
            try {
                AtomicInteger atomicInteger = pvs;
                if (atomicInteger.get() != i) {
                    try {
                        atomicInteger.set(i);
                    } catch (Throwable th) {
                        th = th;
                        com.bytedance.sdk.component.utils.Ju.pvs("SdkSwitch", th.getMessage());
                        if (z) {
                        }
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            if (z) {
                return;
            }
            Log.e("SdkSwitch", "switch status changed: " + pvs());
            if (pvs()) {
                com.bytedance.sdk.openadsdk.icD.pvs.Jd.icD();
            } else {
                com.bytedance.sdk.openadsdk.icD.pvs.Jd.vG();
            }
        }
    }
}
