package com.bytedance.sdk.component.NB.vG;

import android.content.Context;
import com.bytedance.sdk.component.NB.Ju;
import com.bytedance.sdk.component.NB.cR;
import com.bytedance.sdk.component.NB.kj;
import com.bytedance.sdk.component.NB.rCZ;
import com.bytedance.sdk.component.NB.vA;
import com.bytedance.sdk.component.NB.zM;
import java.util.concurrent.ExecutorService;

/* compiled from: LoadConfig.java */
/* loaded from: classes.dex */
public class NB implements Ju {
    private cR Jd;
    private rCZ Mxy;
    private zM NB;
    private ExecutorService icD;
    private kj pvs;
    private com.bytedance.sdk.component.NB.vG sUS;
    private com.bytedance.sdk.component.NB.icD so;
    private com.bytedance.sdk.component.NB.Jd vG;
    private vA yiw;

    private NB(pvs pvsVar) {
        this.pvs = pvsVar.pvs;
        this.icD = pvsVar.icD;
        this.vG = pvsVar.vG;
        this.Jd = pvsVar.Jd;
        this.NB = pvsVar.NB;
        this.sUS = pvsVar.sUS;
        this.so = pvsVar.so;
        this.yiw = pvsVar.yiw;
        this.Mxy = pvsVar.Mxy;
    }

    @Override // com.bytedance.sdk.component.NB.Ju
    public kj pvs() {
        return this.pvs;
    }

    @Override // com.bytedance.sdk.component.NB.Ju
    public ExecutorService icD() {
        return this.icD;
    }

    @Override // com.bytedance.sdk.component.NB.Ju
    public com.bytedance.sdk.component.NB.Jd Jd() {
        return this.vG;
    }

    @Override // com.bytedance.sdk.component.NB.Ju
    public cR NB() {
        return this.Jd;
    }

    @Override // com.bytedance.sdk.component.NB.Ju
    public zM sUS() {
        return this.NB;
    }

    @Override // com.bytedance.sdk.component.NB.Ju
    public com.bytedance.sdk.component.NB.vG yiw() {
        return this.sUS;
    }

    @Override // com.bytedance.sdk.component.NB.Ju
    public vA so() {
        return this.yiw;
    }

    @Override // com.bytedance.sdk.component.NB.Ju
    public rCZ vG() {
        return this.Mxy;
    }

    @Override // com.bytedance.sdk.component.NB.Ju
    public com.bytedance.sdk.component.NB.icD Mxy() {
        return this.so;
    }

    public static NB pvs(Context context) {
        return new pvs().pvs();
    }

    /* compiled from: LoadConfig.java */
    public static class pvs {
        private cR Jd;
        private rCZ Mxy;
        private zM NB;
        private ExecutorService icD;
        private kj pvs;
        private com.bytedance.sdk.component.NB.vG sUS;
        private com.bytedance.sdk.component.NB.icD so;
        private com.bytedance.sdk.component.NB.Jd vG;
        private vA yiw;

        public pvs pvs(com.bytedance.sdk.component.NB.icD icd) {
            this.so = icd;
            return this;
        }

        public pvs pvs(rCZ rcz) {
            this.Mxy = rcz;
            return this;
        }

        public pvs pvs(com.bytedance.sdk.component.NB.Jd jd) {
            this.vG = jd;
            return this;
        }

        public NB pvs() {
            return new NB(this);
        }
    }
}
