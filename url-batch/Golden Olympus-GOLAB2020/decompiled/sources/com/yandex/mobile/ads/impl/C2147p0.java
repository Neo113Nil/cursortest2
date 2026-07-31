package com.yandex.mobile.ads.impl;

import android.content.Intent;
import com.yandex.mobile.ads.impl.C2353y0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2147p0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f30251a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f30252b;

    public C2147p0(@NotNull C2360y7 adResponse, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f30251a = adConfiguration;
        this.f30252b = adResponse;
    }

    @NotNull
    public final C2353y0 a(@NotNull Intent resultActivityIntent) {
        Intrinsics.checkNotNullParameter(resultActivityIntent, "resultActivityIntent");
        return new C2353y0(new C2353y0.a(this.f30252b, this.f30251a, new C1871d8()).a(resultActivityIntent));
    }
}
