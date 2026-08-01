package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import b4.l;
import com.gdmhkmf.belbet.R;
import i2.o;
import o2.j;
import u2.a;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class MaterialDivider extends View {

    /* renamed from: f, reason: collision with root package name */
    public final j f1135f;

    /* renamed from: g, reason: collision with root package name */
    public int f1136g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f1137j;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.b(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f1135f = new j();
        TypedArray e4 = o.e(context2, attributeSet, q1.a.f3159w, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f1136g = e4.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.i = e4.getDimensionPixelOffset(2, 0);
        this.f1137j = e4.getDimensionPixelOffset(1, 0);
        setDividerColor(l.r(context2, e4, 0).getDefaultColor());
        e4.recycle();
    }

    public int getDividerColor() {
        return this.h;
    }

    public int getDividerInsetEnd() {
        return this.f1137j;
    }

    public int getDividerInsetStart() {
        return this.i;
    }

    public int getDividerThickness() {
        return this.f1136g;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z4 = getLayoutDirection() == 1;
        int i4 = z4 ? this.f1137j : this.i;
        if (z4) {
            width = getWidth();
            i = this.i;
        } else {
            width = getWidth();
            i = this.f1137j;
        }
        int i5 = width - i;
        int bottom = getBottom() - getTop();
        j jVar = this.f1135f;
        jVar.setBounds(i4, 0, i5, bottom);
        jVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        int mode = View.MeasureSpec.getMode(i4);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i5 = this.f1136g;
            if (i5 > 0 && measuredHeight != i5) {
                measuredHeight = i5;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.h != i) {
            this.h = i;
            this.f1135f.r(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.f1137j = i;
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
        if (this.f1136g != i) {
            this.f1136g = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
