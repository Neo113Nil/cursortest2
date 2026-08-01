package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.awerser.monnit.betplay.R;
import defpackage.ly;
import defpackage.op;
import defpackage.rt;
import defpackage.vw;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class MaterialDivider extends View {
    public final rt f;
    public int g;
    public int h;
    public int i;
    public int j;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(op.Z(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f = new rt();
        TypedArray Z = vw.Z(context2, attributeSet, ly.w, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.g = Z.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.i = Z.getDimensionPixelOffset(2, 0);
        this.j = Z.getDimensionPixelOffset(1, 0);
        setDividerColor(op.x(context2, Z, 0).getDefaultColor());
        Z.recycle();
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
        rt rtVar = this.f;
        rtVar.setBounds(i2, 0, i3, bottom);
        rtVar.draw(canvas);
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
