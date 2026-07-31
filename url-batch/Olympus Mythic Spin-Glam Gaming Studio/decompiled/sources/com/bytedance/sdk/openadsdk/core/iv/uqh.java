package com.bytedance.sdk.openadsdk.core.iv;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.fs.mw;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes11.dex */
public class uqh extends phc {
    private boolean fb;
    private btk fs;
    public int zmn;
    private String zn;

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

    public uqh(Activity activity, Context context, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, AdSlot adSlot, String str) {
        super(activity, context, nqiVar, adSlot, str);
        this.zmn = 1;
        this.fb = true;
    }

    public void setRewardControlListener(com.bytedance.sdk.openadsdk.component.reward.zn.hhw hhwVar) {
        if (getJsObject() != null) {
            getJsObject().zmn(hhwVar);
        }
    }

    public void setAdInteractionListener(com.bytedance.sdk.openadsdk.component.reward.zn.zmn zmnVar) {
        if (getJsObject() != null) {
            getJsObject().zmn(zmnVar);
        }
    }

    public void setVideoTrackListener(com.bytedance.sdk.openadsdk.component.reward.zn.bvs bvsVar) {
        if (getJsObject() != null) {
            getJsObject().zmn(bvsVar);
        }
    }

    public void setHeartBeatListener(com.bytedance.sdk.openadsdk.component.reward.zn.fb fbVar) {
        if (getJsObject() != null) {
            getJsObject().zmn(fbVar);
        }
    }

    public void setLandingPageListener(com.bytedance.sdk.openadsdk.component.reward.zn.zmn.zn znVar) {
        if (getJsObject() != null) {
            getJsObject().zmn(znVar);
        }
    }

    public void rt() {
        if (getJsObject() != null) {
            getJsObject().iqz();
        }
    }

    public void zmn(String str, int i, int i2) {
        if (getJsObject() != null) {
            getJsObject().zmn(str, i, i2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    protected void nps() {
        this.cn = true;
        super.nps();
        com.bytedance.sdk.component.bvs.nps webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    protected void zg() {
        this.olo = new com.bytedance.sdk.openadsdk.fb.kw(11, this.iv, this.klz);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.component.adexpress.fs.cn
    public void zmn(com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar, com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
        this.am = fbVar;
        super.zmn(fbVar, rtVar);
    }

    public void setDislikeClickListener(btk btkVar) {
        this.fs = btkVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void hhw() {
        btk btkVar = this.fs;
        if (btkVar != null) {
            btkVar.zmn(this.zn);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.component.adexpress.fs.zg
    public void zmn(View view, int i, com.bytedance.sdk.component.adexpress.zn znVar) {
        if (i != -1 && znVar != null && i == 3) {
            if (znVar instanceof com.bytedance.sdk.openadsdk.core.model.cyb) {
                this.zn = ((com.bytedance.sdk.openadsdk.core.model.cyb) znVar).cyb;
            }
            hhw();
            return;
        }
        super.zmn(view, i, znVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    protected boolean iqz() {
        return this.fb;
    }

    public void setShouldNotifyAdVisibility(boolean z) {
        this.fb = z;
    }

    public void setWebTouchProxy(com.bytedance.sdk.component.bvs.btk btkVar) {
        if (getWebView() != null) {
            getWebView().setWebTouchProxy(btkVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc
    protected void zmn(mw.zmn zmnVar) {
        super.zmn(zmnVar);
        zmnVar.hhw(com.bytedance.sdk.openadsdk.core.model.iqz.btk(this.klz));
    }
}
