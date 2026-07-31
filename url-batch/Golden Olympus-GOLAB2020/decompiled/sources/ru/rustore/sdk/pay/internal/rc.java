package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class rc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final r7 f44911a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final q2 f44912b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final pc f44913c;

    public rc(@NotNull r7 networkPublicKeyDataSource, @NotNull q2 cachedPublicKeyDataSource, @NotNull pc mapper) {
        Intrinsics.checkNotNullParameter(networkPublicKeyDataSource, "networkPublicKeyDataSource");
        Intrinsics.checkNotNullParameter(cachedPublicKeyDataSource, "cachedPublicKeyDataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f44911a = networkPublicKeyDataSource;
        this.f44912b = cachedPublicKeyDataSource;
        this.f44913c = mapper;
    }
}
