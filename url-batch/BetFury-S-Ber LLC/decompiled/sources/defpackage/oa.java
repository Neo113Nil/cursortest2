package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class oa extends FrameLayout {
    public static final int[] k = {R.attr.colorBackground};
    public boolean f;
    public boolean g;
    public final Rect h;
    public final Rect i;
    public final i5 j;

    public oa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.trembin.nirefon.betfury.R.attr.materialCardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.h = rect;
        this.i = new Rect();
        i5 i5Var = new i5((Object) this, 10, false);
        this.j = i5Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w60.a, com.trembin.nirefon.betfury.R.attr.materialCardViewStyle, com.trembin.nirefon.betfury.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(k);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.trembin.nirefon.betfury.R.color.cardview_light_background) : getResources().getColor(com.trembin.nirefon.betfury.R.color.cardview_dark_background));
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
        ua0 ua0Var = new ua0(valueOf, dimension);
        i5Var.g = ua0Var;
        setBackgroundDrawable(ua0Var);
        setClipToOutline(true);
        setElevation(dimension2);
        gk0.P(i5Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((ua0) this.j.g).h;
    }

    public float getCardElevation() {
        return ((oa) this.j.h).getElevation();
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
        return ((ua0) this.j.g).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.g;
    }

    public float getRadius() {
        return ((ua0) this.j.g).a;
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
        ua0 ua0Var = (ua0) this.j.g;
        if (valueOf == null) {
            ua0Var.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        ua0Var.h = valueOf;
        ua0Var.b.setColor(valueOf.getColorForState(ua0Var.getState(), ua0Var.h.getDefaultColor()));
        ua0Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((oa) this.j.h).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        gk0.P(this.j, f);
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
            i5 i5Var = this.j;
            gk0.P(i5Var, ((ua0) i5Var.g).e);
        }
    }

    public void setRadius(float f) {
        ua0 ua0Var = (ua0) this.j.g;
        if (f == ua0Var.a) {
            return;
        }
        ua0Var.a = f;
        ua0Var.b(null);
        ua0Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f != z) {
            this.f = z;
            i5 i5Var = this.j;
            gk0.P(i5Var, ((ua0) i5Var.g).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        ua0 ua0Var = (ua0) this.j.g;
        if (colorStateList == null) {
            ua0Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        ua0Var.h = colorStateList;
        ua0Var.b.setColor(colorStateList.getColorForState(ua0Var.getState(), ua0Var.h.getDefaultColor()));
        ua0Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
