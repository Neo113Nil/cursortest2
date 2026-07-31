package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final p0 f44499a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final yf f44500b;

    public l0(@NotNull p0 purchaseStatusMapper, @NotNull yf purchaseTypeMapper) {
        Intrinsics.checkNotNullParameter(purchaseStatusMapper, "purchaseStatusMapper");
        Intrinsics.checkNotNullParameter(purchaseTypeMapper, "purchaseTypeMapper");
        this.f44499a = purchaseStatusMapper;
        this.f44500b = purchaseTypeMapper;
    }
}
