package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.fs;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.model.uqh;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.bytedance.sdk.openadsdk.utils.bvs;
import com.bytedance.sdk.openadsdk.utils.cn;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.rt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class bvs extends zn {
    private com.bytedance.sdk.openadsdk.cn.zmn bvs;
    private btk cn;
    private zg cyb;
    public rt hhw;
    private com.bytedance.sdk.openadsdk.core.hhw.zn iv;
    private boolean kgc;
    private com.bytedance.sdk.openadsdk.core.hhw.zg klz;
    private fs.AbstractC0143fs mw;
    private final List<zg> nps;
    private int olo;
    private com.bytedance.sdk.openadsdk.core.hhw.zn rc;
    private int rt;
    private com.bytedance.sdk.openadsdk.component.reward.top.zn zg;

    public bvs(Activity activity, nqi nqiVar, fs fsVar) {
        super(activity, nqiVar, fsVar);
        this.nps = new ArrayList();
        this.kgc = false;
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(activity);
        this.iv = znVar;
        if (Build.VERSION.SDK_INT >= 35) {
            znVar.setFitsSystemWindows(true);
        }
        activity.setContentView(this.iv);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn() {
        super.zmn();
        phc();
    }

    private void phc() {
        boolean cn = rc.fs().cn(String.valueOf(this.fs.qvo()));
        int fs = this.fb.hhw() ? fs(0, cn) : 0;
        if (this.nps.isEmpty() && !am.zn(this.fs)) {
            int i = fs + 1;
            this.nps.add(zmn(this.fb, this.fs, fs, i, true));
            fs = i;
        }
        zmn(fs, cn);
    }

    private static zg zmn(fs fsVar, nqi nqiVar, int i, int i2, boolean z) {
        boolean bv = nqiVar.bv();
        AdSlot utx = nqiVar.utx();
        if (utx != null) {
            bv = utx.getDurationSlotType() == 7;
        }
        if (bv) {
            return new nps(fsVar, nqiVar, i, i2, z);
        }
        return new hhw(fsVar, nqiVar, i, i2, z);
    }

    private void zmn(int i, boolean z) {
        if (rt() == null && this.fb.hhw()) {
            doe();
        }
    }

    private int fs(int i, boolean z) {
        List<nqi> list;
        boolean z2;
        int i2;
        int i3;
        nqi nqiVar;
        int i4;
        List<nqi> tl = this.fs.tl();
        if (tl.isEmpty()) {
            return i;
        }
        int size = tl.size();
        this.rt = size;
        int i5 = i;
        int i6 = 0;
        while (i6 < size) {
            boolean z3 = i6 == size + (-1);
            nqi nqiVar2 = tl.get(i6);
            if (nqiVar2 != null) {
                nqiVar2.nu(this.btk);
            }
            if (am.fs(nqiVar2)) {
                if (am.zn(nqiVar2)) {
                    this.nps.add(new btk(this.fb, nqiVar2, i5, i6, true, z3, false));
                    i3 = size;
                    nqiVar = nqiVar2;
                    z2 = z3;
                    i4 = i5 + 1;
                    list = tl;
                    i2 = i6;
                } else {
                    this.nps.add(zmn(this.fb, nqiVar2, i5, i6, z3));
                    z2 = z3;
                    list = tl;
                    i2 = i6;
                    this.nps.add(new btk(this.fb, nqiVar2, i5 + 1, i6, true, z3, false));
                    i3 = size;
                    i4 = i5 + 2;
                    nqiVar = nqiVar2;
                }
            } else {
                list = tl;
                z2 = z3;
                i2 = i6;
                if (iqz.hhw(nqiVar2)) {
                    this.nps.add(zmn(this.fb, nqiVar2, i5, i2, z2));
                    i3 = size;
                    i4 = i5 + 1;
                    nqiVar = nqiVar2;
                } else if (iqz.nps(nqiVar2)) {
                    this.nps.add(zmn(this.fb, nqiVar2, i5, i2, z2));
                    i3 = size;
                    nqiVar = nqiVar2;
                    this.nps.add(new btk(this.fb, nqiVar2, i5 + 1, i2, false, z2, false));
                    i4 = i5 + 2;
                } else {
                    i3 = size;
                    nqiVar = nqiVar2;
                    this.nps.add(zmn(this.fb, nqiVar, i5, i2, z2));
                    i4 = i5 + 1;
                }
            }
            if (z) {
                boolean zmn = this.fb.zmn(nqiVar);
                if (!z2) {
                    if (this.fb.btk() && zmn) {
                        this.nps.add(new btk(this.fb, nqiVar, i4, i2, false, z2, false));
                        i5 = i4 + 1;
                    }
                } else {
                    if (this.fb.fb() && zmn && !am.fs(nqiVar)) {
                        this.nps.add(new btk(this.fb, nqiVar, i4, i2, false, z2, false));
                        i4++;
                    }
                    if (!TextUtils.isEmpty(nqiVar.zg())) {
                        btk btkVar = new btk(this.fb, nqiVar, i4, i2, false, z2, true);
                        this.cn = btkVar;
                        this.nps.add(btkVar);
                        i5 = i4 + 1;
                    }
                }
                i6 = i2 + 1;
                tl = list;
                size = i3;
            }
            i5 = i4;
            i6 = i2 + 1;
            tl = list;
            size = i3;
        }
        return i5;
    }

    private void doe() {
        rt zmn = com.bytedance.sdk.openadsdk.utils.bvs.zmn(this.zmn, new bvs.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.bvs.1
            @Override // com.bytedance.sdk.openadsdk.utils.bvs.zmn
            public View zmn() {
                if (bvs.this.zg != null) {
                    return bvs.this.zg.getCloseBackupButton();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.utils.bvs.zmn
            public void fs() {
                if (bvs.this.zg != null) {
                    bvs.this.zg.setSkipInvisiable();
                }
            }
        });
        this.hhw = zmn;
        zmn.zmn(new cn() { // from class: com.bytedance.sdk.openadsdk.activity.single.bvs.2
            @Override // com.bytedance.sdk.openadsdk.utils.cn
            public void zmn() {
                com.bytedance.sdk.openadsdk.component.fb.fs.zmn("force_button_tracker", "show", bvs.this.fs);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(Bundle bundle) {
        super.zmn(bundle);
        this.rc = new com.bytedance.sdk.openadsdk.core.hhw.zn(this.zmn);
        this.iv.addView(this.rc, new FrameLayout.LayoutParams(-1, -1));
        this.bvs = new com.bytedance.sdk.openadsdk.cn.zmn(this.zmn);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, jy.fs(this.zmn, 2.0f));
        layoutParams.gravity = 80;
        this.iv.addView(this.bvs, layoutParams);
        com.bytedance.sdk.openadsdk.core.hhw.zg zgVar = new com.bytedance.sdk.openadsdk.core.hhw.zg(this.zmn);
        this.klz = zgVar;
        zgVar.setTextColor(-1);
        this.klz.setTextSize(15.0f);
        this.klz.setShadowLayer(1.0f, 0.0f, 1.0f, -16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = jy.fs(this.zmn, 60.0f);
        layoutParams2.rightMargin = jy.fs(this.zmn, 16.0f);
        layoutParams2.gravity = 8388661;
        this.iv.addView(this.klz, layoutParams2);
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar = new com.bytedance.sdk.openadsdk.component.reward.top.zn(this.zmn);
        this.zg = znVar;
        this.iv.addView(znVar, new FrameLayout.LayoutParams(-1, -2));
        this.zg.zmn(this.fs);
        this.zg.setShowDislike(true);
        zmn(null, null, new fs.btk(1, null));
        com.bytedance.sdk.openadsdk.nqi.zmn.zmn.zmn(this.zmn, this.iv, com.bytedance.sdk.openadsdk.nqi.zmn.zmn.zmn(this.fs.wbj()));
    }

    public int iqz() {
        zg zgVar = this.cyb;
        if (zgVar != null) {
            return zgVar.iv;
        }
        return -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(zg zgVar, zg zgVar2, fs.btk btkVar) {
        zg zgVar3 = this.cyb;
        if ((zgVar3 == null || zgVar3 == zgVar) && !com.bytedance.sdk.component.utils.fs.zmn(this.zmn)) {
            iqz();
            if (zgVar2 == null) {
                zg zgVar4 = this.cyb;
                int i = zgVar4 != null ? zgVar4.iv + 1 : 0;
                if (i < this.nps.size()) {
                    zgVar2 = this.nps.get(i);
                }
                if (zgVar2 == null) {
                    this.fb.nps();
                    return;
                }
            }
            zg zgVar5 = this.cyb;
            if (zgVar5 != null) {
                if (zgVar5 == zgVar2) {
                    return;
                }
                zgVar5.rt();
                this.cyb.fb();
                com.bytedance.sdk.openadsdk.component.reward.view.zg zmn = this.cyb.zmn();
                if (zmn != null) {
                    this.rc.removeView(zmn);
                }
                this.cyb.kw();
                this.cyb.klz = false;
                if (this.fb.btk()) {
                    zg zgVar6 = this.cyb;
                    if (zgVar6 instanceof zmn) {
                        int i2 = zgVar6.iv + 1;
                        zg zgVar7 = i2 < this.nps.size() ? this.nps.get(i2) : null;
                        if ((zgVar7 instanceof btk) && zgVar7 != zgVar2) {
                            com.bytedance.sdk.openadsdk.component.reward.view.zg zmn2 = zgVar7.zmn();
                            if (zmn2 != null && zmn2.getParent() != null && (zmn2.getParent() instanceof ViewGroup)) {
                                ((ViewGroup) zmn2.getParent()).removeView(zmn2);
                            }
                            zgVar7.kw();
                        }
                    }
                }
            }
            if (com.bytedance.sdk.component.utils.fs.zmn(this.zmn)) {
                return;
            }
            zgVar2.klz = true;
            zg zgVar8 = this.cyb;
            this.cyb = zgVar2;
            fs(zgVar8, zgVar2, btkVar);
            zgVar2.fs(this.zmn, btkVar);
            com.bytedance.sdk.openadsdk.component.reward.view.zg zmn3 = zgVar2.zmn();
            if (zmn3 != null) {
                ViewParent parent = zmn3.getParent();
                if (parent != null) {
                    if (parent == this.rc) {
                        zmn3.setVisibility(0);
                    } else if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(zmn3);
                    }
                }
                if (zmn3.getParent() == null) {
                    this.rc.addView(zmn3, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            for (int i3 = zgVar8 != null ? zgVar8.iv : 0; i3 < this.nps.size(); i3++) {
                this.nps.get(i3).zmn(zgVar8, this.cyb, btkVar);
            }
            this.fb.fs(this.cyb);
        }
    }

    private void fs(zg zgVar, zg zgVar2, fs.btk btkVar) {
        rt rtVar;
        nqi nqiVar;
        if (this.mw == null) {
            if (zgVar2 != null && zgVar2.c_()) {
                this.mw = new fs.fb(this.fb, this.fs, this.zg);
            } else {
                this.mw = new fs.zmn(this.fb, this.fs, this.zg);
            }
        }
        this.mw.fs();
        int fs = fs(zgVar2);
        boolean z = zgVar2 instanceof btk;
        if (z && !((btk) zgVar2).zmn && !zgVar2.cyb && (nqiVar = zgVar2.hhw) != null && nqiVar.xy()) {
            this.mw.fb();
        } else {
            this.mw.zmn(fs, zgVar2.hhw);
            boolean z2 = zgVar2 instanceof btk;
            if (z2 && ((btk) zgVar2).zmn) {
                fb(zgVar);
            } else if (zgVar2.hhw.nlo()) {
                boolean z3 = false;
                boolean z4 = (zgVar2 instanceof zmn) && iqz.hhw(zgVar2.hhw);
                if (z2 && (zgVar2.cyb || iqz.nps(zgVar2.hhw))) {
                    z3 = true;
                }
                if (z4 || z3) {
                    this.mw.zmn(zgVar2);
                }
            } else if (zgVar2.cyb) {
                this.mw.zmn(zgVar2.hhw, zgVar2.olo);
            } else if (z2) {
                this.mw.zn(zgVar2.hhw.xcf().fb());
            }
        }
        if (z && (rtVar = this.hhw) != null && zgVar == null) {
            rtVar.zmn(zgVar2.bvs, fs * 1000);
        }
        if (zgVar2 instanceof zmn) {
            this.olo++;
            zmn(0.0f);
            if (iqz.hhw(zgVar2.hhw)) {
                this.klz.setVisibility(8);
                return;
            } else {
                zn(zgVar2);
                return;
            }
        }
        if (z) {
            if (((btk) zgVar2).zmn) {
                this.klz.setVisibility(8);
                return;
            }
            if (zgVar2.cyb && am.zn(zgVar2.hhw)) {
                this.olo++;
            }
            if (zgVar2.cyb || iqz.nps(zgVar2.hhw)) {
                this.klz.setVisibility(8);
            } else {
                zn(zgVar2);
            }
        }
    }

    private int fs(zg zgVar) {
        nqi nqiVar;
        int i = 0;
        for (int i2 = zgVar.iv; i2 < this.nps.size(); i2++) {
            zg zgVar2 = this.nps.get(i2);
            if ((zgVar2 instanceof btk) && ((btk) zgVar2).zmn) {
                break;
            }
            boolean z = zgVar2.cyb;
            boolean nps = iqz.nps(zgVar2.hhw);
            boolean hhw = iqz.hhw(zgVar2.hhw);
            uqh zmn = zgVar2.hhw.zmn();
            int zn = zmn != null ? zmn.zn() : 10;
            if (zgVar2 instanceof zmn) {
                if (!hhw) {
                    com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs mrt = zgVar2.hhw.mrt();
                    i = mrt != null ? (int) (i + mrt.hhw()) : (int) (i + 10);
                }
                i += zn;
            } else {
                if (zgVar2 instanceof btk) {
                    if (!nps) {
                        if (z) {
                            if (!zgVar2.hhw.nlo()) {
                                i += am.phc(zgVar2.hhw) + am.bjh(zgVar2.hhw);
                            }
                        } else if (this.fb.btk() && (nqiVar = zgVar2.hhw) != null && !nqiVar.xy()) {
                            i += zgVar2.hhw.xcf().fb();
                        }
                    }
                    i += zn;
                }
            }
        }
        return i;
    }

    private void zn(zg zgVar) {
        try {
            this.klz.setText(this.zmn.getString(doe.fs(kgc.zmn(), "tt_multiple_ad_indicator"), Integer.valueOf(zgVar.rc + 1), Integer.valueOf(this.rt)));
            this.klz.setVisibility(0);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zmn("SeqSwitchLayoutManager", "updateCurrentAdIndex: ", th);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(int i, int i2) {
        super.zmn(i, i2);
        if (i >= 0) {
            if (TextUtils.isEmpty(this.zn)) {
                this.klz.setText(this.zmn.getString(doe.fs(kgc.zmn(), "tt_multiple_playable_wait_tips"), Integer.valueOf(i)));
            } else {
                this.klz.setText(String.format(this.zn, Integer.valueOf(i)));
            }
            this.klz.setVisibility(0);
            return;
        }
        this.klz.setVisibility(8);
    }

    private void fb(zg zgVar) {
        com.bytedance.sdk.openadsdk.cn.zmn zmnVar = this.bvs;
        if (zmnVar != null) {
            jy.nps(zmnVar);
            this.bvs = null;
        }
        com.bytedance.sdk.openadsdk.component.reward.top.zn znVar = this.zg;
        if (znVar != null) {
            jy.nps(znVar);
            jy.nps(this.zg.getITopLayout());
            this.zg = null;
        }
        fs.AbstractC0143fs abstractC0143fs = this.mw;
        if (abstractC0143fs != null) {
            abstractC0143fs.zn();
        }
        if (zgVar instanceof nps) {
            ((nps) zgVar).kra();
        }
        rt rtVar = this.hhw;
        if (rtVar != null) {
            rtVar.zn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void fs() {
        super.fs();
        zg zgVar = this.cyb;
        if (zgVar != null) {
            zgVar.zn();
        }
        fs.AbstractC0143fs abstractC0143fs = this.mw;
        if (abstractC0143fs != null) {
            abstractC0143fs.fs(-1);
        }
        rt rtVar = this.hhw;
        if (rtVar != null) {
            rtVar.zmn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zn() {
        super.zn();
        zg zgVar = this.cyb;
        if (zgVar != null) {
            zgVar.rt();
        }
        fs.AbstractC0143fs abstractC0143fs = this.mw;
        if (abstractC0143fs != null) {
            abstractC0143fs.zmn(-1);
        }
        rt rtVar = this.hhw;
        if (rtVar != null) {
            rtVar.fs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(Activity activity) {
        super.zmn(activity);
        zg zgVar = this.cyb;
        if (zgVar != null) {
            zgVar.fs(activity);
        }
        int iqz = iqz();
        for (zg zgVar2 : this.nps) {
            if (zgVar2.iv >= iqz) {
                zgVar2.kw();
            }
        }
        fs.AbstractC0143fs abstractC0143fs = this.mw;
        if (abstractC0143fs != null) {
            abstractC0143fs.zn();
        }
        rt rtVar = this.hhw;
        if (rtVar != null) {
            rtVar.zn();
        }
        zg zgVar3 = this.cyb;
        if (zgVar3 != null && !zgVar3.doe() && !this.fs.dbc()) {
            com.bytedance.sdk.openadsdk.core.cn.fs().post(new fs.zn(this.fs));
        }
        this.cyb = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public btk rt() {
        btk btkVar = this.cn;
        if (btkVar != null) {
            return btkVar;
        }
        zg zgVar = this.cyb;
        int i = zgVar != null ? zgVar.iv : -1;
        int size = this.nps.size() - 1;
        while (true) {
            if (size <= i) {
                break;
            }
            zg zgVar2 = this.nps.get(size);
            if (zgVar2 instanceof btk) {
                btk btkVar2 = (btk) zgVar2;
                if (btkVar2.zmn) {
                    this.cn = btkVar2;
                    break;
                }
            }
            size--;
        }
        return this.cn;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public zg mw() {
        zg zgVar = this.cyb;
        if (zgVar == null) {
            return null;
        }
        int i = zgVar.iv;
        while (true) {
            i++;
            if (i >= this.nps.size()) {
                return null;
            }
            zg zgVar2 = this.nps.get(i);
            if (zgVar2 instanceof zmn) {
                return zgVar2;
            }
            if ((zgVar2 instanceof btk) && am.zn(zgVar2.hhw) && zgVar2.cyb) {
                return zgVar2;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(float f) {
        com.bytedance.sdk.openadsdk.cn.zmn zmnVar = this.bvs;
        if (zmnVar == null) {
            return;
        }
        zmnVar.setProgress(f);
        if (f == 0.0f && this.bvs.getVisibility() == 0) {
            this.bvs.setVisibility(4);
        } else {
            if (f <= 0.0f || this.bvs.getVisibility() == 0) {
                return;
            }
            this.bvs.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public com.bytedance.sdk.openadsdk.component.reward.top.zn klz() {
        return this.zg;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public int zg() {
        fs.AbstractC0143fs abstractC0143fs = this.mw;
        if (abstractC0143fs != null) {
            return abstractC0143fs.zmn();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(int i) {
        fs.AbstractC0143fs abstractC0143fs = this.mw;
        if (abstractC0143fs != null) {
            if (i == 2) {
                abstractC0143fs.zmn(2);
            } else if (i == 1) {
                abstractC0143fs.fs(1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void fs(zg zgVar, int i) {
        fs.AbstractC0143fs abstractC0143fs = this.mw;
        if (abstractC0143fs == null) {
            return;
        }
        if (i == 2) {
            abstractC0143fs.zmn(i);
            rt rtVar = this.hhw;
            if (rtVar != null) {
                rtVar.fs();
                return;
            }
            return;
        }
        if (i == 1) {
            abstractC0143fs.fs(i);
            rt rtVar2 = this.hhw;
            if (rtVar2 != null) {
                rtVar2.zmn();
                return;
            }
            return;
        }
        if (i == 3 || i == 4) {
            try {
                this.cyb.uqh().phc.ev();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zn("SeqSwitchLayoutManager", th);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(zg zgVar, fs.btk btkVar) {
        zg zgVar2 = this.cyb;
        if (zgVar2 == null || zgVar2 == zgVar) {
            if (zgVar2 != null && (zgVar2 instanceof zmn)) {
                final long rt = (zgVar2.uqh() == null || this.cyb.uqh().phc == null) ? 0L : this.cyb.uqh().phc.rt();
                final int i = this.cyb.rc + 1;
                long currentTimeMillis = System.currentTimeMillis();
                zg zgVar3 = this.cyb;
                com.bytedance.sdk.openadsdk.fb.zn.zmn(currentTimeMillis, zgVar3.hhw, zgVar3.d_(), "dislike_skip", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.bvs.3
                    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                    public JSONObject fs() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(IronSourceConstants.EVENTS_DURATION, rt);
                        } catch (Throwable unused) {
                        }
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                    public JSONObject zmn() {
                        return com.bytedance.sdk.openadsdk.fb.zn.zmn(i);
                    }
                });
            }
            zg mw = mw();
            if (mw == null) {
                mw = rt();
            }
            zmn(this.cyb, mw, btkVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(zg zgVar, boolean z, boolean z2, boolean z3, int i) {
        btk rt;
        zg zgVar2 = this.cyb;
        if ((zgVar2 == null || zgVar2 == zgVar) && (rt = rt()) != null) {
            fs.btk btkVar = new fs.btk(i, zgVar != null ? zgVar.uqh() : null);
            btkVar.zmn.putBoolean("isSkip", z);
            btkVar.zmn.putBoolean("force", z2);
            btkVar.zmn.putBoolean("isFromLandingPage", z3);
            zmn(this.cyb, rt, btkVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public boolean fb() {
        if (this.nps.isEmpty()) {
            return false;
        }
        List<zg> list = this.nps;
        zg zgVar = list.get(list.size() - 1);
        return (zgVar instanceof btk) && ((btk) zgVar).zmn;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(zmn zmnVar, boolean z) {
        fs.AbstractC0143fs abstractC0143fs;
        super.zmn(zmnVar, z);
        if (zmnVar == null || zmnVar != this.cyb || (abstractC0143fs = this.mw) == null) {
            return;
        }
        abstractC0143fs.fs(z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(zg zgVar) {
        fs.AbstractC0143fs abstractC0143fs;
        super.zmn(zgVar);
        if (zgVar == null) {
            return;
        }
        zgVar.toString();
        if (zgVar.klz && (abstractC0143fs = this.mw) != null) {
            abstractC0143fs.hhw();
        }
        zg mw = mw();
        if (mw instanceof zmn) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs uqh = mw.uqh();
            if (uqh == null || !iqz.hhw(uqh.fs)) {
                ((zmn) mw).phc();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(zg zgVar, boolean z) {
        fs.AbstractC0143fs abstractC0143fs;
        super.zmn(zgVar, z);
        if (zgVar == null) {
            return;
        }
        zgVar.toString();
        if (!zgVar.klz || (abstractC0143fs = this.mw) == null) {
            return;
        }
        abstractC0143fs.zmn(z);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(View view) {
        super.zmn(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.rc.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(View view, boolean z) {
        super.zmn(view, z);
        if (view.getParent() == null && this.rc != null) {
            view.setVisibility(4);
            int childCount = this.rc.getChildCount();
            if (z) {
                this.rc.addView(view, 0);
            } else {
                this.rc.addView(view, childCount - 1);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public boolean zmn(zg zgVar, int i) {
        return i == this.nps.size() - 1 && this.nps.get(i) != null && (this.nps.get(i) instanceof btk);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void hhw() {
        super.hhw();
        zg zgVar = this.cyb;
        if (zgVar != null) {
            zgVar.mw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void zmn(boolean z) {
        super.zmn(z);
        zg zgVar = this.cyb;
        if (zgVar != null) {
            zgVar.zn(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void nps() {
        super.nps();
        zg zgVar = this.cyb;
        if (zgVar != null) {
            zgVar.fb();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void fs(Activity activity) {
        super.fs(activity);
        zg zgVar = this.cyb;
        if (zgVar != null) {
            zgVar.zmn(activity);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void bvs() {
        super.bvs();
        zg zgVar = this.cyb;
        if (zgVar != null) {
            zgVar.iqz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public int iv() {
        return this.olo;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public zg rc() {
        return this.cyb;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public List<nqi> cn() {
        return this.fs.tl();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void kgc() {
        fs.AbstractC0143fs abstractC0143fs = this.mw;
        if (abstractC0143fs != null) {
            abstractC0143fs.zg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zn
    public void kw() {
        fs.AbstractC0143fs abstractC0143fs = this.mw;
        if (abstractC0143fs != null) {
            abstractC0143fs.bvs();
        }
    }
}
