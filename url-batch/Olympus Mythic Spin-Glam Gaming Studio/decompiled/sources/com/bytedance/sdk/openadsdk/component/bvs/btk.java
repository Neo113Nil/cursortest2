package com.bytedance.sdk.openadsdk.component.bvs;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.iv.hhw;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.cyb;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes14.dex */
public class btk extends zn {
    zmn mw;

    public interface zmn {
        void zmn(View view, int i);
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn, com.bytedance.sdk.openadsdk.core.hhw.nps, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn
    public com.bytedance.sdk.openadsdk.core.hhw.fb getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn
    public com.bytedance.sdk.openadsdk.core.hhw.zg getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn
    public cyb getScoreBar() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn
    public View getUserInfo() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bvs.zn, com.bytedance.sdk.openadsdk.core.hhw.nps, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public btk(Context context, nqi nqiVar) {
        super(context);
        zmn(context, nqiVar);
    }

    private void zmn(Context context, nqi nqiVar) {
        com.bytedance.sdk.openadsdk.core.iv.hhw hhwVar = new com.bytedance.sdk.openadsdk.core.iv.hhw(context);
        com.bytedance.sdk.openadsdk.core.iv.fb.zmn().zn(hhwVar);
        hhwVar.zmn(nqiVar, new hhw.fs() { // from class: com.bytedance.sdk.openadsdk.component.bvs.btk.1
            @Override // com.bytedance.sdk.openadsdk.core.iv.hhw.fs
            public void fs() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.hhw.fs
            public void zmn(int i, int i2) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.hhw.fs
            public View zmn() {
                return btk.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.hhw.fs
            public void zmn(View view, int i) {
                zmn zmnVar = btk.this.mw;
                if (zmnVar != null) {
                    zmnVar.zmn(view, i);
                }
            }
        }, "open_ad");
        addView(hhwVar, new ViewGroup.LayoutParams(-1, -1));
        hhwVar.kw();
        int fs = jy.fs(context, 9.0f);
        int fs2 = jy.fs(context, 10.0f);
        this.fb = PAGLogoView.createPAGLogoViewByMaterial(context, nqiVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, jy.fs(context, 14.0f));
        layoutParams.leftMargin = fs2;
        layoutParams.bottomMargin = fs2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.fb, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.zn znVar = new com.bytedance.sdk.openadsdk.core.widget.zn(context);
        this.klz = znVar;
        znVar.setPadding(fs, 0, fs, 0);
        this.klz.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(jy.fs(context, 32.0f), jy.fs(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, fs2, fs2);
        addView(this.klz, layoutParams2);
        View view = this.zg;
        if (view != null) {
            addView(view);
        }
    }

    public void setRenderListener(zmn zmnVar) {
        this.mw = zmnVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mw = null;
    }
}
