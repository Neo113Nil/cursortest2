package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pm2 implements gt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.yandex.mobile.ads.nativeads.a f30492a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f30494c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AdRequestError adRequestError) {
            super(0);
            this.f30494c = adRequestError;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            pm2.this.f30492a.onAdFailedToLoad(this.f30494c);
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.yandex.mobile.ads.nativeads.e f30496c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.yandex.mobile.ads.nativeads.e eVar) {
            super(0);
            this.f30496c = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            pm2.this.f30492a.onAdLoaded(this.f30496c);
            return Unit.f41027a;
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function0<Unit> {
        c(com.yandex.mobile.ads.nativeads.e eVar) {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            pm2.this.f30492a.a();
            return Unit.f41027a;
        }
    }

    public pm2(@NotNull com.yandex.mobile.ads.nativeads.a loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.f30492a = loadListener;
    }

    @Override // com.yandex.mobile.ads.impl.gt
    public final void b(@NotNull f61 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        new CallbackStackTraceMarker(new c(new com.yandex.mobile.ads.nativeads.e(nativeAd)));
    }

    @Override // com.yandex.mobile.ads.impl.gt
    public final void a(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(error, "error");
        new CallbackStackTraceMarker(new a(new AdRequestError(error.b(), error.d(), error.a())));
    }

    @Override // com.yandex.mobile.ads.impl.gt
    public final void a(@NotNull f61 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        new CallbackStackTraceMarker(new b(new com.yandex.mobile.ads.nativeads.e(nativeAd)));
    }
}
