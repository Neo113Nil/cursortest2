package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.yandex.mobile.ads.impl.xl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2351xl extends View {

    /* renamed from: a, reason: collision with root package name */
    private final float f34608a;

    /* renamed from: b, reason: collision with root package name */
    private final float f34609b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Paint f34610c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Paint f34611d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Paint f34612e;

    /* renamed from: f, reason: collision with root package name */
    private float f34613f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2351xl(@NotNull Context context, @NotNull d10 dimensionConverter) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        dimensionConverter.getClass();
        this.f34608a = d10.a(context, 34.0f);
        float a4 = d10.a(context, 3.0f);
        this.f34609b = a4;
        float a5 = d10.a(context, 20.0f);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f34610c = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(a4);
        paint2.setAntiAlias(true);
        this.f34611d = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setTextSize(a5);
        paint3.setTextAlign(Paint.Align.CENTER);
        this.f34612e = paint3;
        this.f34613f = 40.0f;
        a();
    }

    private final void a() {
        this.f34611d.setColor(lh2.a(-65536, this.f34613f));
        this.f34610c.setColor(lh2.a(-1, this.f34613f));
        this.f34612e.setColor(lh2.a(-65536, this.f34613f));
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f4 = 2;
        float f5 = this.f34608a / f4;
        canvas.drawCircle(f5, f5, f5, this.f34610c);
        canvas.drawCircle(f5, f5, f5 - (this.f34609b / f4), this.f34611d);
        float f6 = this.f34608a / f4;
        canvas.drawText("!", f6, f6 - ((this.f34612e.ascent() + this.f34612e.descent()) / f4), this.f34612e);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6 = (int) this.f34608a;
        setMeasuredDimension(i6, i6);
    }

    @Override // android.view.View
    public void setSelected(boolean z4) {
        super.setSelected(z4);
        this.f34613f = z4 ? 0.0f : 40.0f;
        a();
        invalidate();
    }
}
