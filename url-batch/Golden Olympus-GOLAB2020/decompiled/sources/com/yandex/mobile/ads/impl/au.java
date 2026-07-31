package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f23445a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final RectF f23446b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Path f23447c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final float[] f23448d;

    public /* synthetic */ au(View view, float f4, float f5, float f6, float f7) {
        this(view, f4, f5, f6, f7, new RectF(), new Path());
    }

    public final void a(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f23448d == null || this.f23447c.isEmpty()) {
            return;
        }
        canvas.clipPath(this.f23447c);
    }

    public au(@NotNull View roundView, float f4, float f5, float f6, float f7, @NotNull RectF clipRect, @NotNull Path clipPath) {
        Intrinsics.checkNotNullParameter(roundView, "roundView");
        Intrinsics.checkNotNullParameter(clipRect, "clipRect");
        Intrinsics.checkNotNullParameter(clipPath, "clipPath");
        this.f23445a = roundView;
        this.f23446b = clipRect;
        this.f23447c = clipPath;
        this.f23448d = a(f4, f5, f6, f7);
    }

    private static float[] a(float f4, float f5, float f6, float f7) {
        if (f4 > 0.0f || f5 > 0.0f || f6 > 0.0f || f7 > 0.0f) {
            return new float[]{f4, f4, f5, f5, f6, f6, f7, f7};
        }
        return null;
    }

    public final void a() {
        if (this.f23448d != null) {
            int measuredWidth = this.f23445a.getMeasuredWidth();
            int measuredHeight = this.f23445a.getMeasuredHeight();
            int paddingLeft = this.f23445a.getPaddingLeft();
            int paddingTop = this.f23445a.getPaddingTop();
            int paddingRight = measuredWidth - this.f23445a.getPaddingRight();
            int paddingBottom = measuredHeight - this.f23445a.getPaddingBottom();
            if (paddingLeft >= paddingRight || paddingTop >= paddingBottom) {
                return;
            }
            this.f23446b.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            this.f23447c.reset();
            this.f23447c.addRoundRect(this.f23446b, this.f23448d, Path.Direction.CW);
        }
    }
}
