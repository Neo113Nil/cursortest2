package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1576v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dt f19972a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f19973b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f19974c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f19975d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final jg f19976e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f19977f;

    public C1576v(@NotNull dt recordType, @NotNull String advertiserBundleId, @NotNull String networkInstanceId, @NotNull String adUnitId, @NotNull jg adProvider, @NotNull String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f19972a = recordType;
        this.f19973b = advertiserBundleId;
        this.f19974c = networkInstanceId;
        this.f19975d = adUnitId;
        this.f19976e = adProvider;
        this.f19977f = adInstanceId;
    }

    @NotNull
    public final C1461f2 a(@NotNull mm<C1576v, C1461f2> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }

    @NotNull
    public final jg b() {
        return this.f19976e;
    }

    @NotNull
    public final String c() {
        return this.f19975d;
    }

    @NotNull
    public final String d() {
        return this.f19973b;
    }

    @NotNull
    public final String e() {
        return this.f19974c;
    }

    @NotNull
    public final dt f() {
        return this.f19972a;
    }

    @NotNull
    public final String a() {
        return this.f19977f;
    }
}
