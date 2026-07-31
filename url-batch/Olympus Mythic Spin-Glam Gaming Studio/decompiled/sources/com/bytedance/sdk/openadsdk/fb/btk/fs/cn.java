package com.bytedance.sdk.openadsdk.fb.btk.fs;

import com.bytedance.sdk.openadsdk.core.model.nqi;

/* loaded from: classes12.dex */
public class cn {
    private nqi btk;
    private com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn fb;
    private String fs;
    private long zmn;
    private int zn;

    public cn(long j, String str, int i, com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar, nqi nqiVar) {
        this.zmn = j;
        this.fs = str;
        this.zn = i;
        this.fb = znVar;
        this.btk = nqiVar;
    }

    public long zmn() {
        return this.zmn;
    }

    public String fs() {
        return this.fs;
    }

    public int zn() {
        return this.zn;
    }

    public com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn fb() {
        return this.fb;
    }

    public nqi btk() {
        return this.btk;
    }

    public static class zmn {
        private boolean btk;
        private int bvs;
        private boolean fb;
        private int iv;
        private int klz;
        private int rc;
        private com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn rt;
        private int zg;
        private long zmn = 0;
        private long fs = 0;
        private long zn = 0;
        private long hhw = 0;
        private boolean nps = false;
        private boolean mw = false;

        public long zmn() {
            return this.hhw;
        }

        public void zmn(long j) {
            this.hhw = j;
        }

        public long fs() {
            return this.zmn;
        }

        public void fs(long j) {
            this.zmn = j;
            cyb();
        }

        private void cyb() {
            long j = this.zn;
            if (j > 0) {
                long j2 = this.zmn;
                if (j2 > j) {
                    long j3 = j2 % j;
                    this.zmn = j3;
                    if (j3 == 0) {
                        this.zmn = j;
                    }
                }
            }
        }

        public long zn() {
            return this.fs;
        }

        public void zn(long j) {
            this.fs = j;
        }

        public long fb() {
            return this.zn;
        }

        public void fb(long j) {
            this.zn = j;
            cyb();
        }

        public int btk() {
            return this.zg;
        }

        public void zmn(int i) {
            this.zg = i;
        }

        public int hhw() {
            return this.bvs;
        }

        public void fs(int i) {
            this.bvs = i;
        }

        public int nps() {
            long j = this.zn;
            if (j <= 0) {
                return 0;
            }
            return Math.min((int) ((this.zmn * 100) / j), 100);
        }

        public int zg() {
            return this.iv;
        }

        public void zn(int i) {
            this.iv = i;
        }

        public int bvs() {
            return this.rc;
        }

        public int iv() {
            return this.klz;
        }

        public void fb(int i) {
            this.klz = i;
        }

        public boolean rc() {
            return this.mw;
        }

        public boolean klz() {
            return this.nps;
        }

        public void zmn(boolean z) {
            this.nps = z;
        }

        public void zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn zmnVar) {
            this.rt = zmnVar;
        }

        public com.bykv.vk.openvk.zmn.zmn.zmn.zn.zmn mw() {
            return this.rt;
        }

        public void fs(boolean z) {
            this.fb = z;
        }

        public boolean rt() {
            return this.fb;
        }

        public void zn(boolean z) {
            this.btk = z;
        }

        public boolean cn() {
            return this.btk;
        }
    }
}
