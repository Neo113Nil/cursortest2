package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class gj implements InterfaceC1564t0<InterstitialAd> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu f16526a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterstitialAdLoaderListener f16527b;

    public gj(@NotNull vu threadManager, @NotNull InterstitialAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f16526a = threadManager;
        this.f16527b = publisherListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, gj this$0) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoadFailed error: " + error);
        this$0.f16527b.onInterstitialAdLoadFailed(error);
    }

    @Override // com.ironsource.InterfaceC1564t0
    public void onAdLoadFailed(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f16526a.a(new Runnable() { // from class: com.ironsource.T0
            @Override // java.lang.Runnable
            public final void run() {
                gj.a(IronSourceError.this, this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC1564t0
    public void a(@NotNull final InterstitialAd adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f16526a.a(new Runnable() { // from class: com.ironsource.S0
            @Override // java.lang.Runnable
            public final void run() {
                gj.a(InterstitialAd.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterstitialAd adObject, gj this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f16527b.onInterstitialAdLoaded(adObject);
    }
}
