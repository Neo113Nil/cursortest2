package com.ironsource;

import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.C1511m3;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.yu;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
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
public final class pq implements cm, bd {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final RewardedAdRequest f18712a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final dm f18713b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC1564t0<RewardedAd> f18714c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC1506l5 f18715d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final wn f18716e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC1541q3 f18717f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC1439c1<RewardedAd> f18718g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final yu.c f18719h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Executor f18720i;

    /* renamed from: j, reason: collision with root package name */
    private ib f18721j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private yu f18722k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private C1587w4 f18723l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f18724m;

    @Metadata
    public static final class a implements yu.a {
        a() {
        }

        @Override // com.ironsource.yu.a
        public void a() {
            pq.this.a(wb.f20181a.s());
        }
    }

    public pq(@NotNull RewardedAdRequest adRequest, @NotNull dm loadTaskConfig, @NotNull InterfaceC1564t0<RewardedAd> adLoadTaskListener, @NotNull InterfaceC1506l5 auctionResponseFetcher, @NotNull wn networkLoadApi, @NotNull InterfaceC1541q3 analytics, @NotNull InterfaceC1439c1<RewardedAd> adObjectFactory, @NotNull yu.c timerFactory, @NotNull Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adObjectFactory, "adObjectFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.f18712a = adRequest;
        this.f18713b = loadTaskConfig;
        this.f18714c = adLoadTaskListener;
        this.f18715d = auctionResponseFetcher;
        this.f18716e = networkLoadApi;
        this.f18717f = analytics;
        this.f18718g = adObjectFactory;
        this.f18719h = timerFactory;
        this.f18720i = taskFinishedExecutor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> a4 = qc.f18818a.a(bundle);
        for (String str : a4.keySet()) {
            String valueOf = String.valueOf(a4.get(str));
            InterfaceC1490j3.c.f16799a.a(new C1511m3.l(str + cc.f15727T + valueOf)).a(this.f18717f);
        }
    }

    @Override // com.ironsource.cm
    public void start() {
        this.f18721j = new ib();
        this.f18717f.a(new C1511m3.s(this.f18713b.f()), new C1511m3.n(this.f18713b.g().b()), new C1511m3.b(this.f18712a.getAdId$mediationsdk_release()));
        InterfaceC1490j3.c.f16799a.a().a(this.f18717f);
        a(this.f18712a.getExtraParams());
        long h4 = this.f18713b.h();
        yu.c cVar = this.f18719h;
        yu.b bVar = new yu.b();
        bVar.b(h4);
        Unit unit = Unit.f41027a;
        yu a4 = cVar.a(bVar);
        this.f18722k = a4;
        if (a4 != null) {
            a4.a(new a());
        }
        Object a5 = this.f18715d.a();
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
        InterfaceC1541q3 interfaceC1541q3 = this.f18717f;
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
        xi g4 = this.f18713b.g();
        ad adVar = new ad();
        adVar.a(this);
        sj adInstance = new tj(this.f18712a.getProviderName$mediationsdk_release().value(), adVar).a(g4.b(xi.Bidder)).b(this.f18713b.i()).c().a(this.f18712a.getAdId$mediationsdk_release()).a(MapsKt.plus(new pn().a(), qc.f18818a.a(this.f18712a.getExtraParams()))).a();
        InterfaceC1541q3 interfaceC1541q32 = this.f18717f;
        String e4 = adInstance.e();
        Intrinsics.checkNotNullExpressionValue(e4, "adInstance.id");
        interfaceC1541q32.a(new C1511m3.b(e4));
        yn ynVar = new yn(c1485i5, this.f18713b.j());
        this.f18723l = new C1587w4(new wi(this.f18712a.getInstanceId(), g4.b(), c1485i5.a()), new com.ironsource.mediationsdk.d(), c1485i5.c());
        InterfaceC1490j3.d.f16808a.c().a(this.f18717f);
        wn wnVar = this.f18716e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        wnVar.a(adInstance, ynVar);
    }

    public /* synthetic */ pq(RewardedAdRequest rewardedAdRequest, dm dmVar, InterfaceC1564t0 interfaceC1564t0, InterfaceC1506l5 interfaceC1506l5, wn wnVar, InterfaceC1541q3 interfaceC1541q3, InterfaceC1439c1 interfaceC1439c1, yu.c cVar, Executor executor, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(rewardedAdRequest, dmVar, interfaceC1564t0, interfaceC1506l5, wnVar, interfaceC1541q3, interfaceC1439c1, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new yu.d() : cVar, (i4 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? ig.f16710a.c() : executor);
    }

    public final void a(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f18720i.execute(new Runnable() { // from class: com.ironsource.X2
            @Override // java.lang.Runnable
            public final void run() {
                pq.a(pq.this, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(pq this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.f18724m) {
            return;
        }
        this$0.f18724m = true;
        yu yuVar = this$0.f18722k;
        if (yuVar != null) {
            yuVar.cancel();
        }
        InterfaceC1490j3.c.a aVar = InterfaceC1490j3.c.f16799a;
        C1511m3.j jVar = new C1511m3.j(error.getErrorCode());
        C1511m3.k kVar = new C1511m3.k(error.getErrorMessage());
        ib ibVar = this$0.f18721j;
        if (ibVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            ibVar = null;
        }
        aVar.a(jVar, kVar, new C1511m3.f(ib.a(ibVar))).a(this$0.f18717f);
        C1587w4 c1587w4 = this$0.f18723l;
        if (c1587w4 != null) {
            c1587w4.a("onAdInstanceLoadFail");
        }
        this$0.f18714c.onAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(pq this$0, sj adInstance) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        if (this$0.f18724m) {
            return;
        }
        this$0.f18724m = true;
        yu yuVar = this$0.f18722k;
        if (yuVar != null) {
            yuVar.cancel();
        }
        ib ibVar = this$0.f18721j;
        if (ibVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            ibVar = null;
        }
        InterfaceC1490j3.c.f16799a.a(new C1511m3.f(ib.a(ibVar))).a(this$0.f18717f);
        C1587w4 c1587w4 = this$0.f18723l;
        if (c1587w4 != null) {
            c1587w4.b("onAdInstanceLoadSuccess");
        }
        InterfaceC1439c1<RewardedAd> interfaceC1439c1 = this$0.f18718g;
        C1587w4 c1587w42 = this$0.f18723l;
        Intrinsics.checkNotNull(c1587w42);
        this$0.f18714c.a(interfaceC1439c1.a(adInstance, c1587w42));
    }

    @Override // com.ironsource.bd
    public void a(@NotNull final sj adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        this.f18720i.execute(new Runnable() { // from class: com.ironsource.Y2
            @Override // java.lang.Runnable
            public final void run() {
                pq.a(pq.this, adInstance);
            }
        });
    }

    @Override // com.ironsource.bd
    public void a(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a(wb.f20181a.c(description));
    }
}
