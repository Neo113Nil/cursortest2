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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class ql extends b1 {
    public static final a i = new a(null);
    public final String d;
    public final String e;
    public final Function1 f;
    public final ImageView g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(Context context, AttributeSet attributeSet, int i2, String volumeOnContentDescription, String volumeOffContentDescription, Function1 function1) {
        super(context, attributeSet, i2, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(volumeOnContentDescription, "volumeOnContentDescription");
        Intrinsics.checkNotNullParameter(volumeOffContentDescription, "volumeOffContentDescription");
        this.d = volumeOnContentDescription;
        this.e = volumeOffContentDescription;
        this.f = function1;
        setId(View.generateViewId());
        setCornerRadius(a(14));
        c();
        setFocusable(true);
        setClickable(true);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new ConstraintLayout.LayoutParams(a(28), a(28)));
        imageView.setImageResource(R.drawable.cb_volume_on_icon);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImportantForAccessibility(2);
        this.g = imageView;
        addView(imageView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(imageView.getId(), 1, 0, 1);
        constraintSet.connect(imageView.getId(), 2, 0, 2);
        constraintSet.connect(imageView.getId(), 3, 0, 3);
        constraintSet.connect(imageView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
        setOnClickListener(new View.OnClickListener() { // from class: com.chartboost.sdk.impl.ql$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ql.a(ql.this, view);
            }
        });
    }

    public static final void a(ql this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b();
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

    @VisibleForTesting
    @NotNull
    public final ImageView getIconView() {
        return this.g;
    }

    public final void a(il tracker, gl purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.g, purpose);
    }

    private final void c() {
        setContentDescription(this.h ? this.e : this.d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ql(Context context, AttributeSet attributeSet, int i2, String str, String str2, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r0, r2, r3, r5, (i3 & 32) == 0 ? function1 : null);
        String str3;
        String str4;
        AttributeSet attributeSet2 = (i3 & 2) != 0 ? null : attributeSet;
        int i4 = (i3 & 4) != 0 ? 0 : i2;
        if ((i3 & 8) != 0) {
            str3 = context.getString(R.string.volume_on_description);
            Intrinsics.checkNotNullExpressionValue(str3, "getString(...)");
        } else {
            str3 = str;
        }
        if ((i3 & 16) != 0) {
            str4 = context.getString(R.string.volume_off_description);
            Intrinsics.checkNotNullExpressionValue(str4, "getString(...)");
        } else {
            str4 = str2;
        }
    }

    public final void b() {
        boolean z = this.h;
        this.h = !z;
        this.g.setImageResource(!z ? R.drawable.cb_volume_off_icon : R.drawable.cb_volume_on_icon);
        c();
        Function1 function1 = this.f;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(this.h));
        }
    }

    public final void setMuted(boolean z) {
        if (this.h != z) {
            this.h = z;
            this.g.setImageResource(z ? R.drawable.cb_volume_off_icon : R.drawable.cb_volume_on_icon);
            c();
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
