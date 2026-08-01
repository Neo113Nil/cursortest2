package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.trembin.nirefon.betfury.R;
import defpackage.c70;
import defpackage.d50;
import defpackage.g10;
import defpackage.mv;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class MaterialDivider extends View {
    public final g10 f;
    public int g;
    public int h;
    public int i;
    public int j;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(mv.V(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f = new g10();
        TypedArray E = d50.E(context2, attributeSet, c70.x, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.g = E.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.i = E.getDimensionPixelOffset(2, 0);
        this.j = E.getDimensionPixelOffset(1, 0);
        setDividerColor(mv.r(context2, E, 0).getDefaultColor());
        E.recycle();
    }

    public int getDividerColor() {
        return this.h;
    }

    public int getDividerInsetEnd() {
        return this.j;
    }

    public int getDividerInsetStart() {
        return this.i;
    }

    public int getDividerThickness() {
        return this.g;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.j : this.i;
        if (z) {
            width = getWidth();
            i = this.i;
        } else {
            width = getWidth();
            i = this.j;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        g10 g10Var = this.f;
        g10Var.setBounds(i2, 0, i3, bottom);
        g10Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.g;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.h != i) {
            this.h = i;
            this.f.r(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.j = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.i = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.g != i) {
            this.g = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
