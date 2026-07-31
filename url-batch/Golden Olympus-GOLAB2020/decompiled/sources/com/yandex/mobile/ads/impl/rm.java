package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rm implements Cif {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f31274a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ts0 f31275b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ps0 f31276c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2045kf f31277d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2069lf f31278e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final qk1 f31279f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<C1974hf> f31280g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private js f31281h;

    public final class a implements bd0 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1918f7 f31282a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ rm f31283b;

        public a(rm rmVar, @NotNull C1918f7 adRequestData) {
            Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
            this.f31283b = rmVar;
            this.f31282a = adRequestData;
        }

        @Override // com.yandex.mobile.ads.impl.bd0
        public final void onAdShown() {
            this.f31283b.b(this.f31282a);
        }
    }

    public final class b implements js {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1918f7 f31284a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ rm f31285b;

        public b(rm rmVar, @NotNull C1918f7 adRequestData) {
            Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
            this.f31285b = rmVar;
            this.f31284a = adRequestData;
        }

        @Override // com.yandex.mobile.ads.impl.js
        public final void a(@NotNull C1866d3 error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // com.yandex.mobile.ads.impl.js
        public final void a(@NotNull hs appOpenAd) {
            Intrinsics.checkNotNullParameter(appOpenAd, "appOpenAd");
            this.f31285b.f31278e.a(this.f31284a, appOpenAd);
        }
    }

    public rm(@NotNull Context context, @NotNull um2 sdkEnvironmentModule, @NotNull ts0 mainThreadUsageValidator, @NotNull ps0 mainThreadExecutor, @NotNull C2045kf adLoadControllerFactory, @NotNull C2069lf preloadingCache, @NotNull qk1 preloadingAvailabilityValidator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(mainThreadUsageValidator, "mainThreadUsageValidator");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.checkNotNullParameter(adLoadControllerFactory, "adLoadControllerFactory");
        Intrinsics.checkNotNullParameter(preloadingCache, "preloadingCache");
        Intrinsics.checkNotNullParameter(preloadingAvailabilityValidator, "preloadingAvailabilityValidator");
        this.f31274a = context;
        this.f31275b = mainThreadUsageValidator;
        this.f31276c = mainThreadExecutor;
        this.f31277d = adLoadControllerFactory;
        this.f31278e = preloadingCache;
        this.f31279f = preloadingAvailabilityValidator;
        this.f31280g = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(rm this$0, C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adRequestData, "$adRequestData");
        this$0.f31279f.getClass();
        if (qk1.a(adRequestData) && this$0.f31278e.c()) {
            this$0.a(adRequestData, new b(this$0, adRequestData), "render");
        }
    }

    public final class c implements js {
        public c() {
        }

        @Override // com.yandex.mobile.ads.impl.js
        public final void a(@NotNull C1866d3 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            js jsVar = rm.this.f31281h;
            if (jsVar != null) {
                jsVar.a(error);
            }
        }

        @Override // com.yandex.mobile.ads.impl.js
        public final void a(@NotNull hs appOpenAd) {
            Intrinsics.checkNotNullParameter(appOpenAd, "appOpenAd");
            js jsVar = rm.this.f31281h;
            if (jsVar != null) {
                jsVar.a(appOpenAd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(rm this$0, C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adRequestData, "$adRequestData");
        this$0.f31279f.getClass();
        if (!qk1.a(adRequestData)) {
            this$0.a(adRequestData, this$0.new c(), "default");
            return;
        }
        hs a4 = this$0.f31278e.a(adRequestData);
        if (a4 == null) {
            this$0.a(adRequestData, this$0.new c(), "default");
            return;
        }
        js jsVar = this$0.f31281h;
        if (jsVar != null) {
            jsVar.a(a4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.Cif
    public final void a() {
        this.f31275b.a();
        this.f31276c.a();
        Iterator<C1974hf> it = this.f31280g.iterator();
        while (it.hasNext()) {
            C1974hf next = it.next();
            next.a((js) null);
            next.d();
        }
        this.f31280g.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final C1918f7 c1918f7) {
        this.f31276c.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Rc
            @Override // java.lang.Runnable
            public final void run() {
                rm.c(rm.this, c1918f7);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.Cif
    public final void a(@NotNull final C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        this.f31275b.a();
        if (this.f31281h == null) {
            po0.c("AppOpenAdLoader. AppOpenAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f31276c.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Sc
            @Override // java.lang.Runnable
            public final void run() {
                rm.b(rm.this, adRequestData);
            }
        });
    }

    private final void a(C1918f7 c1918f7, js jsVar, String str) {
        C1918f7 a4 = C1918f7.a(c1918f7, null, str, 2047);
        C1974hf a5 = this.f31277d.a(this.f31274a, this, a4, new a(this, a4));
        this.f31280g.add(a5);
        a5.a(a4.a());
        a5.a(jsVar);
        a5.b(a4);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1987i4
    public final void a(yc0 yc0Var) {
        C1974hf loadController = (C1974hf) yc0Var;
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        if (this.f31281h == null) {
            po0.c("AppOpenAdLoader. AppOpenAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        loadController.a((js) null);
        this.f31280g.remove(loadController);
    }

    @Override // com.yandex.mobile.ads.impl.Cif
    public final void a(@Nullable hl2 hl2Var) {
        this.f31275b.a();
        this.f31281h = hl2Var;
    }
}
