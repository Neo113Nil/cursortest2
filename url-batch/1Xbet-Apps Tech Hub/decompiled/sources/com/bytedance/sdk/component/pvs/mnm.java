package com.bytedance.sdk.component.pvs;

import android.text.TextUtils;

/* compiled from: Js2JavaCall.java */
/* loaded from: classes.dex */
public class mnm {
    public final String Jd;
    public final String NB;
    public final String icD;
    public final int pvs;
    public final String sUS;
    public final String so;
    public final String vG;
    public final String yiw;

    public static pvs pvs() {
        return new pvs();
    }

    public static mnm pvs(String str, int i) {
        return new mnm(str, i);
    }

    private mnm(String str, int i) {
        this.icD = null;
        this.vG = null;
        this.Jd = null;
        this.NB = null;
        this.sUS = str;
        this.yiw = null;
        this.pvs = i;
        this.so = null;
    }

    private mnm(pvs pvsVar) {
        this.icD = pvsVar.pvs;
        this.vG = pvsVar.icD;
        this.Jd = pvsVar.vG;
        this.NB = pvsVar.Jd;
        this.sUS = pvsVar.NB;
        this.yiw = pvsVar.sUS;
        this.pvs = 1;
        this.so = pvsVar.yiw;
    }

    public static boolean pvs(mnm mnmVar) {
        return mnmVar == null || mnmVar.pvs != 1 || TextUtils.isEmpty(mnmVar.Jd) || TextUtils.isEmpty(mnmVar.NB);
    }

    public String toString() {
        return "methodName: " + this.Jd + ", params: " + this.NB + ", callbackId: " + this.sUS + ", type: " + this.vG + ", version: " + this.icD + ", ";
    }

    /* compiled from: Js2JavaCall.java */
    public static final class pvs {
        private String Jd;
        private String NB;
        private String icD;
        private String pvs;
        private String sUS;
        private String vG;
        private String yiw;

        private pvs() {
        }

        public pvs pvs(String str) {
            this.pvs = str;
            return this;
        }

        public pvs icD(String str) {
            this.icD = str;
            return this;
        }

        public pvs vG(String str) {
            this.vG = str;
            return this;
        }

        public pvs Jd(String str) {
            this.Jd = str;
            return this;
        }

        public pvs NB(String str) {
            this.NB = str;
            return this;
        }

        public pvs sUS(String str) {
            this.sUS = str;
            return this;
        }

        public pvs yiw(String str) {
            this.yiw = str;
            return this;
        }

        public mnm pvs() {
            return new mnm(this);
        }
    }
}
