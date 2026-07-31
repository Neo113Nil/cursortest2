package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p02 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ej0 f30261a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f30262b;

    public p02(@NotNull ej0 imageValue, @NotNull String title) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f30261a = imageValue;
        this.f30262b = title;
    }

    @NotNull
    public final ej0 a() {
        return this.f30261a;
    }

    @NotNull
    public final String b() {
        return this.f30262b;
    }
}
