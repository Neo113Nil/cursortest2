package com.ironsource;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.C1511m3;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.yu;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class c7 implements cm, a6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final BannerAdRequest f15677a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AdSize f15678b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC1506l5 f15679c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final dm f15680d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final wn f15681e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC1541q3 f15682f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC1564t0<BannerAdView> f15683g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final d6 f15684h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final yu.c f15685i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Executor f15686j;

    /* renamed from: k, reason: collision with root package name */
    private ib f15687k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private yu f15688l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private C1587w4 f15689m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f15690n;

    @Metadata
    public static final class a implements yu.a {
        a() {
        }

        @Override // com.ironsource.yu.a
        public void a() {
            c7.this.a(wb.f20181a.s());
        }
    }

    public c7(@NotNull BannerAdRequest adRequest, @NotNull AdSize size, @NotNull InterfaceC1506l5 auctionResponseFetcher, @NotNull dm loadTaskConfig, @NotNull wn networkLoadApi, @NotNull InterfaceC1541q3 analytics, @NotNull InterfaceC1564t0<BannerAdView> adLoadTaskListener, @NotNull d6 adLayoutFactory, @NotNull yu.c timerFactory, @NotNull Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(adLayoutFactory, "adLayoutFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.f15677a = adRequest;
        this.f15678b = size;
        this.f15679c = auctionResponseFetcher;
        this.f15680d = loadTaskConfig;
        this.f15681e = networkLoadApi;
        this.f15682f = analytics;
        this.f15683g = adLoadTaskListener;
        this.f15684h = adLayoutFactory;
        this.f15685i = timerFactory;
        this.f15686j = taskFinishedExecutor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> a4 = qc.f18818a.a(bundle);
        for (String str : a4.keySet()) {
            String valueOf = String.valueOf(a4.get(str));
            InterfaceC1490j3.c.f16799a.a(new C1511m3.l(str + cc.f15727T + valueOf)).a(this.f15682f);
        }
    }

    @Override // com.ironsource.a6
    public void onBannerLoadFail(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a(wb.f20181a.c(description));
    }

    @Override // com.ironsource.a6
    public void onBannerLoadSuccess(@NotNull final sj adInstance, @NotNull final wg adContainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        this.f15686j.execute(new Runnable() { // from class: com.ironsource.K
            @Override // java.lang.Runnable
            public final void run() {
                c7.a(c7.this, adInstance, adContainer);
            }
        });
    }

    @Override // com.ironsource.cm
    public void start() {
        this.f15687k = new ib();
        this.f15682f.a(new C1511m3.s(this.f15680d.f()), new C1511m3.n(this.f15680d.g().b()), new C1511m3.c(this.f15678b), new C1511m3.b(this.f15677a.getAdId$mediationsdk_release()));
        InterfaceC1490j3.c.f16799a.a().a(this.f15682f);
        a(this.f15677a.getExtraParams());
        long h4 = this.f15680d.h();
        yu.c cVar = this.f15685i;
        yu.b bVar = new yu.b();
        bVar.b(h4);
        Unit unit = Unit.f41027a;
        yu a4 = cVar.a(bVar);
        this.f15688l = a4;
        if (a4 != null) {
            a4.a(new a());
        }
        Object a5 = this.f15679c.a();
        Throwable d4 = Result.d(a5);
        if (d4 != null) {
            Intrinsics.checkNotNull(d4, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException");
            a(((rg) d4).a());
            a5 = null;
        }
        C1485i5 c1485i5 = (C1485i5) a5;
        if (c1485i5 == null) {
            return;
        }
        InterfaceC1541q3 interfaceC1541q3 = this.f15682f;
        String b4 = c1485i5.b();
        if (b4 != null) {
            interfaceC1541q3.a(new C1511m3.d(b4));
        }
        JSONObject f4 = c1485i5.f();
        if (f4 != null) {
            interfaceC1541q3.a(new C1511m3.m(f4));
        }
        String a6 = c1485i5.a();
        if (a6 != null) {
            interfaceC1541q3.a(new C1511m3.g(a6));
        }
        xi g4 = this.f15680d.g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        ug ugVar = new ug(AdapterUtils.dpToPixels(applicationContext, this.f15678b.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.f15678b.getHeight()), this.f15678b.getSizeDescription());
        lo loVar = new lo();
        loVar.a(this);
        sj adInstance = new tj(this.f15677a.getProviderName$mediationsdk_release().value(), loVar).a(g4.b(xi.Bidder)).a(ugVar).b(this.f15680d.i()).a(this.f15677a.getAdId$mediationsdk_release()).a(MapsKt.plus(new pn().a(), qc.f18818a.a(this.f15677a.getExtraParams()))).a();
        yn ynVar = new yn(c1485i5, this.f15680d.j());
        this.f15689m = new C1587w4(new wi(this.f15677a.getInstanceId(), g4.b(), c1485i5.a()), new com.ironsource.mediationsdk.d(), c1485i5.c());
        InterfaceC1490j3.d.f16808a.c().a(this.f15682f);
        wn wnVar = this.f15681e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        wnVar.a(adInstance, ynVar);
    }

    public /* synthetic */ c7(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC1506l5 interfaceC1506l5, dm dmVar, wn wnVar, InterfaceC1541q3 interfaceC1541q3, InterfaceC1564t0 interfaceC1564t0, d6 d6Var, yu.c cVar, Executor executor, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, adSize, interfaceC1506l5, dmVar, wnVar, interfaceC1541q3, interfaceC1564t0, d6Var, (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? new yu.d() : cVar, (i4 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? ig.f16710a.c() : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(c7 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.f15690n) {
            return;
        }
        this$0.f15690n = true;
        yu yuVar = this$0.f15688l;
        if (yuVar != null) {
            yuVar.cancel();
        }
        InterfaceC1490j3.c.a aVar = InterfaceC1490j3.c.f16799a;
        C1511m3.j jVar = new C1511m3.j(error.getErrorCode());
        C1511m3.k kVar = new C1511m3.k(error.getErrorMessage());
        ib ibVar = this$0.f15687k;
        if (ibVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            ibVar = null;
        }
        aVar.a(jVar, kVar, new C1511m3.f(ib.a(ibVar))).a(this$0.f15682f);
        C1587w4 c1587w4 = this$0.f15689m;
        if (c1587w4 != null) {
            c1587w4.a("onBannerLoadFail");
        }
        this$0.f15683g.onAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(c7 this$0, sj adInstance, wg adContainer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "$adContainer");
        if (this$0.f15690n) {
            return;
        }
        this$0.f15690n = true;
        yu yuVar = this$0.f15688l;
        if (yuVar != null) {
            yuVar.cancel();
        }
        ib ibVar = this$0.f15687k;
        if (ibVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            ibVar = null;
        }
        InterfaceC1490j3.c.f16799a.a(new C1511m3.f(ib.a(ibVar))).a(this$0.f15682f);
        C1587w4 c1587w4 = this$0.f15689m;
        if (c1587w4 != null) {
            c1587w4.b("onBannerLoadSuccess");
        }
        d6 d6Var = this$0.f15684h;
        C1587w4 c1587w42 = this$0.f15689m;
        Intrinsics.checkNotNull(c1587w42);
        this$0.f15683g.a(d6Var.a(adInstance, adContainer, c1587w42));
    }

    public final void a(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f15686j.execute(new Runnable() { // from class: com.ironsource.J
            @Override // java.lang.Runnable
            public final void run() {
                c7.a(c7.this, error);
            }
        });
    }
}
