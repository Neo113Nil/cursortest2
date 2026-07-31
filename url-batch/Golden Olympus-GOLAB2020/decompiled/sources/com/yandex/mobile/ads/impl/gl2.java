package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.appopenad.AppOpenAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gl2 implements is {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final AppOpenAdEventListener f26213a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AppOpenAdEventListener appOpenAdEventListener = gl2.this.f26213a;
            if (appOpenAdEventListener != null) {
                appOpenAdEventListener.onAdClicked();
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
            AppOpenAdEventListener appOpenAdEventListener = gl2.this.f26213a;
            if (appOpenAdEventListener != null) {
                appOpenAdEventListener.onAdDismissed();
            }
            return Unit.f41027a;
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ yk2 f26217c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(yk2 yk2Var) {
            super(0);
            this.f26217c = yk2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AppOpenAdEventListener appOpenAdEventListener = gl2.this.f26213a;
            if (appOpenAdEventListener != null) {
                appOpenAdEventListener.onAdFailedToShow(this.f26217c);
            }
            return Unit.f41027a;
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ol2 f26219c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ol2 ol2Var) {
            super(0);
            this.f26219c = ol2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AppOpenAdEventListener appOpenAdEventListener = gl2.this.f26213a;
            if (appOpenAdEventListener != null) {
                appOpenAdEventListener.onAdImpression(this.f26219c);
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
            AppOpenAdEventListener appOpenAdEventListener = gl2.this.f26213a;
            if (appOpenAdEventListener != null) {
                appOpenAdEventListener.onAdShown();
            }
            return Unit.f41027a;
        }
    }

    public gl2(@Nullable AppOpenAdEventListener appOpenAdEventListener) {
        this.f26213a = appOpenAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new a());
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void onAdDismissed() {
        new CallbackStackTraceMarker(new b());
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void onAdShown() {
        new CallbackStackTraceMarker(new e());
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(@NotNull zx1 adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        new CallbackStackTraceMarker(new c(new yk2(adError.a())));
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(@Nullable C1795a4 c1795a4) {
        new CallbackStackTraceMarker(new d(c1795a4 != null ? new ol2(c1795a4) : null));
    }
}
