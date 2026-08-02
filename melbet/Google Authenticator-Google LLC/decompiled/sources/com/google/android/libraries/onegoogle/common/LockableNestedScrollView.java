package com.google.android.libraries.onegoogle.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import defpackage.ksl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LockableNestedScrollView extends NestedScrollView {
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockableNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.h = true;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    protected final void measureChild(View view, int i, int i2) {
        view.getClass();
        if (this.h) {
            super.measureChild(view, i, i2);
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            view.measure(NestedScrollView.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutParams.width), NestedScrollView.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), layoutParams.height));
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    protected final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (this.h) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
        } else if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.h && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, defpackage.xn
    public final boolean t(View view, View view2, int i, int i2) {
        view.getClass();
        view2.getClass();
        return this.h && super.t(view, view2, i, i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LockableNestedScrollView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ LockableNestedScrollView(Context context, AttributeSet attributeSet, int i, ksl kslVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
