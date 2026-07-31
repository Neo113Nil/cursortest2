package com.chartboost.sdk.impl;

import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.ads.Interstitial;
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
import com.chartboost.sdk.impl.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes13.dex */
public final class e {
    public final yi a;

    public e(yi uiPoster) {
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        this.a = uiPoster;
    }

    public static final class h extends Lambda implements Function0 {
        public final /* synthetic */ Ad b;
        public final /* synthetic */ AdCallback c;
        public final /* synthetic */ String d;
        public final /* synthetic */ ShowError e;
        public final /* synthetic */ e f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Ad ad, AdCallback adCallback, String str, ShowError showError, e eVar) {
            super(0);
            this.b = ad;
            this.c = adCallback;
            this.d = str;
            this.e = showError;
            this.f = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            Ad ad = this.b;
            if (ad != null) {
                AdCallback adCallback = this.c;
                String str = this.d;
                ShowError showError = this.e;
                e eVar = this.f;
                if (adCallback != null) {
                    adCallback.onAdShown(new ShowEvent(str, ad), showError);
                    unit2 = Unit.INSTANCE;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    xb.c("Callback missing for " + eVar.a(ad) + " on onAdShown", null, 2, null);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.b("Ad is missing on onAdShown", (Throwable) null, 2, (Object) null);
            }
        }
    }

    public static final class g extends Lambda implements Function0 {
        public final /* synthetic */ AdCallback b;
        public final /* synthetic */ Ad c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AdCallback adCallback, Ad ad, String str, int i) {
            super(0);
            this.b = adCallback;
            this.c = ad;
            this.d = str;
            this.e = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            AdCallback adCallback = this.b;
            if (adCallback != null) {
                Ad ad = this.c;
                String str = this.d;
                int i = this.e;
                if (adCallback instanceof RewardedCallback) {
                    if (ad != null) {
                        ((RewardedCallback) adCallback).onRewardEarned(new RewardEvent(str, ad, i));
                        unit2 = Unit.INSTANCE;
                    } else {
                        unit2 = null;
                    }
                    if (unit2 == null) {
                        xb.b("Ad is missing on didEarnReward", (Throwable) null, 2, (Object) null);
                    }
                } else {
                    xb.b("Invalid ad type to send a reward", (Throwable) null, 2, (Object) null);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.b("Missing callback on sendRewardCallbackOnMainThread", (Throwable) null, 2, (Object) null);
            }
        }
    }

