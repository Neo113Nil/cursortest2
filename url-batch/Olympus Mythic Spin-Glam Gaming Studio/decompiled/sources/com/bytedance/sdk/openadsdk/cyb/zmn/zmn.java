package com.bytedance.sdk.openadsdk.cyb.zmn;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* loaded from: classes15.dex */
public class zmn {
    float btk;
    float bvs;
    String cn;
    float cyb;
    float fb;
    int fs;
    int hhw;
    int iv;
    float klz;
    float mw;
    float nps;
    int olo;
    float rc;
    int rt;
    float zg;
    String zmn;
    float zn;
    int kgc = -1;
    String kw = "";

    public int zmn() {
        return this.kgc;
    }

    public void zmn(int i) {
        this.kgc = i;
    }

    public String fs() {
        return this.kw;
    }

    public void zmn(String str) {
        this.kw = str;
    }

    public String zn() {
        return this.zmn;
    }

    public void fs(String str) {
        this.zmn = str;
    }

    public int fb() {
        return this.fs;
    }

    public void fs(int i) {
        this.fs = i;
    }

    public float btk() {
        return this.zn;
    }

    public void zmn(float f) {
        this.zn = f;
    }

    public float hhw() {
        return this.fb;
    }

    public void fs(float f) {
        this.fb = f;
    }

    public float nps() {
        return this.btk;
    }

    public void zn(float f) {
        this.btk = f;
    }

    public int zg() {
        return this.hhw;
    }

    public void zn(int i) {
        this.hhw = i;
    }

    public float bvs() {
        return this.nps;
    }

    public void fb(float f) {
        this.nps = f;
    }

    public float iv() {
        return this.zg;
    }

    public void btk(float f) {
        this.zg = f;
    }

    public float rc() {
        return this.bvs;
    }

    public void hhw(float f) {
        this.bvs = f;
    }

    public int klz() {
        return this.iv;
    }

    public void fb(int i) {
        this.iv = i;
    }

    public float mw() {
        return this.rc;
    }

    public void nps(float f) {
        this.rc = f;
    }

    public float rt() {
        return this.klz;
    }

    public void zg(float f) {
        this.klz = f;
    }

    public BigDecimal cn() {
        return new BigDecimal(this.mw).setScale(3, RoundingMode.HALF_UP);
    }

    public void bvs(float f) {
        this.mw = f;
    }

    public int cyb() {
        return this.rt;
    }

    public void btk(int i) {
        this.rt = i;
    }

    public String olo() {
        return this.cn;
    }

    public void zn(String str) {
        this.cn = str;
    }

    public float kgc() {
        return this.cyb;
    }

    public void iv(float f) {
        this.cyb = f;
    }

    public int kw() {
        return this.olo;
    }

    public void hhw(int i) {
        this.olo = i;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.cyb.zmn.zmn$zmn, reason: collision with other inner class name */
    public static class C0186zmn {
        zmn zmn = new zmn();

        public C0186zmn zmn(String str) {
            this.zmn.fs(str);
            return this;
        }

        public C0186zmn zmn(int i) {
            this.zmn.fs(i);
            return this;
        }

        public C0186zmn zmn(float f) {
            this.zmn.zmn(f);
            return this;
        }

        public C0186zmn fs(float f) {
            this.zmn.fs(f);
            return this;
        }

        public C0186zmn zn(float f) {
            this.zmn.zn(f);
            return this;
        }

        public C0186zmn fb(float f) {
            this.zmn.fb(f);
            return this;
        }

        public C0186zmn btk(float f) {
            this.zmn.btk(f);
            return this;
        }

        public C0186zmn hhw(float f) {
            this.zmn.hhw(f);
            return this;
        }

        public C0186zmn nps(float f) {
            this.zmn.nps(f);
            return this;
        }

        public C0186zmn zg(float f) {
            this.zmn.zg(f);
            return this;
        }

        public C0186zmn bvs(float f) {
            this.zmn.bvs(f);
            return this;
        }

        public C0186zmn fs(int i) {
            this.zmn.btk(i);
            return this;
        }

        public C0186zmn fs(String str) {
            this.zmn.zn(str);
            return this;
        }

        public C0186zmn iv(float f) {
            this.zmn.iv(f);
            return this;
        }

        public C0186zmn zn(int i) {
            this.zmn.hhw(i);
            return this;
        }

        public zmn zmn() {
            return this.zmn;
        }
    }
}
