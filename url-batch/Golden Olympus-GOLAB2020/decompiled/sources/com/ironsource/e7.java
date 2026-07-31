package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class e7 implements InterfaceC1564t0<BannerAdView> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu f15980a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final BannerAdLoaderListener f15981b;

    public e7(@NotNull vu threadManager, @NotNull BannerAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f15980a = threadManager;
        this.f15981b = publisherListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, e7 this$0) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + error);
        this$0.f15981b.onBannerAdLoadFailed(error);
    }

    @Override // com.ironsource.InterfaceC1564t0
    public void onAdLoadFailed(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f15980a.a(new Runnable() { // from class: com.ironsource.T
            @Override // java.lang.Runnable
            public final void run() {
                e7.a(IronSourceError.this, this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC1564t0
    public void a(@NotNull final BannerAdView adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f15980a.a(new Runnable() { // from class: com.ironsource.S
            @Override // java.lang.Runnable
            public final void run() {
                e7.a(BannerAdView.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BannerAdView adObject, e7 this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f15981b.onBannerAdLoaded(adObject);
    }
}
