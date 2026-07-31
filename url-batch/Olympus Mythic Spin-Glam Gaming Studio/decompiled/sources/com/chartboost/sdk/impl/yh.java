package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class yh extends View {
    public static final a h = new a(null);
    public static final int i = -436207617;
    public static final int j = -1711276033;
    public static final int k = -15262682;
    public final g6 a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final RectF e;
    public float f;
    public float g;

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo4828invoke() {
            Paint paint = new Paint(1);
            yh yhVar = yh.this;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(yhVar.a.a(2));
            paint.setColor(yh.h.b());
            paint.setStrokeCap(Paint.Cap.ROUND);
            return paint;
        }
    }

    public static final class c extends Lambda implements Function0 {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo4828invoke() {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(yh.h.c());
            return paint;
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Paint mo4828invoke() {
            Paint paint = new Paint(1);
            yh yhVar = yh.this;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(yhVar.a.a(2));
            paint.setColor(yh.h.a());
            paint.setStrokeCap(Paint.Cap.ROUND);
            return paint;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(Context context, AttributeSet attributeSet, int i2, g6 densityProvider) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.a = densityProvider;
        this.b = LazyKt.lazy(c.b);
        this.c = LazyKt.lazy(new b());
        this.d = LazyKt.lazy(new d());
        this.e = new RectF();
        this.f = 1.0f;
        this.g = -1.0f;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.c, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawCircle(this.e.centerX(), this.e.centerY(), this.e.width() / 2, getBackgroundPaint());
        canvas.drawArc(this.e, 0.0f, 360.0f, false, getArcBackgroundPaint());
        float f = this.f;
        if (f > 0.0f) {
            canvas.drawArc(this.e, -90.0f, f * 360.0f, false, getProgressPaint());
        }
        this.g = this.f;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @VisibleForTesting
    @NotNull
    public final Paint getBackgroundPaint() {
        return (Paint) this.b.getValue();
    }

    private final Paint getArcBackgroundPaint() {
        return (Paint) this.c.getValue();
    }

    @VisibleForTesting
    @NotNull
    public final Paint getProgressPaint() {
        return (Paint) this.d.getValue();
    }

    @VisibleForTesting
    public final float getProgress() {
        return this.f;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        float strokeWidth = getProgressPaint().getStrokeWidth() / 2;
        this.e.set(strokeWidth, strokeWidth, i2 - strokeWidth, i3 - strokeWidth);
    }

    public final void setProgress(float f) {
        float coerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
        if (coerceIn != this.f || this.g == -1.0f) {
            this.f = coerceIn;
            this.g = coerceIn;
            invalidate();
        }
    }

    @ColorInt
    public final int getArcColor() {
        return getProgressPaint().getColor();
    }

    public final void setArcColor(int i2) {
        getProgressPaint().setColor(i2);
        invalidate();
    }

    @ColorInt
    public final int getBackgroundPaintColor() {
        return getBackgroundPaint().getColor();
    }

    public final void setBackgroundPaintColor(int i2) {
        getBackgroundPaint().setColor(i2);
        invalidate();
    }

    public static final class a {
        public final int a() {
            return yh.i;
        }

        public final int b() {
            return yh.j;
        }

        public final int c() {
            return yh.k;
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
