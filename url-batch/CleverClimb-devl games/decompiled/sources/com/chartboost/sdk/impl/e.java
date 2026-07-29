package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import android.os.Handler;
import com.applovin.mediation.AppLovinNativeAdapter;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.c;
import com.chartboost.sdk.c.RunnableC0317c;
import com.chartboost.sdk.impl.aj;
import com.chartboost.sdk.impl.c.a;
import com.mopub.mobileads.GooglePlayServicesInterstitial;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    final ScheduledExecutorService f3816a;

    /* renamed from: b, reason: collision with root package name */
    public final com.chartboost.sdk.Libraries.f f3817b;

    /* renamed from: c, reason: collision with root package name */
    final com.chartboost.sdk.Libraries.i f3818c;

    /* renamed from: d, reason: collision with root package name */
    final Handler f3819d;
    final com.chartboost.sdk.c e;
    final c f;
    ScheduledFuture<?> k;
    private final l l;
    private final ah m;
    private final ai n;
    private final ap o;
    private final AtomicReference<com.chartboost.sdk.Model.e> p;
    private final SharedPreferences q;
    private final com.chartboost.sdk.Tracking.a r;
    private final ak s;
    private final com.chartboost.sdk.d t;
    private final al u;
    int g = 0;
    private final long z = TimeUnit.SECONDS.toNanos(5);
    private final long A = TimeUnit.SECONDS.toNanos(1);
    private final String[] B = {"ASKED_TO_CACHE", "ASKED_TO_SHOW", "REQUESTING_TO_CACHE", "REQUESTING_TO_SHOW", "DOWNLOADING_TO_CACHE", "DOWNLOADING_TO_SHOW", "READY", "ASKING_UI_TO_SHOW_AD", "DONE"};
    private int v = 1;
    final Map<String, f> h = new HashMap();
    final SortedSet<f> j = new TreeSet();
    final SortedSet<f> i = new TreeSet();
    private final Map<String, Long> x = new HashMap();
    private final Map<String, Integer> y = new HashMap();
    private boolean w = false;

    public e(c cVar, ScheduledExecutorService scheduledExecutorService, l lVar, com.chartboost.sdk.Libraries.f fVar, ah ahVar, ai aiVar, ap apVar, AtomicReference<com.chartboost.sdk.Model.e> atomicReference, SharedPreferences sharedPreferences, com.chartboost.sdk.Libraries.i iVar, com.chartboost.sdk.Tracking.a aVar, Handler handler, com.chartboost.sdk.c cVar2, ak akVar, com.chartboost.sdk.d dVar, al alVar) {
        this.f3816a = scheduledExecutorService;
        this.l = lVar;
        this.f3817b = fVar;
        this.m = ahVar;
        this.n = aiVar;
        this.o = apVar;
        this.p = atomicReference;
        this.q = sharedPreferences;
        this.f3818c = iVar;
        this.r = aVar;
        this.f3819d = handler;
        this.e = cVar2;
        this.s = akVar;
        this.t = dVar;
        this.u = alVar;
        this.f = cVar;
    }

    void a() {
        if (this.g == 0) {
            this.g = 1;
            b();
        }
    }

    void b() {
        if (this.w) {
            return;
        }
        try {
            this.w = true;
            d();
            if (this.g == 1 && !a(this.j, 1, 3, 1, "show")) {
                a(this.i, 0, 2, 2, "cache");
            }
            c();
        } finally {
            this.w = false;
        }
    }

    private void c() {
        Long l;
        if (this.g == 1) {
            long b2 = this.f3818c.b();
            l = null;
            for (Map.Entry<String, Long> entry : this.x.entrySet()) {
                if (this.h.get(entry.getKey()) != null) {
                    long max = Math.max(this.z, entry.getValue().longValue() - b2);
                    if (l == null || max < l.longValue()) {
                        l = Long.valueOf(max);
                    }
                }
            }
        } else {
            l = null;
        }
        if (l != null && this.k != null) {
            if (Math.abs(l.longValue() - this.k.getDelay(TimeUnit.NANOSECONDS)) <= TimeUnit.SECONDS.toNanos(5L)) {
                return;
            }
        }
        if (this.k != null) {
            this.k.cancel(false);
            this.k = null;
        }
        if (l != null) {
            this.k = this.f3816a.schedule(new a(2, null, null, null), l.longValue(), TimeUnit.NANOSECONDS);
        }
    }

    private boolean a(SortedSet<f> sortedSet, int i, int i2, int i3, String str) {
        Iterator<f> it = sortedSet.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (next.f3832c != i || next.f3833d != null) {
                it.remove();
            } else if (e(next.f3831b)) {
                continue;
            } else if (!this.f.g(next.f3831b)) {
                next.f3832c = 8;
                this.h.remove(next.f3831b);
                it.remove();
            } else {
                next.f3832c = i2;
                it.remove();
                a(next, i3, str);
                return true;
            }
        }
        return false;
    }

    public synchronized com.chartboost.sdk.Model.a a(String str) {
        f fVar = this.h.get(str);
        if (fVar == null || !(fVar.f3832c == 6 || fVar.f3832c == 7)) {
            return null;
        }
        return fVar.f3833d;
    }

    void b(String str) {
        if (e()) {
            c cVar = this.f;
            cVar.getClass();
            this.f3819d.postDelayed(cVar.new a(4, str, CBError.CBImpressionError.FIRST_SESSION_INTERSTITIALS_DISABLED), this.A);
            return;
        }
        f fVar = this.h.get(str);
        if (fVar != null && fVar.f3832c == 6 && !a(fVar.f3833d)) {
            this.h.remove(str);
            fVar = null;
        }
        if (fVar == null) {
            int i = this.v;
            this.v = i + 1;
            fVar = new f(i, str, 0);
            this.h.put(str, fVar);
            this.i.add(fVar);
        }
        fVar.f = true;
        if (fVar.h == null) {
            fVar.h = Long.valueOf(this.f3818c.b());
        }
        switch (fVar.f3832c) {
            case 6:
            case 7:
                Handler handler = this.f3819d;
                c cVar2 = this.f;
                cVar2.getClass();
                handler.post(cVar2.new a(0, str, null));
                break;
        }
        b();
    }

    private boolean a(com.chartboost.sdk.Model.a aVar) {
        File file = this.f3817b.d().f3587a;
        for (com.chartboost.sdk.Model.b bVar : aVar.f3612c.values()) {
            if (!bVar.a(file).exists()) {
                CBLogging.b("AdUnitManager", "Asset does not exist: " + bVar.f3615b);
                return false;
            }
        }
        return true;
    }

    private void d() {
        long b2 = this.f3818c.b();
        Iterator<Long> it = this.x.values().iterator();
        while (it.hasNext()) {
            if (b2 - it.next().longValue() >= 0) {
                it.remove();
            }
        }
    }

    private boolean e(String str) {
        return this.x.containsKey(str);
    }

    private void a(final f fVar, int i, String str) {
        aj ajVar;
        try {
            com.chartboost.sdk.Model.e eVar = this.p.get();
            boolean z = this.f.f3806a == 2;
            boolean z2 = eVar.y && !z;
            final long b2 = this.f3818c.b();
            final boolean z3 = z;
            final boolean z4 = z2;
            aj.a aVar = new aj.a() { // from class: com.chartboost.sdk.impl.e.1
                @Override // com.chartboost.sdk.impl.aj.a
                public void a(aj ajVar2, JSONObject jSONObject) {
                    com.chartboost.sdk.Model.a aVar2;
                    try {
                        fVar.p = Integer.valueOf((int) TimeUnit.NANOSECONDS.toMillis(e.this.f3818c.b() - b2));
                        fVar.q = Integer.valueOf((int) TimeUnit.NANOSECONDS.toMillis(ajVar2.h));
                        fVar.r = Integer.valueOf((int) TimeUnit.NANOSECONDS.toMillis(ajVar2.i));
                        if (z3) {
                            aVar2 = new com.chartboost.sdk.Model.a(0, jSONObject, true);
                        } else if (z4) {
                            aVar2 = new com.chartboost.sdk.Model.a(1, jSONObject, false);
                        } else {
                            aVar2 = new com.chartboost.sdk.Model.a(0, jSONObject, false);
                        }
                        e.this.a(fVar, aVar2);
                    } catch (JSONException e) {
                        com.chartboost.sdk.Tracking.a.a(e.class, "sendAdGetRequest.onSuccess", e);
                        e.this.a(fVar, new CBError(CBError.a.UNEXPECTED_RESPONSE, "Response conversion failure"));
                    }
                }

                @Override // com.chartboost.sdk.impl.aj.a
                public void a(aj ajVar2, CBError cBError) {
                    e.this.a(fVar, cBError);
                }
            };
            boolean z5 = fVar.f3832c == 2;
            if (z) {
                aj ajVar2 = new aj(this.f.f3809d, this.o, this.r, i, aVar);
                ajVar2.l = true;
                ajVar2.a(GooglePlayServicesInterstitial.LOCATION_KEY, fVar.f3831b);
                ajVar2.a("cache", Boolean.valueOf(z5));
                ajVar2.a("raw", (Object) true);
                fVar.e = 0;
                ajVar = ajVar2;
            } else if (z2) {
                am amVar = new am(String.format(this.f.e, eVar.F), this.o, this.r, i, aVar);
                amVar.a("cache_assets", this.f3817b.c(), 0);
                amVar.a(GooglePlayServicesInterstitial.LOCATION_KEY, fVar.f3831b, 0);
                amVar.a("cache", Boolean.valueOf(z5), 0);
                amVar.l = true;
                fVar.e = 1;
                ajVar = amVar;
            } else {
                aj ajVar3 = new aj(this.f.f3809d, this.o, this.r, i, aVar);
                ajVar3.a("local-videos", this.f3817b.b());
                ajVar3.l = true;
                ajVar3.a(GooglePlayServicesInterstitial.LOCATION_KEY, fVar.f3831b);
                ajVar3.a("cache", Boolean.valueOf(z5));
                fVar.e = 0;
                ajVar = ajVar3;
            }
            ajVar.j = 1;
            this.g = 2;
            this.m.a(ajVar);
            this.r.a(this.f.a(fVar.e.intValue()), str, fVar.f3831b);
        } catch (Exception e) {
            com.chartboost.sdk.Tracking.a.a(getClass(), "sendAdGetRequest", e);
            a(fVar, new CBError(CBError.a.MISCELLANEOUS, "error sending ad-get request"));
        }
    }

    synchronized void a(f fVar, com.chartboost.sdk.Model.a aVar) {
        this.g = 1;
        fVar.f3832c = fVar.f3832c == 2 ? 4 : 5;
        fVar.f3833d = aVar;
        c(fVar);
        b();
    }

    private void c(final f fVar) {
        if (fVar.f3833d != null) {
            if (fVar.f3832c == 5 || fVar.f3832c == 4) {
                int i = fVar.f3832c == 5 ? 1 : 2;
                if (fVar.g <= i) {
                    return;
                }
                h hVar = new h() { // from class: com.chartboost.sdk.impl.e.2
                    @Override // com.chartboost.sdk.impl.h
                    public void a(boolean z, int i2, int i3) {
                        e.this.a(fVar, z, i2, i3);
                    }
                };
                fVar.g = i;
                this.l.a(i, fVar.f3833d.f3612c, new AtomicInteger(), (h) com.chartboost.sdk.g.a().a(hVar));
            }
        }
    }

    synchronized void a(f fVar, boolean z, int i, int i2) {
        if (fVar.f3832c == 4 || fVar.f3832c == 5) {
            fVar.n = Integer.valueOf(i);
            fVar.o = Integer.valueOf(i2);
            if (z) {
                d(fVar);
            } else {
                e(fVar);
            }
        }
        b();
    }

    private void d(f fVar) {
        int i = fVar.f3832c;
        long b2 = this.f3818c.b();
        if (fVar.h != null) {
            fVar.k = Integer.valueOf((int) TimeUnit.NANOSECONDS.toMillis(b2 - fVar.h.longValue()));
        }
        if (fVar.i != null) {
            fVar.l = Integer.valueOf((int) TimeUnit.NANOSECONDS.toMillis(b2 - fVar.i.longValue()));
        }
        b(fVar, "ad-unit-cached");
        fVar.f3832c = 6;
        if (fVar.f) {
            Handler handler = this.f3819d;
            c cVar = this.f;
            cVar.getClass();
            handler.post(cVar.new a(0, fVar.f3831b, null));
        }
        if (i == 5) {
            h(fVar);
        }
    }

    private void e(f fVar) {
        b(fVar, CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE);
        f(fVar);
        g(fVar);
    }

    private void f(f fVar) {
        this.h.remove(fVar.f3831b);
        fVar.f3832c = 8;
        fVar.f3833d = null;
    }

    synchronized void a(f fVar, CBError cBError) {
        if (this.g == 0) {
            return;
        }
        this.g = 1;
        b(fVar, cBError.c());
        f(fVar);
        g(fVar);
        b();
    }

    private void g(f fVar) {
        com.chartboost.sdk.Model.e eVar = this.p.get();
        long j = eVar.s;
        int i = eVar.t;
        Integer num = this.y.get(fVar.f3831b);
        if (num == null) {
            num = 0;
        }
        Integer valueOf = Integer.valueOf(Math.min(num.intValue(), i));
        this.y.put(fVar.f3831b, Integer.valueOf(valueOf.intValue() + 1));
        this.x.put(fVar.f3831b, Long.valueOf(this.f3818c.b() + TimeUnit.MILLISECONDS.toNanos(j << valueOf.intValue())));
    }

    void c(String str) {
        if (e()) {
            c cVar = this.f;
            cVar.getClass();
            this.f3819d.postDelayed(cVar.new a(4, str, CBError.CBImpressionError.FIRST_SESSION_INTERSTITIALS_DISABLED), this.A);
            return;
        }
        f fVar = this.h.get(str);
        if (fVar == null) {
            int i = this.v;
            this.v = i + 1;
            fVar = new f(i, str, 1);
            this.h.put(str, fVar);
            this.j.add(fVar);
        }
        if (fVar.i == null) {
            fVar.i = Long.valueOf(this.f3818c.b());
        }
        switch (fVar.f3832c) {
            case 0:
                this.i.remove(fVar);
                this.j.add(fVar);
                fVar.f3832c = 1;
                break;
            case 2:
                fVar.f3832c = 3;
                break;
            case 4:
                fVar.f3832c = 5;
                c(fVar);
                break;
            case 6:
                h(fVar);
                break;
        }
        b();
    }

    private void h(f fVar) {
        CBError.CBImpressionError cBImpressionError;
        String str;
        if (!this.n.b()) {
            Handler handler = this.f3819d;
            c cVar = this.f;
            cVar.getClass();
            handler.post(cVar.new a(4, fVar.f3831b, CBError.CBImpressionError.INTERNET_UNAVAILABLE_AT_SHOW));
            return;
        }
        com.chartboost.sdk.Model.c cVar2 = null;
        try {
            com.chartboost.sdk.Model.a aVar = fVar.f3833d;
            File file = this.f3817b.d().f3587a;
            if (aVar.f3611b == 0 && (this.f.g || aVar.p.equals("video"))) {
                cBImpressionError = a(aVar.f3610a);
                if (cBImpressionError != null) {
                    CBLogging.b("AdUnitManager", "Video media unavailable for the impression");
                }
            } else {
                cBImpressionError = null;
            }
            if (cBImpressionError == null) {
                for (com.chartboost.sdk.Model.b bVar : aVar.f3612c.values()) {
                    if (!bVar.a(file).exists()) {
                        CBLogging.b("AdUnitManager", "Asset does not exist: " + bVar.f3615b);
                        cBImpressionError = CBError.CBImpressionError.ASSET_MISSING;
                    }
                }
            }
            if (cBImpressionError == null) {
                if (aVar.f3611b == 1) {
                    str = a(aVar, file);
                    if (str == null) {
                        cBImpressionError = CBError.CBImpressionError.ERROR_LOADING_WEB_VIEW;
                    }
                } else {
                    str = null;
                }
                if (cBImpressionError == null) {
                    cVar2 = a(fVar, str);
                }
            }
        } catch (Exception e) {
            com.chartboost.sdk.Tracking.a.a(getClass(), "showReady", e);
            cBImpressionError = CBError.CBImpressionError.INTERNAL;
        }
        if (cBImpressionError == null) {
            fVar.f3832c = 7;
            com.chartboost.sdk.c cVar3 = this.e;
            cVar3.getClass();
            c.RunnableC0317c runnableC0317c = cVar3.new RunnableC0317c(10);
            runnableC0317c.f3642d = cVar2;
            fVar.j = Long.valueOf(this.f3818c.b());
            this.f3819d.post(runnableC0317c);
            return;
        }
        b(fVar, cBImpressionError);
        f(fVar);
    }

    private String a(com.chartboost.sdk.Model.a aVar, File file) {
        if (aVar.r == null) {
            CBLogging.b("AdUnitManager", "AdUnit does not have a template body");
            return null;
        }
        File a2 = aVar.r.a(file);
        HashMap hashMap = new HashMap();
        hashMap.putAll(aVar.f3613d);
        hashMap.put("{% certification_providers %}", o.a(aVar.s));
        for (Map.Entry<String, com.chartboost.sdk.Model.b> entry : aVar.f3612c.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().f3615b);
        }
        try {
            return n.a(a2, hashMap);
        } catch (Exception e) {
            com.chartboost.sdk.Tracking.a.a(getClass(), "loadTemplateHtml", e);
            return null;
        }
    }

    private com.chartboost.sdk.Model.c a(f fVar, String str) {
        return new com.chartboost.sdk.Model.c(fVar.f3833d, new d(this, fVar), this.f3817b, this.m, this.o, this.q, this.r, this.f3819d, this.e, this.s, this.t, this.u, this.f, fVar.f3831b, str);
    }

    void a(f fVar, CBError.CBImpressionError cBImpressionError) {
        b(fVar, cBImpressionError);
        if (fVar.f3832c == 7) {
            if (cBImpressionError == CBError.CBImpressionError.IMPRESSION_ALREADY_VISIBLE) {
                fVar.f3832c = 6;
                fVar.j = null;
                fVar.i = null;
                fVar.m = null;
                return;
            }
            g(fVar);
            f(fVar);
            b();
        }
    }

    private void b(f fVar, CBError.CBImpressionError cBImpressionError) {
        String str;
        Handler handler = this.f3819d;
        c cVar = this.f;
        cVar.getClass();
        handler.post(cVar.new a(4, fVar.f3831b, cBImpressionError));
        if (cBImpressionError == CBError.CBImpressionError.NO_AD_FOUND) {
            return;
        }
        String str2 = null;
        String str3 = fVar.f3833d != null ? fVar.f3833d.f : null;
        String str4 = (fVar.f3832c == 0 || fVar.f3832c == 2 || fVar.f3832c == 4) ? "cache" : "show";
        Integer valueOf = Integer.valueOf(fVar.f3833d != null ? fVar.f3833d.f3611b : fVar.e.intValue());
        if (valueOf != null) {
            str2 = valueOf.intValue() == 0 ? TapjoyConstants.TJC_PLUGIN_NATIVE : "web";
        }
        String str5 = str2;
        if (fVar.f3832c < 0 || fVar.f3832c >= this.B.length) {
            str = "Unknown state: " + fVar.f3832c;
        } else {
            str = this.B[fVar.f3832c];
        }
        this.r.a(this.f.f3807b, str4, str5, cBImpressionError.toString(), str3, fVar.f3831b, str);
    }

    private void b(f fVar, String str) {
        Integer num;
        String str2;
        if (this.p.get().p) {
            String str3 = null;
            String str4 = fVar.f3833d != null ? fVar.f3833d.f : null;
            String str5 = (fVar.f3832c == 0 || fVar.f3832c == 2 || fVar.f3832c == 4) ? "cache" : "show";
            if (fVar.f3833d != null) {
                num = Integer.valueOf(fVar.f3833d.f3611b);
            } else {
                num = fVar.e;
            }
            if (num != null) {
                str3 = num.intValue() == 0 ? TapjoyConstants.TJC_PLUGIN_NATIVE : "web";
            }
            String str6 = str3;
            if (fVar.f3832c < 0 || fVar.f3832c >= this.B.length) {
                str2 = "Unknown state: " + fVar.f3832c;
            } else {
                str2 = this.B[fVar.f3832c];
            }
            this.r.a(str, this.f.f3807b, str5, str6, null, null, com.chartboost.sdk.Libraries.e.a(com.chartboost.sdk.Libraries.e.a("adGetRequestSubmitToCallbackMs", fVar.p), com.chartboost.sdk.Libraries.e.a("downloadRequestToCompletionMs", fVar.n), com.chartboost.sdk.Libraries.e.a("downloadAccumulatedProcessingMs", fVar.o), com.chartboost.sdk.Libraries.e.a("adGetRequestGetResponseCodeMs", fVar.q), com.chartboost.sdk.Libraries.e.a("adGetRequestReadDataMs", fVar.r), com.chartboost.sdk.Libraries.e.a("cacheRequestToReadyMs", fVar.k), com.chartboost.sdk.Libraries.e.a("showRequestToReadyMs", fVar.l), com.chartboost.sdk.Libraries.e.a("showRequestToShownMs", fVar.m), com.chartboost.sdk.Libraries.e.a("adId", str4), com.chartboost.sdk.Libraries.e.a(GooglePlayServicesInterstitial.LOCATION_KEY, fVar.f3831b), com.chartboost.sdk.Libraries.e.a("state", str2)), false);
        }
    }

    void a(f fVar) {
        if (fVar.f3832c == 7) {
            fVar.f3832c = 6;
            fVar.j = null;
            fVar.i = null;
            fVar.m = null;
        }
    }

    void b(f fVar) {
        if (fVar.f3832c == 7) {
            if (fVar.i != null && fVar.m == null) {
                fVar.m = Integer.valueOf((int) TimeUnit.NANOSECONDS.toMillis(this.f3818c.b() - fVar.i.longValue()));
            }
            b(fVar, "ad-unit-shown");
            this.y.remove(fVar.f3831b);
            Handler handler = this.f3819d;
            c cVar = this.f;
            cVar.getClass();
            handler.post(cVar.new a(5, fVar.f3831b, null));
            i(fVar);
            f(fVar);
            b();
        }
    }

    void d(String str) {
        f fVar = this.h.get(str);
        if (fVar == null || fVar.f3832c != 6) {
            return;
        }
        f(fVar);
        b();
    }

    private void i(f fVar) {
        aj ajVar = new aj(this.f.f, this.o, this.r, 2, new g(this, fVar.f3831b));
        ajVar.j = 1;
        ajVar.a("cached", "0");
        String str = fVar.f3833d.f;
        if (!str.isEmpty()) {
            ajVar.a(AppLovinNativeAdapter.KEY_EXTRA_AD_ID, str);
        }
        ajVar.a(GooglePlayServicesInterstitial.LOCATION_KEY, fVar.f3831b);
        this.m.a(ajVar);
        this.r.b(this.f.a(fVar.f3833d.f3611b), fVar.f3831b, str);
    }

    CBError.CBImpressionError a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return CBError.CBImpressionError.INVALID_RESPONSE;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("assets");
        if (optJSONObject == null) {
            return CBError.CBImpressionError.INVALID_RESPONSE;
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject(CBUtility.a(CBUtility.a()) ? "video-portrait" : "video-landscape");
        if (optJSONObject2 == null) {
            return CBError.CBImpressionError.VIDEO_UNAVAILABLE_FOR_CURRENT_ORIENTATION;
        }
        String optString = optJSONObject2.optString("id");
        if (optString.isEmpty()) {
            return CBError.CBImpressionError.VIDEO_ID_MISSING;
        }
        if (new File(this.f3817b.d().g, optString).exists()) {
            return null;
        }
        return CBError.CBImpressionError.VIDEO_UNAVAILABLE;
    }

    private boolean e() {
        return this.f.f3806a == 0 && !com.chartboost.sdk.i.u && this.q.getInt("cbPrefSessionCount", 0) == 1;
    }

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final int f3826a;

        /* renamed from: b, reason: collision with root package name */
        final String f3827b;

        /* renamed from: c, reason: collision with root package name */
        final f f3828c;

        /* renamed from: d, reason: collision with root package name */
        final CBError.CBImpressionError f3829d;

        public a(int i, String str, f fVar, CBError.CBImpressionError cBImpressionError) {
            this.f3826a = i;
            this.f3827b = str;
            this.f3828c = fVar;
            this.f3829d = cBImpressionError;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                synchronized (e.this) {
                    int i = this.f3826a;
                    if (i == 0) {
                        e.this.a();
                    } else {
                        switch (i) {
                            case 2:
                                e.this.k = null;
                                e.this.b();
                                break;
                            case 3:
                                e.this.b(this.f3827b);
                                break;
                            case 4:
                                e.this.c(this.f3827b);
                                break;
                            case 5:
                                e.this.b(this.f3828c);
                                break;
                            case 6:
                                e.this.a(this.f3828c, this.f3829d);
                                break;
                            case 7:
                                e.this.a(this.f3828c);
                                break;
                            case 8:
                                e.this.d(this.f3827b);
                                break;
                        }
                    }
                }
            } catch (Exception e) {
                com.chartboost.sdk.Tracking.a.a(getClass(), "run", e);
            }
        }
    }
}
