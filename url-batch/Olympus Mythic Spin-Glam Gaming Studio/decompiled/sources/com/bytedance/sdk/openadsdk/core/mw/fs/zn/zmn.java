package com.bytedance.sdk.openadsdk.core.mw.fs.zn;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes9.dex */
public class zmn extends com.bytedance.adsdk.ugeno.bvs.fs.zmn {
    private final com.bytedance.adsdk.ugeno.bvs.fs.zmn zmn;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.adsdk.ugeno.bvs.fs.zmn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public zmn(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.bvs.fs.zmn zmnVar = new com.bytedance.adsdk.ugeno.bvs.fs.zmn(context);
        this.zmn = zmnVar;
        addView(zmnVar, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.bvs.fs.zmn getPlayableView() {
        return this.zmn;
    }
}
