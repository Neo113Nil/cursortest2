package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ag1 {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f23273c = {C1873da.a(ag1.class, "loadController", "getLoadController()Lcom/monetization/ads/base/BaseAdLoadController;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bg1 f23274a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ao1 f23275b;

    public /* synthetic */ ag1(AbstractC2025jj abstractC2025jj, sy0 sy0Var, C2105n4 c2105n4) {
        this(abstractC2025jj, sy0Var, c2105n4, new C1945ga());
    }

    public final void a() {
        AbstractC2025jj abstractC2025jj = (AbstractC2025jj) this.f23275b.getValue(this, f23273c[0]);
        if (abstractC2025jj == null || abstractC2025jj.g()) {
            return;
        }
        abstractC2025jj.a(this.f23274a);
    }

    public ag1(@NotNull AbstractC2025jj<?> loadController, @NotNull sy0 mediationData, @NotNull C2105n4 adLoadingPhasesManager, @NotNull C1945ga adapterLoadingDurationProvider) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        Intrinsics.checkNotNullParameter(mediationData, "mediationData");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(adapterLoadingDurationProvider, "adapterLoadingDurationProvider");
        this.f23275b = bo1.a(loadController);
        List<C2058l4> b4 = adLoadingPhasesManager.b();
        adapterLoadingDurationProvider.getClass();
        this.f23274a = new bg1(new cg1(C1945ga.a(b4), mediationData));
    }
}
