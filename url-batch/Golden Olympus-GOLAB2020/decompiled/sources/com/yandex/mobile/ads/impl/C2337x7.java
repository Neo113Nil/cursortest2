package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.x7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2337x7 extends View {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ev f34470a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Paint f34471b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Paint f34472c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Paint f34473d;

    /* renamed from: e, reason: collision with root package name */
    private int f34474e;

    /* renamed from: f, reason: collision with root package name */
    private int f34475f;

    /* renamed from: g, reason: collision with root package name */
    private int f34476g;

    /* renamed from: h, reason: collision with root package name */
    private float f34477h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2337x7(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void a() {
        this.f34471b.setColor(this.f34474e);
        this.f34472c.setColor(this.f34476g);
        this.f34473d.setColor(this.f34476g);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        this.f34476g = this.f34470a.a() ? -7829368 : -1;
        a();
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawColor(0);
        float min = Math.min(getWidth(), getHeight());
        float f4 = min / 2.0f;
        canvas.drawCircle(f4, f4, f4, this.f34471b);
        float f5 = min / 5.0f;
        float f6 = f4 - f5;
        float f7 = f4 + f5;
        canvas.drawLine(f6, f6, f7, f7, this.f34472c);
        canvas.drawLine(f6, f7, f7, f6, this.f34472c);
        float f8 = this.f34477h;
        if (f8 > 0.0f) {
            this.f34473d.setStrokeWidth(f8);
            canvas.drawCircle(f4, f4, f4 - this.f34477h, this.f34473d);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0) {
            a(C2245t7.a());
            a();
            invalidate();
        } else if (1 == event.getAction()) {
            a(this.f34475f);
            a();
            invalidate();
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        this.f34475f = i4;
        a(i4);
        a();
        invalidate();
    }

    public final void setBorderWidth(float f4) {
        this.f34477h = f4;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2337x7(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2337x7(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34470a = new ev(context);
        this.f34474e = C2268u7.a();
        this.f34475f = C2268u7.a();
        this.f34476g = -1;
        this.f34477h = -1.0f;
        if (attributeSet == null || i4 == 0) {
            int a4 = C2268u7.a();
            this.f34475f = a4;
            a(a4);
        }
        Paint paint = new Paint(0);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f34471b = paint;
        Paint paint2 = new Paint(0);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f34472c = paint2;
        Paint paint3 = new Paint(0);
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        this.f34473d = paint3;
        a();
    }

    private final void a(int i4) {
        int a4 = lh2.a(i4, 20.0f);
        this.f34474e = a4;
        float[] fArr = new float[3];
        Color.colorToHSV(a4, fArr);
        if (fArr[2] < 0.5f) {
            this.f34476g = this.f34470a.a() ? -7829368 : -1;
        } else {
            this.f34476g = -16777216;
        }
    }

    public /* synthetic */ C2337x7(Context context, AttributeSet attributeSet, int i4, int i5) {
        this(context, (i4 & 2) != 0 ? null : attributeSet, 0);
    }
}
