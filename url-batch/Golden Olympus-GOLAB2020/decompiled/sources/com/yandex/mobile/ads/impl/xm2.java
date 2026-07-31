package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.SliderAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xm2 implements wt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SliderAdLoadListener f34631a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f34633c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AdRequestError adRequestError) {
            super(0);
            this.f34633c = adRequestError;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            xm2.this.f34631a.onSliderAdFailedToLoad(this.f34633c);
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.yandex.mobile.ads.nativeads.i f34635c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.yandex.mobile.ads.nativeads.i iVar) {
            super(0);
            this.f34635c = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            xm2.this.f34631a.onSliderAdLoaded(this.f34635c);
            return Unit.f41027a;
        }
    }

    public xm2(@NotNull SliderAdLoadListener loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.f34631a = loadListener;
    }

    @Override // com.yandex.mobile.ads.impl.wt
    public final void a(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        new CallbackStackTraceMarker(new a(new AdRequestError(error.b(), error.d(), error.a())));
    }

    @Override // com.yandex.mobile.ads.impl.wt
    public final void a(@NotNull pz1 sliderAd) {
        Intrinsics.checkNotNullParameter(sliderAd, "sliderAd");
        new CallbackStackTraceMarker(new b(new com.yandex.mobile.ads.nativeads.i(sliderAd, new com.yandex.mobile.ads.nativeads.g())));
    }
}
