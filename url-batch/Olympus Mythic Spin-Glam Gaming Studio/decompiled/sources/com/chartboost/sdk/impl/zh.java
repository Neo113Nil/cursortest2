package com.chartboost.sdk.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes14.dex */
public final class zh extends b1 {
    public static final a k = new a(null);
    public static final int l = -14669512;
    public static final int m = -436207617;
    public static final int n = -1;
    public final String d;
    public final g6 e;
    public final yh f;
    public final TextView g;
    public ai h;
    public String i;
    public String j;

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ai.values().length];
            try {
                iArr[ai.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ai.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(Context context, AttributeSet attributeSet, int i, String timerContentDescription, g6 densityProvider) {
        super(context, attributeSet, i, null, densityProvider, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timerContentDescription, "timerContentDescription");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.d = timerContentDescription;
        this.e = densityProvider;
        this.h = ai.c;
        this.i = "Reward in %d seconds";
        this.j = "Reward granted";
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(a(28), a(28)));
        setCornerRadius(a(14));
        setContentDescription((CharSequence) timerContentDescription);
        yh yhVar = new yh(context, attributeSet, i, densityProvider);
        yhVar.setId(View.generateViewId());
        yhVar.setLayoutParams(new ConstraintLayout.LayoutParams(a(28), a(28)));
        yhVar.setBackgroundPaintColor(-15262682);
        yhVar.setArcColor(m);
        this.f = yhVar;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, 0));
        textView.setTextSize(12.0f);
        textView.setTextColor(n);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        this.g = textView;
        addView(yhVar);
        addView(textView);
        setFocusable(true);
        setClickable(true);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(yhVar.getId(), 1, 0, 1);
        constraintSet.connect(yhVar.getId(), 2, 0, 2);
        constraintSet.connect(yhVar.getId(), 3, 0, 3);
        constraintSet.connect(yhVar.getId(), 4, 0, 4);
        constraintSet.connect(textView.getId(), 1, 0, 1);
        constraintSet.connect(textView.getId(), 2, 0, 2);
        constraintSet.connect(textView.getId(), 3, 0, 3);
        constraintSet.connect(textView.getId(), 4, 0, 4);
        constraintSet.applyTo(this);
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

    public final void setContentDescription(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        setContentDescription((CharSequence) description);
    }

    @VisibleForTesting
    @NotNull
    public final yh getTimerArc() {
        return this.f;
    }

    @VisibleForTesting
    @NotNull
    public final TextView getTimerText() {
        return this.g;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ zh(Context context, AttributeSet attributeSet, int i, String str, g6 g6Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r2, r3, str, (i2 & 16) != 0 ? new a6(context) : g6Var);
        AttributeSet attributeSet2 = (i2 & 2) != 0 ? null : attributeSet;
        int i3 = (i2 & 4) != 0 ? 0 : i;
        if ((i2 & 8) != 0) {
            str = context.getString(R.string.timer_notification_icon_description);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
    }

    public final void setDurationMs(long j) {
        this.f.setProgress(1.0f);
        b(j);
    }

    public final void b(long j) {
        int i = b.a[this.h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.g.setText(a(j));
        } else {
            if (j <= 0) {
                this.g.setText(this.j);
                return;
            }
            TextView textView = this.g;
            String format = String.format(this.i, Arrays.copyOf(new Object[]{Long.valueOf(j / 1000)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            textView.setText(format);
        }
    }

    public final String a(long j) {
        return String.valueOf((int) Math.rint(j / 1000.0f));
    }

    public final void a(il tracker, gl purpose) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        tracker.a(this, purpose);
        tracker.a(this.f, purpose);
        tracker.a(this.g, purpose);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void a(ai mode, String str, String str2) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.h = mode;
        int i = b.a[mode.ordinal()];
        if (i == 1) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = a(28);
            setLayoutParams(layoutParams);
            this.f.setVisibility(8);
            this.g.setVisibility(0);
            setCornerRadius(a(14));
            getBackgroundDrawable().setColor(l);
            if (str != null) {
                this.i = str;
            }
            if (str2 != null) {
                this.j = str2;
            }
            this.g.setPadding(a(12), 0, a(12), 0);
        } else if (i == 2) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            layoutParams2.width = a(28);
            layoutParams2.height = a(28);
            setLayoutParams(layoutParams2);
            this.f.setVisibility(0);
            this.g.setVisibility(0);
            setCornerRadius(a(14));
            getBackgroundDrawable().setColor(-15262682);
            this.g.setPadding(0, 0, 0, 0);
        }
        requestLayout();
    }

    public final void a(long j, long j2) {
        this.f.setProgress(RangesKt.coerceIn(j / j2, 0.0f, 1.0f));
        b(j);
    }
}
