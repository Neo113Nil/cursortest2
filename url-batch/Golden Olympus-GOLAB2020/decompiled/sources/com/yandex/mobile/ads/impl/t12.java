package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t12 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Rect f32119a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Paint f32120b;

    /* renamed from: c, reason: collision with root package name */
    private int f32121c;

    /* renamed from: d, reason: collision with root package name */
    private int f32122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t12(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32119a = new Rect();
        this.f32120b = new Paint();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f32121c = lh2.a(context2, 1.0f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f32122d = lh2.a(context3, 4.0f);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int a4 = lh2.a(getCurrentTextColor(), 85.0f);
        Paint paint = this.f32120b;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f32121c);
        paint.setColor(a4);
        int lineCount = getLineCount();
        Layout layout = getLayout();
        for (int i4 = 0; i4 < lineCount; i4++) {
            int lineBounds = getLineBounds(i4, this.f32119a);
            int lineStart = layout.getLineStart(i4);
            int lineEnd = layout.getLineEnd(i4);
            float primaryHorizontal = layout.getPrimaryHorizontal(lineStart);
            float primaryHorizontal2 = (layout.getPrimaryHorizontal(lineStart + 1) - primaryHorizontal) + layout.getPrimaryHorizontal(lineEnd - 1);
            float f4 = lineBounds + this.f32122d;
            canvas.drawLine(primaryHorizontal, f4, primaryHorizontal2, f4, paint);
        }
        super.onDraw(canvas);
    }
}
