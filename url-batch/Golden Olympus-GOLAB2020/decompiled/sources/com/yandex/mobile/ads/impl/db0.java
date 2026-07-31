package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class db0 implements vl1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uh1 f24539a;

    public db0(@NotNull uh1 progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f24539a = progress;
    }

    @Override // com.yandex.mobile.ads.impl.vl1
    @NotNull
    public final uh1 a() {
        return this.f24539a;
    }
}
