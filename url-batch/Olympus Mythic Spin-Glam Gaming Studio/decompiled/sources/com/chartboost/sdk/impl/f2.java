package com.chartboost.sdk.impl;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.impl.sg;
import com.chartboost.sdk.impl.si;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class f2 extends com.chartboost.sdk.impl.d {
    public final g0 l;
    public final o0 m;
    public final yi n;
    public final AtomicReference o;

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
    public f2(g0 adUnitLoader, o0 adUnitRenderer, yi uiPoster, AtomicReference sdkConfig, ScheduledExecutorService backgroundExecutor, com.chartboost.sdk.impl.e adApiCallbackSender, zg session, i2 base64Wrapper, q7 eventTracker, Function0 androidVersion) {
        super(adUnitLoader, adUnitRenderer, sdkConfig, backgroundExecutor, adApiCallbackSender, session, base64Wrapper, eventTracker, androidVersion);
        Intrinsics.checkNotNullParameter(adUnitLoader, "adUnitLoader");
        Intrinsics.checkNotNullParameter(adUnitRenderer, "adUnitRenderer");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        Intrinsics.checkNotNullParameter(adApiCallbackSender, "adApiCallbackSender");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.l = adUnitLoader;
        this.m = adUnitRenderer;
        this.n = uiPoster;
        this.o = sdkConfig;
    }

    public final void a(Banner ad, BannerCallback callback) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a(ad, callback, (String) null);
    }

    @Override // com.chartboost.sdk.impl.d, com.chartboost.sdk.impl.q0
    public void a(String str) {
    }

    public final void b(Banner ad, BannerCallback callback) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (g(ad.getLocation())) {
            this.n.a(new d(callback, ad));
            a(si.i.e, "Invalid configuration. Check logs for more details.", c0.a.g, ad.getLocation());
        } else if (!e()) {
            this.n.a(new e(callback, ad));
        } else if (b()) {
            a((Ad) ad, (AdCallback) callback);
        } else {
            this.n.a(new f(callback, ad));
        }
    }

    public final void a(Banner ad, BannerCallback callback, String str) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (g(ad.getLocation())) {
            this.n.a(new b(callback, ad));
            a(si.a.f, "Invalid configuration. Check logs for more details.", c0.a.g, ad.getLocation());
        } else if (!e()) {
            this.n.a(new c(callback, ad));
        } else {
            a(ad.getLocation(), ad, callback, str);
        }
    }

    public static final class b extends Lambda implements Function0 {
        public final /* synthetic */ BannerCallback b;
        public final /* synthetic */ Banner c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BannerCallback bannerCallback, Banner banner) {
            super(0);
            this.b = bannerCallback;
            this.c = banner;
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

    public static final class c extends Lambda implements Function0 {
        public final /* synthetic */ BannerCallback b;
        public final /* synthetic */ Banner c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BannerCallback bannerCallback, Banner banner) {
            super(0);
            this.b = bannerCallback;
            this.c = banner;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            this.b.onAdLoaded(new CacheEvent(null, this.c), new CacheError(CacheError.Code.BANNER_DISABLED, null, 2, null));
        }
    }

    public /* synthetic */ f2(g0 g0Var, o0 o0Var, yi yiVar, AtomicReference atomicReference, ScheduledExecutorService scheduledExecutorService, com.chartboost.sdk.impl.e eVar, zg zgVar, i2 i2Var, q7 q7Var, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(g0Var, o0Var, yiVar, atomicReference, scheduledExecutorService, eVar, zgVar, i2Var, q7Var, (i & 512) != 0 ? a.b : function0);
    }

    public static final class d extends Lambda implements Function0 {
        public final /* synthetic */ BannerCallback b;
        public final /* synthetic */ Banner c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BannerCallback bannerCallback, Banner banner) {
            super(0);
            this.b = bannerCallback;
            this.c = banner;
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

    public static final class e extends Lambda implements Function0 {
        public final /* synthetic */ BannerCallback b;
        public final /* synthetic */ Banner c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BannerCallback bannerCallback, Banner banner) {
            super(0);
            this.b = bannerCallback;
            this.c = banner;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            this.b.onAdShown(new ShowEvent(null, this.c), new ShowError(ShowError.Code.BANNER_DISABLED, null, 2, null));
        }
    }

    public static final class f extends Lambda implements Function0 {
        public final /* synthetic */ BannerCallback b;
        public final /* synthetic */ Banner c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BannerCallback bannerCallback, Banner banner) {
            super(0);
            this.b = bannerCallback;
            this.c = banner;
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

    public final void d() {
        this.m.E();
        this.l.b();
    }

    public final void a(Banner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        if (banner.getLayoutParams() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            banner.setLayoutParams(layoutParams);
        }
        DisplayMetrics displayMetrics = banner.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams2 = banner.getLayoutParams();
        int bannerWidth = banner.getBannerWidth();
        Intrinsics.checkNotNull(displayMetrics);
        layoutParams2.width = (int) a(bannerWidth, displayMetrics);
        banner.getLayoutParams().height = (int) a(banner.getBannerHeight(), displayMetrics);
    }

    public final boolean e() {
        sg.a a2;
        sg sgVar = (sg) this.o.get();
        if (sgVar == null || (a2 = sgVar.a()) == null) {
            return true;
        }
        return a2.a();
    }

    public final float a(int i, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, i, displayMetrics);
    }
}
