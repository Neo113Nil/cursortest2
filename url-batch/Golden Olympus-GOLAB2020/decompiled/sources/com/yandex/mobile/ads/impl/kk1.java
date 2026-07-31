package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import o2.AbstractC3327f;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader$loadNetworksMediationDataInternal$prefetchedMediationAdapterInfos$1", f = "PrefetchedMediationNetworksDataLoader.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class kk1 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    int f28219b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<o2.Q> f28220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    kk1(List<? extends o2.Q> list, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f28220c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        return new kk1(this.f28220c, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new kk1(this.f28220c, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object f4 = AbstractC1241b.f();
        int i4 = this.f28219b;
        if (i4 == 0) {
            ResultKt.a(obj);
            List<o2.Q> list = this.f28220c;
            this.f28219b = 1;
            obj = AbstractC3327f.a(list, this);
            if (obj == f4) {
                return f4;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.a(obj);
        }
        return CollectionsKt.filterNotNull((Iterable) obj);
    }
}
