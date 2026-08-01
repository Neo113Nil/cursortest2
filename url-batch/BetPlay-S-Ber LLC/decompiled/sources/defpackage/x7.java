package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.awerser.monnit.betplay.R;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class x7 extends FrameLayout {
    public static final w7 n = new w7();
    public final n20 f;
    public int g;
    public final float h;
    public final float i;
    public final int j;
    public final int k;
    public ColorStateList l;
    public PorterDuff.Mode m;

    /* JADX WARN: Multi-variable type inference failed */
    public x7(Context context, AttributeSet attributeSet) {
        super(op.Z(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ly.H);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.g = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f = n20.g(context2, attributeSet, 0, 0).a();
        }
        this.h = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(op.x(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(l70.H(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.i = obtainStyledAttributes.getFloat(1, 1.0f);
        this.j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.k = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(n);
        setFocusable(true);
        if (getBackground() == null) {
            int D = j8.D(j8.L(getContext(), l70.S(this, R.attr.colorSurface)), j8.L(getContext(), l70.S(this, R.attr.colorOnSurface)), getBackgroundOverlayColorAlpha());
            n20 n20Var = this.f;
            if (n20Var != null) {
                int i = y7.a;
                rt rtVar = new rt(n20Var);
                rtVar.r(ColorStateList.valueOf(D));
                gradientDrawable = rtVar;
            } else {
                Resources resources = getResources();
                int i2 = y7.a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(D);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.l;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.i;
    }

    public int getAnimationMode() {
        return this.g;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.h;
    }

    public int getMaxInlineActionWidth() {
        return this.k;
    }

    public int getMaxWidth() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.j;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.g = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.l != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.l);
            drawable.setTintMode(this.m);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.m);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : n);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(y7 y7Var) {
    }
}
