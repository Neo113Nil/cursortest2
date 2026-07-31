package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.cj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1858cj implements InterfaceC1906ej {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24226a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24227b;

    public C1858cj(@NotNull C2360y7 adResponse, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f24226a = z4;
        this.f24227b = z5;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1906ej
    public final boolean a() {
        return this.f24227b;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1906ej
    public final boolean b() {
        return this.f24226a;
    }
}
