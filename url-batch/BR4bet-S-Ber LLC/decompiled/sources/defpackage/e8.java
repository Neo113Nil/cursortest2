package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class e8 extends FrameLayout {
    public static final d8 q = new d8(0);
    public f8 f;
    public final f50 g;
    public int h;
    public final float i;
    public final float j;
    public final int k;
    public final int l;
    public ColorStateList m;
    public PorterDuff.Mode n;
    public Rect o;
    public boolean p;

    /* JADX WARN: Multi-variable type inference failed */
    public e8(Context context, AttributeSet attributeSet) {
        super(la0.j0(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, y00.J);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.h = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.g = f50.g(context2, attributeSet, 0, 0).a();
        }
        this.i = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(kr.w(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(la0.S(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.j = obtainStyledAttributes.getFloat(1, 1.0f);
        this.k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.l = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(q);
        setFocusable(true);
        if (getBackground() == null) {
            int z = xf.z(xf.G(getContext(), b9.N(this, R.attr.colorSurface)), xf.G(getContext(), b9.N(this, R.attr.colorOnSurface)), getBackgroundOverlayColorAlpha());
            f50 f50Var = this.g;
            if (f50Var != null) {
                hl hlVar = f8.v;
                dw dwVar = new dw(f50Var);
                dwVar.r(ColorStateList.valueOf(z));
                gradientDrawable = dwVar;
            } else {
                Resources resources = getResources();
                hl hlVar2 = f8.v;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(z);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.m;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(f8 f8Var) {
        this.f = f8Var;
    }

    public float getActionTextColorAlpha() {
        return this.j;
    }

    public int getAnimationMode() {
        return this.h;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.i;
    }

    public int getMaxInlineActionWidth() {
        return this.l;
    }

    public int getMaxWidth() {
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i;
        super.onAttachedToWindow();
        f8 f8Var = this.f;
        if (f8Var != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = f8Var.i.getRootWindowInsets()) != null) {
            mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
            i = mandatorySystemGestureInsets.bottom;
            f8Var.q = i;
            f8Var.f();
        }
        requestApplyInsets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if ((r0 != null && r0.a.get() == r1) != false) goto L15;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetachedFromWindow() {
        int i;
        boolean z;
        super.onDetachedFromWindow();
        f8 f8Var = this.f;
        if (f8Var != null) {
            rg o = rg.o();
            b8 b8Var = f8Var.u;
            synchronized (o.f) {
                i = 1;
                if (!o.q(b8Var)) {
                    a60 a60Var = (a60) o.i;
                    z = false;
                }
                z = true;
            }
            if (z) {
                f8.y.post(new y7(f8Var, i));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f8 f8Var = this.f;
        if (f8Var == null || !f8Var.s) {
            return;
        }
        f8Var.e();
        f8Var.s = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.k;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.h = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.m != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.m);
            drawable.setTintMode(this.n);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.m = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.n);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.n = mode;
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
        if (this.p || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.o = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        f8 f8Var = this.f;
        if (f8Var != null) {
            hl hlVar = f8.v;
            f8Var.f();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : q);
        super.setOnClickListener(onClickListener);
    }
}
