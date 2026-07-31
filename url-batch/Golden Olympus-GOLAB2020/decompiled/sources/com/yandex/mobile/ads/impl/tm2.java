package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class tm2 implements ut {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final RewardedAdLoadListener f32507a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdRequestError f32509c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AdRequestError adRequestError) {
            super(0);
            this.f32509c = adRequestError;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            RewardedAdLoadListener rewardedAdLoadListener = tm2.this.f32507a;
            if (rewardedAdLoadListener != null) {
                rewardedAdLoadListener.onAdFailedToLoad(this.f32509c);
            }
            return Unit.f41027a;
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ rm2 f32511c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(rm2 rm2Var) {
            super(0);
            this.f32511c = rm2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            RewardedAdLoadListener rewardedAdLoadListener = tm2.this.f32507a;
            if (rewardedAdLoadListener != null) {
                rewardedAdLoadListener.onAdLoaded(this.f32511c);
            }
            return Unit.f41027a;
        }
    }

    public tm2(@Nullable RewardedAdLoadListener rewardedAdLoadListener) {
        this.f32507a = rewardedAdLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(error, "error");
        new CallbackStackTraceMarker(new a(new AdRequestError(error.b(), error.d(), error.a())));
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(@NotNull st rewarded) {
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        new CallbackStackTraceMarker(new b(new rm2(rewarded, new zk2())));
    }
}
