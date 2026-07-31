package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ya1 implements gc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f34965a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34966b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34967c;

    public ya1(@NotNull String url, int i4, int i5) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f34965a = url;
        this.f34966b = i4;
        this.f34967c = i5;
    }

    public final int getAdHeight() {
        return this.f34967c;
    }

    public final int getAdWidth() {
        return this.f34966b;
    }

    @Override // com.yandex.mobile.ads.impl.gc2
    @NotNull
    public final String getUrl() {
        return this.f34965a;
    }
}
