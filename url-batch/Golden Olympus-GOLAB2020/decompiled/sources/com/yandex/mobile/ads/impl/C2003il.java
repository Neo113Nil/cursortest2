package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.au0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.yandex.mobile.ads.impl.il, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2003il extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d10 f27235a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final au0 f27236b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27237c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Paint f27238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2003il(@NotNull Context context, @NotNull d10 dimensionConverter, @NotNull au0 emptySizeMeasureSpecProvider) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        Intrinsics.checkNotNullParameter(emptySizeMeasureSpecProvider, "emptySizeMeasureSpecProvider");
        this.f27235a = dimensionConverter;
        this.f27236b = emptySizeMeasureSpecProvider;
        dimensionConverter.getClass();
        this.f27237c = d10.a(context, 0.5f);
        this.f27238d = new Paint();
        a(context);
    }

    private final void a(Context context) {
        this.f27235a.getClass();
        int a4 = d10.a(context, 1.0f);
        this.f27238d.setStyle(Paint.Style.STROKE);
        this.f27238d.setStrokeWidth(a4);
        this.f27238d.setColor(-65536);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f4 = this.f27237c;
        canvas.drawRect(f4, f4, getWidth() - this.f27237c, getHeight() - this.f27237c, this.f27238d);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        Object parent = getParent();
        if (!(parent instanceof View)) {
            super.onLayout(z4, i4, i5, i6, i7);
            return;
        }
        View view = (View) parent;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        setLeft(0);
        setTop(0);
        setRight(measuredWidth);
        setBottom(measuredHeight);
        super.onLayout(z4, 0, 0, measuredWidth, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i4, int i5) {
        au0.a a4 = this.f27236b.a(i4, i5);
        super.onMeasure(a4.f23449a, a4.f23450b);
    }

    public final void setColor(int i4) {
        if (this.f27238d.getColor() != i4) {
            this.f27238d.setColor(i4);
            requestLayout();
        }
    }
}
