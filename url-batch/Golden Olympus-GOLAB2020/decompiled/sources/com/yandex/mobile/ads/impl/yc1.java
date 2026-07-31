package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.mediation.bidding.NetworksHeaderBiddingDataLoader$loadNetworksBiddingData$2", f = "NetworksHeaderBiddingDataLoader.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class yc1 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    int f35060b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ zc1 f35061c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f35062d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ vy1 f35063e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ List<xy0> f35064f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    yc1(zc1 zc1Var, Context context, vy1 vy1Var, List<xy0> list, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f35061c = zc1Var;
        this.f35062d = context;
        this.f35063e = vy1Var;
        this.f35064f = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        return new yc1(this.f35061c, this.f35062d, this.f35063e, this.f35064f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((yc1) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object a4;
        Object f4 = AbstractC1241b.f();
        int i4 = this.f35060b;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.a(obj);
            return obj;
        }
        ResultKt.a(obj);
        zc1 zc1Var = this.f35061c;
        Context context = this.f35062d;
        vy1 vy1Var = this.f35063e;
        List<xy0> list = this.f35064f;
        this.f35060b = 1;
        a4 = zc1Var.a(context, vy1Var, (List<xy0>) list, this);
        return a4 == f4 ? f4 : a4;
    }
}
