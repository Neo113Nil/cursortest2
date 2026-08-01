package com.bytedance.sdk.component.adexpress.Jd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: DynamicThreadUtils.java */
/* loaded from: classes.dex */
public class vG {
    public static void pvs(com.bytedance.sdk.component.so.so soVar, int i) {
        if (soVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.pvs.pvs.vG vG = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG();
        ExecutorService IP = vG != null ? vG.IP() : null;
        if (IP != null) {
            soVar.setPriority(i);
            IP.execute(soVar);
        } else {
            com.bytedance.sdk.component.so.sUS.pvs(soVar, i);
        }
    }

    public static void icD(com.bytedance.sdk.component.so.so soVar, int i) {
        if (soVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.pvs.pvs.vG vG = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG();
        ExecutorService Ju = vG != null ? vG.Ju() : null;
        if (Ju != null) {
            soVar.setPriority(i);
            Ju.execute(soVar);
        } else {
            com.bytedance.sdk.component.so.sUS.pvs(soVar);
        }
    }

    public static ScheduledFuture pvs(Runnable runnable, long j, TimeUnit timeUnit) {
        return com.bytedance.sdk.component.so.sUS.sUS().schedule(runnable, j, timeUnit);
    }
}
