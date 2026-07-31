package com.ironsource;

import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class aj implements InterfaceC1439c1<InterstitialAd> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC1541q3 f15078a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f15079b;

    public aj(@NotNull InterfaceC1541q3 analytics, @NotNull Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f15078a = analytics;
        this.f15079b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC1439c1
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterstitialAd a(@NotNull sj adInstance, @NotNull C1587w4 auctionDataReporter) {
        ConcurrentHashMap concurrentHashMap;
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        C1432b1 c1432b1 = new C1432b1(new Cdo());
        InterfaceC1541q3 interfaceC1541q3 = this.f15078a;
        concurrentHashMap = bj.f15614a;
        return new InterstitialAd(new cj(adInstance, c1432b1, auctionDataReporter, interfaceC1541q3, null, null, null, null, concurrentHashMap, 240, null));
    }
}
