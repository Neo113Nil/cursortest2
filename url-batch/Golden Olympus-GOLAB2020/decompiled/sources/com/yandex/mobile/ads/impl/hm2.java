package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hm2 implements dt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final NativeAdEventListener f26822a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            hm2.this.f26822a.onAdClicked();
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ol2 f26825c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ol2 ol2Var) {
            super(0);
            this.f26825c = ol2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            hm2.this.f26822a.onImpression(this.f26825c);
            return Unit.f41027a;
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            hm2.this.f26822a.onLeftApplication();
            return Unit.f41027a;
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            hm2.this.f26822a.onReturnedToApplication();
            return Unit.f41027a;
        }
    }

    public hm2(@NotNull NativeAdEventListener nativeAdEventListener) {
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        this.f26822a = nativeAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void closeNativeAd() {
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new a());
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void onLeftApplication() {
        new CallbackStackTraceMarker(new c());
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker(new d());
    }

    @Override // com.yandex.mobile.ads.impl.dt
    public final void a(@Nullable C1795a4 c1795a4) {
        new CallbackStackTraceMarker(new b(c1795a4 != null ? new ol2(c1795a4) : null));
    }
}
