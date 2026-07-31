package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.ip1;
import com.yandex.mobile.ads.impl.w61;
import com.yandex.mobile.ads.impl.yg1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class n81 {

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final k62 f29477A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final fc1 f29478B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final av f29479C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final e51 f29480D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final String f29481E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final r21 f29482F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final d62 f29483G;

    /* renamed from: H, reason: collision with root package name */
    @NotNull
    private final C2149p2 f29484H;

    /* renamed from: I, reason: collision with root package name */
    @NotNull
    private final ko f29485I;

    /* renamed from: J, reason: collision with root package name */
    @NotNull
    private final C1831bg f29486J;

    /* renamed from: K, reason: collision with root package name */
    @Nullable
    private v61 f29487K;

    /* renamed from: L, reason: collision with root package name */
    @NotNull
    private final yg1.b f29488L;

    /* renamed from: M, reason: collision with root package name */
    @NotNull
    private final List<q20> f29489M;

    /* renamed from: N, reason: collision with root package name */
    @NotNull
    private final a91 f29490N;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f29491a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final t41 f29492b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final rb1 f29493c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final aa1 f29494d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final tb1 f29495e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final h51 f29496f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2286v2 f29497g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f29498h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final n61 f29499i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private final nx1 f29500j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final h81 f29501k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final kt f29502l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final v32 f29503m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final xj0 f29504n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C2051kl f29505o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final w61 f29506p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final ww0 f29507q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final C1975hg f29508r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final bk0 f29509s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final po1 f29510t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final C1812al f29511u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final a70 f29512v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final w31 f29513w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final zn1 f29514x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final b70 f29515y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final C2231sg f29516z;

    private final class a implements yg1.b {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.yg1.b
        public final void a(@NotNull vg1 phoneState) {
            Intrinsics.checkNotNullParameter(phoneState, "phoneState");
            boolean z4 = !n81.this.f().b();
            Objects.toString(phoneState);
            a.class.toString();
            ap0.d(new Object[0]);
            n81.this.f29482F.a(phoneState, z4);
        }
    }

    private final class b implements y52 {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.y52
        @NotNull
        public final c92 a(int i4) {
            return n81.this.f().b(n81.this.f29491a, i4);
        }

        @Override // com.yandex.mobile.ads.impl.y52
        @NotNull
        public final c92 b(int i4) {
            return n81.this.f().a(n81.this.f29491a, i4);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ n81(Context context, C2258tk c2258tk, t41 t41Var) {
        this(context, c2258tk, t41Var, r7, r8, r9, r7, r11, r9, r10, r11, r12, r13, r2, r4, r5, r23, r0, r24, r3, r7, r26, r23, r24, r30, r26, r27, r28, r45, r30, r7, r7, r8, r7, r8, r7, r3, r17, r0, r0, r0, r0, r0, r0, r6, r46, new fc1(r2, r5, r0, r3), new av(context, r2, r12 != null ? r12.e() : null));
        InterfaceC1915f4 interfaceC1915f4;
        dr0 dr0Var;
        rb1 h4 = c2258tk.h();
        aa1 g4 = c2258tk.g();
        tb1 i4 = c2258tk.i();
        h41 d4 = c2258tk.d();
        vu1 j4 = c2258tk.j();
        h51 e4 = c2258tk.e();
        f81 c4 = c2258tk.c();
        InterfaceC1849ca b4 = c2258tk.b();
        u31 f4 = c2258tk.f();
        EnumC1848c9 a4 = c2258tk.a();
        C2286v2 a5 = d4.a();
        gs b5 = a5.b();
        C2360y7<?> b6 = d4.b();
        n61 c5 = d4.c();
        List<C2276uf<?>> b7 = i4.b();
        String a6 = i4.a();
        nx1 h5 = c5.h();
        h81 h81Var = new h81();
        kt ktVar = new kt(h81Var);
        v32 v32Var = new v32();
        xj0 xj0Var = new xj0();
        hd1 hd1Var = new hd1();
        yg1 a7 = yg1.f35123h.a(context);
        ro1 ro1Var = new ro1();
        C2051kl c2051kl = new C2051kl();
        zj0 zj0Var = new zj0();
        InterfaceC1915f4 a8 = e4.a();
        int i5 = w61.f33940d;
        w61 a9 = w61.a.a();
        ww0 ww0Var = new ww0(context, a5);
        e71 e71Var = new e71(g4);
        C1894e7 c1894e7 = new C1894e7(e71Var, b4);
        C1975hg c1975hg = new C1975hg(b7);
        b91 b91Var = new b91(c1975hg);
        bk0 bk0Var = new bk0(context, b6, a5, i4.c());
        po1 po1Var = new po1(b7);
        C1812al c1812al = new C1812al(a8, b5, b6, a6, a5.p().c());
        a70 a70Var = new a70(context, a5, a8, b5, b6, a6);
        w31 w31Var = new w31(context, a5, a8, b5, a6);
        zn1 zn1Var = new zn1(context, a5, a8, b5, b6, a6);
        b70 b70Var = new b70(b7);
        C2231sg c2231sg = new C2231sg(b7);
        o51 o51Var = new o51(a6);
        C2379z3 c2379z3 = new C2379z3(o51Var);
        k62 k62Var = new k62();
        if (f4 != null) {
            interfaceC1915f4 = a8;
            dr0Var = f4.e();
        } else {
            interfaceC1915f4 = a8;
            dr0Var = null;
        }
    }

    @NotNull
    public final List<q20> c() {
        return this.f29489M;
    }

    public final void destroy() {
        v61 v61Var = this.f29487K;
        if (v61Var != null) {
            v61Var.b();
        }
    }

    @NotNull
    protected final C2360y7<?> e() {
        return this.f29498h;
    }

    @NotNull
    public final aa1 f() {
        return this.f29494d;
    }

    @NotNull
    public final tb1 g() {
        return this.f29495e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public kt getNativeAdVideoController() {
        return this.f29502l;
    }

    public final void h() {
        j();
        this.f29477A.a(this.f29491a);
        v61 v61Var = this.f29487K;
        if (v61Var != null) {
            this.f29493c.a(v61Var);
            this.f29483G.a(v61Var);
            this.f29516z.a(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r0.isAttachedToWindow() == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        boolean z4;
        v61 v61Var = this.f29487K;
        if (v61Var != null && (r0 = v61Var.f()) != null) {
            z4 = true;
        }
        z4 = false;
        ap0.d(new Object[0]);
        if (z4) {
            this.f29483G.a(this.f29491a, this.f29488L, this.f29487K);
        }
    }

    public final void j() {
        ap0.d(new Object[0]);
        this.f29483G.a(this.f29491a, this.f29488L);
    }

    public abstract void loadImages();

    public final void a(@NotNull View nativeAdView, @NotNull zi0 imageProvider, @NotNull g71 nativeAdWeakViewHolder, @NotNull mo clickListenerFactory, @NotNull Cdo clickConnector) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(nativeAdWeakViewHolder, "nativeAdWeakViewHolder");
        Intrinsics.checkNotNullParameter(clickListenerFactory, "clickListenerFactory");
        Intrinsics.checkNotNullParameter(clickConnector, "clickConnector");
        int i4 = w61.f33940d;
        w61 a4 = w61.a.a();
        n81 a5 = a4.a(nativeAdView);
        if (Intrinsics.areEqual(this, a5)) {
            return;
        }
        if (a5 != null) {
            a5.h();
        }
        if (a4.a(this)) {
            h();
        }
        a4.a(nativeAdView, this);
        v61 v61Var = new v61(nativeAdWeakViewHolder, this.f29497g, imageProvider, this.f29504n, clickListenerFactory, this.f29496f, this.f29508r, this.f29490N, this.f29501k, this.f29498h, this.f29495e, this.f29492b, this.f29507q, this.f29500j, this.f29479C);
        v61Var.a();
        this.f29487K = v61Var;
        this.f29516z.a(v61Var);
        this.f29494d.a(v61Var);
        this.f29493c.a(v61Var);
        clickConnector.a(this.f29486J.a(clickListenerFactory, v61Var));
        b(v61Var);
        this.f29477A.a(nativeAdView, new o81(this));
    }

    @NotNull
    public final a91 b() {
        return this.f29490N;
    }

    private final void b(v61 v61Var) {
        this.f29493c.a(v61Var, this.f29485I);
        boolean z4 = Intrinsics.areEqual(this.f29498h.E(), q81.f30707c.a()) || Intrinsics.areEqual(this.f29498h.E(), q81.f30708d.a());
        if (this.f29478B.a() && !z4) {
            loadImages();
        }
        this.f29513w.a(this.f29510t.a(v61Var), ip1.b.f27321I);
        ap0.d(new Object[0]);
        i();
    }

    public final void a(@NotNull View nativeAdView, @NotNull zi0 imageProvider, @NotNull g71 nativeAdWeakViewHolder, @NotNull mo clickListenerFactory) {
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(nativeAdWeakViewHolder, "nativeAdWeakViewHolder");
        Intrinsics.checkNotNullParameter(clickListenerFactory, "clickListenerFactory");
        n81 a4 = this.f29506p.a(nativeAdView);
        if (Intrinsics.areEqual(this, a4)) {
            return;
        }
        if (a4 != null) {
            a4.h();
        }
        if (this.f29506p.a(this)) {
            h();
        }
        this.f29506p.a(nativeAdView, this);
        a(new v61(nativeAdWeakViewHolder, this.f29497g, imageProvider, this.f29504n, clickListenerFactory, this.f29496f, this.f29508r, this.f29490N, this.f29501k, this.f29498h, this.f29495e, this.f29492b, this.f29507q, this.f29500j, this.f29479C));
        this.f29477A.a(nativeAdView, new o81(this));
    }

    public n81(@NotNull Context context, @NotNull C2258tk binderConfiguration, @NotNull t41 nativeAdControllers, @NotNull rb1 renderer, @NotNull aa1 nativeAdValidator, @NotNull tb1 nativeVisualBlock, @NotNull h41 nativeAdBlock, @NotNull vu1 sdkEnvironmentModule, @NotNull h51 nativeAdFactoriesProvider, @NotNull f81 forceImpressionConfigurator, @NotNull InterfaceC1849ca adViewRenderingValidator, @Nullable u31 u31Var, @NotNull EnumC1848c9 adStructureType, @NotNull C2286v2 adConfiguration, @NotNull gs adType, @NotNull C2360y7 adResponse, @NotNull n61 nativeAdResponse, @NotNull List assets, @Nullable nx1 nx1Var, @NotNull h81 nativeForcePauseObserver, @NotNull kt nativeAdVideoController, @NotNull v32 targetUrlHandlerProvider, @NotNull xj0 impressionEventsObservable, @NotNull hd1 noticeTrackingManagerProvider, @NotNull yg1 phoneStateTracker, @NotNull qo1 renderedTimer, @NotNull C2051kl boundAssetsProvider, @NotNull zj0 impressionManagerCreator, @NotNull InterfaceC1915f4 infoReportDataProviderFactory, @NotNull w61 bindingManager, @NotNull ww0 mediaViewRenderController, @NotNull e71 nativeAdVisibilityValidator, @NotNull C1894e7 adRenderingValidator, @NotNull C1975hg assetValueProvider, @NotNull b91 nativeMediaContentFactory, @NotNull bk0 impressionReporter, @NotNull po1 renderedAssetsProvider, @NotNull C1812al bindingFailureReporter, @NotNull a70 expectedViewMissingReporter, @NotNull w31 nativeAdAssetNamesReporter, @NotNull zn1 rebindAdReporter, @NotNull b70 expectedViewsAssetProvider, @NotNull C2231sg assetsRenderedReportParameterProvider, @NotNull o51 adIdProvider, @NotNull C2379z3 adIdStorageManager, @NotNull k62 trackingTrigger, @NotNull fc1 needLoadChecker, @NotNull av customAssetTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binderConfiguration, "binderConfiguration");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(nativeAdValidator, "nativeAdValidator");
        Intrinsics.checkNotNullParameter(nativeVisualBlock, "nativeVisualBlock");
        Intrinsics.checkNotNullParameter(nativeAdBlock, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        Intrinsics.checkNotNullParameter(forceImpressionConfigurator, "forceImpressionConfigurator");
        Intrinsics.checkNotNullParameter(adViewRenderingValidator, "adViewRenderingValidator");
        Intrinsics.checkNotNullParameter(adStructureType, "adStructureType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(nativeForcePauseObserver, "nativeForcePauseObserver");
        Intrinsics.checkNotNullParameter(nativeAdVideoController, "nativeAdVideoController");
        Intrinsics.checkNotNullParameter(targetUrlHandlerProvider, "targetUrlHandlerProvider");
        Intrinsics.checkNotNullParameter(impressionEventsObservable, "impressionEventsObservable");
        Intrinsics.checkNotNullParameter(noticeTrackingManagerProvider, "noticeTrackingManagerProvider");
        Intrinsics.checkNotNullParameter(phoneStateTracker, "phoneStateTracker");
        Intrinsics.checkNotNullParameter(renderedTimer, "renderedTimer");
        Intrinsics.checkNotNullParameter(boundAssetsProvider, "boundAssetsProvider");
        Intrinsics.checkNotNullParameter(impressionManagerCreator, "impressionManagerCreator");
        Intrinsics.checkNotNullParameter(infoReportDataProviderFactory, "infoReportDataProviderFactory");
        Intrinsics.checkNotNullParameter(bindingManager, "bindingManager");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        Intrinsics.checkNotNullParameter(nativeAdVisibilityValidator, "nativeAdVisibilityValidator");
        Intrinsics.checkNotNullParameter(adRenderingValidator, "adRenderingValidator");
        Intrinsics.checkNotNullParameter(assetValueProvider, "assetValueProvider");
        Intrinsics.checkNotNullParameter(nativeMediaContentFactory, "nativeMediaContentFactory");
        Intrinsics.checkNotNullParameter(impressionReporter, "impressionReporter");
        Intrinsics.checkNotNullParameter(renderedAssetsProvider, "renderedAssetsProvider");
        Intrinsics.checkNotNullParameter(bindingFailureReporter, "bindingFailureReporter");
        Intrinsics.checkNotNullParameter(expectedViewMissingReporter, "expectedViewMissingReporter");
        Intrinsics.checkNotNullParameter(nativeAdAssetNamesReporter, "nativeAdAssetNamesReporter");
        Intrinsics.checkNotNullParameter(rebindAdReporter, "rebindAdReporter");
        Intrinsics.checkNotNullParameter(expectedViewsAssetProvider, "expectedViewsAssetProvider");
        Intrinsics.checkNotNullParameter(assetsRenderedReportParameterProvider, "assetsRenderedReportParameterProvider");
        Intrinsics.checkNotNullParameter(adIdProvider, "adIdProvider");
        Intrinsics.checkNotNullParameter(adIdStorageManager, "adIdStorageManager");
        Intrinsics.checkNotNullParameter(trackingTrigger, "trackingTrigger");
        Intrinsics.checkNotNullParameter(needLoadChecker, "needLoadChecker");
        Intrinsics.checkNotNullParameter(customAssetTracker, "customAssetTracker");
        this.f29491a = context;
        this.f29492b = nativeAdControllers;
        this.f29493c = renderer;
        this.f29494d = nativeAdValidator;
        this.f29495e = nativeVisualBlock;
        this.f29496f = nativeAdFactoriesProvider;
        this.f29497g = adConfiguration;
        this.f29498h = adResponse;
        this.f29499i = nativeAdResponse;
        this.f29500j = nx1Var;
        this.f29501k = nativeForcePauseObserver;
        this.f29502l = nativeAdVideoController;
        this.f29503m = targetUrlHandlerProvider;
        this.f29504n = impressionEventsObservable;
        this.f29505o = boundAssetsProvider;
        this.f29506p = bindingManager;
        this.f29507q = mediaViewRenderController;
        this.f29508r = assetValueProvider;
        this.f29509s = impressionReporter;
        this.f29510t = renderedAssetsProvider;
        this.f29511u = bindingFailureReporter;
        this.f29512v = expectedViewMissingReporter;
        this.f29513w = nativeAdAssetNamesReporter;
        this.f29514x = rebindAdReporter;
        this.f29515y = expectedViewsAssetProvider;
        this.f29516z = assetsRenderedReportParameterProvider;
        this.f29477A = trackingTrigger;
        this.f29478B = needLoadChecker;
        this.f29479C = customAssetTracker;
        e51 a4 = nativeAdFactoriesProvider.b().a(context, adResponse, adConfiguration);
        this.f29480D = a4;
        String a5 = C2362y9.a(this);
        this.f29481E = a5;
        this.f29488L = new a();
        b bVar = new b();
        this.f29489M = nativeAdResponse.c();
        this.f29490N = nativeMediaContentFactory.a();
        impressionManagerCreator.getClass();
        yj0 a6 = zj0.a(context, a4, impressionReporter, adIdStorageManager, impressionEventsObservable);
        List<tx1> e4 = nativeVisualBlock.e();
        a6.a(e4, nativeVisualBlock.c());
        C2149p2 c2149p2 = new C2149p2(context, sdkEnvironmentModule, adResponse, adConfiguration, a4, targetUrlHandlerProvider);
        this.f29484H = c2149p2;
        this.f29485I = new ko(c2149p2, renderedTimer, impressionEventsObservable);
        r21 a7 = noticeTrackingManagerProvider.a(context, adConfiguration, impressionReporter, bVar, a5, adStructureType);
        this.f29482F = a7;
        forceImpressionConfigurator.a(impressionEventsObservable);
        impressionEventsObservable.a(new ed1(a7));
        d62 a8 = nativeAdFactoriesProvider.e().a(a7, new no1(context, adRenderingValidator, adResponse, adConfiguration, adStructureType, adIdStorageManager, impressionEventsObservable, renderedTimer, nativeVisualBlock.d()), new jk0(nativeAdValidator, e4), phoneStateTracker);
        this.f29483G = a8;
        a8.a(impressionEventsObservable);
        a8.a((C2360y7<?>) adResponse, e4);
        this.f29486J = new C1831bg(assets, c2149p2, renderedTimer, impressionEventsObservable, u31Var != null ? u31Var.e() : null);
    }

    private final void a(v61 viewAdapter) {
        viewAdapter.a();
        this.f29514x.a();
        this.f29505o.getClass();
        Intrinsics.checkNotNullParameter(viewAdapter, "viewAdapter");
        Map<String, InterfaceC2299vf<?>> d4 = viewAdapter.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, InterfaceC2299vf<?>> entry : d4.entrySet()) {
            InterfaceC2299vf<?> value = entry.getValue();
            if (value != null && value.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        this.f29513w.a(arrayList, ip1.b.f27320H);
        ArrayList a4 = this.f29515y.a(viewAdapter);
        if (!a4.isEmpty()) {
            this.f29512v.a(a4);
        }
        this.f29487K = viewAdapter;
        this.f29516z.a(viewAdapter);
        this.f29494d.a(viewAdapter);
        jq1 a5 = this.f29494d.a();
        if (a5.a()) {
            this.f29493c.a(viewAdapter);
            b(viewAdapter);
            return;
        }
        String b4 = a5.b();
        this.f29511u.a(b4);
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        throw new t51(C2284v0.a(new Object[0], 0, "Resource for required view " + b4 + " is not present", "format(...)"));
    }

    @NotNull
    public final n61 a() {
        return this.f29499i;
    }

    public final void a(@Nullable com.yandex.mobile.ads.nativeads.c cVar) {
        this.f29503m.a(cVar);
    }

    public void a(@Nullable dt dtVar) {
        this.f29480D.a(dtVar);
    }

    public final void a(@NotNull m71 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f29484H.a(reportParameterManager);
        this.f29509s.a(reportParameterManager);
        this.f29480D.a(reportParameterManager);
        this.f29483G.a(new h91(reportParameterManager, this.f29516z));
        this.f29511u.a(reportParameterManager);
        this.f29512v.a(reportParameterManager);
        this.f29513w.a(reportParameterManager);
        this.f29514x.a(reportParameterManager);
    }
}
