package com.bytedance.adsdk.ugeno.bvs.btk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.fb;
import com.bytedance.adsdk.ugeno.nps.zg;

/* loaded from: classes.dex */
public class zmn extends FrameLayout {
    private LinearLayout btk;
    private float fb;
    private float fs;
    private LinearLayout hhw;
    private Context nps;
    private fb zg;
    private float zmn;
    private double zn;

    public zmn(Context context) {
        super(context);
        this.nps = context;
        this.btk = new LinearLayout(context);
        this.hhw = new LinearLayout(context);
        this.btk.setOrientation(0);
        this.btk.setGravity(8388611);
        this.hhw.setOrientation(0);
        this.hhw.setGravity(8388611);
    }

    public void zmn(double d, int i, int i2, float f, int i3) {
        removeAllViews();
        this.btk.removeAllViews();
        this.hhw.removeAllViews();
        this.zmn = (int) zg.zmn(this.nps, f);
        this.fs = (int) zg.zmn(this.nps, f);
        this.zn = d;
        this.fb = i3;
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            zmn(starImageView, "tt_ugen_rating_star");
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            this.hhw.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            zmn(starImageView2, "tt_ugen_rating_star");
            starImageView2.setColorFilter(i2);
            this.btk.addView(starImageView2);
        }
        addView(this.btk);
        addView(this.hhw);
        requestLayout();
    }

    public void zmn(ImageView imageView, String str) {
        imageView.setImageResource(com.bytedance.adsdk.ugeno.nps.fb.fs(this.nps, str));
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.zmn, (int) this.fs);
        float f = this.fb;
        layoutParams.leftMargin = (int) f;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        fb fbVar = this.zg;
        if (fbVar != null) {
            fbVar.zmn(i, i2);
        }
        super.onMeasure(i, i2);
        this.btk.measure(i, i2);
        double floor = Math.floor(this.zn);
        this.hhw.measure(View.MeasureSpec.makeMeasureSpec((int) (((r0 + r0 + r2) * floor) + this.fb + ((this.zn - floor) * this.zmn)), 1073741824), View.MeasureSpec.makeMeasureSpec(this.btk.getMeasuredHeight(), 1073741824));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        fb fbVar = this.zg;
        if (fbVar != null) {
            fbVar.zmn(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fb fbVar = this.zg;
        if (fbVar != null) {
            fbVar.nps();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fb fbVar = this.zg;
        if (fbVar != null) {
            fbVar.zg();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        fb fbVar = this.zg;
        if (fbVar != null) {
            fbVar.fs(i, i2, i3, i4);
        }
    }

    public void zmn(fb fbVar) {
        this.zg = fbVar;
    }
}
