package com.bytedance.sdk.openadsdk.component.zg;

import com.ironsource.X3;

/* loaded from: classes12.dex */
public final class zmn {
    private long btk;
    private boolean fb;
    private long fs;
    private float zmn;
    private long zn;

    public void zmn(boolean z) {
        this.fb = z;
    }

    public long zmn() {
        return this.btk;
    }

    public void zmn(long j) {
        this.btk = j;
    }

    public float fs() {
        return this.zmn;
    }

    public void zmn(float f) {
        StringBuilder sb = new StringBuilder("setTotalTime() called with: time = [");
        sb.append(f);
        sb.append(X3.j.e);
        this.zmn = f;
    }

    public long zn() {
        return this.fs;
    }

    public void fs(long j) {
        this.fs = j;
    }

    public long fb() {
        return this.zn;
    }

    public void zn(long j) {
        this.zn = j;
    }
}
