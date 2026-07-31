package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader$loadNetworksMediationData$2", f = "PrefetchedMediationNetworksDataLoader.kt", l = {IronSourceConstants.SET_META_DATA_AFTER_INIT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class hk1 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    int f26779b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ lk1 f26780c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f26781d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f26782e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ gs f26783f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ vy1 f26784g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ List<sz0> f26785h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f26786i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hk1(long j4, Context context, gs gsVar, vy1 vy1Var, lk1 lk1Var, String str, List list, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f26780c = lk1Var;
        this.f26781d = context;
        this.f26782e = str;
        this.f26783f = gsVar;
        this.f26784g = vy1Var;
        this.f26785h = list;
        this.f26786i = j4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        lk1 lk1Var = this.f26780c;
        Context context = this.f26781d;
        String str = this.f26782e;
        return new hk1(this.f26786i, context, this.f26783f, this.f26784g, lk1Var, str, this.f26785h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hk1) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object f4 = AbstractC1241b.f();
        int i4 = this.f26779b;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.a(obj);
            return obj;
        }
        ResultKt.a(obj);
        lk1 lk1Var = this.f26780c;
        Context context = this.f26781d;
        String str = this.f26782e;
        gs gsVar = this.f26783f;
        vy1 vy1Var = this.f26784g;
        List<sz0> list = this.f26785h;
        long j4 = this.f26786i;
        this.f26779b = 1;
        Object a4 = lk1.a(j4, context, gsVar, vy1Var, lk1Var, str, list, this);
        return a4 == f4 ? f4 : a4;
    }
}
