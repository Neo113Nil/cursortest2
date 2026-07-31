package com.bytedance.sdk.component.adexpress.fb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class fb {
    public static void zmn(com.bytedance.sdk.component.zg.fs.zn znVar, int i) {
        if (znVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.zmn.zmn.zn zn = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn();
        ExecutorService rt = zn != null ? zn.rt() : null;
        if (rt != null) {
            znVar.setPriority(i);
            rt.execute(znVar);
        }
    }

    public static void fs(com.bytedance.sdk.component.zg.fs.zn znVar, int i) {
        if (znVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.zmn.zmn.zn zn = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn();
        ExecutorService mw = zn != null ? zn.mw() : null;
        if (mw != null) {
            znVar.setPriority(i);
            mw.execute(znVar);
        }
    }

    public static ScheduledFuture zmn(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.zmn.zmn.zn zn = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn();
        ScheduledExecutorService cn = zn != null ? zn.cn() : null;
        if (cn != null) {
            return cn.schedule(runnable, j, timeUnit);
        }
        return null;
    }
}
