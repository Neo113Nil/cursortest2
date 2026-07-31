package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sl2 implements ws0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InstreamAdBreakEventListener f31832a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            sl2.this.f31832a.onInstreamAdBreakCompleted();
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31835c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.f31835c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            sl2.this.f31832a.onInstreamAdBreakError(this.f31835c);
            return Unit.f41027a;
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            sl2.this.f31832a.onInstreamAdBreakPrepared();
            return Unit.f41027a;
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            sl2.this.f31832a.onInstreamAdBreakStarted();
            return Unit.f41027a;
        }
    }

    public sl2(@NotNull InstreamAdBreakEventListener adBreakEventListener) {
        Intrinsics.checkNotNullParameter(adBreakEventListener, "adBreakEventListener");
        this.f31832a = adBreakEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.ws0
    public final void onInstreamAdBreakCompleted() {
        new CallbackStackTraceMarker(new a());
    }

    @Override // com.yandex.mobile.ads.impl.ws0
    public final void onInstreamAdBreakError(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        new CallbackStackTraceMarker(new b(reason));
    }

    @Override // com.yandex.mobile.ads.impl.ws0
    public final void onInstreamAdBreakPrepared() {
        new CallbackStackTraceMarker(new c());
    }

    @Override // com.yandex.mobile.ads.impl.ws0
    public final void onInstreamAdBreakStarted() {
        new CallbackStackTraceMarker(new d());
    }
}
