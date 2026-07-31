package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class BaselineLayout extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f1927d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1928e;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1927d = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f1927d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i9 - i) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.f1927d == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f1927d + paddingTop) - childAt.getBaseline();
                childAt.layout(i12, baseline, measuredWidth + i12, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i8);
                i9 = Math.max(i9, childAt.getMeasuredHeight());
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i13 = Math.max(i13, baseline);
                    i14 = Math.max(i14, childAt.getMeasuredHeight() - baseline);
                }
                i11 = Math.max(i11, childAt.getMeasuredWidth());
                i10 = Math.max(i10, childAt.getMeasuredHeight());
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        if (i13 != -1) {
            if (this.f1928e) {
                i10 = Math.max(i10, Math.max(i14, getPaddingBottom()) + i13);
            }
            this.f1927d = i13;
        }
        if (!this.f1928e) {
            i10 = getPaddingBottom() + i9;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i11, getSuggestedMinimumWidth()), i, i12), View.resolveSizeAndState(Math.max(i10, getSuggestedMinimumHeight()), i8, i12 << 16));
    }

    public void setMeasurePaddingFromBaseline(boolean z3) {
        this.f1928e = z3;
    }
}
