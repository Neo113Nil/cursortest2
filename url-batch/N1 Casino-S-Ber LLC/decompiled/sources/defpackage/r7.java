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
import com.derinko.gbini.n1casino.R;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class r7 extends FrameLayout {
    public static final q7 q = new q7(0);
    public s7 f;
    public final d20 g;
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
    public r7(Context context, AttributeSet attributeSet) {
        super(e70.W(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, vx.G);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.h = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.g = d20.g(context2, attributeSet, 0, 0).a();
        }
        this.i = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(e70.y(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(u90.b(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.j = obtainStyledAttributes.getFloat(1, 1.0f);
        this.k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.l = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(q);
        setFocusable(true);
        if (getBackground() == null) {
            int I = jw.I(jw.X(getContext(), zo.L(this, R.attr.colorSurface)), jw.X(getContext(), zo.L(this, R.attr.colorOnSurface)), getBackgroundOverlayColorAlpha());
            d20 d20Var = this.g;
            if (d20Var != null) {
                zi ziVar = s7.t;
                ct ctVar = new ct(d20Var);
                ctVar.r(ColorStateList.valueOf(I));
                gradientDrawable = ctVar;
            } else {
                Resources resources = getResources();
                zi ziVar2 = s7.t;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(I);
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
    public void setBaseTransientBottomBar(s7 s7Var) {
        this.f = s7Var;
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
        s7 s7Var = this.f;
        if (s7Var != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = s7Var.i.getRootWindowInsets()) != null) {
            mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
            i = mandatorySystemGestureInsets.bottom;
            s7Var.o = i;
            s7Var.e();
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
        s7 s7Var = this.f;
        if (s7Var != null) {
            we o = we.o();
            p7 p7Var = s7Var.s;
            synchronized (o.f) {
                i = 1;
                if (!o.q(p7Var)) {
                    y20 y20Var = (y20) o.i;
                    z = false;
                }
                z = true;
            }
            if (z) {
                s7.w.post(new m7(s7Var, i));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        s7 s7Var = this.f;
        if (s7Var == null || !s7Var.q) {
            return;
        }
        s7Var.d();
        s7Var.q = false;
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
        s7 s7Var = this.f;
        if (s7Var != null) {
            zi ziVar = s7.t;
            s7Var.e();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : q);
        super.setOnClickListener(onClickListener);
    }
}
