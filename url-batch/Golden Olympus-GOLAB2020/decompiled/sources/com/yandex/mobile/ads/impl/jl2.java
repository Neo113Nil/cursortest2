package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
final class jl2 extends kotlin.jvm.internal.s implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kl2 f27722b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f27723c = "Cannot load bidder token. Token generation failed";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jl2(kl2 kl2Var) {
        super(0);
        this.f27722b = kl2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f27722b.f28245a.onBidderTokenFailedToLoad(this.f27723c);
        return Unit.f41027a;
    }
}
