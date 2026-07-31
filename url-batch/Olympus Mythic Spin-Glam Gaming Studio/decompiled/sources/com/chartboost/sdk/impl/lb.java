package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes10.dex */
public final class lb extends l2 {
    public final InterstitialCallback q;
    public final l r;

    public static final class a implements InterstitialCallback, AdCallback {
        public final /* synthetic */ AdCallback a;

        public a() {
            this.a = lb.this.j();
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(ClickEvent event, ClickError clickError) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.a.onAdClicked(event, clickError);
        }

        @Override // com.chartboost.sdk.callbacks.DismissibleAdCallback
        public void onAdDismiss(DismissEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            ((InterstitialCallback) lb.this.l()).onAdDismiss(event);
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(kb api, InterstitialCallback callback, Interstitial interstitial, h6 dependencyContainer, CoroutineDispatcher ioDispatcher) {
        super(interstitial, api, callback, dependencyContainer, new j(u.c, null, 2, null), ioDispatcher);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.q = new a();
        this.r = l2.a(this, (DismissibleAdCallback) l(), (Function0) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.l2
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public InterstitialCallback i() {
        return this.q;
    }

    @Override // com.chartboost.sdk.impl.l2
    public l f() {
        return this.r;
    }

    @Override // com.chartboost.sdk.impl.l2
    public void a(String str) {
        ((kb) h()).a((Interstitial) e(), i(), str);
    }

    @Override // com.chartboost.sdk.impl.l2
    public Object b(Context context, Continuation continuation) {
        ((kb) h()).b((Interstitial) e(), i());
        return Result.m8023constructorimpl(null);
    }

    public /* synthetic */ lb(kb kbVar, InterstitialCallback interstitialCallback, Interstitial interstitial, h6 h6Var, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kbVar, interstitialCallback, interstitial, h6Var, (i & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
