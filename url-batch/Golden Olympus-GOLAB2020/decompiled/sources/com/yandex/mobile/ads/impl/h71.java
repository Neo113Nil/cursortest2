package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.ironsource.b9;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdAssets;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;
import com.yandex.mobile.ads.impl.dx0;
import com.yandex.mobile.ads.impl.ip1;
import com.yandex.mobile.ads.impl.ix0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h71 implements MediatedNativeAdapterListener {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f26633o = {C1873da.a(h71.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<n61> f26634a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zw0<MediatedNativeAdapter, MediatedNativeAdapterListener> f26635b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ex0 f26636c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final yx0 f26637d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final wj0 f26638e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f26639f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ao1 f26640g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f26641h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f26642i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ri0 f26643j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final xx0 f26644k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final ix0 f26645l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final hy0 f26646m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f26647n;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediatedNativeAd f26649c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ zq1 f26650d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MediatedNativeAd mediatedNativeAd, zq1 zq1Var) {
            super(0);
            this.f26649c = mediatedNativeAd;
            this.f26650d = zq1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            h71.this.a(this.f26649c, this.f26650d);
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1<String, Unit> {
        b() {
            super(1);
        }

        public final void a(@NotNull String errorDescription) {
            Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
            h71.this.onAdFailedToLoad(new MediatedAdRequestError(1, "Ad is blocked by quality verification with reasons:  " + errorDescription));
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f41027a;
        }
    }

    public /* synthetic */ h71(C2360y7 c2360y7, v51 v51Var, zw0 zw0Var) {
        this(c2360y7, v51Var, zw0Var, new ex0(), new yx0(), new wj0(zw0Var));
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdClicked() {
        C2221s6 i4;
        v51 v51Var = (v51) this.f26640g.getValue(this, f26633o[0]);
        if (v51Var != null && (i4 = v51Var.i()) != null) {
            i4.a();
        }
        zw0<MediatedNativeAdapter, MediatedNativeAdapterListener> zw0Var = this.f26635b;
        Context applicationContext = this.f26639f;
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        zw0Var.a(applicationContext, this.f26641h);
        Context applicationContext2 = this.f26639f;
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
        ip1.b bVar = ip1.b.f27315C;
        jp1 jp1Var = new jp1(this.f26641h, 2);
        jp1Var.b(bVar.a(), "event_type");
        jp1Var.b(this.f26642i, "ad_info");
        jp1Var.a(this.f26634a.b());
        Map<String, Object> s4 = this.f26634a.s();
        if (s4 != null) {
            jp1Var.a((Map<String, ? extends Object>) s4);
        }
        this.f26635b.d(applicationContext2, jp1Var.b());
        this.f26636c.a();
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdClosed() {
        C2221s6 i4;
        this.f26636c.b();
        v51 v51Var = (v51) this.f26640g.getValue(this, f26633o[0]);
        if (v51Var == null || (i4 = v51Var.i()) == null) {
            return;
        }
        i4.b();
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdFailedToLoad(@NotNull MediatedAdRequestError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        v51 v51Var = (v51) this.f26640g.getValue(this, f26633o[0]);
        if (v51Var != null) {
            this.f26635b.b(v51Var.k(), new C1866d3(error.getCode(), error.getDescription(), error.getDescription(), null), this);
        }
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdImpression() {
        if (this.f26647n) {
            return;
        }
        this.f26647n = true;
        zw0<MediatedNativeAdapter, MediatedNativeAdapterListener> zw0Var = this.f26635b;
        Context applicationContext = this.f26639f;
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        zw0Var.b(applicationContext, this.f26641h);
        Context applicationContext2 = this.f26639f;
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
        ip1.b bVar = ip1.b.f27366y;
        jp1 jp1Var = new jp1(this.f26641h, 2);
        jp1Var.b(bVar.a(), "event_type");
        jp1Var.b(this.f26642i, "ad_info");
        jp1Var.a(this.f26634a.b());
        Map<String, Object> s4 = this.f26634a.s();
        if (s4 != null) {
            jp1Var.a((Map<String, ? extends Object>) s4);
        }
        this.f26635b.d(applicationContext2, jp1Var.b());
        this.f26636c.a(this.f26638e.a());
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdLeftApplication() {
        this.f26636c.c();
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdOpened() {
        this.f26636c.d();
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAppInstallAdLoaded(@NotNull MediatedNativeAd mediatedNativeAd) {
        Intrinsics.checkNotNullParameter(mediatedNativeAd, "mediatedNativeAd");
        b(mediatedNativeAd, zq1.f35749d);
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onContentAdLoaded(@NotNull MediatedNativeAd mediatedNativeAd) {
        Intrinsics.checkNotNullParameter(mediatedNativeAd, "mediatedNativeAd");
        b(mediatedNativeAd, zq1.f35748c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final MediatedNativeAd mediatedNativeAd, zq1 zq1Var) {
        final v51 v51Var = (v51) this.f26640g.getValue(this, f26633o[0]);
        if (v51Var != null) {
            this.f26641h.put("native_ad_type", zq1Var.a());
            this.f26635b.c(v51Var.k(), this.f26641h);
            this.f26642i.putAll(MapsKt.mapOf(TuplesKt.to(b9.h.f15436D0, mediatedNativeAd.getMediatedNativeAdAssets().getTitle())));
            this.f26637d.getClass();
            Intrinsics.checkNotNullParameter(mediatedNativeAd, "mediatedNativeAd");
            MediatedNativeAdAssets mediatedNativeAdAssets = mediatedNativeAd.getMediatedNativeAdAssets();
            List<MediatedNativeAdImage> listOfNotNull = CollectionsKt.listOfNotNull((Object[]) new MediatedNativeAdImage[]{mediatedNativeAdAssets.getFavicon(), mediatedNativeAdAssets.getIcon(), mediatedNativeAdAssets.getImage()});
            this.f26643j.a(this.f26644k.b(listOfNotNull));
            this.f26645l.a(mediatedNativeAd, zq1Var, listOfNotNull, new ix0.a() { // from class: com.yandex.mobile.ads.impl.C6
                @Override // com.yandex.mobile.ads.impl.ix0.a
                public final void a(C2360y7 c2360y7) {
                    h71.a(MediatedNativeAd.this, this, v51Var, c2360y7);
                }
            });
        }
    }

    private final void b(MediatedNativeAd mediatedNativeAd, zq1 zq1Var) {
        bx0 a4;
        v51 v51Var = (v51) this.f26640g.getValue(this, f26633o[0]);
        if (v51Var != null) {
            yw0<MediatedNativeAdapter> a5 = this.f26635b.a();
            MediatedAdObject a6 = (a5 == null || (a4 = a5.a()) == null) ? null : a4.a();
            if (a6 != null) {
                v51Var.a(a6.getAd(), a6.getInfo(), new a(mediatedNativeAd, zq1Var), new b());
            } else {
                ap0.a(new Object[0]);
                a(mediatedNativeAd, zq1Var);
            }
        }
    }

    public h71(@NotNull C2360y7<n61> adResponse, @NotNull v51 nativeAdLoadManager, @NotNull zw0<MediatedNativeAdapter, MediatedNativeAdapterListener> mediatedAdController, @NotNull ex0 nativeAdEventObservable, @NotNull yx0 mediatedImagesExtractor, @NotNull wj0 impressionDataProvider) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdLoadManager, "nativeAdLoadManager");
        Intrinsics.checkNotNullParameter(mediatedAdController, "mediatedAdController");
        Intrinsics.checkNotNullParameter(nativeAdEventObservable, "nativeAdEventObservable");
        Intrinsics.checkNotNullParameter(mediatedImagesExtractor, "mediatedImagesExtractor");
        Intrinsics.checkNotNullParameter(impressionDataProvider, "impressionDataProvider");
        this.f26634a = adResponse;
        this.f26635b = mediatedAdController;
        this.f26636c = nativeAdEventObservable;
        this.f26637d = mediatedImagesExtractor;
        this.f26638e = impressionDataProvider;
        Context applicationContext = nativeAdLoadManager.k().getApplicationContext();
        this.f26639f = applicationContext;
        this.f26640g = bo1.a(nativeAdLoadManager);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f26641h = linkedHashMap;
        this.f26642i = new LinkedHashMap();
        ri0 ri0Var = new ri0(nativeAdLoadManager.k());
        this.f26643j = ri0Var;
        xx0 xx0Var = new xx0(nativeAdLoadManager.k());
        this.f26644k = xx0Var;
        this.f26645l = new ix0(nativeAdLoadManager.k(), ri0Var, xx0Var);
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        this.f26646m = new hy0(applicationContext, mediatedAdController, linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MediatedNativeAd mediatedNativeAd, final h71 this$0, v51 v51Var, C2360y7 convertedAdResponse) {
        Intrinsics.checkNotNullParameter(mediatedNativeAd, "$mediatedNativeAd");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(convertedAdResponse, "convertedAdResponse");
        py0 py0Var = new py0(mediatedNativeAd, this$0.f26646m, v51Var.i(), new qw1());
        v51Var.a((C2360y7<n61>) convertedAdResponse, new h51(new fx0(this$0.f26634a, this$0.f26635b.a()), new dx0(new dx0.a() { // from class: com.yandex.mobile.ads.impl.D6
            @Override // com.yandex.mobile.ads.impl.dx0.a
            public final void a(e51 e51Var) {
                h71.a(h71.this, e51Var);
            }
        }), py0Var, new by0(), new oy0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(h71 this$0, e51 controller) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this$0.f26636c.a(controller);
    }
}
