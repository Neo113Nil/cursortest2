package com.bytedance.sdk.openadsdk.component.reward.fs;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.bvs.nps;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.fs;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.bvs;
import com.bytedance.sdk.openadsdk.component.reward.view.rc;
import com.bytedance.sdk.openadsdk.component.reward.view.zg;
import com.bytedance.sdk.openadsdk.component.reward.zmn.kgc;
import com.bytedance.sdk.openadsdk.component.reward.zmn.mw;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.fb.fs;
import com.bytedance.sdk.openadsdk.fb.iv;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.olo;
import com.bytedance.sdk.openadsdk.utils.rt;
import com.pubmatic.sdk.video.POBVastError;
import java.util.List;
import java.util.Objects;

/* loaded from: classes11.dex */
public abstract class fs extends zmn {
    public com.bytedance.sdk.openadsdk.core.widget.fs klz;
    private com.bytedance.sdk.openadsdk.mw.nps mw;
    protected com.bytedance.sdk.openadsdk.core.zn.btk rc;

    public abstract boolean btk();

    public abstract boolean fb();

    public abstract void hhw();

    public void rc() {
    }

    protected boolean rp() {
        return true;
    }

    public abstract void zmn(FrameLayout frameLayout);

    public fs(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        super(fsVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.fs.zmn
    public void zmn(com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar, kjb kjbVar) {
        super.zmn(fsVar, kjbVar);
        if (this.zmn.fs.hhw()) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.zmn;
            if (fsVar2.lbc) {
                fsVar2.yj.zmn(false);
            }
        }
    }

    public void zmn(zg zgVar) {
        zmn(zgVar, this.zmn);
    }

    public RFEndCardBackUpLayout nps() {
        return new RFEndCardBackUpLayout(this.zmn.oub);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x010b, code lost:
    
        if (r2.zmn == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View zg() {
        View createPAGLogoViewByMaterial;
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(this.zmn.nu);
        znVar.setId(olo.dz);
        View fs = com.bytedance.sdk.openadsdk.core.widget.hhw.fs(this.zmn.nu);
        fs.setId(520093708);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = jy.fs(this.zmn.nu, 20.0f);
        layoutParams.rightMargin = jy.fs(this.zmn.nu, 16.0f);
        fs.setLayoutParams(layoutParams);
        fs.setContentDescription(doe.zmn(this.zmn.nu, "tt_ad_close_text"));
        fs.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.hhw.fb zmn = com.bytedance.sdk.openadsdk.core.widget.hhw.zmn(this.zmn.nu, znVar);
        zmn.setId(olo.efd);
        zmn.setContentDescription(doe.zmn(this.zmn.nu, "tt_close_backup_button_text"));
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar = this.zmn.tdm;
        if (zgVar == null || !zgVar.jy().rp()) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
            createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(fsVar.nu, fsVar.fs);
            createPAGLogoViewByMaterial.setId(520093757);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, jy.fs(this.zmn.nu, 14.0f));
            layoutParams2.gravity = 8388691;
            createPAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        } else {
            createPAGLogoViewByMaterial = null;
        }
        com.bytedance.sdk.openadsdk.core.hhw.fb fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(this.zmn.nu);
        fbVar.setId(olo.ba);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(jy.fs(this.zmn.nu, 32.0f), jy.fs(this.zmn.nu, 14.0f));
        layoutParams3.gravity = 8388693;
        fbVar.setLayoutParams(layoutParams3);
        fbVar.setPadding(jy.fs(this.zmn.nu, 9.0f), 0, jy.fs(this.zmn.nu, 9.0f), 0);
        fbVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (createPAGLogoViewByMaterial != null) {
            znVar.addView(createPAGLogoViewByMaterial);
        }
        znVar.addView(fbVar);
        if (this.zmn.fs.dgt()) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.zmn;
            if (fsVar2.rje) {
            }
        }
        View znVar2 = new com.bytedance.sdk.openadsdk.component.reward.top.zn(this.zmn.nu);
        znVar2.setId(olo.ch);
        znVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        znVar.addView(znVar2);
        znVar.addView(fs);
        return znVar;
    }

