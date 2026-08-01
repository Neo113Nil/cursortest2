package com.bytedance.sdk.component.icD.pvs;

import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: OkHttpClient.java */
/* loaded from: classes.dex */
public abstract class qh implements Cloneable {
    public long Jd;
    public TimeUnit NB;
    public long icD;
    public List<so> pvs;
    public long sUS;
    public TimeUnit vG;
    public TimeUnit yiw;

    public abstract Jd pvs();

    public abstract icD pvs(Ju ju);

    public qh(pvs pvsVar) {
        this.icD = pvsVar.icD;
        this.Jd = pvsVar.Jd;
        this.sUS = pvsVar.sUS;
        this.pvs = pvsVar.pvs;
        this.vG = pvsVar.vG;
        this.NB = pvsVar.NB;
        this.yiw = pvsVar.yiw;
        this.pvs = pvsVar.pvs;
    }

    /* compiled from: OkHttpClient.java */
    public static final class pvs {
        public long Jd;
        public TimeUnit NB;
        public long icD;
        public final List<so> pvs;
        public long sUS;
        public TimeUnit vG;
        public TimeUnit yiw;

        public pvs() {
            this.pvs = new ArrayList();
            this.icD = WorkRequest.MIN_BACKOFF_MILLIS;
            this.vG = TimeUnit.MILLISECONDS;
            this.Jd = WorkRequest.MIN_BACKOFF_MILLIS;
            this.NB = TimeUnit.MILLISECONDS;
            this.sUS = WorkRequest.MIN_BACKOFF_MILLIS;
            this.yiw = TimeUnit.MILLISECONDS;
        }

        public pvs(String str) {
            this.pvs = new ArrayList();
            this.icD = WorkRequest.MIN_BACKOFF_MILLIS;
            this.vG = TimeUnit.MILLISECONDS;
            this.Jd = WorkRequest.MIN_BACKOFF_MILLIS;
            this.NB = TimeUnit.MILLISECONDS;
            this.sUS = WorkRequest.MIN_BACKOFF_MILLIS;
            this.yiw = TimeUnit.MILLISECONDS;
        }

        public pvs(qh qhVar) {
            this.pvs = new ArrayList();
            this.icD = WorkRequest.MIN_BACKOFF_MILLIS;
            this.vG = TimeUnit.MILLISECONDS;
            this.Jd = WorkRequest.MIN_BACKOFF_MILLIS;
            this.NB = TimeUnit.MILLISECONDS;
            this.sUS = WorkRequest.MIN_BACKOFF_MILLIS;
            this.yiw = TimeUnit.MILLISECONDS;
            this.icD = qhVar.icD;
            this.vG = qhVar.vG;
            this.Jd = qhVar.Jd;
            this.NB = qhVar.NB;
            this.sUS = qhVar.sUS;
            this.yiw = qhVar.yiw;
        }

        public pvs pvs(long j, TimeUnit timeUnit) {
            this.icD = j;
            this.vG = timeUnit;
            return this;
        }

        public pvs icD(long j, TimeUnit timeUnit) {
            this.Jd = j;
            this.NB = timeUnit;
            return this;
        }

        public pvs vG(long j, TimeUnit timeUnit) {
            this.sUS = j;
            this.yiw = timeUnit;
            return this;
        }

        public pvs pvs(so soVar) {
            this.pvs.add(soVar);
            return this;
        }

        public qh pvs() {
            return com.bytedance.sdk.component.icD.pvs.pvs.pvs.pvs(this);
        }
    }

    public pvs icD() {
        return new pvs(this);
    }
}
