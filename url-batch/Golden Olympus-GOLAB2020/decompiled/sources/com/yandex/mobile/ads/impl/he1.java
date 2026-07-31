package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class he1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC2062l8 f26721a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lv0 f26722b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2309w2 f26723c;

    public he1(@NotNull ln2 adSession, @NotNull lv0 mediaEvents, @NotNull C2309w2 adEvents) {
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        Intrinsics.checkNotNullParameter(mediaEvents, "mediaEvents");
        Intrinsics.checkNotNullParameter(adEvents, "adEvents");
        this.f26721a = adSession;
        this.f26722b = mediaEvents;
        this.f26723c = adEvents;
    }

    @NotNull
    public final C2309w2 a() {
        return this.f26723c;
    }

    @NotNull
    public final AbstractC2062l8 b() {
        return this.f26721a;
    }

    @NotNull
    public final lv0 c() {
        return this.f26722b;
    }
}