    public View bvs() {
        com.bytedance.sdk.openadsdk.core.hhw.nps npsVar;
        if (this.fs.es() != 5) {
            npsVar = new com.bytedance.sdk.openadsdk.core.hhw.nps(this.zmn.nu);
            npsVar.setId(olo.ioo);
        } else {
            npsVar = null;
        }
        Objects.toString(npsVar);
        return npsVar;
    }

    public void iv() {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
        fsVar.bjh.zmn(fsVar, fsVar.fb);
        this.zmn.fkt.fs();
        this.zmn.tf.zmn();
        if (!this.zmn.fs.ch()) {
            this.zmn.yj.zmn();
            this.zmn.so.zmn();
        }
        this.zmn.nqi.nps();
        this.zmn.ev.zmn();
        if (am.hhw(this.zmn.fs)) {
            this.zmn.fkt.fb();
            jy.zmn((View) this.zmn.yj.zg(), 4);
        }
        if (iqz.fb(this.zmn.fs) || iqz.fs(this.zmn.fs) || iqz.zg(this.zmn.fs)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.zmn;
        fsVar2.fkt.zmn(jy.fs(fsVar2.oub, fsVar2.mhu), jy.fs(this.zmn.oub, r2.bxw));
        this.zmn.doe.zmn();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = this.zmn;
        if (fsVar3.lt) {
            fsVar3.fkt.zmn(0);
        }
    }

    public void zmn(boolean z, boolean z2, boolean z3, int i) {
        this.zmn.tf.zmn(z, z2, z3, this, i);
    }

    public void klz() {
        com.bytedance.sdk.openadsdk.core.widget.fs fsVar = this.klz;
        if (fsVar == null || !fsVar.isShowing()) {
            return;
        }
        this.klz.dismiss();
    }

    public void mw() {
        if (this.zmn.nps()) {
            this.zmn.ev.btk();
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
            boolean z = false;
            if (!fsVar.rje || !(fsVar.tdm instanceof com.bytedance.sdk.openadsdk.activity.single.zmn)) {
                fsVar.fkt.hhw(0);
            }
            kgc kgcVar = this.zmn.yj;
            boolean z2 = kgcVar != null && kgcVar.iqz();
            if (am.hhw(this.zmn.fs) && !z2) {
                z = true;
            }
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.zmn;
            if (fsVar2.hwg != null) {
                if (fsVar2.rt.get() || z) {
                    this.zmn.hwg.fb();
                    com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = this.zmn;
                    fsVar3.hwg.zmn(fsVar3, fsVar3.nps);
                }
            }
        }
    }

    public void rt() {
        kjb kjbVar = this.iv;
        if (kjbVar != null) {
            kjbVar.removeMessages(300);
        }
    }

    public void cn() {
        if (this.zmn.tdm != null || ((!am.fs(this.fs) && !am.zn(this.fs)) || (am.zg(this.fs) && this.zmn.yj.zak() && !this.zmn.yj.so()))) {
            cyb();
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
        if (fsVar == null) {
            return;
        }
        if (fsVar.hwg != null && !fsVar.iv.get()) {
            this.zmn.hwg.zmn();
        }
        this.zmn.fb();
    }

    protected void cyb() {
        int i;
        if (this.zmn.bvs.get() && this.zmn.kgc.getAndSet(false) && ((i = this.zmn.nps) >= 0 || i == -1)) {
            Message obtain = Message.obtain();
            obtain.what = 700;
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
            obtain.arg1 = fsVar.nps;
            fsVar.jy.sendMessage(obtain);
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.zmn;
        if (fsVar2.zg <= 0 || !fsVar2.kw.getAndSet(false)) {
            return;
        }
        Message obtain2 = Message.obtain();
        obtain2.what = POBVastError.UNDEFINED_ERROR;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = this.zmn;
        obtain2.arg1 = fsVar3.zg;
        fsVar3.jy.sendMessage(obtain2);
    }

    public void olo() {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
        if (fsVar == null) {
            return;
        }
        try {
            fsVar.cud = false;
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.zmn;
            boolean z = fsVar2.cud;
            boolean z2 = fsVar2.dgt;
            if (!fsVar2.iv.get()) {
                this.zmn.phc.cyb();
            }
            rt();
            this.zmn.yj.cyb();
            this.zmn.nqi.zg();
            this.zmn.kw.set(true);
            if (this.zmn.bvs.get()) {
                this.zmn.kgc.set(true);
            }
            rt rtVar = this.zmn.hwg;
            if (rtVar != null) {
                rtVar.fs();
            }
            this.zmn.btk();
        } catch (Throwable unused) {
        }
    }

    public void kgc() {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
        if (fsVar == null) {
            return;
        }
        rc rcVar = fsVar.fkt;
        if (rcVar != null) {
            rcVar.olo();
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.zmn;
        boolean z = fsVar2.dgt;
        fsVar2.am.zmn();
        DeviceUtils.nps();
        this.zmn.yj.cn();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = this.zmn;
        if (fsVar3.dgt) {
            fsVar3.nu.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.fs.fs.1
                @Override // java.lang.Runnable
                public void run() {
                    if (fs.this.zmn.am.zmn() > 0) {
                        fs.this.zmn.am.zmn(false);
                    }
                }
            });
        }
    }

    public void kw() {
        fs(false);
    }

    public void fs(boolean z) {
        try {
            bvs bvsVar = this.zmn.uqh;
            if (bvsVar != null && !z) {
                bvsVar.hhw();
            }
            rc rcVar = this.zmn.fkt;
            if (rcVar != null) {
                rcVar.cn();
            }
            this.zmn.phc.fkt();
            if (!fb()) {
                this.zmn.bvs.get();
            }
            kgc kgcVar = this.zmn.yj;
            if (kgcVar != null) {
                kgcVar.rc();
            }
            com.bytedance.sdk.openadsdk.component.reward.zmn.bvs bvsVar2 = this.zmn.nqi;
            if (bvsVar2 != null) {
                bvsVar2.zn(com.bytedance.sdk.openadsdk.component.reward.zmn.bvs.zmn);
            }
            rc rcVar2 = this.zmn.fkt;
            if (rcVar2 != null) {
                rcVar2.mw();
            }
            com.bytedance.sdk.openadsdk.component.reward.zmn.hhw hhwVar = this.zmn.tf;
            if (hhwVar != null) {
                hhwVar.zn();
            }
            rt rtVar = this.zmn.hwg;
            if (rtVar != null) {
                rtVar.zn();
            }
        } catch (Throwable unused) {
        }
    }

    public void iqz() {
        if (!this.zmn.nqi.rc() && com.bytedance.sdk.openadsdk.core.kgc.fb().doe(String.valueOf(this.zmn.hhw)) == 1) {
            int zmn = zmn(this.zmn);
            if (fs(this.zmn)) {
                zn(this.zmn);
            } else if (zmn(this.zmn, zmn)) {
                fb(this.zmn);
            }
        }
    }

    private int zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        if (am.zn(fsVar.fs)) {
            return fsVar.fs.ur();
        }
        if (fsVar.fb) {
            return fsVar.fs.nkw();
        }
        return fsVar.fs.ab();
    }

    private boolean fs(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        rc rcVar = fsVar.fkt;
        return rcVar != null && rcVar.bvs();
    }

    private void zn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        rc rcVar = fsVar.fkt;
        if (rcVar != null && rcVar.iv() != null) {
            fsVar.fkt.iv().performClick();
            return;
        }
        rc rcVar2 = fsVar.fkt;
        if (rcVar2 == null || rcVar2.rc() == null) {
            return;
        }
        fsVar.fkt.rc().performClick();
    }

