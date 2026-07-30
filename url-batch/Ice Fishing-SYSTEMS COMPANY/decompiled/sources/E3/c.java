package E3;

import C3.g;
import C3.k;
import O.J;
import O.L;
import O.X;
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
import com.icefishing.icefishingliveapp.C5284R;
import i3.AbstractC4576a;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class c extends FrameLayout {

    /* renamed from: B, reason: collision with root package name */
    public static final b f813B = new b(0);

    /* renamed from: A, reason: collision with root package name */
    public PorterDuff.Mode f814A;

    /* renamed from: n, reason: collision with root package name */
    public final k f815n;

    /* renamed from: u, reason: collision with root package name */
    public int f816u;

    /* renamed from: v, reason: collision with root package name */
    public final float f817v;

    /* renamed from: w, reason: collision with root package name */
    public final float f818w;

    /* renamed from: x, reason: collision with root package name */
    public final int f819x;

    /* renamed from: y, reason: collision with root package name */
    public final int f820y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f821z;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(H3.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC4576a.f38314x);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = X.f2240a;
            L.s(this, dimensionPixelSize);
        }
        this.f816u = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f815n = k.b(context2, attributeSet, 0, 0).a();
        }
        this.f817v = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(com.bumptech.glide.d.o(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(w3.k.g(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f818w = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f819x = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f820y = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f813B);
        setFocusable(true);
        if (getBackground() == null) {
            int n9 = U2.a.n(U2.a.f(C5284R.attr.colorSurface, this), U2.a.f(C5284R.attr.colorOnSurface, this), getBackgroundOverlayColorAlpha());
            k kVar = this.f815n;
            if (kVar != null) {
                int i = d.f822a;
                g gVar = new g(kVar);
                gVar.j(ColorStateList.valueOf(n9));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                int i4 = d.f822a;
                float dimension = resources.getDimension(C5284R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(n9);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f821z;
            if (colorStateList != null) {
                H.a.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = X.f2240a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f818w;
    }

    public int getAnimationMode() {
        return this.f816u;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f817v;
    }

    public int getMaxInlineActionWidth() {
        return this.f820y;
    }

    public int getMaxWidth() {
        return this.f819x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = X.f2240a;
        J.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        int i9 = this.f819x;
        if (i9 <= 0 || getMeasuredWidth() <= i9) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), i4);
    }

    public void setAnimationMode(int i) {
        this.f816u = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f821z != null) {
            drawable = drawable.mutate();
            H.a.h(drawable, this.f821z);
            H.a.i(drawable, this.f814A);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f821z = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            H.a.h(mutate, colorStateList);
            H.a.i(mutate, this.f814A);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f814A = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            H.a.i(mutate, mode);
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
        setOnTouchListener(onClickListener != null ? null : f813B);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
