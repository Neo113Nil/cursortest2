package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pm1 implements InterfaceC2194r2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC2262u1 f30491a;

    public pm1(@NotNull InterfaceC2262u1 adBlockCompleteListener) {
        Intrinsics.checkNotNullParameter(adBlockCompleteListener, "adBlockCompleteListener");
        this.f30491a = adBlockCompleteListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2194r2
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2194r2
    public final void b() {
        this.f30491a.b();
    }
}
