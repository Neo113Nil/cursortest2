package Q0;

import K.E;
import K.G;
import K.S;
import O0.g;
import O0.k;
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
import com.clutchquizarena.app.R;
import java.util.WeakHashMap;
import u0.AbstractC0361a;

/* loaded from: classes.dex */
public abstract class c extends FrameLayout {
    public static final b i = new b();

    /* renamed from: a, reason: collision with root package name */
    public final k f637a;

    /* renamed from: b, reason: collision with root package name */
    public int f638b;

    /* renamed from: c, reason: collision with root package name */
    public final float f639c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f640e;

    /* renamed from: f, reason: collision with root package name */
    public final int f641f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f642g;
    public PorterDuff.Mode h;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(T0.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0361a.f3748x);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = S.f365a;
            G.s(this, dimensionPixelSize);
        }
        this.f638b = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f637a = k.b(context2, attributeSet, 0, 0).a();
        }
        this.f639c = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(A.c.H(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(I0.k.g(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.d = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f640e = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f641f = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(i);
        setFocusable(true);
        if (getBackground() == null) {
            int h02 = A.c.h0(A.c.E(this, R.attr.colorSurface), A.c.E(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            k kVar = this.f637a;
            if (kVar != null) {
                int i2 = d.f643a;
                g gVar = new g(kVar);
                gVar.j(ColorStateList.valueOf(h02));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                int i3 = d.f643a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(h02);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f642g;
            if (colorStateList != null) {
                D.a.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = S.f365a;
            setBackground(gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(d dVar) {
    }

    public float getActionTextColorAlpha() {
        return this.d;
    }

    public int getAnimationMode() {
        return this.f638b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f639c;
    }

    public int getMaxInlineActionWidth() {
        return this.f641f;
    }

    public int getMaxWidth() {
        return this.f640e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = S.f365a;
        E.c(this);
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
        int i4 = this.f640e;
        if (i4 <= 0 || getMeasuredWidth() <= i4) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
    }

    public void setAnimationMode(int i2) {
        this.f638b = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f642g != null) {
            drawable = drawable.mutate();
            D.a.h(drawable, this.f642g);
            D.a.i(drawable, this.h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f642g = colorStateList;
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
