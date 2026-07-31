package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.yandex.mobile.ads.impl.wc1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d82 implements wc1.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LruCache<String, Bitmap> f24503a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ni0 f24504b;

    public d82(@NotNull xc1 bitmapLruCache, @NotNull ni0 imageCacheKeyGenerator) {
        Intrinsics.checkNotNullParameter(bitmapLruCache, "bitmapLruCache");
        Intrinsics.checkNotNullParameter(imageCacheKeyGenerator, "imageCacheKeyGenerator");
        this.f24503a = bitmapLruCache;
        this.f24504b = imageCacheKeyGenerator;
    }

    @Nullable
    public final Bitmap a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f24504b.getClass();
        return this.f24503a.get(ni0.a(url));
    }

    @Override // com.yandex.mobile.ads.impl.wc1.c
    public final void a(@NotNull String url, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f24504b.getClass();
        this.f24503a.put(ni0.a(url), bitmap);
    }
}
