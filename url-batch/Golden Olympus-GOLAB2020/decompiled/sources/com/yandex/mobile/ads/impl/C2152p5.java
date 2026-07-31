package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.p5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2152p5 implements xo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2106n5 f30341a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30342b;

    public C2152p5(@NotNull C2106n5 adPod, int i4) {
        Intrinsics.checkNotNullParameter(adPod, "adPod");
        this.f30341a = adPod;
        this.f30342b = i4;
    }

    @Override // com.yandex.mobile.ads.impl.xo
    public final boolean a() {
        return this.f30341a.a() <= this.f30342b;
    }
}
