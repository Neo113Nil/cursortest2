package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class d9 extends FrameLayout {
    public static final int[] k = {R.attr.colorBackground};
    public boolean f;
    public boolean g;
    public final Rect h;
    public final Rect i;
    public final h5 j;

    public d9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.awerser.monnit.betplay.R.attr.materialCardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.h = rect;
        this.i = new Rect();
        h5 h5Var = new h5(8, this);
        this.j = h5Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fy.a, com.awerser.monnit.betplay.R.attr.materialCardViewStyle, com.awerser.monnit.betplay.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(k);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.awerser.monnit.betplay.R.color.cardview_light_background) : getResources().getColor(com.awerser.monnit.betplay.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f = obtainStyledAttributes.getBoolean(7, false);
        this.g = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        d10 d10Var = new d10(valueOf, dimension);
        h5Var.g = d10Var;
        setBackgroundDrawable(d10Var);
        setClipToOutline(true);
        setElevation(dimension2);
        vw.i0(h5Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((d10) this.j.g).h;
    }

    public float getCardElevation() {
        return ((d9) this.j.h).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.h.bottom;
    }

    public int getContentPaddingLeft() {
        return this.h.left;
    }

    public int getContentPaddingRight() {
        return this.h.right;
    }

    public int getContentPaddingTop() {
        return this.h.top;
    }

    public float getMaxCardElevation() {
        return ((d10) this.j.g).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.g;
    }

    public float getRadius() {
        return ((d10) this.j.g).a;
    }

    public boolean getUseCompatPadding() {
        return this.f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        d10 d10Var = (d10) this.j.g;
        if (valueOf == null) {
            d10Var.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        d10Var.h = valueOf;
        d10Var.b.setColor(valueOf.getColorForState(d10Var.getState(), d10Var.h.getDefaultColor()));
        d10Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((d9) this.j.h).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        vw.i0(this.j, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.g) {
            this.g = z;
            h5 h5Var = this.j;
            vw.i0(h5Var, ((d10) h5Var.g).e);
        }
    }

    public void setRadius(float f) {
        d10 d10Var = (d10) this.j.g;
        if (f == d10Var.a) {
            return;
        }
        d10Var.a = f;
        d10Var.b(null);
        d10Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f != z) {
            this.f = z;
            h5 h5Var = this.j;
            vw.i0(h5Var, ((d10) h5Var.g).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        d10 d10Var = (d10) this.j.g;
        if (colorStateList == null) {
            d10Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        d10Var.h = colorStateList;
        d10Var.b.setColor(colorStateList.getColorForState(d10Var.getState(), d10Var.h.getDefaultColor()));
        d10Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
