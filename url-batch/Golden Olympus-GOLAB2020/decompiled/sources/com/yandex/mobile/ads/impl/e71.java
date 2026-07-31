package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e71 implements InterfaceC1921fa {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final aa1 f25122a;

    public e71(@NotNull aa1 nativeAdValidator) {
        Intrinsics.checkNotNullParameter(nativeAdValidator, "nativeAdValidator");
        this.f25122a = nativeAdValidator;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1921fa
    public final boolean a() {
        return this.f25122a.c();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1921fa
    public final boolean b() {
        return !this.f25122a.b();
    }
}
