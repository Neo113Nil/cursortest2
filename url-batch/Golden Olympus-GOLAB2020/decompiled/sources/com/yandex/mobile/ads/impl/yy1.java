package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import com.yandex.mobile.ads.impl.wc1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yy1 extends vi0 {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ni0 f35392g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy1(@NotNull cq1 queue, @NotNull wc1.b imageCache, @NotNull ni0 imageCacheKeyGenerator) {
        super(queue, imageCache);
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(imageCacheKeyGenerator, "imageCacheKeyGenerator");
        this.f35392g = imageCacheKeyGenerator;
    }

    @Override // com.yandex.mobile.ads.impl.vi0
    @NotNull
    public final String a(@NotNull String url, int i4, int i5, @NotNull ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f35392g.getClass();
        return ni0.b(url, scaleType);
    }
}
