package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vm implements yr1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f33676a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ts0 f33677b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ps0 f33678c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final xr1 f33679d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ks1 f33680e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final qk1 f33681f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<wr1> f33682g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private ut f33683h;

    public final class a implements ut {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1918f7 f33684a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ vm f33685b;

        public a(vm vmVar, @NotNull C1918f7 adRequestData) {
            Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
            this.f33685b = vmVar;
            this.f33684a = adRequestData;
        }

        @Override // com.yandex.mobile.ads.impl.ut
        public final void a(@NotNull C1866d3 error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // com.yandex.mobile.ads.impl.ut
        public final void a(@NotNull st rewardedAd) {
            Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
            this.f33685b.f33680e.a(this.f33684a, rewardedAd);
        }
    }

    public final class c implements bd0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1918f7 f33687a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ vm f33688b;

        public c(vm vmVar, @NotNull C1918f7 adRequestData) {
            Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
            this.f33688b = vmVar;
            this.f33687a = adRequestData;
        }

        @Override // com.yandex.mobile.ads.impl.bd0
        public final void onAdShown() {
            this.f33688b.b(this.f33687a);
        }
    }

    public vm(@NotNull Context context, @NotNull um2 sdkEnvironmentModule, @NotNull ts0 mainThreadUsageValidator, @NotNull ps0 mainThreadExecutor, @NotNull xr1 adItemLoadControllerFactory, @NotNull ks1 preloadingCache, @NotNull qk1 preloadingAvailabilityValidator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(mainThreadUsageValidator, "mainThreadUsageValidator");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.checkNotNullParameter(adItemLoadControllerFactory, "adItemLoadControllerFactory");
        Intrinsics.checkNotNullParameter(preloadingCache, "preloadingCache");
        Intrinsics.checkNotNullParameter(preloadingAvailabilityValidator, "preloadingAvailabilityValidator");
        this.f33676a = context;
        this.f33677b = mainThreadUsageValidator;
        this.f33678c = mainThreadExecutor;
        this.f33679d = adItemLoadControllerFactory;
        this.f33680e = preloadingCache;
        this.f33681f = preloadingAvailabilityValidator;
        this.f33682g = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(vm this$0, C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adRequestData, "$adRequestData");
        this$0.f33681f.getClass();
        if (qk1.a(adRequestData) && this$0.f33680e.c()) {
            this$0.a(adRequestData, new a(this$0, adRequestData), "render");
        }
    }

    public final class b implements ut {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.ut
        public final void a(@NotNull C1866d3 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            ut utVar = vm.this.f33683h;
            if (utVar != null) {
                utVar.a(error);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ut
        public final void a(@NotNull st rewardedAd) {
            Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
            ut utVar = vm.this.f33683h;
            if (utVar != null) {
                utVar.a(rewardedAd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(vm this$0, C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adRequestData, "$adRequestData");
        this$0.f33681f.getClass();
        if (!qk1.a(adRequestData)) {
            this$0.a(adRequestData, this$0.new b(), "default");
            return;
        }
        st a4 = this$0.f33680e.a(adRequestData);
        if (a4 == null) {
            this$0.a(adRequestData, this$0.new b(), "default");
            return;
        }
        ut utVar = this$0.f33683h;
        if (utVar != null) {
            utVar.a(a4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.yr1
    public final void a() {
        this.f33677b.a();
        this.f33678c.a();
        Iterator<wr1> it = this.f33682g.iterator();
        while (it.hasNext()) {
            wr1 next = it.next();
            next.a((ut) null);
            next.d();
        }
        this.f33682g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final C1918f7 c1918f7) {
        this.f33678c.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Th
            @Override // java.lang.Runnable
            public final void run() {
                vm.c(vm.this, c1918f7);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.yr1
    public final void a(@NotNull final C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        this.f33677b.a();
        if (this.f33683h == null) {
            po0.c("RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f33678c.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Sh
            @Override // java.lang.Runnable
            public final void run() {
                vm.b(vm.this, adRequestData);
            }
        });
    }

    private final void a(C1918f7 c1918f7, ut utVar, String str) {
        C1918f7 a4 = C1918f7.a(c1918f7, null, str, 2047);
        wr1 a5 = this.f33679d.a(this.f33676a, this, a4, new c(this, a4));
        this.f33682g.add(a5);
        a5.a(a4.a());
        a5.a(utVar);
        a5.b(a4);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1987i4
    public final void a(yc0 yc0Var) {
        wr1 loadController = (wr1) yc0Var;
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        if (this.f33683h == null) {
            po0.c("RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        loadController.a((ut) null);
        this.f33682g.remove(loadController);
    }

    @Override // com.yandex.mobile.ads.impl.yr1
    public final void a(@Nullable tm2 tm2Var) {
        this.f33677b.a();
        this.f33683h = tm2Var;
    }
}
