package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cb0 implements ul1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vh1 f24153a;

    public cb0(@NotNull vh1 progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f24153a = progress;
    }

    @Override // com.yandex.mobile.ads.impl.ul1
    @NotNull
    public final vh1 a() {
        return this.f24153a;
    }
}
