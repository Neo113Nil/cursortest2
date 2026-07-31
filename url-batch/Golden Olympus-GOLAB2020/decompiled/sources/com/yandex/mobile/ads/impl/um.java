package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class um implements gp0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f33165a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ts0 f33166b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ps0 f33167c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final fp0 f33168d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final np0 f33169e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final qk1 f33170f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<ep0> f33171g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private at f33172h;

    public final class a implements bd0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1918f7 f33173a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ um f33174b;

        public a(um umVar, @NotNull C1918f7 adRequestData) {
            Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
            this.f33174b = umVar;
            this.f33173a = adRequestData;
        }

        @Override // com.yandex.mobile.ads.impl.bd0
        public final void onAdShown() {
            this.f33174b.b(this.f33173a);
        }
    }

    public final class b implements at {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1918f7 f33175a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ um f33176b;

        public b(um umVar, @NotNull C1918f7 adRequestData) {
            Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
            this.f33176b = umVar;
            this.f33175a = adRequestData;
        }

        @Override // com.yandex.mobile.ads.impl.at
        public final void a(@NotNull C1866d3 error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // com.yandex.mobile.ads.impl.at
        public final void a(@NotNull ys interstitialAd) {
            Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
            this.f33176b.f33169e.a(this.f33175a, interstitialAd);
        }
    }

    public um(@NotNull Context context, @NotNull um2 sdkEnvironmentModule, @NotNull ts0 mainThreadUsageValidator, @NotNull ps0 mainThreadExecutor, @NotNull fp0 adItemLoadControllerFactory, @NotNull np0 preloadingCache, @NotNull qk1 preloadingAvailabilityValidator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(mainThreadUsageValidator, "mainThreadUsageValidator");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.checkNotNullParameter(adItemLoadControllerFactory, "adItemLoadControllerFactory");
        Intrinsics.checkNotNullParameter(preloadingCache, "preloadingCache");
        Intrinsics.checkNotNullParameter(preloadingAvailabilityValidator, "preloadingAvailabilityValidator");
        this.f33165a = context;
        this.f33166b = mainThreadUsageValidator;
        this.f33167c = mainThreadExecutor;
        this.f33168d = adItemLoadControllerFactory;
        this.f33169e = preloadingCache;
        this.f33170f = preloadingAvailabilityValidator;
        this.f33171g = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(um this$0, C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adRequestData, "$adRequestData");
        this$0.f33170f.getClass();
        if (qk1.a(adRequestData) && this$0.f33169e.c()) {
            this$0.a(adRequestData, new b(this$0, adRequestData), "render");
        }
    }

    public final class c implements at {
        public c() {
        }

        @Override // com.yandex.mobile.ads.impl.at
        public final void a(@NotNull C1866d3 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            at atVar = um.this.f33172h;
            if (atVar != null) {
                atVar.a(error);
            }
        }

        @Override // com.yandex.mobile.ads.impl.at
        public final void a(@NotNull ys interstitialAd) {
            Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
            at atVar = um.this.f33172h;
            if (atVar != null) {
                atVar.a(interstitialAd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(um this$0, C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adRequestData, "$adRequestData");
        this$0.f33170f.getClass();
        if (!qk1.a(adRequestData)) {
            this$0.a(adRequestData, this$0.new c(), "default");
            return;
        }
        ys a4 = this$0.f33169e.a(adRequestData);
        if (a4 == null) {
            this$0.a(adRequestData, this$0.new c(), "default");
            return;
        }
        at atVar = this$0.f33172h;
        if (atVar != null) {
            atVar.a(a4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.gp0
    public final void a() {
        this.f33166b.a();
        this.f33167c.a();
        Iterator<ep0> it = this.f33171g.iterator();
        while (it.hasNext()) {
            ep0 next = it.next();
            next.a((at) null);
            next.d();
        }
        this.f33171g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final C1918f7 c1918f7) {
        this.f33167c.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Hh
            @Override // java.lang.Runnable
            public final void run() {
                um.c(um.this, c1918f7);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.gp0
    public final void a(@NotNull final C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        this.f33166b.a();
        if (this.f33172h == null) {
            po0.c("InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f33167c.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Ih
            @Override // java.lang.Runnable
            public final void run() {
                um.b(um.this, adRequestData);
            }
        });
    }

    private final void a(C1918f7 c1918f7, at atVar, String str) {
        C1918f7 a4 = C1918f7.a(c1918f7, null, str, 2047);
        ep0 a5 = this.f33168d.a(this.f33165a, this, a4, new a(this, a4));
        this.f33171g.add(a5);
        a5.a(a4.a());
        a5.a(atVar);
        a5.b(a4);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1987i4
    public final void a(yc0 yc0Var) {
        ep0 loadController = (ep0) yc0Var;
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        if (this.f33172h == null) {
            po0.c("InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        loadController.a((at) null);
        this.f33171g.remove(loadController);
    }

    @Override // com.yandex.mobile.ads.impl.gp0
    public final void a(@Nullable em2 em2Var) {
        this.f33166b.a();
        this.f33172h = em2Var;
    }
}
