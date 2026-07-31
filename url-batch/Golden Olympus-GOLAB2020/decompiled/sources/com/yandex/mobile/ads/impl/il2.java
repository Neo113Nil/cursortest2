package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class il2 implements ls {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final BannerAdEventListener f27241a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            BannerAdEventListener bannerAdEventListener = il2.this.f27241a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onAdClicked();
            }
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f27244c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AdRequestError adRequestError) {
            super(0);
            this.f27244c = adRequestError;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            BannerAdEventListener bannerAdEventListener = il2.this.f27241a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onAdFailedToLoad(this.f27244c);
            }
            return Unit.f41027a;
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            BannerAdEventListener bannerAdEventListener = il2.this.f27241a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onAdLoaded();
            }
            return Unit.f41027a;
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ol2 f27247c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ol2 ol2Var) {
            super(0);
            this.f27247c = ol2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            BannerAdEventListener bannerAdEventListener = il2.this.f27241a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onImpression(this.f27247c);
            }
            return Unit.f41027a;
        }
    }

    static final class e extends kotlin.jvm.internal.s implements Function0<Unit> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            BannerAdEventListener bannerAdEventListener = il2.this.f27241a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onLeftApplication();
            }
            return Unit.f41027a;
        }
    }

    static final class f extends kotlin.jvm.internal.s implements Function0<Unit> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            BannerAdEventListener bannerAdEventListener = il2.this.f27241a;
            if (bannerAdEventListener != null) {
                bannerAdEventListener.onReturnedToApplication();
            }
            return Unit.f41027a;
        }
    }

    public il2(@Nullable BannerAdEventListener bannerAdEventListener) {
        this.f27241a = bannerAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.ls
    public final void closeBannerAd() {
    }

    @Override // com.yandex.mobile.ads.impl.ls
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new a());
    }

    @Override // com.yandex.mobile.ads.impl.ls
    public final void onAdLoaded() {
        new CallbackStackTraceMarker(new c());
    }

    @Override // com.yandex.mobile.ads.impl.ls
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new e());
    }

    @Override // com.yandex.mobile.ads.impl.ls
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new f());
    }

    @Override // com.yandex.mobile.ads.impl.ls
    public final void a(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(error, "error");
        new CallbackStackTraceMarker(new b(new AdRequestError(error.b(), error.d(), error.a())));
    }

    @Override // com.yandex.mobile.ads.impl.ls
    public final void a(@Nullable C1795a4 c1795a4) {
        new CallbackStackTraceMarker(new d(c1795a4 != null ? new ol2(c1795a4) : null));
    }
}
