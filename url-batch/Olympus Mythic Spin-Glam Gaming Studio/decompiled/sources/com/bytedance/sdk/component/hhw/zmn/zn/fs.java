package com.bytedance.sdk.component.hhw.zmn.zn;

import com.bytedance.sdk.component.hhw.zmn.btk;
import com.bytedance.sdk.component.hhw.zmn.nps;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes13.dex */
public class fs {
    public static void zmn(AtomicLong atomicLong, int i) {
        btk cn = nps.hhw().cn();
        if (cn == null || !cn.nps() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i);
    }
}
