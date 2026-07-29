package com.ironsource.b;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.aiming.mdt.utils.Constants;
import com.ironsource.b.c;
import com.ironsource.b.d.c;
import com.ironsource.b.k;
import com.ironsource.b.o;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: BannerManager.java */
/* loaded from: classes2.dex */
public class d extends com.ironsource.b.a implements com.ironsource.b.f.c, o.c {
    private l A;
    private boolean B;
    private boolean C;
    private final String s = getClass().getName();
    private boolean t = false;
    private boolean u = false;
    private HandlerThread v = new HandlerThread("IronSourceBannerHandler");
    private Handler w;
    private a x;
    private long y;
    private boolean z;

    @Override // com.ironsource.b.o.c
    public void a(List<k.a> list, boolean z) {
    }

    @Override // com.ironsource.b.o.c
    public void e() {
    }

    @Override // com.ironsource.b.a
    public /* bridge */ /* synthetic */ void a(Activity activity) {
        super.a(activity);
    }

    @Override // com.ironsource.b.a
    public /* bridge */ /* synthetic */ void b(Activity activity) {
        super.b(activity);
    }

    public d() {
        this.v.start();
        this.w = new Handler(this.v.getLooper());
        this.B = true;
    }

    public void a(Activity activity, String str, String str2) {
        this.m.a(c.a.NATIVE, this.s + ":initBanners(appKey: " + str + ", userId: " + str2 + ")", 1);
        this.l = str;
        this.k = str2;
        this.j = activity;
        f();
    }

    private b f() {
        b bVar = null;
        int i = 0;
        for (int i2 = 0; i2 < this.i.size() && bVar == null; i2++) {
            if (this.i.get(i2).k() == c.a.AVAILABLE || this.i.get(i2).k() == c.a.INITIATED || this.i.get(i2).k() == c.a.INIT_PENDING || this.i.get(i2).k() == c.a.LOAD_PENDING) {
                i++;
                if (i >= this.h) {
                    break;
                }
            } else if (this.i.get(i2).k() == c.a.NOT_INITIATED && (bVar = b((e) this.i.get(i2))) == null) {
                this.i.get(i2).a(c.a.INIT_FAILED);
            }
        }
        return bVar;
    }

    private b b(e eVar) {
        this.m.a(c.a.NATIVE, this.s + ":startAdapter(" + eVar.n() + ")", 1);
        try {
            b e = e(eVar);
            if (e == null) {
                return null;
            }
            m.a().c(e);
            e.setLogListener(this.m);
            eVar.a(e);
            eVar.a(c.a.INIT_PENDING);
            d(eVar);
            eVar.a(this.j, this.l, this.k);
            return e;
        } catch (Throwable th) {
            th.printStackTrace();
            this.m.a(c.a.API, this.s + ":startAdapter(" + eVar.n() + ")", th);
            eVar.a(c.a.INIT_FAILED);
            StringBuilder sb = new StringBuilder();
            sb.append(eVar.n());
            sb.append(" initialization failed - please verify that required dependencies are in you build path.");
            this.m.a(c.a.API, com.ironsource.b.h.d.b(sb.toString(), Constants.ADTYPE_BANNER).toString(), 2);
            return null;
        }
    }

    private synchronized void a(com.ironsource.b.d.b bVar, boolean z) {
        g();
        this.x = new a(bVar);
        long currentTimeMillis = z ? 0L : System.currentTimeMillis() - this.y;
        if (currentTimeMillis >= 15000) {
            if (this.w != null) {
                this.w.post(this.x);
            }
        } else {
            long j = 15000 - currentTimeMillis;
            if (this.w != null) {
                this.w.postDelayed(this.x, j);
            }
        }
    }

    @Override // com.ironsource.b.o.c
    public void a(String str) {
        if (this.t) {
            a(new com.ironsource.b.d.b(604, "no ads to show"), false);
        }
    }

    /* compiled from: BannerManager.java */
    private class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        com.ironsource.b.d.b f6757a;

        a(com.ironsource.b.d.b bVar) {
            this.f6757a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.m.a(c.a.API, "Load Banner failed: " + this.f6757a.b(), 1);
            d.this.y = System.currentTimeMillis();
            if (d.this.A != null && d.this.A.getBannerListener() != null) {
                com.ironsource.b.d.d.c().a(c.a.CALLBACK, "onBannerAdLoadFailed(), error: " + this.f6757a.b(), 1);
                JSONObject a2 = com.ironsource.b.h.g.a(false);
                try {
                    int a3 = d.this.A.getSize().a();
                    a2.put("status", "false");
                    a2.put("errorCode", this.f6757a.a());
                    a2.put("bannerAdSize", a3);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                com.ironsource.b.b.d.c().a(new com.ironsource.a.b(407, a2));
                d.this.A.getBannerListener().a(this.f6757a);
            }
            d.this.h();
        }
    }

