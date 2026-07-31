package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import o.AbstractC3268a;
import o.AbstractC3269b;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3373a extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final d IMPL;
    private final c mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    /* renamed from: p.a$a, reason: collision with other inner class name */
    class C0245a implements c {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f43340a;

        C0245a() {
        }

        @Override // p.c
        public void a(Drawable drawable) {
            this.f43340a = drawable;
            AbstractC3373a.this.setBackgroundDrawable(drawable);
        }

        @Override // p.c
        public boolean b() {
            return AbstractC3373a.this.getPreventCornerOverlap();
        }

        @Override // p.c
        public boolean c() {
            return AbstractC3373a.this.getUseCompatPadding();
        }

        @Override // p.c
        public Drawable d() {
            return this.f43340a;
        }

        @Override // p.c
        public View e() {
            return AbstractC3373a.this;
        }

        @Override // p.c
        public void f(int i4, int i5, int i6, int i7) {
            AbstractC3373a.this.mShadowBounds.set(i4, i5, i6, i7);
            AbstractC3373a abstractC3373a = AbstractC3373a.this;
            Rect rect = abstractC3373a.mContentPadding;
            AbstractC3373a.super.setPadding(i4 + rect.left, i5 + rect.top, i6 + rect.right, i7 + rect.bottom);
        }
    }

    static {
        b bVar = new b();
        IMPL = bVar;
        bVar.l();
    }

    public AbstractC3373a(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        C0245a c0245a = new C0245a();
        this.mCardViewDelegate = c0245a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.c.f41392a, i4, AbstractC3269b.f41391a);
        if (obtainStyledAttributes.hasValue(o.c.f41395d)) {
            valueOf = obtainStyledAttributes.getColorStateList(o.c.f41395d);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(AbstractC3268a.f41390b) : getResources().getColor(AbstractC3268a.f41389a));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(o.c.f41396e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(o.c.f41397f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(o.c.f41398g, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(o.c.f41400i, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(o.c.f41399h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(o.c.f41401j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(o.c.f41403l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(o.c.f41405n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(o.c.f41404m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(o.c.f41402k, dimensionPixelSize);
        float f4 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(o.c.f41393b, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(o.c.f41394c, 0);
        obtainStyledAttributes.recycle();
        IMPL.i(c0245a, context, colorStateList, dimension, dimension2, f4);
    }

    public void a(int i4, int i5, int i6, int i7) {
        this.mContentPadding.set(i4, i5, i6, i7);
        IMPL.d(this.mCardViewDelegate);
    }

    public ColorStateList getCardBackgroundColor() {
        return IMPL.b(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.e(this.mCardViewDelegate);
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.f(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.j(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (IMPL instanceof b) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.m(this.mCardViewDelegate)), View.MeasureSpec.getSize(i4)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.c(this.mCardViewDelegate)), View.MeasureSpec.getSize(i5)), mode2);
        }
        super.onMeasure(i4, i5);
    }

    public void setCardBackgroundColor(int i4) {
        IMPL.a(this.mCardViewDelegate, ColorStateList.valueOf(i4));
    }

    public void setCardElevation(float f4) {
        IMPL.g(this.mCardViewDelegate, f4);
    }

    public void setMaxCardElevation(float f4) {
        IMPL.n(this.mCardViewDelegate, f4);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i4) {
        this.mUserSetMinHeight = i4;
        super.setMinimumHeight(i4);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i4) {
        this.mUserSetMinWidth = i4;
        super.setMinimumWidth(i4);
    }

    public void setPreventCornerOverlap(boolean z4) {
        if (z4 != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z4;
            IMPL.h(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f4) {
        IMPL.o(this.mCardViewDelegate, f4);
    }

    public void setUseCompatPadding(boolean z4) {
        if (this.mCompatPadding != z4) {
            this.mCompatPadding = z4;
            IMPL.k(this.mCardViewDelegate);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        IMPL.a(this.mCardViewDelegate, colorStateList);
    }

    @Override // android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i4, int i5, int i6, int i7) {
    }
}