    public static final class c extends Lambda implements Function0 {
        public final /* synthetic */ AdCallback b;
        public final /* synthetic */ Ad c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AdCallback adCallback, Ad ad, String str) {
            super(0);
            this.b = adCallback;
            this.c = ad;
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            AdCallback adCallback = this.b;
            if (adCallback != null) {
                Ad ad = this.c;
                String str = this.d;
                if (adCallback instanceof DismissibleAdCallback) {
                    if (ad != null) {
                        ((DismissibleAdCallback) adCallback).onAdDismiss(new DismissEvent(str, ad));
                        unit2 = Unit.INSTANCE;
                    } else {
                        unit2 = null;
                    }
                    if (unit2 == null) {
                        xb.b("Ad is missing on onAdDismiss", (Throwable) null, 2, (Object) null);
                    }
                } else {
                    xb.b("Invalid ad type to send onAdDismiss", (Throwable) null, 2, (Object) null);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.b("Missing callback on sendDismissCallbackOnMainThread", (Throwable) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.e$e, reason: collision with other inner class name */
    public static final class C0219e extends Lambda implements Function0 {
        public final /* synthetic */ Ad b;
        public final /* synthetic */ AdCallback c;
        public final /* synthetic */ String d;
        public final /* synthetic */ e e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0219e(Ad ad, AdCallback adCallback, String str, e eVar) {
            super(0);
            this.b = ad;
            this.c = adCallback;
            this.d = str;
            this.e = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            Ad ad = this.b;
            if (ad != null) {
                AdCallback adCallback = this.c;
                String str = this.d;
                e eVar = this.e;
                if (adCallback != null) {
                    adCallback.onImpressionRecorded(new ImpressionEvent(str, ad));
                    unit2 = Unit.INSTANCE;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    xb.c("Callback missing for " + eVar.a(ad) + " on onImpressionRecorded", null, 2, null);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.b("Ad is missing on onImpressionRecorded", (Throwable) null, 2, (Object) null);
            }
        }
    }

    public final void b(String str, Ad ad, AdCallback adCallback) {
        this.a.a(new C0219e(ad, adCallback, str, this));
    }

    public static final class a extends Lambda implements Function0 {
        public final /* synthetic */ Ad b;
        public final /* synthetic */ AdCallback c;
        public final /* synthetic */ String d;
        public final /* synthetic */ CacheError e;
        public final /* synthetic */ e f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ad ad, AdCallback adCallback, String str, CacheError cacheError, e eVar) {
            super(0);
            this.b = ad;
            this.c = adCallback;
            this.d = str;
            this.e = cacheError;
            this.f = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            Ad ad = this.b;
            if (ad != null) {
                AdCallback adCallback = this.c;
                String str = this.d;
                CacheError cacheError = this.e;
                e eVar = this.f;
                if (adCallback != null) {
                    adCallback.onAdLoaded(new CacheEvent(str, ad), cacheError);
                    unit2 = Unit.INSTANCE;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    xb.c("Callback missing for " + eVar.a(ad) + " on onAdLoaded", null, 2, null);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.b("Ad is missing on onAdLoaded", (Throwable) null, 2, (Object) null);
            }
        }
    }

    public static final class b extends Lambda implements Function0 {
        public final /* synthetic */ Ad b;
        public final /* synthetic */ AdCallback c;
        public final /* synthetic */ String d;
        public final /* synthetic */ ClickError e;
        public final /* synthetic */ e f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ad ad, AdCallback adCallback, String str, ClickError clickError, e eVar) {
            super(0);
            this.b = ad;
            this.c = adCallback;
            this.d = str;
            this.e = clickError;
            this.f = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            Ad ad = this.b;
            if (ad != null) {
                AdCallback adCallback = this.c;
                String str = this.d;
                ClickError clickError = this.e;
                e eVar = this.f;
                if (adCallback != null) {
                    adCallback.onAdClicked(new ClickEvent(str, ad), clickError);
                    unit2 = Unit.INSTANCE;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    xb.c("Callback missing for " + eVar.a(ad) + " on onAdClicked", null, 2, null);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.b("Ad is missing on onAdClicked", (Throwable) null, 2, (Object) null);
            }
        }
    }

    public static final class f extends Lambda implements Function0 {
        public final /* synthetic */ Ad b;
        public final /* synthetic */ AdCallback c;
        public final /* synthetic */ String d;
        public final /* synthetic */ e e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Ad ad, AdCallback adCallback, String str, e eVar) {
            super(0);
            this.b = ad;
            this.c = adCallback;
            this.d = str;
            this.e = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            Ad ad = this.b;
            if (ad != null) {
                AdCallback adCallback = this.c;
                String str = this.d;
                e eVar = this.e;
                if (adCallback != null) {
                    adCallback.onAdRequestedToShow(new ShowEvent(str, ad));
                    unit2 = Unit.INSTANCE;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    xb.c("Callback missing for " + eVar.a(ad) + " on onAdRequestedToShow", null, 2, null);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                xb.b("Ad is missing on onAdRequestedToShow", (Throwable) null, 2, (Object) null);
            }
        }
    }

    public final void c(String str, Ad ad, AdCallback adCallback) {
        this.a.a(new f(ad, adCallback, str, this));
    }

    public static final class d extends Lambda implements Function0 {
        public final /* synthetic */ AdCallback b;
        public final /* synthetic */ ExpirationEvent c;
        public final /* synthetic */ e d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AdCallback adCallback, ExpirationEvent expirationEvent, e eVar) {
            super(0);
            this.b = adCallback;
            this.c = expirationEvent;
            this.d = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }

        public final void a() {
            Unit unit;
            try {
                AdCallback adCallback = this.b;
                if (adCallback != null) {
                    adCallback.onAdExpired(this.c);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    xb.c("Callback missing for " + this.d.a(this.c.getAd()) + " on onAdExpired", null, 2, null);
                }
            } catch (Exception e) {
                xb.b("Error delivering onAdExpired callback", e);
            }
        }
    }

    public final String a(Ad ad) {
        if (ad instanceof Interstitial) {
            return c0.b.g.b();
        }
        if (ad instanceof Rewarded) {
            return c0.c.g.b();
        }
        if (ad instanceof Banner) {
            return c0.a.g.b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a(String str, CacheError cacheError, Ad ad, AdCallback adCallback) {
        this.a.a(new a(ad, adCallback, str, cacheError, this));
    }

    public final void a(String str, ClickError clickError, Ad ad, AdCallback adCallback) {
        this.a.a(new b(ad, adCallback, str, clickError, this));
    }

    public final void a(String str, Ad ad, AdCallback adCallback) {
        this.a.a(new c(adCallback, ad, str));
    }

    public final void a(ExpirationEvent event, AdCallback adCallback) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.a(new d(adCallback, event, this));
    }

    public final void a(String str, Ad ad, AdCallback adCallback, int i) {
        this.a.a(new g(adCallback, ad, str, i));
    }

    public final void a(String str, ShowError showError, Ad ad, AdCallback adCallback) {
        this.a.a(new h(ad, adCallback, str, showError, this));
    }
}
