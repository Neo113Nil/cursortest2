package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wl2 implements us {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InstreamAdLoadListener f34121a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f34123c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f34123c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            wl2.this.f34121a.onInstreamAdFailedToLoad(this.f34123c);
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ql2 f34125c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ql2 ql2Var) {
            super(0);
            this.f34125c = ql2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            wl2.this.f34121a.onInstreamAdLoaded(this.f34125c);
            return Unit.f41027a;
        }
    }

    public wl2(@NotNull InstreamAdLoadListener yandexAdLoadListener) {
        Intrinsics.checkNotNullParameter(yandexAdLoadListener, "yandexAdLoadListener");
        this.f34121a = yandexAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.us
    public final void onInstreamAdFailedToLoad(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        new CallbackStackTraceMarker(new a(reason));
    }

    @Override // com.yandex.mobile.ads.impl.us
    public final void a(@NotNull qs instreamAd) {
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        new CallbackStackTraceMarker(new b(new ql2(instreamAd)));
    }
}
