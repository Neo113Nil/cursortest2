package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader$loadNetworksMediationDataInternal$asyncAdaptersResults$1", f = "PrefetchedMediationNetworksDataLoader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class jk1 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f27708b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<sz0> f27709c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ lk1 f27710d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f27711e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f27712f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ gs f27713g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ vy1 f27714h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f27715i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    jk1(long j4, Context context, gs gsVar, vy1 vy1Var, lk1 lk1Var, String str, List list, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f27709c = list;
        this.f27710d = lk1Var;
        this.f27711e = context;
        this.f27712f = str;
        this.f27713g = gsVar;
        this.f27714h = vy1Var;
        this.f27715i = j4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        List<sz0> list = this.f27709c;
        lk1 lk1Var = this.f27710d;
        Context context = this.f27711e;
        String str = this.f27712f;
        jk1 jk1Var = new jk1(this.f27715i, context, this.f27713g, this.f27714h, lk1Var, str, list, dVar);
        jk1Var.f27708b = obj;
        return jk1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jk1) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o2.Q b4;
        AbstractC1241b.f();
        ResultKt.a(obj);
        InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.f27708b;
        List<sz0> list = this.f27709c;
        lk1 lk1Var = this.f27710d;
        Context context = this.f27711e;
        String str = this.f27712f;
        gs gsVar = this.f27713g;
        vy1 vy1Var = this.f27714h;
        long j4 = this.f27715i;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (sz0 sz0Var : list) {
            lk1Var.getClass();
            gk1 gk1Var = new gk1(lk1Var, sz0Var, context, str, gsVar, j4, vy1Var, null);
            vy1 vy1Var2 = vy1Var;
            b4 = AbstractC3337k.b(interfaceC3316J, null, null, gk1Var, 3, null);
            arrayList.add(b4);
            lk1Var = lk1Var;
            context = context;
            str = str;
            gsVar = gsVar;
            vy1Var = vy1Var2;
            j4 = j4;
        }
        return arrayList;
    }
}
