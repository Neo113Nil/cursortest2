package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gt1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1932fl f26294a;

    public /* synthetic */ gt1() {
        this(new C1932fl());
    }

    @NotNull
    public final Bitmap a(@NotNull Drawable drawable) {
        Bitmap createBitmap;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            C1932fl c1932fl = this.f26294a;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            c1932fl.getClass();
            Intrinsics.checkNotNullParameter(config, "config");
            createBitmap = Bitmap.createBitmap(1, 1, config);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        } else {
            C1932fl c1932fl2 = this.f26294a;
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            c1932fl2.getClass();
            Intrinsics.checkNotNullParameter(config2, "config");
            createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config2);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public gt1(@NotNull C1932fl bitmapProvider) {
        Intrinsics.checkNotNullParameter(bitmapProvider, "bitmapProvider");
        this.f26294a = bitmapProvider;
    }
}
