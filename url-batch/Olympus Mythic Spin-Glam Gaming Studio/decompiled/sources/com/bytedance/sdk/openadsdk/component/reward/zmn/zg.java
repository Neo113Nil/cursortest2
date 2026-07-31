package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.doe.zmn.zmn;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.pubmatic.sdk.video.POBVastError;

/* loaded from: classes14.dex */
public class zg extends iv implements Handler.Callback {
    private int bjh;
    int btk;
    private int doe;
    int fb;
    long fs;
    boolean hhw;
    private final Handler iqz;
    private boolean kjb;
    protected int nps;
    private int nqi;
    private boolean phc;
    private int rp;
    private boolean uqh;
    boolean zmn;
    int zn;

    public zg(fs fsVar) {
        super(fsVar);
        this.iqz = new Handler(this);
        this.zmn = false;
        this.fs = 0L;
        this.zn = 0;
        this.fb = 0;
        this.btk = 0;
        this.hhw = false;
        this.phc = false;
        this.doe = 0;
        this.uqh = false;
        this.bjh = 0;
        this.rp = 0;
        this.kjb = false;
        this.nps = am.bvs(this.iv);
        this.fb = this.iv.ioo();
        int ur = this.iv.ur();
        this.btk = ur;
        this.bjh = Math.max(0, this.fb - ur);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.iv
    public void zmn() {
        if (this.rt && !this.mw) {
            super.zmn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.iv
    protected void zmn(boolean z) {
        if (this.olo != null) {
            try {
                com.bytedance.sdk.openadsdk.doe.zmn.fs zmn = com.bytedance.sdk.openadsdk.doe.zmn.fb.zmn().zmn(this.iv, this.olo, fs());
                this.kgc = zmn;
                zmn.zmn(this.klz.ww);
            } catch (Throwable th) {
                iqz.zn("RVIVPlayableNewManager", "PreRender injection exception" + th.getMessage());
            }
            if (this.kgc == null) {
                super.zmn(z);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.iv
    protected com.bytedance.sdk.openadsdk.mw.nps fs() {
        return new com.bytedance.sdk.openadsdk.mw.nps() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.zg.1
            @Override // com.bytedance.sdk.openadsdk.mw.nps
            public void zmn() {
                zg.this.olo();
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.iv
    public void zn() {
        if (this.rt) {
            this.zg = true;
            boolean cyb = cyb();
            if (cyb) {
                this.kgc.zmn(new zmn.InterfaceC0188zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.zg.2
                    @Override // com.bytedance.sdk.openadsdk.doe.zmn.zmn.InterfaceC0188zmn
                    public void zmn(int i) {
                        if (zg.this.kjb) {
                            return;
                        }
                        zg.this.doe = i;
                        zg.this.kgc.zmn((zmn.InterfaceC0188zmn) null);
                        zg.this.fs(i);
                    }
                });
            }
            this.kgc.zmn();
            if (am.zg(this.iv)) {
                this.klz.yj.hhw();
            }
            this.fs = System.currentTimeMillis();
            if (!cyb) {
                fs(0);
            }
            this.klz.ww.lt();
            com.bytedance.sdk.openadsdk.component.reward.klz klzVar = this.klz.mpi;
            if (klzVar != null) {
                klzVar.zmn(this.fb);
            }
        }
    }

    private boolean cyb() {
        if (this.klz.rje) {
            return false;
        }
        int i = this.nps;
        return 1 == i || 2 == i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(int i) {
        zmn(this.btk);
        if (this.phc) {
            return;
        }
        Handler handler = this.iqz;
        handler.sendMessage(handler.obtainMessage(POBVastError.UNDEFINED_ERROR, this.btk, i));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.iv
    public void fb() {
        com.bytedance.sdk.openadsdk.core.widget.fs fsVar;
        if (this.rt) {
            super.fb();
            if (DeviceUtils.nps() == 0) {
                this.klz.dgt = true;
            }
            fs fsVar2 = this.klz;
            if (fsVar2.dgt) {
                fsVar2.ev.fs(true);
                zn(true);
            }
            com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar3 = this.klz.f3739io;
            if ((fsVar3 == null || (fsVar = fsVar3.klz) == null || !fsVar.isShowing()) && rc() && nps() > 0) {
                zmn(0L);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.iv
    public void btk() {
        if (this.rt) {
            super.btk();
            bvs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.iv
    public void hhw() {
        if (this.rt && !this.cyb) {
            super.hhw();
            this.iqz.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.iv
    public int nps() {
        return this.zn;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.iv
    public int zg() {
        return this.nqi;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.iv
    public void zmn(int i) {
        this.zn = i;
        this.nqi = i;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.iv
    public void bvs() {
        if (this.rt) {
            this.phc = true;
            this.iqz.removeMessages(POBVastError.UNDEFINED_ERROR);
            this.iqz.removeMessages(600);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.iv
    public void zmn(long j) {
        if (this.rt && this.zg && !this.klz.iv.get() && this.phc) {
            this.phc = false;
            Message obtain = Message.obtain();
            obtain.what = POBVastError.UNDEFINED_ERROR;
            obtain.arg1 = nps();
            obtain.arg2 = this.doe;
            this.iqz.sendMessageDelayed(obtain, j);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 900 || !kgc()) {
            return true;
        }
        int i = message.arg1;
        boolean z = false;
        if (this.uqh) {
            int i2 = this.btk;
            int i3 = this.rp;
            int i4 = i2 + i3;
            int i5 = this.fb;
            if (i4 < i5) {
                this.rp = i3 + 1;
                Message obtain = Message.obtain();
                obtain.what = POBVastError.UNDEFINED_ERROR;
                obtain.arg1 = 0;
                this.iqz.sendMessageDelayed(obtain, 1000L);
            } else {
                this.rp = i5 - i2;
            }
        } else if (i > 0) {
            if (this.doe == 0 && 2 == this.nps) {
                z = true;
            }
            this.klz.ev.fb(true);
            if (!z) {
                this.klz.ev.zmn(String.valueOf(i), null);
            }
            Message obtain2 = Message.obtain();
            obtain2.what = POBVastError.UNDEFINED_ERROR;
            int i6 = i - 1;
            obtain2.arg1 = i6;
            this.iqz.sendMessageDelayed(obtain2, 1000L);
            this.zn = i6;
            this.nqi = i;
        } else {
            this.hhw = true;
            if (am.zg(this.iv) && (!am.iqz(this.iv) || !this.kgc.btk())) {
                this.klz.ev.zn();
                this.klz.ev.btk(true);
            } else {
                this.klz.ev.fb(false);
                this.klz.cyb.set(true);
                this.klz.f3739io.mw();
            }
            com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar = this.kgc;
            if (zmnVar == null || zmnVar.btk()) {
                this.cn = true;
            }
            if (this.bjh > 0) {
                this.uqh = true;
                this.rp++;
                Message obtain3 = Message.obtain();
                obtain3.what = POBVastError.UNDEFINED_ERROR;
                obtain3.arg1 = 0;
                this.iqz.sendMessageDelayed(obtain3, 1000L);
            }
            this.nqi = 0;
        }
        olo();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.iv
    public boolean iv() {
        return this.hhw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void olo() {
        int i;
        if (!this.uqh) {
            i = this.btk - this.zn;
        } else {
            i = this.btk + this.rp;
        }
        int i2 = com.bytedance.sdk.openadsdk.core.kgc.fb().kjb(String.valueOf(this.klz.hhw)).hhw;
        int i3 = this.fb;
        boolean z = false;
        boolean z2 = i3 <= 0 || (((float) i) / ((float) i3)) * 100.0f >= ((float) i2);
        int zmn = com.bytedance.sdk.openadsdk.core.kgc.fb().zmn(String.valueOf(this.klz.hhw));
        if (zmn == 0) {
            com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar = this.kgc;
            boolean hhw = zmnVar != null ? zmnVar.hhw() : false;
            if (this.cn) {
                hhw = true;
            }
            if (z2 && hhw) {
                z = true;
            }
        } else if (zmn == 1) {
            z = z2;
        }
        if (z) {
            this.klz.ww.fs(true);
        }
    }

    private boolean kgc() {
        return this.zg && am.zn(this.klz.fs) && !this.kw.get();
    }
}
