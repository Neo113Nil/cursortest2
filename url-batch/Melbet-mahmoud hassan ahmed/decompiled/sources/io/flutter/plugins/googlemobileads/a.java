package io.flutter.plugins.googlemobileads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugins.googlemobileads.c0;
import io.flutter.plugins.googlemobileads.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private Activity f17433a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, e> f17434b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final m5.k f17435c;

    /* renamed from: io.flutter.plugins.googlemobileads.a$a, reason: collision with other inner class name */
    class RunnableC0075a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Map f17436f;

        RunnableC0075a(Map map) {
            this.f17436f = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f17435c.c("onAdEvent", this.f17436f);
        }
    }

    a(m5.k kVar) {
        this.f17435c = kVar;
    }

    private void g(Map<Object, Object> map) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0075a(map));
    }

    e b(int i7) {
        return this.f17434b.get(Integer.valueOf(i7));
    }

    Integer c(e eVar) {
        for (Integer num : this.f17434b.keySet()) {
            if (this.f17434b.get(num) == eVar) {
                return num;
            }
        }
        return null;
    }

    void d(int i7) {
        if (this.f17434b.containsKey(Integer.valueOf(i7))) {
            e eVar = this.f17434b.get(Integer.valueOf(i7));
            if (eVar != null) {
                eVar.b();
            }
            this.f17434b.remove(Integer.valueOf(i7));
        }
    }

    void e() {
        for (Map.Entry<Integer, e> entry : this.f17434b.entrySet()) {
            if (entry.getValue() != null) {
                entry.getValue().b();
            }
        }
        this.f17434b.clear();
    }

    Activity f() {
        return this.f17433a;
    }

    void h(int i7) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i7));
        hashMap.put("eventName", "onAdClicked");
        g(hashMap);
    }

    void i(int i7) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i7));
        hashMap.put("eventName", "onAdClosed");
        g(hashMap);
    }

    void j(int i7) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i7));
        hashMap.put("eventName", "onAdDismissedFullScreenContent");
        g(hashMap);
    }

    void k(int i7, e.c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i7));
        hashMap.put("eventName", "onAdFailedToLoad");
        hashMap.put("loadAdError", cVar);
        g(hashMap);
    }

    void l(int i7) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i7));
        hashMap.put("eventName", "onAdImpression");
        g(hashMap);
    }

    void m(int i7, r2.v vVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i7));
        hashMap.put("eventName", "onAdLoaded");
        hashMap.put("responseInfo", vVar == null ? null : new e.C0076e(vVar));
        g(hashMap);
    }

    void n(int i7) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i7));
        hashMap.put("eventName", "onAdMetadataChanged");
        g(hashMap);
    }

    void o(int i7) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i7));
        hashMap.put("eventName", "onAdOpened");
        g(hashMap);
    }

    void p(int i7) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i7));
        hashMap.put("eventName", "onAdShowedFullScreenContent");
        g(hashMap);
    }

    void q(int i7, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i7));
        hashMap.put("eventName", "onAppEvent");
        hashMap.put("name", str);
        hashMap.put("data", str2);
        g(hashMap);
    }

    void r(int i7, r2.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i7));
        hashMap.put("eventName", "onFailedToShowFullScreenContent");
        hashMap.put("error", new e.a(aVar));
        g(hashMap);
    }

    void s(int i7, int i8) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i7));
        hashMap.put("eventName", "onFluidAdHeightChanged");
        hashMap.put("height", Integer.valueOf(i8));
        g(hashMap);
    }

    void t(e eVar, n nVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", c(eVar));
        hashMap.put("eventName", "onPaidEvent");
        hashMap.put("valueMicros", Long.valueOf(nVar.f17549c));
        hashMap.put("precision", Integer.valueOf(nVar.f17547a));
        hashMap.put("currencyCode", nVar.f17548b);
        g(hashMap);
    }

    void u(int i7, c0.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i7));
        hashMap.put("eventName", "onRewardedAdUserEarnedReward");
        hashMap.put("rewardItem", bVar);
        g(hashMap);
    }

    void v(Activity activity) {
        this.f17433a = activity;
    }

    boolean w(int i7) {
        e.d dVar = (e.d) b(i7);
        if (dVar == null) {
            return false;
        }
        dVar.e();
        return true;
    }

    void x(e eVar, int i7) {
        if (this.f17434b.get(Integer.valueOf(i7)) != null) {
            throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", Integer.valueOf(i7)));
        }
        this.f17434b.put(Integer.valueOf(i7), eVar);
    }
}
