package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.impl.m91;
import com.yandex.mobile.ads.impl.wv1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wv1 implements InterfaceC2072li {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1977hi f34193a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m91 f34194b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2279ui f34195c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final i71 f34196d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final rt1 f34197e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final p71 f34198f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Handler f34199g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ew1 f34200h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C2024ji f34201i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final s51 f34202j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final ViewTreeObserver.OnPreDrawListener f34203k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private C2360y7<String> f34204l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private f61 f34205m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f34206n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    private C2256ti f34207o;

    public static final class c implements InterfaceC2048ki {
        c() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2048ki
        public final void a() {
            wv1.this.f34193a.t();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2048ki
        public final void a(@NotNull C1866d3 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            wv1.this.f34193a.b(error);
        }
    }

    public wv1(@NotNull C1977hi loadController, @NotNull vu1 sdkEnvironmentModule, @NotNull m91 nativeResponseCreator, @NotNull C2279ui contentControllerCreator, @NotNull i71 requestParameterManager, @NotNull rt1 sdkAdapterReporter, @NotNull p71 adEventListener, @NotNull Handler handler, @NotNull ew1 sdkSettings, @NotNull C2024ji sizeValidator, @NotNull s51 infoProvider) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(nativeResponseCreator, "nativeResponseCreator");
        Intrinsics.checkNotNullParameter(contentControllerCreator, "contentControllerCreator");
        Intrinsics.checkNotNullParameter(requestParameterManager, "requestParameterManager");
        Intrinsics.checkNotNullParameter(sdkAdapterReporter, "sdkAdapterReporter");
        Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        Intrinsics.checkNotNullParameter(sizeValidator, "sizeValidator");
        Intrinsics.checkNotNullParameter(infoProvider, "infoProvider");
        this.f34193a = loadController;
        this.f34194b = nativeResponseCreator;
        this.f34195c = contentControllerCreator;
        this.f34196d = requestParameterManager;
        this.f34197e = sdkAdapterReporter;
        this.f34198f = adEventListener;
        this.f34199g = handler;
        this.f34200h = sdkSettings;
        this.f34201i = sizeValidator;
        this.f34202j = infoProvider;
        this.f34203k = new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.mobile.ads.impl.Pk
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean g4;
                g4 = wv1.g(wv1.this);
                return g4;
            }
        };
    }

    public static final void f(wv1 wv1Var) {
        wv1Var.f34204l = null;
        wv1Var.f34205m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(final wv1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f34199g.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.Ok
            @Override // java.lang.Runnable
            public final void run() {
                wv1.h(wv1.this);
            }
        }, 50L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(wv1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        og2.a(this$0.f34193a.B(), false);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2072li
    @Nullable
    public final String getAdInfo() {
        return this.f34202j.a(this.f34205m);
    }

    public final class a implements wq1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f34208a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C2360y7<?> f34209b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ wv1 f34210c;

        public a(wv1 wv1Var, @NotNull Context context, @NotNull C2360y7<?> adResponse) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(adResponse, "adResponse");
            this.f34210c = wv1Var;
            this.f34208a = context;
            this.f34209b = adResponse;
        }

        @Override // com.yandex.mobile.ads.impl.wq1
        public final void a(@NotNull C1866d3 adRequestError) {
            Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
            this.f34210c.f34197e.a(this.f34208a, this.f34209b, this.f34210c.f34196d);
            this.f34210c.f34197e.a(this.f34208a, this.f34209b, (j71) null);
        }

        @Override // com.yandex.mobile.ads.impl.wq1
        public final void a(@NotNull n61 nativeAdResponse) {
            Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
            j71 j71Var = new j71(this.f34209b, nativeAdResponse, this.f34210c.f34193a.e());
            this.f34210c.f34197e.a(this.f34208a, this.f34209b, this.f34210c.f34196d);
            this.f34210c.f34197e.a(this.f34208a, this.f34209b, j71Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2072li
    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C2256ti c2256ti = this.f34207o;
        if (c2256ti != null) {
            c2256ti.a();
        }
        this.f34194b.a();
        this.f34204l = null;
        this.f34205m = null;
        this.f34206n = true;
    }

    public final class b implements m91.b {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.m91.b
        public final void a(@NotNull C1866d3 adRequestError) {
            Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
            if (wv1.this.f34206n) {
                return;
            }
            wv1.f(wv1.this);
            wv1.this.f34193a.b(adRequestError);
        }

        @Override // com.yandex.mobile.ads.impl.m91.b
        public final void a(@NotNull f61 createdNativeAd) {
            Intrinsics.checkNotNullParameter(createdNativeAd, "createdNativeAd");
            if (wv1.this.f34206n) {
                return;
            }
            wv1.this.f34205m = createdNativeAd;
            Handler handler = wv1.this.f34199g;
            final wv1 wv1Var = wv1.this;
            handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Qk
                @Override // java.lang.Runnable
                public final void run() {
                    wv1.b.a(wv1.this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(wv1 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2072li
    public final void a(@NotNull Context context, @NotNull C2360y7<String> response) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(response, "response");
        C2105n4 h4 = this.f34193a.h();
        EnumC2082m4 enumC2082m4 = EnumC2082m4.f28846c;
        C2001ij.a(h4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
        du1 a4 = this.f34200h.a(context);
        if (a4 != null && a4.r0()) {
            if (this.f34206n) {
                return;
            }
            vy1 p4 = this.f34193a.p();
            vy1 M3 = response.M();
            this.f34204l = response;
            if (p4 != null && xy1.a(context, response, M3, this.f34201i, p4)) {
                this.f34194b.a(response, new b(), new a(this, context, response));
                return;
            }
            C1866d3 a5 = C1942g7.a(p4 != null ? p4.c(context) : 0, p4 != null ? p4.a(context) : 0, M3.getWidth(), M3.getHeight(), lh2.d(context), lh2.b(context));
            po0.a(a5.d(), new Object[0]);
            this.f34193a.b(a5);
            return;
        }
        this.f34193a.b(C1942g7.x());
    }

    public final void a() {
        f61 f61Var;
        if (!this.f34206n) {
            C2360y7<String> c2360y7 = this.f34204l;
            vo0 B4 = this.f34193a.B();
            if (c2360y7 == null || (f61Var = this.f34205m) == null) {
                return;
            }
            Intrinsics.checkNotNull(f61Var, "null cannot be cast to non-null type com.monetization.ads.nativeads.NativeAdPrivate");
            C2256ti a4 = this.f34195c.a(this.f34193a.k(), c2360y7, f61Var, B4, this.f34198f, this.f34203k, this.f34193a.C());
            this.f34207o = a4;
            a4.a(c2360y7.M(), new c());
            return;
        }
        this.f34193a.b(C1942g7.i());
    }
}
