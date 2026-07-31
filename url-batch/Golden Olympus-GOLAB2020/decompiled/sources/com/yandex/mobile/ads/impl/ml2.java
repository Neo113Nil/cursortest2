package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.banner.ClosableBannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ml2 implements ls {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final ClosableBannerAdEventListener f29145a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = ml2.this.f29145a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.closeBannerAd();
            }
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = ml2.this.f29145a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onAdClicked();
            }
            return Unit.f41027a;
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f29149c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AdRequestError adRequestError) {
            super(0);
            this.f29149c = adRequestError;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = ml2.this.f29145a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onAdFailedToLoad(this.f29149c);
            }
            return Unit.f41027a;
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = ml2.this.f29145a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onAdLoaded();
            }
            return Unit.f41027a;
        }
    }

    static final class e extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ol2 f29152c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ol2 ol2Var) {
            super(0);
            this.f29152c = ol2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = ml2.this.f29145a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onImpression(this.f29152c);
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
            ClosableBannerAdEventListener closableBannerAdEventListener = ml2.this.f29145a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onLeftApplication();
            }
            return Unit.f41027a;
        }
    }

    static final class g extends kotlin.jvm.internal.s implements Function0<Unit> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ClosableBannerAdEventListener closableBannerAdEventListener = ml2.this.f29145a;
            if (closableBannerAdEventListener != null) {
                closableBannerAdEventListener.onReturnedToApplication();
            }
            return Unit.f41027a;
        }
    }

    public ml2(@Nullable ClosableBannerAdEventListener closableBannerAdEventListener) {
        this.f29145a = closableBannerAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.ls
    public final void closeBannerAd() {
        new CallbackStackTraceMarker(new a());
    }

    @Override // com.yandex.mobile.ads.impl.ls
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new b());
    }

    @Override // com.yandex.mobile.ads.impl.ls
    public final void onAdLoaded() {
        new CallbackStackTraceMarker(new d());
    }

    @Override // com.yandex.mobile.ads.impl.ls
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new f());
    }

    @Override // com.yandex.mobile.ads.impl.ls
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new g());
    }

    @Override // com.yandex.mobile.ads.impl.ls
    public final void a(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(error, "error");
        new CallbackStackTraceMarker(new c(new AdRequestError(error.b(), error.d(), error.a())));
    }

    @Override // com.yandex.mobile.ads.impl.ls
    public final void a(@Nullable C1795a4 c1795a4) {
        new CallbackStackTraceMarker(new e(c1795a4 != null ? new ol2(c1795a4) : null));
    }
}
