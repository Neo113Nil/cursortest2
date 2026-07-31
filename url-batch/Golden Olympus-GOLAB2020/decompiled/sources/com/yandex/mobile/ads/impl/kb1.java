package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class kb1 extends kotlin.jvm.internal.s implements Function1<u31, Set<? extends mw0>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ hb1 f28161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    kb1(hb1 hb1Var) {
        super(1);
        this.f28161b = hb1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ow0 ow0Var;
        u31 it = (u31) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        ow0Var = this.f28161b.f26695a;
        ow0Var.getClass();
        return ow0.a(it);
    }
}
