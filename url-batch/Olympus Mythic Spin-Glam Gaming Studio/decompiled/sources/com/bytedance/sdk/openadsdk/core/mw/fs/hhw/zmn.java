package com.bytedance.sdk.openadsdk.core.mw.fs.hhw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class zmn extends com.bytedance.adsdk.ugeno.bvs.fs.zmn {
    private final com.bytedance.adsdk.ugeno.bvs.fs.zmn fs;
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
        com.bytedance.adsdk.ugeno.bvs.fs.zmn zmnVar2 = new com.bytedance.adsdk.ugeno.bvs.fs.zmn(context);
        this.fs = zmnVar2;
        zmnVar2.setBackgroundColor(0);
        addView(zmnVar2, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.fs.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.fs.setOnTouchListener(onTouchListener);
    }

    public com.bytedance.adsdk.ugeno.bvs.fs.zmn getVideoView() {
        return this.zmn;
    }

    public com.bytedance.adsdk.ugeno.bvs.fs.zmn getMarkView() {
        return this.fs;
    }
}
