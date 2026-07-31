package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class sm2 implements tt {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final RewardedAdEventListener f31865a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            RewardedAdEventListener rewardedAdEventListener = sm2.this.f31865a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onAdClicked();
            }
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            RewardedAdEventListener rewardedAdEventListener = sm2.this.f31865a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onAdDismissed();
            }
            return Unit.f41027a;
        }
    }

    static final class c extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ yk2 f31869c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(yk2 yk2Var) {
            super(0);
            this.f31869c = yk2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            RewardedAdEventListener rewardedAdEventListener = sm2.this.f31865a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onAdFailedToShow(this.f31869c);
            }
            return Unit.f41027a;
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ol2 f31871c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ol2 ol2Var) {
            super(0);
            this.f31871c = ol2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            RewardedAdEventListener rewardedAdEventListener = sm2.this.f31865a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onAdImpression(this.f31871c);
            }
            return Unit.f41027a;
        }
    }

    static final class e extends kotlin.jvm.internal.s implements Function0<Unit> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            RewardedAdEventListener rewardedAdEventListener = sm2.this.f31865a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onAdShown();
            }
            return Unit.f41027a;
        }
    }

    static final class f extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ qm2 f31874c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(qm2 qm2Var) {
            super(0);
            this.f31874c = qm2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            RewardedAdEventListener rewardedAdEventListener = sm2.this.f31865a;
            if (rewardedAdEventListener != null) {
                rewardedAdEventListener.onRewarded(this.f31874c);
            }
            return Unit.f41027a;
        }
    }

    public sm2(@Nullable RewardedAdEventListener rewardedAdEventListener) {
        this.f31865a = rewardedAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.tt
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new a());
    }

    @Override // com.yandex.mobile.ads.impl.tt
    public final void onAdDismissed() {
        new CallbackStackTraceMarker(new b());
    }

    @Override // com.yandex.mobile.ads.impl.tt
    public final void onAdShown() {
        new CallbackStackTraceMarker(new e());
    }

    @Override // com.yandex.mobile.ads.impl.tt
    public final void a(@NotNull zx1 adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        new CallbackStackTraceMarker(new c(new yk2(adError.a())));
    }

    @Override // com.yandex.mobile.ads.impl.tt
    public final void a(@Nullable C1795a4 c1795a4) {
        new CallbackStackTraceMarker(new d(c1795a4 != null ? new ol2(c1795a4) : null));
    }

    @Override // com.yandex.mobile.ads.impl.tt
    public final void a(@NotNull or1 reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        new CallbackStackTraceMarker(new f(new qm2(reward)));
    }
}
