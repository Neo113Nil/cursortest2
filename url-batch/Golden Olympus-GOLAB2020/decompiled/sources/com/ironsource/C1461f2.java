package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1461f2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dt f16197a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f16198b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f16199c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final jg f16200d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f16201e;

    public C1461f2(@NotNull dt recordType, @NotNull String advertiserBundleId, @NotNull String networkInstanceId, @NotNull jg adProvider, @NotNull String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f16197a = recordType;
        this.f16198b = advertiserBundleId;
        this.f16199c = networkInstanceId;
        this.f16200d = adProvider;
        this.f16201e = adInstanceId;
    }

    @NotNull
    public final tn a(@NotNull mm<C1461f2, tn> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }

    @NotNull
    public final jg b() {
        return this.f16200d;
    }

    @NotNull
    public final String c() {
        return this.f16198b;
    }

    @NotNull
    public final String d() {
        return this.f16199c;
    }

    @NotNull
    public final dt e() {
        return this.f16197a;
    }

    @NotNull
    public final String a() {
        return this.f16201e;
    }
}
