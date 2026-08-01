package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class i9 extends FrameLayout {
    public static final int[] k = {R.attr.colorBackground};
    public boolean f;
    public boolean g;
    public final Rect h;
    public final Rect i;
    public final q4 j;

    public i9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.derinko.gbini.n1casino.R.attr.materialCardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.h = rect;
        this.i = new Rect();
        q4 q4Var = new q4(11, this);
        this.j = q4Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, px.a, com.derinko.gbini.n1casino.R.attr.materialCardViewStyle, com.derinko.gbini.n1casino.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(k);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.derinko.gbini.n1casino.R.color.cardview_light_background) : getResources().getColor(com.derinko.gbini.n1casino.R.color.cardview_dark_background));
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
        n00 n00Var = new n00(valueOf, dimension);
        q4Var.g = n00Var;
        setBackgroundDrawable(n00Var);
        setClipToOutline(true);
        setElevation(dimension2);
        e70.R(q4Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((n00) this.j.g).h;
    }

    public float getCardElevation() {
        return ((i9) this.j.h).getElevation();
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
        return ((n00) this.j.g).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.g;
    }

    public float getRadius() {
        return ((n00) this.j.g).a;
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
        n00 n00Var = (n00) this.j.g;
        if (valueOf == null) {
            n00Var.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        n00Var.h = valueOf;
        n00Var.b.setColor(valueOf.getColorForState(n00Var.getState(), n00Var.h.getDefaultColor()));
        n00Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((i9) this.j.h).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        e70.R(this.j, f);
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
            q4 q4Var = this.j;
            e70.R(q4Var, ((n00) q4Var.g).e);
        }
    }

    public void setRadius(float f) {
        n00 n00Var = (n00) this.j.g;
        if (f == n00Var.a) {
            return;
        }
        n00Var.a = f;
        n00Var.b(null);
        n00Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f != z) {
            this.f = z;
            q4 q4Var = this.j;
            e70.R(q4Var, ((n00) q4Var.g).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        n00 n00Var = (n00) this.j.g;
        if (colorStateList == null) {
            n00Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        n00Var.h = colorStateList;
        n00Var.b.setColor(colorStateList.getColorForState(n00Var.getState(), n00Var.h.getDefaultColor()));
        n00Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
