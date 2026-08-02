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
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fpj extends FrameLayout {
    private static final View.OnTouchListener h = new fpi();
    public fpk a;
    fog b;
    public int c;
    public final float d;
    public final int e;
    public Rect f;
    public boolean g;
    private final float i;
    private final int j;
    private ColorStateList k;
    private PorterDuff.Mode l;

    /* JADX WARN: Multi-variable type inference failed */
    protected fpj(Context context, AttributeSet attributeSet) {
        super(frj.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, fpl.a);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.c = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.b = new fog(fog.k(context2, attributeSet, 0, 0));
        }
        float f = obtainStyledAttributes.getFloat(3, 1.0f);
        this.i = f;
        setBackgroundTintList(fny.e(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(a.q(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.d = obtainStyledAttributes.getFloat(1, 1.0f);
        this.j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.e = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(h);
        setFocusable(true);
        if (getBackground() == null) {
            int e = fhq.e(fhq.c(this, R.attr.colorSurface), fhq.c(this, R.attr.colorOnSurface), f);
            fog fogVar = this.b;
            if (fogVar != null) {
                String str = fpk.b;
                fob fobVar = new fob(fogVar);
                fobVar.M(ColorStateList.valueOf(e));
                gradientDrawable = fobVar;
            } else {
                Resources resources = getResources();
                String str2 = fpk.b;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(e);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.k;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackgroundDrawable(gradientDrawable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i;
        super.onAttachedToWindow();
        fpk fpkVar = this.a;
        if (fpkVar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = fpkVar.j.getRootWindowInsets()) != null) {
            mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
            i = mandatorySystemGestureInsets.bottom;
            fpkVar.q = i;
            fpkVar.i();
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        fpk fpkVar = this.a;
        if (fpkVar != null) {
            fpp a = fpp.a();
            Object obj = a.a;
            kee keeVar = fpkVar.u;
            synchronized (obj) {
                z = true;
                if (!a.g(keeVar) && !a.h(keeVar)) {
                    z = false;
                }
            }
            if (z) {
                fpk.a.post(new fnh(fpkVar, 5, null));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        fpk fpkVar = this.a;
        if (fpkVar == null || !fpkVar.s) {
            return;
        }
        fpkVar.h();
        fpkVar.s = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.j;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.k != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.k);
            drawable.setTintMode(this.l);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.k = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.l);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.l = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.g || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        fpk fpkVar = this.a;
        if (fpkVar != null) {
            fpkVar.i();
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : h);
        super.setOnClickListener(onClickListener);
    }

    protected fpj(Context context) {
        this(context, null);
    }
}
