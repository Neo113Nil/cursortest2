package com.bytedance.sdk.component.sUS.pvs.vG;

import com.bytedance.sdk.component.sUS.pvs.NB;
import com.bytedance.sdk.component.sUS.pvs.so;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: EventMonitorUtils.java */
/* loaded from: classes.dex */
public class icD {
    public static void pvs(AtomicLong atomicLong, int i) {
        NB mnm = so.yiw().mnm();
        if (mnm == null || !mnm.yiw() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i);
    }
}
