package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.applovin.impl.mediation.a.g;
import com.applovin.impl.sdk.c.h;
import com.applovin.impl.sdk.c.i;
import com.applovin.impl.sdk.d.q;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.p;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxErrorCodes;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private final j f2764b;

    /* renamed from: c, reason: collision with root package name */
    private final p f2765c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2766d;
    private final com.applovin.impl.mediation.a.e e;
    private final String f;
    private MaxAdapter g;
    private String h;
    private com.applovin.impl.mediation.a.a i;
    private View j;
    private MaxAdapterResponseParameters l;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f2763a = new Handler(Looper.getMainLooper());
    private final a k = new a(this, null);
    private final AtomicBoolean m = new AtomicBoolean(true);
    private final AtomicBoolean n = new AtomicBoolean(false);
    private final AtomicBoolean o = new AtomicBoolean(false);
    private final AtomicBoolean p = new AtomicBoolean(false);

    /* renamed from: com.applovin.impl.mediation.e$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxAdapterInitializationParameters f2767a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f2768b;

        AnonymousClass1(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
            this.f2767a = maxAdapterInitializationParameters;
            this.f2768b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.g.initialize(this.f2767a, this.f2768b, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.e.1.1
                @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                public void onCompletion() {
                    long C = e.this.e.C();
                    if (C > 0) {
                        e.this.f2763a.postDelayed(new Runnable() { // from class: com.applovin.impl.mediation.e.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                e.this.f2764b.a(AnonymousClass1.this.f2768b).a(e.this.e.t());
                            }
                        }, C);
                    } else {
                        e.this.f2764b.a(AnonymousClass1.this.f2768b).a(e.this.e.t());
                    }
                }
            });
        }
    }

    private class a implements MaxAdViewAdapterListener, MaxInterstitialAdapterListener, MaxRewardedAdapterListener {

        /* renamed from: b, reason: collision with root package name */
        private com.applovin.impl.mediation.a f2802b;

        private a() {
        }

        /* synthetic */ a(e eVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        private int a(MaxAdapterError maxAdapterError) {
            return maxAdapterError != null ? maxAdapterError.getErrorCode() : MaxAdapterError.ERROR_CODE_UNSPECIFIED;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.applovin.impl.mediation.a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No listener specified");
            }
            this.f2802b = aVar;
        }

        private void a(String str) {
            e.this.o.set(true);
            a(str, this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (e.this.n.compareAndSet(false, true)) {
                        a.this.f2802b.onAdLoaded(e.this.i);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, int i) {
            a(str, i, "");
        }

        private void a(String str, final int i, final String str2) {
            a(str, this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.11
                @Override // java.lang.Runnable
                public void run() {
                    if (e.this.n.compareAndSet(false, true)) {
                        a.this.f2802b.a(e.this.h, i, str2);
                    }
                }
            });
        }

        private void a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            e.this.f2763a.post(new Runnable() { // from class: com.applovin.impl.mediation.e.a.10
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        String name = maxAdListener != null ? maxAdListener.getClass().getName() : null;
                        e.this.f2765c.b("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + name, e);
                    }
                }
            });
        }

        private void a(String str, MaxAdapterError maxAdapterError) {
            a(str, a(maxAdapterError), b(maxAdapterError));
        }

        private String b(MaxAdapterError maxAdapterError) {
            return maxAdapterError != null ? maxAdapterError.getAdapterError() : "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, int i) {
            b(str, i, "");
        }

        private void b(String str, final int i, final String str2) {
            a(str, this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.12
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f2802b.a(e.this.i, i, str2);
                }
            });
        }

        private void b(String str, MaxAdapterError maxAdapterError) {
            b(str, a(maxAdapterError), b(maxAdapterError));
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": adview ad clicked");
            a("onAdViewAdClicked", this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.6
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f2802b.onAdClicked(e.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": adview ad collapsed");
            a("onAdViewAdCollapsed", this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.9
                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.f2802b instanceof MaxAdViewAdListener) {
                        ((MaxAdViewAdListener) a.this.f2802b).onAdCollapsed(e.this.i);
                    }
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            e.this.f2765c.c("MediationAdapterWrapper", e.this.f + ": adview ad failed to display with code: " + maxAdapterError);
            b("onAdViewAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": adview ad displayed");
            a("onAdViewAdDisplayed", this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.5
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f2802b.onAdDisplayed(e.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": adview ad expanded");
            a("onAdViewAdExpanded", this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.8
                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.f2802b instanceof MaxAdViewAdListener) {
                        ((MaxAdViewAdListener) a.this.f2802b).onAdExpanded(e.this.i);
                    }
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": adview ad hidden");
            a("onAdViewAdHidden", this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.7
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f2802b.onAdHidden(e.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            e.this.f2765c.c("MediationAdapterWrapper", e.this.f + ": adview ad ad failed to load with code: " + maxAdapterError);
            a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": adview ad loaded");
            e.this.j = view;
            a("onAdViewAdLoaded");
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": interstitial ad clicked");
            a("onInterstitialAdClicked", this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.14
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f2802b.onAdClicked(e.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            e.this.f2765c.c("MediationAdapterWrapper", e.this.f + ": interstitial ad failed to display with code " + maxAdapterError);
            b("onInterstitialAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": interstitial ad displayed");
            a("onInterstitialAdDisplayed", this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.13
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f2802b.onAdDisplayed(e.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": interstitial ad hidden");
            a("onInterstitialAdHidden", this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.15
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f2802b.onAdHidden(e.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            e.this.f2765c.c("MediationAdapterWrapper", e.this.f + ": interstitial ad failed to load with error " + maxAdapterError);
            a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": interstitial ad loaded");
            a("onInterstitialAdLoaded");
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": rewarded ad clicked");
            a("onRewardedAdClicked", this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.17
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f2802b.onAdClicked(e.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            e.this.f2765c.c("MediationAdapterWrapper", e.this.f + ": rewarded ad display failed with error: " + maxAdapterError);
            b("onRewardedAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": rewarded ad displayed");
            a("onRewardedAdDisplayed", this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.16
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f2802b.onAdDisplayed(e.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": rewarded ad hidden");
            a("onRewardedAdHidden", this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.18
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f2802b.onAdHidden(e.this.i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            e.this.f2765c.c("MediationAdapterWrapper", e.this.f + ": rewarded ad failed to load with code: " + maxAdapterError);
            a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": rewarded ad loaded");
            a("onRewardedAdLoaded");
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoCompleted() {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": rewarded video completed");
            a("onRewardedAdVideoCompleted", this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.4
                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.f2802b instanceof MaxRewardedAdListener) {
                        ((MaxRewardedAdListener) a.this.f2802b).onRewardedVideoCompleted(e.this.i);
                    }
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoStarted() {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": rewarded video started");
            a("onRewardedAdVideoStarted", this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.3
                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.f2802b instanceof MaxRewardedAdListener) {
                        ((MaxRewardedAdListener) a.this.f2802b).onRewardedVideoStarted(e.this.i);
                    }
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onUserRewarded(final MaxReward maxReward) {
            e.this.f2765c.b("MediationAdapterWrapper", e.this.f + ": user was rewarded: " + maxReward);
            a("onUserRewarded", this.f2802b, new Runnable() { // from class: com.applovin.impl.mediation.e.a.2
                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.f2802b instanceof MaxRewardedAdListener) {
                        ((MaxRewardedAdListener) a.this.f2802b).onUserRewarded(e.this.i, maxReward);
                    }
                }
            });
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final g f2829a;

        /* renamed from: b, reason: collision with root package name */
        private final MaxSignalCollectionListener f2830b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f2831c = new AtomicBoolean();

        b(g gVar, MaxSignalCollectionListener maxSignalCollectionListener) {
            this.f2829a = gVar;
            this.f2830b = maxSignalCollectionListener;
        }
    }

    private class c extends com.applovin.impl.sdk.d.a {
        private c() {
            super("TaskTimeoutMediatedAd", e.this.f2764b);
        }

        /* synthetic */ c(e eVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.applovin.impl.sdk.d.a
        public i a() {
            return i.G;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.o.get()) {
                return;
            }
            e.this.f2765c.c(c(), e.this.f + " is timing out " + e.this.i + "...");
            e.this.k.a(c(), MaxErrorCodes.MEDIATION_ADAPTER_TIMEOUT);
        }
    }

    private class d extends com.applovin.impl.sdk.d.a {

        /* renamed from: c, reason: collision with root package name */
        private final b f2834c;

        private d(b bVar) {
            super("TaskTimeoutSignalCollection", e.this.f2764b);
            this.f2834c = bVar;
        }

        /* synthetic */ d(e eVar, b bVar, AnonymousClass1 anonymousClass1) {
            this(bVar);
        }

        @Override // com.applovin.impl.sdk.d.a
        public i a() {
            return i.H;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2834c.f2831c.get()) {
                return;
            }
            c(e.this.f + " is timing out " + this.f2834c.f2829a + "...");
            e.this.b("The adapter (" + e.this.f + ") timed out", this.f2834c);
        }
    }

    e(com.applovin.impl.mediation.a.e eVar, MaxAdapter maxAdapter, j jVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f2766d = eVar.u();
        this.g = maxAdapter;
        this.f2764b = jVar;
        this.f2765c = jVar.u();
        this.e = eVar;
        this.f = maxAdapter.getClass().getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.f2765c.b("MediationAdapterWrapper", "Marking " + this.f + " as disabled due to: " + str);
        this.m.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, b bVar) {
        if (!bVar.f2831c.compareAndSet(false, true) || bVar.f2830b == null) {
            return;
        }
        bVar.f2830b.onSignalCollected(str);
    }

    private void a(final String str, final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.applovin.impl.mediation.e.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    e.this.f2765c.a("MediationAdapterWrapper", e.this.f + ": running " + str + "...");
                    runnable.run();
                    e.this.f2765c.a("MediationAdapterWrapper", e.this.f + ": finished " + str + "");
                } catch (Throwable th) {
                    e.this.f2765c.b("MediationAdapterWrapper", "Unable to run adapter operation " + str + ", marking " + e.this.f + " as disabled", th);
                    e eVar = e.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fail_");
                    sb.append(str);
                    eVar.a(sb.toString());
                }
            }
        };
        if (this.e.w()) {
            this.f2763a.post(runnable2);
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, b bVar) {
        if (!bVar.f2831c.compareAndSet(false, true) || bVar.f2830b == null) {
            return;
        }
        bVar.f2830b.onSignalCollectionFailed(str);
    }

    public View a() {
        return this.j;
    }

    void a(final com.applovin.impl.mediation.a.a aVar, final Activity activity) {
        final Runnable runnable;
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (aVar.b() != this) {
            throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        if (!this.m.get()) {
            this.f2765c.e("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' is disabled. Showing ads with this adapter is disabled.");
            this.k.b("ad_show", MaxErrorCodes.MEDIATION_ADAPTER_DISABLED);
            return;
        }
        if (!d()) {
            this.f2765c.e("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' does not have an ad loaded. Please load an ad first");
            this.k.b("ad_show", MaxErrorCodes.MEDIATION_ADAPTER_AD_NOT_READY);
            return;
        }
        if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
            if (!(this.g instanceof MaxInterstitialAdapter)) {
                this.f2765c.e("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' is not an interstitial adapter.");
                this.k.b("showFullscreenAd", MaxErrorCodes.MEDIATION_ADAPTER_WRONG_TYPE);
                return;
            }
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.e.8
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxInterstitialAdapter) e.this.g).showInterstitialAd(e.this.l, activity, e.this.k);
                }
            };
        } else {
            if (aVar.getFormat() != MaxAdFormat.REWARDED) {
                this.f2765c.e("MediationAdapterWrapper", "Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
                this.k.b("showFullscreenAd", MaxErrorCodes.MEDIATION_ADAPTER_WRONG_TYPE);
                return;
            }
            if (!(this.g instanceof MaxRewardedAdapter)) {
                this.f2765c.e("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' is not an incentivized adapter.");
                this.k.b("showFullscreenAd", MaxErrorCodes.MEDIATION_ADAPTER_WRONG_TYPE);
                return;
            }
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.e.9
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxRewardedAdapter) e.this.g).showRewardedAd(e.this.l, activity, e.this.k);
                }
            };
        }
        a("ad_render", new Runnable() { // from class: com.applovin.impl.mediation.e.10
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    e.this.f2765c.b("MediationAdapterWrapper", "Failed to start displaying ad" + aVar, th);
                    e.this.k.b("ad_render", MaxAdapterError.ERROR_CODE_UNSPECIFIED);
                }
            }
        });
    }

    void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        a("initialize", new AnonymousClass1(maxAdapterInitializationParameters, activity));
    }

    void a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final g gVar, final Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (maxSignalCollectionListener == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        if (this.m.get()) {
            final b bVar = new b(gVar, maxSignalCollectionListener);
            if (this.g instanceof MaxSignalProvider) {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) this.g;
                a("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.e.11
                    @Override // java.lang.Runnable
                    public void run() {
                        maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.e.11.1
                            @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                            public void onSignalCollected(String str) {
                                e.this.a(str, bVar);
                            }

                            @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                            public void onSignalCollectionFailed(String str) {
                                e.this.b(str, bVar);
                            }
                        });
                        if (bVar.f2831c.get()) {
                            return;
                        }
                        if (gVar.y() == 0) {
                            e.this.f2765c.a("MediationAdapterWrapper", "Failing signal collection " + gVar + " since it has 0 timeout");
                            e.this.b("The adapter (" + e.this.f + ") has 0 timeout", bVar);
                            return;
                        }
                        if (gVar.y() <= 0) {
                            e.this.f2765c.a("MediationAdapterWrapper", "Negative timeout set for " + gVar + ", not scheduling a timeout");
                            return;
                        }
                        e.this.f2765c.a("MediationAdapterWrapper", "Setting timeout " + gVar.y() + "ms. for " + gVar);
                        e.this.f2764b.C().a(new d(e.this, bVar, null), q.a.MEDIATION_TIMEOUT, gVar.y());
                    }
                });
                return;
            }
            b("The adapter (" + this.f + ") does not support signal collection", bVar);
            return;
        }
        this.f2765c.e("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' is disabled. Signal collection ads with this adapter is disabled.");
        maxSignalCollectionListener.onSignalCollectionFailed("The adapter (" + this.f + ") is disabled");
    }

    void a(String str, com.applovin.impl.mediation.a.a aVar) {
        this.h = str;
        this.i = aVar;
    }

    void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final com.applovin.impl.mediation.a.a aVar, final Activity activity, com.applovin.impl.mediation.a aVar2) {
        final Runnable runnable;
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (!this.m.get()) {
            this.f2765c.e("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.");
            aVar2.onAdLoadFailed(str, MaxErrorCodes.MEDIATION_ADAPTER_DISABLED);
            return;
        }
        this.l = maxAdapterResponseParameters;
        this.k.a(aVar2);
        if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
            if (!(this.g instanceof MaxInterstitialAdapter)) {
                this.f2765c.e("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' is not an interstitial adapter.");
                this.k.a("loadAd", MaxErrorCodes.MEDIATION_ADAPTER_WRONG_TYPE);
                return;
            }
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.e.4
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxInterstitialAdapter) e.this.g).loadInterstitialAd(maxAdapterResponseParameters, activity, e.this.k);
                }
            };
        } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
            if (!(this.g instanceof MaxRewardedAdapter)) {
                this.f2765c.e("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' is not an incentivized adapter.");
                this.k.a("loadAd", MaxErrorCodes.MEDIATION_ADAPTER_WRONG_TYPE);
                return;
            }
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.e.5
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxRewardedAdapter) e.this.g).loadRewardedAd(maxAdapterResponseParameters, activity, e.this.k);
                }
            };
        } else {
            if (aVar.getFormat() != MaxAdFormat.BANNER && aVar.getFormat() != MaxAdFormat.LEADER && aVar.getFormat() != MaxAdFormat.MREC) {
                this.f2765c.e("MediationAdapterWrapper", "Failed to load " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
                this.k.a("loadAd", MaxErrorCodes.FORMAT_TYPE_NOT_SUPPORTED);
                return;
            }
            if (!(this.g instanceof MaxAdViewAdapter)) {
                this.f2765c.e("MediationAdapterWrapper", "Mediation adapter '" + this.f + "' is not an adview-based adapter.");
                this.k.a("loadAd", MaxErrorCodes.MEDIATION_ADAPTER_WRONG_TYPE);
                return;
            }
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.e.6
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxAdViewAdapter) e.this.g).loadAdViewAd(maxAdapterResponseParameters, aVar.getFormat(), activity, e.this.k);
                }
            };
        }
        a("ad_load", new Runnable() { // from class: com.applovin.impl.mediation.e.7
            @Override // java.lang.Runnable
            public void run() {
                h D;
                com.applovin.impl.sdk.c.g gVar;
                try {
                    if (e.this.p.compareAndSet(false, true)) {
                        if (e.this.i.getFormat() == MaxAdFormat.INTERSTITIAL) {
                            D = e.this.f2764b.D();
                            gVar = com.applovin.impl.sdk.c.g.u;
                        } else if (e.this.i.getFormat() == MaxAdFormat.REWARDED) {
                            D = e.this.f2764b.D();
                            gVar = com.applovin.impl.sdk.c.g.v;
                        } else {
                            D = e.this.f2764b.D();
                            gVar = com.applovin.impl.sdk.c.g.w;
                        }
                    } else if (e.this.i.getFormat() == MaxAdFormat.INTERSTITIAL) {
                        D = e.this.f2764b.D();
                        gVar = com.applovin.impl.sdk.c.g.x;
                    } else if (e.this.i.getFormat() == MaxAdFormat.REWARDED) {
                        D = e.this.f2764b.D();
                        gVar = com.applovin.impl.sdk.c.g.y;
                    } else {
                        D = e.this.f2764b.D();
                        gVar = com.applovin.impl.sdk.c.g.z;
                    }
                    D.a(gVar);
                    runnable.run();
                } catch (Throwable th) {
                    e.this.f2765c.b("MediationAdapterWrapper", "Failed start loading " + aVar, th);
                    e.this.k.a("loadAd", -1);
                }
                if (e.this.n.get()) {
                    return;
                }
                if (e.this.e.y() == 0) {
                    e.this.f2765c.a("MediationAdapterWrapper", "Failing ad " + aVar + " since it has 0 timeout");
                    e.this.k.a("loadAd", MaxErrorCodes.MEDIATION_ADAPTER_IMMEDIATE_TIMEOUT);
                    return;
                }
                if (e.this.e.y() <= 0) {
                    e.this.f2765c.a("MediationAdapterWrapper", "Negative timeout set for " + aVar + ", not scheduling a timeout");
                    return;
                }
                e.this.f2765c.a("MediationAdapterWrapper", "Setting timeout " + e.this.e.y() + "ms. for " + aVar);
                e.this.f2764b.C().a(new c(e.this, null), q.a.MEDIATION_TIMEOUT, e.this.e.y());
            }
        });
    }

    public String b() {
        return this.f2766d;
    }

    public boolean c() {
        return this.m.get();
    }

    public boolean d() {
        return this.n.get() && this.o.get();
    }

    public String e() {
        if (this.g == null) {
            return null;
        }
        try {
            return this.g.getSdkVersion();
        } catch (Throwable th) {
            this.f2765c.b("MediationAdapterWrapper", "Unable to get adapter's SDK version, marking " + this + " as disabled", th);
            a("fail_version");
            return null;
        }
    }

    public String f() {
        if (this.g == null) {
            return null;
        }
        try {
            return this.g.getAdapterVersion();
        } catch (Throwable th) {
            this.f2765c.b("MediationAdapterWrapper", "Unable to get adapter version, marking " + this + " as disabled", th);
            a("fail_version");
            return null;
        }
    }

    void g() {
        a("destroy", new Runnable() { // from class: com.applovin.impl.mediation.e.2
            @Override // java.lang.Runnable
            public void run() {
                e.this.a("destroy");
                e.this.g.onDestroy();
                e.this.g = null;
            }
        });
    }

    public String toString() {
        return "[MediationAdapterWrapper - " + this.f + "]";
    }
}
