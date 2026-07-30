package com.crrepa.ble.util;

import android.util.Log;
import com.crrepa.z.h;

/* loaded from: classes3.dex */
public final class BleLog {
    private static final String DEFAULT_TAG = "MoYoung";
    public static boolean isFile = false;
    public static boolean isPrint = false;

    private BleLog() {
    }

    public static void d(Object obj) {
        if (!isPrint || obj == null) {
            return;
        }
        boolean z7 = isFile;
        String obj2 = obj.toString();
        if (z7) {
            h.a((Object) obj2);
        } else {
            Log.d(DEFAULT_TAG, obj2);
        }
    }

    public static void e(Object obj) {
        if (!isPrint || obj == null) {
            return;
        }
        boolean z7 = isFile;
        String obj2 = obj.toString();
        if (z7) {
            h.b(obj2, new Object[0]);
        } else {
            Log.e(DEFAULT_TAG, obj2);
        }
    }

    public static void i(Object obj) {
        if (!isPrint || obj == null) {
            return;
        }
        boolean z7 = isFile;
        String obj2 = obj.toString();
        if (z7) {
            h.c(obj2, new Object[0]);
        } else {
            Log.i(DEFAULT_TAG, obj2);
        }
    }
}
