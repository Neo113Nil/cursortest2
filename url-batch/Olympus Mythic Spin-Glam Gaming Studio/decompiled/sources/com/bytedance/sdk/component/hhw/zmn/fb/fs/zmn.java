package com.bytedance.sdk.component.hhw.zmn.fb.fs;

/* loaded from: classes15.dex */
public class zmn {
    private int fs;
    private int zmn;

    public int zmn() {
        return this.zmn;
    }

    public int fs() {
        return this.fs;
    }

    zmn(int i, int i2, long j) {
        if (i2 < i) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.zmn = i;
        this.fs = i2;
    }

    public static zmn zmn(int i, int i2) {
        return new zmn(i, i2, 172800000L);
    }

    public static zmn zn() {
        return new zmn(1, 100, 172800000L);
    }
}
