package q;

import W1.e;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import p.AbstractC1377a;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1385a extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f11644f = {R.attr.colorBackground};

    /* renamed from: g, reason: collision with root package name */
    public static final e f11645g = new e();

    /* renamed from: a, reason: collision with root package name */
    public boolean f11646a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11647b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f11648c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f11649d;

    /* renamed from: e, reason: collision with root package name */
    public final B0.e f11650e;

    public C1385a(Context context) {
        super(context, null, com.chickyneer.roadway.R.attr.cardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f11648c = rect;
        this.f11649d = new Rect();
        B0.e eVar = new B0.e(this);
        this.f11650e = eVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1377a.f11616a, com.chickyneer.roadway.R.attr.cardViewStyle, com.chickyneer.roadway.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f11644f);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.chickyneer.roadway.R.color.cardview_light_background) : getResources().getColor(com.chickyneer.roadway.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f11646a = obtainStyledAttributes.getBoolean(7, false);
        this.f11647b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        e eVar2 = f11645g;
        C1386b c1386b = new C1386b(valueOf, dimension);
        eVar.f146b = c1386b;
        setBackgroundDrawable(c1386b);
        setClipToOutline(true);
        setElevation(dimension2);
        eVar2.t(eVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C1386b) ((Drawable) this.f11650e.f146b)).f11658h;
    }

    public float getCardElevation() {
        return ((C1385a) this.f11650e.f147c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f11648c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f11648c.left;
    }

    public int getContentPaddingRight() {
        return this.f11648c.right;
    }

    public int getContentPaddingTop() {
        return this.f11648c.top;
    }

    public float getMaxCardElevation() {
        return ((C1386b) ((Drawable) this.f11650e.f146b)).f11655e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f11647b;
    }

    public float getRadius() {
        return ((C1386b) ((Drawable) this.f11650e.f146b)).f11651a;
    }

    public boolean getUseCompatPadding() {
        return this.f11646a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        ColorStateList valueOf = ColorStateList.valueOf(i2);
        C1386b c1386b = (C1386b) ((Drawable) this.f11650e.f146b);
        if (valueOf == null) {
            c1386b.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        c1386b.f11658h = valueOf;
        c1386b.f11652b.setColor(valueOf.getColorForState(c1386b.getState(), c1386b.f11658h.getDefaultColor()));
        c1386b.invalidateSelf();
    }

    public void setCardElevation(float f3) {
        ((C1385a) this.f11650e.f147c).setElevation(f3);
    }

    public void setMaxCardElevation(float f3) {
        f11645g.t(this.f11650e, f3);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        super.setMinimumWidth(i2);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f11647b) {
            this.f11647b = z;
            e eVar = f11645g;
            B0.e eVar2 = this.f11650e;
            eVar.t(eVar2, ((C1386b) ((Drawable) eVar2.f146b)).f11655e);
        }
    }

    public void setRadius(float f3) {
        C1386b c1386b = (C1386b) ((Drawable) this.f11650e.f146b);
        if (f3 == c1386b.f11651a) {
            return;
        }
        c1386b.f11651a = f3;
        c1386b.b(null);
        c1386b.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f11646a != z) {
            this.f11646a = z;
            e eVar = f11645g;
            B0.e eVar2 = this.f11650e;
            eVar.t(eVar2, ((C1386b) ((Drawable) eVar2.f146b)).f11655e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C1386b c1386b = (C1386b) ((Drawable) this.f11650e.f146b);
        if (colorStateList == null) {
            c1386b.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c1386b.f11658h = colorStateList;
        c1386b.f11652b.setColor(colorStateList.getColorForState(c1386b.getState(), c1386b.f11658h.getDefaultColor()));
        c1386b.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i2, int i3, int i6, int i7) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i2, int i3, int i6, int i7) {
    }
}
