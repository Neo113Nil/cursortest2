package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class v9 extends FrameLayout {
    public static final int[] k = {R.attr.colorBackground};
    public boolean f;
    public boolean g;
    public final Rect h;
    public final Rect i;
    public final a5 j;

    public v9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.moontiko.really.admiralcasino.R.attr.materialCardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.h = rect;
        this.i = new Rect();
        a5 a5Var = new a5(10, this);
        this.j = a5Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s00.a, com.moontiko.really.admiralcasino.R.attr.materialCardViewStyle, com.moontiko.really.admiralcasino.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(k);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.moontiko.really.admiralcasino.R.color.cardview_light_background) : getResources().getColor(com.moontiko.really.admiralcasino.R.color.cardview_dark_background));
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
        s30 s30Var = new s30(valueOf, dimension);
        a5Var.g = s30Var;
        setBackgroundDrawable(s30Var);
        setClipToOutline(true);
        setElevation(dimension2);
        b9.P(a5Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((s30) this.j.g).h;
    }

    public float getCardElevation() {
        return ((v9) this.j.h).getElevation();
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
        return ((s30) this.j.g).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.g;
    }

    public float getRadius() {
        return ((s30) this.j.g).a;
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
        s30 s30Var = (s30) this.j.g;
        if (valueOf == null) {
            s30Var.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        s30Var.h = valueOf;
        s30Var.b.setColor(valueOf.getColorForState(s30Var.getState(), s30Var.h.getDefaultColor()));
        s30Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((v9) this.j.h).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        b9.P(this.j, f);
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
            a5 a5Var = this.j;
            b9.P(a5Var, ((s30) a5Var.g).e);
        }
    }

    public void setRadius(float f) {
        s30 s30Var = (s30) this.j.g;
        if (f == s30Var.a) {
            return;
        }
        s30Var.a = f;
        s30Var.b(null);
        s30Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f != z) {
            this.f = z;
            a5 a5Var = this.j;
            b9.P(a5Var, ((s30) a5Var.g).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        s30 s30Var = (s30) this.j.g;
        if (colorStateList == null) {
            s30Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        s30Var.h = colorStateList;
        s30Var.b.setColor(colorStateList.getColorForState(s30Var.getState(), s30Var.h.getDefaultColor()));
        s30Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
