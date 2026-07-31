package com.bytedance.sdk.openadsdk.component.bvs;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.cyb;
import com.bytedance.sdk.openadsdk.core.widget.olo;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public abstract class zn extends com.bytedance.sdk.openadsdk.core.hhw.nps {
    com.bytedance.sdk.openadsdk.core.hhw.zg btk;
    olo bvs;
    PAGLogoView fb;
    com.bytedance.sdk.openadsdk.core.hhw.zn fs;
    olo hhw;
    com.bytedance.sdk.openadsdk.core.hhw.zg iv;
    com.bytedance.sdk.openadsdk.core.widget.zn klz;
    com.bytedance.sdk.openadsdk.core.hhw.zg nps;
    com.bytedance.sdk.openadsdk.core.hhw.zg rc;
    final nps zg;
    com.bytedance.sdk.openadsdk.core.hhw.fb zmn;
    com.bytedance.sdk.openadsdk.core.hhw.fb zn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.nps, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public abstract com.bytedance.sdk.openadsdk.core.hhw.fb getAdIconView();

    public abstract com.bytedance.sdk.openadsdk.core.hhw.zg getAdTitleTextView();

    public com.bytedance.sdk.openadsdk.core.hhw.btk getOverlayLayout() {
        return null;
    }

    public abstract cyb getScoreBar();

    public abstract View getUserInfo();

    @Override // com.bytedance.sdk.openadsdk.core.hhw.nps, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public zn(Context context) {
        super(context);
        this.zg = new nps(context);
    }

    public olo getIconOnlyView() {
        return this.bvs;
    }

    public com.bytedance.sdk.openadsdk.core.hhw.zg getTitle() {
        return this.iv;
    }

    public com.bytedance.sdk.openadsdk.core.hhw.zg getContent() {
        return this.rc;
    }

    public com.bytedance.sdk.openadsdk.core.hhw.fb getBackImage() {
        return this.zmn;
    }

    public com.bytedance.sdk.openadsdk.core.hhw.zn getVideoContainer() {
        return this.fs;
    }

    public com.bytedance.sdk.openadsdk.core.hhw.fb getImageView() {
        return this.zn;
    }

    public PAGLogoView getAdLogo() {
        return this.fb;
    }

    public com.bytedance.sdk.openadsdk.core.hhw.zg getClickButton() {
        return this.btk;
    }

    public olo getHostAppIcon() {
        return this.hhw;
    }

    public com.bytedance.sdk.openadsdk.core.hhw.zg getHostAppName() {
        return this.nps;
    }

    public com.bytedance.sdk.openadsdk.core.widget.zn getDspAdChoice() {
        return this.klz;
    }

    public View getTopDisLike() {
        nps npsVar = this.zg;
        if (npsVar != null) {
            return npsVar.getTopDislike();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.hhw.fb getTopSkip() {
        nps npsVar = this.zg;
        if (npsVar != null) {
            return npsVar.getTopSkip();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.hhw.zg getTopCountDown() {
        nps npsVar = this.zg;
        if (npsVar != null) {
            return npsVar.getTopCountDown();
        }
        return null;
    }
}
