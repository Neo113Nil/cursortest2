package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class nl2 implements dt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ClosableNativeAdEventListener f29675a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            nl2.this.f29675a.closeNativeAd();
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            nl2.this.f29675a.onAdClicked();
            return Unit.f41027a;
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ol2 f29679c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ol2 ol2Var) {
            super(0);
            this.f29679c = ol2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            nl2.this.f29675a.onImpression(this.f29679c);
            return Unit.f41027a;
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            nl2.this.f29675a.onLeftApplication();
            return Unit.f41027a;
        }
    }

    static final class e extends kotlin.jvm.internal.s implements Function0<Unit> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            nl2.this.f29675a.onReturnedToApplication();
            return Unit.f41027a;
        }
    }

    public nl2(@NotNull ClosableNativeAdEventListener adEventListener) {
        Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        this.f29675a = adEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void closeNativeAd() {
        new CallbackStackTraceMarker(new a());
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new b());
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new d());
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new e());
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void a(@Nullable C1795a4 c1795a4) {
        new CallbackStackTraceMarker(new c(c1795a4 != null ? new ol2(c1795a4) : null));
    }
}
