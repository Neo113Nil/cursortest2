package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final t7 f43859a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final r2 f43860b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final xb f43861c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final tb f43862d;

    public bc(@NotNull t7 networkDataSource, @NotNull r2 cachedDataSource, @NotNull xb productPurchaseMapper, @NotNull tb productPurchaseErrorMapper) {
        Intrinsics.checkNotNullParameter(networkDataSource, "networkDataSource");
        Intrinsics.checkNotNullParameter(cachedDataSource, "cachedDataSource");
        Intrinsics.checkNotNullParameter(productPurchaseMapper, "productPurchaseMapper");
        Intrinsics.checkNotNullParameter(productPurchaseErrorMapper, "productPurchaseErrorMapper");
        this.f43859a = networkDataSource;
        this.f43860b = cachedDataSource;
        this.f43861c = productPurchaseMapper;
        this.f43862d = productPurchaseErrorMapper;
    }
}
