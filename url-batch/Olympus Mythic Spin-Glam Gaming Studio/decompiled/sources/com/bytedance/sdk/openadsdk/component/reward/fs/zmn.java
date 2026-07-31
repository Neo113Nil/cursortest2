package com.bytedance.sdk.openadsdk.component.reward.fs;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.component.reward.view.rc;
import com.bytedance.sdk.openadsdk.component.reward.zmn.kgc;
import com.bytedance.sdk.openadsdk.component.reward.zmn.mw;
import com.bytedance.sdk.openadsdk.component.reward.zmn.olo;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* loaded from: classes6.dex */
public class zmn {
    protected final olo btk;
    protected com.bytedance.sdk.openadsdk.core.cn.fb.fs bvs;
    protected int fb;
    protected nqi fs;
    protected final rc hhw;
    protected kjb iv;
    protected final kgc nps;
    protected final mw zg;
    protected com.bytedance.sdk.openadsdk.component.reward.zmn.fs zmn;
    protected int zn;

    public zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        this.zmn = fsVar;
        this.fs = fsVar.fs;
        this.zn = fsVar.mhu;
        this.fb = fsVar.bxw;
        this.btk = fsVar.phc;
        this.hhw = fsVar.fkt;
        this.nps = fsVar.yj;
        this.zg = fsVar.ev;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.cn.fb.fs fsVar, kjb kjbVar) {
        this.bvs = fsVar;
        this.iv = kjbVar;
    }

    public boolean zmn() {
        return this.zmn.fs.ch() || this.zmn.fs.zq() == 15 || this.zmn.fs.zq() == 5 || this.zmn.fs.zq() == 50;
    }

    public void zmn(boolean z) {
        if (this.zmn.bvs.get()) {
            return;
        }
        nqi nqiVar = this.fs;
        if (nqiVar != null && nqiVar.wir()) {
            this.zg.zn(false);
            this.zg.zmn(true);
            this.zmn.fkt.fs(8);
            this.zmn.fkt.fb(8);
            return;
        }
        if (!z) {
            this.zg.zn(false);
            this.zg.zmn(false);
            this.zg.fb(false);
            this.zmn.fkt.hhw(8);
        } else {
            this.zg.zmn(this.zmn.fs.bn());
            if (zmn()) {
                this.zg.zn(true);
            }
            if (zmn() || ((this instanceof nps) && this.zmn.fs.hhw())) {
                this.zg.fb(true);
            } else {
                this.zg.btk();
                this.zmn.fkt.hhw(0);
            }
        }
        if (z) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
            if (fsVar.na != com.bytedance.sdk.openadsdk.component.reward.view.zn.zmn) {
                fsVar.fkt.fs(8);
                this.zmn.fkt.fb(8);
                return;
            } else {
                fsVar.fkt.fs(0);
                this.zmn.fkt.zn(0);
                this.zmn.fkt.fb(0);
                return;
            }
        }
        this.zmn.fkt.fs(4);
        this.zmn.fkt.zn(8);
        this.zmn.fkt.fb(8);
    }

    public boolean fs() {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
        boolean z = fsVar.tdm == null;
        boolean nps = fsVar.phc.nps();
        boolean z2 = iqz.zn(this.zmn.fs) || !nqi.btk(this.zmn.fs);
        if (z && nps && z2) {
            return false;
        }
        boolean fs = iqz.fs(this.zmn.fs);
        boolean z3 = this.zmn.cyb.get();
        if (fs && z3) {
            FrameLayout hhw = this.zmn.fkt.hhw();
            hhw.setVisibility(4);
            hhw.setVisibility(0);
            return false;
        }
        boolean z4 = this.zmn.bvs.get();
        boolean z5 = this.zmn.iv.get();
        if (z4 || z5) {
            return false;
        }
        return this.zmn.phc.bvs() || this.zmn.phc.so();
    }

    protected void zn() {
        if (am.fs(this.zmn.fs) && DeviceUtils.nps() == 0) {
            this.zmn.dgt = true;
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.zmn;
        fsVar.ev.fs(fsVar.dgt);
    }
}
