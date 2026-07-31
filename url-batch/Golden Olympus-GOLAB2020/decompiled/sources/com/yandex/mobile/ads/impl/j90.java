package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import com.yandex.mobile.ads.impl.c90;
import com.yandex.mobile.ads.impl.tk1;
import com.yandex.mobile.ads.impl.u90;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.AbstractC3398h;
import r2.InterfaceC3396f;
import r2.InterfaceC3397g;
import x2.AbstractC3517c;
import x2.InterfaceC3515a;

/* loaded from: classes3.dex */
public final class j90 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3396f f27568a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final t90 f27569b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC3316J f27570c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC3515a f27571d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final r2.u f27572e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final r2.G f27573f;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.feed.domain.FeedItemListUseCase$invoke$1", f = "FeedItemListUseCase.kt", l = {43}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f27574b;

        /* renamed from: com.yandex.mobile.ads.impl.j90$a$a, reason: collision with other inner class name */
        static final class C0194a<T> implements InterfaceC3397g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j90 f27576a;

            C0194a(j90 j90Var) {
                this.f27576a = j90Var;
            }

            @Override // r2.InterfaceC3397g
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                if (!(((c90) obj) instanceof c90.a)) {
                    return Unit.f41027a;
                }
                Object a4 = j90.a(this.f27576a, dVar);
                return a4 == AbstractC1241b.f() ? a4 : Unit.f41027a;
            }
        }

        a(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return j90.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return j90.this.new a((kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f27574b;
            if (i4 == 0) {
                ResultKt.a(obj);
                InterfaceC3396f interfaceC3396f = j90.this.f27568a;
                C0194a c0194a = new C0194a(j90.this);
                this.f27574b = 1;
                if (interfaceC3396f.a(c0194a, this) == f4) {
                    return f4;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
            }
            return Unit.f41027a;
        }
    }

    public /* synthetic */ j90(r2.t tVar, t90 t90Var, um2 um2Var) {
        this(tVar, t90Var, um2Var, fu.a((mp1) um2Var.c()));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j90 j90Var, kotlin.coroutines.d dVar) {
        k90 k90Var;
        int i4;
        Object value;
        tk1 tk1Var;
        Object value2;
        Object value3;
        j90Var.getClass();
        if (dVar instanceof k90) {
            k90Var = (k90) dVar;
            int i5 = k90Var.f28116e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                k90Var.f28116e = i5 - Integer.MIN_VALUE;
                Object obj = k90Var.f28114c;
                Object f4 = AbstractC1241b.f();
                i4 = k90Var.f28116e;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    if (InterfaceC3515a.C0286a.a(j90Var.f27571d, null, 1, null)) {
                        r2.u uVar = j90Var.f27572e;
                        do {
                            value = uVar.getValue();
                        } while (!uVar.b(value, u90.d.f32893a));
                        t90 t90Var = j90Var.f27569b;
                        k90Var.f28113b = j90Var;
                        k90Var.f28116e = 1;
                        obj = t90Var.b(k90Var);
                        if (obj == f4) {
                            return f4;
                        }
                    }
                    return Unit.f41027a;
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j90Var = k90Var.f28113b;
                ResultKt.a(obj);
                j90 j90Var2 = j90Var;
                tk1Var = (tk1) obj;
                if (tk1Var instanceof tk1.a) {
                    r2.u uVar2 = j90Var2.f27572e;
                    do {
                        value2 = uVar2.getValue();
                    } while (!uVar2.b(value2, u90.c.f32892a));
                } else {
                    r2.u uVar3 = j90Var2.f27572e;
                    do {
                        value3 = uVar3.getValue();
                    } while (!uVar3.b(value3, new u90.a(((tk1.a) tk1Var).a())));
                }
                InterfaceC3515a.C0286a.b(j90Var2.f27571d, null, 1, null);
                return Unit.f41027a;
            }
        }
        k90Var = new k90(j90Var, dVar);
        Object obj2 = k90Var.f28114c;
        Object f42 = AbstractC1241b.f();
        i4 = k90Var.f28116e;
        if (i4 != 0) {
        }
        j90 j90Var22 = j90Var;
        tk1Var = (tk1) obj2;
        if (tk1Var instanceof tk1.a) {
        }
        InterfaceC3515a.C0286a.b(j90Var22.f27571d, null, 1, null);
        return Unit.f41027a;
    }

    public j90(@NotNull r2.t feedInputEventFlow, @NotNull t90 repo, @NotNull um2 sdkEnvironmentModule, @NotNull InterfaceC3316J coroutineScope) {
        Intrinsics.checkNotNullParameter(feedInputEventFlow, "feedInputEventFlow");
        Intrinsics.checkNotNullParameter(repo, "repo");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f27568a = feedInputEventFlow;
        this.f27569b = repo;
        this.f27570c = coroutineScope;
        this.f27571d = AbstractC3517c.b(false, 1, null);
        u90.b bVar = u90.b.f32891a;
        r2.u a4 = r2.I.a(bVar);
        this.f27572e = a4;
        this.f27573f = AbstractC3398h.t(AbstractC3398h.p(a4, repo.a(), new i90(null)), coroutineScope, r2.D.f43507a.a(), new ba0(bVar, CollectionsKt.emptyList()));
    }

    @NotNull
    public final r2.G a() {
        AbstractC3337k.d(this.f27570c, null, null, new a(null), 3, null);
        return this.f27573f;
    }
}
