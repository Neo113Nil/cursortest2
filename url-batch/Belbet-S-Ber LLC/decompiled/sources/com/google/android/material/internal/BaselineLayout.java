package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class BaselineLayout extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public int f1169f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1170g;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1169f = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f1169f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i5 - i) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.f1169f == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f1169f + paddingTop) - childAt.getBaseline();
                childAt.layout(i8, baseline, measuredWidth + i8, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i4);
                i5 = Math.max(i5, childAt.getMeasuredHeight());
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i9 = Math.max(i9, baseline);
                    i10 = Math.max(i10, childAt.getMeasuredHeight() - baseline);
                }
                i7 = Math.max(i7, childAt.getMeasuredWidth());
                i6 = Math.max(i6, childAt.getMeasuredHeight());
                i8 = View.combineMeasuredStates(i8, childAt.getMeasuredState());
            }
        }
        if (i9 != -1) {
            if (this.f1170g) {
                i6 = Math.max(i6, Math.max(i10, getPaddingBottom()) + i9);
            }
            this.f1169f = i9;
        }
        if (!this.f1170g) {
            i6 = getPaddingBottom() + i5;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i7, getSuggestedMinimumWidth()), i, i8), View.resolveSizeAndState(Math.max(i6, getSuggestedMinimumHeight()), i4, i8 << 16));
    }

    public void setMeasurePaddingFromBaseline(boolean z4) {
        this.f1170g = z4;
    }
}