    private boolean zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, int i) {
        if (i == -1) {
            return false;
        }
        boolean z = !fsVar.bvs.get() || am.zn(fsVar.fs);
        com.bytedance.sdk.openadsdk.component.reward.zmn.olo oloVar = fsVar.phc;
        boolean z2 = oloVar != null && oloVar.rt() >= ((long) i) * 1000;
        com.bytedance.sdk.openadsdk.component.reward.zmn.bvs bvsVar = fsVar.nqi;
        return z && (z2 || (bvsVar != null && bvsVar.fb()));
    }

    private void fb(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        mw mwVar = fsVar.ev;
        if (mwVar != null) {
            mwVar.fb();
        }
    }

    public void phc() {
        this.zmn.ev.zn();
        this.zmn.ev.btk(true);
    }

    public void doe() {
        this.rc = this.zmn.rp.zn();
    }

    public void nqi() {
        if (!btk() && (this instanceof nps)) {
            this.zmn.rp.fs();
            return;
        }
        if (!this.bvs.zmn(this.btk.cn(), false)) {
            this.zmn.phc.rc();
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
            if (fsVar.rje) {
                com.bytedance.sdk.openadsdk.activity.single.zg zgVar = fsVar.tdm;
                if (zgVar instanceof com.bytedance.sdk.openadsdk.activity.single.zmn) {
                    ((com.bytedance.sdk.openadsdk.activity.single.zmn) zgVar).nqi();
                }
            }
            zmn(fs.C0189fs.zmn);
            com.bytedance.sdk.openadsdk.component.reward.zmn.olo oloVar = this.btk;
            oloVar.zmn(!oloVar.nu() ? 1 : 0, 4);
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.zmn;
        nqi nqiVar = fsVar2.fs;
        if (nqiVar == null || fsVar2.hwg == null || !nqiVar.wir()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = this.zmn;
        fsVar3.hwg.zmn(fsVar3, fsVar3.phc.kjb());
    }

    public void zmn(int i) {
        this.btk.iqz();
        zmn(false, true, false, i);
        if (this.zmn.fb) {
            this.bvs.fs(10000);
        }
    }

    public void uqh() {
        zn();
        if (!this.zmn.fs.ch() && rp()) {
            bjh();
        }
        if (rp()) {
            this.zmn.tf.fs();
        }
        if (iqz.fb(this.zmn.fs) || iqz.zg(this.zmn.fs)) {
            this.iv.sendEmptyMessageDelayed(500, 100L);
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
        fsVar.fkt.zmn(fsVar.na == 100.0f);
        doe();
        hhw();
    }

    public final void bjh() {
        if (this.zmn.nu.isFinishing()) {
            return;
        }
        this.zmn.yj.iv();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
        String str = fsVar.fb ? "reward_endcard" : "fullscreen_endcard";
        fsVar.yj.zmn(this.mw, str, fsVar.ww);
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.zmn;
        if (fsVar2.skn) {
            fsVar2.nqi.zmn(fsVar2.dgt);
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = this.zmn;
        fsVar3.yj.zmn(str, fsVar3.ww);
        this.zmn.yj.btk();
    }

    public void zmn(Message message) {
        com.bytedance.sdk.openadsdk.core.model.fb exj;
        rc rcVar;
        iqz iqzVar;
        com.bytedance.sdk.openadsdk.core.rt.fb zmn;
        int i = message.what;
        if (i == 1) {
            phc();
            return;
        }
        if (i == 300) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
            if (fsVar.rje) {
                com.bytedance.sdk.openadsdk.activity.single.zg zgVar = fsVar.tdm;
                if (zgVar instanceof com.bytedance.sdk.openadsdk.activity.single.zmn) {
                    ((com.bytedance.sdk.openadsdk.activity.single.zmn) zgVar).nqi();
                    com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.zmn;
                    iv.zmn(fsVar2.fs, "play_video_time_out", fsVar2.btk, (String) null);
                    exj = this.zmn.fs.exj();
                    if (exj != null && (zmn = exj.zmn()) != null) {
                        zmn.zmn(com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.GENERAL_LINEAR_AD_ERROR);
                    }
                    rcVar = this.zmn.fkt;
                    if (rcVar != null || (iqzVar = rcVar.cyb) == null) {
                        return;
                    }
                    iqzVar.iv();
                    return;
                }
            }
            zmn(fs.C0189fs.fs);
            com.bytedance.sdk.openadsdk.component.reward.zmn.olo oloVar = this.zmn.phc;
            oloVar.zmn(!oloVar.nu() ? 1 : 0, 1 ^ (this.zmn.phc.nu() ? 1 : 0));
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar22 = this.zmn;
            iv.zmn(fsVar22.fs, "play_video_time_out", fsVar22.btk, (String) null);
            exj = this.zmn.fs.exj();
            if (exj != null) {
                zmn.zmn(com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.GENERAL_LINEAR_AD_ERROR);
            }
            rcVar = this.zmn.fkt;
            if (rcVar != null) {
                return;
            } else {
                return;
            }
        }
        if (i == 400) {
            this.zmn.phc.iqz();
            zmn(false, true, false, 3);
            return;
        }
        if (i == 500) {
            if (!am.btk(this.zmn.fs)) {
                this.zmn.ev.zn(false);
            }
            com.bytedance.sdk.component.bvs.nps zg = this.zmn.yj.zg();
            if (zg != null && zg.getWebView() != null) {
                zg.klz();
                zg.getWebView().resumeTimers();
            }
            if (this.zmn.yj.zg() != null) {
                this.zmn.yj.zmn(1.0f);
                this.zmn.fkt.zmn(1.0f);
            }
            if (!this.zmn.fs.bv() && this.zmn.phc.hhw() && this.zmn.cn.get()) {
                this.zmn.phc.iqz();
                return;
            }
            return;
        }
        if (i == 600) {
            mw();
            return;
        }
        if (i == 700) {
            int i2 = message.arg1;
            if (this.zmn.kgc.get()) {
                return;
            }
            if (i2 > 0) {
                this.zmn.ev.fs();
                this.zmn.ev.zmn((CharSequence) ((i2 / 1000) + "s"));
                this.zmn.ev.btk(false);
                Message obtain = Message.obtain();
                obtain.what = 700;
                obtain.arg1 = i2 - 1000;
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = this.zmn;
                fsVar3.nps -= 1000;
                this.iv.sendMessageDelayed(obtain, 1000L);
                return;
            }
            this.iv.removeMessages(700);
            if (am.nps(this.fs)) {
                if (this.zmn.nqi.fs() || !this.zmn.yj.mw()) {
                    mw();
                    return;
                } else {
                    phc();
                    return;
                }
            }
            mw();
            return;
        }
        if (i == 800) {
            if (!am.fs(this.zmn.fs)) {
                this.zmn.ev.zn(false);
            }
            this.zmn.fkt.zmn(1.0f);
            if (!this.zmn.fs.bv() && this.zmn.phc.hhw() && this.zmn.cn.get()) {
                this.zmn.phc.iqz();
                return;
            }
            return;
        }
        if (i == 900 && !this.zmn.kw.get()) {
            int i3 = message.arg1;
            double ww = this.zmn.phc.ww();
            zmn(i3, (long) (1000.0d * ww));
            if (i3 > 0) {
                this.zmn.ev.fs();
                this.zmn.ev.zmn((CharSequence) ((i3 / 1000) + "s"));
                this.zmn.ev.btk(false);
                Message obtain2 = Message.obtain();
                obtain2.what = POBVastError.UNDEFINED_ERROR;
                int i4 = i3 - 1000;
                obtain2.arg1 = i4;
                this.zmn.zg = i4;
                this.iv.sendMessageDelayed(obtain2, 1000L);
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar4 = this.zmn;
                if (fsVar4.rje) {
                    com.bytedance.sdk.openadsdk.activity.single.zg zgVar2 = fsVar4.tdm;
                    if (!(zgVar2 instanceof com.bytedance.sdk.openadsdk.activity.single.zmn) || ww <= 0.0d) {
                        return;
                    }
                    ((com.bytedance.sdk.openadsdk.activity.single.zmn) zgVar2).zmn((float) (1.0d - ((i3 / 1000.0f) / ww)));
                    return;
                }
                return;
            }
            this.iv.removeMessages(POBVastError.UNDEFINED_ERROR);
            mw();
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar5 = this.zmn;
            com.bytedance.sdk.openadsdk.activity.single.zg zgVar3 = fsVar5.tdm;
            if (fsVar5.rje && (zgVar3 instanceof com.bytedance.sdk.openadsdk.activity.single.zmn)) {
                zgVar3.jy().zmn(zgVar3, new fs.btk(5, this.zmn));
            }
        }
    }

    private void zmn(long j, long j2) {
        long j3 = j2 - j;
        Activity activity = this.zmn.nu;
        if (activity instanceof TTRewardVideoActivity) {
            ((TTRewardVideoActivity) activity).zn(j3, j2);
        }
    }

    static void zmn(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        final com.bytedance.sdk.openadsdk.core.hhw.fb fbVar;
        Context context = frameLayout.getContext();
        if (fsVar.lbc) {
            com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
            znVar.setId(olo.klz);
            frameLayout.addView(znVar, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout zmn = zmn(context);
            String str = "";
            if (nqi.btk(fsVar.fs)) {
                com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs mrt = fsVar.fs.mrt();
                if (mrt != null) {
                    str = mrt.iv();
                }
            } else {
                List<com.bytedance.sdk.openadsdk.core.model.kgc> tj = fsVar.fs.tj();
                if (tj != null && !tj.isEmpty()) {
                    str = tj.get(0).zmn();
                }
            }
            if (TextUtils.isEmpty(str)) {
                fbVar = null;
            } else {
                fbVar = new com.bytedance.sdk.openadsdk.core.hhw.fb(context);
                int i = olo.jf;
                fbVar.setId(i);
                fbVar.setTag(i, str);
                fbVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                zmn.addView(fbVar);
            }
            znVar.addView(zmn);
            znVar.addView(new com.bytedance.sdk.openadsdk.core.widget.rc(context), new FrameLayout.LayoutParams(-1, -1));
            View fbVar2 = new com.bytedance.sdk.openadsdk.component.reward.view.fb(context);
            fbVar2.setId(olo.rt);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(fbVar2, layoutParams);
            fbVar2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.fs.fs.2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View findViewById = com.bytedance.sdk.openadsdk.component.reward.zmn.fs.this.hgd.findViewById(520093757);
                    if (findViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View findViewById2 = com.bytedance.sdk.openadsdk.component.reward.zmn.fs.this.hgd.findViewById(olo.ba);
                    if (findViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = findViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View findViewById3 = com.bytedance.sdk.openadsdk.component.reward.zmn.fs.this.hgd.findViewById(olo.hqs);
                    if (findViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = findViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.hhw.fb fbVar3 = fbVar;
                    if (fbVar3 != null) {
                        ViewGroup.LayoutParams layoutParams5 = fbVar3.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            fbVar.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.hhw.btk btkVar = new com.bytedance.sdk.openadsdk.core.hhw.btk(context);
            btkVar.setId(olo.cn);
            btkVar.setOrientation(1);
            btkVar.setVisibility(8);
            frameLayout.addView(btkVar, new FrameLayout.LayoutParams(-1, -1));
        }
        if (fsVar.vlj) {
            View npsVar = new com.bytedance.sdk.component.bvs.nps(context, true, nps.zn.ENDCARD);
            npsVar.setId(olo.cyb);
            npsVar.setLayerType(2, null);
            npsVar.setVisibility(4);
            boolean nps = iqz.nps(fsVar.fs);
            boolean mw = iqz.mw(fsVar.fs);
            if (!fsVar.obg && (nps || mw)) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.topMargin = jy.fs(fsVar.oub, 58.0f);
                frameLayout.addView(npsVar, layoutParams2);
            } else {
                frameLayout.addView(npsVar, new FrameLayout.LayoutParams(-1, -1));
            }
            View frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(olo.olo);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (am.fs(fsVar.fs)) {
                View znVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
                znVar2.setId(olo.qv);
                znVar2.setVisibility(4);
                frameLayout.addView(znVar2, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    protected static FrameLayout zmn(Context context) {
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(context);
        znVar.setId(olo.mw);
        znVar.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        znVar.setLayoutParams(layoutParams);
        return znVar;
    }
}
