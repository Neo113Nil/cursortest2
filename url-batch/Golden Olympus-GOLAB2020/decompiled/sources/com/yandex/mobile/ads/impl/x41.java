package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.yandex.mobile.ads.impl.i91;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class x41 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f34381a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2105n4 f34382b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC3316J f34383c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Context f34384d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final z41 f34385e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final i91 f34386f;

    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C2360y7<?> f34387b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private final n61 f34388c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final h51 f34389d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final v41 f34390e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final tv f34391f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ x41 f34392g;

        /* renamed from: com.yandex.mobile.ads.impl.x41$a$a, reason: collision with other inner class name */
        public final class C0206a implements i91.a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final v41 f34393a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final C2105n4 f34394b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f34395c;

            public C0206a(a aVar, @NotNull v41 nativeAdCreationListener, @NotNull C2105n4 adLoadingPhasesManager) {
                Intrinsics.checkNotNullParameter(nativeAdCreationListener, "nativeAdCreationListener");
                Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
                this.f34395c = aVar;
                this.f34393a = nativeAdCreationListener;
                this.f34394b = adLoadingPhasesManager;
            }

            @Override // com.yandex.mobile.ads.impl.i91.a
            public final void a(@NotNull sk1 imageProvider, @NotNull h41 nativeAdBlock) {
                Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
                Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
                this.f34394b.a(EnumC2082m4.f28857n);
                InterfaceC3316J interfaceC3316J = this.f34395c.f34392g.f34383c;
                a aVar = this.f34395c;
                AbstractC3337k.d(interfaceC3316J, null, null, new w41(aVar.f34392g, nativeAdBlock, imageProvider, aVar, this, null), 3, null);
            }
        }

        public a(x41 x41Var, @NotNull C2360y7<?> adResponse, @Nullable n61 n61Var, @NotNull h51 nativeAdFactoriesProvider, @NotNull v41 nativeAdCreationListener) {
            Intrinsics.checkNotNullParameter(adResponse, "adResponse");
            Intrinsics.checkNotNullParameter(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
            Intrinsics.checkNotNullParameter(nativeAdCreationListener, "nativeAdCreationListener");
            this.f34392g = x41Var;
            this.f34387b = adResponse;
            this.f34388c = n61Var;
            this.f34389d = nativeAdFactoriesProvider;
            this.f34390e = nativeAdCreationListener;
            this.f34391f = new uv(x41Var.f34384d, x41Var.f34381a, new xq1().b(adResponse, x41Var.f34381a)).a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                n61 n61Var = this.f34388c;
                if (n61Var == null) {
                    this.f34390e.a(C1942g7.k());
                    return;
                }
                if (n61Var.e().isEmpty()) {
                    this.f34390e.a(C1942g7.q());
                    return;
                }
                h41 h41Var = new h41(this.f34387b, this.f34392g.f34381a, this.f34388c);
                C0206a c0206a = new C0206a(this, this.f34390e, this.f34392g.f34382b);
                C2105n4 c2105n4 = this.f34392g.f34382b;
                EnumC2082m4 adLoadingPhaseType = EnumC2082m4.f28857n;
                c2105n4.getClass();
                Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
                c2105n4.a(adLoadingPhaseType, null);
                this.f34392g.f34386f.a(this.f34392g.f34384d, this.f34392g.f34381a, h41Var, c0206a, this.f34391f, this.f34390e);
            } catch (Exception unused) {
                ap0.c(new Object[0]);
                this.f34390e.a(C1942g7.k());
            }
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.nativeads.creator.NativeAdCreationManager$createNativeAd$1", f = "NativeAdCreationManager.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2360y7<?> f34397c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n61 f34398d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h51 f34399e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ v41 f34400f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2360y7<?> c2360y7, n61 n61Var, h51 h51Var, v41 v41Var, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f34397c = c2360y7;
            this.f34398d = n61Var;
            this.f34399e = h51Var;
            this.f34400f = v41Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return x41.this.new b(this.f34397c, this.f34398d, this.f34399e, this.f34400f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC1241b.f();
            ResultKt.a(obj);
            new a(x41.this, this.f34397c, this.f34398d, this.f34399e, this.f34400f).run();
            return Unit.f41027a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ x41(Context context, vu1 vu1Var, C2286v2 c2286v2, C2105n4 c2105n4, InterfaceC3316J interfaceC3316J) {
        this(context, vu1Var, c2286v2, c2105n4, interfaceC3316J, r6, r7, r12, new z41(c2286v2, vu1Var, r12), new i91(context, vu1Var, c2105n4, r12, interfaceC3316J));
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        sa1 sa1Var = new sa1(c2286v2, context, c2105n4);
        t41 t41Var = new t41(sa1Var);
    }

    public final void a(@NotNull C2360y7<?> adResponse, @Nullable n61 n61Var, @NotNull h51 nativeAdFactoriesProvider, @NotNull v41 nativeAdCreationListener) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        Intrinsics.checkNotNullParameter(nativeAdCreationListener, "nativeAdCreationListener");
        AbstractC3337k.d(this.f34383c, null, null, new b(adResponse, n61Var, nativeAdFactoriesProvider, nativeAdCreationListener, null), 3, null);
    }

    public final void a() {
        this.f34386f.a();
    }

    public x41(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull C2286v2 adConfiguration, @NotNull C2105n4 adLoadingPhasesManager, @NotNull InterfaceC3316J coroutineScope, @NotNull Context appContext, @NotNull sa1 nativeVideoLoadController, @NotNull t41 nativeAdControllers, @NotNull z41 nativeAdCreator, @NotNull i91 nativeResourcesLoader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(nativeVideoLoadController, "nativeVideoLoadController");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        Intrinsics.checkNotNullParameter(nativeAdCreator, "nativeAdCreator");
        Intrinsics.checkNotNullParameter(nativeResourcesLoader, "nativeResourcesLoader");
        this.f34381a = adConfiguration;
        this.f34382b = adLoadingPhasesManager;
        this.f34383c = coroutineScope;
        this.f34384d = appContext;
        this.f34385e = nativeAdCreator;
        this.f34386f = nativeResourcesLoader;
    }
}
