package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.doe;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes6.dex */
public class hhw extends com.bytedance.sdk.openadsdk.core.hhw.fb {
    private int fs;
    private float zmn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.fb, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.fb, android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public hhw(Context context) {
        super(context);
        this.zmn = 2.25f;
        this.fs = 12;
        zmn();
    }

    public hhw(Context context, int i, float f) {
        super(context);
        this.zmn = f;
        this.fs = i;
        zmn();
    }

    private void zmn() {
        setBackground(fb.zmn());
        setImageResource(doe.fb(getContext(), "tt_close_btn"));
        int fs = jy.fs(getContext(), this.zmn);
        setPadding(fs, fs, fs, fs);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.fb, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int fs = jy.fs(getContext(), this.fs);
            layoutParams.width = fs;
            layoutParams.height = fs;
        }
        super.setLayoutParams(layoutParams);
    }

    public static com.bytedance.sdk.openadsdk.core.hhw.fb zmn(Context context) {
        return new hhw(context);
    }

    public static com.bytedance.sdk.openadsdk.core.hhw.fb fs(Context context) {
        return new hhw(context, 28, 5.0f);
    }

    public static com.bytedance.sdk.openadsdk.core.hhw.fb zmn(Context context, ViewGroup viewGroup) {
        if (context == null || viewGroup == null) {
            return null;
        }
        hhw hhwVar = new hhw(context, 33, 0.0f);
        hhwVar.setImageResource(doe.fb(context, "tt_ad_close_backup"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = jy.fs(context, 20.0f);
        layoutParams.rightMargin = jy.fs(context, 16.0f);
        hhwVar.setLayoutParams(layoutParams);
        hhwVar.setVisibility(8);
        viewGroup.addView(hhwVar);
        return hhwVar;
    }
}
