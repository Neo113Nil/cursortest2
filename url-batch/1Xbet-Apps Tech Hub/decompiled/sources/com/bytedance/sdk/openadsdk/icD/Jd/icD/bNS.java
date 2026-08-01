package com.bytedance.sdk.openadsdk.icD.Jd.icD;

import com.bytedance.sdk.openadsdk.core.model.cR;

/* compiled from: VideoLogHelperModel.java */
/* loaded from: classes2.dex */
public class bNS {
    private com.bykv.vk.openvk.component.video.api.vG.vG Jd;
    private cR NB;
    private String icD;
    private long pvs;
    private int vG;

    public bNS(long j, String str, int i, com.bykv.vk.openvk.component.video.api.vG.vG vGVar, cR cRVar) {
        this.pvs = j;
        this.icD = str;
        this.vG = i;
        this.Jd = vGVar;
        this.NB = cRVar;
    }

    public long pvs() {
        return this.pvs;
    }

    public String icD() {
        return this.icD;
    }

    public int vG() {
        return this.vG;
    }

    public com.bykv.vk.openvk.component.video.api.vG.vG Jd() {
        return this.Jd;
    }

    public cR NB() {
        return this.NB;
    }

    /* compiled from: VideoLogHelperModel.java */
    public static class pvs {
        private int Mxy;
        private int NB;
        private com.bykv.vk.openvk.component.video.api.vG.pvs qh;
        private int sUS;
        private int so;
        private int yiw;
        private long pvs = 0;
        private long icD = 0;
        private long vG = 0;
        private boolean Jd = false;
        private boolean Wyp = false;

        public long pvs() {
            return this.pvs;
        }

        public void pvs(long j) {
            this.pvs = j;
            Ju();
        }

        private void Ju() {
            long j = this.vG;
            if (j > 0) {
                long j2 = this.pvs;
                if (j2 > j) {
                    this.pvs = j2 % j;
                }
            }
        }

        public long icD() {
            return this.icD;
        }

        public void icD(long j) {
            this.icD = j;
        }

        public long vG() {
            return this.vG;
        }

        public void vG(long j) {
            this.vG = j;
            Ju();
        }

        public int Jd() {
            return this.NB;
        }

        public void pvs(int i) {
            this.NB = i;
        }

        public int NB() {
            return this.sUS;
        }

        public void icD(int i) {
            this.sUS = i;
        }

        public int sUS() {
            long j = this.vG;
            if (j <= 0) {
                return 0;
            }
            return Math.min((int) ((this.pvs * 100) / j), 100);
        }

        public int yiw() {
            return this.yiw;
        }

        public void vG(int i) {
            this.yiw = i;
        }

        public int so() {
            return this.so;
        }

        public int Mxy() {
            return this.Mxy;
        }

        public void Jd(int i) {
            this.Mxy = i;
        }

        public boolean Wyp() {
            return this.Wyp;
        }

        public boolean qh() {
            return this.Jd;
        }

        public void pvs(boolean z) {
            this.Jd = z;
        }

        public void pvs(com.bykv.vk.openvk.component.video.api.vG.pvs pvsVar) {
            this.qh = pvsVar;
        }

        public com.bykv.vk.openvk.component.video.api.vG.pvs kj() {
            return this.qh;
        }
    }
}
