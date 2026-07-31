package com.monetization.ads.mediation.banner;

import android.content.Context;
import android.view.View;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import com.monetization.ads.mediation.banner.d;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import com.yandex.mobile.ads.impl.C1866d3;
import com.yandex.mobile.ads.impl.C1873da;
import com.yandex.mobile.ads.impl.C1977hi;
import com.yandex.mobile.ads.impl.ao1;
import com.yandex.mobile.ads.impl.ap0;
import com.yandex.mobile.ads.impl.bo1;
import com.yandex.mobile.ads.impl.bx0;
import com.yandex.mobile.ads.impl.wj0;
import com.yandex.mobile.ads.impl.yw0;
import com.yandex.mobile.ads.impl.zw0;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m2.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class a implements MediatedBannerAdapter.MediatedBannerAdapterListener {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ h[] f20711f = {C1873da.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/banner/BannerAdLoadController;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zw0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> f20712a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f20713b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final wj0 f20714c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ao1 f20715d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20716e;

    /* renamed from: com.monetization.ads.mediation.banner.a$a, reason: collision with other inner class name */
    private final class C0170a implements d.a {
        public C0170a() {
        }

        @Override // com.monetization.ads.mediation.banner.d.a
        public final void a() {
            C1977hi a4 = a.this.a();
            if (a4 != null) {
                a.this.f20712a.c(a4.k());
            }
            if (a.this.f20712a.b()) {
                a.c(a.this);
            }
        }
    }

    static final class b extends s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f20719c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.f20719c = view;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            a.this.a(this.f20719c);
            return Unit.f41027a;
        }
    }

    static final class c extends s implements Function1<String, Unit> {
        c() {
            super(1);
        }

        public final void a(@NotNull String errorDescription) {
            Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
            a.this.onAdFailedToLoad(new MediatedAdRequestError(1, "Ad is blocked by quality verification with reasons:  " + errorDescription));
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f41027a;
        }
    }

    public /* synthetic */ a(C1977hi c1977hi, zw0 zw0Var, d dVar) {
        this(c1977hi, zw0Var, dVar, new wj0(zw0Var));
    }

    public static final void c(a aVar) {
        C1977hi a4 = aVar.a();
        if (a4 != null) {
            aVar.f20712a.b(a4.k(), MapsKt.emptyMap());
            a4.a(aVar.f20714c.a());
        }
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdClicked() {
        C1977hi a4 = a();
        if (a4 != null) {
            a4.i().a();
            this.f20712a.a(a4.k(), MapsKt.emptyMap());
        }
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdFailedToLoad(@NotNull MediatedAdRequestError adRequestError) {
        Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
        C1977hi a4 = a();
        if (a4 != null) {
            Context k4 = a4.k();
            C1866d3 c1866d3 = new C1866d3(adRequestError.getCode(), adRequestError.getDescription(), adRequestError.getDescription(), null);
            if (this.f20716e) {
                this.f20712a.a(k4, c1866d3, this);
            } else {
                this.f20712a.b(k4, c1866d3, this);
            }
        }
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdImpression() {
        C1977hi a4;
        if (this.f20712a.b() || (a4 = a()) == null) {
            return;
        }
        this.f20712a.b(a4.k(), MapsKt.emptyMap());
        a4.a(this.f20714c.a());
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdLeftApplication() {
        C1977hi a4 = a();
        if (a4 != null) {
            a4.onLeftApplication();
        }
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdLoaded(@NotNull View view) {
        bx0 a4;
        Intrinsics.checkNotNullParameter(view, "view");
        C1977hi a5 = a();
        if (a5 != null) {
            yw0<MediatedBannerAdapter> a6 = this.f20712a.a();
            MediatedAdObject a7 = (a6 == null || (a4 = a6.a()) == null) ? null : a4.a();
            if (a7 != null) {
                a5.a(a7.getAd(), a7.getInfo(), new b(view), new c());
            } else {
                ap0.a(new Object[0]);
                a(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1977hi a() {
        return (C1977hi) this.f20715d.getValue(this, f20711f[0]);
    }

    public a(@NotNull C1977hi loadController, @NotNull zw0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> mediatedAdController, @NotNull d mediatedContentViewPublisher, @NotNull wj0 impressionDataProvider) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        Intrinsics.checkNotNullParameter(mediatedAdController, "mediatedAdController");
        Intrinsics.checkNotNullParameter(mediatedContentViewPublisher, "mediatedContentViewPublisher");
        Intrinsics.checkNotNullParameter(impressionDataProvider, "impressionDataProvider");
        this.f20712a = mediatedAdController;
        this.f20713b = mediatedContentViewPublisher;
        this.f20714c = impressionDataProvider;
        this.f20715d = bo1.a(loadController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(View view) {
        C1977hi a4 = a();
        if (a4 != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!this.f20716e) {
                this.f20716e = true;
                this.f20712a.c(context, MapsKt.emptyMap());
            } else {
                this.f20712a.b(context);
            }
            C0170a c0170a = new C0170a();
            a4.i().c();
            this.f20713b.a(view, c0170a);
            a4.t();
        }
    }
}
