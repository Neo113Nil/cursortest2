package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final m7 f44714a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final o2 f44715b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final l0 f44716c;

    public o0(@NotNull m7 networkDataSource, @NotNull o2 cachedDataSource, @NotNull l0 applicationPurchaseMapper) {
        Intrinsics.checkNotNullParameter(networkDataSource, "networkDataSource");
        Intrinsics.checkNotNullParameter(cachedDataSource, "cachedDataSource");
        Intrinsics.checkNotNullParameter(applicationPurchaseMapper, "applicationPurchaseMapper");
        this.f44714a = networkDataSource;
        this.f44715b = cachedDataSource;
        this.f44716c = applicationPurchaseMapper;
    }
}
