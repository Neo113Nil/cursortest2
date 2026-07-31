package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class tn {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dt f19805a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f19806b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final jg f19807c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f19808d;

    public tn(@NotNull dt recordType, @NotNull String advertiserBundleId, @NotNull jg adProvider, @NotNull String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f19805a = recordType;
        this.f19806b = advertiserBundleId;
        this.f19807c = adProvider;
        this.f19808d = adInstanceId;
    }

    @NotNull
    public final C1469g3 a(@NotNull mm<tn, C1469g3> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }

    @NotNull
    public final jg b() {
        return this.f19807c;
    }

    @NotNull
    public final String c() {
        return this.f19806b;
    }

    @NotNull
    public final dt d() {
        return this.f19805a;
    }

    @NotNull
    public final String a() {
        return this.f19808d;
    }
}
