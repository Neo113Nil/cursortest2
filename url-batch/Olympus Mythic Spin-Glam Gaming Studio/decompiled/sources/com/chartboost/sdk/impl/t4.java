package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.chartboost.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class t4 extends FrameLayout {
    public static final b d = new b(null);
    public static final int e = -15262682;
    public final g6 a;
    public final Function0 b;
    public final ImageView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(Context context, AttributeSet attributeSet, int i, g6 densityProvider, Function0 onCloseClicked) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        this.a = densityProvider;
        this.b = onCloseClicked;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(e);
        setBackground(gradientDrawable);
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(densityProvider.a(28), densityProvider.a(28));
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.cb_close_icon);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.c = imageView;
        addView(imageView);
    }

    public final void a(il tracker, gl purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.c, purpose);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.c, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 1) {
            this.b.mo4828invoke();
        }
        return true;
    }

    public static final class a extends Lambda implements Function0 {
        public static final a b = new a();

        public a() {
            super(0);
        }

        public final void a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ t4(Context context, AttributeSet attributeSet, int i, g6 g6Var, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new a6(context) : g6Var, (i2 & 16) != 0 ? a.b : function0);
    }
}
