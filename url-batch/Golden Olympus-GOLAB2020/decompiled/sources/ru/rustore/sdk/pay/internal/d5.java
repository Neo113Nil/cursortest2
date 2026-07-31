package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final p2 f43956a;

    public d5(@NotNull p2 cachedDataSource, @NotNull gi remoteDataSource, @NotNull e5 mapper) {
        Intrinsics.checkNotNullParameter(cachedDataSource, "cachedDataSource");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f43956a = cachedDataSource;
    }
}
