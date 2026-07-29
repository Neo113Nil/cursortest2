package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.MaxAdapterParametersImpl;
import com.applovin.impl.mediation.a.f;
import com.applovin.impl.mediation.b.b;
import com.applovin.impl.mediation.c;
import com.applovin.impl.sdk.d.q;
import com.applovin.impl.sdk.e.g;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.p;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxErrorCodes;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class MediationServiceImpl {

    /* renamed from: a, reason: collision with root package name */
    private final j f2640a;

    /* renamed from: b, reason: collision with root package name */
    private final p f2641b;

    /* renamed from: d, reason: collision with root package name */
    private final d f2643d;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f2642c = new AtomicBoolean(false);
    private final LinkedHashSet<String> e = new LinkedHashSet<>();

    private class a implements com.applovin.impl.mediation.a, MaxAdViewAdListener, MaxRewardedAdListener {

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.a f2656b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdListener f2657c;

        private a(com.applovin.impl.mediation.a.a aVar, MaxAdListener maxAdListener) {
            this.f2656b = aVar;
            this.f2657c = maxAdListener;
        }

        @Override // com.applovin.impl.mediation.a
        public void a(MaxAd maxAd, int i, String str) {
            MediationServiceImpl.this.b(this.f2656b, i, str, this.f2657c);
        }

        @Override // com.applovin.impl.mediation.a
        public void a(String str, int i, String str2) {
            MediationServiceImpl.this.a(this.f2656b, i, str2, this.f2657c);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            MediationServiceImpl.this.d(this.f2656b);
            g.d(this.f2657c, maxAd, MediationServiceImpl.this.f2640a);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            g.h(this.f2657c, maxAd, MediationServiceImpl.this.f2640a);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, int i) {
            MediationServiceImpl.this.b(this.f2656b, i, "", this.f2657c);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            MediationServiceImpl.this.f2641b.a("MediationService", "Scheduling impression for ad via callback...");
            MediationServiceImpl.this.maybeScheduleCallbackAdImpressionPostback(this.f2656b);
            g.b(this.f2657c, maxAd, MediationServiceImpl.this.f2640a);
            if (maxAd.getFormat() == MaxAdFormat.INTERSTITIAL || maxAd.getFormat() == MaxAdFormat.REWARDED) {
                MediationServiceImpl.this.f2640a.R().c();
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            g.g(this.f2657c, maxAd, MediationServiceImpl.this.f2640a);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            g.c(this.f2657c, maxAd, MediationServiceImpl.this.f2640a);
            if (maxAd.getFormat() == MaxAdFormat.INTERSTITIAL || maxAd.getFormat() == MaxAdFormat.REWARDED) {
                MediationServiceImpl.this.f2640a.R().d();
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, int i) {
            MediationServiceImpl.this.a(this.f2656b, i, "", this.f2657c);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            MediationServiceImpl.this.c(this.f2656b);
            g.a(this.f2657c, maxAd, MediationServiceImpl.this.f2640a);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            g.f(this.f2657c, maxAd, MediationServiceImpl.this.f2640a);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            g.e(this.f2657c, maxAd, MediationServiceImpl.this.f2640a);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            g.a(this.f2657c, maxAd, maxReward, MediationServiceImpl.this.f2640a);
        }
    }

    public MediationServiceImpl(j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f2640a = jVar;
        this.f2641b = jVar.u();
        this.f2643d = new d(jVar);
    }

    private MaxAdapterParametersImpl.a a(Context context) {
        return new MaxAdapterParametersImpl.a().b(AppLovinPrivacySettings.hasUserConsent(context)).a(AppLovinPrivacySettings.isAgeRestrictedUser(context));
    }

    private void a(int i, String str, com.applovin.impl.mediation.a.a aVar) {
        long e = aVar.e();
        this.f2641b.a("MediationService", "Firing ad load failure postback with load time: " + e);
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(e));
        a("mlerr", hashMap, i, str, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, int i, String str, MaxAdListener maxAdListener) {
        a(i, str, aVar);
        destroyAd(aVar);
        g.a(maxAdListener, aVar.getAdUnitId(), i, this.f2640a);
    }

    private void a(String str, int i, com.applovin.impl.mediation.a.e eVar) {
        a(str, Collections.EMPTY_MAP, i, (String) null, eVar);
    }

    private void a(String str, int i, String str2, com.applovin.impl.mediation.a.e eVar) {
        a(str, Collections.EMPTY_MAP, i, str2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.applovin.impl.mediation.a.g gVar) {
        a("serr", Collections.EMPTY_MAP, 0, str, gVar);
    }

    private void a(String str, Map<String, String> map, int i, String str2, com.applovin.impl.mediation.a.e eVar) {
        this.f2640a.C().a(new com.applovin.impl.mediation.b.d(str, map, i, str2, eVar, this.f2640a), q.a.MEDIATION_POSTBACKS);
    }

    private boolean a(com.applovin.impl.mediation.a.e eVar) {
        return this.e.contains(eVar.t());
    }

    private void b(int i, String str, com.applovin.impl.mediation.a.a aVar) {
        a("mierr", i, str, aVar);
    }

    private void b(com.applovin.impl.mediation.a.a aVar) {
        this.f2641b.a("MediationService", "Firing ad preload postback for " + aVar.u());
        a("mpreload", 0, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.a aVar, int i, String str, MaxAdListener maxAdListener) {
        b(i, str, aVar);
        g.a(maxAdListener, aVar, i, this.f2640a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.applovin.impl.mediation.a.a aVar) {
        long e = aVar.e();
        this.f2641b.a("MediationService", "Firing ad load success postback with load time: " + e);
        String str = aVar.a() ? "boad" : "load";
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(e));
        a(str, hashMap, 0, (String) null, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(com.applovin.impl.mediation.a.a aVar) {
        a("mclick", 0, aVar);
    }

    void a(com.applovin.impl.mediation.a.a aVar) {
        this.f2641b.a("MediationService", "Firing backup ad used to display for " + aVar.u());
        a("bimp", 0, aVar);
    }

    void a(String str) {
        this.e.add(str);
    }

    public void collectSignal(final com.applovin.impl.mediation.a.g gVar, Activity activity, final f.a aVar) {
        String str;
        p pVar;
        String str2;
        StringBuilder sb;
        String str3;
        if (gVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        final e a2 = this.f2643d.a(gVar);
        if (a2 != null) {
            MaxAdapterParametersImpl a3 = a(activity.getApplicationContext()).a(gVar, activity.getApplicationContext()).a();
            a2.a(a3, activity);
            MaxSignalCollectionListener maxSignalCollectionListener = new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.MediationServiceImpl.3
                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                public void onSignalCollected(String str4) {
                    aVar.a(f.a(gVar, a2, str4));
                }

                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                public void onSignalCollectionFailed(String str4) {
                    MediationServiceImpl.this.a(str4, gVar);
                    aVar.a(f.b(gVar, a2, str4));
                }
            };
            if (!gVar.b()) {
                pVar = this.f2641b;
                str2 = "MediationService";
                sb = new StringBuilder();
                str3 = "Collecting signal for adapter: ";
            } else if (a(gVar)) {
                pVar = this.f2641b;
                str2 = "MediationService";
                sb = new StringBuilder();
                str3 = "Collecting signal for now-initialized adapter: ";
            } else {
                this.f2641b.d("MediationService", "Skip collecting signal for not-initialized adapter: " + a2.b());
                str = "Adapter not initialized yet";
            }
            sb.append(str3);
            sb.append(a2.b());
            pVar.a(str2, sb.toString());
            a2.a(a3, gVar, activity, maxSignalCollectionListener);
            return;
        }
        str = "Could not load adapter";
        aVar.a(f.a(gVar, str));
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd == null) {
            return;
        }
        this.f2641b.b("MediationService", "Destroying " + maxAd);
        ArrayList<com.applovin.impl.mediation.a.a> arrayList = new ArrayList();
        if (maxAd instanceof b) {
            arrayList.addAll(((b) maxAd).a());
        } else if (maxAd instanceof com.applovin.impl.mediation.a.a) {
            arrayList.add((com.applovin.impl.mediation.a.a) maxAd);
        }
        for (com.applovin.impl.mediation.a.a aVar : arrayList) {
            e b2 = aVar.b();
            if (b2 != null) {
                b2.g();
                aVar.g();
            }
        }
    }

    public Collection<String> getFailedAdapterClassnames() {
        return this.f2643d.b();
    }

    public LinkedHashSet<String> getInitializedAdapterNames() {
        return this.e;
    }

    public Collection<String> getLoadedAdapterClassnames() {
        return this.f2643d.a();
    }

    public void initializeAdapter(com.applovin.impl.mediation.a.e eVar, Activity activity) {
        if (eVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        e a2 = this.f2643d.a(eVar);
        if (a2 != null) {
            this.f2641b.b("MediationService", "Initializing adapter " + eVar);
            a2.a(a(activity.getApplicationContext()).a(eVar, activity.getApplicationContext()).a(), activity);
        }
    }

    public void loadAd(String str, Activity activity, MaxAdListener maxAdListener) {
        loadAd(str, null, activity, maxAdListener);
    }

    public void loadAd(final String str, c cVar, Activity activity, MaxAdListener maxAdListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        if (maxAdListener == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        this.f2640a.a();
        if (cVar == null) {
            cVar = new c.a().a();
        }
        final com.applovin.impl.mediation.b.c cVar2 = new com.applovin.impl.mediation.b.c(str, cVar, activity, this.f2640a, maxAdListener);
        this.f2641b.b("MediationService", "Scheduling signal collection before fetching next ad for ad unit '" + str + "'");
        this.f2640a.C().a(new com.applovin.impl.mediation.b.b(activity, this.f2640a, new b.a() { // from class: com.applovin.impl.mediation.MediationServiceImpl.1
            @Override // com.applovin.impl.mediation.b.b.a
            public void a(JSONArray jSONArray) {
                cVar2.a(jSONArray);
                MediationServiceImpl.this.f2641b.b("MediationService", "Scheduling fetching next ad after signal collection for ad unit '" + str + "'");
                if (((Boolean) MediationServiceImpl.this.f2640a.a(com.applovin.impl.sdk.b.a.f2997c)).booleanValue()) {
                    MediationServiceImpl.this.f2640a.C().a(cVar2);
                } else {
                    MediationServiceImpl.this.f2640a.C().a(cVar2, q.a.MEDIATION_MAIN);
                }
            }
        }), q.a.MEDIATION_MAIN);
    }

    public void loadThirdPartyMediatedAd(String str, com.applovin.impl.mediation.a.a aVar, Activity activity, MaxAdListener maxAdListener) {
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        this.f2641b.a("MediationService", "Loading " + aVar + "...");
        b(aVar);
        e a2 = this.f2643d.a(aVar);
        if (a2 != null) {
            MaxAdapterParametersImpl a3 = a(activity.getApplicationContext()).a(aVar, activity.getApplicationContext()).a();
            a2.a(a3, activity);
            com.applovin.impl.mediation.a.a a4 = aVar.a(a2);
            a2.a(str, a4);
            a4.f();
            a2.a(str, a3, a4, activity, new a(a4, maxAdListener));
            return;
        }
        this.f2641b.c("MediationService", "Failed to load " + aVar + ": adapter not loaded");
        a(aVar, MaxErrorCodes.MEDIATION_ADAPTER_LOAD_FAILED, "", maxAdListener);
    }

    public void maybeInitialize(Activity activity) {
        if (this.f2642c.compareAndSet(false, true)) {
            this.f2640a.C().a(new com.applovin.impl.mediation.b.a(activity, this.f2640a), q.a.MEDIATION_MAIN);
        }
    }

    public void maybeScheduleBackupAdPromotedToPrimaryPostback(com.applovin.impl.mediation.a.a aVar) {
        long e = aVar.e();
        this.f2641b.a("MediationService", "Firing ad load success postback with load time: " + e);
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(e));
        a("load", hashMap, 0, (String) null, aVar);
    }

    public void maybeScheduleCallbackAdImpressionPostback(com.applovin.impl.mediation.a.a aVar) {
        a("mcimp", 0, aVar);
    }

    public void maybeScheduleRawAdImpressionPostback(com.applovin.impl.mediation.a.a aVar) {
        a("mimp", 0, aVar);
    }

    public void maybeScheduleViewabilityAdImpressionPostback(com.applovin.impl.mediation.a.b bVar, long j) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("{VIEWABILITY_FLAGS}", String.valueOf(j));
        hashMap.put("{USED_VIEWABILITY_TIMER}", String.valueOf(bVar.p()));
        a("mvimp", hashMap, 0, (String) null, bVar);
    }

    public void showFullscreenAd(MaxAd maxAd, final Activity activity) {
        if (maxAd == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        if (maxAd instanceof b) {
            maxAd = ((b) maxAd).a(activity);
        }
        if (!(maxAd instanceof com.applovin.impl.mediation.a.c)) {
            this.f2641b.e("MediationService", "Unable to show ad for '" + maxAd.getAdUnitId() + "': only REWARDED or INTERSTITIAL ads are eligible for showFullscreenAd(). " + maxAd.getFormat() + " ad was provided.");
            throw new IllegalArgumentException("Provided ad is not a MediatedFullscreenAd");
        }
        this.f2640a.R().a(true);
        final com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) maxAd;
        final e b2 = cVar.b();
        if (b2 != null) {
            long B = cVar.B();
            this.f2641b.b("MediationService", "Showing ad " + maxAd.getAdUnitId() + " with delay of " + B + "ms...");
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    b2.a(cVar, activity);
                    MediationServiceImpl.this.f2640a.R().a(false);
                    MediationServiceImpl.this.f2641b.a("MediationService", "Scheduling impression for ad manually...");
                    MediationServiceImpl.this.maybeScheduleRawAdImpressionPostback(cVar);
                }
            }, B);
            return;
        }
        this.f2640a.R().a(false);
        this.f2641b.c("MediationService", "Failed to show " + maxAd + ": adapter not found");
        this.f2641b.e("MediationService", "There may be an integration problem with the adapter for ad unit id '" + cVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }
}
