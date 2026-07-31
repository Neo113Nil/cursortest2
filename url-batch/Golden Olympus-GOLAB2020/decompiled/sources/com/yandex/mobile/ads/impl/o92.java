package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class o92 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final j92 f29948a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f29949b;

    public o92(@NotNull j92 vast, @Nullable String str) {
        Intrinsics.checkNotNullParameter(vast, "vast");
        this.f29948a = vast;
        this.f29949b = str;
    }

    @Nullable
    public final String a() {
        return this.f29949b;
    }

    @NotNull
    public final j92 b() {
        return this.f29948a;
    }
}
