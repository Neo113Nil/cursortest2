package y5;

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
import com.snovikpovik.vuevnxsj.R;
import r2.o;
import r5.k;
import w5.j;
import w5.n;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class c extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final b f8976l = new b();

    /* renamed from: d, reason: collision with root package name */
    public final n f8977d;

    /* renamed from: e, reason: collision with root package name */
    public int f8978e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8979f;

    /* renamed from: g, reason: collision with root package name */
    public final float f8980g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8981h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f8982j;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f8983k;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(a6.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, f5.a.f2755u);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f8978e = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f8977d = n.b(context2, attributeSet, 0, 0).a();
        }
        this.f8979f = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(o.C(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(k.f(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f8980g = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f8981h = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.i = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f8976l);
        setFocusable(true);
        if (getBackground() == null) {
            int M = h0.a.M(getBackgroundOverlayColorAlpha(), h0.a.B(this, R.attr.colorSurface), h0.a.B(this, R.attr.colorOnSurface));
            n nVar = this.f8977d;
            if (nVar != null) {
                int i = d.f8984a;
                j jVar = new j(nVar);
                jVar.n(ColorStateList.valueOf(M));
                gradientDrawable = jVar;
            } else {
                Resources resources = getResources();
                int i8 = d.f8984a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(M);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f8982j;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f8980g;
    }

    public int getAnimationMode() {
        return this.f8978e;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f8979f;
    }

    public int getMaxInlineActionWidth() {
        return this.i;
    }

    public int getMaxWidth() {
        return this.f8981h;
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
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        super.onLayout(z3, i, i8, i9, i10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        int i9 = this.f8981h;
        if (i9 <= 0 || getMeasuredWidth() <= i9) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), i8);
    }

    public void setAnimationMode(int i) {
        this.f8978e = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f8982j != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f8982j);
            drawable.setTintMode(this.f8983k);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f8982j = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f8983k);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f8983k = mode;
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
        setOnTouchListener(onClickListener != null ? null : f8976l);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
