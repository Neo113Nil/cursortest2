package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.yandex.mobile.ads.impl.c90;
import com.yandex.mobile.ads.impl.u90;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.AbstractC3398h;
import r2.InterfaceC3396f;
import r2.InterfaceC3397g;

/* loaded from: classes3.dex */
public final class da0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f24512a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final r2.t f24513b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC3316J f24514c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private os f24515d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final r2.G f24516e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f24517f;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.feed.ui.FeedViewModel$observeLoadingState$1", f = "FeedViewModel.kt", l = {94}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f24518b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f24519c;

        /* renamed from: com.yandex.mobile.ads.impl.da0$a$a, reason: collision with other inner class name */
        static final class C0183a extends kotlin.jvm.internal.s implements Function1<ba0, u90> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0183a f24521b = new C0183a();

            C0183a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ba0 ba0Var = (ba0) obj;
                Intrinsics.checkNotNullParameter(ba0Var, "<name for destructuring parameter 0>");
                return ba0Var.a();
            }
        }

        static final class b<T> implements InterfaceC3397g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ da0 f24522a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3316J f24523b;

            b(da0 da0Var, InterfaceC3316J interfaceC3316J) {
                this.f24522a = da0Var;
                this.f24523b = interfaceC3316J;
            }

            @Override // r2.InterfaceC3397g
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                ba0 ba0Var = (ba0) obj;
                u90 c4 = ba0Var.c();
                if (c4 instanceof u90.a) {
                    C1866d3 a4 = ((u90.a) ba0Var.c()).a();
                    os b4 = this.f24522a.b();
                    if (b4 != null) {
                        b4.a(a4);
                    }
                    o2.K.e(this.f24523b, a4.d(), null, 2, null);
                } else if (c4 instanceof u90.c) {
                    os b5 = this.f24522a.b();
                    if (b5 != null) {
                        b5.onAdLoaded();
                    }
                } else if (!(c4 instanceof u90.b)) {
                    boolean z4 = c4 instanceof u90.d;
                }
                return Unit.f41027a;
            }
        }

        a(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            a aVar = da0.this.new a(dVar);
            aVar.f24519c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            a aVar = da0.this.new a((kotlin.coroutines.d) obj2);
            aVar.f24519c = (InterfaceC3316J) obj;
            return aVar.invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f24518b;
            if (i4 == 0) {
                ResultKt.a(obj);
                InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.f24519c;
                InterfaceC3396f h4 = AbstractC3398h.h(da0.this.c(), C0183a.f24521b);
                b bVar = new b(da0.this, interfaceC3316J);
                this.f24518b = 1;
                if (h4.a(bVar, this) == f4) {
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

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.feed.ui.FeedViewModel$onFeedItemVisible$1", f = "FeedViewModel.kt", l = {87}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f24524b;

        b(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return da0.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return da0.this.new b((kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f24524b;
            if (i4 == 0) {
                ResultKt.a(obj);
                r2.t tVar = da0.this.f24513b;
                c90.a aVar = c90.a.f24102a;
                this.f24524b = 1;
                if (tVar.emit(aVar, this) == f4) {
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

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.feed.ui.FeedViewModel$preloadAd$1", f = "FeedViewModel.kt", l = {78}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f24526b;

        c(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return da0.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return da0.this.new c((kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f24526b;
            if (i4 == 0) {
                ResultKt.a(obj);
                r2.t tVar = da0.this.f24513b;
                c90.a aVar = c90.a.f24102a;
                this.f24526b = 1;
                if (tVar.emit(aVar, this) == f4) {
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

    public da0(@NotNull Context appContext, @NotNull um2 sdkEnvironmentModule, @NotNull C1918f7 adRequestData, @NotNull a90 divContextProvider, @NotNull b90 divViewPreloader, @NotNull C2286v2 adConfiguration, @NotNull r2.t feedInputEventFlow, @NotNull m90 feedItemLoadControllerCreator, @NotNull n90 feedItemLoadDataSource, @NotNull r90 feedItemPreloadDataSource, @NotNull vz0 memoryUtils, @NotNull o90 loadEnoughMemoryValidator, @NotNull t90 feedItemsRepository, @NotNull j90 feedItemListUseCase, @NotNull InterfaceC3316J coroutineScope) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(divContextProvider, "divContextProvider");
        Intrinsics.checkNotNullParameter(divViewPreloader, "divViewPreloader");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(feedInputEventFlow, "feedInputEventFlow");
        Intrinsics.checkNotNullParameter(feedItemLoadControllerCreator, "feedItemLoadControllerCreator");
        Intrinsics.checkNotNullParameter(feedItemLoadDataSource, "feedItemLoadDataSource");
        Intrinsics.checkNotNullParameter(feedItemPreloadDataSource, "feedItemPreloadDataSource");
        Intrinsics.checkNotNullParameter(memoryUtils, "memoryUtils");
        Intrinsics.checkNotNullParameter(loadEnoughMemoryValidator, "loadEnoughMemoryValidator");
        Intrinsics.checkNotNullParameter(feedItemsRepository, "feedItemsRepository");
        Intrinsics.checkNotNullParameter(feedItemListUseCase, "feedItemListUseCase");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f24512a = adConfiguration;
        this.f24513b = feedInputEventFlow;
        this.f24514c = coroutineScope;
        this.f24516e = feedItemListUseCase.a();
        this.f24517f = new AtomicInteger(-1);
        e();
    }

    private final void e() {
        AbstractC3337k.d(this.f24514c, null, null, new a(null), 3, null);
    }

    @Nullable
    public final os b() {
        return this.f24515d;
    }

    @NotNull
    public final r2.G c() {
        return this.f24516e;
    }

    @NotNull
    public final AtomicInteger d() {
        return this.f24517f;
    }

    public final void f() {
        if (((ba0) this.f24516e.getValue()).b().isEmpty() && this.f24517f.get() == -1 && !(((ba0) this.f24516e.getValue()).c() instanceof u90.a)) {
            this.f24517f.getAndIncrement();
            AbstractC3337k.d(this.f24514c, null, null, new c(null), 3, null);
            return;
        }
        C1866d3 s4 = C1942g7.s();
        os osVar = this.f24515d;
        if (osVar != null) {
            osVar.a(s4);
        }
    }

    @NotNull
    public final C2286v2 a() {
        return this.f24512a;
    }

    public final void a(int i4) {
        if ((((ba0) this.f24516e.getValue()).c() instanceof u90.a) || i4 != this.f24517f.get()) {
            return;
        }
        this.f24517f.getAndIncrement();
        AbstractC3337k.d(this.f24514c, null, null, new b(null), 3, null);
    }

    public final void a(@Nullable t80 t80Var) {
        this.f24515d = t80Var;
    }
}
