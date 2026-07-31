package com.bytedance.sdk.openadsdk.component.bvs;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn;
import com.bytedance.sdk.component.adexpress.fs.mw;
import com.bytedance.sdk.component.adexpress.fs.rt;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.iv.cyb;
import com.bytedance.sdk.openadsdk.core.iv.kjb;
import com.bytedance.sdk.openadsdk.core.iv.phc;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class fs extends phc {
    private final com.bytedance.sdk.openadsdk.component.zmn btk;
    private FrameLayout ev;
    float fb;
    boolean fs;
    private final com.bytedance.sdk.openadsdk.component.hhw.fs hhw;
    private final com.bytedance.sdk.openadsdk.component.zg.zmn nps;
    private com.bytedance.sdk.openadsdk.component.hhw.zmn so;
    private zn.zmn tf;
    private com.bytedance.sdk.openadsdk.component.zg.zn zg;
    boolean zmn;
    int zn;

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
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

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn(int i, String str) {
    }

    public fs(@NonNull Context context, nqi nqiVar, AdSlot adSlot, String str, com.bytedance.sdk.openadsdk.component.zmn zmnVar, com.bytedance.sdk.openadsdk.component.hhw.fs fsVar, com.bytedance.sdk.openadsdk.component.zg.zmn zmnVar2) {
        super(context, nqiVar, adSlot, str, true, true);
        this.zmn = true;
        this.fs = false;
        this.zn = 0;
        this.fb = 1.0f;
        this.btk = zmnVar;
        this.hhw = fsVar;
        this.nps = zmnVar2;
        if (nqiVar == null || nqiVar.el() == null) {
            return;
        }
        this.zn = nqiVar.el().fs();
        this.fb = nqiVar.el().zmn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    protected void nps() {
        this.cn = true;
        this.ev = new FrameLayout(this.bvs);
        if (!com.bytedance.sdk.openadsdk.core.mw.btk.zmn(this.klz) && !com.bytedance.sdk.openadsdk.core.mw.btk.fs(this.klz)) {
            addView(this.ev, new FrameLayout.LayoutParams(-1, -1));
        }
        super.nps();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.mw.zg() { // from class: com.bytedance.sdk.openadsdk.component.bvs.fs.1
            @Override // com.bytedance.sdk.openadsdk.mw.zg
            public void zmn(rt rtVar) {
                fs.this.zmn(rtVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    public int getDynamicShowType() {
        if (this.am == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.component.adexpress.fs.cn
    public void zmn(com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar, rt rtVar) {
        this.am = fbVar;
        if (fbVar instanceof kjb) {
            kjb kjbVar = (kjb) fbVar;
            if (kjbVar.uqh() != null) {
                kjbVar.uqh().zmn((cyb) this);
            }
        }
        if (rtVar != null && rtVar.fs()) {
            zmn(rtVar);
        }
        super.zmn(fbVar, rtVar);
    }

    public void zmn(final rt rtVar) {
        if (rtVar == null) {
            return;
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.bvs.fs.2
            @Override // java.lang.Runnable
            public void run() {
                fs.this.zn(rtVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(rt rtVar) {
        if (rtVar == null) {
            return;
        }
        if (rtVar.zmn() != null) {
            if (this.zmn) {
                rtVar.zmn().setTag(com.bytedance.sdk.component.adexpress.dynamic.zmn.hhw, 1);
                ((FrameLayout) rtVar.zmn()).removeAllViews();
                FrameLayout frameLayout = (FrameLayout) rtVar.zmn();
                this.ev = frameLayout;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                this.zmn = false;
                return;
            }
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
            if ((this.am.zn() == 7 || this.am.zn() == 10 || (this.am instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fb)) && (rtVar instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fs)) {
                FrameLayout cyb = ((com.bytedance.sdk.openadsdk.core.mw.hhw.fs) rtVar).cyb();
                if (cyb != null) {
                    if (this.ev.getParent() != null) {
                        ((ViewGroup) this.ev.getParent()).removeView(this.ev);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    cyb.addView(this.ev, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.ev.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(fs3, fs4);
            }
            layoutParams2.width = fs3;
            layoutParams2.height = fs4;
            layoutParams2.topMargin = fs2;
            layoutParams2.leftMargin = fs;
            layoutParams2.setMarginStart(fs);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.ev.setLayoutParams(layoutParams2);
        }
    }

    public void setExpressVideoListenerProxy(zn.zmn zmnVar) {
        this.tf = zmnVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn() {
        com.bytedance.sdk.openadsdk.component.hhw.zmn zmnVar = this.so;
        if (zmnVar != null) {
            zmnVar.zmn(this);
        }
    }

    public void setVideoManager(com.bytedance.sdk.openadsdk.component.zg.zn znVar) {
        this.zg = znVar;
    }

    public void zmn(long j, long j2) {
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
        if (fbVar instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fb) {
            ((com.bytedance.sdk.openadsdk.core.mw.hhw.fb) fbVar).zmn(j, j2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public boolean zmn(JSONObject jSONObject) {
        nqi nqiVar;
        if (jSONObject == null) {
            this.fs = false;
            return false;
        }
        int i = this.zn;
        if (i != 1 && i != 2) {
            this.fs = false;
            return false;
        }
        int optInt = jSONObject.optInt("switch", 0);
        float optDouble = (float) jSONObject.optDouble("speed", 0.0d);
        this.fb = optDouble;
        if (optDouble <= 0.0f && (nqiVar = this.klz) != null && nqiVar.el() != null) {
            this.fb = this.klz.el().zmn();
        }
        boolean z = optInt == 1;
        this.fs = z;
        com.bytedance.sdk.openadsdk.component.hhw.fs fsVar = this.hhw;
        if (fsVar != null) {
            fsVar.zmn(this.zn, this.fb, z);
            com.bytedance.sdk.openadsdk.component.zg.zn znVar = this.zg;
            if (znVar != null && znVar.fs() != null && this.nps != null) {
                this.zg.fs().zmn(this.nps.zmn());
                iqz.zmn("PAGAppOpenAdExpressView", "isAccelerate =" + this.fs + ",total duration = " + this.zg.fs().olo());
            }
        }
        if (this.zn == 1) {
            return true;
        }
        if (!this.fs) {
            this.fb = 1.0f;
        }
        com.bytedance.sdk.openadsdk.component.zg.zn znVar2 = this.zg;
        if (znVar2 != null) {
            return znVar2.zmn(this.fb);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void fs() {
        super.fs();
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn(int i) {
        com.bytedance.sdk.openadsdk.component.zg.zn znVar = this.zg;
        if (znVar == null) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                znVar.zg();
                this.hhw.fb();
                return;
            } else if (i == 3) {
                znVar.bvs();
                this.hhw.zn();
                return;
            } else if (i == 4) {
                znVar.iv();
                return;
            } else if (i != 5) {
                return;
            }
        }
        if (znVar.btk() || this.zg.hhw()) {
            return;
        }
        this.zg.zmn(getVideoFrameLayout(), this.btk, this.klz);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void hhw() {
        com.bytedance.sdk.openadsdk.component.hhw.zmn zmnVar = this.so;
        if (zmnVar != null) {
            zmnVar.fs(this);
        }
    }

    public void setTopListener(com.bytedance.sdk.openadsdk.component.hhw.zmn zmnVar) {
        this.so = zmnVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public int btk() {
        com.bytedance.sdk.openadsdk.component.zg.zn znVar = this.zg;
        if (znVar != null && znVar.nps()) {
            return 1;
        }
        com.bytedance.sdk.openadsdk.component.zg.zn znVar2 = this.zg;
        if (znVar2 != null && znVar2.hhw()) {
            return 3;
        }
        com.bytedance.sdk.openadsdk.component.zg.zn znVar3 = this.zg;
        if (znVar3 != null && znVar3.btk()) {
            return 2;
        }
        com.bytedance.sdk.openadsdk.component.zg.zn znVar4 = this.zg;
        if (znVar4 != null && znVar4.zn()) {
            nps(4);
            return 4;
        }
        com.bytedance.sdk.openadsdk.component.zg.zn znVar5 = this.zg;
        return (znVar5 == null || !znVar5.fb()) ? 3 : 5;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public long zn() {
        return this.nps.zn();
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public long fb() {
        return this.nps.zn();
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
        return this.ev;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    protected int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.component.nps.zmn.zmn(this.klz, kgc.fb().nps(String.valueOf(this.klz.qvo())));
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    protected void zmn(mw.zmn zmnVar) {
        zmnVar.btk(com.bytedance.sdk.openadsdk.component.nps.zmn.zmn());
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    protected void zn(JSONObject jSONObject) {
        nqi nqiVar = this.klz;
        boolean z = nqiVar != null && nqiVar.skn() == 0;
        nqi nqiVar2 = this.klz;
        com.bytedance.sdk.openadsdk.component.nps.zmn.zmn(jSONObject, nqiVar2 != null ? nqiVar2.qvo() : 0, z);
    }
}
