package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class ih extends b1 {
    public static final b i = new b(null);
    public final int d;
    public final String e;
    public final g6 f;
    public final Function0 g;
    public final ImageView h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(Context context, AttributeSet attributeSet, int i2, int i3, String skipButtonContentDescription, g6 densityProvider, Function0 onSkipClicked) {
        super(context, attributeSet, i2, null, densityProvider, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(skipButtonContentDescription, "skipButtonContentDescription");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        Intrinsics.checkNotNullParameter(onSkipClicked, "onSkipClicked");
        this.d = i3;
        this.e = skipButtonContentDescription;
        this.f = densityProvider;
        this.g = onSkipClicked;
        setId(View.generateViewId());
        setCornerRadius(a(14));
        setContentDescription((CharSequence) skipButtonContentDescription);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(a(28), a(28)));
        imageView.setImageResource(i3);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImportantForAccessibility(2);
        this.h = imageView;
        addView(imageView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(imageView.getId(), 1, 0, 1);
        constraintSet.connect(imageView.getId(), 2, 0, 2);
        constraintSet.connect(imageView.getId(), 3, 0, 3);
        constraintSet.connect(imageView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
        setFocusable(true);
        setClickable(true);
    }

    public final void a(il tracker, gl purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.h, purpose);
    }

    @Override // com.chartboost.sdk.impl.b1, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.c, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.chartboost.sdk.impl.b1, androidx.constraintlayout.widget.ConstraintLayout, android.view.View
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
            this.g.mo4828invoke();
        }
        return true;
    }

    public final void setContentDescription(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        setContentDescription((CharSequence) description);
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

    @VisibleForTesting
    @NotNull
    public final ImageView getIconView() {
        return this.h;
    }

    public final void setSkipIcon(int i2) {
        this.h.setImageResource(i2);
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ih(Context context, AttributeSet attributeSet, int i2, int i3, String str, g6 g6Var, Function0 function0, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r1, r2, r3, r4, (i4 & 32) != 0 ? new a6(context) : g6Var, (i4 & 64) != 0 ? a.b : function0);
        String str2;
        AttributeSet attributeSet2 = (i4 & 2) != 0 ? null : attributeSet;
        int i5 = (i4 & 4) != 0 ? 0 : i2;
        int i6 = (i4 & 8) != 0 ? R.drawable.cb_skip_icon : i3;
        if ((i4 & 16) != 0) {
            str2 = context.getString(R.string.skip_button_description);
            Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
        } else {
            str2 = str;
        }
    }
}
