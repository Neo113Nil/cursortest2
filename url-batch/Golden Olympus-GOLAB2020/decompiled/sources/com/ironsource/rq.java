package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class rq implements InterfaceC1564t0<RewardedAd> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu f18920a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final RewardedAdLoaderListener f18921b;

    public rq(@NotNull vu threadManager, @NotNull RewardedAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f18920a = threadManager;
        this.f18921b = publisherListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(rq this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.f18921b.onRewardedAdLoadFailed(error);
    }

    @Override // com.ironsource.InterfaceC1564t0
    public void onAdLoadFailed(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + error);
        this.f18920a.a(new Runnable() { // from class: com.ironsource.D3
            @Override // java.lang.Runnable
            public final void run() {
                rq.a(rq.this, error);
            }
        });
    }

    @Override // com.ironsource.InterfaceC1564t0
    public void a(@NotNull final RewardedAd adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f18920a.a(new Runnable() { // from class: com.ironsource.E3
            @Override // java.lang.Runnable
            public final void run() {
                rq.a(RewardedAd.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(RewardedAd adObject, rq this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f18921b.onRewardedAdLoaded(adObject);
    }
}
