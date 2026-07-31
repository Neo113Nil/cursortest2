package com.bytedance.sdk.openadsdk.core.model;

/* loaded from: classes3.dex */
public class phc {
    private long zmn = 10000;
    private long fs = 10000;
    private long zn = 10;
    private long fb = 20;
    private String btk = "";

    public long zmn() {
        return this.zmn;
    }

    public void zmn(long j) {
        if (j <= 0) {
            this.zmn = 10L;
        } else {
            this.zmn = j;
        }
    }

    public long fs() {
        return this.fs;
    }

    public void fs(long j) {
        if (j < 0) {
            this.fs = 20L;
        } else {
            this.fs = j;
        }
    }

    public long zn() {
        return this.zn;
    }

    public void zn(long j) {
        if (j <= 0) {
            this.zn = 10L;
        } else {
            this.zn = j;
        }
    }

    public long fb() {
        return this.fb;
    }

    public void fb(long j) {
        if (j < 0) {
            this.fb = 20L;
        } else {
            this.fb = j;
        }
    }

    public String btk() {
        return this.btk;
    }

    public void zmn(String str) {
        this.btk = str;
    }
}
