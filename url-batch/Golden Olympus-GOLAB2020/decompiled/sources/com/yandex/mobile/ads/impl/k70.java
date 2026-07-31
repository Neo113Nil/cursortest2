package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k70 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f28086a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f28087b;

    public k70(@NotNull String type, @NotNull String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f28086a = type;
        this.f28087b = value;
    }

    @NotNull
    public final String a() {
        return this.f28086a;
    }

    @NotNull
    public final String b() {
        return this.f28087b;
    }
}
