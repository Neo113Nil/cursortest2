package com.bytedance.sdk.component.adexpress.hhw;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes3.dex */
public class nqi extends FrameLayout {
    private static final int bvs = (com.bytedance.sdk.component.adexpress.dynamic.btk.rc.fs("", 0.0f, true)[1] / 2) + 1;
    private static final int iv = (com.bytedance.sdk.component.adexpress.dynamic.btk.rc.fs("", 0.0f, true)[1] / 2) + 3;
    private Drawable btk;
    private float fb;
    LinearLayout fs;
    private Drawable hhw;
    private double nps;
    private float zg;
    LinearLayout zmn;
    private float zn;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public nqi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zmn = new LinearLayout(getContext());
        this.fs = new LinearLayout(getContext());
        this.zmn.setOrientation(0);
        this.zmn.setGravity(8388611);
        this.fs.setOrientation(0);
        this.fs.setGravity(8388611);
        this.btk = com.bytedance.sdk.component.utils.doe.zn(context, "tt_star_thick");
        this.hhw = com.bytedance.sdk.component.utils.doe.zn(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.btk;
    }

    public Drawable getStarFillDrawable() {
        return this.hhw;
    }

    public void zmn(double d, int i, int i2, int i3) {
        float f = i2;
        this.zn = (int) com.bytedance.sdk.component.adexpress.fb.nps.zn(getContext(), f);
        this.fb = (int) com.bytedance.sdk.component.adexpress.fb.nps.zn(getContext(), f);
        this.nps = d;
        this.zg = i3;
        removeAllViews();
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.fs.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.zmn.addView(starImageView2);
        }
        addView(this.zmn);
        addView(this.fs);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.zn, (int) this.fb));
        imageView.setPadding(1, bvs, 1, iv);
        return imageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.zmn.measure(i, i2);
        double d = this.nps;
        float f = this.zn;
        this.fs.measure(View.MeasureSpec.makeMeasureSpec((int) ((((int) d) * f) + 1.0f + ((f - 2.0f) * (d - ((int) d)))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.zmn.getMeasuredHeight(), 1073741824));
        if (this.zg > 0.0f) {
            this.zmn.setPadding(0, ((int) (r7.getMeasuredHeight() - this.zg)) / 2, 0, 0);
            this.fs.setPadding(0, ((int) (this.zmn.getMeasuredHeight() - this.zg)) / 2, 0, 0);
        }
    }
}
