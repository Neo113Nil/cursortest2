package com.google.android.material.divider;

import a2.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.gglhk.bofio.fortunetiger.R;
import g2.j;
import k3.m;
import l2.a;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class MaterialDivider extends View {

    /* renamed from: f, reason: collision with root package name */
    public final j f1342f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f1343i;

    /* renamed from: j, reason: collision with root package name */
    public int f1344j;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(a.b(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f1342f = new j();
        TypedArray e4 = p.e(context2, attributeSet, l1.a.f2872r, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.g = e4.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f1343i = e4.getDimensionPixelOffset(2, 0);
        this.f1344j = e4.getDimensionPixelOffset(1, 0);
        setDividerColor(m.u(context2, e4, 0).getDefaultColor());
        e4.recycle();
    }

    public int getDividerColor() {
        return this.h;
    }

    public int getDividerInsetEnd() {
        return this.f1344j;
    }

    public int getDividerInsetStart() {
        return this.f1343i;
    }

    public int getDividerThickness() {
        return this.g;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i4;
        super.onDraw(canvas);
        boolean z3 = getLayoutDirection() == 1;
        int i5 = z3 ? this.f1344j : this.f1343i;
        if (z3) {
            width = getWidth();
            i4 = this.f1343i;
        } else {
            width = getWidth();
            i4 = this.f1344j;
        }
        int i6 = width - i4;
        int bottom = getBottom() - getTop();
        j jVar = this.f1342f;
        jVar.setBounds(i5, 0, i6, bottom);
        jVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i5);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i6 = this.g;
            if (i6 > 0 && measuredHeight != i6) {
                measuredHeight = i6;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i4) {
        if (this.h != i4) {
            this.h = i4;
            this.f1342f.q(ColorStateList.valueOf(i4));
            invalidate();
        }
    }

    public void setDividerColorResource(int i4) {
        setDividerColor(getContext().getColor(i4));
    }

    public void setDividerInsetEnd(int i4) {
        this.f1344j = i4;
    }

    public void setDividerInsetEndResource(int i4) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i4));
    }

    public void setDividerInsetStart(int i4) {
        this.f1343i = i4;
    }

    public void setDividerInsetStartResource(int i4) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i4));
    }

    public void setDividerThickness(int i4) {
        if (this.g != i4) {
            this.g = i4;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i4) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i4));
    }
}
