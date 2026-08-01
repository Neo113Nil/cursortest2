package com.bytedance.sdk.openadsdk.core.model;

import androidx.work.WorkRequest;

/* compiled from: LoadingInfo.java */
/* loaded from: classes2.dex */
public class vA {
    private long pvs = WorkRequest.MIN_BACKOFF_MILLIS;
    private long icD = WorkRequest.MIN_BACKOFF_MILLIS;
    private long vG = 10;
    private long Jd = 20;
    private String NB = "";

    public long pvs() {
        return this.pvs;
    }

    public void pvs(long j) {
        if (j <= 0) {
            this.pvs = 10L;
        } else {
            this.pvs = j;
        }
    }

    public long icD() {
        return this.icD;
    }

    public void icD(long j) {
        if (j < 0) {
            this.icD = 20L;
        } else {
            this.icD = j;
        }
    }

    public long vG() {
        return this.vG;
    }

    public void vG(long j) {
        if (j <= 0) {
            this.vG = 10L;
        } else {
            this.vG = j;
        }
    }

    public long Jd() {
        return this.Jd;
    }

    public void Jd(long j) {
        if (j < 0) {
            this.Jd = 20L;
        } else {
            this.Jd = j;
        }
    }

    public String NB() {
        return this.NB;
    }

    public void pvs(String str) {
        this.NB = str;
    }
}
