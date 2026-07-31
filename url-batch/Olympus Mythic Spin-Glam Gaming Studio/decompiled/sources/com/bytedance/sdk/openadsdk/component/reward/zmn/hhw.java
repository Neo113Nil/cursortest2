package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.fkt;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.fb.fs;
import com.bytedance.sdk.openadsdk.utils.uqh;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class hhw {
    private final com.bytedance.sdk.openadsdk.component.reward.view.nps fs;
    private final fs zmn;
    private zmn zn;

    public interface zmn {
        void zmn(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar, int i);
    }

    private boolean zmn(int i) {
        return i < 0 || i > 20000;
    }

    public hhw(fs fsVar) {
        this.zmn = fsVar;
        this.fs = new com.bytedance.sdk.openadsdk.component.reward.view.nps(fsVar);
    }

    public void zmn() {
        this.fs.zmn();
    }

    public void fs() {
        this.fs.zn();
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.zn.btk btkVar) {
        this.fs.zmn(btkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x012f, code lost:
    
        if (r1.nu() == false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zmn(boolean z, boolean z2, boolean z3, com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar, int i) {
        if (this.zmn != null) {
            com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn("videoForceBreak", this.zmn.fs);
            com.bytedance.sdk.openadsdk.bjh.zmn.zn.fs(this.zmn.fs);
        }
        Objects.toString(fsVar);
        if (this.zmn.nu.isFinishing() || fsVar == null) {
            return;
        }
        this.zmn.fkt.mw();
        if (z2) {
            this.zmn.klz.set(true);
        }
        fs fsVar2 = this.zmn;
        if (fsVar2.lbc && !fsVar2.mw.get() && !iqz.rt(this.zmn.fs) && !iqz.klz(this.zmn.fs) && (!iqz.fs(this.zmn.fs) || !this.zmn.klz.get() || !this.zmn.rt.get())) {
            if ((iqz.fs(this.zmn.fs) && z3) || !fs(z2)) {
                return;
            }
            if (iqz.fs(this.zmn.fs) || iqz.fb(this.zmn.fs) || iqz.zg(this.zmn.fs)) {
                this.zmn.ev.zn(false);
                fsVar.mw();
                return;
            }
        }
        if (this.zmn.nu.isDestroyed() || this.zmn.nu.isFinishing()) {
            return;
        }
        if (this.zmn.fs.wir()) {
            com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar = this.zmn.uqh;
            com.bytedance.sdk.openadsdk.core.iv.zn brandBannerController = (bvsVar == null || bvsVar.zmn() == null) ? null : bvsVar.zmn().getBrandBannerController();
            if (brandBannerController != null) {
                brandBannerController.fs();
            }
            this.zmn.nu.finish();
            return;
        }
        zmn zmnVar = this.zn;
        if (zmnVar != null) {
            zmnVar.zmn(z, z2, z3, fsVar, i);
            return;
        }
        this.zmn.phc.iqz();
        this.zmn.yj.doe();
        this.zmn.iv.set(false);
        fs fsVar3 = this.zmn;
        if (fsVar3.zi) {
            com.bytedance.sdk.openadsdk.activity.single.zg zgVar = fsVar3.tdm;
            if (zgVar instanceof com.bytedance.sdk.openadsdk.activity.single.btk) {
            }
        }
        this.zmn.rc.set(false);
        this.zmn.zak.zmn();
        fs fsVar4 = this.zmn;
        fsVar4.ev.zmn(fsVar4.fs.bn());
        if (this.zmn.bvs.getAndSet(true)) {
            return;
        }
        if (am.fs(this.zmn.fs) && this.zmn.skn) {
            zmn(z, z2, z3, i);
            this.zmn.fkt.fb(8);
            this.zmn.ev.zn(true);
            this.zmn.nqi.iv();
            com.bytedance.sdk.openadsdk.core.cn.zn().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.hhw.1
                @Override // java.lang.Runnable
                public void run() {
                    hhw.this.zmn.fkt.zn();
                    if (hhw.this.zmn.uqh != null) {
                        hhw.this.zmn.uqh.hhw();
                    }
                }
            });
            return;
        }
        zmn(z, fsVar);
    }

    private void zmn(boolean z, boolean z2, boolean z3, int i) {
        int i2;
        HashMap hashMap = new HashMap();
        if (this.zmn.yj.kjb()) {
            i2 = 1;
        } else {
            i2 = !this.zmn.yj.rt() ? -1 : 2;
        }
        hashMap.put("webview_state", Integer.valueOf(i2));
        fs fsVar = this.zmn;
        com.bytedance.sdk.openadsdk.fb.zn.zmn(fsVar.fs, fsVar.btk, z, z2, z3, fsVar.nu.isFinishing(), i, hashMap);
    }

    public void zmn(boolean z, com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar) {
        rt rtVar;
        this.zmn.cn.set(z);
        fsVar.klz();
        this.zmn.fs.ch();
        this.zmn.ev.fb(false);
        this.zmn.ev.zn(false);
        this.zmn.yj.nqi();
        iqz iqzVar = this.zmn.fkt.cyb;
        if (iqzVar != null) {
            iqzVar.btk();
        }
        this.zmn.fkt.zn();
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar = this.zmn.uqh;
        if (bvsVar != null) {
            bvsVar.hhw();
        }
        bvs bvsVar2 = this.zmn.nqi;
        if (bvsVar2 != null) {
            bvsVar2.zn(bvs.fs);
        }
        fs fsVar2 = this.zmn;
        if (!TextUtils.isEmpty(nqi.zmn(fsVar2.oub, fsVar2.fs))) {
            fs fsVar3 = this.zmn;
            uqh.zmn(fsVar3.nu, am.klz(fsVar3.fs), this.zmn.fs, fs.zmn.zn, true);
            return;
        }
        if (nqi.zn(this.zmn.fs) && (rtVar = this.zmn.so) != null) {
            rtVar.hhw();
        }
        if (!nqi.zmn(this.zmn.fs) && (nqi.zn(this.zmn.fs) || !this.zmn.yj.am())) {
            fs fsVar4 = this.zmn;
            if (nqi.zmn(fsVar4.fs, fsVar4.yj.kjb(), this.zmn.yj.ev(), this.zmn.so.klz(), this.zmn.yj.uqh())) {
                if (!nqi.fb(this.zmn.fs) && !nqi.zn(this.zmn.fs)) {
                    this.zmn.yj.zmn(true, 0, (String) null);
                }
                fs(fsVar);
                zmn(fsVar);
                return;
            }
        }
        fb();
    }

    void zmn(com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar) {
        if (!nqi.zn(this.zmn.fs)) {
            this.zmn.so.zmn(8);
            this.zmn.yj.zmn(0);
            this.zmn.yj.yj();
        } else {
            this.zmn.yj.zmn(8);
            this.zmn.so.zmn(0);
            this.zmn.so.nps();
        }
        this.zmn.fkt.fb(8);
        this.zmn.fkt.nps();
        if (nqi.zn(this.zmn.fs)) {
            this.zmn.jy.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        fs fsVar2 = this.zmn;
        fsVar2.yj.zmn(fsVar2.dgt, true);
        this.zmn.yj.zn(true);
        this.zmn.yj.fs(true);
        fkt bvs = this.zmn.yj.bvs();
        if (bvs != null) {
            bvs.zmn("prerender_page_show", (JSONObject) null);
        }
        if (!am.fs(this.zmn.fs)) {
            this.zmn.ev.zn(false);
        }
        com.bytedance.sdk.component.bvs.nps zg = this.zmn.yj.zg();
        if (zg == null || zg.getWebView() == null) {
            return;
        }
        zg.klz();
        zg.getWebView().resumeTimers();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.model.am.nps(r5.zmn.fs) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean fs(com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar) {
        boolean z;
        this.zmn.nps = hhw();
        fs fsVar2 = this.zmn;
        int i = fsVar2.nps;
        if (fsVar2.fs.iqz()) {
            return false;
        }
        fs fsVar3 = this.zmn;
        int i2 = fsVar3.nps;
        if (i2 != -1) {
            if (i2 >= 0) {
                fsVar3.kgc.set(false);
                Message obtain = Message.obtain();
                obtain.what = 700;
                fs fsVar4 = this.zmn;
                obtain.arg1 = fsVar4.nps;
                fsVar4.jy.sendMessage(obtain);
            }
            z = false;
        } else if (fsVar3.tdm == null && am.zg(fsVar3.fs) && this.zmn.yj.mw()) {
            fsVar.phc();
            z = false;
        } else {
            fsVar.mw();
            z = true;
        }
        if (this.zmn.yj.iqz() ? false : z) {
            fs fsVar5 = this.zmn;
            if (fsVar5.hwg == null || !fsVar5.nps()) {
                return true;
            }
            fs fsVar6 = this.zmn;
            fsVar6.hwg.zmn(fsVar6, fsVar6.nps);
        }
        return true;
    }

    private int fs(int i) {
        if (i <= 1000) {
            return 1000;
        }
        return (i / 1000) * 1000;
    }

    private int hhw() {
        nqi nqiVar;
        fs fsVar = this.zmn;
        if (fsVar != null && (nqiVar = fsVar.fs) != null) {
            int hzy = nqiVar.hzy();
            if (com.bytedance.sdk.openadsdk.core.kgc.fb() == null) {
                return -1;
            }
            int zmn2 = com.bytedance.sdk.openadsdk.core.kgc.fb().zmn(this.zmn.fs.qvo());
            if (!zmn(hzy) && !zmn(zmn2)) {
                return Math.min(fs(hzy), fs(zmn2));
            }
        }
        return -1;
    }

    public void zn() {
        this.fs.fb();
    }

    public void fb() {
        zmn(true);
    }

    public void zmn(boolean z) {
        if (!nqi.fb(this.zmn.fs)) {
            this.zmn.yj.zmn(false, 408, "end_card_timeout");
        }
        this.zmn.yj.fs(com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.zn.zmn() ? 1 : 0);
        this.zmn.yj.zmn(8);
        this.zmn.so.zmn(8);
        this.zmn.fkt.fb(8);
        if (this.zmn.fs.ch()) {
            if (!this.fs.zmn(this.zmn.phc)) {
                this.zmn.nu.finish();
            }
        } else {
            com.bytedance.sdk.openadsdk.activity.single.zg zgVar = this.zmn.tdm;
            if (zgVar != null) {
                this.fs.zmn(zgVar.jy().iv());
            }
            this.fs.fs();
        }
        this.zmn.fkt.nps();
        if (z) {
            fs(this.zmn.f3739io);
        }
        this.zmn.ev.zn(false);
        fs fsVar = this.zmn;
        fsVar.rp.zmn(fsVar.fs.bv());
    }

    public void zmn(zmn zmnVar) {
        this.zn = zmnVar;
    }

    public boolean btk() {
        return this.fs.btk();
    }

    private boolean fs(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.view.zn zmn2;
        if (!iqz.zn(this.zmn.fs) || (zmn2 = this.zmn.uqh.zmn()) == null || zmn2.fb != 0 || z) {
            return true;
        }
        this.zmn.ev.zn(false);
        return false;
    }
}
