package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.y8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2361y8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1800a9 f34929a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2288v4 f34930b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1939g4 f34931c;

    public C2361y8(@NotNull C1800a9 adStateHolder, @NotNull C2288v4 playbackStateController, @NotNull C1939g4 adInfoStorage) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(playbackStateController, "playbackStateController");
        Intrinsics.checkNotNullParameter(adInfoStorage, "adInfoStorage");
        this.f34929a = adStateHolder;
        this.f34930b = playbackStateController;
        this.f34931c = adInfoStorage;
    }

    @NotNull
    public final C1939g4 a() {
        return this.f34931c;
    }

    @NotNull
    public final C1800a9 b() {
        return this.f34929a;
    }

    @NotNull
    public final C2288v4 c() {
        return this.f34930b;
    }
}
