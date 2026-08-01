package com.bytedance.sdk.component.so.vG.pvs;

import android.text.TextUtils;
import com.bytedance.sdk.component.so.vG.icD;

/* compiled from: PAGRunnableLogModel.java */
/* loaded from: classes.dex */
public class pvs {
    private long Jd;
    private long NB;
    private int icD = 0;
    private String pvs;
    private long sUS;
    private long vG;

    public String pvs() {
        return this.pvs;
    }

    public int icD() {
        return this.icD;
    }

    public long vG() {
        return this.vG;
    }

    public long Jd() {
        return this.Jd;
    }

    public long NB() {
        return this.NB;
    }

    public long sUS() {
        return this.sUS;
    }

    public void pvs(icD icd) {
        synchronized (this) {
            if (TextUtils.isEmpty(this.pvs)) {
                this.pvs = icd.icD();
            }
            this.vG += icd.sUS();
            this.Jd += icd.yiw();
            this.NB = Math.max(this.NB, icd.sUS());
            this.sUS = Math.max(this.sUS, icd.yiw());
            this.icD++;
        }
        Object[] objArr = new Object[5];
        Long.valueOf(icd.sUS());
        Long.valueOf(icd.yiw());
        toString();
    }

    public String toString() {
        return this.pvs + " times=" + this.icD + ",waitMaxTime=" + this.NB + ",runMaxTime=" + this.sUS + ",runTotalTime=" + this.Jd + ",waitTotalTime=" + this.vG;
    }
}
