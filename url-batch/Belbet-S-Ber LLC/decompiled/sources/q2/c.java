package q2;

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
import b4.l;
import com.gdmhkmf.belbet.R;
import o2.j;
import o2.o;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class c extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final b f3163n = new b();

    /* renamed from: f, reason: collision with root package name */
    public final o f3164f;

    /* renamed from: g, reason: collision with root package name */
    public int f3165g;
    public final float h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3166j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3167k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f3168l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f3169m;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(u2.a.b(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, q1.a.H);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f3165g = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f3164f = o.g(context2, attributeSet, 0, 0).a();
        }
        this.h = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(l.r(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(i2.o.f(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.i = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f3166j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f3167k = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(f3163n);
        setFocusable(true);
        if (getBackground() == null) {
            int P = l.P(l.U(getContext(), b4.d.R(this, R.attr.colorSurface)), l.U(getContext(), b4.d.R(this, R.attr.colorOnSurface)), getBackgroundOverlayColorAlpha());
            o oVar = this.f3164f;
            if (oVar != null) {
                int i = d.f3170a;
                j jVar = new j(oVar);
                jVar.r(ColorStateList.valueOf(P));
                gradientDrawable = jVar;
            } else {
                Resources resources = getResources();
                int i4 = d.f3170a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(P);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f3168l;
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
        return this.f3165g;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.h;
    }

    public int getMaxInlineActionWidth() {
        return this.f3167k;
    }

    public int getMaxWidth() {
        return this.f3166j;
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
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        super.onLayout(z4, i, i4, i5, i6);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        int i5 = this.f3166j;
        if (i5 <= 0 || getMeasuredWidth() <= i5) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i4);
    }

    public void setAnimationMode(int i) {
        this.f3165g = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f3168l != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f3168l);
            drawable.setTintMode(this.f3169m);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f3168l = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f3169m);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f3169m = mode;
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
        setOnTouchListener(onClickListener != null ? null : f3163n);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
