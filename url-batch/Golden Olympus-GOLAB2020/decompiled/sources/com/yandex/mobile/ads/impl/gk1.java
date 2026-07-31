package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader$loadNetworkMediationDataAsync$1", f = "PrefetchedMediationNetworksDataLoader.kt", l = {127}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class gk1 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    xy0 f26187b;

    /* renamed from: c, reason: collision with root package name */
    MediatedAdapterPrefetcher f26188c;

    /* renamed from: d, reason: collision with root package name */
    int f26189d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ lk1 f26190e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ sz0 f26191f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Context f26192g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f26193h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ gs f26194i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ long f26195j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ vy1 f26196k;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader$loadNetworkMediationDataAsync$1$mediationInfoResult$1", f = "PrefetchedMediationNetworksDataLoader.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f26197b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ lk1 f26198c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f26199d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ vy1 f26200e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ xy0 f26201f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ MediatedAdapterPrefetcher f26202g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(lk1 lk1Var, Context context, vy1 vy1Var, xy0 xy0Var, MediatedAdapterPrefetcher mediatedAdapterPrefetcher, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f26198c = lk1Var;
            this.f26199d = context;
            this.f26200e = vy1Var;
            this.f26201f = xy0Var;
            this.f26202g = mediatedAdapterPrefetcher;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new a(this.f26198c, this.f26199d, this.f26200e, this.f26201f, this.f26202g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            dk1 dk1Var;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f26197b;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
                return obj;
            }
            ResultKt.a(obj);
            dk1Var = this.f26198c.f28636d;
            Context context = this.f26199d;
            vy1 vy1Var = this.f26200e;
            xy0 xy0Var = this.f26201f;
            MediatedAdapterPrefetcher mediatedAdapterPrefetcher = this.f26202g;
            this.f26197b = 1;
            Object a4 = dk1Var.a(context, vy1Var, xy0Var, mediatedAdapterPrefetcher, this);
            return a4 == f4 ? f4 : a4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gk1(lk1 lk1Var, sz0 sz0Var, Context context, String str, gs gsVar, long j4, vy1 vy1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f26190e = lk1Var;
        this.f26191f = sz0Var;
        this.f26192g = context;
        this.f26193h = str;
        this.f26194i = gsVar;
        this.f26195j = j4;
        this.f26196k = vy1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        return new gk1(this.f26190e, this.f26191f, this.f26192g, this.f26193h, this.f26194i, this.f26195j, this.f26196k, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gk1) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Throwable th;
        MediatedAdapterPrefetcher mediatedAdapterPrefetcher;
        ek1 ek1Var;
        xy0 xy0Var;
        kx0 kx0Var;
        qo qoVar;
        Exception exc;
        MediatedAdapterPrefetcher mediatedAdapterPrefetcher2;
        a aVar;
        xy0 xy0Var2;
        ro roVar;
        qo qoVar2;
        qo qoVar3;
        ro roVar2;
        qo qoVar4;
        qo qoVar5;
        ro roVar3;
        Object f4 = AbstractC1241b.f();
        ?? r12 = this.f26189d;
        try {
            if (r12 == 0) {
                ResultKt.a(obj);
                ek1Var = this.f26190e.f28637e;
                sz0 mediationPrefetchNetwork = this.f26191f;
                ek1Var.getClass();
                Intrinsics.checkNotNullParameter(mediationPrefetchNetwork, "mediationPrefetchNetwork");
                xy0Var = new xy0(mediationPrefetchNetwork.d(), mediationPrefetchNetwork.e(), null, null, null, null, null);
                try {
                    lk1.a(this.f26190e, xy0Var);
                    kx0Var = this.f26190e.f28635c;
                    Object a4 = kx0Var.a(this.f26192g, xy0Var, (Class<Object>) com.monetization.ads.mediation.base.a.class);
                    mediatedAdapterPrefetcher = a4 instanceof MediatedAdapterPrefetcher ? (MediatedAdapterPrefetcher) a4 : null;
                    if (mediatedAdapterPrefetcher == null) {
                        ak1 a5 = uy0.a(xy0Var.e());
                        roVar = this.f26190e.f28633a;
                        roVar.a(this.f26192g, this.f26193h, this.f26194i, a5, null);
                        return a5;
                    }
                    qoVar = this.f26190e.f28634b;
                    qoVar.b();
                    try {
                        try {
                            long j4 = this.f26195j;
                            try {
                                aVar = new a(this.f26190e, this.f26192g, this.f26196k, xy0Var, mediatedAdapterPrefetcher, null);
                                xy0Var = xy0Var;
                            } catch (Exception e4) {
                                e = e4;
                                xy0Var = xy0Var;
                            }
                            try {
                                this.f26187b = xy0Var;
                                this.f26188c = mediatedAdapterPrefetcher;
                                this.f26189d = 1;
                                obj = o2.W0.c(j4, aVar, this);
                                if (obj == f4) {
                                    return f4;
                                }
                                xy0Var2 = xy0Var;
                                mediatedAdapterPrefetcher2 = mediatedAdapterPrefetcher;
                            } catch (Exception e5) {
                                e = e5;
                                exc = e;
                                mediatedAdapterPrefetcher2 = mediatedAdapterPrefetcher;
                                qoVar2 = this.f26190e.f28634b;
                                qoVar2.c();
                                qoVar3 = this.f26190e.f28634b;
                                Long a6 = qoVar3.a();
                                ak1 a7 = uy0.a(xy0Var.e(), exc);
                                roVar2 = this.f26190e.f28633a;
                                roVar2.a(this.f26192g, this.f26193h, this.f26194i, a7, a6);
                                mediatedAdapterPrefetcher2.onInvalidate();
                                return a7;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            mediatedAdapterPrefetcher.onInvalidate();
                            throw th;
                        }
                    } catch (Exception e6) {
                        e = e6;
                    }
                } catch (IllegalArgumentException e7) {
                    return uy0.a(xy0Var.e(), e7);
                }
            } else {
                if (r12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mediatedAdapterPrefetcher2 = this.f26188c;
                xy0Var2 = this.f26187b;
                try {
                    ResultKt.a(obj);
                } catch (Exception e8) {
                    exc = e8;
                    xy0Var = xy0Var2;
                    qoVar2 = this.f26190e.f28634b;
                    qoVar2.c();
                    qoVar3 = this.f26190e.f28634b;
                    Long a62 = qoVar3.a();
                    ak1 a72 = uy0.a(xy0Var.e(), exc);
                    roVar2 = this.f26190e.f28633a;
                    roVar2.a(this.f26192g, this.f26193h, this.f26194i, a72, a62);
                    mediatedAdapterPrefetcher2.onInvalidate();
                    return a72;
                }
            }
            ak1 ak1Var = (ak1) obj;
            qoVar4 = this.f26190e.f28634b;
            qoVar4.c();
            qoVar5 = this.f26190e.f28634b;
            Long a8 = qoVar5.a();
            if (ak1Var != null) {
                lk1 lk1Var = this.f26190e;
                Context context = this.f26192g;
                String str = this.f26193h;
                gs gsVar = this.f26194i;
                roVar3 = lk1Var.f28633a;
                roVar3.a(context, str, gsVar, ak1Var, a8);
            }
            mediatedAdapterPrefetcher2.onInvalidate();
            return ak1Var;
        } catch (Throwable th3) {
            th = th3;
            mediatedAdapterPrefetcher = r12;
        }
    }
}
