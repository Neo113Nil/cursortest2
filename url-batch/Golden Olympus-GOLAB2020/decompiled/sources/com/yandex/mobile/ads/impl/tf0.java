package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class tf0 implements InterfaceC2333x3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<String> f32414a;

    public tf0(@NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f32414a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2333x3
    @Nullable
    public final String a() {
        return this.f32414a.d();
    }
}
