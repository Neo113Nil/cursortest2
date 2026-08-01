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
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class p8 extends FrameLayout {
    public static final o8 q = new o8(0);
    public q8 f;
    public final gd0 g;
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
    public p8(Context context, AttributeSet attributeSet) {
        super(mv.V(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, c70.I);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.h = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.g = gd0.g(context2, attributeSet, 0, 0).a();
        }
        this.i = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(mv.r(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(xc0.b(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.j = obtainStyledAttributes.getFloat(1, 1.0f);
        this.k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.l = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(q);
        setFocusable(true);
        if (getBackground() == null) {
            int J = bi.J(bi.W(getContext(), n9.M(this, R.attr.colorSurface)), bi.W(getContext(), n9.M(this, R.attr.colorOnSurface)), getBackgroundOverlayColorAlpha());
            gd0 gd0Var = this.g;
            if (gd0Var != null) {
                ho hoVar = q8.u;
                g10 g10Var = new g10(gd0Var);
                g10Var.r(ColorStateList.valueOf(J));
                gradientDrawable = g10Var;
            } else {
                Resources resources = getResources();
                ho hoVar2 = q8.u;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(J);
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
    public void setBaseTransientBottomBar(q8 q8Var) {
        this.f = q8Var;
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
        q8 q8Var = this.f;
        if (q8Var != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = q8Var.i.getRootWindowInsets()) != null) {
            mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
            i = mandatorySystemGestureInsets.bottom;
            q8Var.p = i;
            q8Var.e();
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
        q8 q8Var = this.f;
        if (q8Var != null) {
            wi i2 = wi.i();
            n8 n8Var = q8Var.t;
            synchronized (i2.f) {
                i = 1;
                if (!i2.l(n8Var)) {
                    de0 de0Var = (de0) i2.i;
                    z = false;
                }
                z = true;
            }
            if (z) {
                q8.x.post(new k8(q8Var, i));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        q8 q8Var = this.f;
        if (q8Var == null || !q8Var.r) {
            return;
        }
        q8Var.d();
        q8Var.r = false;
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
        q8 q8Var = this.f;
        if (q8Var != null) {
            ho hoVar = q8.u;
            q8Var.e();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : q);
        super.setOnClickListener(onClickListener);
    }
}
