package L0;

import D0.n;
import J0.g;
import J0.k;
import K.F;
import K.H;
import K.T;
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
import com.playbag.tripgear.R;
import java.util.WeakHashMap;
import m.C0260a;
import p0.AbstractC0282a;
import w1.l;

/* loaded from: classes.dex */
public abstract class c extends FrameLayout {
    public static final b i = new b();

    /* renamed from: a, reason: collision with root package name */
    public final k f547a;

    /* renamed from: b, reason: collision with root package name */
    public int f548b;

    /* renamed from: c, reason: collision with root package name */
    public final float f549c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f550e;

    /* renamed from: f, reason: collision with root package name */
    public final int f551f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f552g;
    public PorterDuff.Mode h;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(O0.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0282a.f3450x);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = T.f423a;
            H.s(this, dimensionPixelSize);
        }
        this.f548b = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f547a = k.b(context2, attributeSet, 0, 0).a();
        }
        this.f549c = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(l.v(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(n.g(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.d = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f550e = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f551f = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(i);
        setFocusable(true);
        if (getBackground() == null) {
            int m2 = C0260a.m(C0260a.j(this, R.attr.colorSurface), C0260a.j(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            k kVar = this.f547a;
            if (kVar != null) {
                int i2 = d.f553a;
                g gVar = new g(kVar);
                gVar.j(ColorStateList.valueOf(m2));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                int i3 = d.f553a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(m2);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f552g;
            if (colorStateList != null) {
                D.a.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = T.f423a;
            setBackground(gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(d dVar) {
    }

    public float getActionTextColorAlpha() {
        return this.d;
    }

    public int getAnimationMode() {
        return this.f548b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f549c;
    }

    public int getMaxInlineActionWidth() {
        return this.f551f;
    }

    public int getMaxWidth() {
        return this.f550e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = T.f423a;
        F.c(this);
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
        int i4 = this.f550e;
        if (i4 <= 0 || getMeasuredWidth() <= i4) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
    }

    public void setAnimationMode(int i2) {
        this.f548b = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f552g != null) {
            drawable = drawable.mutate();
            D.a.h(drawable, this.f552g);
            D.a.i(drawable, this.h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f552g = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            D.a.h(mutate, colorStateList);
            D.a.i(mutate, this.h);
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
            D.a.i(mutate, mode);
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
