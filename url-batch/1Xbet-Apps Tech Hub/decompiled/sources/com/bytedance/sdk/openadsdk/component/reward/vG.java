package com.bytedance.sdk.openadsdk.component.reward;

import android.os.CountDownTimer;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.video.vG.pvs;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.bNS;

/* compiled from: FakeVideoController.java */
/* loaded from: classes2.dex */
public class vG implements com.bykv.vk.openvk.component.video.api.Jd.vG {
    private boolean NB;
    private final pvs pvs;
    private final cR sUS;
    private pvs.InterfaceC0085pvs so;
    private final com.bykv.vk.openvk.component.video.api.icD.pvs yiw;
    private boolean icD = true;
    private long vG = 0;
    private boolean Jd = false;

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void Jd(boolean z) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public com.bykv.vk.openvk.component.video.api.Jd.icD Ju() {
        return null;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void NB(boolean z) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void icD(com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public boolean mnm() {
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void pvs(vG.Jd jd) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void pvs(vG.icD icd) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public boolean qh() {
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public long sUS() {
        return 0L;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public boolean vA() {
        return false;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void vG(long j) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public int yiw() {
        return 0;
    }

    public vG(cR cRVar, com.bytedance.sdk.openadsdk.icD.yiw yiwVar) {
        com.bykv.vk.openvk.component.video.api.icD.pvs pvsVar = new com.bykv.vk.openvk.component.video.api.icD.pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.vG.1
        };
        this.yiw = pvsVar;
        this.sUS = cRVar;
        com.bykv.vk.openvk.component.video.api.vG.icD od = cRVar.od();
        long j = 10;
        long sUS = od != null ? (long) od.sUS() : 10L;
        if (sUS <= 0) {
            od.pvs(10.0d);
        } else {
            j = sUS;
        }
        this.pvs = new pvs(j * 1000, pvsVar, yiwVar);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void pvs() {
        this.pvs.Wyp();
        bNS.pvs pvsVar = new bNS.pvs();
        pvsVar.pvs(NB());
        pvsVar.vG(so());
        pvsVar.icD(sUS());
        com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.pvs(this.yiw, pvsVar);
        pvs.InterfaceC0085pvs interfaceC0085pvs = this.so;
        if (interfaceC0085pvs != null) {
            interfaceC0085pvs.pvs(2);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void icD() {
        this.pvs.Mxy();
        bNS.pvs pvsVar = new bNS.pvs();
        pvsVar.pvs(NB());
        pvsVar.vG(so());
        pvsVar.icD(sUS());
        com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.icD(this.yiw, pvsVar);
        pvs.InterfaceC0085pvs interfaceC0085pvs = this.so;
        if (interfaceC0085pvs != null) {
            interfaceC0085pvs.pvs(1);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void vG() {
        this.pvs.qh();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void pvs(boolean z, int i) {
        vG();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void Jd() {
        vG();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public boolean pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
        this.Jd = vGVar.so();
        if (vGVar.yiw() > 0) {
            this.pvs.pvs(vGVar.yiw());
        }
        com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.pvs(this.sUS, this.yiw, vGVar);
        this.pvs.Mxy();
        return true;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public long NB() {
        return this.pvs.bNS();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void pvs(long j) {
        this.pvs.pvs(j);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void pvs(boolean z) {
        this.icD = z;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public long so() {
        return this.pvs.IP();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public long Mxy() {
        return NB();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public int Wyp() {
        return com.bykv.vk.openvk.component.video.pvs.NB.pvs.pvs(this.pvs.sUS, this.pvs.pvs);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void icD(long j) {
        this.vG = j;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public com.bykv.vk.openvk.component.video.api.pvs kj() {
        return this.pvs;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public boolean IP() {
        return this.Jd;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void icD(boolean z) {
        this.Jd = z;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public boolean bNS() {
        return this.NB;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void vG(boolean z) {
        this.NB = z;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void pvs(vG.pvs pvsVar) {
        this.pvs.pvs(pvsVar);
    }

    public com.bykv.vk.openvk.component.video.api.icD.pvs cR() {
        return this.yiw;
    }

    /* compiled from: FakeVideoController.java */
    private static class pvs implements com.bykv.vk.openvk.component.video.api.pvs {
        private CountDownTimer Jd;
        private vG.pvs NB;
        private long icD;
        private final long pvs;
        private long sUS;
        private final com.bytedance.sdk.openadsdk.icD.yiw so;
        private int vG = 0;
        private final com.bykv.vk.openvk.component.video.api.icD.pvs yiw;

        @Override // com.bykv.vk.openvk.component.video.api.pvs
        public int Jd() {
            return 0;
        }

        public int Ju() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs
        public int NB() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs
        public boolean icD() {
            return false;
        }

        public long kj() {
            return 0L;
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs
        public boolean pvs() {
            return false;
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs
        public boolean vG() {
            return false;
        }

        public pvs(long j, com.bykv.vk.openvk.component.video.api.icD.pvs pvsVar, com.bytedance.sdk.openadsdk.icD.yiw yiwVar) {
            this.pvs = j;
            this.yiw = pvsVar;
            this.so = yiwVar;
        }

        public void Mxy() {
            if (this.vG == 1) {
                return;
            }
            this.vG = 1;
            final long IP = IP();
            final long j = IP - this.icD;
            CountDownTimer countDownTimer = new CountDownTimer(j, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.vG.pvs.1
                @Override // android.os.CountDownTimer
                public void onTick(long j2) {
                    long j3 = (j - j2) + pvs.this.icD;
                    pvs.this.sUS = j3;
                    if (pvs.this.NB != null) {
                        pvs.this.NB.pvs(j3, IP);
                    }
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    pvs.this.vG = 4;
                    pvs.this.sUS = IP;
                    if (pvs.this.NB != null) {
                        pvs.this.NB.pvs(pvs.this.bNS(), 100);
                    }
                    bNS.pvs pvsVar = new bNS.pvs();
                    pvsVar.pvs(IP);
                    pvsVar.vG(IP);
                    pvsVar.icD(pvs.this.kj());
                    pvsVar.Jd(pvs.this.Ju());
                    com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.icD(pvs.this.yiw, pvsVar, pvs.this.so);
                }
            };
            this.Jd = countDownTimer;
            countDownTimer.start();
        }

        public void Wyp() {
            this.vG = 2;
            this.icD = this.sUS;
            CountDownTimer countDownTimer = this.Jd;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.Jd = null;
            }
        }

        public void qh() {
            this.vG = 0;
            CountDownTimer countDownTimer = this.Jd;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.Jd = null;
            }
            if (this.NB != null) {
                this.NB = null;
            }
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs
        public boolean sUS() {
            return this.vG == 1;
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs
        public boolean yiw() {
            return this.vG == 2;
        }

        @Override // com.bykv.vk.openvk.component.video.api.pvs
        public boolean so() {
            return this.vG == 0;
        }

        public long IP() {
            return this.pvs;
        }

        public long bNS() {
            return this.sUS;
        }

        public void pvs(long j) {
            this.icD = j;
        }

        public void pvs(vG.pvs pvsVar) {
            this.NB = pvsVar;
        }
    }

    public void pvs(pvs.InterfaceC0085pvs interfaceC0085pvs) {
        this.so = interfaceC0085pvs;
    }
}
