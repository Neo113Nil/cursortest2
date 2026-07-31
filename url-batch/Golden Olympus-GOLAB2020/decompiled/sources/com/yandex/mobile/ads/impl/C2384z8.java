package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.z8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2384z8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1824b9 f35503a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2311w4 f35504b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1963h4 f35505c;

    public C2384z8(@NotNull C1824b9 adStateHolder, @NotNull C2311w4 playbackStateController, @NotNull C1963h4 adInfoStorage) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(playbackStateController, "playbackStateController");
        Intrinsics.checkNotNullParameter(adInfoStorage, "adInfoStorage");
        this.f35503a = adStateHolder;
        this.f35504b = playbackStateController;
        this.f35505c = adInfoStorage;
    }

    @NotNull
    public final C1963h4 a() {
        return this.f35505c;
    }

    @NotNull
    public final C1824b9 b() {
        return this.f35503a;
    }

    @NotNull
    public final C2311w4 c() {
        return this.f35504b;
    }
}
