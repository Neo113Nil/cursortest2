package n2;

import a.y;
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
import com.oriondriftchasers.arordrft.R;
import e2.o;
import l2.j;
import l2.n;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class c extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final b f2834n = new b();

    /* renamed from: f, reason: collision with root package name */
    public final n f2835f;

    /* renamed from: g, reason: collision with root package name */
    public int f2836g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2837h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2838j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2839k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f2840l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f2841m;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(q2.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, n1.a.F);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f2836g = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f2835f = n.c(context2, attributeSet, 0, 0).a();
        }
        this.f2837h = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(h.a.t(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(o.h(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.i = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f2838j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f2839k = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f2834n);
        setFocusable(true);
        if (getBackground() == null) {
            int J = y.J(y.A(this, R.attr.colorSurface), y.A(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            n nVar = this.f2835f;
            if (nVar != null) {
                int i = d.f2842a;
                j jVar = new j(nVar);
                jVar.q(ColorStateList.valueOf(J));
                gradientDrawable = jVar;
            } else {
                Resources resources = getResources();
                int i4 = d.f2842a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(J);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f2840l;
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
        return this.f2836g;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f2837h;
    }

    public int getMaxInlineActionWidth() {
        return this.f2839k;
    }

    public int getMaxWidth() {
        return this.f2838j;
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
    public final void onLayout(boolean z3, int i, int i4, int i5, int i6) {
        super.onLayout(z3, i, i4, i5, i6);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        int i5 = this.f2838j;
        if (i5 <= 0 || getMeasuredWidth() <= i5) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i4);
    }

    public void setAnimationMode(int i) {
        this.f2836g = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f2840l != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f2840l);
            drawable.setTintMode(this.f2841m);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f2840l = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f2841m);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f2841m = mode;
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
        setOnTouchListener(onClickListener != null ? null : f2834n);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
