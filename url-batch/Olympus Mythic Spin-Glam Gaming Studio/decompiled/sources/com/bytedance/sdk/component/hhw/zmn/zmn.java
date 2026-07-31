package com.bytedance.sdk.component.hhw.zmn;

/* loaded from: classes14.dex */
public class zmn {
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn btk;
    private boolean bvs;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn fb;
    private com.bytedance.sdk.component.hhw.zmn.fs.zn fs;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn hhw;
    private int iv;
    private long klz;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn nps;
    private int rc;
    private btk zg;
    private com.bytedance.sdk.component.hhw.zmn.zmn.btk zmn;
    private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zn;

    private zmn() {
        this.iv = 200;
        this.rc = 10;
    }

    public com.bytedance.sdk.component.hhw.zmn.zmn.btk zmn() {
        return this.zmn;
    }

    public com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn fs() {
        return this.hhw;
    }

    public boolean zn() {
        return this.bvs;
    }

    public btk fb() {
        return this.zg;
    }

    public long btk() {
        return this.klz;
    }

    public com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn hhw() {
        return this.nps;
    }

    public com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn nps() {
        return this.zn;
    }

    public com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zg() {
        return this.fb;
    }

    public com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn bvs() {
        return this.btk;
    }

    public com.bytedance.sdk.component.hhw.zmn.fs.zn iv() {
        return this.fs;
    }

    public int rc() {
        return this.iv;
    }

    public int klz() {
        return this.rc;
    }

    /* renamed from: com.bytedance.sdk.component.hhw.zmn.zmn$zmn, reason: collision with other inner class name */
    public static class C0132zmn {
        private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn btk;
        private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn fb;
        private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn fs;
        private btk hhw;
        private com.bytedance.sdk.component.hhw.zmn.zmn.btk nps;
        private long rc;
        private boolean zg;
        private com.bytedance.sdk.component.hhw.zmn.fs.zn zmn;
        private com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zn;
        private int bvs = 5000;
        private int iv = 10;

        public C0132zmn zmn(long j) {
            this.rc = j;
            return this;
        }

        public C0132zmn zmn(com.bytedance.sdk.component.hhw.zmn.zmn.btk btkVar) {
            this.nps = btkVar;
            return this;
        }

        public C0132zmn zmn(btk btkVar) {
            this.hhw = btkVar;
            return this;
        }

        public C0132zmn zmn(com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar) {
            this.fs = zmnVar;
            return this;
        }

        public C0132zmn fs(com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar) {
            this.zn = zmnVar;
            return this;
        }

        public C0132zmn zn(com.bytedance.sdk.component.hhw.zmn.fb.fs.zmn zmnVar) {
            this.fb = zmnVar;
            return this;
        }

        public C0132zmn zmn(com.bytedance.sdk.component.hhw.zmn.fs.zn znVar) {
            this.zmn = znVar;
            return this;
        }

        public C0132zmn zmn(int i) {
            this.bvs = i;
            return this;
        }

        public C0132zmn fs(int i) {
            this.iv = i;
            return this;
        }

        public zmn zmn() {
            zmn zmnVar = new zmn();
            zmnVar.fs = this.zmn;
            zmnVar.zn = this.fs;
            zmnVar.fb = this.zn;
            zmnVar.btk = this.fb;
            zmnVar.hhw = this.btk;
            zmnVar.zg = this.hhw;
            zmnVar.zmn = this.nps;
            zmnVar.bvs = this.zg;
            zmnVar.rc = this.iv;
            zmnVar.iv = this.bvs;
            zmnVar.klz = this.rc;
            return zmnVar;
        }
    }
}
