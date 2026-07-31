package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.yandex.mobile.ads.impl.C1914f3;
import com.yandex.mobile.ads.impl.e50;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.su1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import o2.InterfaceC3359v0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jv1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f27829a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vu1 f27830b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC3316J f27831c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2105n4 f27832d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final e50 f27833e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C1803ac f27834f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ew1 f27835g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Context f27836h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final fi0 f27837i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C1971hc f27838j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final iu1 f27839k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C2139of f27840l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C2378z2 f27841m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final nw1 f27842n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final lv1 f27843o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final C2067ld f27844p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final g30 f27845q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final C2342xc f27846r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final com.monetization.ads.mediation.base.initialize.a f27847s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final ei0 f27848t;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.core.initializer.SdkInitializer", f = "SdkInitializer.kt", l = {94, 96, 97}, m = "initialize")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        jv1 f27849b;

        /* renamed from: c, reason: collision with root package name */
        ok0 f27850c;

        /* renamed from: d, reason: collision with root package name */
        C2105n4 f27851d;

        /* renamed from: e, reason: collision with root package name */
        EnumC2082m4 f27852e;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC3359v0 f27853f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f27854g;

        /* renamed from: i, reason: collision with root package name */
        int f27856i;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f27854g = obj;
            this.f27856i |= Integer.MIN_VALUE;
            return jv1.this.a((ok0) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.core.initializer.SdkInitializer$initialize$sdkConfigurationResult$1$prefetchDnsJob$1", f = "SdkInitializer.kt", l = {89}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f27857b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27858c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ jv1 f27859d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z4, jv1 jv1Var, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f27858c = z4;
            this.f27859d = jv1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new b(this.f27858c, this.f27859d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new b(this.f27858c, this.f27859d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f27857b;
            if (i4 == 0) {
                ResultKt.a(obj);
                if (this.f27858c) {
                    g30 g30Var = this.f27859d.f27845q;
                    this.f27857b = 1;
                    if (g30Var.a(this) == f4) {
                        return f4;
                    }
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

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.core.initializer.SdkInitializer", f = "SdkInitializer.kt", l = {185}, m = "loadSdkConfiguration")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        C2105n4 f27860b;

        /* renamed from: c, reason: collision with root package name */
        EnumC2082m4 f27861c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f27862d;

        /* renamed from: f, reason: collision with root package name */
        int f27864f;

        c(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f27862d = obj;
            this.f27864f |= Integer.MIN_VALUE;
            return jv1.a(jv1.this, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.core.initializer.SdkInitializer", f = "SdkInitializer.kt", l = {168}, m = "requestAdvertisingInfo")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        jv1 f27865b;

        /* renamed from: c, reason: collision with root package name */
        C2105n4 f27866c;

        /* renamed from: d, reason: collision with root package name */
        EnumC2082m4 f27867d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f27868e;

        /* renamed from: g, reason: collision with root package name */
        int f27870g;

        d(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f27868e = obj;
            this.f27870g |= Integer.MIN_VALUE;
            return jv1.this.a(this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ jv1(Context context, vu1 vu1Var, InterfaceC3316J interfaceC3316J, C2105n4 c2105n4, e50 e50Var, C1803ac c1803ac, int i4) {
        this(context, vu1Var, interfaceC3316J, c2105n4, r3, r4, r7, r8, new fi0(r3), new C1971hc(), new iu1(r8, vu1Var, r3, r4, c2105n4), new C2139of(r8, vu1Var), new C2378z2(), new nw1(r8), new us0(), new lv1(vu1Var.c(), us0.g(context), c2105n4), new C2067ld(), new g30(context, c2105n4), new C2342xc(), new com.monetization.ads.mediation.base.initialize.a(vu1Var));
        e50 e50Var2;
        if ((i4 & 16) != 0) {
            int i5 = e50.f25096e;
            e50Var2 = e50.a.a(context);
        } else {
            e50Var2 = e50Var;
        }
        C1803ac c1803ac2 = (i4 & 32) != 0 ? new C1803ac() : c1803ac;
        int i6 = ew1.f25476l;
        ew1 a4 = ew1.a.a();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    public static final /* synthetic */ Object a(jv1 jv1Var, kotlin.coroutines.d dVar) {
        return jv1Var.b((ok0) null, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(ok0 ok0Var, kotlin.coroutines.d dVar) {
        c cVar;
        int i4;
        C2105n4 c2105n4;
        EnumC2082m4 enumC2082m4;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i5 = cVar.f27864f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cVar.f27864f = i5 - Integer.MIN_VALUE;
                Object obj = cVar.f27862d;
                Object f4 = AbstractC1241b.f();
                i4 = cVar.f27864f;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    C2105n4 c2105n42 = this.f27832d;
                    EnumC2082m4 enumC2082m42 = EnumC2082m4.f28854k;
                    C2001ij.a(c2105n42, enumC2082m42, "adLoadingPhaseType", enumC2082m42, null);
                    iu1 iu1Var = this.f27839k;
                    cVar.f27860b = c2105n42;
                    cVar.f27861c = enumC2082m42;
                    cVar.f27864f = 1;
                    Object a4 = iu1Var.a(ok0Var, cVar);
                    if (a4 == f4) {
                        return f4;
                    }
                    c2105n4 = c2105n42;
                    obj = a4;
                    enumC2082m4 = enumC2082m42;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    enumC2082m4 = cVar.f27861c;
                    c2105n4 = cVar.f27860b;
                    ResultKt.a(obj);
                }
                su1 su1Var = (su1) obj;
                c2105n4.a(enumC2082m4);
                return su1Var;
            }
        }
        cVar = new c(dVar);
        Object obj2 = cVar.f27862d;
        Object f42 = AbstractC1241b.f();
        i4 = cVar.f27864f;
        if (i4 != 0) {
        }
        su1 su1Var2 = (su1) obj2;
        c2105n4.a(enumC2082m4);
        return su1Var2;
    }

    public final void a() {
        o2.B0.f(this.f27831c.n(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ok0 ok0Var, @NotNull kotlin.coroutines.d dVar) {
        a aVar;
        Object f4;
        int i4;
        C2105n4 c2105n4;
        InterfaceC3359v0 d4;
        ok0 ok0Var2;
        jv1 jv1Var;
        EnumC2082m4 enumC2082m4;
        InterfaceC3359v0 interfaceC3359v0;
        EnumC2082m4 enumC2082m42;
        C2105n4 c2105n42;
        ok0 ok0Var3;
        jv1 jv1Var2;
        EnumC2082m4 enumC2082m43;
        C2105n4 c2105n43;
        ok0 ok0Var4;
        jv1 jv1Var3;
        su1 su1Var;
        C1866d3 m4;
        Object aVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.f27856i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.f27856i = i5 - Integer.MIN_VALUE;
                Object obj = aVar.f27854g;
                f4 = AbstractC1241b.f();
                i4 = aVar.f27856i;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    if (!this.f27844p.a()) {
                        C2355y2 error = new C2355y2(EnumC1890e3.f25075i, null);
                        this.f27841m.getClass();
                        Intrinsics.checkNotNullParameter(error, "error");
                        return new gv1.a(C1914f3.a.a(null, error.a()));
                    }
                    du1 a4 = this.f27835g.a(this.f27836h);
                    boolean N3 = a4 != null ? a4.N() : false;
                    c2105n4 = this.f27832d;
                    EnumC2082m4 enumC2082m44 = EnumC2082m4.f28852i;
                    C2001ij.a(c2105n4, enumC2082m44, "adLoadingPhaseType", enumC2082m44, null);
                    this.f27846r.a(this.f27836h);
                    int i6 = v72.f33543c;
                    v72.a(this.f27836h, this.f27830b.c());
                    C2274ud.a(this.f27836h, this.f27830b.c());
                    d4 = AbstractC3337k.d(this.f27831c, null, null, new b(N3, this, null), 3, null);
                    C2105n4 c2105n44 = this.f27832d;
                    EnumC2082m4 enumC2082m45 = EnumC2082m4.f28851h;
                    C2001ij.a(c2105n44, enumC2082m45, "adLoadingPhaseType", enumC2082m45, null);
                    this.f27848t.a(this.f27836h, this.f27837i.a());
                    Unit unit = Unit.f41027a;
                    c2105n44.a(enumC2082m45);
                    aVar.f27849b = this;
                    ok0Var2 = ok0Var;
                    aVar.f27850c = ok0Var2;
                    aVar.f27851d = c2105n4;
                    aVar.f27852e = enumC2082m44;
                    aVar.f27853f = d4;
                    aVar.f27856i = 1;
                    if (a(aVar) != f4) {
                        jv1Var = this;
                        enumC2082m4 = enumC2082m44;
                        interfaceC3359v0 = d4;
                    }
                    return f4;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        enumC2082m42 = aVar.f27852e;
                        c2105n42 = aVar.f27851d;
                        ok0Var3 = aVar.f27850c;
                        jv1Var2 = aVar.f27849b;
                        ResultKt.a(obj);
                        aVar.f27849b = jv1Var2;
                        aVar.f27850c = ok0Var3;
                        aVar.f27851d = c2105n42;
                        aVar.f27852e = enumC2082m42;
                        aVar.f27856i = 3;
                        obj = jv1Var2.b(ok0Var3, aVar);
                        if (obj != f4) {
                            enumC2082m43 = enumC2082m42;
                            c2105n43 = c2105n42;
                            ok0Var4 = ok0Var3;
                            jv1Var3 = jv1Var2;
                            su1Var = (su1) obj;
                            c2105n43.a(enumC2082m43);
                            if (!(su1Var instanceof su1.b)) {
                            }
                            jv1Var3.f27840l.a();
                            return aVar2;
                        }
                        return f4;
                    }
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    enumC2082m43 = aVar.f27852e;
                    c2105n43 = aVar.f27851d;
                    ok0Var4 = aVar.f27850c;
                    jv1Var3 = aVar.f27849b;
                    ResultKt.a(obj);
                    su1Var = (su1) obj;
                    c2105n43.a(enumC2082m43);
                    if (!(su1Var instanceof su1.b)) {
                        su1.b bVar = (su1.b) su1Var;
                        jv1Var3.f27843o.a(bVar.b(), ok0Var4, bVar.a());
                        jv1Var3.f27842n.a();
                        g11.a();
                        Context context = jv1Var3.f27829a;
                        du1 sdkConfiguration = bVar.b();
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
                        jv1Var3.f27847s.a(context, sdkConfiguration, jv1Var3.f27831c);
                        aVar2 = new gv1.b(jv1Var3.f27834f, jv1Var3.f27833e.c());
                    } else if (su1Var instanceof su1.a) {
                        C2378z2 c2378z2 = jv1Var3.f27841m;
                        su1.a aVar3 = (su1.a) su1Var;
                        hi2 error2 = aVar3.b();
                        c2378z2.getClass();
                        Intrinsics.checkNotNullParameter(error2, "error");
                        if (error2 instanceof C2355y2) {
                            m4 = C1914f3.a.a(null, ((C2355y2) error2).a());
                        } else {
                            m4 = C1942g7.m();
                        }
                        jv1Var3.f27843o.a(m4, ok0Var4, aVar3.a());
                        aVar2 = new gv1.a(m4);
                    } else {
                        throw new W1.m();
                    }
                    jv1Var3.f27840l.a();
                    return aVar2;
                }
                interfaceC3359v0 = aVar.f27853f;
                enumC2082m4 = aVar.f27852e;
                c2105n4 = aVar.f27851d;
                ok0Var2 = aVar.f27850c;
                jv1Var = aVar.f27849b;
                ResultKt.a(obj);
                aVar.f27849b = jv1Var;
                aVar.f27850c = ok0Var2;
                aVar.f27851d = c2105n4;
                aVar.f27852e = enumC2082m4;
                aVar.f27853f = null;
                aVar.f27856i = 2;
                if (interfaceC3359v0.join(aVar) != f4) {
                    enumC2082m42 = enumC2082m4;
                    c2105n42 = c2105n4;
                    ok0Var3 = ok0Var2;
                    jv1Var2 = jv1Var;
                    aVar.f27849b = jv1Var2;
                    aVar.f27850c = ok0Var3;
                    aVar.f27851d = c2105n42;
                    aVar.f27852e = enumC2082m42;
                    aVar.f27856i = 3;
                    obj = jv1Var2.b(ok0Var3, aVar);
                    if (obj != f4) {
                    }
                }
                return f4;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f27854g;
        f4 = AbstractC1241b.f();
        i4 = aVar.f27856i;
        if (i4 != 0) {
        }
        aVar.f27849b = jv1Var;
        aVar.f27850c = ok0Var2;
        aVar.f27851d = c2105n4;
        aVar.f27852e = enumC2082m4;
        aVar.f27853f = null;
        aVar.f27856i = 2;
        if (interfaceC3359v0.join(aVar) != f4) {
        }
        return f4;
    }

    public jv1(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull InterfaceC3316J coroutineScope, @NotNull C2105n4 adLoadingPhasesManager, @NotNull e50 environmentController, @NotNull C1803ac advertisingConfiguration, @NotNull ew1 sdkSettings, @NotNull Context applicationContext, @NotNull fi0 identifiersLoader, @NotNull C1971hc advertisingInfoLoader, @NotNull iu1 sdkConfigurationLoaderHolder, @NotNull C2139of appStartFalseClickTracker, @NotNull C2378z2 adFetchErrorProvider, @NotNull nw1 sdkVersionValidator, @NotNull us0 manifestAnalyzer, @NotNull lv1 sdkInitializerReporter, @NotNull C2067ld androidSdkApiChecker, @NotNull g30 dnsPrefetcher, @NotNull C2342xc analyticsEasyIntegrationInitializer, @NotNull com.monetization.ads.mediation.base.initialize.a mediatedNetworksSdksInitializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(environmentController, "environmentController");
        Intrinsics.checkNotNullParameter(advertisingConfiguration, "advertisingConfiguration");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(identifiersLoader, "identifiersLoader");
        Intrinsics.checkNotNullParameter(advertisingInfoLoader, "advertisingInfoLoader");
        Intrinsics.checkNotNullParameter(sdkConfigurationLoaderHolder, "sdkConfigurationLoaderHolder");
        Intrinsics.checkNotNullParameter(appStartFalseClickTracker, "appStartFalseClickTracker");
        Intrinsics.checkNotNullParameter(adFetchErrorProvider, "adFetchErrorProvider");
        Intrinsics.checkNotNullParameter(sdkVersionValidator, "sdkVersionValidator");
        Intrinsics.checkNotNullParameter(manifestAnalyzer, "manifestAnalyzer");
        Intrinsics.checkNotNullParameter(sdkInitializerReporter, "sdkInitializerReporter");
        Intrinsics.checkNotNullParameter(androidSdkApiChecker, "androidSdkApiChecker");
        Intrinsics.checkNotNullParameter(dnsPrefetcher, "dnsPrefetcher");
        Intrinsics.checkNotNullParameter(analyticsEasyIntegrationInitializer, "analyticsEasyIntegrationInitializer");
        Intrinsics.checkNotNullParameter(mediatedNetworksSdksInitializer, "mediatedNetworksSdksInitializer");
        this.f27829a = context;
        this.f27830b = sdkEnvironmentModule;
        this.f27831c = coroutineScope;
        this.f27832d = adLoadingPhasesManager;
        this.f27833e = environmentController;
        this.f27834f = advertisingConfiguration;
        this.f27835g = sdkSettings;
        this.f27836h = applicationContext;
        this.f27837i = identifiersLoader;
        this.f27838j = advertisingInfoLoader;
        this.f27839k = sdkConfigurationLoaderHolder;
        this.f27840l = appStartFalseClickTracker;
        this.f27841m = adFetchErrorProvider;
        this.f27842n = sdkVersionValidator;
        this.f27843o = sdkInitializerReporter;
        this.f27844p = androidSdkApiChecker;
        this.f27845q = dnsPrefetcher;
        this.f27846r = analyticsEasyIntegrationInitializer;
        this.f27847s = mediatedNetworksSdksInitializer;
        this.f27848t = new ei0(environmentController.c(), new C2264u3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kotlin.coroutines.d dVar) {
        d dVar2;
        int i4;
        C2105n4 c2105n4;
        EnumC2082m4 enumC2082m4;
        jv1 jv1Var;
        C1899ec c1899ec;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i5 = dVar2.f27870g;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                dVar2.f27870g = i5 - Integer.MIN_VALUE;
                Object obj = dVar2.f27868e;
                Object f4 = AbstractC1241b.f();
                i4 = dVar2.f27870g;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    c2105n4 = this.f27832d;
                    EnumC2082m4 enumC2082m42 = EnumC2082m4.f28847d;
                    C2001ij.a(c2105n4, enumC2082m42, "adLoadingPhaseType", enumC2082m42, null);
                    C1971hc c1971hc = this.f27838j;
                    Context context = this.f27836h;
                    dVar2.f27865b = this;
                    dVar2.f27866c = c2105n4;
                    dVar2.f27867d = enumC2082m42;
                    dVar2.f27870g = 1;
                    c1971hc.getClass();
                    Object a4 = C1971hc.a(context, dVar2);
                    if (a4 == f4) {
                        return f4;
                    }
                    enumC2082m4 = enumC2082m42;
                    obj = a4;
                    jv1Var = this;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    enumC2082m4 = dVar2.f27867d;
                    c2105n4 = dVar2.f27866c;
                    jv1Var = dVar2.f27865b;
                    ResultKt.a(obj);
                }
                c1899ec = (C1899ec) obj;
                if (c1899ec != null) {
                    jv1Var.f27834f.a(c1899ec.a());
                    jv1Var.f27834f.b(c1899ec.c());
                    jv1Var.f27834f.a(c1899ec.b());
                    if (c1899ec.a() != null) {
                        jv1Var.f27833e.c().h();
                    }
                }
                Unit unit = Unit.f41027a;
                c2105n4.a(enumC2082m4);
                return unit;
            }
        }
        dVar2 = new d(dVar);
        Object obj2 = dVar2.f27868e;
        Object f42 = AbstractC1241b.f();
        i4 = dVar2.f27870g;
        if (i4 != 0) {
        }
        c1899ec = (C1899ec) obj2;
        if (c1899ec != null) {
        }
        Unit unit2 = Unit.f41027a;
        c2105n4.a(enumC2082m4);
        return unit2;
    }
}
