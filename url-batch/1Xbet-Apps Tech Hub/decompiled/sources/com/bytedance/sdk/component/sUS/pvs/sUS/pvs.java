package com.bytedance.sdk.component.sUS.pvs.sUS;

import com.bytedance.sdk.component.sUS.pvs.so;

/* compiled from: MyTrack.java */
/* loaded from: classes.dex */
public class pvs {
    private static volatile icD pvs;

    public static icD pvs() {
        if (pvs == null) {
            synchronized (icD.class) {
                if (pvs == null) {
                    pvs = new vG(so.yiw().sUS(), new sUS(so.yiw().sUS()));
                }
            }
        }
        return pvs;
    }
}
