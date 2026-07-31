package com.google.android.material.divider;

import a6.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.snovikpovik.vuevnxsj.R;
import r2.o;
import r5.k;
import w5.j;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class MaterialDivider extends View {

    /* renamed from: d, reason: collision with root package name */
    public final j f1922d;

    /* renamed from: e, reason: collision with root package name */
    public int f1923e;

    /* renamed from: f, reason: collision with root package name */
    public int f1924f;

    /* renamed from: g, reason: collision with root package name */
    public int f1925g;

    /* renamed from: h, reason: collision with root package name */
    public int f1926h;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f1922d = new j();
        TypedArray e8 = k.e(context2, attributeSet, f5.a.f2746l, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f1923e = e8.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f1925g = e8.getDimensionPixelOffset(2, 0);
        this.f1926h = e8.getDimensionPixelOffset(1, 0);
        setDividerColor(o.C(context2, e8, 0).getDefaultColor());
        e8.recycle();
    }

    public int getDividerColor() {
        return this.f1924f;
    }

    public int getDividerInsetEnd() {
        return this.f1926h;
    }

    public int getDividerInsetStart() {
        return this.f1925g;
    }

    public int getDividerThickness() {
        return this.f1923e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z3 = getLayoutDirection() == 1;
        int i8 = z3 ? this.f1926h : this.f1925g;
        if (z3) {
            width = getWidth();
            i = this.f1925g;
        } else {
            width = getWidth();
            i = this.f1926h;
        }
        int i9 = width - i;
        int bottom = getBottom() - getTop();
        j jVar = this.f1922d;
        jVar.setBounds(i8, 0, i9, bottom);
        jVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        int mode = View.MeasureSpec.getMode(i8);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i9 = this.f1923e;
            if (i9 > 0 && measuredHeight != i9) {
                measuredHeight = i9;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.f1924f != i) {
            this.f1924f = i;
            this.f1922d.n(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.f1926h = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.f1925g = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.f1923e != i) {
            this.f1923e = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
