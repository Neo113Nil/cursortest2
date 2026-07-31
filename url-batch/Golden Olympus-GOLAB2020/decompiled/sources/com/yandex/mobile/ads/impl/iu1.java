package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.yandex.mobile.ads.impl.hu1;
import com.yandex.mobile.ads.impl.su1;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3333i;
import o2.C3345o;
import o2.InterfaceC3316J;
import o2.InterfaceC3343n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x2.AbstractC3517c;
import x2.InterfaceC3515a;

/* loaded from: classes3.dex */
public final class iu1 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final InterfaceC3515a f27392d = AbstractC3517c.b(false, 1, null);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2105n4 f27393a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zw1 f27394b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final hu1 f27395c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ iu1(Context context, vu1 vu1Var, e50 e50Var, C1803ac c1803ac, C2105n4 c2105n4) {
        this(context, vu1Var, e50Var, c1803ac, c2105n4, r6, new hu1(r1, vu1Var.c(), c1803ac, e50Var, c2105n4));
        zw1 zw1Var = new zw1();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    @Nullable
    public final Object a(@NotNull ok0 ok0Var, @NotNull kotlin.coroutines.d dVar) {
        return AbstractC3333i.g(o2.Z.b(), new a(ok0Var, null), dVar);
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.SdkConfigurationLoaderHolder$loadSdkConfiguration$2", f = "SdkConfigurationLoaderHolder.kt", l = {93, 96}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        InterfaceC3515a f27396b;

        /* renamed from: c, reason: collision with root package name */
        iu1 f27397c;

        /* renamed from: d, reason: collision with root package name */
        ok0 f27398d;

        /* renamed from: e, reason: collision with root package name */
        Object f27399e;

        /* renamed from: f, reason: collision with root package name */
        int f27400f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ok0 f27402h;

        /* renamed from: com.yandex.mobile.ads.impl.iu1$a$a, reason: collision with other inner class name */
        static final class C0193a extends kotlin.jvm.internal.s implements Function1<Throwable, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ iu1 f27403b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0193a(iu1 iu1Var) {
                super(1);
                this.f27403b = iu1Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                this.f27403b.f27395c.a();
                return Unit.f41027a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ok0 ok0Var, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f27402h = ok0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return iu1.this.new a(this.f27402h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return iu1.this.new a(this.f27402h, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
        
            if (r10.b(null, r9) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            InterfaceC3515a interfaceC3515a;
            iu1 iu1Var;
            ok0 ok0Var;
            InterfaceC3515a interfaceC3515a2;
            Throwable th;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f27400f;
            try {
                if (i4 == 0) {
                    ResultKt.a(obj);
                    C2105n4 c2105n4 = iu1.this.f27393a;
                    EnumC2082m4 adLoadingPhaseType = EnumC2082m4.f28853j;
                    c2105n4.getClass();
                    Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
                    c2105n4.a(adLoadingPhaseType, null);
                    interfaceC3515a = iu1.f27392d;
                    iu1Var = iu1.this;
                    ok0Var = this.f27402h;
                    this.f27396b = interfaceC3515a;
                    this.f27397c = iu1Var;
                    this.f27398d = ok0Var;
                    this.f27400f = 1;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3515a2 = this.f27396b;
                        try {
                            ResultKt.a(obj);
                            su1 su1Var = (su1) obj;
                            interfaceC3515a2.c(null);
                            return su1Var;
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC3515a2.c(null);
                            throw th;
                        }
                    }
                    ok0Var = this.f27398d;
                    iu1Var = this.f27397c;
                    InterfaceC3515a interfaceC3515a3 = this.f27396b;
                    ResultKt.a(obj);
                    interfaceC3515a = interfaceC3515a3;
                }
                iu1Var.f27393a.a(EnumC2082m4.f28853j);
                this.f27396b = interfaceC3515a;
                this.f27397c = iu1Var;
                this.f27398d = ok0Var;
                this.f27400f = 2;
                C3345o c3345o = new C3345o(AbstractC1241b.c(this), 1);
                c3345o.E();
                c3345o.f(new C0193a(iu1Var));
                iu1Var.f27395c.a(iu1Var.f27394b, ok0Var, new b(c3345o));
                Object y4 = c3345o.y();
                if (y4 == AbstractC1241b.f()) {
                    kotlin.coroutines.jvm.internal.h.c(this);
                }
                if (y4 != f4) {
                    interfaceC3515a2 = interfaceC3515a;
                    obj = y4;
                    su1 su1Var2 = (su1) obj;
                    interfaceC3515a2.c(null);
                    return su1Var2;
                }
                return f4;
            } catch (Throwable th3) {
                interfaceC3515a2 = interfaceC3515a;
                th = th3;
                interfaceC3515a2.c(null);
                throw th;
            }
        }

        public static final class b implements hu1.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3343n f27404a;

            b(C3345o c3345o) {
                this.f27404a = c3345o;
            }

            @Override // com.yandex.mobile.ads.impl.hu1.a
            public final void a(@NotNull hi2 error, @NotNull xq configurationSource) {
                Intrinsics.checkNotNullParameter(error, "error");
                Intrinsics.checkNotNullParameter(configurationSource, "configurationSource");
                if (this.f27404a.isActive()) {
                    InterfaceC3343n interfaceC3343n = this.f27404a;
                    Result.Companion companion = Result.Companion;
                    interfaceC3343n.resumeWith(Result.m243constructorimpl(new su1.a(error, configurationSource)));
                }
            }

            @Override // com.yandex.mobile.ads.impl.hu1.a
            public final void a(@NotNull du1 sdkConfiguration, @NotNull xq configurationSource) {
                Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
                Intrinsics.checkNotNullParameter(configurationSource, "configurationSource");
                if (this.f27404a.isActive()) {
                    InterfaceC3343n interfaceC3343n = this.f27404a;
                    Result.Companion companion = Result.Companion;
                    interfaceC3343n.resumeWith(Result.m243constructorimpl(new su1.b(sdkConfiguration, configurationSource)));
                }
            }
        }
    }

    public iu1(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull e50 environmentController, @NotNull C1803ac advertisingConfiguration, @NotNull C2105n4 adLoadingPhasesManager, @NotNull zw1 sensitiveModeChecker, @NotNull hu1 sdkConfigurationLoader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(environmentController, "environmentController");
        Intrinsics.checkNotNullParameter(advertisingConfiguration, "advertisingConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        Intrinsics.checkNotNullParameter(sdkConfigurationLoader, "sdkConfigurationLoader");
        this.f27393a = adLoadingPhasesManager;
        this.f27394b = sensitiveModeChecker;
        this.f27395c = sdkConfigurationLoader;
    }
}
