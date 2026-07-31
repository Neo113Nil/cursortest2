package com.ironsource;

import com.unity3d.ironsourceads.rewarded.RewardedAd;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class kq implements InterfaceC1439c1<RewardedAd> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC1541q3 f16964a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f16965b;

    public kq(@NotNull InterfaceC1541q3 analytics, @NotNull Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f16964a = analytics;
        this.f16965b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC1439c1
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RewardedAd a(@NotNull sj adInstance, @NotNull C1587w4 auctionDataReporter) {
        ConcurrentHashMap concurrentHashMap;
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        C1432b1 c1432b1 = new C1432b1(new Cdo());
        InterfaceC1541q3 interfaceC1541q3 = this.f16964a;
        concurrentHashMap = lq.f17113a;
        return new RewardedAd(new nq(adInstance, c1432b1, auctionDataReporter, interfaceC1541q3, null, null, null, null, concurrentHashMap, 240, null));
    }
}
