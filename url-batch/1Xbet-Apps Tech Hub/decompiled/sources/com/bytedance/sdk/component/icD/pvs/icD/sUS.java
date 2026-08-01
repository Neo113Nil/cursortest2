package com.bytedance.sdk.component.icD.pvs.icD;

/* compiled from: SegmentPool.java */
/* loaded from: classes.dex */
final class sUS {
    static long icD;
    static NB pvs;

    private sUS() {
    }

    static NB pvs() {
        synchronized (sUS.class) {
            NB nb = pvs;
            if (nb != null) {
                pvs = nb.sUS;
                nb.sUS = null;
                icD -= 8192;
                return nb;
            }
            return new NB();
        }
    }

    static void pvs(NB nb) {
        if (nb.sUS != null || nb.yiw != null) {
            throw new IllegalArgumentException();
        }
        if (nb.Jd) {
            return;
        }
        synchronized (sUS.class) {
            long j = icD;
            if (j + 8192 > 65536) {
                return;
            }
            icD = j + 8192;
            nb.sUS = pvs;
            nb.vG = 0;
            nb.icD = 0;
            pvs = nb;
        }
    }
}
