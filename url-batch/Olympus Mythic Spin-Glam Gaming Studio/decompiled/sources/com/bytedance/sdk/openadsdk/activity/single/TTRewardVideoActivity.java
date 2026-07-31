package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.cyb;
import com.bytedance.sdk.openadsdk.common.zmn;
import com.bytedance.sdk.openadsdk.component.reward.klz;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.nqi;
import com.bytedance.sdk.openadsdk.core.uqh;
import com.bytedance.sdk.openadsdk.core.widget.fs;
import com.bytedance.sdk.openadsdk.core.zak;
import com.bytedance.sdk.openadsdk.fb.btk.fs.cn;
import com.bytedance.sdk.openadsdk.fb.iv;
import com.bytedance.sdk.openadsdk.utils.kjb;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.ironsource.O6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String iqz;
    private static String kgc;
    private static String kw;
    private static String olo;
    private static String phc;
    private static com.bytedance.sdk.openadsdk.zmn.btk.zmn uqh;
    protected int cn;
    protected com.bytedance.sdk.openadsdk.zmn.btk.zmn cyb;
    private String doe;
    private String nqi;
    protected int rt;
    private final AtomicBoolean bjh = new AtomicBoolean(false);
    private int rp = -1;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean bjh() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean rp() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void zmn(String str, JSONObject jSONObject) {
    }

    public void btk(boolean z) {
        nqi nqiVar;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null || (nqiVar = fsVar.fs) == null) {
            return;
        }
        nqiVar.zn(z);
        klz.zmn(this.fs.fs, false, 3);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.iv) {
            uqh = this.cyb;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (olo == null) {
                olo = doe.zmn(this, "tt_reward_msg");
                kgc = doe.zmn(this, "tt_msgPlayable");
                kw = doe.zmn(this, "tt_negtiveBtnBtnText");
                iqz = doe.zmn(this, "tt_postiveBtnText");
                phc = doe.zmn(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            iqz.zn("TTAD.RVA", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void zmn() {
        final nqi nqiVar;
        super.zmn();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null || (nqiVar = fsVar.fs) == null || nqiVar.jy()) {
            return;
        }
        this.fs.mpi = new klz(new klz.zmn() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.klz.zmn
            public void zmn(int i, boolean z) {
                if (nqiVar.jy()) {
                    return;
                }
                if (z || !nqiVar.cyb()) {
                    TTRewardVideoActivity.this.zmn(i);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected cyb zg() {
        return new cyb(this.fs) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.cyb
            protected boolean zmn() {
                nqi nqiVar;
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.nps;
                return (fsVar == null || (nqiVar = fsVar.fs) == null || !nqiVar.cyb()) ? false : true;
            }

            @Override // com.bytedance.sdk.openadsdk.common.cyb
            protected void zmn(boolean z) {
                TTRewardVideoActivity.this.btk(z);
            }

            @Override // com.bytedance.sdk.openadsdk.common.cyb
            protected boolean fs() {
                nqi nqiVar;
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.nps;
                return (fsVar == null || (nqiVar = fsVar.fs) == null || !nqiVar.jy()) ? false : true;
            }

            @Override // com.bytedance.sdk.openadsdk.common.cyb
            protected void zn() {
                TTRewardVideoActivity.this.finish();
            }

            @Override // com.bytedance.sdk.openadsdk.common.cyb
            protected void zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
                com.bytedance.sdk.openadsdk.common.zmn.zmn(fsVar, new zmn.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.2.1
                    @Override // com.bytedance.sdk.openadsdk.common.zmn.fs
                    public void zmn(boolean z, int i) {
                        TTRewardVideoActivity.this.zmn(z, i);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.zmn.fs
                    public void zmn() {
                        TTRewardVideoActivity.this.finish();
                    }
                });
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        klz klzVar;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null || (klzVar = fsVar.mpi) == null) {
            return;
        }
        klzVar.fs();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void phc() {
        com.bytedance.sdk.openadsdk.component.reward.view.zn zmn;
        super.phc();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null || (zmn = fsVar.uqh.zmn()) == null) {
            return;
        }
        zmn.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.btk() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.btk
            public void zmn() {
                TTRewardVideoActivity.this.vlj();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        klz klzVar;
        super.onPause();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null || (klzVar = fsVar.mpi) == null) {
            return;
        }
        klzVar.zmn();
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.iv) {
            return;
        }
        uqh = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void zmn(Bundle bundle) {
        if (this.iv) {
            super.zmn(bundle);
            this.cyb = (com.bytedance.sdk.openadsdk.zmn.btk.zmn) am.zmn().zmn(this.fkt, com.bytedance.sdk.openadsdk.zmn.btk.zmn.class);
        } else {
            com.bytedance.sdk.openadsdk.zmn.btk.zmn fs = am.zmn().fs();
            this.cyb = fs;
            if (fs == null && bundle != null) {
                this.cyb = uqh;
                uqh = null;
            }
        }
        Log.e("TTAD.RVA", "initListener: listenerKey = " + this.fkt + ",mRewardAdInteractionListener = " + this.cyb + ",savedInstanceState = " + bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void bvs() {
        this.fs.ev.zmn(null, TTAdDislikeToast.getSkipText());
        this.fs.ev.btk(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void uqh() {
        final View iv = this.fs.fkt.iv();
        if (iv != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTRewardVideoActivity$4;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTRewardVideoActivity$4_onClick_89124581e4300eb2a3d643fd04a272ed(view);
                }

                public void safedk_TTRewardVideoActivity$4_onClick_89124581e4300eb2a3d643fd04a272ed(View p0) {
                    if (TTRewardVideoActivity.this.fs.yj.iqz() && TTRewardVideoActivity.this.fs.bvs.get()) {
                        boolean mw = TTRewardVideoActivity.this.fs.so.mw();
                        TTRewardVideoActivity.this.fs.yj.hhw(mw);
                        TTRewardVideoActivity.this.fs.fkt.hhw(8);
                        View view = iv;
                        if (view instanceof com.bytedance.sdk.openadsdk.core.hhw.fb) {
                            ((com.bytedance.sdk.openadsdk.core.hhw.fb) view).setImageResource(doe.fb(TTRewardVideoActivity.this.fs.oub, "tt_close_btn"));
                        }
                        TTRewardVideoActivity.this.fs.jy.sendEmptyMessageDelayed(600, 5000L);
                        if (!nqi.zn(TTRewardVideoActivity.this.fs.fs)) {
                            return;
                        }
                        if (nqi.zn(TTRewardVideoActivity.this.fs.fs) && mw) {
                            return;
                        }
                    }
                    TTRewardVideoActivity.this.fs.yj.phc();
                    TTRewardVideoActivity.this.fs.so.rc();
                    TTRewardVideoActivity.this.fs.rp.hhw();
                    if (com.bytedance.sdk.openadsdk.core.model.am.fb(TTRewardVideoActivity.this.fs.fs)) {
                        TTRewardVideoActivity.this.zn(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            };
            iv.setOnClickListener(onClickListener);
            iv.setTag(iv.getId(), onClickListener);
        }
        this.fs.ev.zmn(new com.bytedance.sdk.openadsdk.component.reward.top.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void fb(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zmn(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.zn(com.bytedance.sdk.openadsdk.core.model.am.zn(tTRewardVideoActivity.fs.fs), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zmn(View view, String str) {
                com.bytedance.sdk.openadsdk.core.model.fb exj;
                com.bytedance.sdk.openadsdk.core.rt.fb zmn;
                TTRewardVideoActivity.this.fs.dgt = !r3.dgt;
                StringBuilder sb = new StringBuilder("will set is Mute ");
                sb.append(TTRewardVideoActivity.this.fs.dgt);
                sb.append(" mLastVolume=");
                sb.append(TTRewardVideoActivity.this.fs.am.zmn());
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = TTRewardVideoActivity.this.fs;
                fsVar.phc.zmn(fsVar.dgt, str);
                if (!com.bytedance.sdk.openadsdk.core.model.am.cyb(TTRewardVideoActivity.this.fs.fs) || TTRewardVideoActivity.this.fs.bvs.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = TTRewardVideoActivity.this.fs;
                    fsVar2.yj.btk(fsVar2.dgt);
                    com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = TTRewardVideoActivity.this.fs;
                    fsVar3.nqi.fs(fsVar3.dgt);
                    nqi nqiVar = TTRewardVideoActivity.this.fs.fs;
                    if (nqiVar == null || (exj = nqiVar.exj()) == null || (zmn = exj.zmn()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar4 = TTRewardVideoActivity.this.fs;
                    if (fsVar4.dgt) {
                        zmn.zg(fsVar4.phc.mw());
                    } else {
                        zmn.bvs(fsVar4.phc.mw());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void fs(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.fs.zak.zmn(tTRewardVideoActivity.zn);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zn(View view) {
                View view2 = iv;
                if (view2 != null) {
                    view2.performClick();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(final boolean z, boolean z2) {
        nqi nqiVar;
        nqi nqiVar2;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null || (nqiVar = fsVar.fs) == null) {
            return;
        }
        if (!z2 && nqiVar.cyb() && this.fs.bvs.get() && com.bytedance.sdk.openadsdk.core.model.am.zg(this.fs.fs)) {
            this.fs.nqi.bvs();
            return;
        }
        if (!kgc.fb().zg(String.valueOf(this.fs.hhw))) {
            if (!z2 && this.fs.bvs.get() && com.bytedance.sdk.openadsdk.core.model.am.zg(this.fs.fs)) {
                this.fs.nqi.bvs();
                return;
            } else if (z) {
                finish();
                return;
            } else {
                jy();
                return;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.fs;
        if (fsVar2 != null && (nqiVar2 = fsVar2.fs) != null && nqiVar2.jy()) {
            if (this.fs.bvs.get() && com.bytedance.sdk.openadsdk.core.model.am.zg(this.fs.fs)) {
                this.fs.nqi.bvs();
                return;
            } else if (z) {
                finish();
                return;
            } else {
                jy();
                return;
            }
        }
        if (com.bytedance.sdk.openadsdk.core.model.am.zg(this.fs.fs) && this.fs.yj.zg().getVisibility() == 0) {
            this.fs.nqi.bvs();
            return;
        }
        this.fs.olo.set(true);
        this.fs.phc.doe();
        if (z) {
            this.fs.nqi.hhw();
        }
        final com.bytedance.sdk.openadsdk.core.widget.fs fsVar3 = new com.bytedance.sdk.openadsdk.core.widget.fs(this);
        this.zn.klz = fsVar3;
        if (z) {
            fsVar3.zmn(kgc).zn(phc).fb(kw);
        } else {
            fsVar3.zmn(olo).zn(iqz).fb(kw);
        }
        this.zn.klz.zmn(new fs.InterfaceC0184fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.fs.InterfaceC0184fs
            public void zmn() {
                TTRewardVideoActivity.this.fs.phc.phc();
                if (z) {
                    TTRewardVideoActivity.this.fs.nqi.zmn(1000);
                }
                fsVar3.dismiss();
                TTRewardVideoActivity.this.fs.olo.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.fs.InterfaceC0184fs
            public void fs() {
                fsVar3.dismiss();
                TTRewardVideoActivity.this.btk(true);
                TTRewardVideoActivity.this.fs.olo.set(false);
                TTRewardVideoActivity.this.fs.nqi.fs(Integer.MAX_VALUE);
                if (!z || !com.bytedance.sdk.openadsdk.core.model.am.hhw(TTRewardVideoActivity.this.fs.fs)) {
                    TTRewardVideoActivity.this.jy();
                } else if (com.bytedance.sdk.openadsdk.core.model.am.zg(TTRewardVideoActivity.this.fs.fs)) {
                    TTRewardVideoActivity.this.fs.nqi.bvs();
                } else {
                    TTRewardVideoActivity.this.fs.rp.hhw();
                    TTRewardVideoActivity.this.finish();
                }
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009f, code lost:
    
        if (r3.fs.mw.get() == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void jy() {
        com.bytedance.sdk.openadsdk.core.model.fb exj;
        com.bytedance.sdk.openadsdk.core.rt.fb zmn;
        cn.zmn zmnVar = new cn.zmn();
        zmnVar.fs(this.fs.phc.mw());
        zmnVar.fb(this.fs.phc.rp());
        zmnVar.zn(this.fs.phc.olo());
        zmnVar.zn(3);
        zmnVar.fb(this.fs.phc.bjh());
        zmnVar.zmn(this.fs.phc.fs());
        com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(this.fs.phc.zg(), zmnVar, this.fs.phc.btk());
        zak.zn(this.fs.hhw);
        this.fs.phc.zmn("skip", false);
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar.zn) {
            if (com.bytedance.sdk.openadsdk.core.model.iqz.zn(fsVar.fs)) {
                com.bytedance.sdk.openadsdk.component.reward.view.zn zmn2 = this.fs.uqh.zmn();
                if (zmn2 != null && zmn2.fb == 0) {
                    finish();
                } else {
                    zmn(true, 4);
                }
            } else {
                zmn(true, 4);
            }
            if (com.bytedance.sdk.openadsdk.core.model.iqz.zmn(this.fs.fs)) {
            }
            exj = this.fs.fs.exj();
            if (exj != null && (zmn = exj.zmn()) != null) {
                long mw = this.fs.phc.mw();
                zmn.hhw(mw);
                zmn.btk(mw);
            }
            com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(this.fs.fs, 5);
        }
        finish();
        exj = this.fs.fs.exj();
        if (exj != null) {
            long mw2 = this.fs.phc.mw();
            zmn.hhw(mw2);
            zmn.btk(mw2);
        }
        com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(this.fs.fs, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void zmn(@NonNull Intent intent) {
        super.zmn(intent);
        this.doe = intent.getStringExtra("media_extra");
        this.nqi = intent.getStringExtra("user_id");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout ev() {
        return this.fs.fkt.hhw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void zmn(long j, long j2) {
        int i = (int) (j / 1000);
        int nkw = this.fs.fs.nkw();
        boolean z = nkw >= 0;
        zn(j, j2);
        if (this.btk > 0) {
            this.fs.ev.fb(true);
            if (z && i >= nkw) {
                this.fs.zmn(true);
                this.fs.ev.zmn(String.valueOf(this.btk), TTAdDislikeToast.getSkipText());
                this.fs.ev.btk(true);
                return;
            }
            this.fs.ev.zmn(String.valueOf(this.btk), null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void fs(boolean z, boolean z2) {
        this.rt = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void so() {
        this.cn = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void tf() {
        vlj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vlj() {
        toString();
        com.bytedance.sdk.openadsdk.zmn.btk.zmn zmnVar = this.cyb;
        if (zmnVar != null) {
            zmnVar.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(final boolean z, final int i, final String str, final int i2, final String str2, final int i3) {
        toString();
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.7
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.zmn.btk.zmn zmnVar = TTRewardVideoActivity.this.cyb;
                if (zmnVar != null) {
                    zmnVar.zmn(z, i, str, i2, str2);
                    klz.zmn(TTRewardVideoActivity.this.fs.fs, z, i3);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void kw() {
        com.bytedance.sdk.openadsdk.zmn.btk.zmn zmnVar = this.cyb;
        if (zmnVar != null) {
            zmnVar.zmn();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
            iv.zmn(fsVar != null ? fsVar.fs : null, "show", 0);
        }
        if (kjb()) {
            this.fs.uqh.mw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void olo() {
        oub();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void am() {
        oub();
    }

    protected void oub() {
        zmn(0);
    }

    protected void zmn(final int i) {
        nqi nqiVar;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null || (nqiVar = fsVar.fs) == null || nqiVar.jy() || this.fs.fs.cyb()) {
            return;
        }
        this.fs.fs.bvs(true);
        klz klzVar = this.fs.mpi;
        if (klzVar != null) {
            klzVar.zn();
        }
        if (kgc.fb().olo(String.valueOf(this.fs.hhw))) {
            zmn(true, this.fs.fs.zi(), this.fs.fs.rje(), 0, "", i);
        } else {
            kgc.zn().zmn(yof(), new nqi.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.8
                @Override // com.bytedance.sdk.openadsdk.core.nqi.fs
                public void zmn(int i2, String str) {
                    TTRewardVideoActivity.this.zmn(false, 0, "", i2, str, i);
                }

                @Override // com.bytedance.sdk.openadsdk.core.nqi.fs
                public void zmn(uqh.fs fsVar2) {
                    boolean z = fsVar2.fs;
                    TTRewardVideoActivity.this.zmn(fsVar2.fs, fsVar2.zn.zmn(), fsVar2.zn.fs(), 0, "", i);
                }
            });
        }
    }

    private JSONObject yof() {
        JSONObject jSONObject = new JSONObject();
        int kjb = (int) this.fs.phc.kjb();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.fs.fs.rje());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.fs.fs.zi());
            jSONObject.put("network", com.bytedance.sdk.component.utils.kgc.zn(getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int mig = this.fs.fs.mig();
            String str = "unKnow";
            if (mig == 2) {
                str = oub.fs();
            } else if (mig == 1) {
                str = oub.fb();
            }
            jSONObject.put("user_agent", str);
            JSONObject wu = this.fs.fs.wu();
            wu.put(O6.X0, com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().fs());
            jSONObject.put("extra", wu);
            jSONObject.put("media_extra", this.doe);
            jSONObject.put("video_duration", this.fs.fs.mrt().hhw());
            jSONObject.put("play_start_ts", this.rt);
            jSONObject.put("play_end_ts", this.cn);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, kjb);
            jSONObject.put("user_id", this.nqi);
            jSONObject.put("trans_id", kjb.zmn().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            iqz.zmn("TTAD.RVA", "", th);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void xrr() {
        vlj();
        this.fs.fs.wl();
        this.fs.fs.fb(true);
        if (this.fs.bvs.get() || !com.bytedance.sdk.openadsdk.core.model.nqi.btk(this.fs.fs)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = fsVar.fs;
        com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, fsVar.btk, nqiVar.zvo());
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fs(int i) {
        if (i == 10000) {
            oub();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        hhw();
        zmn(isFinishing(), isChangingConfigurations());
        if (this.iv) {
            return;
        }
        this.cyb = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.fs != null) {
            com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn("videoForceBreak", this.fs.fs);
        }
        hhw();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void fs() {
        com.bytedance.sdk.openadsdk.zmn.btk.zmn zmnVar = this.cyb;
        if (zmnVar != null) {
            zmnVar.fs();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
            iv.zmn(fsVar != null ? fsVar.fs : null, "close", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void zn() {
        klz klzVar;
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null || (klzVar = fsVar.mpi) == null) {
            return;
        }
        klzVar.fb();
    }

    protected void fs(long j, long j2) {
        if (j2 <= 0) {
            return;
        }
        if (this.rp == -1) {
            this.rp = Math.min(100, this.fs.fs.oep());
        }
        if (((j / 1000.0f) / j2) * 100.0f >= this.rp) {
            oub();
        }
    }

    public void zn(long j, long j2) {
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        boolean z = false;
        if (fsVar != null) {
            if (fsVar.fs.oep() >= 0 && this.fs.fs.ozu() >= 0) {
                z = true;
            }
            if (z) {
                j2 = this.fs.fs.ozu();
            }
        }
        long j3 = j + (this.fs.gn * 1000);
        if (z) {
            fs(j3, j2);
            return;
        }
        if (this.rp == -1) {
            this.rp = kgc.fb().kjb(String.valueOf(this.fs.hhw)).hhw;
        }
        if (j2 <= 0) {
            return;
        }
        if (j2 >= 30000 && j3 >= 27000) {
            oub();
        } else if ((j3 * 100) / j2 >= this.rp) {
            oub();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fs(boolean z) {
        if (z) {
            oub();
            return;
        }
        if ((1.0d - (this.btk / this.fs.phc.ww())) * 100.0d >= kgc.fb().kjb(String.valueOf(this.fs.hhw)).hhw) {
            oub();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fkt() {
        zmn(2);
    }
}