    private synchronized void g() {
        if (this.w != null && this.x != null) {
            this.w.removeCallbacks(this.x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h() {
        this.u = false;
        this.t = false;
        this.A = null;
        if (this.x != null) {
            this.w.removeCallbacks(this.x);
        }
    }

    private synchronized void a(e eVar, l lVar) {
        JSONObject a2 = com.ironsource.b.h.g.a((c) eVar, false);
        if (lVar != null) {
            try {
                if (!TextUtils.isEmpty(lVar.getPlacementName())) {
                    a2.put("placement", lVar.getPlacementName());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        com.ironsource.b.b.d.c().a(new com.ironsource.a.b(402, a2));
        eVar.a(lVar);
    }

    @Override // com.ironsource.b.f.c
    public synchronized void a(com.ironsource.b.d.b bVar, e eVar) {
        try {
            this.m.a(c.a.ADAPTER_CALLBACK, eVar.m() + ":onBannerInitFailed(" + bVar + ")", 1);
            Iterator<c> it = this.i.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().k() == c.a.INIT_FAILED && (i = i + 1) >= this.i.size()) {
                    this.m.a(c.a.NATIVE, "Smart Loading - initialization failed - no adapters are initiated and no more left to init, error: " + bVar.b(), 2);
                    if (this.t) {
                        a(new com.ironsource.b.d.b(605, "no ads to show"), false);
                    }
                    this.z = true;
                    return;
                }
            }
            f();
        } catch (Exception e) {
            this.m.a(c.a.ADAPTER_CALLBACK, "onBannerInitFailed(error:" + bVar + ", provider:" + eVar.n() + ")", e);
        }
    }

    @Override // com.ironsource.b.f.c
    public void a(l lVar, e eVar) {
        if (eVar == null || eVar.s() == null || lVar == null) {
            this.m.a(c.a.NATIVE, this.s + ":onBannerImpression error: adapter or banner is null", 2);
            return;
        }
        JSONObject a2 = com.ironsource.b.h.g.a((c) eVar, false);
        try {
            a2.put("bannerAdSize", lVar.getSize().a());
        } catch (Exception e) {
            e.printStackTrace();
        }
        com.ironsource.b.b.d.c().a(new com.ironsource.a.b(405, a2));
    }

    @Override // com.ironsource.b.f.c
    public void a(e eVar) {
        this.m.a(c.a.NATIVE, this.s + ":onBannerReloadAd", 1);
        com.ironsource.b.b.d.c().a(new com.ironsource.a.b(412, com.ironsource.b.h.g.a(eVar, this.r)));
        JSONObject a2 = com.ironsource.b.h.g.a(eVar, this.r);
        try {
            a2.put("bannerAdSize", eVar.v().a());
            a2.put("reason", 100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        com.ironsource.b.b.d.c().a(new com.ironsource.a.b(405, a2));
    }

    @Override // com.ironsource.b.f.c
    public void b(com.ironsource.b.d.b bVar, e eVar) {
        this.m.a(c.a.NATIVE, this.s + ":onBannerAdLoadFailed", 1);
        eVar.a(c.a.NOT_AVAILABLE);
        Iterator<c> it = this.i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.k() == c.a.AVAILABLE || next.k() == c.a.LOAD_PENDING) {
                return;
            }
            if (next.k() == c.a.INITIATED && this.A != null) {
                next.a(c.a.LOAD_PENDING);
                a((e) next, this.A);
                return;
            }
        }
        b f = f();
        if (this.t && f == null) {
            a(bVar, false);
        }
    }

    @Override // com.ironsource.b.f.c
    public void c(com.ironsource.b.d.b bVar, e eVar) {
        this.C = true;
        this.m.a(c.a.NATIVE, this.s + ":onBannerAdReloadFailed", 1);
        eVar.a(c.a.NOT_AVAILABLE);
        com.ironsource.b.b.d.c().a(new com.ironsource.a.b(418, com.ironsource.b.h.g.a(eVar, this.r)));
        Iterator<c> it = this.i.iterator();
        int i = 1;
        while (it.hasNext()) {
            c next = it.next();
            if (!eVar.m().equals(next.m())) {
                if (next.k() == c.a.INITIATED || next.k() == c.a.AVAILABLE) {
                    next.a(c.a.LOAD_PENDING);
                    ((e) next).a(this.A);
                    return;
                } else {
                    if (next.k() == c.a.NOT_INITIATED) {
                        f();
                        return;
                    }
                    if (next.k() == c.a.NOT_AVAILABLE) {
                        i++;
                    }
                    if (i >= this.i.size()) {
                        a(new com.ironsource.b.d.b(519, "no ads to show"), true);
                        return;
                    }
                }
            }
        }
    }
}
