package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.cyb;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.zak;
import com.bytedance.sdk.openadsdk.fb.btk.fs.cn;
import com.bytedance.sdk.openadsdk.fb.iv;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static com.bytedance.sdk.openadsdk.zmn.zn.fs cn;
    private boolean cyb;
    private com.bytedance.sdk.openadsdk.zmn.zn.fs rt;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean bjh() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fkt() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fs(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void fs(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean rp() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected cyb zg() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void zmn(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void zn() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.iv) {
            cn = this.rt;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void phc() {
        com.bytedance.sdk.openadsdk.component.reward.view.zn zmn;
        super.phc();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null || (zmn = fsVar.uqh.zmn()) == null) {
            return;
        }
        zmn.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.btk() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.btk
            public void zmn() {
                TTFullScreenVideoActivity.this.oub();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null || nqi.btk(fsVar.fs)) {
            return;
        }
        com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs mrt = this.fs.fs.mrt();
        if (mrt == null) {
            com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs fsVar2 = new com.bykv.vk.openvk.zmn.zmn.zmn.zn.fs();
            fsVar2.zmn(10.0d);
            this.fs.fs.zmn(fsVar2);
        } else if (mrt.hhw() <= 0.0d) {
            mrt.zmn(10.0d);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void zmn(@NonNull Intent intent) {
        super.zmn(intent);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void zmn(Bundle bundle) {
        if (this.iv) {
            super.zmn(bundle);
            this.rt = (com.bytedance.sdk.openadsdk.zmn.zn.fs) am.zmn().zmn(this.fkt, com.bytedance.sdk.openadsdk.zmn.zn.fs.class);
            return;
        }
        com.bytedance.sdk.openadsdk.zmn.zn.fs zn = am.zmn().zn();
        this.rt = zn;
        if (zn != null || bundle == null) {
            return;
        }
        this.rt = cn;
        cn = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void uqh() {
        final View iv = this.fs.fkt.iv();
        if (iv != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/single/TTFullScreenVideoActivity$2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(h.u, view);
                    safedk_TTFullScreenVideoActivity$2_onClick_3aeea69199c6f0cf14b9bc82c954f247(view);
                }

                public void safedk_TTFullScreenVideoActivity$2_onClick_3aeea69199c6f0cf14b9bc82c954f247(View p0) {
                    if (TTFullScreenVideoActivity.this.fs.yj.iqz() && TTFullScreenVideoActivity.this.fs.bvs.get()) {
                        boolean mw = TTFullScreenVideoActivity.this.fs.so.mw();
                        TTFullScreenVideoActivity.this.fs.yj.hhw(mw);
                        TTFullScreenVideoActivity.this.fs.fkt.hhw(8);
                        View view = iv;
                        if (view instanceof com.bytedance.sdk.openadsdk.core.hhw.fb) {
                            ((com.bytedance.sdk.openadsdk.core.hhw.fb) view).setImageResource(doe.fb(TTFullScreenVideoActivity.this.fs.oub, "tt_close_btn"));
                        }
                        TTFullScreenVideoActivity.this.fs.jy.sendEmptyMessageDelayed(600, 5000L);
                        if (!nqi.zn(TTFullScreenVideoActivity.this.fs.fs)) {
                            return;
                        }
                        if (nqi.zn(TTFullScreenVideoActivity.this.fs.fs) && mw) {
                            return;
                        }
                    }
                    TTFullScreenVideoActivity.this.fs.yj.phc();
                    TTFullScreenVideoActivity.this.fs.so.rc();
                    TTFullScreenVideoActivity.this.fs.rp.hhw();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            iv.setOnClickListener(onClickListener);
            iv.setTag(iv.getId(), onClickListener);
        }
        this.fs.ev.zmn(new com.bytedance.sdk.openadsdk.component.reward.top.fs() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void fb(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zmn(View view) {
                nqi nqiVar;
                com.bytedance.sdk.openadsdk.core.model.fb exj;
                com.bytedance.sdk.openadsdk.core.rt.fb zmn;
                if (com.bytedance.sdk.openadsdk.core.model.am.hhw(TTFullScreenVideoActivity.this.fs.fs) || (com.bytedance.sdk.openadsdk.core.model.am.btk(TTFullScreenVideoActivity.this.fs.fs) && TTFullScreenVideoActivity.this.fs.nqi.fb(com.bytedance.sdk.openadsdk.component.reward.zmn.bvs.fs))) {
                    if (com.bytedance.sdk.openadsdk.core.model.am.zg(TTFullScreenVideoActivity.this.fs.fs)) {
                        TTFullScreenVideoActivity.this.fs.nqi.bvs();
                        return;
                    }
                    View view2 = iv;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                        return;
                    }
                }
                if (iqz.zmn(TTFullScreenVideoActivity.this.fs.fs) && !TTFullScreenVideoActivity.this.fs.mw.get()) {
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                cn.zmn zmnVar = new cn.zmn();
                zmnVar.fs(TTFullScreenVideoActivity.this.fs.phc.mw());
                zmnVar.fb(TTFullScreenVideoActivity.this.fs.phc.rp());
                zmnVar.zn(TTFullScreenVideoActivity.this.fs.phc.olo());
                zmnVar.zn(3);
                zmnVar.fb(TTFullScreenVideoActivity.this.fs.phc.bjh());
                zmnVar.zmn(TTFullScreenVideoActivity.this.fs.phc.fs());
                com.bytedance.sdk.openadsdk.fb.btk.zmn.zmn.zmn(TTFullScreenVideoActivity.this.fs.phc.zg(), zmnVar, TTFullScreenVideoActivity.this.fs.phc.btk());
                zak.zn(TTFullScreenVideoActivity.this.fs.hhw);
                TTFullScreenVideoActivity.this.fs.phc.zmn("skip", false);
                TTFullScreenVideoActivity.this.fs.ev.fb(false);
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = TTFullScreenVideoActivity.this.fs;
                if (fsVar.zn) {
                    if (iqz.zn(fsVar.fs)) {
                        com.bytedance.sdk.openadsdk.component.reward.view.zn zmn2 = TTFullScreenVideoActivity.this.fs.uqh.zmn();
                        if (zmn2 == null || zmn2.fb != 0) {
                            TTFullScreenVideoActivity.this.zmn(true, 4);
                        }
                    } else {
                        TTFullScreenVideoActivity.this.zmn(true, 4);
                    }
                    nqiVar = TTFullScreenVideoActivity.this.fs.fs;
                    if (nqiVar != null && (exj = nqiVar.exj()) != null && (zmn = exj.zmn()) != null) {
                        zmn.hhw(TTFullScreenVideoActivity.this.fs.phc.mw());
                        zmn.btk(TTFullScreenVideoActivity.this.fs.phc.mw());
                    }
                    com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(TTFullScreenVideoActivity.this.fs.fs, 5);
                }
                TTFullScreenVideoActivity.this.finish();
                nqiVar = TTFullScreenVideoActivity.this.fs.fs;
                if (nqiVar != null) {
                    zmn.hhw(TTFullScreenVideoActivity.this.fs.phc.mw());
                    zmn.btk(TTFullScreenVideoActivity.this.fs.phc.mw());
                }
                com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(TTFullScreenVideoActivity.this.fs.fs, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void zmn(View view, String str) {
                com.bytedance.sdk.openadsdk.core.model.fb exj;
                com.bytedance.sdk.openadsdk.core.rt.fb zmn;
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = TTFullScreenVideoActivity.this.fs;
                boolean z = !fsVar.dgt;
                fsVar.dgt = z;
                fsVar.phc.zmn(z, str);
                if (!com.bytedance.sdk.openadsdk.core.model.am.cyb(TTFullScreenVideoActivity.this.fs.fs) || TTFullScreenVideoActivity.this.fs.bvs.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = TTFullScreenVideoActivity.this.fs;
                    fsVar2.yj.btk(fsVar2.dgt);
                    com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar3 = TTFullScreenVideoActivity.this.fs;
                    fsVar3.nqi.fs(fsVar3.dgt);
                    nqi nqiVar = TTFullScreenVideoActivity.this.fs.fs;
                    if (nqiVar == null || (exj = nqiVar.exj()) == null || (zmn = exj.zmn()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar4 = TTFullScreenVideoActivity.this.fs;
                    if (fsVar4.dgt) {
                        zmn.zg(fsVar4.phc.mw());
                    } else {
                        zmn.bvs(fsVar4.phc.mw());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.fs
            public void fs(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.fs.zak.zmn(tTFullScreenVideoActivity.zn);
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

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout ev() {
        return this.fs.fkt.hhw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void zmn(long j, long j2) {
        zmn((int) (j / 1000));
        int i = this.btk;
        if (i >= 0) {
            this.fs.ev.zmn(String.valueOf(i), null);
        }
    }

    public void zmn(int i) {
        int ab = this.fs.fs.ab();
        if (!kgc.fb().hhw(String.valueOf(this.fs.hhw)) || (!nqi.btk(this.fs.fs) && !this.fs.zn)) {
            if (i >= ab) {
                com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
                if (!fsVar.yo) {
                    fsVar.zmn(true);
                }
                bvs();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.fs;
        if (!fsVar2.yo) {
            fsVar2.zmn(true);
        }
        if (i <= ab) {
            zn(ab - i);
            this.fs.ev.btk(false);
        } else {
            bvs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void bvs() {
        if (!nqi.btk(this.fs.fs)) {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
            if (!fsVar.zn) {
                fsVar.ev.zmn(null, "X");
                this.fs.ev.btk(true);
            }
        }
        this.fs.ev.zmn(null, TTAdDislikeToast.getSkipText());
        this.fs.ev.btk(true);
    }

    private void zn(int i) {
        this.fs.ev.zmn(null, String.format(doe.zmn(kgc.zmn(), "tt_skip_ad_time_text"), Integer.valueOf(i)));
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void tf() {
        if (this.fs.fs.fu() != 100.0f) {
            this.cyb = true;
        }
        oub();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void kw() {
        com.bytedance.sdk.openadsdk.zmn.zn.fs fsVar = this.rt;
        if (fsVar != null) {
            fsVar.zmn();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.fs;
            iv.zmn(fsVar2 != null ? fsVar2.fs : null, "show", 0);
        }
        if (kjb()) {
            this.fs.uqh.mw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cn.fb.fs
    public void xrr() {
        oub();
        this.fs.fs.wl();
        this.fs.fs.fb(true);
        if (this.fs.bvs.get() || !nqi.btk(this.fs.fs)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        nqi nqiVar = fsVar.fs;
        com.bytedance.sdk.openadsdk.fb.zn.fs(nqiVar, fsVar.btk, nqiVar.zvo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oub() {
        toString();
        com.bytedance.sdk.openadsdk.zmn.zn.fs fsVar = this.rt;
        if (fsVar != null) {
            fsVar.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.fs != null) {
            com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn("videoForceBreak", this.fs.fs);
        }
        try {
            hhw();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        hhw();
        zmn(isFinishing(), isChangingConfigurations());
        if (this.iv) {
            return;
        }
        this.rt = null;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.iv) {
            return;
        }
        cn = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void fs() {
        toString();
        com.bytedance.sdk.openadsdk.zmn.zn.fs fsVar = this.rt;
        if (fsVar != null) {
            fsVar.fs();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar2 = this.fs;
            iv.zmn(fsVar2 != null ? fsVar2.fs : null, "close", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.fs;
        if (fsVar == null || !fs(fsVar.fs) || zmn(this.fs.fs)) {
            return;
        }
        if (this.cyb) {
            this.cyb = false;
            finish();
        } else if (this.fs.yj.rp()) {
            finish();
        }
    }

    private boolean zmn(nqi nqiVar) {
        return nqiVar == null || nqiVar.fu() == 100.0f;
    }

    private boolean fs(nqi nqiVar) {
        if (nqiVar == null) {
            return false;
        }
        return kgc.fb().phc(String.valueOf(this.fs.hhw));
    }
}
