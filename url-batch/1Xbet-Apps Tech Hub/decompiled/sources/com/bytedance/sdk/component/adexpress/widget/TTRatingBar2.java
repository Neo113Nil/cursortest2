package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.adexpress.dynamic.Jd.qh;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class TTRatingBar2 extends FrameLayout {
    private static final int Mxy = (qh.icD("", 0.0f, true)[1] / 2) + 1;
    private static final int Wyp = (qh.icD("", 0.0f, true)[1] / 2) + 3;
    private float Jd;
    private Drawable NB;
    LinearLayout icD;
    LinearLayout pvs;
    private Drawable sUS;
    private float so;
    private float vG;
    private double yiw;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pvs = new LinearLayout(getContext());
        this.icD = new LinearLayout(getContext());
        this.pvs.setOrientation(0);
        this.pvs.setGravity(GravityCompat.START);
        this.icD.setOrientation(0);
        this.icD.setGravity(GravityCompat.START);
        this.NB = uc.vG(context, "tt_star_thick");
        this.sUS = uc.vG(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.NB;
    }

    public Drawable getStarFillDrawable() {
        return this.sUS;
    }

    public void pvs(double d, int i, int i2, int i3) {
        float f = i2;
        this.vG = (int) yiw.vG(getContext(), f);
        this.Jd = (int) yiw.vG(getContext(), f);
        this.yiw = d;
        this.so = i3;
        removeAllViews();
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.icD.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.pvs.addView(starImageView2);
        }
        addView(this.pvs);
        addView(this.icD);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.vG, (int) this.Jd));
        imageView.setPadding(1, Mxy, 1, Wyp);
        return imageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.pvs.measure(i, i2);
        double d = this.yiw;
        float f = this.vG;
        this.icD.measure(View.MeasureSpec.makeMeasureSpec((int) ((((int) d) * f) + 1.0f + ((f - 2.0f) * (d - ((int) d)))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.pvs.getMeasuredHeight(), 1073741824));
        if (this.so > 0.0f) {
            this.pvs.setPadding(0, ((int) (r7.getMeasuredHeight() - this.so)) / 2, 0, 0);
            this.icD.setPadding(0, ((int) (this.pvs.getMeasuredHeight() - this.so)) / 2, 0, 0);
        }
    }
}
