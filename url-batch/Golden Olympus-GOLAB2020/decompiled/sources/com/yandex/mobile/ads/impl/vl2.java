package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.instream.InstreamAdListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vl2 implements al0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InstreamAdListener f33671a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33673c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f33673c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            vl2.this.f33671a.onError(this.f33673c);
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            vl2.this.f33671a.onInstreamAdCompleted();
            return Unit.f41027a;
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            vl2.this.f33671a.onInstreamAdPrepared();
            return Unit.f41027a;
        }
    }

    public vl2(@NotNull InstreamAdListener instreamAdListener) {
        Intrinsics.checkNotNullParameter(instreamAdListener, "instreamAdListener");
        this.f33671a = instreamAdListener;
    }

    @Override // com.yandex.mobile.ads.impl.al0
    public final void onError(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        new CallbackStackTraceMarker(new a(reason));
    }

    @Override // com.yandex.mobile.ads.impl.al0
    public final void onInstreamAdCompleted() {
        new CallbackStackTraceMarker(new b());
    }

    @Override // com.yandex.mobile.ads.impl.al0
    public final void onInstreamAdPrepared() {
        new CallbackStackTraceMarker(new c());
    }
}
