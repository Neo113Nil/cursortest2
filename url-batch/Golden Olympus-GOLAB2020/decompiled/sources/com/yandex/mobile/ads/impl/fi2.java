package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fi2 implements xp1<zh2> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2105n4 f25810a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xp1<zh2> f25811b;

    public fi2(@NotNull C2105n4 adLoadingPhasesManager, @NotNull xp1<zh2> requestListener) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        this.f25810a = adLoadingPhasesManager;
        this.f25811b = requestListener;
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(@NotNull hb2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f25810a.a(EnumC2082m4.f28866w);
        this.f25811b.a(error);
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(zh2 zh2Var) {
        zh2 vmap = zh2Var;
        Intrinsics.checkNotNullParameter(vmap, "vmap");
        this.f25810a.a(EnumC2082m4.f28866w);
        this.f25811b.a((xp1<zh2>) vmap);
    }
}
