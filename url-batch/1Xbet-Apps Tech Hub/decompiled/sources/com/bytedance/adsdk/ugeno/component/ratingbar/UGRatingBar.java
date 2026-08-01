package com.bytedance.adsdk.ugeno.component.ratingbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.adsdk.ugeno.icD;
import com.bytedance.adsdk.ugeno.icD.Jd;
import com.bytedance.adsdk.ugeno.icD.so;

/* loaded from: classes.dex */
public class UGRatingBar extends FrameLayout {
    private Drawable Jd;
    private Context Mxy;
    private double NB;
    private icD Wyp;
    private float icD;
    private float pvs;
    private float sUS;
    private LinearLayout so;
    private Drawable vG;
    private LinearLayout yiw;

    public UGRatingBar(Context context) {
        super(context);
        this.Mxy = context;
        this.yiw = new LinearLayout(context);
        this.so = new LinearLayout(context);
        this.yiw.setOrientation(0);
        this.yiw.setGravity(GravityCompat.START);
        this.so.setOrientation(0);
        this.so.setGravity(GravityCompat.START);
        this.vG = Jd.pvs(context, "tt_star_thick");
        this.Jd = Jd.pvs(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.vG;
    }

    public Drawable getStarFillDrawable() {
        return this.Jd;
    }

    public void pvs(double d, int i, int i2, int i3) {
        removeAllViews();
        this.yiw.removeAllViews();
        this.so.removeAllViews();
        float f = i2;
        this.pvs = (int) so.pvs(this.Mxy, f);
        this.icD = (int) so.pvs(this.Mxy, f);
        this.NB = d;
        this.sUS = i3;
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.so.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.yiw.addView(starImageView2);
        }
        addView(this.yiw);
        addView(this.so);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.pvs, (int) this.icD);
        layoutParams.leftMargin = 1;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = 1;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        icD icd = this.Wyp;
        if (icd != null) {
            icd.pvs(i, i2);
        }
        super.onMeasure(i, i2);
        this.yiw.measure(i, i2);
        double floor = Math.floor(this.NB);
        this.so.measure(View.MeasureSpec.makeMeasureSpec((int) (((2.0f + r0) * floor) + 1.0d + ((this.NB - floor) * this.pvs)), 1073741824), View.MeasureSpec.makeMeasureSpec(this.yiw.getMeasuredHeight(), 1073741824));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        icD icd = this.Wyp;
        if (icd != null) {
            icd.pvs(i, i2, i3, i4);
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
        icD icd = this.Wyp;
        if (icd != null) {
            icd.sUS();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        icD icd = this.Wyp;
        if (icd != null) {
            icd.yiw();
        }
    }

    public void pvs(icD icd) {
        this.Wyp = icd;
    }
}
