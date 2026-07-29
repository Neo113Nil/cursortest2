package com.applovin.impl.mediation.ads;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.sdk.d.aa;
import com.applovin.impl.sdk.d.q;
import com.applovin.impl.sdk.e;
import com.applovin.impl.sdk.e.g;
import com.applovin.impl.sdk.e.l;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.u;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a.a implements e.a, v.a {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f2667a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxAdView f2668b;

    /* renamed from: c, reason: collision with root package name */
    private MaxAd f2669c;

    /* renamed from: d, reason: collision with root package name */
    private final a f2670d;
    private final b e;
    private final e f;
    private final u g;
    private final v h;
    private final Object i;
    private com.applovin.impl.mediation.a.b j;
    private boolean k;
    private boolean l;
    private boolean m;

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.mediation.a.b f2673a;

        AnonymousClass2(com.applovin.impl.mediation.a.b bVar) {
            this.f2673a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVar;
            String str;
            String str2;
            if (this.f2673a.j() != null) {
                final MaxAdView maxAdView = MaxAdViewImpl.this.f2668b;
                if (maxAdView != null) {
                    MaxAdViewImpl.this.a(new AnimatorListenerAdapter() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.2.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            MaxAdViewImpl.this.a();
                            if (AnonymousClass2.this.f2673a.p()) {
                                MaxAdViewImpl.this.h.a(MaxAdViewImpl.this.f2667a, AnonymousClass2.this.f2673a);
                            }
                            MaxAdViewImpl.this.a(AnonymousClass2.this.f2673a, maxAdView);
                            synchronized (MaxAdViewImpl.this.i) {
                                MaxAdViewImpl.this.j = AnonymousClass2.this.f2673a;
                            }
                            MaxAdViewImpl.this.logger.a(MaxAdViewImpl.this.tag, "Scheduling impression for ad manually...");
                            MaxAdViewImpl.this.sdk.a(MaxAdViewImpl.this.f2667a).maybeScheduleRawAdImpressionPostback(AnonymousClass2.this.f2673a);
                            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.2.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    long a2 = MaxAdViewImpl.this.g.a(AnonymousClass2.this.f2673a);
                                    if (!AnonymousClass2.this.f2673a.p()) {
                                        MaxAdViewImpl.this.a(AnonymousClass2.this.f2673a, a2);
                                    }
                                    MaxAdViewImpl.this.a(a2);
                                }
                            }, AnonymousClass2.this.f2673a.k());
                        }
                    });
                    return;
                } else {
                    pVar = MaxAdViewImpl.this.logger;
                    str = MaxAdViewImpl.this.tag;
                    str2 = "Max ad view does not have a parent View";
                }
            } else {
                pVar = MaxAdViewImpl.this.logger;
                str = MaxAdViewImpl.this.tag;
                str2 = "Max ad does not have a loaded ad view";
            }
            pVar.d(str, str2);
            MaxAdViewImpl.this.f2670d.onAdDisplayFailed(this.f2673a, -5201);
        }
    }

    private class a implements MaxAdListener, MaxAdViewAdListener {
        private a() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            g.d(MaxAdViewImpl.this.adListener, maxAd, MaxAdViewImpl.this.sdk);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            g.h(MaxAdViewImpl.this.adListener, maxAd, MaxAdViewImpl.this.sdk);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, int i) {
            g.a(MaxAdViewImpl.this.adListener, maxAd, i, MaxAdViewImpl.this.sdk);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            g.b(MaxAdViewImpl.this.adListener, maxAd, MaxAdViewImpl.this.sdk);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            g.g(MaxAdViewImpl.this.adListener, maxAd, MaxAdViewImpl.this.sdk);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            g.c(MaxAdViewImpl.this.adListener, maxAd, MaxAdViewImpl.this.sdk);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, int i) {
            g.a(MaxAdViewImpl.this.adListener, str, i, MaxAdViewImpl.this.sdk);
            MaxAdViewImpl.this.a(i);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            com.applovin.impl.mediation.a.a aVar;
            if (maxAd instanceof com.applovin.impl.mediation.b) {
                aVar = ((com.applovin.impl.mediation.b) maxAd).a(MaxAdViewImpl.this.f2667a);
            } else {
                if (!(maxAd instanceof com.applovin.impl.mediation.a.a)) {
                    throw new IllegalArgumentException("Unknown type of loaded ad: " + maxAd.getClass().getName());
                }
                aVar = (com.applovin.impl.mediation.a.a) maxAd;
            }
            if (!(aVar instanceof com.applovin.impl.mediation.a.b)) {
                MaxAdViewImpl.this.logger.d(MaxAdViewImpl.this.tag, "Not a MediatedAdViewAd received: " + maxAd);
                onAdLoadFailed(MaxAdViewImpl.this.adUnitId, -5201);
                return;
            }
            com.applovin.impl.mediation.a.b bVar = (com.applovin.impl.mediation.a.b) aVar;
            MaxAdViewImpl.this.a(bVar);
            if (bVar.z()) {
                long A = bVar.A();
                MaxAdViewImpl.this.sdk.u().a(MaxAdViewImpl.this.tag, "Scheduling banner ad refresh " + A + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                MaxAdViewImpl.this.f.a(A);
            }
            g.a(MaxAdViewImpl.this.adListener, maxAd, MaxAdViewImpl.this.sdk);
        }
    }

    private class b implements MaxAdListener {
        private b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, int i) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, int i) {
            MaxAdViewImpl.this.logger.a(MaxAdViewImpl.this.tag, "Failed to pre-cache ad for refresh with error code " + i);
            MaxAdViewImpl.this.a(i);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            MaxAdViewImpl.this.logger.a(MaxAdViewImpl.this.tag, "Successfully pre-cached ad for refresh");
            MaxAdViewImpl.this.a(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdView maxAdView, j jVar, Activity activity) {
        super(str, "MaxAdView", jVar);
        this.i = new Object();
        this.j = null;
        this.m = false;
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f2667a = activity;
        this.f2668b = maxAdView;
        this.f2670d = new a();
        this.e = new b();
        this.f = new e(jVar, this);
        this.g = new u(maxAdView, jVar);
        this.h = new v(maxAdView, jVar, this);
        this.logger.a(this.tag, "Created new MaxAdView (" + this + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.mediation.a.b bVar;
        MaxAdView maxAdView = this.f2668b;
        if (maxAdView != null) {
            maxAdView.removeAllViews();
        }
        this.h.a();
        synchronized (this.i) {
            bVar = this.j;
        }
        if (bVar != null) {
            this.sdk.a(this.f2667a).destroyAd(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (this.sdk.b(com.applovin.impl.sdk.b.a.w).contains(String.valueOf(i))) {
            this.sdk.u().a(this.tag, "Ignoring banner ad refresh for error code '" + i + "'...");
            return;
        }
        this.k = true;
        long longValue = ((Long) this.sdk.a(com.applovin.impl.sdk.b.a.v)).longValue();
        if (longValue >= 0) {
            this.sdk.u().a(this.tag, "Scheduling failed banner ad refresh " + longValue + " milliseconds from now for '" + this.adUnitId + "'...");
            this.f.a(longValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        if (!l.a(j, ((Long) this.sdk.a(com.applovin.impl.sdk.b.a.G)).longValue())) {
            this.logger.a(this.tag, "No undesired viewability flags matched - scheduling viewability");
            this.k = false;
            b();
            return;
        }
        this.logger.a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j) + ", undesired: " + Long.toBinaryString(j));
        this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
        this.k = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AnimatorListenerAdapter animatorListenerAdapter) {
        if (this.j == null) {
            animatorListenerAdapter.onAnimationEnd(null);
            return;
        }
        View j = this.j.j();
        j.animate().alpha(0.0f).setDuration(((Long) this.sdk.a(com.applovin.impl.sdk.b.a.B)).longValue()).setListener(animatorListenerAdapter).start();
    }

    private static void a(View view, com.applovin.impl.mediation.a.b bVar) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        int applyDimension = bVar.h() == -1 ? -1 : (int) TypedValue.applyDimension(1, bVar.h(), displayMetrics);
        int applyDimension2 = bVar.i() != -1 ? (int) TypedValue.applyDimension(1, bVar.i(), displayMetrics) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = applyDimension;
        layoutParams.height = applyDimension2;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(10);
            layoutParams2.addRule(9);
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.b bVar) {
        AppLovinSdkUtils.runOnUiThread(new AnonymousClass2(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.b bVar, long j) {
        this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        this.sdk.a(this.f2667a).maybeScheduleViewabilityAdImpressionPostback(bVar, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.b bVar, MaxAdView maxAdView) {
        View j = bVar.j();
        j.setAlpha(0.0f);
        a(j, bVar);
        maxAdView.setBackgroundColor(0);
        maxAdView.addView(j);
        j.animate().alpha(1.0f).setDuration(((Long) this.sdk.a(com.applovin.impl.sdk.b.a.A)).longValue()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        if (!this.l) {
            this.f2669c = maxAd;
            return;
        }
        this.l = false;
        this.logger.a(this.tag, "Refreshing for cached ad: " + this.f2669c.getAdUnitId() + "...");
        this.f2670d.onAdLoaded(maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final MaxAdListener maxAdListener) {
        if (!d()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    if (MaxAdViewImpl.this.j != null) {
                        MaxAdViewImpl.this.loadRequestBuilder.a("visible_ad_ad_unit_id", MaxAdViewImpl.this.j.getAdUnitId()).a("viewability_flags", String.valueOf(MaxAdViewImpl.this.g.a(MaxAdViewImpl.this.j)));
                    } else {
                        MaxAdViewImpl.this.loadRequestBuilder.a("visible_ad_ad_unit_id").a("viewability_flags");
                    }
                    MaxAdViewImpl.this.logger.a(MaxAdViewImpl.this.tag, "Loading banner ad for '" + MaxAdViewImpl.this.adUnitId + "' and notifying " + maxAdListener + "...");
                    MaxAdViewImpl.this.sdk.a(MaxAdViewImpl.this.f2667a).loadAd(MaxAdViewImpl.this.adUnitId, MaxAdViewImpl.this.loadRequestBuilder.a(), MaxAdViewImpl.this.f2667a, maxAdListener);
                }
            });
        } else {
            this.logger.e(this.tag, "Unable to load new ad; ad is already destroyed");
            g.a(this.adListener, this.adUnitId, -1, this.sdk);
        }
    }

    private void b() {
        if (c()) {
            long longValue = ((Long) this.sdk.a(com.applovin.impl.sdk.b.a.H)).longValue();
            this.logger.a(this.tag, "Scheduling refresh precache request in " + TimeUnit.MICROSECONDS.toSeconds(longValue) + " seconds...");
            this.sdk.C().a(new aa(this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    MaxAdViewImpl.this.a(MaxAdViewImpl.this.e);
                }
            }), q.a.MEDIATION_MAIN, longValue);
        }
    }

    private boolean c() {
        return ((Long) this.sdk.a(com.applovin.impl.sdk.b.a.H)).longValue() > 0;
    }

    private boolean d() {
        boolean z;
        synchronized (this.i) {
            z = this.m;
        }
        return z;
    }

    public void destroy() {
        a();
        synchronized (this.i) {
            this.m = true;
        }
        this.f.e();
    }

    public void loadAd() {
        this.logger.a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        if (d()) {
            this.logger.e(this.tag, "Unable to load new ad; ad is already destroyed");
            g.a(this.adListener, this.adUnitId, -1, this.sdk);
            return;
        }
        if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.b.a.I)).booleanValue() || !this.f.a()) {
            a(this.f2670d);
            return;
        }
        this.logger.e(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f.d()) + " seconds.");
    }

    @Override // com.applovin.impl.sdk.e.a
    public void onAdRefresh() {
        p pVar;
        String str;
        String str2;
        this.l = false;
        if (this.f2669c != null) {
            this.logger.a(this.tag, "Refreshing for cached ad: " + this.f2669c.getAdUnitId() + "...");
            this.f2670d.onAdLoaded(this.f2669c);
            this.f2669c = null;
            return;
        }
        if (!c()) {
            pVar = this.logger;
            str = this.tag;
            str2 = "Refreshing ad from network...";
        } else if (!this.k) {
            this.logger.d(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            this.l = true;
            return;
        } else {
            pVar = this.logger;
            str = this.tag;
            str2 = "Refreshing ad from network due to viewability requirements not met for refresh request...";
        }
        pVar.a(str, str2);
        loadAd();
    }

    @Override // com.applovin.impl.sdk.v.a
    public void onLogVisibilityImpression() {
        a(this.j, this.g.a(this.j));
    }

    public void startAutoRefresh() {
        this.f.g();
        this.logger.a(this.tag, "Resumed autorefresh with remaining time: " + this.f.d());
    }

    public void stopAutoRefresh() {
        this.logger.a(this.tag, "Pausing autorefresh with remaining time: " + this.f.d());
        this.f.f();
    }
}
