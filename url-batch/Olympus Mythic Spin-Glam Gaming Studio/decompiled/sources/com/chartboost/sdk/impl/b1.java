package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class b1 extends ConstraintLayout {
    public static final a c = new a(null);
    public final GradientDrawable a;
    public final g6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Context context, AttributeSet attributeSet, int i, GradientDrawable backgroundDrawable, g6 densityProvider) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundDrawable, "backgroundDrawable");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.a = backgroundDrawable;
        this.b = densityProvider;
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.c, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @NotNull
    public final GradientDrawable getBackgroundDrawable() {
        return this.a;
    }

    public /* synthetic */ b1(Context context, AttributeSet attributeSet, int i, GradientDrawable gradientDrawable, g6 g6Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new GradientDrawable() : gradientDrawable, (i2 & 16) != 0 ? new a6(context) : g6Var);
    }

    public final void setCornerRadius(int i) {
        this.a.setCornerRadius(i);
    }

    public final int a(double d) {
        return this.b.a(d);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int a(int i) {
        return this.b.a(i);
    }

    public final void a(boolean z) {
        setBackground(z ? this.a : null);
    }

    public final void a() {
        GradientDrawable gradientDrawable = this.a;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(16.0f);
        gradientDrawable.setColor(-15262682);
        setBackgroundColor(0);
        setBackground(this.a);
    }
}
