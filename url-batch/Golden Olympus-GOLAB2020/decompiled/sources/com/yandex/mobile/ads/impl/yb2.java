package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
final class yb2 extends kotlin.jvm.internal.s implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac2 f35047b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ xp1<zh2> f35048c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ di2 f35049d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f35050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    yb2(ac2 ac2Var, am0 am0Var, di2 di2Var, Object obj) {
        super(0);
        this.f35047b = ac2Var;
        this.f35048c = am0Var;
        this.f35049d = di2Var;
        this.f35050e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C2105n4 c2105n4;
        C2105n4 c2105n42;
        tb2 tb2Var;
        Context context;
        C2286v2 c2286v2;
        c2105n4 = this.f35047b.f23227b;
        fi2 fi2Var = new fi2(c2105n4, this.f35048c);
        c2105n42 = this.f35047b.f23227b;
        EnumC2082m4 enumC2082m4 = EnumC2082m4.f28866w;
        C2001ij.a(c2105n42, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
        tb2Var = this.f35047b.f23228c;
        context = this.f35047b.f23233h;
        c2286v2 = this.f35047b.f23226a;
        tb2Var.a(context, c2286v2, this.f35049d, this.f35050e, fi2Var);
        return Unit.f41027a;
    }
}
