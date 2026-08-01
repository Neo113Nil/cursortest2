package N0;

import F0.m;
import L0.g;
import L0.k;
import M.D;
import M.F;
import M.Q;
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
import com.winfour.neondrop.R;
import java.util.WeakHashMap;
import q0.AbstractC0257a;

/* loaded from: classes.dex */
public abstract class c extends FrameLayout {
    public static final b i = new b();

    /* renamed from: a, reason: collision with root package name */
    public final k f634a;

    /* renamed from: b, reason: collision with root package name */
    public int f635b;

    /* renamed from: c, reason: collision with root package name */
    public final float f636c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f637e;

    /* renamed from: f, reason: collision with root package name */
    public final int f638f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f639g;
    public PorterDuff.Mode h;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(Q0.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0257a.f3402z);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = Q.f513a;
            F.s(this, dimensionPixelSize);
        }
        this.f635b = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f634a = k.b(context2, attributeSet, 0, 0).a();
        }
        this.f636c = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(z1.d.v(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(m.g(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.d = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f637e = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f638f = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(i);
        setFocusable(true);
        if (getBackground() == null) {
            int I2 = z1.d.I(z1.d.t(this, R.attr.colorSurface), z1.d.t(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            k kVar = this.f634a;
            if (kVar != null) {
                int i2 = d.f640a;
                g gVar = new g(kVar);
                gVar.l(ColorStateList.valueOf(I2));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                int i3 = d.f640a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(I2);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f639g;
            if (colorStateList != null) {
                F.a.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = Q.f513a;
            setBackground(gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(d dVar) {
    }

    public float getActionTextColorAlpha() {
        return this.d;
    }

    public int getAnimationMode() {
        return this.f635b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f636c;
    }

    public int getMaxInlineActionWidth() {
        return this.f638f;
    }

    public int getMaxWidth() {
        return this.f637e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = Q.f513a;
        D.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.f637e;
        if (i4 <= 0 || getMeasuredWidth() <= i4) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
    }

    public void setAnimationMode(int i2) {
        this.f635b = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f639g != null) {
            drawable = drawable.mutate();
            F.a.h(drawable, this.f639g);
            F.a.i(drawable, this.h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f639g = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            F.a.h(mutate, colorStateList);
            F.a.i(mutate, this.h);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            F.a.i(mutate, mode);
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
        setOnTouchListener(onClickListener != null ? null : i);
        super.setOnClickListener(onClickListener);
    }
}
