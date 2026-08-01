package com.bytedance.sdk.component.sUS.pvs;

import com.bytedance.sdk.openadsdk.api.PAGErrorCode;

/* compiled from: AdLogConfig.java */
/* loaded from: classes.dex */
public class pvs {
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs Jd;
    private long Ju;
    private NB Mxy;
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs NB;
    private boolean Wyp;
    private com.bytedance.sdk.component.sUS.pvs.icD.vG icD;
    private int kj;
    private com.bytedance.sdk.component.sUS.pvs.pvs.NB pvs;
    private int qh;
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs sUS;
    private boolean so;
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs vG;
    private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs yiw;

    private pvs() {
        this.qh = 200;
        this.kj = 10;
    }

    public com.bytedance.sdk.component.sUS.pvs.pvs.NB pvs() {
        return this.pvs;
    }

    public com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs icD() {
        return this.sUS;
    }

    public boolean vG() {
        return this.Wyp;
    }

    public NB Jd() {
        return this.Mxy;
    }

    public long NB() {
        return this.Ju;
    }

    public com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs sUS() {
        return this.yiw;
    }

    public com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs yiw() {
        return this.vG;
    }

    public com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs so() {
        return this.Jd;
    }

    public com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs Mxy() {
        return this.NB;
    }

    public com.bytedance.sdk.component.sUS.pvs.icD.vG Wyp() {
        return this.icD;
    }

    public boolean qh() {
        return this.so;
    }

    public int kj() {
        return this.qh;
    }

    public int Ju() {
        return this.kj;
    }

    /* compiled from: AdLogConfig.java */
    /* renamed from: com.bytedance.sdk.component.sUS.pvs.pvs$pvs, reason: collision with other inner class name */
    public static class C0052pvs {
        private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs Jd;
        private boolean Mxy;
        private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs NB;
        private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs icD;
        private long kj;
        private com.bytedance.sdk.component.sUS.pvs.icD.vG pvs;
        private boolean sUS;
        private com.bytedance.sdk.component.sUS.pvs.pvs.NB so;
        private com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs vG;
        private NB yiw;
        private int Wyp = PAGErrorCode.LOAD_FACTORY_NULL_CODE;
        private int qh = 10;

        public C0052pvs pvs(long j) {
            this.kj = j;
            return this;
        }

        public C0052pvs pvs(com.bytedance.sdk.component.sUS.pvs.pvs.NB nb) {
            this.so = nb;
            return this;
        }

        public C0052pvs pvs(NB nb) {
            this.yiw = nb;
            return this;
        }

        public C0052pvs pvs(boolean z) {
            this.sUS = z;
            return this;
        }

        public C0052pvs pvs(com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar) {
            this.icD = pvsVar;
            return this;
        }

        public C0052pvs icD(com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar) {
            this.vG = pvsVar;
            return this;
        }

        public C0052pvs vG(com.bytedance.sdk.component.sUS.pvs.Jd.icD.pvs pvsVar) {
            this.Jd = pvsVar;
            return this;
        }

        public C0052pvs pvs(com.bytedance.sdk.component.sUS.pvs.icD.vG vGVar) {
            this.pvs = vGVar;
            return this;
        }

        public C0052pvs pvs(int i) {
            this.Wyp = i;
            return this;
        }

        public C0052pvs icD(int i) {
            this.qh = i;
            return this;
        }

        public pvs pvs() {
            pvs pvsVar = new pvs();
            pvsVar.icD = this.pvs;
            pvsVar.vG = this.icD;
            pvsVar.Jd = this.vG;
            pvsVar.NB = this.Jd;
            pvsVar.sUS = this.NB;
            pvsVar.so = this.sUS;
            pvsVar.Mxy = this.yiw;
            pvsVar.pvs = this.so;
            pvsVar.Wyp = this.Mxy;
            pvsVar.kj = this.qh;
            pvsVar.qh = this.Wyp;
            pvsVar.Ju = this.kj;
            return pvsVar;
        }
    }
}
