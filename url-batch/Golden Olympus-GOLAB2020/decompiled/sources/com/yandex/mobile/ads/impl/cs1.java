package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import com.monetization.ads.mediation.rewarded.MediatedReward;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cs1 implements MediatedRewardedAdapterListener {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f24298e = {kotlin.jvm.internal.H.d(new kotlin.jvm.internal.v(cs1.class, "contentController", "getContentController()Lcom/monetization/ads/rewarded/content/RewardedAdContentController;", 0)), C1873da.a(cs1.class, "loadController", "getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zw0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> f24299a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final wj0 f24300b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ao1 f24301c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ao1 f24302d;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            cs1.a(cs1.this);
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function1<String, Unit> {
        b() {
            super(1);
        }

        public final void a(@NotNull String errorDescription) {
            Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
            cs1.this.onRewardedAdFailedToLoad(new MediatedAdRequestError(1, "Ad is blocked by quality verification with reasons:  " + errorDescription));
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.f41027a;
        }
    }

    public /* synthetic */ cs1(yc0 yc0Var, zw0 zw0Var) {
        this(yc0Var, zw0Var, new wj0(zw0Var));
    }

    public static final void a(cs1 cs1Var) {
        yc0 yc0Var = (yc0) cs1Var.f24302d.getValue(cs1Var, f24298e[1]);
        if (yc0Var != null) {
            cs1Var.f24299a.c(yc0Var.k(), MapsKt.emptyMap());
            yc0Var.t();
        }
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onAdImpression() {
        ur1 a4;
        if (this.f24299a.b() || (a4 = a()) == null) {
            return;
        }
        this.f24299a.b(a4.e(), MapsKt.emptyMap());
        a4.a(this.f24300b.a());
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewarded(@Nullable MediatedReward mediatedReward) {
        ur1 a4 = a();
        if (a4 != null) {
            this.f24299a.a(a4.e(), a4.d());
            a4.r();
        }
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdClicked() {
        C2221s6 i4;
        ur1 a4 = a();
        if (a4 != null) {
            Context e4 = a4.e();
            yc0 yc0Var = (yc0) this.f24302d.getValue(this, f24298e[1]);
            if (yc0Var != null && (i4 = yc0Var.i()) != null) {
                i4.a();
            }
            this.f24299a.a(e4, MapsKt.emptyMap());
        }
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdDismissed() {
        C2221s6 i4;
        ur1 a4 = a();
        if (a4 != null) {
            a4.p();
        }
        yc0 yc0Var = (yc0) this.f24302d.getValue(this, f24298e[1]);
        if (yc0Var == null || (i4 = yc0Var.i()) == null) {
            return;
        }
        i4.b();
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdFailedToLoad(@NotNull MediatedAdRequestError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        yc0 yc0Var = (yc0) this.f24302d.getValue(this, f24298e[1]);
        if (yc0Var != null) {
            this.f24299a.b(yc0Var.k(), new C1866d3(error.getCode(), error.getDescription(), error.getDescription(), null), this);
        }
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdLeftApplication() {
        ur1 a4 = a();
        if (a4 != null) {
            a4.onLeftApplication();
        }
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdLoaded() {
        bx0 a4;
        ao1 ao1Var = this.f24302d;
        m2.h[] hVarArr = f24298e;
        yc0 yc0Var = (yc0) ao1Var.getValue(this, hVarArr[1]);
        if (yc0Var != null) {
            yw0<MediatedRewardedAdapter> a5 = this.f24299a.a();
            MediatedAdObject a6 = (a5 == null || (a4 = a5.a()) == null) ? null : a4.a();
            if (a6 != null) {
                yc0Var.a(a6.getAd(), a6.getInfo(), new a(), new b());
                return;
            }
            ap0.a(new Object[0]);
            yc0 yc0Var2 = (yc0) this.f24302d.getValue(this, hVarArr[1]);
            if (yc0Var2 != null) {
                this.f24299a.c(yc0Var2.k(), MapsKt.emptyMap());
                yc0Var2.t();
            }
        }
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdShown() {
        ur1 a4;
        ur1 a5 = a();
        if (a5 != null) {
            a5.q();
            this.f24299a.c(a5.e());
        }
        if (!this.f24299a.b() || (a4 = a()) == null) {
            return;
        }
        this.f24299a.b(a4.e(), MapsKt.emptyMap());
        a4.a(this.f24300b.a());
    }

    public cs1(@NotNull yc0<ur1> loadController, @NotNull zw0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> mediatedAdController, @NotNull wj0 impressionDataProvider) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        Intrinsics.checkNotNullParameter(mediatedAdController, "mediatedAdController");
        Intrinsics.checkNotNullParameter(impressionDataProvider, "impressionDataProvider");
        this.f24299a = mediatedAdController;
        this.f24300b = impressionDataProvider;
        this.f24301c = bo1.a(null);
        this.f24302d = bo1.a(loadController);
    }

    @Nullable
    public final ur1 a() {
        return (ur1) this.f24301c.getValue(this, f24298e[0]);
    }

    public final void a(@Nullable ur1 ur1Var) {
        this.f24301c.setValue(this, f24298e[0], ur1Var);
    }
}
