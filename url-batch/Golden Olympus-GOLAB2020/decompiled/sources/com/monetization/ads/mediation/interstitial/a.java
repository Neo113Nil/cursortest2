package com.monetization.ads.mediation.interstitial;

import android.content.Context;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import com.yandex.mobile.ads.impl.C1866d3;
import com.yandex.mobile.ads.impl.C1873da;
import com.yandex.mobile.ads.impl.C2221s6;
import com.yandex.mobile.ads.impl.ao1;
import com.yandex.mobile.ads.impl.ap0;
import com.yandex.mobile.ads.impl.bo1;
import com.yandex.mobile.ads.impl.bx0;
import com.yandex.mobile.ads.impl.od0;
import com.yandex.mobile.ads.impl.wj0;
import com.yandex.mobile.ads.impl.yc0;
import com.yandex.mobile.ads.impl.yw0;
import com.yandex.mobile.ads.impl.zw0;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.v;
import m2.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class a<T extends od0<T>> implements MediatedInterstitialAdapter.MediatedInterstitialAdapterListener {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ h[] f20770e = {H.d(new v(a.class, "contentController", "getContentController()Lcom/monetization/ads/fullscreen/FullscreenContentController;", 0)), C1873da.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zw0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> f20771a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final wj0 f20772b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ao1 f20773c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ao1 f20774d;

    /* renamed from: com.monetization.ads.mediation.interstitial.a$a, reason: collision with other inner class name */
    static final class C0172a extends s implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<T> f20775b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0172a(a<T> aVar) {
            super(0);
            this.f20775b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            a.a(this.f20775b);
            return Unit.f41027a;
        }
    }

    static final class b extends s implements Function1<String, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<T> f20776b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a<T> aVar) {
            super(1);
            this.f20776b = aVar;
        }

        public final void a(@NotNull String errorDescription) {
            Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
            this.f20776b.onInterstitialFailedToLoad(new MediatedAdRequestError(1, "Ad is blocked by quality verification with reasons:  " + errorDescription));
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f41027a;
        }
    }

    public /* synthetic */ a(yc0 yc0Var, zw0 zw0Var) {
        this(yc0Var, zw0Var, new wj0(zw0Var));
    }

    public final void a(@Nullable od0<T> od0Var) {
        this.f20773c.setValue(this, f20770e[0], od0Var);
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onAdImpression() {
        od0 od0Var;
        if (this.f20771a.b() || (od0Var = (od0) this.f20773c.getValue(this, f20770e[0])) == null) {
            return;
        }
        this.f20771a.b(od0Var.e(), MapsKt.emptyMap());
        od0Var.a(this.f20772b.a());
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialClicked() {
        C2221s6 i4;
        ao1 ao1Var = this.f20773c;
        h[] hVarArr = f20770e;
        od0 od0Var = (od0) ao1Var.getValue(this, hVarArr[0]);
        if (od0Var != null) {
            Context e4 = od0Var.e();
            yc0 yc0Var = (yc0) this.f20774d.getValue(this, hVarArr[1]);
            if (yc0Var != null && (i4 = yc0Var.i()) != null) {
                i4.a();
            }
            this.f20771a.a(e4, MapsKt.emptyMap());
        }
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialDismissed() {
        C2221s6 i4;
        ao1 ao1Var = this.f20773c;
        h[] hVarArr = f20770e;
        od0 od0Var = (od0) ao1Var.getValue(this, hVarArr[0]);
        if (od0Var != null) {
            od0Var.p();
        }
        yc0 yc0Var = (yc0) this.f20774d.getValue(this, hVarArr[1]);
        if (yc0Var == null || (i4 = yc0Var.i()) == null) {
            return;
        }
        i4.b();
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialFailedToLoad(@NotNull MediatedAdRequestError adRequestError) {
        Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
        yc0 yc0Var = (yc0) this.f20774d.getValue(this, f20770e[1]);
        if (yc0Var != null) {
            this.f20771a.b(yc0Var.k(), new C1866d3(adRequestError.getCode(), adRequestError.getDescription(), adRequestError.getDescription(), null), this);
        }
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialLeftApplication() {
        od0 od0Var = (od0) this.f20773c.getValue(this, f20770e[0]);
        if (od0Var != null) {
            od0Var.onLeftApplication();
        }
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialLoaded() {
        bx0 a4;
        ao1 ao1Var = this.f20774d;
        h[] hVarArr = f20770e;
        yc0 yc0Var = (yc0) ao1Var.getValue(this, hVarArr[1]);
        if (yc0Var != null) {
            yw0<MediatedInterstitialAdapter> a5 = this.f20771a.a();
            MediatedAdObject a6 = (a5 == null || (a4 = a5.a()) == null) ? null : a4.a();
            if (a6 != null) {
                yc0Var.a(a6.getAd(), a6.getInfo(), new C0172a(this), new b(this));
                return;
            }
            ap0.a(new Object[0]);
            yc0 yc0Var2 = (yc0) this.f20774d.getValue(this, hVarArr[1]);
            if (yc0Var2 != null) {
                this.f20771a.c(yc0Var2.k(), MapsKt.emptyMap());
                yc0Var2.t();
            }
        }
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialShown() {
        od0 od0Var;
        ao1 ao1Var = this.f20773c;
        h[] hVarArr = f20770e;
        od0 od0Var2 = (od0) ao1Var.getValue(this, hVarArr[0]);
        if (od0Var2 != null) {
            od0Var2.q();
            this.f20771a.c(od0Var2.e());
        }
        if (!this.f20771a.b() || (od0Var = (od0) this.f20773c.getValue(this, hVarArr[0])) == null) {
            return;
        }
        this.f20771a.b(od0Var.e(), MapsKt.emptyMap());
        od0Var.a(this.f20772b.a());
    }

    public static final void a(a aVar) {
        yc0 yc0Var = (yc0) aVar.f20774d.getValue(aVar, f20770e[1]);
        if (yc0Var != null) {
            aVar.f20771a.c(yc0Var.k(), MapsKt.emptyMap());
            yc0Var.t();
        }
    }

    public a(@NotNull yc0<T> loadController, @NotNull zw0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> mediatedAdController, @NotNull wj0 impressionDataProvider) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        Intrinsics.checkNotNullParameter(mediatedAdController, "mediatedAdController");
        Intrinsics.checkNotNullParameter(impressionDataProvider, "impressionDataProvider");
        this.f20771a = mediatedAdController;
        this.f20772b = impressionDataProvider;
        this.f20773c = bo1.a(null);
        this.f20774d = bo1.a(loadController);
    }
}
