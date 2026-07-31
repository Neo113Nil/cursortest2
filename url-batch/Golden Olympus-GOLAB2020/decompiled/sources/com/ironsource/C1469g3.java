package com.ironsource;

import java.util.Calendar;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1469g3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dt f16328a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final jg f16329b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f16330c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16331d;

    public C1469g3(@NotNull dt recordType, @NotNull jg adProvider, @NotNull String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f16328a = recordType;
        this.f16329b = adProvider;
        this.f16330c = adInstanceId;
        this.f16331d = Calendar.getInstance().getTimeInMillis() / 1000;
    }

    @NotNull
    public final String a() {
        return this.f16330c;
    }

    @NotNull
    public final jg b() {
        return this.f16329b;
    }

    @NotNull
    public final Map<String, Object> c() {
        return MapsKt.mapOf(TuplesKt.to(zk.f20552c, Integer.valueOf(this.f16329b.b())), TuplesKt.to("ts", String.valueOf(this.f16331d)));
    }

    @NotNull
    public final Map<String, Object> d() {
        return MapsKt.mapOf(TuplesKt.to(zk.f20551b, this.f16330c), TuplesKt.to(zk.f20552c, Integer.valueOf(this.f16329b.b())), TuplesKt.to("ts", String.valueOf(this.f16331d)), TuplesKt.to("rt", Integer.valueOf(this.f16328a.ordinal())));
    }

    @NotNull
    public final dt e() {
        return this.f16328a;
    }

    public final long f() {
        return this.f16331d;
    }
}
