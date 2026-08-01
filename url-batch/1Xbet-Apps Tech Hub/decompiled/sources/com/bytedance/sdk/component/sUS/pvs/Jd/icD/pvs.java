package com.bytedance.sdk.component.sUS.pvs.Jd.icD;

/* compiled from: PolicyConfig.java */
/* loaded from: classes.dex */
public class pvs {
    private int icD;
    private int pvs;

    public int pvs() {
        return this.pvs;
    }

    public int icD() {
        return this.icD;
    }

    pvs(int i, int i2, long j) {
        if (i2 < i) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.pvs = i;
        this.icD = i2;
    }

    public static pvs vG() {
        return new pvs(1, 100, 172800000L);
    }

    public static pvs Jd() {
        return new pvs(1, 100, -1L);
    }

    public static pvs NB() {
        return new pvs(3, 100, 172800000L);
    }
}
