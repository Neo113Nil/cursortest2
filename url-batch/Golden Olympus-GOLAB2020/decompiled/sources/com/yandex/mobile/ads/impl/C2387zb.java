package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.zb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2387zb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l70 f35539a;

    public C2387zb(@NotNull bb2 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f35539a = new l70(videoAd.l());
    }

    public final boolean a() {
        return this.f35539a.a();
    }
}
