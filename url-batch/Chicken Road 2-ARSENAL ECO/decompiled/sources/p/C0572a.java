package p;

import R0.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import o.AbstractC0554a;
import u0.C0682l;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572a extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f5634k = {R.attr.colorBackground};

    /* renamed from: l, reason: collision with root package name */
    public static final g f5635l = new g();

    /* renamed from: f, reason: collision with root package name */
    public boolean f5636f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5637g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f5638h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f5639i;

    /* renamed from: j, reason: collision with root package name */
    public final C0682l f5640j;

    public C0572a(Context context) {
        super(context, null, com.strategylink.Row.Five.R.attr.cardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f5638h = rect;
        this.f5639i = new Rect();
        C0682l c0682l = new C0682l(this);
        this.f5640j = c0682l;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0554a.f5566a, com.strategylink.Row.Five.R.attr.cardViewStyle, com.strategylink.Row.Five.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f5634k);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.strategylink.Row.Five.R.color.cardview_light_background) : getResources().getColor(com.strategylink.Row.Five.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f5636f = obtainStyledAttributes.getBoolean(7, false);
        this.f5637g = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C0573b c0573b = new C0573b(valueOf, dimension);
        c0682l.f5989f = c0573b;
        setBackgroundDrawable(c0573b);
        setClipToOutline(true);
        setElevation(dimension2);
        f5635l.f(c0682l, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C0573b) ((Drawable) this.f5640j.f5989f)).f5648h;
    }

    public float getCardElevation() {
        return ((C0572a) this.f5640j.f5990g).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f5638h.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f5638h.left;
    }

    public int getContentPaddingRight() {
        return this.f5638h.right;
    }

    public int getContentPaddingTop() {
        return this.f5638h.top;
    }

    public float getMaxCardElevation() {
        return ((C0573b) ((Drawable) this.f5640j.f5989f)).f5645e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f5637g;
    }

    public float getRadius() {
        return ((C0573b) ((Drawable) this.f5640j.f5989f)).f5641a;
    }

    public boolean getUseCompatPadding() {
        return this.f5636f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
    }

    public void setCardBackgroundColor(int i7) {
        ColorStateList valueOf = ColorStateList.valueOf(i7);
        C0573b c0573b = (C0573b) ((Drawable) this.f5640j.f5989f);
        if (valueOf == null) {
            c0573b.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        c0573b.f5648h = valueOf;
        c0573b.f5642b.setColor(valueOf.getColorForState(c0573b.getState(), c0573b.f5648h.getDefaultColor()));
        c0573b.invalidateSelf();
    }

    public void setCardElevation(float f7) {
        ((C0572a) this.f5640j.f5990g).setElevation(f7);
    }

    public void setMaxCardElevation(float f7) {
        f5635l.f(this.f5640j, f7);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i7) {
        super.setMinimumHeight(i7);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i7) {
        super.setMinimumWidth(i7);
    }

    public void setPreventCornerOverlap(boolean z5) {
        if (z5 != this.f5637g) {
            this.f5637g = z5;
            C0682l c0682l = this.f5640j;
            f5635l.f(c0682l, ((C0573b) ((Drawable) c0682l.f5989f)).f5645e);
        }
    }

    public void setRadius(float f7) {
        C0573b c0573b = (C0573b) ((Drawable) this.f5640j.f5989f);
        if (f7 == c0573b.f5641a) {
            return;
        }
        c0573b.f5641a = f7;
        c0573b.b(null);
        c0573b.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z5) {
        if (this.f5636f != z5) {
            this.f5636f = z5;
            C0682l c0682l = this.f5640j;
            f5635l.f(c0682l, ((C0573b) ((Drawable) c0682l.f5989f)).f5645e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C0573b c0573b = (C0573b) ((Drawable) this.f5640j.f5989f);
        if (colorStateList == null) {
            c0573b.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c0573b.f5648h = colorStateList;
        c0573b.f5642b.setColor(colorStateList.getColorForState(c0573b.getState(), c0573b.f5648h.getDefaultColor()));
        c0573b.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i8, int i9, int i10) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i7, int i8, int i9, int i10) {
    }
}
