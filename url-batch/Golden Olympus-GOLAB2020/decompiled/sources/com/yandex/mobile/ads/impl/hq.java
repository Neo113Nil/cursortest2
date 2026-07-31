package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hq {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private d50 f26887a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private C1803ac f26888b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<String> f26889c;

    public /* synthetic */ hq() {
        this(new C1803ac(), new d50());
    }

    @NotNull
    public final C1803ac a() {
        return this.f26888b;
    }

    @NotNull
    public final d50 b() {
        return this.f26887a;
    }

    @NotNull
    public final List<String> c() {
        return this.f26889c;
    }

    public final void a(@NotNull C1803ac c1803ac) {
        Intrinsics.checkNotNullParameter(c1803ac, "<set-?>");
        this.f26888b = c1803ac;
    }

    public hq(@NotNull C1803ac advertisingConfiguration, @NotNull d50 environmentConfiguration) {
        Intrinsics.checkNotNullParameter(environmentConfiguration, "environmentConfiguration");
        Intrinsics.checkNotNullParameter(advertisingConfiguration, "advertisingConfiguration");
        this.f26887a = environmentConfiguration;
        this.f26888b = advertisingConfiguration;
        this.f26889c = CollectionsKt.listOf((Object[]) new String[]{"small", "medium", "large"});
    }

    public final void a(@NotNull d50 d50Var) {
        Intrinsics.checkNotNullParameter(d50Var, "<set-?>");
        this.f26887a = d50Var;
    }
}
