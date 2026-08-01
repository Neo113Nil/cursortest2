package com.bytedance.sdk.openadsdk.Wyp.pvs;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* compiled from: ArbitrageLogModel.java */
/* loaded from: classes2.dex */
public class pvs {
    int IP;
    float Jd;
    float Ju;
    float Mxy;
    float NB;
    int Wyp;
    String bNS;
    int icD;
    float kj;
    float mnm;
    String pvs;
    float qh;
    int sUS;
    float so;
    int vA;
    float vG;
    float yiw;
    int cR = -1;
    String zM = "";

    public int pvs() {
        return this.cR;
    }

    public void pvs(int i) {
        this.cR = i;
    }

    public String icD() {
        return this.zM;
    }

    public void pvs(String str) {
        this.zM = str;
    }

    public String vG() {
        return this.pvs;
    }

    public void icD(String str) {
        this.pvs = str;
    }

    public int Jd() {
        return this.icD;
    }

    public void icD(int i) {
        this.icD = i;
    }

    public float NB() {
        return this.vG;
    }

    public void pvs(float f) {
        this.vG = f;
    }

    public float sUS() {
        return this.Jd;
    }

    public void icD(float f) {
        this.Jd = f;
    }

    public float yiw() {
        return this.NB;
    }

    public void vG(float f) {
        this.NB = f;
    }

    public int so() {
        return this.sUS;
    }

    public void vG(int i) {
        this.sUS = i;
    }

    public float Mxy() {
        return this.yiw;
    }

    public void Jd(float f) {
        this.yiw = f;
    }

    public float Wyp() {
        return this.so;
    }

    public void NB(float f) {
        this.so = f;
    }

    public float qh() {
        return this.Mxy;
    }

    public void sUS(float f) {
        this.Mxy = f;
    }

    public int kj() {
        return this.Wyp;
    }

    public void Jd(int i) {
        this.Wyp = i;
    }

    public float Ju() {
        return this.qh;
    }

    public void yiw(float f) {
        this.qh = f;
    }

    public float IP() {
        return this.kj;
    }

    public void so(float f) {
        this.kj = f;
    }

    public BigDecimal bNS() {
        return new BigDecimal(this.Ju).setScale(3, RoundingMode.HALF_UP);
    }

    public void Mxy(float f) {
        this.Ju = f;
    }

    public int mnm() {
        return this.IP;
    }

    public void NB(int i) {
        this.IP = i;
    }

    public String vA() {
        return this.bNS;
    }

    public void vG(String str) {
        this.bNS = str;
    }

    public float cR() {
        return this.mnm;
    }

    public void Wyp(float f) {
        this.mnm = f;
    }

    public int zM() {
        return this.vA;
    }

    public void sUS(int i) {
        this.vA = i;
    }

    /* compiled from: ArbitrageLogModel.java */
    /* renamed from: com.bytedance.sdk.openadsdk.Wyp.pvs.pvs$pvs, reason: collision with other inner class name */
    public static class C0062pvs {
        pvs pvs = new pvs();

        public C0062pvs pvs(String str) {
            this.pvs.icD(str);
            return this;
        }

        public C0062pvs pvs(int i) {
            this.pvs.icD(i);
            return this;
        }

        public C0062pvs pvs(float f) {
            this.pvs.pvs(f);
            return this;
        }

        public C0062pvs icD(float f) {
            this.pvs.icD(f);
            return this;
        }

        public C0062pvs vG(float f) {
            this.pvs.vG(f);
            return this;
        }

        public C0062pvs Jd(float f) {
            this.pvs.Jd(f);
            return this;
        }

        public C0062pvs NB(float f) {
            this.pvs.NB(f);
            return this;
        }

        public C0062pvs sUS(float f) {
            this.pvs.sUS(f);
            return this;
        }

        public C0062pvs yiw(float f) {
            this.pvs.yiw(f);
            return this;
        }

        public C0062pvs so(float f) {
            this.pvs.so(f);
            return this;
        }

        public C0062pvs Mxy(float f) {
            this.pvs.Mxy(f);
            return this;
        }

        public C0062pvs icD(int i) {
            this.pvs.NB(i);
            return this;
        }

        public C0062pvs icD(String str) {
            this.pvs.vG(str);
            return this;
        }

        public C0062pvs Wyp(float f) {
            this.pvs.Wyp(f);
            return this;
        }

        public C0062pvs vG(int i) {
            this.pvs.sUS(i);
            return this;
        }

        public pvs pvs() {
            return this.pvs;
        }
    }
}
