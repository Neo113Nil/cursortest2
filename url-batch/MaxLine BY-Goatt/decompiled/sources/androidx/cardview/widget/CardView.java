package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.o70;
import defpackage.t21;
import defpackage.vb2;
import defpackage.y52;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] r = {R.attr.colorBackground};
    public boolean m;
    public boolean n;
    public final Rect o;
    public final Rect p;
    public final t21 q;

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.majelw.libystne.R.attr.cardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.o = rect;
        this.p = new Rect();
        t21 t21Var = new t21(this);
        this.q = t21Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y52.a, com.majelw.libystne.R.attr.cardViewStyle, com.majelw.libystne.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(r);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.majelw.libystne.R.color.cardview_light_background) : getResources().getColor(com.majelw.libystne.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.m = obtainStyledAttributes.getBoolean(7, false);
        this.n = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        vb2 vb2Var = new vb2(valueOf, dimension);
        t21Var.n = vb2Var;
        setBackgroundDrawable(vb2Var);
        setClipToOutline(true);
        setElevation(dimension2);
        o70.I(t21Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((vb2) this.q.n).h;
    }

    public float getCardElevation() {
        return ((CardView) this.q.o).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.o.bottom;
    }

    public int getContentPaddingLeft() {
        return this.o.left;
    }

    public int getContentPaddingRight() {
        return this.o.right;
    }

    public int getContentPaddingTop() {
        return this.o.top;
    }

    public float getMaxCardElevation() {
        return ((vb2) this.q.n).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.n;
    }

    public float getRadius() {
        return ((vb2) this.q.n).a;
    }

    public boolean getUseCompatPadding() {
        return this.m;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        vb2 vb2Var = (vb2) this.q.n;
        if (valueOf == null) {
            vb2Var.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        vb2Var.h = valueOf;
        vb2Var.b.setColor(valueOf.getColorForState(vb2Var.getState(), vb2Var.h.getDefaultColor()));
        vb2Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.q.o).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        o70.I(this.q, f);
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
        if (z != this.n) {
            this.n = z;
            t21 t21Var = this.q;
            o70.I(t21Var, ((vb2) t21Var.n).e);
        }
    }

    public void setRadius(float f) {
        vb2 vb2Var = (vb2) this.q.n;
        if (f == vb2Var.a) {
            return;
        }
        vb2Var.a = f;
        vb2Var.b(null);
        vb2Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.m != z) {
            this.m = z;
            t21 t21Var = this.q;
            o70.I(t21Var, ((vb2) t21Var.n).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        vb2 vb2Var = (vb2) this.q.n;
        if (colorStateList == null) {
            vb2Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        vb2Var.h = colorStateList;
        vb2Var.b.setColor(colorStateList.getColorForState(vb2Var.getState(), vb2Var.h.getDefaultColor()));
        vb2Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
