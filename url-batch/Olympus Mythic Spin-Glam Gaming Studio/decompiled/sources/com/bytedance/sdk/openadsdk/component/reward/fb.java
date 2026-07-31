package com.bytedance.sdk.openadsdk.component.reward;

import android.graphics.SurfaceTexture;
import android.os.CountDownTimer;
import com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn;
import com.bytedance.sdk.openadsdk.core.cn.fb.zmn;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.fb.btk.fs.cn;

/* loaded from: classes13.dex */
public class fb implements com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn {
    private final nqi fs;
    private long nps;
    private zmn.InterfaceC0155zmn zg;
    private final zmn zmn;
    private final com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn zn;
    private boolean fb = true;
    private long btk = 0;
    private boolean hhw = false;

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public boolean cn() {
        return false;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public com.bykv.vk.openvk.zmn.zmn.zmn.fb.fs klz() {
        return null;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public long nps() {
        return 0L;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public boolean rt() {
        return false;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public int zg() {
        return 0;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void zmn(SurfaceTexture surfaceTexture) {
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public boolean zmn(float f) {
        return false;
    }

    public fb(nqi nqiVar, com.bytedance.sdk.openadsdk.fb.nps npsVar) {
        com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn zmnVar = new com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.fb.1
        };
        this.zn = zmnVar;
        this.fs = nqiVar;
        com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs mrt = nqiVar.mrt();
        long j = 10;
        long hhw = mrt != null ? (long) mrt.hhw() : 10L;
        if (hhw <= 0) {
            mrt.zmn(10.0d);
        } else {
            j = hhw;
        }
        this.zmn = new zmn(j * 1000, zmnVar, npsVar);
    }

    public long cyb() {
        return this.nps;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void zmn(long j) {
        this.nps = j;
        zmn zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.zmn(j);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void fs() {
        this.zmn.klz();
        cn.zmn zmnVar = new cn.zmn();
        zmnVar.fs(hhw());
        zmnVar.fb(bvs());
        zmnVar.zn(nps());
        zmnVar.zmn(cyb());
        com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(this.zn, zmnVar);
        zmn.InterfaceC0155zmn interfaceC0155zmn = this.zg;
        if (interfaceC0155zmn != null) {
            interfaceC0155zmn.zmn(2);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void zn() {
        this.zmn.rc();
        cn.zmn zmnVar = new cn.zmn();
        zmnVar.fs(hhw());
        zmnVar.fb(bvs());
        zmnVar.zn(nps());
        com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.fs(this.zn, zmnVar);
        zmn.InterfaceC0155zmn interfaceC0155zmn = this.zg;
        if (interfaceC0155zmn != null) {
            interfaceC0155zmn.zmn(1);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void fb() {
        this.zmn.mw();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void zmn(boolean z, int i) {
        fb();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void btk() {
        fb();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public boolean zmn(com.bykv.vk.openvk.zmn.zmn.zmn.zn.zn znVar) {
        this.hhw = znVar.rc();
        if (znVar.iv() > 0) {
            this.zmn.fs(znVar.iv());
        }
        znVar.fs(com.bytedance.sdk.openadsdk.uqh.btk.zmn("player_force_raw_url", 0) == 1);
        com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(this.fs, this.zn, znVar);
        this.zmn.rc();
        zmn.InterfaceC0155zmn interfaceC0155zmn = this.zg;
        if (interfaceC0155zmn != null) {
            interfaceC0155zmn.zmn(1);
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public long hhw() {
        return this.zmn.olo();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public long bvs() {
        return this.zmn.cyb();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public int iv() {
        return com.bykv.vk.openvk.zmn.zmn.fs.fb.zmn.zmn(this.zmn.zg, this.zmn.zmn);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public com.bykv.vk.openvk.zmn.zmn.zmn.zmn rc() {
        return this.zmn;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void zmn(boolean z, String str) {
        this.hhw = z;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public boolean mw() {
        return this.zmn.fs();
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void zmn(zn.zmn zmnVar) {
        this.zmn.zmn(zmnVar);
    }

    public com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn olo() {
        return this.zn;
    }

    public void zmn(zmn.InterfaceC0155zmn interfaceC0155zmn) {
        this.zg = interfaceC0155zmn;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn
    public void zmn() {
        this.zmn.iv();
    }

    private static class zmn implements com.bykv.vk.openvk.zmn.zmn.zmn.zmn {
        private int btk = 0;
        private long bvs;
        private long fb;
        private final com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn fs;
        private CountDownTimer hhw;
        private zn.zmn nps;
        private long zg;
        private final long zmn;
        private final com.bytedance.sdk.openadsdk.fb.nps zn;

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn
        public int btk() {
            return 0;
        }

        public int cn() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn
        public int fb() {
            return 0;
        }

        public long rt() {
            return 0L;
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn
        public boolean zmn() {
            return false;
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn
        public boolean zn() {
            return false;
        }

        public zmn(long j, com.bykv.vk.openvk.zmn.zmn.zmn.fs.zmn zmnVar, com.bytedance.sdk.openadsdk.fb.nps npsVar) {
            this.zmn = j;
            this.fs = zmnVar;
            this.zn = npsVar;
        }

        public long bvs() {
            return this.bvs;
        }

        public void zmn(long j) {
            this.bvs = j;
        }

        public void iv() {
            this.zg = 0L;
            rc();
        }

        public void rc() {
            if (this.btk == 1) {
                return;
            }
            this.btk = 1;
            final long cyb = cyb();
            if (this.fb >= cyb) {
                this.fb = 0L;
            }
            final long j = cyb - this.fb;
            CountDownTimer countDownTimer = new CountDownTimer(j, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.fb.zmn.1
                @Override // android.os.CountDownTimer
                public void onTick(long j2) {
                    long j3 = (j - j2) + zmn.this.fb;
                    zmn.this.zg = j3;
                    if (zmn.this.nps != null) {
                        zmn.this.nps.zmn(j3, cyb);
                    }
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    if (zmn.this.nps != null) {
                        zn.zmn zmnVar = zmn.this.nps;
                        long j2 = cyb;
                        zmnVar.zmn(j2, j2);
                    }
                    zmn.this.btk = 4;
                    zmn.this.zg = cyb;
                    zmn.this.fb = cyb;
                    if (zmn.this.nps != null) {
                        zmn.this.nps.zmn(zmn.this.olo(), 100);
                    }
                    cn.zmn zmnVar2 = new cn.zmn();
                    zmnVar2.fs(cyb);
                    zmnVar2.fb(cyb);
                    zmnVar2.zn(zmn.this.rt());
                    zmnVar2.fb(zmn.this.cn());
                    zmnVar2.zmn(zmn.this.bvs());
                    com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.fs(zmn.this.fs, zmnVar2, zmn.this.zn);
                }
            };
            this.hhw = countDownTimer;
            countDownTimer.start();
        }

        public void klz() {
            this.btk = 2;
            this.fb = this.zg;
            CountDownTimer countDownTimer = this.hhw;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.hhw = null;
            }
        }

        public void mw() {
            this.btk = 0;
            CountDownTimer countDownTimer = this.hhw;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.hhw = null;
            }
            if (this.nps != null) {
                this.nps = null;
            }
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn
        public boolean fs() {
            return this.btk == 4;
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn
        public boolean hhw() {
            return this.btk == 1;
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn
        public boolean nps() {
            return this.btk == 2;
        }

        @Override // com.bykv.vk.openvk.zmn.zmn.zmn.zmn
        public boolean zg() {
            return this.btk == 0;
        }

        public long cyb() {
            return this.zmn;
        }

        public long olo() {
            return this.zg;
        }

        public void fs(long j) {
            this.fb = j;
        }

        public void zmn(zn.zmn zmnVar) {
            this.nps = zmnVar;
        }
    }
}
