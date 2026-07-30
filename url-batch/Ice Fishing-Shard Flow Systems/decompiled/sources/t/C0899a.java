package t;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import r4.d;
import s.AbstractC0857a;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0899a extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f7866n = {R.attr.colorBackground};

    /* renamed from: o, reason: collision with root package name */
    public static final d f7867o = new d();

    /* renamed from: d, reason: collision with root package name */
    public boolean f7868d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7869e;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f7870i;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f7871l;

    /* renamed from: m, reason: collision with root package name */
    public final P0.c f7872m;

    public C0899a(Context context) {
        super(context, null, com.icefishing.icefish.ice.fishing.s294s.R.attr.cardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f7870i = rect;
        this.f7871l = new Rect();
        P0.c cVar = new P0.c(this);
        this.f7872m = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0857a.f7597a, com.icefishing.icefish.ice.fishing.s294s.R.attr.cardViewStyle, com.icefishing.icefish.ice.fishing.s294s.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f7866n);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.icefishing.icefish.ice.fishing.s294s.R.color.cardview_light_background) : getResources().getColor(com.icefishing.icefish.ice.fishing.s294s.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f7868d = obtainStyledAttributes.getBoolean(7, false);
        this.f7869e = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C0900b c0900b = new C0900b(valueOf, dimension);
        cVar.f2189e = c0900b;
        setBackgroundDrawable(c0900b);
        setClipToOutline(true);
        setElevation(dimension2);
        f7867o.b(cVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C0900b) ((Drawable) this.f7872m.f2189e)).f7880h;
    }

    public float getCardElevation() {
        return ((C0899a) this.f7872m.f2190i).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f7870i.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f7870i.left;
    }

    public int getContentPaddingRight() {
        return this.f7870i.right;
    }

    public int getContentPaddingTop() {
        return this.f7870i.top;
    }

    public float getMaxCardElevation() {
        return ((C0900b) ((Drawable) this.f7872m.f2189e)).f7877e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f7869e;
    }

    public float getRadius() {
        return ((C0900b) ((Drawable) this.f7872m.f2189e)).f7873a;
    }

    public boolean getUseCompatPadding() {
        return this.f7868d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i5) {
        super.onMeasure(i2, i5);
    }

    public void setCardBackgroundColor(int i2) {
        ColorStateList valueOf = ColorStateList.valueOf(i2);
        C0900b c0900b = (C0900b) ((Drawable) this.f7872m.f2189e);
        if (valueOf == null) {
            c0900b.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        c0900b.f7880h = valueOf;
        c0900b.f7874b.setColor(valueOf.getColorForState(c0900b.getState(), c0900b.f7880h.getDefaultColor()));
        c0900b.invalidateSelf();
    }

    public void setCardElevation(float f7) {
        ((C0899a) this.f7872m.f2190i).setElevation(f7);
    }

    public void setMaxCardElevation(float f7) {
        f7867o.b(this.f7872m, f7);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        super.setMinimumWidth(i2);
    }

    public void setPreventCornerOverlap(boolean z7) {
        if (z7 != this.f7869e) {
            this.f7869e = z7;
            P0.c cVar = this.f7872m;
            f7867o.b(cVar, ((C0900b) ((Drawable) cVar.f2189e)).f7877e);
        }
    }

    public void setRadius(float f7) {
        C0900b c0900b = (C0900b) ((Drawable) this.f7872m.f2189e);
        if (f7 == c0900b.f7873a) {
            return;
        }
        c0900b.f7873a = f7;
        c0900b.b(null);
        c0900b.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z7) {
        if (this.f7868d != z7) {
            this.f7868d = z7;
            P0.c cVar = this.f7872m;
            f7867o.b(cVar, ((C0900b) ((Drawable) cVar.f2189e)).f7877e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C0900b c0900b = (C0900b) ((Drawable) this.f7872m.f2189e);
        if (colorStateList == null) {
            c0900b.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c0900b.f7880h = colorStateList;
        c0900b.f7874b.setColor(colorStateList.getColorForState(c0900b.getState(), c0900b.f7880h.getDefaultColor()));
        c0900b.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i2, int i5, int i7, int i8) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i2, int i5, int i7, int i8) {
    }
}
