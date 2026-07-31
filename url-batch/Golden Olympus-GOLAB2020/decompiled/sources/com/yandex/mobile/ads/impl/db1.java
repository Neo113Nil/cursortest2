package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class db1 implements jf2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ig2 f24540a;

    public db1(@NotNull qb1 videoViewProvider) {
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        this.f24540a = new ig2(videoViewProvider);
    }

    @Override // com.yandex.mobile.ads.impl.jf2
    public final boolean a() {
        return this.f24540a.a();
    }
}
