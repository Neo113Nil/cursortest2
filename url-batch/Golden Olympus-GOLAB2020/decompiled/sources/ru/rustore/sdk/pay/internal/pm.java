package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pm {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final cm f44798a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final r2 f44799b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final xb f44800c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final tb f44801d;

    public pm(@NotNull cm networkDataSource, @NotNull r2 cachedDataSource, @NotNull xb productPurchaseMapper, @NotNull tb productPurchaseErrorMapper) {
        Intrinsics.checkNotNullParameter(networkDataSource, "networkDataSource");
        Intrinsics.checkNotNullParameter(cachedDataSource, "cachedDataSource");
        Intrinsics.checkNotNullParameter(productPurchaseMapper, "productPurchaseMapper");
        Intrinsics.checkNotNullParameter(productPurchaseErrorMapper, "productPurchaseErrorMapper");
        this.f44798a = networkDataSource;
        this.f44799b = cachedDataSource;
        this.f44800c = productPurchaseMapper;
        this.f44801d = productPurchaseErrorMapper;
    }
}
