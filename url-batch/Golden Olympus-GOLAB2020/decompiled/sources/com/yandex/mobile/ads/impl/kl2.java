package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class kl2 implements ns {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final BidderTokenLoadListener f28245a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28247c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f28247c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            kl2.this.f28245a.onBidderTokenLoaded(this.f28247c);
            return Unit.f41027a;
        }
    }

    public kl2(@NotNull BidderTokenLoadListener bidderTokenLoadListener) {
        Intrinsics.checkNotNullParameter(bidderTokenLoadListener, "bidderTokenLoadListener");
        this.f28245a = bidderTokenLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.ns
    public final void onBidderTokenLoaded(@NotNull String bidderToken) {
        Intrinsics.checkNotNullParameter(bidderToken, "bidderToken");
        new CallbackStackTraceMarker(new a(bidderToken));
    }

    @Override // com.yandex.mobile.ads.impl.ns
    public final void a() {
        Intrinsics.checkNotNullParameter("Cannot load bidder token. Token generation failed", "failureReason");
        new CallbackStackTraceMarker(new jl2(this));
    }
}
