package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.oriondriftchasers.arordrft.R;
import e2.o;
import l2.j;
import q2.a;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class MaterialDivider extends View {

    /* renamed from: f, reason: collision with root package name */
    public final j f973f;

    /* renamed from: g, reason: collision with root package name */
    public int f974g;

    /* renamed from: h, reason: collision with root package name */
    public int f975h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f976j;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f973f = new j();
        TypedArray f2 = o.f(context2, attributeSet, n1.a.f2826s, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f974g = f2.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.i = f2.getDimensionPixelOffset(2, 0);
        this.f976j = f2.getDimensionPixelOffset(1, 0);
        setDividerColor(h.a.t(context2, f2, 0).getDefaultColor());
        f2.recycle();
    }

    public int getDividerColor() {
        return this.f975h;
    }

    public int getDividerInsetEnd() {
        return this.f976j;
    }

    public int getDividerInsetStart() {
        return this.i;
    }

    public int getDividerThickness() {
        return this.f974g;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z3 = getLayoutDirection() == 1;
        int i4 = z3 ? this.f976j : this.i;
        if (z3) {
            width = getWidth();
            i = this.i;
        } else {
            width = getWidth();
            i = this.f976j;
        }
        int i5 = width - i;
        int bottom = getBottom() - getTop();
        j jVar = this.f973f;
        jVar.setBounds(i4, 0, i5, bottom);
        jVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        int mode = View.MeasureSpec.getMode(i4);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i5 = this.f974g;
            if (i5 > 0 && measuredHeight != i5) {
                measuredHeight = i5;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.f975h != i) {
            this.f975h = i;
            this.f973f.q(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.f976j = i;
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
        if (this.f974g != i) {
            this.f974g = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
