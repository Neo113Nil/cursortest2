package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class n02 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dr0 f29323a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f29324b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final p02 f29325c;

    public n02(@NotNull dr0 link, @NotNull String name, @NotNull p02 value) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f29323a = link;
        this.f29324b = name;
        this.f29325c = value;
    }

    @NotNull
    public final dr0 a() {
        return this.f29323a;
    }

    @NotNull
    public final String b() {
        return this.f29324b;
    }

    @NotNull
    public final p02 c() {
        return this.f29325c;
    }
}
