package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.l2;
import com.chartboost.sdk.impl.pl;
import java.net.URL;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class h2 extends l2 {
    public pl q;
    public final BannerCallback r;
    public final l s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(f2 api, BannerCallback callback, Banner banner, h6 dependencyContainer) {
        super(banner, api, callback, dependencyContainer, new j(u.b, null, 2, null), null, 32, null);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        this.r = new a(this);
        this.s = new l2.b();
    }

    @Override // com.chartboost.sdk.impl.l2
    public void a(View view, final ShowEvent showEvent) {
        Intrinsics.checkNotNullParameter(showEvent, "showEvent");
        Unit unit = null;
        if (view != null) {
            final vb f = g().f();
            if (f == null) {
                xb.e("LoadedAd is null at visibility callback setup time for location " + ((Banner) e()).getLocation() + " — impression tracking may fail", null, 2, null);
            }
            ((BannerCallback) l()).onAdShown(showEvent, null);
            pl plVar = this.q;
            if (plVar != null) {
                plVar.b();
            }
            Context context = ((Banner) e()).getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            View a2 = pl.r.a(((Banner) e()).getContext(), view);
            if (a2 == null) {
                a2 = view.getRootView();
            }
            View view2 = a2;
            Intrinsics.checkNotNull(view2);
            pl plVar2 = new pl(context, view, view2, 1, 0, 100L, 25, false, 128, null);
            this.q = plVar2;
            plVar2.a(new pl.b() { // from class: com.chartboost.sdk.impl.h2$$ExternalSyntheticLambda0
                @Override // com.chartboost.sdk.impl.pl.b
                public final void a() {
                    h2.a(h2.this, showEvent, f);
                }
            });
            xb.a("Banner visibility tracker started: location=" + ((Banner) e()).getLocation() + ", auctionId=" + showEvent.getAdID(), (Throwable) null, 2, (Object) null);
            pl plVar3 = this.q;
            if (plVar3 != null) {
                plVar3.i();
            }
            ((Banner) e()).removeAllViews();
            ((Banner) e()).addView(view);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            a(ChartboostError.Show.NoAd.INSTANCE, showEvent);
        }
    }

    @Override // com.chartboost.sdk.impl.l2
    public URL m() {
        return null;
    }

    public static final class a implements BannerCallback, AdCallback {
        public final /* synthetic */ AdCallback a;

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(ClickEvent event, ClickError clickError) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.a.onAdClicked(event, clickError);
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

        public a(h2 h2Var) {
            this.a = h2Var.j();
        }
    }

    @Override // com.chartboost.sdk.impl.l2
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public BannerCallback i() {
        return this.r;
    }

    @Override // com.chartboost.sdk.impl.l2
    public l f() {
        return this.s;
    }

    @Override // com.chartboost.sdk.impl.l2
    public void q() {
        BannerCallback i = i();
        vb f = g().f();
        i.onAdLoaded(new CacheEvent(f != null ? f.b() : null, e()), null);
    }

    @Override // com.chartboost.sdk.impl.l2, com.chartboost.sdk.impl.j9
    public void b() {
        pl plVar = this.q;
        if (plVar != null) {
            plVar.b();
        }
        this.q = null;
        ((f2) h()).d();
        super.b();
    }

    public static final void a(h2 this$0, ShowEvent showEvent, vb vbVar) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(showEvent, "$showEvent");
        xb.a("Banner visibility triggered - recording impression: location=" + ((Banner) this$0.e()).getLocation() + ", auctionId=" + showEvent.getAdID(), (Throwable) null, 2, (Object) null);
        this$0.u();
        ((BannerCallback) this$0.l()).onImpressionRecorded(new ImpressionEvent(showEvent.getAdID(), this$0.e()));
        if (vbVar != null) {
            this$0.g().c(vbVar);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            xb.e("Cannot track impression: loadedAd was null at capture time for location " + ((Banner) this$0.e()).getLocation(), null, 2, null);
        }
    }

    @Override // com.chartboost.sdk.impl.l2
    public Object b(Context context, Continuation continuation) {
        ((f2) h()).b((Banner) e(), i());
        Result.Companion companion = Result.INSTANCE;
        return Result.m8023constructorimpl(e());
    }

    @Override // com.chartboost.sdk.impl.l2
    public void a(String str) {
        ((f2) h()).a((Banner) e(), i(), str);
    }

    @Override // com.chartboost.sdk.impl.l2
    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ((f2) h()).a((Banner) e());
    }
}
