package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.monetization.ads.mediation.base.model.MediatedAdObjectInfo;
import com.yandex.mobile.ads.impl.AbstractC2372yj;
import com.yandex.mobile.ads.impl.C1914f3;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.ip1;
import com.yandex.mobile.ads.impl.y22;
import com.yandex.mobile.ads.impl.yg1;
import java.util.Collection;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.jj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2025jj<T> implements yg1.b, ao, AbstractC2372yj.a<C2360y7<T>>, yp1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f27663a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2105n4 f27664b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2286v2 f27665c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC3316J f27666d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2221s6 f27667e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Handler f27668f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final e82 f27669g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final zw1 f27670h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final nr0 f27671i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final jv1 f27672j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final bf0 f27673k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final zj1 f27674l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final y22 f27675m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final nq1 f27676n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final yg1 f27677o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final C1914f3 f27678p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private EnumC2174q4 f27679q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f27680r;

    /* renamed from: s, reason: collision with root package name */
    private long f27681s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    private InterfaceC1794a3 f27682t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    private C2360y7<T> f27683u;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.BaseAdLoadController$fetchRequest$1", f = "BaseAdLoadController.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.mobile.ads.impl.jj$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27684b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC2025jj<T> f27685c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e82 f27686d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC2025jj<T> abstractC2025jj, e82 e82Var, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f27685c = abstractC2025jj;
            this.f27686d = e82Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            a aVar = new a(this.f27685c, this.f27686d, dVar);
            aVar.f27684b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC1241b.f();
            ResultKt.a(obj);
            InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.f27684b;
            if (!this.f27685c.a()) {
                String a4 = this.f27686d.a(this.f27685c.e());
                if (a4 == null || a4.length() == 0) {
                    this.f27685c.b(C1942g7.u());
                } else {
                    C2105n4 h4 = this.f27685c.h();
                    EnumC2082m4 enumC2082m4 = EnumC2082m4.f28861r;
                    C2001ij.a(h4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
                    this.f27685c.e().a(this.f27686d.a());
                    C2286v2 e4 = this.f27685c.e();
                    nq1 nq1Var = ((AbstractC2025jj) this.f27685c).f27676n;
                    Context context = this.f27685c.k();
                    nq1Var.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    e4.a(context.getResources().getConfiguration().orientation);
                    AbstractC1978hj<T> a5 = this.f27685c.a(a4, this.f27686d.a(this.f27685c.k(), this.f27685c.e(), ((AbstractC2025jj) this.f27685c).f27670h));
                    a5.b((Object) C2362y9.a(interfaceC3316J));
                    this.f27685c.f().a(a5);
                }
            }
            return Unit.f41027a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.BaseAdLoadController$onUnverifiedMediatedAdLoaded$1", f = "BaseAdLoadController.kt", l = {248, 249, 253}, m = "invokeSuspend")
    /* renamed from: com.yandex.mobile.ads.impl.jj$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f27687b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC2025jj<T> f27688c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f27689d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ MediatedAdObjectInfo f27690e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f27691f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f27692g;

        @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.BaseAdLoadController$onUnverifiedMediatedAdLoaded$1$1", f = "BaseAdLoadController.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.yandex.mobile.ads.impl.jj$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f27693b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC2267u6 f27694c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super String, Unit> function1, InterfaceC2267u6 interfaceC2267u6, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f27693b = function1;
                this.f27694c = interfaceC2267u6;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
                return new a(this.f27693b, this.f27694c, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return new a(this.f27693b, this.f27694c, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                AbstractC1241b.f();
                ResultKt.a(obj);
                this.f27693b.invoke(CollectionsKt.plus((Collection) ((C2244t6) this.f27694c).a().getBlockReasons(), (Iterable) ((C2244t6) this.f27694c).a().getReportReasons()).toString());
                return Unit.f41027a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.BaseAdLoadController$onUnverifiedMediatedAdLoaded$1$2", f = "BaseAdLoadController.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.yandex.mobile.ads.impl.jj$b$b, reason: collision with other inner class name */
        static final class C0195b extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f27695b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0195b(Function0<Unit> function0, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f27695b = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
                return new C0195b(this.f27695b, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return new C0195b(this.f27695b, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                AbstractC1241b.f();
                ResultKt.a(obj);
                this.f27695b.invoke();
                return Unit.f41027a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(AbstractC2025jj<T> abstractC2025jj, Object obj, MediatedAdObjectInfo mediatedAdObjectInfo, Function1<? super String, Unit> function1, Function0<Unit> function0, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f27688c = abstractC2025jj;
            this.f27689d = obj;
            this.f27690e = mediatedAdObjectInfo;
            this.f27691f = function1;
            this.f27692g = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new b(this.f27688c, this.f27689d, this.f27690e, this.f27691f, this.f27692g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        
            if (o2.AbstractC3333i.g(r1, r2, r7) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
        
            if (o2.AbstractC3333i.g(r8, r1, r7) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
        
            if (r8 == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f27687b;
            if (i4 == 0) {
                ResultKt.a(obj);
                C2221s6 i5 = this.f27688c.i();
                Object obj2 = this.f27689d;
                C2360y7<?> j4 = this.f27688c.j();
                MediatedAdObjectInfo mediatedAdObjectInfo = this.f27690e;
                this.f27687b = 1;
                obj = i5.a(obj2, j4, mediatedAdObjectInfo, this);
            } else {
                if (i4 != 1) {
                    if (i4 != 2 && i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                    return Unit.f41027a;
                }
                ResultKt.a(obj);
            }
            InterfaceC2267u6 interfaceC2267u6 = (InterfaceC2267u6) obj;
            if (!(interfaceC2267u6 instanceof C2244t6)) {
                if (Intrinsics.areEqual(interfaceC2267u6, C2290v6.f33516a)) {
                    o2.H0 c4 = o2.Z.c();
                    C0195b c0195b = new C0195b(this.f27692g, null);
                    this.f27687b = 3;
                }
                return Unit.f41027a;
            }
            o2.H0 c5 = o2.Z.c();
            a aVar = new a(this.f27691f, interfaceC2267u6, null);
            this.f27687b = 2;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.BaseAdLoadController$startAdLoading$1", f = "BaseAdLoadController.kt", l = {138}, m = "invokeSuspend")
    /* renamed from: com.yandex.mobile.ads.impl.jj$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f27696b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC2025jj<T> f27697c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e82 f27698d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC2025jj<T> abstractC2025jj, e82 e82Var, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f27697c = abstractC2025jj;
            this.f27698d = e82Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new c(this.f27697c, this.f27698d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new c(this.f27697c, this.f27698d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f27696b;
            if (i4 == 0) {
                ResultKt.a(obj);
                AbstractC2025jj<T> abstractC2025jj = this.f27697c;
                e82 e82Var = this.f27698d;
                this.f27696b = 1;
                if (AbstractC2025jj.a(abstractC2025jj, e82Var, this) == f4) {
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AbstractC2025jj(Context context, C2105n4 c2105n4, C2286v2 c2286v2, InterfaceC3316J interfaceC3316J) {
        this(context, c2105n4, c2286v2, interfaceC3316J, r9, r10, r11, r12, r9, r0, r11, r12, y22.a.a(), new nq1(), yg1.f35123h.a(context), new C1938g3());
        C2221s6 c2221s6 = new C2221s6(c2286v2, context);
        Handler handler = new Handler(Looper.getMainLooper());
        C2339x9 c2339x9 = new C2339x9();
        zw1 zw1Var = new zw1();
        nr0 nr0Var = new nr0(context, c2286v2);
        jv1 jv1Var = new jv1(context, c2286v2.p(), interfaceC3316J, c2105n4, null, null, 1048560);
        bf0 bf0Var = new bf0(c2286v2);
        zj1 zj1Var = new zj1(c2286v2);
        int i4 = y22.f34782d;
    }

    @NotNull
    protected abstract AbstractC1978hj<T> a(@NotNull String str, @NotNull String str2);

    @NotNull
    public final C2286v2 e() {
        return this.f27665c;
    }

    @NotNull
    protected final C1914f3 f() {
        return this.f27678p;
    }

    public final boolean g() {
        return this.f27679q == EnumC2174q4.f30654b;
    }

    @NotNull
    public final C2105n4 h() {
        return this.f27664b;
    }

    @NotNull
    public final C2221s6 i() {
        return this.f27667e;
    }

    @Nullable
    public final C2360y7<T> j() {
        return this.f27683u;
    }

    @NotNull
    public final Context k() {
        return this.f27663a;
    }

    @NotNull
    protected final Handler l() {
        return this.f27668f;
    }

    @NotNull
    protected final nr0 m() {
        return this.f27671i;
    }

    protected final boolean n() {
        return !this.f27677o.b();
    }

    @NotNull
    protected final jv1 o() {
        return this.f27672j;
    }

    @Nullable
    public final vy1 p() {
        return this.f27665c.q();
    }

    protected void q() {
        r();
    }

    protected synchronized void r() {
        ap0.d(new Object[0]);
        InterfaceC1794a3 interfaceC1794a3 = this.f27682t;
        if (interfaceC1794a3 != null) {
            interfaceC1794a3.onAdLoaded();
        }
    }

    public final void s() {
        String str;
        ip1.c cVar = ip1.c.f27369c;
        xy0 h4 = this.f27665c.h();
        if (h4 == null || (str = h4.e()) == null) {
            str = ip1.a.f27312a;
        }
        C1969ha parametersProvider = new C1969ha(cVar, str);
        C2105n4 c2105n4 = this.f27664b;
        EnumC2082m4 adLoadingPhaseType = EnumC2082m4.f28846c;
        c2105n4.getClass();
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        Intrinsics.checkNotNullParameter(parametersProvider, "parametersProvider");
        c2105n4.a(adLoadingPhaseType, parametersProvider, null);
        this.f27664b.a(EnumC2082m4.f28848e);
        this.f27675m.a(fq0.f25896b, this);
        a(EnumC2174q4.f30657e);
        this.f27681s = SystemClock.elapsedRealtime();
    }

    public void t() {
        C1962h3.a(this.f27665c.b().b());
        s();
        r();
    }

    public final void u() {
        getClass().toString();
        ap0.d(new Object[0]);
        this.f27677o.a(this);
    }

    public final void v() {
        getClass().toString();
        ap0.d(new Object[0]);
        this.f27677o.b(this);
    }

    @Nullable
    protected C1866d3 w() {
        return this.f27671i.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(AbstractC2025jj abstractC2025jj, e82 urlConfigurator, kotlin.coroutines.d dVar) {
        C2049kj c2049kj;
        int i4;
        gv1 gv1Var;
        abstractC2025jj.getClass();
        if (dVar instanceof C2049kj) {
            c2049kj = (C2049kj) dVar;
            int i5 = c2049kj.f28213f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2049kj.f28213f = i5 - Integer.MIN_VALUE;
                Object obj = c2049kj.f28211d;
                Object f4 = AbstractC1241b.f();
                i4 = c2049kj.f28213f;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    jv1 jv1Var = abstractC2025jj.f27672j;
                    ok0 ok0Var = ok0.f30067d;
                    c2049kj.f28209b = abstractC2025jj;
                    c2049kj.f28210c = urlConfigurator;
                    c2049kj.f28213f = 1;
                    obj = jv1Var.a(ok0Var, c2049kj);
                    if (obj == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    urlConfigurator = c2049kj.f28210c;
                    abstractC2025jj = c2049kj.f28209b;
                    ResultKt.a(obj);
                }
                gv1Var = (gv1) obj;
                if (!(gv1Var instanceof gv1.b)) {
                    gv1.b bVar = (gv1.b) gv1Var;
                    abstractC2025jj.f27665c.a(bVar.a());
                    abstractC2025jj.f27665c.a(bVar.b());
                    Intrinsics.checkNotNullParameter(urlConfigurator, "urlConfigurator");
                    int i6 = ew1.f25476l;
                    du1 a4 = ew1.a.a().a(abstractC2025jj.f27663a);
                    C2144ok l4 = a4 != null ? a4.l() : null;
                    if (l4 != null) {
                        C2105n4 c2105n4 = abstractC2025jj.f27664b;
                        EnumC2082m4 enumC2082m4 = EnumC2082m4.f28850g;
                        C2001ij.a(c2105n4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
                        AbstractC3337k.d(abstractC2025jj.f27666d, null, null, new C2073lj(abstractC2025jj, urlConfigurator, l4, null), 3, null);
                    } else {
                        abstractC2025jj.a(urlConfigurator);
                    }
                } else if (gv1Var instanceof gv1.a) {
                    abstractC2025jj.b(((gv1.a) gv1Var).a());
                }
                return Unit.f41027a;
            }
        }
        c2049kj = new C2049kj(abstractC2025jj, dVar);
        Object obj2 = c2049kj.f28211d;
        Object f42 = AbstractC1241b.f();
        i4 = c2049kj.f28213f;
        if (i4 != 0) {
        }
        gv1Var = (gv1) obj2;
        if (!(gv1Var instanceof gv1.b)) {
        }
        return Unit.f41027a;
    }

    public synchronized void b(@Nullable C1918f7 c1918f7) {
        try {
            Objects.toString(this.f27679q);
            ap0.a(new Object[0]);
            if (this.f27679q != EnumC2174q4.f30656d) {
                if (a(c1918f7)) {
                    this.f27664b.a();
                    this.f27664b.b(EnumC2082m4.f28848e);
                    this.f27675m.b(fq0.f25896b, this);
                    c(c1918f7);
                } else {
                    q();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void c() {
        if (!a()) {
            this.f27680r = true;
            v();
            this.f27672j.a();
            this.f27678p.b();
            this.f27668f.removeCallbacksAndMessages(null);
            this.f27675m.a(fq0.f25896b, this);
            this.f27683u = null;
            this.f27667e.d();
            o2.K.f(this.f27666d, null, 1, null);
            ap0.f(getClass().toString());
        }
    }

    public void d() {
        c();
        getClass().toString();
        ap0.d(new Object[0]);
    }

    public void b(@NotNull C1866d3 error) {
        String str;
        Intrinsics.checkNotNullParameter(error, "error");
        po0.c(error.d(), new Object[0]);
        a(EnumC2174q4.f30658f);
        ip1.c cVar = ip1.c.f27370d;
        xy0 h4 = this.f27665c.h();
        if (h4 == null || (str = h4.e()) == null) {
            str = ip1.a.f27312a;
        }
        C1969ha parametersProvider = new C1969ha(cVar, str);
        C2105n4 c2105n4 = this.f27664b;
        EnumC2082m4 adLoadingPhaseType = EnumC2082m4.f28846c;
        c2105n4.getClass();
        Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
        Intrinsics.checkNotNullParameter(parametersProvider, "parametersProvider");
        c2105n4.a(adLoadingPhaseType, parametersProvider, null);
        this.f27664b.a(EnumC2082m4.f28848e);
        this.f27675m.a(fq0.f25896b, this);
        a(error);
    }

    protected final synchronized void c(@Nullable C1918f7 c1918f7) {
        a(c1918f7, this.f27669g);
    }

    protected AbstractC2025jj(@NotNull Context context, @NotNull C2105n4 adLoadingPhasesManager, @NotNull C2286v2 adConfiguration, @NotNull InterfaceC3316J coroutineScope, @NotNull C2221s6 adQualityVerifierController, @NotNull Handler handler, @NotNull e82 adUrlConfigurator, @NotNull zw1 sensitiveModeChecker, @NotNull nr0 loadStateValidator, @NotNull jv1 sdkInitializer, @NotNull bf0 headerBiddingDataLoader, @NotNull zj1 prefetchedMediationDataLoader, @NotNull y22 strongReferenceKeepingManager, @NotNull nq1 resourceUtils, @NotNull yg1 phoneStateTracker, @NotNull C1938g3 adFetcherFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(adQualityVerifierController, "adQualityVerifierController");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(adUrlConfigurator, "adUrlConfigurator");
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        Intrinsics.checkNotNullParameter(loadStateValidator, "loadStateValidator");
        Intrinsics.checkNotNullParameter(sdkInitializer, "sdkInitializer");
        Intrinsics.checkNotNullParameter(headerBiddingDataLoader, "headerBiddingDataLoader");
        Intrinsics.checkNotNullParameter(prefetchedMediationDataLoader, "prefetchedMediationDataLoader");
        Intrinsics.checkNotNullParameter(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        Intrinsics.checkNotNullParameter(resourceUtils, "resourceUtils");
        Intrinsics.checkNotNullParameter(phoneStateTracker, "phoneStateTracker");
        Intrinsics.checkNotNullParameter(adFetcherFactory, "adFetcherFactory");
        this.f27663a = context;
        this.f27664b = adLoadingPhasesManager;
        this.f27665c = adConfiguration;
        this.f27666d = coroutineScope;
        this.f27667e = adQualityVerifierController;
        this.f27668f = handler;
        this.f27669g = adUrlConfigurator;
        this.f27670h = sensitiveModeChecker;
        this.f27671i = loadStateValidator;
        this.f27672j = sdkInitializer;
        this.f27673k = headerBiddingDataLoader;
        this.f27674l = prefetchedMediationDataLoader;
        this.f27675m = strongReferenceKeepingManager;
        this.f27676n = resourceUtils;
        this.f27677o = phoneStateTracker;
        adFetcherFactory.getClass();
        this.f27678p = C1938g3.a(this);
        this.f27679q = EnumC2174q4.f30655c;
    }

    protected final synchronized void a(@NotNull EnumC2174q4 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Objects.toString(state);
        ap0.a(new Object[0]);
        this.f27679q = state;
    }

    @Override // com.yandex.mobile.ads.impl.yp1
    public final void b() {
        this.f27664b.a(EnumC2082m4.f28861r);
        C2105n4 c2105n4 = this.f27664b;
        EnumC2082m4 enumC2082m4 = EnumC2082m4.f28862s;
        C2001ij.a(c2105n4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
    }

    public final synchronized void a(@NotNull e82 urlConfigurator) {
        Intrinsics.checkNotNullParameter(urlConfigurator, "urlConfigurator");
        AbstractC3337k.d(this.f27666d, null, null, new a(this, urlConfigurator, null), 3, null);
    }

    @Override // com.yandex.mobile.ads.impl.ao
    public final synchronized boolean a() {
        return this.f27680r;
    }

    protected synchronized boolean a(@Nullable C1918f7 c1918f7) {
        boolean z4;
        try {
            C2360y7<T> c2360y7 = this.f27683u;
            if (this.f27679q != EnumC2174q4.f30658f) {
                if (c2360y7 != null) {
                    if (this.f27681s > 0) {
                        if (SystemClock.elapsedRealtime() - this.f27681s <= c2360y7.i()) {
                            if (c1918f7 != null) {
                                if (Intrinsics.areEqual(c1918f7, this.f27665c.a())) {
                                }
                            }
                            z4 = xr.b(this.f27663a).a() != this.f27665c.n();
                        }
                    }
                }
            }
        } finally {
        }
        return z4;
    }

    public final void a(@NotNull bg1 urlConfigurator) {
        Intrinsics.checkNotNullParameter(urlConfigurator, "urlConfigurator");
        a(EnumC2174q4.f30656d);
        a((e82) urlConfigurator);
    }

    protected synchronized void a(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC1794a3 interfaceC1794a3 = this.f27682t;
        if (interfaceC1794a3 != null) {
            interfaceC1794a3.a(error);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qq1.a
    public final void a(@NotNull hi2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof C2355y2) {
            b(C1914f3.a.a(this.f27665c, ((C2355y2) error).a()));
        }
    }

    @Override // com.yandex.mobile.ads.impl.yg1.b
    public void a(@NotNull vg1 phoneState) {
        Intrinsics.checkNotNullParameter(phoneState, "phoneState");
        Objects.toString(phoneState);
        ap0.d(new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.qq1.b
    public synchronized void a(@NotNull C2360y7<T> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f27664b.a(EnumC2082m4.f28862s);
        this.f27683u = adResponse;
    }

    public final void a(@NotNull Object ad, @Nullable MediatedAdObjectInfo mediatedAdObjectInfo, @NotNull Function0<Unit> adAccepted, @NotNull Function1<? super String, Unit> adBlocked) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(adAccepted, "adAccepted");
        Intrinsics.checkNotNullParameter(adBlocked, "adBlocked");
        AbstractC3337k.d(this.f27666d, null, null, new b(this, ad, mediatedAdObjectInfo, adBlocked, adAccepted, null), 3, null);
    }

    public final void a(@Nullable C1953gi c1953gi) {
        this.f27682t = c1953gi;
    }

    public void a(@Nullable String str) {
        this.f27665c.a(str);
    }

    public final void a(@Nullable vy1 vy1Var) {
        this.f27665c.a(vy1Var);
    }

    protected final synchronized void a(@Nullable C1918f7 c1918f7, @NotNull e82 urlConfigurator) {
        try {
            Intrinsics.checkNotNullParameter(urlConfigurator, "urlConfigurator");
            a(EnumC2174q4.f30656d);
            this.f27665c.a(c1918f7);
            C1866d3 w4 = w();
            if (w4 == null) {
                AbstractC3337k.d(this.f27666d, null, null, new c(this, urlConfigurator, null), 3, null);
            } else {
                b(w4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
