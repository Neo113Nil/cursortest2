package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
final class wb2 extends kotlin.jvm.internal.s implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac2 f33988b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w92 f33989c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ x92 f33990d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ xp1<o92> f33991e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f33992f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    wb2(ac2 ac2Var, w92 w92Var, nn0 nn0Var, z92 z92Var, Object obj) {
        super(0);
        this.f33988b = ac2Var;
        this.f33989c = w92Var;
        this.f33990d = nn0Var;
        this.f33991e = z92Var;
        this.f33992f = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        q92 q92Var;
        Context context;
        C2105n4 c2105n4;
        tb2 tb2Var;
        Context context2;
        C2286v2 c2286v2;
        q92Var = this.f33988b.f23229d;
        context = this.f33988b.f23233h;
        p92 a4 = q92Var.a(context, this.f33989c, this.f33990d, this.f33991e);
        c2105n4 = this.f33988b.f23227b;
        c2105n4.a(EnumC2082m4.f28863t, this.f33989c);
        tb2Var = this.f33988b.f23228c;
        context2 = this.f33988b.f23233h;
        c2286v2 = this.f33988b.f23226a;
        tb2Var.a(context2, c2286v2, this.f33989c, this.f33990d, this.f33992f, a4);
        return Unit.f41027a;
    }
}
