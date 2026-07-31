package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.activity.single.fs;
import com.bytedance.sdk.openadsdk.common.cyb;
import com.bytedance.sdk.openadsdk.component.reward.zmn.rc;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.fs;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class btk extends zg implements kjb.zmn {
    private static String btk;
    private static String doe;
    private static String fb;
    private static String iqz;
    private static String phc;
    private JSONObject am;
    private fs.btk bjh;
    protected final kjb fs;
    private boolean kjb;
    private Bundle nqi;
    private boolean rp;
    private boolean so;
    private int uqh;
    private int yj;
    private long zak;
    public boolean zmn;

    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.fs.fs zn;

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    protected boolean b_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public final void cn() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public final View cyb() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fb(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void klz() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void yj() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public boolean zmn(long j, boolean z) {
        return false;
    }

    public btk(fs fsVar, nqi nqiVar, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(fsVar, nqiVar, i, i2, z2);
        this.fs = new kjb(Looper.getMainLooper(), this);
        this.uqh = 0;
        this.so = true;
        this.cyb = z;
        this.mw = fsVar.btk();
        this.zmn = z3;
        zmn(nqiVar, this.nqi);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public final void zmn(Activity activity, Bundle bundle) {
        this.nqi = bundle;
        super.zmn(activity, bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public final com.bytedance.sdk.openadsdk.component.reward.view.zg zmn() {
        return this.bvs.hgd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void zmn(Activity activity, fs.btk btkVar) {
        fs fsVar;
        fs fsVar2;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3;
        this.bjh = btkVar;
        Intent intent = activity.getIntent();
        this.cn = intent.getStringExtra("media_extra");
        this.rt = intent.getStringExtra("user_id");
        try {
            if (phc == null) {
                phc = doe.zmn(this.bvs.oub, "tt_reward_msg");
                fb = doe.zmn(this.bvs.oub, "tt_msgPlayable");
                iqz = doe.zmn(this.bvs.oub, "tt_negtiveBtnBtnText");
                doe = doe.zmn(this.bvs.oub, "tt_postiveBtnText");
                btk = doe.zmn(this.bvs.oub, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            iqz.zn("TTAD.EndCardScene", th.getMessage());
        }
        if (btkVar != null && (fsVar3 = btkVar.zn) != null) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar4 = this.bvs;
            fsVar4.xrr = fsVar3.xrr;
            fsVar4.dgt = fsVar3.dgt;
            if ((this.mw || this.cyb) && !nu()) {
                this.bvs.rc.set(fsVar3.rc.get());
            }
            this.bvs.phc.zmn(fsVar3.phc.btk());
            zmn(this.bvs, fsVar3);
        }
        if (this.mw || this.cyb) {
            try {
                zak();
            } catch (Throwable unused) {
                yof();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar5 = this.bvs;
        if (fsVar5 != null && (fsVar2 = this.nps) != null) {
            fsVar5.mpi = fsVar2.zmn;
        }
        am();
        a_();
        rc();
        if (!this.zmn || (fsVar = this.nps) == null || fsVar.zmn() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar6 = this.bvs;
        this.nps.zmn().btk(fsVar6 != null ? fsVar6.bvs.get() : -1);
    }

    private void zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2) {
        if (!this.mw || nu() || fsVar == null || fsVar2 == null) {
            return;
        }
        try {
            this.zak = fsVar2.phc.rt();
            if (this.hhw.na()) {
                this.zak = fsVar2.hhw();
            }
            this.yj = fsVar2.phc.uqh();
            this.am = oub.zmn(this.hhw, fsVar2.phc.olo(), fsVar2.phc.kgc());
        } catch (Throwable unused) {
        }
    }

    private void zmn(nqi nqiVar, Bundle bundle) {
        Activity vlj = vlj();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = new com.bytedance.sdk.openadsdk.component.reward.zmn.fs(vlj, this.fs, nqiVar, this, 2, this.nps.fs());
        this.bvs = fsVar;
        fsVar.skn = this.cyb;
        boolean z = this.zmn;
        fsVar.obg = z;
        fsVar.nlz = fsVar.rje && !z;
        fsVar.rje = this.nps.hhw();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.bvs;
        fsVar2.zi = this.mw;
        fsVar2.nkt = this.nps.fb();
        if (!this.zmn) {
            this.bvs.oep = this.nps.uqh();
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = this.bvs;
        fsVar3.tdm = this;
        fsVar3.am = this.nps.doe();
        com.bytedance.sdk.openadsdk.component.reward.zmn.zn.zmn(this.bvs, vlj.getIntent(), bundle);
        com.bytedance.sdk.openadsdk.component.reward.fs.fs zmn = com.bytedance.sdk.openadsdk.component.reward.fs.hhw.zmn(this.bvs);
        this.zn = zmn;
        this.bvs.f3739io = zmn;
        Objects.toString(this.zn);
    }

    private void zak() {
        if (this.kjb) {
            return;
        }
        this.kjb = true;
        if (!this.zmn) {
            this.bvs.oep = this.nps.uqh();
        }
        this.bvs.hgd.zmn(this.zn);
        this.zn.zmn(this, this.fs);
        this.zn.iv();
    }

    private void am() {
        if (this.rp) {
            return;
        }
        this.rp = true;
        if (this.mw) {
            this.nps.zmn(zmn(), nu());
        } else {
            this.nps.zmn(zmn());
        }
        this.zn.uqh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    protected void a_() {
        fs fsVar = this.nps;
        if (fsVar != null && fsVar.zn()) {
            super.a_();
            return;
        }
        final View iv = this.bvs.fkt.iv();
        if (iv != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.btk.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/btk$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_btk$1_onClick_49d9b0dea4e23a7a860abba6a766d27d(view);
                }

                public void safedk_btk$1_onClick_49d9b0dea4e23a7a860abba6a766d27d(View p0) {
                    if (btk.this.bvs.yj.iqz()) {
                        boolean mw = btk.this.bvs.so.mw();
                        btk.this.bvs.yj.hhw(mw);
                        btk.this.bvs.fkt.hhw(8);
                        View view = iv;
                        if (view instanceof com.bytedance.sdk.openadsdk.core.hhw.fb) {
                            ((com.bytedance.sdk.openadsdk.core.hhw.fb) view).setImageResource(doe.fb(btk.this.bvs.oub, "tt_close_btn"));
                        }
                        btk.this.bvs.jy.sendEmptyMessageDelayed(600, 5000L);
                        if (!nqi.zn(btk.this.bvs.fs)) {
                            return;
                        }
                        if (nqi.zn(btk.this.bvs.fs) && mw) {
                            return;
                        }
                    }
                    btk.this.bvs.yj.phc();
                    btk.this.bvs.so.rc();
                    btk.this.bvs.rp.hhw();
                    if (am.fb(btk.this.bvs.fs) && btk.this.zmn(true, true, (Runnable) null)) {
                        return;
                    }
                    btk.this.yof();
                }
            };
            iv.setOnClickListener(onClickListener);
            iv.setTag(iv.getId(), onClickListener);
        }
        this.bvs.ev.zmn(new com.bytedance.sdk.openadsdk.component.reward.top.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.btk.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zmn(View view) {
                btk btkVar = btk.this;
                if (btkVar.zmn(am.zn(btkVar.bvs.fs), false, (Runnable) null) || btk.this.zg()) {
                    return;
                }
                if (am.btk(btk.this.bvs.fs)) {
                    if (am.zg(btk.this.bvs.fs)) {
                        btk.this.bvs.nqi.bvs();
                        return;
                    }
                    View view2 = iv;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        btk.this.yof();
                        return;
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.iqz.zmn(btk.this.bvs.fs) && !btk.this.bvs.mw.get()) {
                    btk.this.yof();
                } else {
                    btk.this.yof();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zmn(View view, String str) {
                btk.this.zmn(str);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void fs(View view) {
                btk.this.e_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zn(View view) {
                View view2 = iv;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void fb(View view) {
                btk btkVar = btk.this;
                btkVar.fs(btkVar.bvs);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void e_() {
        this.bvs.zak.zmn(this.zn);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public boolean f_() {
        return this.bvs.dgt;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void zmn(String str) {
        this.bvs.dgt = !r0.dgt;
        StringBuilder sb = new StringBuilder("will set is Mute ");
        sb.append(this.bvs.dgt);
        sb.append(" mLastVolume=");
        sb.append(this.bvs.am.zmn());
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        fsVar.phc.zmn(fsVar.dgt, str);
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.bvs;
        fsVar2.yj.btk(fsVar2.dgt);
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = this.bvs;
        fsVar3.nqi.fs(fsVar3.dgt);
    }

    public boolean zg() {
        fs fsVar;
        if (this.zmn || (fsVar = this.nps) == null || !fsVar.iqz()) {
            return false;
        }
        try {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), this.hhw, this.bvs.btk, "skip", new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.btk.3
                @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                public JSONObject fs() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, btk.this.zak);
                        jSONObject.put("percent", btk.this.yj);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                public JSONObject zmn() {
                    if (btk.this.am != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("scene_type", btk.this.bvs.zmn);
                            return jSONObject;
                        } catch (Throwable unused) {
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
        }
        this.nps.zmn(this, true, false, false, 4);
        return true;
    }

    private boolean io() {
        if (this.hhw.hhw()) {
            return this.bvs.bvs.get();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void zmn(Activity activity) {
        super.zmn(activity);
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        if (fsVar == null) {
            return;
        }
        fsVar.bjh.zmn();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public final void zn() {
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar;
        super.zn();
        if (this.bvs == null || (fsVar = this.zn) == null) {
            return;
        }
        fsVar.cn();
        this.bvs.cud = true;
        if (io()) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.bvs;
            fsVar2.ev.zmn(fsVar2.fs.bn());
        }
        this.bvs.fkt.cyb();
        this.bvs.yj.olo();
        this.bvs.nqi.btk();
        if (this.zn.fs()) {
            this.bvs.phc.zmn(this.zn);
            this.bvs.phc.zmn(false, this, this.uqh != 0);
        }
        this.uqh++;
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar = this.bvs.uqh;
        if (bvsVar != null) {
            bvsVar.nps();
        }
        this.bvs.bjh.zmn(this.fs);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void fb() {
        super.fb();
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.zn;
        if (fsVar == null) {
            return;
        }
        fsVar.kgc();
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public final void zmn(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.zn;
        if (fsVar == null) {
            return;
        }
        fsVar.zmn(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void zmn(String str, JSONObject jSONObject) {
        if (str == null || !"skipToNextAd".equals(str) || this.nps == null || nu()) {
            return;
        }
        fs fsVar = this.nps;
        if (fsVar != null && fsVar.bjh() == null) {
            if (this.nps.zn()) {
                cyb cybVar = this.kw;
                if (cybVar != null && cybVar.zmn(am.zn(this.bvs.fs), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.btk.4
                    @Override // java.lang.Runnable
                    public void run() {
                        btk.this.lbc();
                    }
                })) {
                    return;
                }
            } else if (zmn(am.zn(this.bvs.fs), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.btk.5
                @Override // java.lang.Runnable
                public void run() {
                    btk.this.lbc();
                }
            })) {
                return;
            }
        }
        lbc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lbc() {
        fs.btk btkVar = new fs.btk(7, this.bvs);
        btkVar.fb = this.bvs.dgt;
        this.nps.fs(this, btkVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public final void rc() {
        if (this.nps == null) {
            return;
        }
        this.bvs.tf.zmn(this.bjh.zmn.getBoolean("isSkip", false), this.bjh.zmn.getBoolean("force", false), this.bjh.zmn.getBoolean("isFromLandingPage", false), this.zn, this.bjh.fs);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public final void mw() {
        super.mw();
        if (this.bvs == null || com.bytedance.sdk.component.utils.fs.zmn(vlj())) {
            return;
        }
        this.bvs.yj.bjh();
        com.bytedance.sdk.openadsdk.utils.fb.zmn(vlj(), this.bvs.fs);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public final void rt() {
        super.rt();
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.zn;
        if (fsVar == null) {
            return;
        }
        fsVar.olo();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void olo() {
        kra();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fs(boolean z) {
        if (!z || this.bvs.rje) {
            return;
        }
        kra();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void btk() {
        iqz.zmn("TTAD.EndCardScene", "onPlayableLoadingDismiss()---" + this.iv + ",scene = " + this);
        fs fsVar = this.nps;
        if (fsVar != null) {
            fsVar.zmn(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void zmn(boolean z) {
        fs fsVar = this.nps;
        if (fsVar != null) {
            fsVar.zmn(this, z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void iqz() {
        super.iqz();
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.zn;
        if (fsVar != null) {
            fsVar.iqz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public boolean doe() {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        return fsVar != null && fsVar.phc.tf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    protected boolean c_() {
        return this.bvs.fb;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public String d_() {
        return this.bvs.btk;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void zmn(zg zgVar, zg zgVar2, fs.btk btkVar) {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar;
        super.zmn(zgVar, zgVar2, btkVar);
        iqz.zmn("TTAD.EndCardScene", "【onActiveSceneChanged】" + this.iv + ",scene = " + this + ",newScene = " + zgVar2 + ",oldScene = " + zgVar + ",isPlayable = " + this.cyb);
        boolean z = this.iv == zgVar2.iv + 1;
        if (zgVar != null && (fsVar = this.bvs) != null) {
            fsVar.dgt = btkVar.fb;
        }
        if (z) {
            iqz.zmn("TTAD.EndCardScene", "preload index =" + this.iv + ",new index =" + zgVar2.iv + ",isPlayableProxy = " + this.cyb);
            hwg();
        }
        if (zgVar == null && this.zmn) {
            iqz.zmn("TTAD.EndCardScene", "preload agg-endcard =" + this.iv + ",new index =" + zgVar2.iv + ",isPlayableProxy = " + this.cyb);
            hwg();
        }
    }

    private void hwg() {
        try {
            zak();
        } catch (Throwable unused) {
            yof();
        }
        am();
        if (!com.bytedance.sdk.openadsdk.core.model.iqz.nps(this.hhw) || this.zmn) {
            return;
        }
        cd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zmn(final boolean z, boolean z2, final Runnable runnable) {
        if (!this.bvs.fb || this.nps.olo()) {
            return false;
        }
        if (!z2 && this.nps.mw()) {
            return false;
        }
        if (!kgc.fb().zg(String.valueOf(this.bvs.hhw))) {
            if (!z2) {
                return false;
            }
            if (runnable == null && z) {
                yof();
                return true;
            }
        }
        this.bvs.olo.set(true);
        if (z) {
            this.bvs.nqi.hhw();
        }
        final com.bytedance.sdk.openadsdk.core.widget.fs fsVar = new com.bytedance.sdk.openadsdk.core.widget.fs(this.bvs.nu);
        this.zn.klz = fsVar;
        if (z) {
            fsVar.zmn(fb).zn(btk).fb(iqz);
        } else {
            fsVar.zmn(phc).zn(doe).fb(iqz);
        }
        this.zn.klz.zmn(new fs.InterfaceC0184fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.btk.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.fs.InterfaceC0184fs
            public void zmn() {
                if (z) {
                    btk.this.bvs.nqi.zmn(1000);
                }
                fsVar.dismiss();
                btk.this.bvs.olo.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.fs.InterfaceC0184fs
            public void fs() {
                fsVar.dismiss();
                btk.this.nps.fs(true);
                btk.this.bvs.olo.set(false);
                btk.this.bvs.nqi.fs(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (z) {
                    btk.this.bvs.rp.hhw();
                    btk.this.yof();
                } else {
                    btk.this.zg();
                }
            }
        }).show();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void kw() {
        super.kw();
        com.bytedance.sdk.openadsdk.component.reward.fs.fs fsVar = this.zn;
        if (fsVar == null) {
            return;
        }
        fsVar.kw();
    }

    public void phc() {
        if (nu()) {
            return;
        }
        fs.btk btkVar = new fs.btk(8, this.bvs);
        btkVar.fb = this.bvs.dgt;
        fs fsVar = this.nps;
        if (fsVar != null) {
            fsVar.zmn(this, btkVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public void zn(boolean z) {
        rc rcVar;
        long j = this.so ? this.bvs.xrr : 0L;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.bvs;
        if (fsVar != null && (rcVar = fsVar.rp) != null) {
            rcVar.fs(z);
            this.bvs.rp.zn(z);
            if (z && j > 0) {
                this.bvs.xrr = j;
            }
        }
        if (z) {
            this.so = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.zg
    public com.bytedance.sdk.openadsdk.component.reward.zmn.fs uqh() {
        return this.bvs;
    }

    public boolean nqi() {
        return this.bvs.yj.kjb();
    }
}
