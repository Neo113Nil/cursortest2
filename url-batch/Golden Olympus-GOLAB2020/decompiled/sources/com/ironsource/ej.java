package com.ironsource;

import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.C1511m3;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.yu;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
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
public final class ej implements cm, bd {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterstitialAdRequest f16049a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final dm f16050b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC1564t0<InterstitialAd> f16051c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC1506l5 f16052d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final wn f16053e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC1541q3 f16054f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC1439c1<InterstitialAd> f16055g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final yu.c f16056h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Executor f16057i;

    /* renamed from: j, reason: collision with root package name */
    private ib f16058j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private yu f16059k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private C1587w4 f16060l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16061m;

    @Metadata
    public static final class a implements yu.a {
        a() {
        }

        @Override // com.ironsource.yu.a
        public void a() {
            ej.this.a(wb.f20181a.s());
        }
    }

    public ej(@NotNull InterstitialAdRequest adRequest, @NotNull dm loadTaskConfig, @NotNull InterfaceC1564t0<InterstitialAd> adLoadTaskListener, @NotNull InterfaceC1506l5 auctionResponseFetcher, @NotNull wn networkLoadApi, @NotNull InterfaceC1541q3 analytics, @NotNull InterfaceC1439c1<InterstitialAd> adObjectFactory, @NotNull yu.c timerFactory, @NotNull Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adObjectFactory, "adObjectFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.f16049a = adRequest;
        this.f16050b = loadTaskConfig;
        this.f16051c = adLoadTaskListener;
        this.f16052d = auctionResponseFetcher;
        this.f16053e = networkLoadApi;
        this.f16054f = analytics;
        this.f16055g = adObjectFactory;
        this.f16056h = timerFactory;
        this.f16057i = taskFinishedExecutor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> a4 = qc.f18818a.a(bundle);
        for (String str : a4.keySet()) {
            String valueOf = String.valueOf(a4.get(str));
            InterfaceC1490j3.c.f16799a.a(new C1511m3.l(str + cc.f15727T + valueOf)).a(this.f16054f);
        }
    }

    @Override // com.ironsource.cm
    public void start() {
        this.f16058j = new ib();
        this.f16054f.a(new C1511m3.s(this.f16050b.f()), new C1511m3.n(this.f16050b.g().b()), new C1511m3.b(this.f16049a.getAdId$mediationsdk_release()));
        InterfaceC1490j3.c.f16799a.a().a(this.f16054f);
        a(this.f16049a.getExtraParams());
        long h4 = this.f16050b.h();
        yu.c cVar = this.f16056h;
        yu.b bVar = new yu.b();
        bVar.b(h4);
        Unit unit = Unit.f41027a;
        yu a4 = cVar.a(bVar);
        this.f16059k = a4;
        if (a4 != null) {
            a4.a(new a());
        }
        Object a5 = this.f16052d.a();
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
        InterfaceC1541q3 interfaceC1541q3 = this.f16054f;
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
        xi g4 = this.f16050b.g();
        ad adVar = new ad();
        adVar.a(this);
        sj adInstance = new tj(this.f16049a.getProviderName$mediationsdk_release().value(), adVar).a(g4.b(xi.Bidder)).b(this.f16050b.i()).a(this.f16049a.getAdId$mediationsdk_release()).a(MapsKt.plus(new pn().a(), qc.f18818a.a(this.f16049a.getExtraParams()))).a();
        InterfaceC1541q3 interfaceC1541q32 = this.f16054f;
        String e4 = adInstance.e();
        Intrinsics.checkNotNullExpressionValue(e4, "adInstance.id");
        interfaceC1541q32.a(new C1511m3.b(e4));
        yn ynVar = new yn(c1485i5, this.f16050b.j());
        this.f16060l = new C1587w4(new wi(this.f16049a.getInstanceId(), g4.b(), c1485i5.a()), new com.ironsource.mediationsdk.d(), c1485i5.c());
        InterfaceC1490j3.d.f16808a.c().a(this.f16054f);
        wn wnVar = this.f16053e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        wnVar.a(adInstance, ynVar);
    }

    public /* synthetic */ ej(InterstitialAdRequest interstitialAdRequest, dm dmVar, InterfaceC1564t0 interfaceC1564t0, InterfaceC1506l5 interfaceC1506l5, wn wnVar, InterfaceC1541q3 interfaceC1541q3, InterfaceC1439c1 interfaceC1439c1, yu.c cVar, Executor executor, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(interstitialAdRequest, dmVar, interfaceC1564t0, interfaceC1506l5, wnVar, interfaceC1541q3, interfaceC1439c1, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new yu.d() : cVar, (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? ig.f16710a.c() : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ej this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.f16061m) {
            return;
        }
        this$0.f16061m = true;
        yu yuVar = this$0.f16059k;
        if (yuVar != null) {
            yuVar.cancel();
        }
        InterfaceC1490j3.c.a aVar = InterfaceC1490j3.c.f16799a;
        C1511m3.j jVar = new C1511m3.j(error.getErrorCode());
        C1511m3.k kVar = new C1511m3.k(error.getErrorMessage());
        ib ibVar = this$0.f16058j;
        if (ibVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            ibVar = null;
        }
        aVar.a(jVar, kVar, new C1511m3.f(ib.a(ibVar))).a(this$0.f16054f);
        C1587w4 c1587w4 = this$0.f16060l;
        if (c1587w4 != null) {
            c1587w4.a("onAdInstanceDidFailToLoad");
        }
        this$0.f16051c.onAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ej this$0, sj adInstance) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        if (this$0.f16061m) {
            return;
        }
        this$0.f16061m = true;
        yu yuVar = this$0.f16059k;
        if (yuVar != null) {
            yuVar.cancel();
        }
        ib ibVar = this$0.f16058j;
        if (ibVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            ibVar = null;
        }
        InterfaceC1490j3.c.f16799a.a(new C1511m3.f(ib.a(ibVar))).a(this$0.f16054f);
        C1587w4 c1587w4 = this$0.f16060l;
        if (c1587w4 != null) {
            c1587w4.b("onAdInstanceDidLoad");
        }
        InterfaceC1439c1<InterstitialAd> interfaceC1439c1 = this$0.f16055g;
        C1587w4 c1587w42 = this$0.f16060l;
        Intrinsics.checkNotNull(c1587w42);
        this$0.f16051c.a(interfaceC1439c1.a(adInstance, c1587w42));
    }

    public final void a(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f16057i.execute(new Runnable() { // from class: com.ironsource.U
            @Override // java.lang.Runnable
            public final void run() {
                ej.a(ej.this, error);
            }
        });
    }

    @Override // com.ironsource.bd
    public void a(@NotNull final sj adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        this.f16057i.execute(new Runnable() { // from class: com.ironsource.V
            @Override // java.lang.Runnable
            public final void run() {
                ej.a(ej.this, adInstance);
            }
        });
    }

    @Override // com.ironsource.bd
    public void a(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a(wb.f20181a.c(description));
    }
}
