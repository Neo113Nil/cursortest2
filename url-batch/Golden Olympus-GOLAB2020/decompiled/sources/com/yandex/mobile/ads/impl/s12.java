package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s12 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2387zb f31536a;

    public s12(@NotNull C2387zb advertiserPresentController) {
        Intrinsics.checkNotNullParameter(advertiserPresentController, "advertiserPresentController");
        this.f31536a = advertiserPresentController;
    }

    @NotNull
    public final r12 a(@NotNull ob2<on0> videoAdInfo) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        return videoAdInfo.f() != null ? r12.f30997c : this.f31536a.a() ? r12.f30998d : r12.f30996b;
    }
}
