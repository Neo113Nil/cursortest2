package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pl1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f30483a;

    /* renamed from: b, reason: collision with root package name */
    private final long f30484b;

    public pl1(@NotNull String trackingUrl, long j4) {
        Intrinsics.checkNotNullParameter(trackingUrl, "trackingUrl");
        this.f30483a = trackingUrl;
        this.f30484b = j4;
    }

    public final long a() {
        return this.f30484b;
    }

    @NotNull
    public final String b() {
        return this.f30483a;
    }
}
