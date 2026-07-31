package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fe1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xr0 f25764a;

    public fe1(@NotNull xr0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f25764a = localStorage;
    }

    @Nullable
    public final String a() {
        return this.f25764a.d("YmadOmSdkJs");
    }

    @Nullable
    public final String b() {
        return this.f25764a.d("YmadOmSdkJsUrl");
    }

    public final void a(@Nullable String str) {
        this.f25764a.a("YmadOmSdkJs", str);
    }

    public final void b(@Nullable String str) {
        this.f25764a.a("YmadOmSdkJsUrl", str);
    }
}
