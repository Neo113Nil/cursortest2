package p;

import D.j;
import L0.e;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import o.AbstractC0251a;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0255a extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f3320f = {R.attr.colorBackground};

    /* renamed from: g, reason: collision with root package name */
    public static final e f3321g = new e(27);

    /* renamed from: a, reason: collision with root package name */
    public boolean f3322a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3323b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f3324c;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final j f3325e;

    public AbstractC0255a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.winfour.neondrop.R.attr.materialCardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f3324c = rect;
        this.d = new Rect();
        j jVar = new j(16, this);
        this.f3325e = jVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0251a.f3303a, com.winfour.neondrop.R.attr.materialCardViewStyle, com.winfour.neondrop.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f3320f);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.winfour.neondrop.R.color.cardview_light_background) : getResources().getColor(com.winfour.neondrop.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f3322a = obtainStyledAttributes.getBoolean(7, false);
        this.f3323b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        e eVar = f3321g;
        b bVar = new b(valueOf, dimension);
        jVar.f133b = bVar;
        setBackgroundDrawable(bVar);
        setClipToOutline(true);
        setElevation(dimension2);
        eVar.o(jVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((b) ((Drawable) this.f3325e.f133b)).h;
    }

    public float getCardElevation() {
        return ((AbstractC0255a) this.f3325e.f134c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f3324c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f3324c.left;
    }

    public int getContentPaddingRight() {
        return this.f3324c.right;
    }

    public int getContentPaddingTop() {
        return this.f3324c.top;
    }

    public float getMaxCardElevation() {
        return ((b) ((Drawable) this.f3325e.f133b)).f3329e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f3323b;
    }

    public float getRadius() {
        return ((b) ((Drawable) this.f3325e.f133b)).f3326a;
    }

    public boolean getUseCompatPadding() {
        return this.f3322a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        b bVar = (b) ((Drawable) this.f3325e.f133b);
        if (valueOf == null) {
            bVar.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        bVar.h = valueOf;
        bVar.f3327b.setColor(valueOf.getColorForState(bVar.getState(), bVar.h.getDefaultColor()));
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        ((AbstractC0255a) this.f3325e.f134c).setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        f3321g.o(this.f3325e, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.f3323b) {
            this.f3323b = z2;
            e eVar = f3321g;
            j jVar = this.f3325e;
            eVar.o(jVar, ((b) ((Drawable) jVar.f133b)).f3329e);
        }
    }

    public void setRadius(float f2) {
        b bVar = (b) ((Drawable) this.f3325e.f133b);
        if (f2 == bVar.f3326a) {
            return;
        }
        bVar.f3326a = f2;
        bVar.b(null);
        bVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f3322a != z2) {
            this.f3322a = z2;
            e eVar = f3321g;
            j jVar = this.f3325e;
            eVar.o(jVar, ((b) ((Drawable) jVar.f133b)).f3329e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b bVar = (b) ((Drawable) this.f3325e.f133b);
        if (colorStateList == null) {
            bVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        bVar.h = colorStateList;
        bVar.f3327b.setColor(colorStateList.getColorForState(bVar.getState(), bVar.h.getDefaultColor()));
        bVar.invalidateSelf();
    }
}
