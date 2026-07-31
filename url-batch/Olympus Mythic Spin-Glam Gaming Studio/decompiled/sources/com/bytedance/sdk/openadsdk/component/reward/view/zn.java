package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.fs.rt;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy;
import com.bytedance.sdk.openadsdk.bjh.fs.btk;
import com.bytedance.sdk.openadsdk.core.iv.cyb;
import com.bytedance.sdk.openadsdk.core.iv.kgc;
import com.bytedance.sdk.openadsdk.core.iv.kjb;
import com.bytedance.sdk.openadsdk.core.iv.phc;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.fb.kw;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zn extends phc {
    public static float zmn = 100.0f;
    private final com.bytedance.sdk.openadsdk.component.reward.zmn.fs btk;
    public int fb;
    cyb fs;
    private float hhw;
    private com.bytedance.sdk.openadsdk.doe.zmn.zmn nps;
    kgc zn;

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/zn;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(h.u, this, motionEvent);
        return safedk_zn_dispatchTouchEvent_4a10c8648eba76c7f7b999b0a093ba12(motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public zn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, AdSlot adSlot, String str) {
        super(fsVar.nu, fsVar.fs, adSlot, str, fsVar.dgt, !fsVar.rje);
        this.fb = 1;
        this.hhw = -1.0f;
        this.btk = fsVar;
        setVideoBusiness(fsVar.ww);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    protected void nps() {
        this.cn = true;
        this.mw = new FrameLayout(this.bvs);
        if (!com.bytedance.sdk.openadsdk.core.mw.btk.zmn(this.klz) && !com.bytedance.sdk.openadsdk.core.mw.btk.fs(this.klz)) {
            addView(this.mw, new FrameLayout.LayoutParams(-1, -1));
        }
        super.nps();
        com.bytedance.sdk.component.bvs.nps webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        rt();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.mw.zg() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.zn.1
            @Override // com.bytedance.sdk.openadsdk.mw.zg
            public void zmn(rt rtVar) {
                zn.this.zmn(rtVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    protected void zg() {
        Context context = this.bvs;
        if ((context instanceof TTBaseVideoActivity) && ((TTBaseVideoActivity) context).nu()) {
            this.olo = new kw(19, this.iv, this.klz);
        } else {
            super.zg();
        }
    }

    private void rt() {
        setBackupListener(new com.bytedance.sdk.component.adexpress.fs.zn() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.zn.2
            @Override // com.bytedance.sdk.component.adexpress.fs.zn
            public boolean zmn(ViewGroup viewGroup, int i) {
                try {
                    ((phc) viewGroup).doe();
                    zn.this.zn = new kgc(viewGroup.getContext());
                    zn znVar = zn.this;
                    znVar.zn.zmn(((phc) znVar).klz, (phc) viewGroup, zn.this.btk.hgd);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.component.adexpress.fs.cn
    public void zmn(com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar, rt rtVar) {
        this.am = fbVar;
        nqi nqiVar = this.klz;
        if (nqiVar != null && nqiVar.wir()) {
            super.zmn(fbVar, rtVar);
            return;
        }
        if (fbVar instanceof kjb) {
            kjb kjbVar = (kjb) fbVar;
            if (kjbVar.uqh() != null) {
                kjbVar.uqh().zmn((cyb) this);
            }
        }
        if (rtVar != null && rtVar.fs()) {
            zmn(rtVar);
            this.fb = fbVar.zn();
            if ((this.am instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fb) && am.zn(this.klz)) {
                zn(rtVar);
            }
            if (fbVar instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw) {
                this.btk.phc.btk(true);
            }
        }
        super.zmn(fbVar, rtVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    protected boolean bvs() {
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar = this.btk.tdm;
        if (zgVar == null || !zgVar.jy().rp()) {
            return true;
        }
        return this.btk.cud;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    protected boolean iv() {
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar = this.btk.tdm;
        return zgVar == null || !zgVar.jy().rp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.component.adexpress.dynamic.fb
    public void setSoundMute(boolean z) {
        super.setSoundMute(z);
        com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar = this.nps;
        if (zmnVar != null) {
            zmnVar.zmn(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    public void rc() {
        super.rc();
        if (this.nps != null) {
            com.bytedance.sdk.openadsdk.activity.single.zg zgVar = this.btk.tdm;
            if (zgVar != null && zgVar.jy() != null) {
                this.nps.zmn(this.btk.tdm.jy().nqi());
            }
            this.nps.fs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    public void klz() {
        super.klz();
        if (this.nps != null) {
            com.bytedance.sdk.openadsdk.activity.single.zg zgVar = this.btk.tdm;
            if (zgVar != null && zgVar.jy() != null) {
                this.nps.zmn(true);
            }
            this.nps.zn();
        }
    }

    private void zn(rt rtVar) {
        FrameLayout olo;
        boolean z;
        boolean z2;
        try {
            if (!(rtVar instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fs) || (olo = ((com.bytedance.sdk.openadsdk.core.mw.hhw.fs) rtVar).olo()) == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.activity.single.zg zgVar = this.btk.tdm;
            boolean z3 = true;
            if (zgVar == null || zgVar.jy() == null) {
                z = true;
                z2 = false;
            } else {
                com.bytedance.sdk.openadsdk.activity.single.zg rc = this.btk.tdm.jy().rc();
                com.bytedance.sdk.openadsdk.activity.single.zg zgVar2 = this.btk.tdm;
                z2 = rc == zgVar2;
                if (!zgVar2.jy().nqi() && z2) {
                    z3 = false;
                }
                z = z3;
            }
            com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar = new com.bytedance.sdk.openadsdk.doe.zmn.zmn(this.bvs, this.klz, this.btk.kra, z, olo);
            this.nps = zmnVar;
            zmnVar.zmn(this.btk.ww);
            this.nps.zmn(false, (com.bytedance.sdk.openadsdk.mw.nps) null);
            this.nps.zmn();
            iqz.zmn("TTAD.FRExpressView", "initPlayable success mute = " + this.btk.dgt + ",isCurrentScene->" + z2 + ",isMute = " + z);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    public void mw() {
        try {
            com.bytedance.sdk.openadsdk.doe.zmn.zmn zmnVar = this.nps;
            if (zmnVar != null) {
                zmnVar.fb();
            }
        } catch (Throwable unused) {
        }
        if (!bjh() && (getExpressInteractionListener() instanceof PAGRewardFullExpressAdListenerProxy)) {
            ((PAGRewardFullExpressAdListenerProxy) getExpressInteractionListener()).triggerUnfinishedFail(this);
        }
        super.mw();
    }

    public void setExpressVideoListenerProxy(cyb cybVar) {
        this.fs = cybVar;
    }

    public void zmn(final rt rtVar) {
        if (rtVar == null) {
            return;
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.zn.3
            @Override // java.lang.Runnable
            public void run() {
                zn.this.fb(rtVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn(String str, JSONObject jSONObject) {
        super.zmn(str, jSONObject);
        cyb cybVar = this.fs;
        if (cybVar != null) {
            cybVar.zmn(str, jSONObject);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r1 != 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean safedk_zn_dispatchTouchEvent_4a10c8648eba76c7f7b999b0a093ba12(MotionEvent p0) {
        com.bytedance.sdk.openadsdk.core.model.iqz iqzVar;
        rc rcVar = this.btk.fkt;
        if (rcVar != null && (iqzVar = rcVar.cyb) != null && iqzVar.bvs()) {
            int action = p0.getAction();
            if (action == 0) {
                this.hhw = p0.getY();
            }
            if (jy.zmn(this.hhw, p0.getY(), this.bvs)) {
                iqzVar.fs(5);
            }
        }
        return super.dispatchTouchEvent(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fb(rt rtVar) {
        if (rtVar == null) {
            return;
        }
        double btk = rtVar.btk();
        double hhw = rtVar.hhw();
        double nps = rtVar.nps();
        double zg = rtVar.zg();
        int fs = jy.fs(this.bvs, (float) btk);
        int fs2 = jy.fs(this.bvs, (float) hhw);
        int fs3 = jy.fs(this.bvs, (float) nps);
        int fs4 = jy.fs(this.bvs, (float) zg);
        if ((zg != 0.0d && nps != 0.0d) || this.am.zn() == 7 || this.am.zn() == 10 || (this.am instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fb)) {
            if ((this.am instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fb) && (rtVar instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fs)) {
                FrameLayout cyb = ((com.bytedance.sdk.openadsdk.core.mw.hhw.fs) rtVar).cyb();
                if (cyb != null) {
                    if (this.mw.getParent() != null) {
                        ((ViewGroup) this.mw.getParent()).removeView(this.mw);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    cyb.addView(this.mw, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mw.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(fs3, fs4);
            }
            layoutParams2.width = fs3;
            layoutParams2.height = fs4;
            layoutParams2.topMargin = fs2;
            layoutParams2.leftMargin = fs;
            layoutParams2.setMarginStart(fs);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.mw.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn(boolean z, String str) {
        cyb cybVar = this.fs;
        if (cybVar != null) {
            cybVar.zmn(z, str);
        }
        setSoundMute(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public boolean zmn(JSONObject jSONObject) {
        Objects.toString(jSONObject);
        cyb cybVar = this.fs;
        if (cybVar != null) {
            return cybVar.zmn(jSONObject);
        }
        return super.zmn(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public boolean fs(JSONObject jSONObject) {
        return com.bytedance.sdk.openadsdk.component.reward.fs.zmn(this.btk);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn() {
        cyb cybVar = this.fs;
        if (cybVar != null) {
            cybVar.zmn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void fs() {
        cyb cybVar = this.fs;
        if (cybVar != null) {
            cybVar.fs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn(int i) {
        cyb cybVar = this.fs;
        if (cybVar != null) {
            cybVar.zmn(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public long zn() {
        cyb cybVar = this.fs;
        if (cybVar != null) {
            return cybVar.zn();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public long fb() {
        cyb cybVar = this.fs;
        if (cybVar != null) {
            return cybVar.fb();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public int btk() {
        cyb cybVar = this.fs;
        if (cybVar == null) {
            return 0;
        }
        int btk = cybVar.btk();
        nps(btk);
        return btk;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void hhw() {
        cyb cybVar = this.fs;
        if (cybVar != null) {
            cybVar.hhw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn(int i, rt rtVar) {
        cyb cybVar = this.fs;
        if (cybVar != null) {
            cybVar.zmn(i, rtVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.component.adexpress.fs.zg
    public void zmn(View view, int i, com.bytedance.sdk.component.adexpress.zn znVar) {
        if (i != -1 && znVar != null && i == 3) {
            hhw();
        } else {
            super.zmn(view, i, znVar);
        }
    }

    public FrameLayout getVideoFrameLayout() {
        if (nqi()) {
            return this.zn.getVideoContainer();
        }
        return this.mw;
    }

    public View getBackupContainerBackgroundView() {
        if (nqi()) {
            return this.zn.getBackupContainerBackgroundView();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void fs(int i) {
        cyb cybVar = this.fs;
        if (cybVar != null) {
            cybVar.fs(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn(int i, String str) {
        cyb cybVar = this.fs;
        if (cybVar != null) {
            cybVar.zmn(i, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    protected btk.zmn zn(int i) {
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar;
        btk.zmn zn = super.zn(i);
        com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar = this.btk;
        if (fsVar.rje && (zgVar = fsVar.tdm) != null) {
            zn.fs = zgVar.rc;
        }
        return zn;
    }

    public void zmn(long j, long j2) {
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
        if (fbVar instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fb) {
            ((com.bytedance.sdk.openadsdk.core.mw.hhw.fb) fbVar).zmn(j, j2);
        }
    }
}
