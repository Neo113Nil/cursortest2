package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import j2.AbstractC3185a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.rc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2204rc extends ImageSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f31104a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private WeakReference<Drawable> f31105b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2204rc(@NotNull Drawable drawable) {
        super(drawable);
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f31104a = -1;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(@NotNull Canvas canvas, @Nullable CharSequence charSequence, int i4, int i5, float f4, int i6, int i7, int i8, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (this.f31104a != -1) {
            super.draw(canvas, charSequence, i4, i5, f4, i6, i7, i8, paint);
            return;
        }
        WeakReference<Drawable> weakReference = this.f31105b;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f31105b = new WeakReference<>(drawable);
            Intrinsics.checkNotNull(drawable);
        }
        canvas.save();
        canvas.translate(f4, AbstractC3185a.c(((i6 + i8) / 2.0f) - (drawable.getBounds().height() / 2.0f)));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(@NotNull Paint paint, @Nullable CharSequence charSequence, int i4, int i5, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        WeakReference<Drawable> weakReference = this.f31105b;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f31105b = new WeakReference<>(drawable);
            Intrinsics.checkNotNull(drawable);
        }
        Rect bounds = drawable.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }
}
