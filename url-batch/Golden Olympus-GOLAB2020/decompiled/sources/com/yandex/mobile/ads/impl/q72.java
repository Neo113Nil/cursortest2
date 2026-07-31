package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.in0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class q72 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f30699a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final il0 f30700b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final in0 f30701c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q72(vu1 vu1Var, il0 il0Var) {
        this(vu1Var, il0Var, in0.a.a());
        int i4 = in0.f27295g;
    }

    @NotNull
    public final p72 a(@NotNull Context context, @NotNull ss coreInstreamAdBreak, @NotNull ob2 videoAdInfo, @NotNull kn0 instreamVastAdPlayer, @NotNull bg2 videoTracker, @NotNull sk1 imageProvider, @NotNull cb2 playbackListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(playbackListener, "playbackListener");
        if (!this.f30701c.e()) {
            vu1 vu1Var = this.f30699a;
            iu iuVar = new iu();
            vn0 vn0Var = new vn0(iuVar);
            wd2 a4 = vn0Var.a(videoAdInfo.b(), null);
            return new bo(context, vu1Var, coreInstreamAdBreak, instreamVastAdPlayer, videoAdInfo, videoTracker, playbackListener, iuVar, vn0Var, a4, new hm0(context, vu1Var, coreInstreamAdBreak, videoAdInfo, videoTracker, playbackListener, a4), new C2083m5(instreamVastAdPlayer));
        }
        vu1 vu1Var2 = this.f30699a;
        il0 il0Var = this.f30700b;
        as asVar = new as(context, instreamVastAdPlayer, coreInstreamAdBreak, videoAdInfo, videoTracker, playbackListener);
        qm0 qm0Var = new qm0();
        pm0 a5 = qm0.a(context, videoAdInfo);
        C2070lg c2070lg = new C2070lg(context, vu1Var2, videoAdInfo, coreInstreamAdBreak, videoTracker, playbackListener, imageProvider, a5);
        List<nm0> a6 = c2070lg.a();
        C2254tg c2254tg = new C2254tg(a6);
        im0 im0Var = new im0();
        ym0 ym0Var = new ym0();
        int i4 = ew1.f25476l;
        xm0 a7 = ym0.a(ew1.a.a().a(context));
        return new zr(context, vu1Var2, il0Var, instreamVastAdPlayer, coreInstreamAdBreak, videoAdInfo, videoTracker, imageProvider, playbackListener, asVar, qm0Var, a5, c2070lg, a6, c2254tg, im0Var, ym0Var, a7, new fm0(il0Var, a7));
    }

    public q72(@NotNull vu1 sdkEnvironmentModule, @NotNull il0 customUiElementsHolder, @NotNull in0 instreamSettings) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(customUiElementsHolder, "customUiElementsHolder");
        Intrinsics.checkNotNullParameter(instreamSettings, "instreamSettings");
        this.f30699a = sdkEnvironmentModule;
        this.f30700b = customUiElementsHolder;
        this.f30701c = instreamSettings;
    }
}
