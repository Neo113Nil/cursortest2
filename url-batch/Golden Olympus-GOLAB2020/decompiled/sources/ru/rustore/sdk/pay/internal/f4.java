package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final p7 f44054a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final c4 f44055b;

    public f4(@NotNull p7 networkDataSource, @NotNull c4 couponSelectionMapper) {
        Intrinsics.checkNotNullParameter(networkDataSource, "networkDataSource");
        Intrinsics.checkNotNullParameter(couponSelectionMapper, "couponSelectionMapper");
        this.f44054a = networkDataSource;
        this.f44055b = couponSelectionMapper;
    }
}
