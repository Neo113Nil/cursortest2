package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class km2 implements gt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final NativeAdLoadListener f28258a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f28260c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AdRequestError adRequestError) {
            super(0);
            this.f28260c = adRequestError;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            km2.this.f28258a.onAdFailedToLoad(this.f28260c);
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.yandex.mobile.ads.nativeads.e f28262c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.yandex.mobile.ads.nativeads.e eVar) {
            super(0);
            this.f28262c = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            km2.this.f28258a.onAdLoaded(this.f28262c);
            return Unit.f41027a;
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.yandex.mobile.ads.nativeads.e f28264c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(com.yandex.mobile.ads.nativeads.e eVar) {
            super(0);
            this.f28264c = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            km2.this.f28258a.onAdLoaded(this.f28264c);
            return Unit.f41027a;
        }
    }

    public km2(@NotNull NativeAdLoadListener nativeAdLoadListener) {
        Intrinsics.checkNotNullParameter(nativeAdLoadListener, "nativeAdLoadListener");
        this.f28258a = nativeAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.gt
    public final void b(@NotNull f61 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        new CallbackStackTraceMarker(new c(new com.yandex.mobile.ads.nativeads.e(nativeAd)));
    }

    @Override // com.yandex.mobile.ads.impl.gt
    public final void a(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        new CallbackStackTraceMarker(new a(new AdRequestError(error.b(), error.d(), error.a())));
    }

    @Override // com.yandex.mobile.ads.impl.gt
    public final void a(@NotNull f61 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        new CallbackStackTraceMarker(new b(new com.yandex.mobile.ads.nativeads.e(nativeAd)));
    }
}
