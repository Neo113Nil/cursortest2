package com.applovin.impl.sdk;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.StrictMode;
import android.text.TextUtils;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.AdViewControllerImpl;
import com.applovin.impl.sdk.ad.NativeAdImpl;
import com.applovin.impl.sdk.ad.c;
import com.applovin.impl.sdk.d.q;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdUpdateListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService {
    public static String URI_LOAD_URL = "/adservice/load_url";
    public static String URI_NO_OP = "/adservice/no_op";
    public static String URI_SKIP_AD = "/adservice/skip";
    public static String URI_TRACK_CLICK_IMMEDIATELY = "/adservice/track_click_now";

    /* renamed from: a, reason: collision with root package name */
    private final j f2839a;

    /* renamed from: b, reason: collision with root package name */
    private final p f2840b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f2841c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<com.applovin.impl.sdk.ad.d, b> f2842d;
    private final Object e = new Object();

    private class a implements AppLovinAdLoadListener {

        /* renamed from: b, reason: collision with root package name */
        private final b f2859b;

        private a(b bVar) {
            this.f2859b = bVar;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            HashSet hashSet;
            HashSet hashSet2;
            com.applovin.impl.sdk.ad.d adZone = ((AppLovinAdBase) appLovinAd).getAdZone();
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.h) && adZone.k()) {
                AppLovinAdServiceImpl.this.f2839a.L().adReceived(appLovinAd);
                appLovinAd = new com.applovin.impl.sdk.ad.h(adZone, AppLovinAdServiceImpl.this.f2839a);
            }
            synchronized (this.f2859b.f2860a) {
                if (adZone.h()) {
                    long i = adZone.i();
                    if (i > 0) {
                        this.f2859b.f2862c = System.currentTimeMillis() + (i * 1000);
                    } else if (i == 0) {
                        this.f2859b.f2862c = Long.MAX_VALUE;
                    }
                    this.f2859b.f2861b = appLovinAd;
                } else {
                    this.f2859b.f2861b = null;
                    this.f2859b.f2862c = 0L;
                }
                hashSet = new HashSet(this.f2859b.f);
                this.f2859b.f.clear();
                hashSet2 = new HashSet(this.f2859b.e);
                this.f2859b.f2863d = false;
            }
            AppLovinAdServiceImpl.this.b(adZone);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdUpdateListener) it2.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            HashSet hashSet;
            synchronized (this.f2859b.f2860a) {
                hashSet = new HashSet(this.f2859b.f);
                this.f2859b.f.clear();
                this.f2859b.f2863d = false;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(i, (AppLovinAdLoadListener) it.next());
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final Object f2860a;

        /* renamed from: b, reason: collision with root package name */
        AppLovinAd f2861b;

        /* renamed from: c, reason: collision with root package name */
        long f2862c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2863d;
        private final Collection<AppLovinAdUpdateListener> e;
        private final Collection<AppLovinAdLoadListener> f;

        private b() {
            this.f2860a = new Object();
            this.e = new HashSet();
            this.f = new HashSet();
        }

        public String toString() {
            return "AdLoadState{loadedAd=" + this.f2861b + ", loadedAdExpiration=" + this.f2862c + ", isWaitingForAd=" + this.f2863d + ", updateListeners=" + this.e + ", pendingAdListeners=" + this.f + '}';
        }
    }

    private class c extends com.applovin.impl.sdk.d.a {

        /* renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.sdk.ad.d f2865c;

        private c(com.applovin.impl.sdk.ad.d dVar) {
            super("UpdateAdTask", AppLovinAdServiceImpl.this.f2839a);
            this.f2865c = dVar;
        }

        @Override // com.applovin.impl.sdk.d.a
        public com.applovin.impl.sdk.c.i a() {
            return com.applovin.impl.sdk.c.i.y;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppLovinAdServiceImpl.this.f2840b.a("AppLovinAdService", "Attempt update for spec: " + this.f2865c);
            b a2 = AppLovinAdServiceImpl.this.a(this.f2865c);
            synchronized (a2.f2860a) {
                boolean h = this.f2865c.h();
                boolean a3 = AppLovinAdServiceImpl.this.a();
                boolean z = !a2.e.isEmpty();
                boolean z2 = System.currentTimeMillis() > a2.f2862c;
                AppLovinAdServiceImpl.this.f2840b.a("AppLovinAdService", "Update ad states - isRefreshEnabled=" + h + " hasUpdateListeners=" + z + " isCurrentAdExpired=" + z2 + " isDeviceOn=" + a3 + " isWaitingForAd=" + a2.f2863d);
                if (h && z && z2 && a3 && !a2.f2863d) {
                    AppLovinAdServiceImpl.this.f2840b.a("AppLovinAdService", "Performing ad update...");
                    a2.f2863d = true;
                    AppLovinAdServiceImpl.this.a(this.f2865c, new a(a2));
                } else {
                    AppLovinAdServiceImpl.this.f2840b.a("AppLovinAdService", "Ad update skipped");
                }
            }
        }
    }

    AppLovinAdServiceImpl(j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f2839a = jVar;
        this.f2840b = jVar.u();
        this.f2841c = new Handler(Looper.getMainLooper());
        this.f2842d = new HashMap(5);
        this.f2842d.put(com.applovin.impl.sdk.ad.d.c(jVar), new b());
        this.f2842d.put(com.applovin.impl.sdk.ad.d.d(jVar), new b());
        this.f2842d.put(com.applovin.impl.sdk.ad.d.e(jVar), new b());
        this.f2842d.put(com.applovin.impl.sdk.ad.d.f(jVar), new b());
        this.f2842d.put(com.applovin.impl.sdk.ad.d.g(jVar), new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b a(com.applovin.impl.sdk.ad.d dVar) {
        b bVar;
        synchronized (this.e) {
            bVar = this.f2842d.get(dVar);
            if (bVar == null) {
                bVar = new b();
                this.f2842d.put(dVar, bVar);
            }
        }
        return bVar;
    }

    private String a(String str, int i, String str2, boolean z) {
        try {
            if (!com.applovin.impl.sdk.e.i.b(str)) {
                return null;
            }
            if (i < 0 || i > 100) {
                i = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter(NativeAdImpl.QUERY_PARAM_VIDEO_PERCENT_VIEWED, Integer.toString(i)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z)).build().toString();
        } catch (Throwable th) {
            this.f2840b.b("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final AppLovinAdLoadListener appLovinAdLoadListener) {
        if (((Boolean) this.f2839a.a(com.applovin.impl.sdk.b.b.fg)).booleanValue()) {
            this.f2841c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        appLovinAdLoadListener.failedToReceiveAd(i);
                    } catch (Throwable th) {
                        AppLovinAdServiceImpl.this.f2840b.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
                    }
                }
            });
            return;
        }
        try {
            appLovinAdLoadListener.failedToReceiveAd(i);
        } catch (Throwable th) {
            this.f2840b.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Uri uri, com.applovin.impl.sdk.ad.g gVar, AppLovinAdView appLovinAdView, AdViewControllerImpl adViewControllerImpl) {
        if (appLovinAdView == null) {
            this.f2840b.d("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
            return;
        }
        adViewControllerImpl.removeClickTrackingOverlay();
        a(gVar);
        if (com.applovin.impl.sdk.e.l.a(appLovinAdView.getContext(), uri, this.f2839a)) {
            com.applovin.impl.sdk.e.g.c(adViewControllerImpl.getAdViewEventListener(), gVar, appLovinAdView, this.f2839a);
        }
        adViewControllerImpl.dismissInterstitialIfRequired();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.d dVar, a aVar) {
        AppLovinAd appLovinAd = (AppLovinAd) this.f2839a.L().e(dVar);
        if (appLovinAd != null) {
            this.f2840b.a("AppLovinAdService", "Using pre-loaded ad: " + appLovinAd + " for " + dVar);
            aVar.adReceived(appLovinAd);
        } else {
            a(new com.applovin.impl.sdk.d.m(dVar, aVar, this.f2839a), aVar);
        }
        if (dVar.k() && appLovinAd == null) {
            return;
        }
        if (!dVar.l() && (appLovinAd == null || dVar.g() <= 0)) {
            return;
        }
        this.f2839a.L().i(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.applovin.impl.sdk.AppLovinAdServiceImpl$1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.applovin.sdk.AppLovinAd] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.applovin.impl.sdk.AppLovinAdServiceImpl] */
    private void a(com.applovin.impl.sdk.ad.d dVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        ?? r5;
        p pVar;
        String str;
        String str2;
        int i;
        if (dVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        if (!com.applovin.impl.sdk.e.e.a(this.f2839a.w(), this.f2839a) && !((Boolean) this.f2839a.a(com.applovin.impl.sdk.b.b.dK)).booleanValue()) {
            this.f2840b.e("AppLovinAdService", "Failing ad load due to no internet connection.");
            i = AppLovinErrorCodes.NO_NETWORK;
        } else {
            if (!((Boolean) this.f2839a.a(com.applovin.impl.sdk.b.b.dZ)).booleanValue() || dVar.l() || !this.f2839a.O().a() || this.f2839a.O().a(dVar)) {
                this.f2839a.u().a("AppLovinAdService", "Loading next ad of zone {" + dVar + "}...");
                b a2 = a(dVar);
                synchronized (a2.f2860a) {
                    boolean z = System.currentTimeMillis() > a2.f2862c;
                    r5 = 0;
                    r5 = 0;
                    if (a2.f2861b == null || z) {
                        a2.f.add(appLovinAdLoadListener);
                        if (a2.f2863d) {
                            pVar = this.f2840b;
                            str = "AppLovinAdService";
                            str2 = "Already waiting on an ad load...";
                        } else {
                            this.f2840b.a("AppLovinAdService", "Loading next ad...");
                            a2.f2863d = true;
                            a aVar = new a(a2);
                            if (!dVar.j()) {
                                this.f2840b.a("AppLovinAdService", "Task merge not necessary.");
                            } else if (this.f2839a.L().a(dVar, aVar)) {
                                pVar = this.f2840b;
                                str = "AppLovinAdService";
                                str2 = "Attaching load listener to initial preload task...";
                            } else {
                                this.f2840b.a("AppLovinAdService", "Skipped attach of initial preload callback.");
                            }
                            a(dVar, aVar);
                        }
                        pVar.a(str, str2);
                    } else {
                        r5 = a2.f2861b;
                    }
                }
                if (r5 != 0) {
                    a(r5, appLovinAdLoadListener);
                    return;
                }
                return;
            }
            this.f2840b.e("AppLovinAdService", "Failed to load ad for zone (" + dVar.a() + "). Please check that the zone has been added to your AppLovin account and given at least 30 minutes to fully propagate.");
            i = -7;
        }
        a(i, appLovinAdLoadListener);
    }

    private void a(com.applovin.impl.sdk.c.a aVar, String str) {
        if (!com.applovin.impl.sdk.e.i.b(aVar.a())) {
            this.f2840b.c("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        } else {
            this.f2839a.F().a(com.applovin.impl.sdk.network.e.j().a(com.applovin.impl.sdk.e.l.a(str, aVar.a())).b(com.applovin.impl.sdk.e.i.b(aVar.b()) ? com.applovin.impl.sdk.e.l.a(str, aVar.b()) : null).a(false).a());
        }
    }

    private void a(com.applovin.impl.sdk.d.a aVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (!com.applovin.impl.sdk.e.e.a(this.f2839a.w(), this.f2839a) && !((Boolean) this.f2839a.a(com.applovin.impl.sdk.b.b.dK)).booleanValue()) {
            this.f2840b.e("AppLovinAdService", "Failing ad load due to no internet connection.");
            a(AppLovinErrorCodes.NO_NETWORK, appLovinAdLoadListener);
            return;
        }
        this.f2839a.a();
        this.f2840b.b("AppLovinAdService", "Loading ad using '" + aVar.c() + "'...");
        this.f2839a.C().a(aVar, com.applovin.impl.sdk.e.e.a(false, this.f2839a));
    }

    private void a(AppLovinAd appLovinAd) {
        if (appLovinAd == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (!(appLovinAd instanceof AppLovinAdBase)) {
            throw new IllegalArgumentException("Unknown ad type specified: " + appLovinAd.getClass().getName());
        }
        b a2 = a(((AppLovinAdBase) appLovinAd).getAdZone());
        synchronized (a2.f2860a) {
            a2.f2861b = null;
            a2.f2862c = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AppLovinAd appLovinAd, final AppLovinAdLoadListener appLovinAdLoadListener) {
        if (((Boolean) this.f2839a.a(com.applovin.impl.sdk.b.b.fg)).booleanValue()) {
            this.f2841c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        appLovinAdLoadListener.adReceived(appLovinAd);
                    } catch (Throwable th) {
                        AppLovinAdServiceImpl.this.f2840b.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
                    }
                }
            });
            return;
        }
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th) {
            this.f2840b.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final AppLovinAd appLovinAd, final AppLovinAdUpdateListener appLovinAdUpdateListener) {
        if (((Boolean) this.f2839a.a(com.applovin.impl.sdk.b.b.fh)).booleanValue()) {
            this.f2841c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        appLovinAdUpdateListener.adUpdated(appLovinAd);
                    } catch (Throwable th) {
                        AppLovinAdServiceImpl.this.f2840b.c("AppLovinAdService", "Unable to notify listener about an updated loaded ad", th);
                    }
                }
            });
            return;
        }
        try {
            appLovinAdUpdateListener.adUpdated(appLovinAd);
        } catch (Throwable th) {
            this.f2840b.c("AppLovinAdService", "Unable to notify listener about an updated loaded ad", th);
        }
    }

    private void a(String str, List<com.applovin.impl.sdk.c.a> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.applovin.impl.sdk.c.a> it = list.iterator();
        while (it.hasNext()) {
            a(it.next(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        PowerManager powerManager = (PowerManager) this.f2839a.w().getSystemService("power");
        if (powerManager != null) {
            return powerManager.isScreenOn();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.sdk.ad.d dVar) {
        long i = dVar.i();
        if (i > 0) {
            this.f2839a.C().a(new c(dVar), q.a.MAIN, (i + 2) * 1000);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void addAdUpdateListener(AppLovinAdUpdateListener appLovinAdUpdateListener) {
        addAdUpdateListener(appLovinAdUpdateListener, AppLovinAdSize.BANNER);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void addAdUpdateListener(AppLovinAdUpdateListener appLovinAdUpdateListener, AppLovinAdSize appLovinAdSize) {
        if (appLovinAdUpdateListener == null) {
            throw new IllegalArgumentException("No ad listener specified");
        }
        if (appLovinAdSize == null) {
            throw new IllegalArgumentException("No ad size specified");
        }
        com.applovin.impl.sdk.ad.d a2 = com.applovin.impl.sdk.ad.d.a(appLovinAdSize, AppLovinAdType.REGULAR, this.f2839a);
        b a3 = a(a2);
        boolean z = false;
        synchronized (a3.f2860a) {
            if (a3.f2862c > 0 && !a3.e.contains(appLovinAdUpdateListener)) {
                a3.e.add(appLovinAdUpdateListener);
                z = true;
                this.f2840b.a("AppLovinAdService", "Added update listener: " + appLovinAdUpdateListener);
            }
        }
        if (z) {
            this.f2839a.C().a(new c(a2), q.a.MAIN);
        }
    }

    public AppLovinAd dequeueAd(com.applovin.impl.sdk.ad.d dVar) {
        AppLovinAd appLovinAd = (AppLovinAd) this.f2839a.L().d(dVar);
        this.f2840b.a("AppLovinAdService", "Dequeued ad: " + appLovinAd + " for zone: " + dVar + "...");
        return appLovinAd;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        com.applovin.impl.sdk.ad.f fVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                fVar = this.f2839a.G().a(((Integer) this.f2839a.a(com.applovin.impl.sdk.b.b.aC)).intValue());
            } catch (Throwable th) {
                this.f2840b.b("AppLovinAdService", "Encountered error while generating bid token", th);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                fVar = null;
            }
            if (fVar == null) {
                return "";
            }
            if (TextUtils.isEmpty(fVar.a())) {
                this.f2840b.d("AppLovinAdService", "Failed to generate bid token");
            } else {
                this.f2840b.a("AppLovinAdService", "Generated bid token: " + fVar);
            }
            if (!fVar.b()) {
                this.f2840b.e("AppLovinAdService", "Bid token generated too early in session - please initialize the SDK first. Not doing so can negatively impact your eCPMs!");
            }
            return fVar.a();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public boolean hasPreloadedAd(AppLovinAdSize appLovinAdSize) {
        return this.f2839a.L().g(com.applovin.impl.sdk.ad.d.a(appLovinAdSize, AppLovinAdType.REGULAR, this.f2839a));
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public boolean hasPreloadedAdForZoneId(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f2840b.e("AppLovinAdService", "Unable to check if ad is preloaded - invalid zone id");
            return false;
        }
        return this.f2839a.L().g(com.applovin.impl.sdk.ad.d.a(str, this.f2839a));
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(com.applovin.impl.sdk.ad.d.a(appLovinAdSize, AppLovinAdType.REGULAR, this.f2839a), appLovinAdLoadListener);
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2840b.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        a(com.applovin.impl.sdk.ad.d.a(appLovinAdSize, AppLovinAdType.REGULAR, str, this.f2839a), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        com.applovin.impl.sdk.d.a rVar;
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            this.f2840b.e("AppLovinAdService", "Invalid ad token specified");
            a(-8, appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.sdk.ad.c cVar = new com.applovin.impl.sdk.ad.c(trim, this.f2839a);
        if (cVar.b() != c.a.REGULAR) {
            if (cVar.b() == c.a.AD_RESPONSE_JSON) {
                JSONObject d2 = cVar.d();
                if (d2 != null) {
                    com.applovin.impl.sdk.e.e.f(d2, this.f2839a);
                    com.applovin.impl.sdk.e.e.d(d2, this.f2839a);
                    com.applovin.impl.sdk.e.e.c(d2, this.f2839a);
                    if (com.applovin.impl.sdk.e.f.a(d2, "ads", new JSONArray(), this.f2839a).length() <= 0) {
                        this.f2840b.d("AppLovinAdService", "No ad returned from the server for token: " + cVar);
                        appLovinAdLoadListener.failedToReceiveAd(204);
                        return;
                    }
                    this.f2840b.a("AppLovinAdService", "Rendering ad for token: " + cVar);
                    rVar = new com.applovin.impl.sdk.d.r(d2, com.applovin.impl.sdk.e.l.a(d2, this.f2839a), com.applovin.impl.sdk.ad.b.DECODED_AD_TOKEN_JSON, appLovinAdLoadListener, this.f2839a);
                } else {
                    this.f2840b.d("AppLovinAdService", "Unable to retrieve ad response JSON from token: " + cVar);
                }
            } else {
                this.f2840b.e("AppLovinAdService", "Invalid ad token specified: " + cVar);
            }
            appLovinAdLoadListener.failedToReceiveAd(-8);
            return;
        }
        this.f2840b.a("AppLovinAdService", "Loading next ad for token: " + cVar);
        rVar = new com.applovin.impl.sdk.d.o(cVar, appLovinAdLoadListener, this.f2839a);
        a(rVar, appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        this.f2840b.a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        a(com.applovin.impl.sdk.ad.d.a(str, this.f2839a), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneIds(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener) {
        List<String> a2 = com.applovin.impl.sdk.e.c.a(list);
        if (a2 == null || a2.isEmpty()) {
            this.f2840b.e("AppLovinAdService", "No zones were provided");
            a(-7, appLovinAdLoadListener);
            return;
        }
        this.f2840b.a("AppLovinAdService", "Loading next ad for zones: " + a2);
        a(new com.applovin.impl.sdk.d.l(a2, appLovinAdLoadListener, this.f2839a), appLovinAdLoadListener);
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2840b.a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        a(com.applovin.impl.sdk.ad.d.c(str, this.f2839a), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void preloadAd(AppLovinAdSize appLovinAdSize) {
        this.f2839a.a();
        this.f2839a.L().i(com.applovin.impl.sdk.ad.d.a(appLovinAdSize, AppLovinAdType.REGULAR, this.f2839a));
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void preloadAdForZoneId(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f2840b.e("AppLovinAdService", "Unable to preload ad for invalid zone identifier");
            return;
        }
        com.applovin.impl.sdk.ad.d a2 = com.applovin.impl.sdk.ad.d.a(str, this.f2839a);
        this.f2839a.L().h(a2);
        this.f2839a.L().i(a2);
    }

    public void preloadAds(com.applovin.impl.sdk.ad.d dVar) {
        this.f2839a.L().h(dVar);
        int g = dVar.g();
        if (g == 0 && this.f2839a.L().b(dVar)) {
            g = 1;
        }
        this.f2839a.L().b(dVar, g);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void removeAdUpdateListener(AppLovinAdUpdateListener appLovinAdUpdateListener, AppLovinAdSize appLovinAdSize) {
        if (appLovinAdSize == null) {
            throw new IllegalArgumentException("No ad size specified");
        }
        if (appLovinAdUpdateListener == null) {
            return;
        }
        b a2 = a(com.applovin.impl.sdk.ad.d.a(appLovinAdSize, AppLovinAdType.REGULAR, this.f2839a));
        synchronized (a2.f2860a) {
            if (a2.e.contains(appLovinAdUpdateListener)) {
                a2.e.remove(appLovinAdUpdateListener);
                this.f2840b.a("AppLovinAdService", "Removed update listener: " + appLovinAdUpdateListener);
            }
        }
    }

    public void trackAndLaunchClick(AppLovinAd appLovinAd, String str, AppLovinAdView appLovinAdView, AdViewControllerImpl adViewControllerImpl, Uri uri) {
        if (appLovinAd == null) {
            this.f2840b.d("AppLovinAdService", "Unable to track ad view click. No ad specified");
            return;
        }
        this.f2840b.a("AppLovinAdService", "Tracking click on an ad...");
        com.applovin.impl.sdk.ad.g gVar = (com.applovin.impl.sdk.ad.g) appLovinAd;
        a(str, gVar.ai());
        a(uri, gVar, appLovinAdView, adViewControllerImpl);
    }

    public void trackAndLaunchForegroundClick(AppLovinAd appLovinAd, String str, final AppLovinAdView appLovinAdView, final AdViewControllerImpl adViewControllerImpl, final Uri uri) {
        if (appLovinAd == null) {
            this.f2840b.d("AppLovinAdService", "Unable to track foreground click. No ad specified");
            return;
        }
        this.f2840b.a("AppLovinAdService", "Tracking foreground click on an ad...");
        final com.applovin.impl.sdk.ad.g gVar = (com.applovin.impl.sdk.ad.g) appLovinAd;
        int intValue = ((Integer) this.f2839a.a(com.applovin.impl.sdk.b.b.cd)).intValue();
        int intValue2 = ((Integer) this.f2839a.a(com.applovin.impl.sdk.b.b.ce)).intValue();
        int intValue3 = ((Integer) this.f2839a.a(com.applovin.impl.sdk.b.b.cf)).intValue();
        List<com.applovin.impl.sdk.c.a> ai = gVar.ai();
        if (ai == null || ai.isEmpty()) {
            this.f2840b.c("AppLovinAdService", "Unable to submit postback for AD #" + appLovinAd.getAdIdNumber() + ". Missing click tracking URL.");
            return;
        }
        AppLovinPostbackListener appLovinPostbackListener = new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.4
            private final AtomicBoolean f = new AtomicBoolean(false);
            private final AtomicBoolean g = new AtomicBoolean(false);

            @Override // com.applovin.sdk.AppLovinPostbackListener
            public void onPostbackFailure(String str2, int i) {
                AppLovinAdServiceImpl.this.f2841c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AnonymousClass4.this.g.compareAndSet(false, true)) {
                            adViewControllerImpl.removeClickTrackingOverlay();
                        }
                    }
                });
            }

            @Override // com.applovin.sdk.AppLovinPostbackListener
            public void onPostbackSuccess(String str2) {
                AppLovinAdServiceImpl.this.f2841c.post(new Runnable() { // from class: com.applovin.impl.sdk.AppLovinAdServiceImpl.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (adViewControllerImpl.isForegroundClickInvalidated() || !AnonymousClass4.this.f.compareAndSet(false, true)) {
                            return;
                        }
                        AppLovinAdServiceImpl.this.a(uri, gVar, appLovinAdView, adViewControllerImpl);
                    }
                });
            }
        };
        for (com.applovin.impl.sdk.c.a aVar : ai) {
            if (com.applovin.impl.sdk.e.i.b(aVar.a())) {
                this.f2839a.J().dispatchPostbackRequest(com.applovin.impl.sdk.network.f.b(this.f2839a).a(com.applovin.impl.sdk.e.l.a(str, aVar.a())).c(com.applovin.impl.sdk.e.i.b(aVar.b()) ? com.applovin.impl.sdk.e.l.a(str, aVar.b()) : null).a(intValue).c(intValue2).b(intValue3).a(false).a(), appLovinPostbackListener);
            } else {
                this.f2840b.c("AppLovinAdService", "Requested a postback dispatch for an empty click URL; nothing to do...");
            }
        }
    }

    public void trackAndLaunchVideoClick(AppLovinAd appLovinAd, String str, AppLovinAdView appLovinAdView, Uri uri) {
        if (appLovinAd == null) {
            this.f2840b.d("AppLovinAdService", "Unable to track video click. No ad specified");
            return;
        }
        this.f2840b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
        a(str, ((com.applovin.impl.sdk.ad.g) appLovinAd).aj());
        com.applovin.impl.sdk.e.l.a(appLovinAdView.getContext(), uri, this.f2839a);
    }

    public void trackImpression(com.applovin.impl.sdk.ad.g gVar, String str) {
        if (gVar == null) {
            this.f2840b.d("AppLovinAdService", "Unable to track impression click. No ad specified");
        } else {
            this.f2840b.a("AppLovinAdService", "Tracking impression on ad...");
            a(str, gVar.ak());
        }
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.g gVar, String str, int i, boolean z) {
        if (gVar == null) {
            this.f2840b.d("AppLovinAdService", "Unable to track video end. No ad specified");
            return;
        }
        this.f2840b.a("AppLovinAdService", "Tracking video end on ad...");
        List<com.applovin.impl.sdk.c.a> ah = gVar.ah();
        if (ah == null || ah.isEmpty()) {
            this.f2840b.c("AppLovinAdService", "Unable to submit persistent postback for AD #" + gVar.getAdIdNumber() + ". Missing video end tracking URL.");
            return;
        }
        String l = Long.toString(System.currentTimeMillis());
        for (com.applovin.impl.sdk.c.a aVar : ah) {
            if (com.applovin.impl.sdk.e.i.b(aVar.a())) {
                String a2 = a(aVar.a(), i, l, z);
                String a3 = a(aVar.b(), i, l, z);
                if (a2 != null) {
                    a(new com.applovin.impl.sdk.c.a(a2, a3), str);
                } else {
                    this.f2840b.d("AppLovinAdService", "Failed to parse url: " + aVar.a());
                }
            } else {
                this.f2840b.c("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }
}
