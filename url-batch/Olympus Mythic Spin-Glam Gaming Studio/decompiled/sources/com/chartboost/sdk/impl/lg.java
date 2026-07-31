package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.impl.si;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class lg extends com.chartboost.sdk.impl.d {
    public final yi l;

    public static final class a extends Lambda implements Function0 {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo4828invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(g0 adUnitLoader, o0 adUnitRenderer, yi uiPoster, AtomicReference sdkConfig, ScheduledExecutorService backgroundExecutorService, e adApiCallbackSender, zg session, i2 base64Wrapper, q7 eventTracker, Function0 androidVersion) {
        super(adUnitLoader, adUnitRenderer, sdkConfig, backgroundExecutorService, adApiCallbackSender, session, base64Wrapper, eventTracker, androidVersion);
        Intrinsics.checkNotNullParameter(adUnitLoader, "adUnitLoader");
        Intrinsics.checkNotNullParameter(adUnitRenderer, "adUnitRenderer");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(adApiCallbackSender, "adApiCallbackSender");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.l = uiPoster;
    }

    public final void a(Rewarded ad, RewardedCallback callback) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a(ad, callback, (String) null);
    }

    public final void b(Rewarded ad, RewardedCallback callback) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (g(ad.getLocation())) {
            this.l.a(new c(callback, ad));
            a(si.i.e, "Invalid configuration. Check logs for more details.", c0.c.g, ad.getLocation());
        } else if (b()) {
            a((Ad) ad, (AdCallback) callback);
        } else {
            this.l.a(new d(callback, ad));
        }
    }

    public final void a(Rewarded ad, RewardedCallback callback, String str) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (g(ad.getLocation())) {
            this.l.a(new b(callback, ad));
            a(si.a.f, "Invalid configuration. Check logs for more details.", c0.c.g, ad.getLocation());
        } else {
            a(ad.getLocation(), ad, callback, str);
        }
    }

    public static final class b extends Lambda implements Function0 {
        public final /* synthetic */ RewardedCallback b;
        public final /* synthetic */ Rewarded c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RewardedCallback rewardedCallback, Rewarded rewarded) {
            super(0);
            this.b = rewardedCallback;
            this.c = rewarded;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            this.b.onAdLoaded(new CacheEvent(null, this.c), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        }
    }

    public /* synthetic */ lg(g0 g0Var, o0 o0Var, yi yiVar, AtomicReference atomicReference, ScheduledExecutorService scheduledExecutorService, e eVar, zg zgVar, i2 i2Var, q7 q7Var, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(g0Var, o0Var, yiVar, atomicReference, scheduledExecutorService, eVar, zgVar, i2Var, q7Var, (i & 512) != 0 ? a.b : function0);
    }

    public static final class c extends Lambda implements Function0 {
        public final /* synthetic */ RewardedCallback b;
        public final /* synthetic */ Rewarded c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RewardedCallback rewardedCallback, Rewarded rewarded) {
            super(0);
            this.b = rewardedCallback;
            this.c = rewarded;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            this.b.onAdShown(new ShowEvent(null, this.c), new ShowError(ShowError.Code.SESSION_NOT_STARTED, null, 2, null));
        }
    }

    public static final class d extends Lambda implements Function0 {
        public final /* synthetic */ RewardedCallback b;
        public final /* synthetic */ Rewarded c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(RewardedCallback rewardedCallback, Rewarded rewarded) {
            super(0);
            this.b = rewardedCallback;
            this.c = rewarded;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            this.b.onAdShown(new ShowEvent(null, this.c), new ShowError(ShowError.Code.NO_CACHED_AD, null, 2, null));
        }
    }
}
