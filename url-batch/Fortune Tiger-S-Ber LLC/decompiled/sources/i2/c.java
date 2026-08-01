package i2;

import a2.p;
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
import com.gglhk.bofio.fortunetiger.R;
import g2.j;
import g2.o;
import k3.m;
import l0.g;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class c extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final b f2097n = new b();

    /* renamed from: f, reason: collision with root package name */
    public final o f2098f;
    public int g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final float f2099i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2100j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2101k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f2102l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f2103m;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(l2.a.b(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, l1.a.C);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.g = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f2098f = o.f(context2, attributeSet, 0, 0).a();
        }
        this.h = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(m.u(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(p.f(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f2099i = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f2100j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f2101k = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(f2097n);
        setFocusable(true);
        if (getBackground() == null) {
            int o4 = g.o(g.t(getContext(), k3.d.a0(this, R.attr.colorSurface)), g.t(getContext(), k3.d.a0(this, R.attr.colorOnSurface)), getBackgroundOverlayColorAlpha());
            o oVar = this.f2098f;
            if (oVar != null) {
                int i4 = d.f2104a;
                j jVar = new j(oVar);
                jVar.q(ColorStateList.valueOf(o4));
                gradientDrawable = jVar;
            } else {
                Resources resources = getResources();
                int i5 = d.f2104a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(o4);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f2102l;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f2099i;
    }

    public int getAnimationMode() {
        return this.g;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.h;
    }

    public int getMaxInlineActionWidth() {
        return this.f2101k;
    }

    public int getMaxWidth() {
        return this.f2100j;
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
    public final void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int i6 = this.f2100j;
        if (i6 <= 0 || getMeasuredWidth() <= i6) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i5);
    }

    public void setAnimationMode(int i4) {
        this.g = i4;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f2102l != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f2102l);
            drawable.setTintMode(this.f2103m);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f2102l = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f2103m);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f2103m = mode;
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
        setOnTouchListener(onClickListener != null ? null : f2097n);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
