package com.tapjoy;

import android.content.Context;
import android.os.SystemClock;
import com.aiming.mdt.utils.Constants;
import com.mopub.common.AdType;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.b;
import com.tapjoy.internal.cb;
import com.tapjoy.internal.fc;
import com.tapjoy.internal.fj;
import com.tapjoy.internal.fn;
import com.tapjoy.internal.fr;
import com.tapjoy.internal.fv;
import com.tapjoy.internal.fw;
import com.tapjoy.internal.fx;
import com.tapjoy.internal.gb;
import com.tapjoy.internal.gg;
import com.tapjoy.internal.gj;
import com.tapjoy.internal.gw;
import com.tapjoy.internal.gx;
import com.tapjoy.internal.ha;
import com.tapjoy.internal.hf;
import com.tapjoy.internal.hh;
import com.tapjoy.internal.hi;
import com.tapjoy.internal.hj;
import com.tapjoy.internal.ik;
import com.tapjoy.internal.jr;
import com.tapjoy.internal.v;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TJCorePlacement {

    /* renamed from: a, reason: collision with root package name */
    static final String f7679a = "TJCorePlacement";

    /* renamed from: c, reason: collision with root package name */
    TJPlacementData f7681c;

    /* renamed from: d, reason: collision with root package name */
    String f7682d;
    long e;
    TJAdUnit g;
    boolean j;
    String m;
    String n;
    String o;
    String p;
    HashMap q;
    private Map s;
    private fn t;
    private boolean y;
    private Map r = new HashMap();
    final fx f = new fx();
    boolean h = false;
    private boolean u = false;
    private ik v = null;
    hh i = null;
    private volatile boolean w = false;
    private volatile boolean x = false;
    volatile boolean k = false;
    volatile boolean l = false;
    private TJAdUnit.TJAdUnitWebViewListener z = new TJAdUnit.TJAdUnitWebViewListener() { // from class: com.tapjoy.TJCorePlacement.1
        @Override // com.tapjoy.TJAdUnit.TJAdUnitWebViewListener
        public final void onContentReady() {
            TJCorePlacement.this.e();
        }

        @Override // com.tapjoy.TJAdUnit.TJAdUnitWebViewListener
        public final void onClosed() {
            if (TJCorePlacement.this.h) {
                TJPlacementManager.decrementPlacementCacheCount();
                TJCorePlacement.c(TJCorePlacement.this);
            }
            if (TJCorePlacement.this.u) {
                TJPlacementManager.decrementPlacementPreRenderCount();
                TJCorePlacement.this.u = false;
            }
        }

        @Override // com.tapjoy.TJAdUnit.TJAdUnitWebViewListener
        public final void onClick() {
            TJCorePlacement.e(TJCorePlacement.this);
        }
    };
    private TJAdUnit.TJAdUnitVideoListener A = new TJAdUnit.TJAdUnitVideoListener() { // from class: com.tapjoy.TJCorePlacement.2
        @Override // com.tapjoy.TJAdUnit.TJAdUnitVideoListener
        public final void onVideoStart() {
            TJPlacement a2 = TJCorePlacement.this.a("SHOW");
            if (a2 == null || a2.getVideoListener() == null) {
                return;
            }
            a2.getVideoListener().onVideoStart(a2);
        }

        @Override // com.tapjoy.TJAdUnit.TJAdUnitVideoListener
        public final void onVideoCompleted() {
            TJPlacement a2 = TJCorePlacement.this.a("SHOW");
            if (a2 == null || a2.getVideoListener() == null) {
                return;
            }
            a2.getVideoListener().onVideoComplete(a2);
        }

        @Override // com.tapjoy.TJAdUnit.TJAdUnitVideoListener
        public final void onVideoError(String str) {
            TJPlacement a2 = TJCorePlacement.this.a("SHOW");
            if (a2 == null || a2.getVideoListener() == null) {
                return;
            }
            a2.getVideoListener().onVideoError(a2, str);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    Context f7680b = b.c();

    static /* synthetic */ boolean c(TJCorePlacement tJCorePlacement) {
        tJCorePlacement.h = false;
        return false;
    }

    static /* synthetic */ boolean m(TJCorePlacement tJCorePlacement) {
        tJCorePlacement.w = false;
        return false;
    }

    TJCorePlacement(String str, String str2, boolean z) {
        if (this.f7680b == null) {
            TapjoyLog.d(f7679a, "getVisibleActivity() is NULL. Activity can be explicitly set via `Tapjoy.setActivity(Activity)`");
        }
        this.y = z;
        this.f7681c = new TJPlacementData(str2, getPlacementContentUrl());
        this.f7681c.setPlacementName(str);
        this.f7682d = UUID.randomUUID().toString();
        this.g = new TJAdUnit();
        this.g.setWebViewListener(this.z);
        this.g.setVideoListener(this.A);
    }

    final void a(TJPlacement tJPlacement) {
        boolean z = false;
        if (tJPlacement == null) {
            a(TapjoyErrorMessage.ErrorType.SDK_ERROR, new TJError(0, "Cannot request content from a NULL placement"));
            return;
        }
        a("REQUEST", tJPlacement);
        if (this.e - SystemClock.elapsedRealtime() > 0) {
            TapjoyLog.d(f7679a, "Content has not expired yet for " + this.f7681c.getPlacementName());
            if (this.k) {
                gg.b("TJPlacement.requestContent").a("content_type", a()).a("from", "cache").c();
                this.x = false;
                b(tJPlacement);
                e();
                return;
            }
            gg.b("TJPlacement.requestContent").a("content_type", "none").a("from", "cache").c();
            b(tJPlacement);
            return;
        }
        if (this.k) {
            gg.c("TJPlacement.requestContent").a("was_available", (Object) true);
        }
        if (this.l) {
            gg.c("TJPlacement.requestContent").a("was_ready", (Object) true);
        }
        if (!jr.c(this.o)) {
            HashMap hashMap = new HashMap();
            hashMap.put(TJAdUnitConstants.PARAM_PLACEMENT_MEDIATION_AGENT, this.o);
            hashMap.put(TJAdUnitConstants.PARAM_PLACEMENT_MEDIATION_ID, this.p);
            if (this.q != null && !this.q.isEmpty()) {
                z = true;
            }
            if (z) {
                for (String str : this.q.keySet()) {
                    hashMap.put(TJAdUnitConstants.AUCTION_PARAM_PREFIX + str, this.q.get(str));
                }
                a(this.f7681c.getAuctionMediationURL(), hashMap);
                return;
            }
            a(this.f7681c.getMediationURL(), hashMap);
            return;
        }
        d();
    }

    private synchronized void d() {
        String url = this.f7681c.getUrl();
        if (jr.c(url)) {
            url = getPlacementContentUrl();
            if (jr.c(url)) {
                gg.b("TJPlacement.requestContent").a("TJPlacement is missing APP_ID").c();
                a(TapjoyErrorMessage.ErrorType.SDK_ERROR, new TJError(0, "TJPlacement is missing APP_ID"));
                return;
            }
            this.f7681c.updateUrl(url);
        }
        TapjoyLog.d(f7679a, "sendContentRequest -- URL: " + url + " name: " + this.f7681c.getPlacementName());
        a(url, (Map) null);
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [com.tapjoy.TJCorePlacement$3] */
    private synchronized void a(final String str, Map map) {
        if (this.w) {
            TapjoyLog.i(f7679a, "Placement " + this.f7681c.getPlacementName() + " is already requesting content");
            gg.b("TJPlacement.requestContent").b("already doing").c();
            return;
        }
        this.f7681c.resetPlacementRequestData();
        fx fxVar = this.f;
        String str2 = null;
        fxVar.f8135b = null;
        fxVar.f8137d = null;
        fxVar.f8134a = null;
        this.g.resetContentLoadState();
        this.w = false;
        this.x = false;
        this.k = false;
        this.l = false;
        this.i = null;
        this.v = null;
        this.w = true;
        final TJPlacement a2 = a("REQUEST");
        if (!this.y) {
            this.s = TapjoyConnectCore.getGenericURLParams();
            this.s.putAll(TapjoyConnectCore.getTimeStampAndVerifierParams());
        } else {
            this.s = TapjoyConnectCore.getLimitedGenericURLParams();
            this.s.putAll(TapjoyConnectCore.getLimitedTimeStampAndVerifierParams());
        }
        TapjoyUtil.safePut(this.s, TJAdUnitConstants.PARAM_PLACEMENT_NAME, this.f7681c.getPlacementName(), true);
        TapjoyUtil.safePut(this.s, TJAdUnitConstants.PARAM_PLACEMENT_PRELOAD, "true", true);
        TapjoyUtil.safePut(this.s, "debug", Boolean.toString(gx.f8223a), true);
        ha a3 = ha.a();
        Map map2 = this.s;
        if (a3.f8235b != null) {
            hj hjVar = a3.f8235b;
            hjVar.b();
            str2 = hjVar.f8284b.a();
        }
        TapjoyUtil.safePut(map2, TJAdUnitConstants.PARAM_ACTION_ID_EXCLUSION, str2, true);
        TapjoyUtil.safePut(this.s, TJAdUnitConstants.PARAM_PLACEMENT_BY_SDK, String.valueOf(this.j), true);
        TapjoyUtil.safePut(this.s, TJAdUnitConstants.PARAM_PUSH_ID, a2.pushId, true);
        TapjoyUtil.safePut(this.s, TapjoyConstants.TJC_MEDIATION_SOURCE, this.m, true);
        TapjoyUtil.safePut(this.s, TapjoyConstants.TJC_ADAPTER_VERSION, this.n, true);
        if (map != null) {
            this.s.putAll(map);
        }
        final fj fjVar = new fj(gb.b().c("placement_request_content_retry_timeout"));
        final gj d2 = gb.b().d("placement_request_content_retry_backoff");
        final gg.a d3 = gg.d("TJPlacement.requestContent");
        new Thread() { // from class: com.tapjoy.TJCorePlacement.3
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                gg.a("TJPlacement.requestContent", d3);
                int i = 0;
                while (!a()) {
                    i++;
                    TJCorePlacement.this.s.put(TapjoyConstants.TJC_RETRY, Integer.toString(i));
                    if (i == 1) {
                        d3.a("retry_timeout", Long.valueOf(fjVar.f8096b));
                    }
                    d3.a("retry_count", i);
                }
            }

            private boolean a() {
                TapjoyLog.i(TJCorePlacement.f7679a, "Sending content request for placement " + TJCorePlacement.g(TJCorePlacement.this));
                TJCorePlacement tJCorePlacement = TJCorePlacement.this;
                ha a4 = ha.a();
                String g = TJCorePlacement.g(TJCorePlacement.this);
                Context context = TJCorePlacement.this.f7680b;
                hi hiVar = a4.f8234a;
                fc a5 = hiVar.f8279a.a(false);
                tJCorePlacement.v = new ik(hiVar.f8279a, a5.f8070d, a5.e, a5.f, g, context);
                TapjoyHttpURLResponse responseFromURL = new TapjoyURLConnection().getResponseFromURL(str, (Map) null, (Map) null, TJCorePlacement.this.s);
                TJCorePlacement.this.f7681c.setHttpStatusCode(responseFromURL.statusCode);
                TJCorePlacement.this.f7681c.setHttpResponse(responseFromURL.response);
                if (!responseFromURL.getHeaderFieldAsString(TapjoyConstants.TAPJOY_PRERENDER_HEADER).equals("0")) {
                    TJCorePlacement.this.f7681c.setPrerenderingRequested(true);
                }
                String headerFieldAsString = responseFromURL.getHeaderFieldAsString(TapjoyConstants.TAPJOY_DEBUG_HEADER);
                if (headerFieldAsString != null) {
                    TapjoyLog.v(TJCorePlacement.f7679a, "Tapjoy-Server-Debug: " + headerFieldAsString);
                }
                if (responseFromURL.expires <= 0) {
                    TJCorePlacement.this.e = 0L;
                } else {
                    long b2 = responseFromURL.expires - (responseFromURL.date > 0 ? responseFromURL.date : v.b());
                    if (b2 > 0) {
                        TJCorePlacement.this.e = SystemClock.elapsedRealtime() + b2;
                    }
                }
                if (responseFromURL != null && a2.getListener() != null) {
                    int i = responseFromURL.statusCode;
                    if (i != 0) {
                        if (i == 200) {
                            TJCorePlacement.j(TJCorePlacement.this);
                            String headerFieldAsString2 = responseFromURL.getHeaderFieldAsString(Constants.KEY_CONTENT_TYPE);
                            if (!jr.c(headerFieldAsString2) && headerFieldAsString2.contains(AdType.STATIC_NATIVE)) {
                                if (!responseFromURL.getHeaderFieldAsString(TapjoyConstants.TAPJOY_DISABLE_PRELOAD_HEADER).equals("1")) {
                                    if (TJCorePlacement.this.b(responseFromURL.response)) {
                                        gg.b("TJPlacement.requestContent").a("content_type", "mm").c();
                                        TJCorePlacement.l(TJCorePlacement.this);
                                        TJCorePlacement.this.e();
                                    } else {
                                        gg.b("TJPlacement.requestContent").a("asset error").c();
                                        TJCorePlacement.this.a(a2, TapjoyErrorMessage.ErrorType.SERVER_ERROR, new TJError(responseFromURL.statusCode, responseFromURL.response));
                                    }
                                } else {
                                    try {
                                        TJCorePlacement.a(TJCorePlacement.this, responseFromURL.response);
                                        gg.b("TJPlacement.requestContent").a("content_type", "ad").c();
                                        TJCorePlacement.this.f.f8134a = TJCorePlacement.this.t;
                                        TJCorePlacement.l(TJCorePlacement.this);
                                        TJCorePlacement.this.e();
                                    } catch (TapjoyException e) {
                                        String str3 = e.getMessage() + " for placement " + TJCorePlacement.g(TJCorePlacement.this);
                                        gg.b("TJPlacement.requestContent").a("server error").c();
                                        TJCorePlacement.this.a(a2, TapjoyErrorMessage.ErrorType.SERVER_ERROR, new TJError(responseFromURL.statusCode, str3));
                                    }
                                }
                            } else {
                                gg.b("TJPlacement.requestContent").a("content_type", "ad").c();
                                TJCorePlacement.this.f.f8134a = TJCorePlacement.this.t;
                                TJCorePlacement.l(TJCorePlacement.this);
                                final TJCorePlacement tJCorePlacement2 = TJCorePlacement.this;
                                final TJCacheListener tJCacheListener = new TJCacheListener() { // from class: com.tapjoy.TJCorePlacement.3.1
                                    @Override // com.tapjoy.TJCacheListener
                                    public final void onCachingComplete(int i2) {
                                        TJCorePlacement.this.u = TJCorePlacement.this.getAdUnit().preload(TJCorePlacement.this.f7681c, TJCorePlacement.this.f7680b);
                                    }
                                };
                                TapjoyLog.i(TJCorePlacement.f7679a, "Checking if there is content to cache for placement " + tJCorePlacement2.f7681c.getPlacementName());
                                String headerFieldAsString3 = responseFromURL.getHeaderFieldAsString(TapjoyConstants.TAPJOY_CACHE_HEADER);
                                try {
                                    if (!TJPlacementManager.canCachePlacement()) {
                                        TapjoyLog.i(TJCorePlacement.f7679a, "Placement caching limit reached. No content will be cached for placement " + tJCorePlacement2.f7681c.getPlacementName());
                                        tJCacheListener.onCachingComplete(2);
                                    } else {
                                        JSONArray jSONArray = new JSONArray(headerFieldAsString3);
                                        if (jSONArray.length() > 0) {
                                            TapjoyLog.i(TJCorePlacement.f7679a, "Begin caching content for placement " + tJCorePlacement2.f7681c.getPlacementName());
                                            TJPlacementManager.incrementPlacementCacheCount();
                                            tJCorePlacement2.h = true;
                                            TapjoyCache.getInstance().cacheAssetGroup(jSONArray, new TJCacheListener() { // from class: com.tapjoy.TJCorePlacement.6
                                                @Override // com.tapjoy.TJCacheListener
                                                public final void onCachingComplete(int i2) {
                                                    tJCacheListener.onCachingComplete(i2);
                                                }
                                            });
                                        } else {
                                            tJCacheListener.onCachingComplete(1);
                                        }
                                    }
                                } catch (Exception e2) {
                                    tJCacheListener.onCachingComplete(2);
                                    TapjoyLog.d(TJCorePlacement.f7679a, "Error while handling placement cache: " + e2.getMessage());
                                }
                            }
                        } else {
                            gg.b("TJPlacement.requestContent").a("content_type", "none").a("code", Integer.valueOf(responseFromURL.statusCode)).c();
                            TJCorePlacement.this.b(a2);
                        }
                    } else if (fjVar.a(d2.e)) {
                        gg.b("TJPlacement.requestContent").a("network error").a("retry_timeout", Long.valueOf(fjVar.f8096b)).c();
                        TJCorePlacement.this.a(a2, TapjoyErrorMessage.ErrorType.NETWORK_ERROR, new TJError(responseFromURL.statusCode, responseFromURL.response));
                    } else {
                        gj gjVar = d2;
                        long j = gjVar.e;
                        double d4 = gjVar.e;
                        double d5 = gjVar.f8203d;
                        Double.isNaN(d4);
                        long j2 = (long) (d4 * d5);
                        if (j2 < gjVar.f8201b) {
                            j2 = gjVar.f8201b;
                        } else if (j2 > gjVar.f8202c) {
                            j2 = gjVar.f8202c;
                        }
                        gjVar.e = j2;
                        if (j > 0) {
                            synchronized (gjVar) {
                                try {
                                    gjVar.wait(j);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                        return false;
                    }
                }
                TJCorePlacement.m(TJCorePlacement.this);
                return true;
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        try {
            ik.a aVar = (ik.a) this.v.a(URI.create(this.f7681c.getUrl()), new ByteArrayInputStream(str.getBytes()));
            this.i = aVar.f8384a;
            aVar.f8384a.b();
            if (!aVar.f8384a.c()) {
                TapjoyLog.e(f7679a, "Failed to load fiverocks placement");
                return false;
            }
            fr frVar = null;
            if (this.i instanceof hf) {
                frVar = new fv(this.f7681c.getPlacementName(), this.f7681c.getPlacementType(), this.t);
            } else if (this.i instanceof gw) {
                frVar = new fw(this.f7681c.getPlacementName(), this.f7681c.getPlacementType(), this.t);
            }
            this.f.f8134a = frVar;
            return true;
        } catch (cb e) {
            TapjoyLog.e(f7679a, e.toString());
            e.printStackTrace();
            return false;
        } catch (IOException e2) {
            TapjoyLog.e(f7679a, e2.toString());
            e2.printStackTrace();
            return false;
        }
    }

    public Context getContext() {
        return this.f7680b;
    }

    public void setContext(Context context) {
        this.f7680b = context;
    }

    public TJAdUnit getAdUnit() {
        return this.g;
    }

    public TJPlacementData getPlacementData() {
        return this.f7681c;
    }

    public boolean isContentReady() {
        return this.l;
    }

    public boolean isContentAvailable() {
        return this.k;
    }

    public String getPlacementContentUrl() {
        String b2 = b();
        if (!jr.c(b2)) {
            return TapjoyConnectCore.getPlacementURL() + "v1/apps/" + b2 + "/content?";
        }
        TapjoyLog.i(f7679a, "Placement content URL cannot be generated for null app ID");
        return "";
    }

    final String a() {
        return this.i != null ? "mm" : this.k ? "ad" : "none";
    }

    final void a(String str, TJPlacement tJPlacement) {
        synchronized (this.r) {
            this.r.put(str, tJPlacement);
            if (tJPlacement != null) {
                TapjoyLog.d(f7679a, "Setting " + str + " placement: " + tJPlacement.getGUID());
            }
        }
    }

    final TJPlacement a(String str) {
        TJPlacement tJPlacement;
        synchronized (this.r) {
            tJPlacement = (TJPlacement) this.r.get(str);
            if (tJPlacement != null) {
                TapjoyLog.d(f7679a, "Returning " + str + " placement: " + tJPlacement.getGUID());
            }
        }
        return tJPlacement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(TJPlacement tJPlacement) {
        fx fxVar = this.f;
        String placementName = this.f7681c.getPlacementName();
        String placementType = this.f7681c.getPlacementType();
        String a2 = a();
        fxVar.f8136c = 0;
        fxVar.f8135b = gg.e("PlacementContent.funnel").a().a("placement", placementName).a("placement_type", placementType).a("content_type", a2).a("state", Integer.valueOf(fxVar.f8136c));
        fxVar.f8135b.c();
        if (!"none".equals(a2)) {
            fxVar.e = gg.e("PlacementContent.ready").a().a("placement", placementName).a("placement_type", placementType).a("content_type", a2);
        }
        if (tJPlacement == null || tJPlacement.getListener() == null) {
            return;
        }
        TapjoyLog.i(f7679a, "Content request delivered successfully for placement " + this.f7681c.getPlacementName() + ", contentAvailable: " + isContentAvailable() + ", mediationAgent: " + this.o);
        tJPlacement.getListener().onRequestSuccess(tJPlacement);
    }

    final void a(TapjoyErrorMessage.ErrorType errorType, TJError tJError) {
        a(a("REQUEST"), errorType, tJError);
    }

    final void a(TJPlacement tJPlacement, TapjoyErrorMessage.ErrorType errorType, TJError tJError) {
        TapjoyLog.e(f7679a, new TapjoyErrorMessage(errorType, "Content request failed for placement " + this.f7681c.getPlacementName() + "; Reason= " + tJError.message));
        if (tJPlacement == null || tJPlacement.getListener() == null) {
            return;
        }
        tJPlacement.getListener().onRequestFailure(tJPlacement, tJError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.x) {
            return;
        }
        this.l = true;
        TapjoyLog.i(f7679a, "Content is ready for placement " + this.f7681c.getPlacementName());
        if (this.g.isPrerendered()) {
            fx fxVar = this.f;
            gg.a aVar = fxVar.f8135b;
            if (aVar != null) {
                aVar.a("prerendered", (Object) true);
            }
            gg.a aVar2 = fxVar.e;
            if (aVar2 != null) {
                aVar2.a("prerendered", (Object) true);
            }
        }
        fx fxVar2 = this.f;
        gg.a aVar3 = fxVar2.e;
        if (aVar3 != null) {
            fxVar2.e = null;
            aVar3.b().c();
        }
        TJPlacement a2 = a("REQUEST");
        if (a2 == null || a2.getListener() == null) {
            return;
        }
        a2.getListener().onContentReady(a2);
        this.x = true;
    }

    public boolean isLimited() {
        return this.y;
    }

    final String b() {
        if (!this.y) {
            return TapjoyConnectCore.getAppID();
        }
        return TapjoyConnectCore.getLimitedAppID();
    }

    static /* synthetic */ void e(TJCorePlacement tJCorePlacement) {
        TJPlacement a2 = tJCorePlacement.a("SHOW");
        TapjoyLog.i(f7679a, "Handle onClick for placement " + tJCorePlacement.f7681c.getPlacementName());
        if (a2 == null || a2.getListener() == null) {
            return;
        }
        a2.getListener().onClick(a2);
    }

    static /* synthetic */ String g(TJCorePlacement tJCorePlacement) {
        return tJCorePlacement.f7681c.getPlacementName();
    }

    static /* synthetic */ void j(TJCorePlacement tJCorePlacement) {
        tJCorePlacement.t = new fn(tJCorePlacement.f7681c.getPlacementName(), tJCorePlacement.f7681c.getPlacementType());
        tJCorePlacement.g.setAdContentTracker(tJCorePlacement.t);
    }

    static /* synthetic */ void a(TJCorePlacement tJCorePlacement, String str) {
        if (str != null) {
            try {
                TapjoyLog.d(f7679a, "Disable preload flag is set for placement " + tJCorePlacement.f7681c.getPlacementName());
                tJCorePlacement.f7681c.setRedirectURL(new JSONObject(str).getString(TapjoyConstants.TJC_REDIRECT_URL));
                tJCorePlacement.f7681c.setPreloadDisabled(true);
                tJCorePlacement.f7681c.setHasProgressSpinner(true);
                TapjoyLog.d(f7679a, "redirect_url:" + tJCorePlacement.f7681c.getRedirectURL());
                return;
            } catch (JSONException unused) {
                throw new TapjoyException("TJPlacement request failed, malformed server response");
            }
        }
        throw new TapjoyException("TJPlacement request failed due to null response");
    }

    static /* synthetic */ void l(TJCorePlacement tJCorePlacement) {
        tJCorePlacement.k = true;
        tJCorePlacement.b(tJCorePlacement.a("REQUEST"));
    }
}
