package com.applovin.impl.mediation.ads.a;

import android.app.Activity;
import com.applovin.impl.mediation.a.c;
import com.applovin.impl.sdk.b;
import com.applovin.impl.sdk.e.g;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.p;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class b extends com.applovin.impl.mediation.ads.a.a implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.b f2689a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f2690b;

    /* renamed from: c, reason: collision with root package name */
    private MaxAd f2691c;

    /* renamed from: d, reason: collision with root package name */
    private EnumC0302b f2692d;
    private final AtomicBoolean e;
    protected final a listenerWrapper;

    /* JADX INFO: Access modifiers changed from: protected */
    public class a implements MaxAdListener, MaxRewardedAdListener {
        protected a() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            g.d(b.this.adListener, maxAd, b.this.sdk);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final int i) {
            b.this.transitionToState(EnumC0302b.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.a.b.a.4
                @Override // java.lang.Runnable
                public void run() {
                    b.this.f2689a.a();
                    b.this.b();
                    g.a(b.this.adListener, maxAd, i, b.this.sdk);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            b.this.f2689a.a();
            g.b(b.this.adListener, maxAd, b.this.sdk);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            b.this.transitionToState(EnumC0302b.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.a.b.a.3
                @Override // java.lang.Runnable
                public void run() {
                    b.this.b();
                    g.c(b.this.adListener, maxAd, b.this.sdk);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final int i) {
            b.this.transitionToState(EnumC0302b.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.a.b.a.2
                @Override // java.lang.Runnable
                public void run() {
                    b.this.b();
                    if (b.this.e.compareAndSet(true, false)) {
                        b.this.loadRequestBuilder.a("expired_ad_ad_unit_id");
                    }
                    g.a(b.this.adListener, str, i, b.this.sdk);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            if (!b.this.e.compareAndSet(true, false)) {
                b.this.transitionToState(EnumC0302b.READY, new Runnable() { // from class: com.applovin.impl.mediation.ads.a.b.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.b(maxAd);
                        g.a(b.this.adListener, maxAd, b.this.sdk);
                    }
                });
            } else {
                b.this.loadRequestBuilder.a("expired_ad_ad_unit_id");
                b.this.b(maxAd);
            }
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            g.f(b.this.adListener, maxAd, b.this.sdk);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            g.e(b.this.adListener, maxAd, b.this.sdk);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            g.a(b.this.adListener, maxAd, maxReward, b.this.sdk);
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.a.b$b, reason: collision with other inner class name */
    public enum EnumC0302b {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    protected b(String str, String str2, j jVar) {
        super(str, str2, jVar);
        this.f2690b = new Object();
        this.f2691c = null;
        this.f2692d = EnumC0302b.IDLE;
        this.e = new AtomicBoolean();
        this.listenerWrapper = new a();
        this.f2689a = new com.applovin.impl.sdk.b(jVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxAd a() {
        MaxAd maxAd;
        synchronized (this.f2690b) {
            maxAd = this.f2691c;
            this.f2691c = null;
        }
        return maxAd;
    }

    private void a(MaxAd maxAd) {
        synchronized (this.f2690b) {
            this.f2691c = maxAd;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.sdk.a(getActivity()).destroyAd(a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MaxAd maxAd) {
        a(maxAd);
        c(maxAd);
    }

    private void c(MaxAd maxAd) {
        long h = maxAd instanceof c ? ((c) maxAd).h() : maxAd instanceof com.applovin.impl.mediation.b ? ((com.applovin.impl.mediation.b) maxAd).c() : -1L;
        if (h >= 0) {
            this.logger.a(this.tag, "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toMinutes(h) + " minutes from now for " + getAdUnitId() + " ...");
            this.f2689a.a(h);
        }
    }

    public void destroy() {
        transitionToState(EnumC0302b.DESTROYED, new Runnable() { // from class: com.applovin.impl.mediation.ads.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                MaxAd a2 = b.this.a();
                b.this.logger.a(b.this.tag, "Destroying ad for '" + b.this.adUnitId + "'; current ad: " + a2 + "...");
                b.this.sdk.a(b.this.getActivity()).destroyAd(a2);
            }
        });
    }

    protected abstract Activity getActivity();

    protected MaxAd getLoadedAd() {
        MaxAd maxAd;
        synchronized (this.f2690b) {
            maxAd = this.f2691c;
        }
        return maxAd;
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.f2690b) {
            z = this.f2691c != null && this.f2691c.isReady() && this.f2692d == EnumC0302b.READY;
        }
        return z;
    }

    @Override // com.applovin.impl.sdk.b.a
    public void onAdExpired() {
        this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        this.e.set(true);
        this.loadRequestBuilder.a("expired_ad_ad_unit_id", getAdUnitId());
        this.sdk.a(getActivity()).loadAd(this.adUnitId, this.loadRequestBuilder.a(), getActivity(), this.listenerWrapper);
    }

    protected void onTransitionedToState(EnumC0302b enumC0302b, EnumC0302b enumC0302b2) {
    }

    protected void transitionToState(EnumC0302b enumC0302b, Runnable runnable) {
        boolean z;
        p pVar;
        String str;
        String str2;
        p pVar2;
        String str3;
        String str4;
        EnumC0302b enumC0302b2 = this.f2692d;
        synchronized (this.f2690b) {
            this.logger.a(this.tag, "Attempting state transition from " + enumC0302b2 + " to " + enumC0302b);
            z = false;
            if (enumC0302b2 == EnumC0302b.IDLE) {
                if (enumC0302b != EnumC0302b.LOADING && enumC0302b != EnumC0302b.DESTROYED) {
                    if (enumC0302b == EnumC0302b.SHOWING) {
                        pVar2 = this.logger;
                        str3 = this.tag;
                        str4 = "No ad is loading or loaded";
                        pVar2.e(str3, str4);
                    } else {
                        pVar = this.logger;
                        str = this.tag;
                        str2 = "Unable to transition to: " + enumC0302b;
                        pVar.d(str, str2);
                    }
                }
                z = true;
            } else if (enumC0302b2 == EnumC0302b.LOADING) {
                if (enumC0302b != EnumC0302b.IDLE) {
                    if (enumC0302b == EnumC0302b.LOADING) {
                        pVar2 = this.logger;
                        str3 = this.tag;
                        str4 = "An ad is already loading";
                    } else if (enumC0302b != EnumC0302b.READY) {
                        if (enumC0302b == EnumC0302b.SHOWING) {
                            pVar2 = this.logger;
                            str3 = this.tag;
                            str4 = "An ad is not ready to be shown yet";
                        } else if (enumC0302b != EnumC0302b.DESTROYED) {
                            pVar = this.logger;
                            str = this.tag;
                            str2 = "Unable to transition to: " + enumC0302b;
                            pVar.d(str, str2);
                        }
                    }
                    pVar2.e(str3, str4);
                }
                z = true;
            } else if (enumC0302b2 == EnumC0302b.READY) {
                if (enumC0302b != EnumC0302b.IDLE) {
                    if (enumC0302b == EnumC0302b.LOADING) {
                        pVar2 = this.logger;
                        str3 = this.tag;
                        str4 = "An ad is already loaded";
                        pVar2.e(str3, str4);
                    } else {
                        if (enumC0302b == EnumC0302b.READY) {
                            pVar = this.logger;
                            str = this.tag;
                            str2 = "An ad is already marked as ready";
                        } else if (enumC0302b != EnumC0302b.SHOWING && enumC0302b != EnumC0302b.DESTROYED) {
                            pVar = this.logger;
                            str = this.tag;
                            str2 = "Unable to transition to: " + enumC0302b;
                        }
                        pVar.d(str, str2);
                    }
                }
                z = true;
            } else if (enumC0302b2 == EnumC0302b.SHOWING) {
                if (enumC0302b != EnumC0302b.IDLE) {
                    if (enumC0302b == EnumC0302b.LOADING) {
                        pVar2 = this.logger;
                        str3 = this.tag;
                        str4 = "Can not load another interstitial while the ad is showing";
                    } else {
                        if (enumC0302b == EnumC0302b.READY) {
                            pVar = this.logger;
                            str = this.tag;
                            str2 = "An ad is already showing, ignoring";
                        } else if (enumC0302b == EnumC0302b.SHOWING) {
                            pVar2 = this.logger;
                            str3 = this.tag;
                            str4 = "The ad is already showing, not showing another one";
                        } else if (enumC0302b != EnumC0302b.DESTROYED) {
                            pVar = this.logger;
                            str = this.tag;
                            str2 = "Unable to transition to: " + enumC0302b;
                        }
                        pVar.d(str, str2);
                    }
                    pVar2.e(str3, str4);
                }
                z = true;
            } else if (enumC0302b2 == EnumC0302b.DESTROYED) {
                pVar2 = this.logger;
                str3 = this.tag;
                str4 = "No operations are allowed on a destroyed instance";
                pVar2.e(str3, str4);
            } else {
                pVar = this.logger;
                str = this.tag;
                str2 = "Unknown state: " + this.f2692d;
                pVar.d(str, str2);
            }
            if (z) {
                this.logger.a(this.tag, "Transitioning from " + this.f2692d + " to " + enumC0302b + "...");
                this.f2692d = enumC0302b;
            } else {
                this.logger.c(this.tag, "Not allowed transition from " + this.f2692d + " to " + enumC0302b);
            }
        }
        if (z) {
            if (runnable != null) {
                runnable.run();
            }
            onTransitionedToState(enumC0302b2, enumC0302b);
        }
    }
}
