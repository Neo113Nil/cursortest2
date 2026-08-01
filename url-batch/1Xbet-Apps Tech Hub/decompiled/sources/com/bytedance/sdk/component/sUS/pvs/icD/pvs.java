package com.bytedance.sdk.component.sUS.pvs.icD;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.sUS.pvs.pvs.NB;
import com.bytedance.sdk.component.sUS.pvs.so;

/* compiled from: DBEventUtils.java */
/* loaded from: classes.dex */
public class pvs {
    public static long pvs(int i, Context context) {
        return icD(i, context);
    }

    private static long icD(int i, Context context) {
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

    public static boolean pvs() {
        NB Jd = so.yiw().Jd();
        return (Jd == null || TextUtils.isEmpty(Jd.pvs())) ? false : true;
    }

    public static boolean icD() {
        NB Jd = so.yiw().Jd();
        return (Jd == null || TextUtils.isEmpty(Jd.icD())) ? false : true;
    }

    public static boolean vG() {
        NB Jd = so.yiw().Jd();
        return (Jd == null || TextUtils.isEmpty(Jd.Jd())) ? false : true;
    }

    public static boolean Jd() {
        NB Jd = so.yiw().Jd();
        return (Jd == null || TextUtils.isEmpty(Jd.NB())) ? false : true;
    }

    public static boolean NB() {
        NB Jd = so.yiw().Jd();
        return (Jd == null || TextUtils.isEmpty(Jd.vG())) ? false : true;
    }

    public static boolean sUS() {
        NB Jd = so.yiw().Jd();
        return (Jd == null || TextUtils.isEmpty(Jd.sUS())) ? false : true;
    }
}
