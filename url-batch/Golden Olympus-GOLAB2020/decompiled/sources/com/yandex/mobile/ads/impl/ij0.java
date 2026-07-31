package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ij0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zi0 f27221a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1884dl f27222b;

    public /* synthetic */ ij0(zi0 zi0Var) {
        this(zi0Var, new C1884dl());
    }

    public final boolean a(@Nullable Drawable drawable, @NotNull ej0 imageValue) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        Bitmap b4 = this.f27221a.b(imageValue);
        if (b4 == null) {
            b4 = this.f27221a.a(imageValue);
        }
        if (drawable == null || b4 == null) {
            return false;
        }
        this.f27222b.getClass();
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        return (drawable instanceof BitmapDrawable ? new C1908el() : new s30(new gt1(), new C1932fl())).a(drawable, b4);
    }

    public ij0(@NotNull zi0 imageProvider, @NotNull C1884dl bitmapComparatorFactory) {
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(bitmapComparatorFactory, "bitmapComparatorFactory");
        this.f27221a = imageProvider;
        this.f27222b = bitmapComparatorFactory;
    }
}
