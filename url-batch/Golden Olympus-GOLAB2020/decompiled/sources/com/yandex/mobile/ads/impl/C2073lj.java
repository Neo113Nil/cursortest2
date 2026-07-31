package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.BaseAdLoadController$loadBiddingData$1", f = "BaseAdLoadController.kt", l = {173, 174}, m = "invokeSuspend")
/* renamed from: com.yandex.mobile.ads.impl.lj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2073lj extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    C2286v2 f28605b;

    /* renamed from: c, reason: collision with root package name */
    int f28606c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f28607d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC2025jj<Object> f28608e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e82 f28609f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C2144ok f28610g;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.BaseAdLoadController$loadBiddingData$1$headerBiddingData$1", f = "BaseAdLoadController.kt", l = {170}, m = "invokeSuspend")
    /* renamed from: com.yandex.mobile.ads.impl.lj$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28611b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC2025jj<Object> f28612c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2144ok f28613d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC2025jj<Object> abstractC2025jj, C2144ok c2144ok, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f28612c = abstractC2025jj;
            this.f28613d = c2144ok;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new a(this.f28612c, this.f28613d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new a(this.f28612c, this.f28613d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            bf0 bf0Var;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f28611b;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
                return obj;
            }
            ResultKt.a(obj);
            bf0Var = ((AbstractC2025jj) this.f28612c).f27673k;
            Context k4 = this.f28612c.k();
            C2144ok c2144ok = this.f28613d;
            this.f28611b = 1;
            Object a4 = bf0Var.a(k4, c2144ok, this);
            return a4 == f4 ? f4 : a4;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.BaseAdLoadController$loadBiddingData$1$prefetchedMediationData$1", f = "BaseAdLoadController.kt", l = {167}, m = "invokeSuspend")
    /* renamed from: com.yandex.mobile.ads.impl.lj$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f28614b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC2025jj<Object> f28615c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2144ok f28616d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC2025jj<Object> abstractC2025jj, C2144ok c2144ok, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f28615c = abstractC2025jj;
            this.f28616d = c2144ok;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new b(this.f28615c, this.f28616d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new b(this.f28615c, this.f28616d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            zj1 zj1Var;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f28614b;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
                return obj;
            }
            ResultKt.a(obj);
            zj1Var = ((AbstractC2025jj) this.f28615c).f27674l;
            Context k4 = this.f28615c.k();
            C2144ok c2144ok = this.f28616d;
            this.f28614b = 1;
            Object a4 = zj1Var.a(k4, c2144ok, this);
            return a4 == f4 ? f4 : a4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2073lj(AbstractC2025jj<Object> abstractC2025jj, e82 e82Var, C2144ok c2144ok, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f28608e = abstractC2025jj;
        this.f28609f = e82Var;
        this.f28610g = c2144ok;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        C2073lj c2073lj = new C2073lj(this.f28608e, this.f28609f, this.f28610g, dVar);
        c2073lj.f28607d = obj;
        return c2073lj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2073lj) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o2.Q b4;
        o2.Q b5;
        o2.Q q4;
        C2286v2 c2286v2;
        C2286v2 c2286v22;
        Object f4 = AbstractC1241b.f();
        int i4 = this.f28606c;
        if (i4 == 0) {
            ResultKt.a(obj);
            InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.f28607d;
            b4 = AbstractC3337k.b(interfaceC3316J, null, null, new b(this.f28608e, this.f28610g, null), 3, null);
            b5 = AbstractC3337k.b(interfaceC3316J, null, null, new a(this.f28608e, this.f28610g, null), 3, null);
            C2286v2 e4 = this.f28608e.e();
            this.f28607d = b4;
            this.f28605b = e4;
            this.f28606c = 1;
            Object await = b5.await(this);
            if (await != f4) {
                q4 = b4;
                obj = await;
                c2286v2 = e4;
            }
            return f4;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2286v22 = (C2286v2) this.f28607d;
            ResultKt.a(obj);
            c2286v22.d((String) obj);
            this.f28608e.h().a(EnumC2082m4.f28850g);
            this.f28608e.a(this.f28609f);
            return Unit.f41027a;
        }
        c2286v2 = this.f28605b;
        q4 = (o2.Q) this.f28607d;
        ResultKt.a(obj);
        c2286v2.c((String) obj);
        C2286v2 e5 = this.f28608e.e();
        this.f28607d = e5;
        this.f28605b = null;
        this.f28606c = 2;
        Object await2 = q4.await(this);
        if (await2 != f4) {
            c2286v22 = e5;
            obj = await2;
            c2286v22.d((String) obj);
            this.f28608e.h().a(EnumC2082m4.f28850g);
            this.f28608e.a(this.f28609f);
            return Unit.f41027a;
        }
        return f4;
    }
}
