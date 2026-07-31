package com.bytedance.sdk.component.hhw.zmn.fs;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.hhw.zmn.nps;
import com.bytedance.sdk.component.hhw.zmn.zmn.btk;

/* loaded from: classes3.dex */
public class zmn {
    public static long zmn(int i, Context context) {
        return fs(i, context);
    }

    private static long fs(int i, Context context) {
        if (context == null) {
            return i;
        }
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory() / 1048576;
        long maxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (maxMemory <= 0) {
            if (freeMemory <= 2) {
                return 1L;
            }
            if (freeMemory <= 10) {
                return Math.min(i, 10);
            }
            return Math.min((freeMemory / 2) * 10, i);
        }
        long j = ((freeMemory + maxMemory) - 10) / 2;
        if (j <= 2) {
            return 1L;
        }
        if (j <= 10) {
            return Math.min(i, 10);
        }
        return Math.min(j * 10, i);
    }

    public static boolean zmn() {
        btk zn = nps.hhw().zn();
        return (zn == null || TextUtils.isEmpty(zn.zmn())) ? false : true;
    }

    public static boolean fs() {
        btk zn = nps.hhw().zn();
        return (zn == null || TextUtils.isEmpty(zn.fs())) ? false : true;
    }

    public static boolean zn() {
        btk zn = nps.hhw().zn();
        return (zn == null || TextUtils.isEmpty(zn.fb())) ? false : true;
    }

    public static boolean fb() {
        btk zn = nps.hhw().zn();
        return (zn == null || TextUtils.isEmpty(zn.btk())) ? false : true;
    }

    public static boolean btk() {
        btk zn = nps.hhw().zn();
        return (zn == null || TextUtils.isEmpty(zn.zn())) ? false : true;
    }

    public static boolean hhw() {
        btk zn = nps.hhw().zn();
        return (zn == null || TextUtils.isEmpty(zn.hhw())) ? false : true;
    }
}
