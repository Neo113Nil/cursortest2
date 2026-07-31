package com.bytedance.sdk.openadsdk.core.iv;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class kgc extends zmn {
    private phc klz;
    private FrameLayout mw;
    private FrameLayout zmn;

    @Override // com.bytedance.sdk.openadsdk.core.iv.zmn, com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.zmn, com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public kgc(@NonNull Context context) {
        super(context);
        this.fs = context;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, phc phcVar, ViewGroup viewGroup) {
        if (nqiVar == null) {
            return;
        }
        setBackgroundColor(-1);
        this.zn = nqiVar;
        this.klz = phcVar;
        if (nqiVar.ldx() == 7) {
            this.hhw = "rewarded_video";
        } else {
            this.hhw = "fullscreen_interstitial_ad";
        }
        fs();
        if (com.bytedance.sdk.openadsdk.core.model.iqz.zn(nqiVar)) {
            this.klz.addView(this, new ViewGroup.LayoutParams(-1, -1));
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.klz.addView(this, layoutParams);
        }
        int i = com.bytedance.sdk.openadsdk.utils.olo.jf;
        View findViewById = viewGroup.findViewById(i);
        if (findViewById != null) {
            Object tag = findViewById.getTag(i);
            if (tag instanceof String) {
                String str = (String) tag;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn(str, findViewById);
            }
        }
    }

    private void fs() {
        this.nps = jy.fs(this.fs, this.klz.getExpectExpressWidth());
        this.zg = jy.fs(this.fs, this.klz.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.nps, this.zg);
        }
        layoutParams.width = this.nps;
        layoutParams.height = this.zg;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.zn.es();
        zn();
    }

    private void zn() {
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar = new com.bytedance.sdk.openadsdk.core.hhw.zn(this.fs);
        this.zmn = znVar;
        addView(znVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.hhw.zn znVar2 = new com.bytedance.sdk.openadsdk.core.hhw.zn(this.fs);
        this.mw = znVar2;
        this.zmn.addView(znVar2, new FrameLayout.LayoutParams(-1, -1));
        this.mw.removeAllViews();
    }

    public FrameLayout getVideoContainer() {
        return this.mw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.zmn
    protected void zmn(View view, int i, com.bytedance.sdk.openadsdk.core.model.cyb cybVar) {
        phc phcVar = this.klz;
        if (phcVar != null) {
            phcVar.zmn(view, i, cybVar);
        }
    }

    public View getBackupContainerBackgroundView() {
        return this.zmn;
    }
}
