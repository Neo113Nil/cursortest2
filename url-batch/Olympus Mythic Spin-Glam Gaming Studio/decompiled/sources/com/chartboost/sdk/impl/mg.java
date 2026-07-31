package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.RewardEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class mg extends l2 {
    public final RewardedCallback q;
    public final l r;

    public static final class b implements RewardedCallback, AdCallback {
        public final /* synthetic */ AdCallback a;

        public b() {
            this.a = mg.this.j();
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(ClickEvent event, ClickError clickError) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.a.onAdClicked(event, clickError);
        }

        @Override // com.chartboost.sdk.callbacks.DismissibleAdCallback
        public void onAdDismiss(DismissEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            ((RewardedCallback) mg.this.l()).onAdDismiss(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdExpired(ExpirationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.a.onAdExpired(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdLoaded(CacheEvent event, CacheError cacheError) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.a.onAdLoaded(event, cacheError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdRequestedToShow(ShowEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.a.onAdRequestedToShow(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdShown(ShowEvent event, ShowError showError) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.a.onAdShown(event, showError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onImpressionRecorded(ImpressionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.a.onImpressionRecorded(event);
        }

        @Override // com.chartboost.sdk.callbacks.RewardedCallback
        public void onRewardEarned(RewardEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            xb.a("Forwarding onRewardEarned: location=" + ((Rewarded) mg.this.e()).getLocation() + ", auctionId=" + event.getAdID(), (Throwable) null, 2, (Object) null);
            ((RewardedCallback) mg.this.l()).onRewardEarned(event);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(lg api, RewardedCallback callback, Rewarded rewarded, h6 dependencyContainer) {
        super(rewarded, api, callback, dependencyContainer, new j(u.d, null, 2, null), null, 32, null);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        this.q = new b();
        this.r = a((DismissibleAdCallback) l(), new a());
    }

    @Override // com.chartboost.sdk.impl.l2
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public RewardedCallback i() {
        return this.q;
    }

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            RewardedCallback rewardedCallback = (RewardedCallback) mg.this.l();
            vb f = mg.this.g().f();
            rewardedCallback.onRewardEarned(new RewardEvent(f != null ? f.b() : null, mg.this.e(), 0));
        }
    }

    @Override // com.chartboost.sdk.impl.l2
    public l f() {
        return this.r;
    }

    @Override // com.chartboost.sdk.impl.l2
    public void a(String str) {
        ((lg) h()).a((Rewarded) e(), i(), str);
    }

    @Override // com.chartboost.sdk.impl.l2
    public Object b(Context context, Continuation continuation) {
        ((lg) h()).b((Rewarded) e(), i());
        return Result.m8023constructorimpl(null);
    }
}
