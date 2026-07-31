package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.yb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2364yb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ob2<on0> f34969a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2387zb f34970b;

    public C2364yb(@NotNull ob2<on0> videoAdInfo, @NotNull C2387zb advertiserPresentController) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(advertiserPresentController, "advertiserPresentController");
        this.f34969a = videoAdInfo;
        this.f34970b = advertiserPresentController;
    }

    @NotNull
    public final InterfaceC2341xb a() {
        r12 a4 = new s12(this.f34970b).a(this.f34969a);
        w02 f4 = this.f34969a.f();
        return (r12.f30997c != a4 || f4 == null) ? r12.f30998d == a4 ? new r40() : new py() : new v02(f4);
    }
}
