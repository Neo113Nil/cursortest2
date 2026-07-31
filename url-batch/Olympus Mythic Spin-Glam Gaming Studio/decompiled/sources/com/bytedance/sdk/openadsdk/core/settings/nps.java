package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import com.bytedance.sdk.component.utils.iqz;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class nps {
    private static final AtomicInteger zmn = new AtomicInteger(1);

    public static boolean zmn() {
        return zmn.get() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static void zmn(int i) {
        boolean z = true;
        if (i == 1 || i == 2) {
            try {
                AtomicInteger atomicInteger = zmn;
                if (atomicInteger.get() != i) {
                    try {
                        atomicInteger.set(i);
                    } catch (Throwable th) {
                        th = th;
                        iqz.zn("SdkSwitch", th.getMessage());
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
            Log.e("SdkSwitch", "switch status changed: " + zmn());
            if (zmn()) {
                com.bytedance.sdk.openadsdk.fb.zmn.fs.fs();
            } else {
                com.bytedance.sdk.openadsdk.fb.zmn.fs.zn();
            }
        }
    }
}
