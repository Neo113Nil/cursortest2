package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class em2 implements at {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final InterstitialAdLoadListener f25359a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f25361c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AdRequestError adRequestError) {
            super(0);
            this.f25361c = adRequestError;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            InterstitialAdLoadListener interstitialAdLoadListener = em2.this.f25359a;
            if (interstitialAdLoadListener != null) {
                interstitialAdLoadListener.onAdFailedToLoad(this.f25361c);
            }
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cm2 f25363c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(cm2 cm2Var) {
            super(0);
            this.f25363c = cm2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            InterstitialAdLoadListener interstitialAdLoadListener = em2.this.f25359a;
            if (interstitialAdLoadListener != null) {
                interstitialAdLoadListener.onAdLoaded(this.f25363c);
            }
            return Unit.f41027a;
        }
    }

    public em2(@Nullable InterstitialAdLoadListener interstitialAdLoadListener) {
        this.f25359a = interstitialAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.at
    public final void a(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(error, "error");
        new CallbackStackTraceMarker(new a(new AdRequestError(error.b(), error.d(), error.a())));
    }

    @Override // com.yandex.mobile.ads.impl.at
    public final void a(@NotNull ys interstitialAd) {
        Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
        new CallbackStackTraceMarker(new b(new cm2(interstitialAd, new zk2())));
    }
}
