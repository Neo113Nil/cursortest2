package com.bytedance.sdk.component.zmn;

import android.text.TextUtils;

/* loaded from: classes15.dex */
public class rt {
    public final String btk;
    public final String fb;
    public final String fs;
    public final String hhw;
    public final String nps;
    public final String zg;
    public final int zmn;
    public final String zn;

    public static zmn zmn() {
        return new zmn();
    }

    public static rt zmn(String str, int i) {
        return new rt(str, i);
    }

    private rt(String str, int i) {
        this.fs = null;
        this.zn = null;
        this.fb = null;
        this.btk = null;
        this.hhw = str;
        this.nps = null;
        this.zmn = i;
        this.zg = null;
    }

    private rt(zmn zmnVar) {
        this.fs = zmnVar.zmn;
        this.zn = zmnVar.fs;
        this.fb = zmnVar.zn;
        this.btk = zmnVar.fb;
        this.hhw = zmnVar.btk;
        this.nps = zmnVar.hhw;
        this.zmn = 1;
        this.zg = zmnVar.nps;
    }

    public static boolean zmn(rt rtVar) {
        return rtVar == null || rtVar.zmn != 1 || TextUtils.isEmpty(rtVar.fb) || TextUtils.isEmpty(rtVar.btk);
    }

    public String toString() {
        return "methodName: " + this.fb + ", params: " + this.btk + ", callbackId: " + this.hhw + ", type: " + this.zn + ", version: " + this.fs + ", ";
    }

    public static final class zmn {
        private String btk;
        private String fb;
        private String fs;
        private String hhw;
        private String nps;
        private String zmn;
        private String zn;

        private zmn() {
        }

        public zmn zmn(String str) {
            this.zmn = str;
            return this;
        }

        public zmn fs(String str) {
            this.fs = str;
            return this;
        }

        public zmn zn(String str) {
            this.zn = str;
            return this;
        }

        public zmn fb(String str) {
            this.fb = str;
            return this;
        }

        public zmn btk(String str) {
            this.btk = str;
            return this;
        }

        public zmn hhw(String str) {
            this.hhw = str;
            return this;
        }

        public zmn nps(String str) {
            this.nps = str;
            return this;
        }

        public rt zmn() {
            return new rt(this);
        }
    }
}
