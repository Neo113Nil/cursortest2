package com.ironsource.b;

import android.app.Activity;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import com.aiming.mdt.utils.Constants;
import com.ironsource.b.c;
import com.ironsource.b.d.c;
import com.ironsource.b.k;
import com.ironsource.b.o;
import com.mopub.common.AdType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* compiled from: InterstitialManager.java */
/* loaded from: classes2.dex */
class i extends a implements com.ironsource.b.f.k, com.ironsource.b.f.q, com.ironsource.b.h.b, o.c {
    private com.ironsource.b.f.m t;
    private com.ironsource.b.f.p u;
    private com.ironsource.b.f.f v;
    private boolean y;
    private com.ironsource.b.e.h z;
    private final String s = getClass().getName();
    private CopyOnWriteArraySet<String> D = new CopyOnWriteArraySet<>();
    private Map<String, j> C = new ConcurrentHashMap();
    private f A = new f();
    private boolean B = false;
    private boolean x = false;
    private boolean w = false;

    @Override // com.ironsource.b.o.c
    public void a(List<k.a> list, boolean z) {
    }

    i() {
        this.g = new com.ironsource.b.h.c(AdType.INTERSTITIAL, this);
    }

    public void a(com.ironsource.b.f.j jVar) {
        this.t = (com.ironsource.b.f.m) jVar;
        this.A.a(jVar);
    }

    public void a(com.ironsource.b.f.p pVar) {
        this.u = pVar;
    }

    public synchronized void a(Activity activity, String str, String str2) {
        this.m.a(c.a.NATIVE, this.s + ":initInterstitial(appKey: " + str + ", userId: " + str2 + ")", 1);
        this.l = str;
        this.k = str2;
        this.j = activity;
        if (this.r) {
            this.h = this.i.size();
            Iterator<c> it = this.i.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (i((j) next) == null) {
                    next.a(c.a.INIT_FAILED);
                }
                this.C.put(next.o(), (j) next);
            }
        } else {
            this.g.a(this.j);
            Iterator<c> it2 = this.i.iterator();
            int i = 0;
            while (it2.hasNext()) {
                c next2 = it2.next();
                if (this.g.c(next2)) {
                    a(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, next2, new Object[][]{new Object[]{"status", "false"}});
                }
                if (this.g.d(next2)) {
                    next2.a(c.a.CAPPED_PER_DAY);
                    i++;
                }
            }
            if (i == this.i.size()) {
                this.y = true;
            }
            for (int i2 = 0; i2 < this.h && i() != null; i2++) {
            }
        }
    }

    public void b(String str) {
        if (this.n && this.j != null && !com.ironsource.b.h.g.c(this.j)) {
            this.t.c(com.ironsource.b.h.d.c(Constants.ADTYPE_INTERSTITIAL));
            return;
        }
        if (!this.w) {
            this.t.c(com.ironsource.b.h.d.c(Constants.ADTYPE_INTERSTITIAL, "showInterstitial failed - You need to load interstitial before showing it"));
            return;
        }
        for (int i = 0; i < this.i.size(); i++) {
            c cVar = this.i.get(i);
            if (cVar.k() == c.a.AVAILABLE) {
                com.ironsource.b.h.a.c(this.j, this.z);
                a(23, cVar, new Object[][]{new Object[]{"placement", str}});
                a(cVar, i, str);
                ((j) cVar).w();
                this.g.b(cVar);
                if (this.g.d(cVar)) {
                    cVar.a(c.a.CAPPED_PER_DAY);
                    a(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, cVar, new Object[][]{new Object[]{"status", "true"}});
                }
                this.w = false;
                if (cVar.d()) {
                    return;
                }
                i();
                return;
            }
        }
        this.t.c(com.ironsource.b.h.d.c(Constants.ADTYPE_INTERSTITIAL, "showInterstitial failed - No adapters ready to show"));
    }

    public void a(com.ironsource.b.f.f fVar) {
        this.v = fVar;
        this.A.a(fVar);
    }

    public synchronized void c(String str) {
        try {
        } catch (Exception unused) {
            com.ironsource.b.d.b e = com.ironsource.b.h.d.e("loadInterstitial exception");
            this.m.a(c.a.API, e.b(), 3);
            this.A.a(e);
        }
        if (this.A.a(str)) {
            this.m.a(c.a.API, "Load Interstitial for " + str + " is already in progress", 1);
            return;
        }
        o.a b2 = o.a().b();
        if (b2 == o.a.NOT_INIT) {
            this.m.a(c.a.API, "init() must be called before loadInterstitial()", 3);
            return;
        }
        if (b2 == o.a.INIT_IN_PROGRESS) {
            if (o.a().c()) {
                this.m.a(c.a.API, "init() had failed", 3);
                this.A.a(str, com.ironsource.b.h.d.b("init() had failed", Constants.ADTYPE_INTERSTITIAL));
            } else {
                this.D.add(str);
            }
            return;
        }
        if (b2 == o.a.INIT_FAILED) {
            this.m.a(c.a.API, "init() had failed", 3);
            this.A.a(str, com.ironsource.b.h.d.b("init() had failed", Constants.ADTYPE_INTERSTITIAL));
            return;
        }
        if (!this.C.containsKey(str)) {
            com.ironsource.b.d.b d2 = com.ironsource.b.h.d.d(Constants.ADTYPE_INTERSTITIAL);
            this.A.a(str, d2);
            a(22, (Object[][]) null);
            a(227, new Object[][]{new Object[]{"errorCode", Integer.valueOf(d2.a())}});
            return;
        }
        j jVar = this.C.get(str);
        if (jVar.k() == c.a.INIT_PENDING) {
            this.D.add(str);
        } else {
            jVar.a(c.a.LOAD_PENDING);
            j(jVar);
        }
    }

    public void a(String str, String str2) {
        if (this.n && this.j != null && !com.ironsource.b.h.g.c(this.j)) {
            this.v.onInterstitialAdShowFailed(str, com.ironsource.b.h.d.c(Constants.ADTYPE_INTERSTITIAL));
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.i.size(); i++) {
            c cVar = this.i.get(i);
            if (cVar.o().equals(str)) {
                if (cVar.k() == c.a.AVAILABLE) {
                    com.ironsource.b.h.a.c(this.j, this.z);
                    a(23, cVar, new Object[][]{new Object[]{"placement", str2}});
                    a(cVar, i, str2);
                    ((j) cVar).w();
                    e(str);
                    return;
                }
                z = true;
            }
        }
        if (!z) {
            this.v.onInterstitialAdShowFailed(str, com.ironsource.b.h.d.d("no ads to show"));
        } else {
            this.v.onInterstitialAdShowFailed(str, com.ironsource.b.h.d.c(Constants.ADTYPE_INTERSTITIAL, "no ads to show"));
        }
    }

    public synchronized boolean d(String str) {
        boolean z = false;
        if (this.n && this.j != null && !com.ironsource.b.h.g.c(this.j)) {
            return false;
        }
        Iterator<c> it = this.i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.o().equals(str)) {
                if (next.k() == c.a.AVAILABLE) {
                    if (((j) next).x()) {
                        z = true;
                    }
                }
                return z;
            }
        }
        return false;
    }

    @Override // com.ironsource.b.f.k
    public synchronized void a(j jVar) {
        this.m.a(c.a.ADAPTER_CALLBACK, jVar.m() + " :onInterstitialInitSuccess()", 1);
        this.y = true;
        if (this.r) {
            String o = jVar.o();
            if (this.D.contains(o)) {
                this.D.remove(o);
                c(o);
            }
        } else if (this.w && a(c.a.AVAILABLE, c.a.LOAD_PENDING) < this.h) {
            jVar.a(c.a.LOAD_PENDING);
            j(jVar);
        }
    }

    @Override // com.ironsource.b.f.k
    public synchronized void a(com.ironsource.b.d.b bVar, j jVar) {
        try {
            this.m.a(c.a.ADAPTER_CALLBACK, jVar.m() + ":onInterstitialInitFailed(" + bVar + ")", 1);
            if (this.r) {
                String o = jVar.o();
                if (this.D.contains(o)) {
                    this.D.remove(o);
                    this.A.a(o, com.ironsource.b.h.d.b("no ads to show"));
                    a(227, new Object[][]{new Object[]{"errorCode", 510}});
                    a(227, jVar, new Object[][]{new Object[]{"errorCode", 510}});
                }
            } else if (a(c.a.INIT_FAILED) >= this.i.size()) {
                this.m.a(c.a.NATIVE, "Smart Loading - initialization failed - no adapters are initiated and no more left to init, error: " + bVar.b(), 2);
                if (this.w) {
                    this.A.a(com.ironsource.b.h.d.b("no ads to show"));
                    a(227, new Object[][]{new Object[]{"errorCode", 510}});
                    this.B = false;
                }
                this.y = true;
            } else {
                i();
                h();
            }
        } catch (Exception e) {
            this.m.a(c.a.ADAPTER_CALLBACK, "onInterstitialInitFailed(error:" + bVar + ", provider:" + jVar.n() + ")", e);
        }
    }

    @Override // com.ironsource.b.f.k
    public synchronized void b(j jVar) {
        this.m.a(c.a.ADAPTER_CALLBACK, jVar.m() + ":onInterstitialAdReady()", 1);
        a(27, jVar, new Object[][]{new Object[]{"status", "true"}});
        if (this.r) {
            jVar.a(c.a.AVAILABLE);
            this.v.onInterstitialAdReady(jVar.o());
            a(27, new Object[][]{new Object[]{"status", "true"}});
        } else {
            jVar.a(c.a.AVAILABLE);
            this.x = false;
            if (this.B) {
                this.B = false;
                this.t.z();
                a(27, new Object[][]{new Object[]{"status", "true"}});
            }
        }
    }

    @Override // com.ironsource.b.f.k
    public synchronized void b(com.ironsource.b.d.b bVar, j jVar) {
        this.m.a(c.a.ADAPTER_CALLBACK, jVar.m() + ":onInterstitialAdLoadFailed(" + bVar + ")", 1);
        a(227, jVar, new Object[][]{new Object[]{"errorCode", Integer.valueOf(bVar.a())}});
        if (this.r) {
            this.A.a(jVar.o(), bVar);
            a(227, new Object[][]{new Object[]{"errorCode", Integer.valueOf(bVar.a())}});
        } else {
            jVar.a(c.a.NOT_AVAILABLE);
            int a2 = a(c.a.AVAILABLE, c.a.LOAD_PENDING);
            if (a2 >= this.h) {
                return;
            }
            Iterator<c> it = this.i.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.k() == c.a.INITIATED) {
                    next.a(c.a.LOAD_PENDING);
                    j((j) next);
                    return;
                }
            }
            if (i() != null) {
                return;
            }
            if (this.w && a2 == 0) {
                h();
                this.x = false;
                this.A.a(bVar);
                a(227, new Object[][]{new Object[]{"errorCode", Integer.valueOf(bVar.a())}});
            }
        }
    }

    @Override // com.ironsource.b.f.k
    public void c(j jVar) {
        this.m.a(c.a.ADAPTER_CALLBACK, jVar.m() + ":onInterstitialAdOpened()", 1);
        a(25, jVar, (Object[][]) null);
        if (this.r) {
            this.v.onInterstitialAdOpened(jVar.o());
        } else {
            this.t.A();
        }
    }

    @Override // com.ironsource.b.f.k
    public void d(j jVar) {
        this.m.a(c.a.ADAPTER_CALLBACK, jVar.m() + ":onInterstitialAdClosed()", 1);
        a(26, jVar, (Object[][]) null);
        if (this.r) {
            this.v.onInterstitialAdClosed(jVar.o());
        } else {
            this.t.B();
        }
    }

    @Override // com.ironsource.b.f.k
    public void e(j jVar) {
        this.m.a(c.a.ADAPTER_CALLBACK, jVar.m() + ":onInterstitialAdShowSucceeded()", 1);
        if (this.r) {
            this.v.onInterstitialAdShowSucceeded(jVar.o());
            return;
        }
        boolean z = false;
        Iterator<c> it = this.i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.k() == c.a.AVAILABLE) {
                f(next);
                z = true;
            }
        }
        if (!z && (jVar.k() == c.a.CAPPED_PER_SESSION || jVar.k() == c.a.EXHAUSTED || jVar.k() == c.a.CAPPED_PER_DAY)) {
            h();
        }
        j();
        this.t.C();
    }

    @Override // com.ironsource.b.f.k
    public void c(com.ironsource.b.d.b bVar, j jVar) {
        this.m.a(c.a.ADAPTER_CALLBACK, jVar.m() + ":onInterstitialAdShowFailed(" + bVar + ")", 1);
        if (this.r) {
            this.v.onInterstitialAdShowFailed(jVar.o(), bVar);
            return;
        }
        f((c) jVar);
        Iterator<c> it = this.i.iterator();
        while (it.hasNext()) {
            if (it.next().k() == c.a.AVAILABLE) {
                this.w = true;
                b(this.z.b());
                return;
            }
        }
        this.t.c(bVar);
    }

    @Override // com.ironsource.b.f.k
    public void f(j jVar) {
        this.m.a(c.a.ADAPTER_CALLBACK, jVar.m() + ":onInterstitialAdClicked()", 1);
        a(28, jVar, (Object[][]) null);
        if (this.r) {
            this.v.onInterstitialAdClicked(jVar.o());
        } else {
            this.t.D();
        }
    }

    @Override // com.ironsource.b.f.k
    public void g(j jVar) {
        this.m.a(c.a.ADAPTER_CALLBACK, jVar.m() + ":onInterstitialAdVisible()", 1);
        a(31, jVar, new Object[][]{new Object[]{"placement", this.z.b()}});
    }

    @Override // com.ironsource.b.f.q
    public void h(j jVar) {
        a(290, jVar, (Object[][]) null);
        if (this.u != null) {
            this.u.F();
        }
    }

    @Override // com.ironsource.b.o.c
    public void a(String str) {
        if (this.r) {
            Iterator<String> it = this.D.iterator();
            while (it.hasNext()) {
                this.A.a(it.next(), com.ironsource.b.h.d.b("init() had failed", Constants.ADTYPE_INTERSTITIAL));
            }
            this.D.clear();
            return;
        }
        if (this.w) {
            this.A.a(com.ironsource.b.h.d.b("init() had failed", Constants.ADTYPE_INTERSTITIAL));
            this.w = false;
            this.x = false;
        }
    }

    @Override // com.ironsource.b.o.c
    public void e() {
        if (this.r) {
            Iterator<String> it = this.D.iterator();
            while (it.hasNext()) {
                this.A.a(it.next(), com.ironsource.b.h.d.b("init() had failed", Constants.ADTYPE_INTERSTITIAL));
            }
            this.D.clear();
            return;
        }
        if (this.w) {
            com.ironsource.b.d.b b2 = com.ironsource.b.h.d.b("init() had failed", Constants.ADTYPE_INTERSTITIAL);
            this.A.a(b2);
            this.w = false;
            this.x = false;
            if (this.B) {
                a(227, new Object[][]{new Object[]{"errorCode", Integer.valueOf(b2.a())}});
                this.B = false;
            }
        }
    }

    private boolean g() {
        Iterator<c> it = this.i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.k() == c.a.NOT_INITIATED || next.k() == c.a.INIT_PENDING || next.k() == c.a.INITIATED || next.k() == c.a.LOAD_PENDING || next.k() == c.a.AVAILABLE) {
                return false;
            }
        }
        return true;
    }

    private void h() {
        if (g()) {
            this.m.a(c.a.INTERNAL, "Reset Iteration", 0);
            Iterator<c> it = this.i.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.k() == c.a.EXHAUSTED) {
                    next.h();
                }
            }
            this.m.a(c.a.INTERNAL, "End of Reset Iteration", 0);
        }
    }

    private void f(c cVar) {
        if (!cVar.d()) {
            i();
            h();
        } else {
            cVar.a(c.a.INITIATED);
        }
    }

    private b i() {
        b bVar = null;
        int i = 0;
        for (int i2 = 0; i2 < this.i.size() && bVar == null; i2++) {
            if (this.i.get(i2).k() == c.a.AVAILABLE || this.i.get(i2).k() == c.a.INITIATED || this.i.get(i2).k() == c.a.INIT_PENDING || this.i.get(i2).k() == c.a.LOAD_PENDING) {
                i++;
                if (i >= this.h) {
                    break;
                }
            } else if (this.i.get(i2).k() == c.a.NOT_INITIATED && (bVar = i((j) this.i.get(i2))) == null) {
                this.i.get(i2).a(c.a.INIT_FAILED);
            }
        }
        return bVar;
    }

    private synchronized b i(j jVar) {
        this.m.a(c.a.NATIVE, this.s + ":startAdapter(" + jVar.n() + ")", 1);
        try {
            b e = e((c) jVar);
            if (e == null) {
                return null;
            }
            m.a().b(e);
            e.setLogListener(this.m);
            jVar.a(e);
            jVar.a(c.a.INIT_PENDING);
            if (this.u != null) {
                jVar.a((com.ironsource.b.f.q) this);
            }
            d((c) jVar);
            jVar.a(this.j, this.l, this.k);
            return e;
        } catch (Throwable th) {
            this.m.a(c.a.API, this.s + ":startAdapter(" + jVar.n() + ")", th);
            jVar.a(c.a.INIT_FAILED);
            StringBuilder sb = new StringBuilder();
            sb.append(jVar.n());
            sb.append(" initialization failed - please verify that required dependencies are in you build path.");
            this.m.a(c.a.API, com.ironsource.b.h.d.b(sb.toString(), Constants.ADTYPE_INTERSTITIAL).toString(), 2);
            return null;
        }
    }

    void a(com.ironsource.b.e.h hVar) {
        this.z = hVar;
    }

    private synchronized void j(j jVar) {
        if (this.r) {
            a(22, (Object[][]) null);
        }
        a(22, jVar, (Object[][]) null);
        jVar.v();
    }

    private synchronized void e(String str) {
        Iterator<c> it = this.i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.o().equals(str) && (next.k() == c.a.AVAILABLE || next.k() == c.a.LOAD_PENDING || next.k() == c.a.NOT_AVAILABLE)) {
                next.a(c.a.INITIATED);
                break;
            }
        }
    }

    private synchronized void j() {
        Iterator<c> it = this.i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.k() == c.a.AVAILABLE || next.k() == c.a.LOAD_PENDING || next.k() == c.a.NOT_AVAILABLE) {
                next.a(c.a.INITIATED);
            }
        }
    }

    private void a(c cVar, String str, boolean z) {
        Object[][] objArr = new Object[2][];
        objArr[0] = new Object[]{"placement", str};
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? "true" : "false";
        objArr[1] = objArr2;
        a(219, cVar, objArr);
    }

    private void a(c cVar, int i, String str) {
        a(cVar, str, true);
        if (this.r) {
            return;
        }
        for (int i2 = 0; i2 < this.i.size() && i2 < i; i2++) {
            c cVar2 = this.i.get(i2);
            if (cVar2.k() == c.a.NOT_AVAILABLE) {
                a(cVar2, str, false);
            }
        }
    }

    private void a(int i, Object[][] objArr) {
        JSONObject a2 = com.ironsource.b.h.g.a(this.r);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    a2.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.m.a(c.a.INTERNAL, "InterstitialManager logMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.b.b.d.c().a(new com.ironsource.a.b(i, a2));
    }

    private void a(int i, c cVar, Object[][] objArr) {
        JSONObject a2 = com.ironsource.b.h.g.a(cVar, this.r);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    a2.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.m.a(c.a.INTERNAL, "InterstitialManager logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.b.b.d.c().a(new com.ironsource.a.b(i, a2));
    }

    private int a(c.a... aVarArr) {
        int i;
        synchronized (this.i) {
            Iterator<c> it = this.i.iterator();
            i = 0;
            while (it.hasNext()) {
                c next = it.next();
                int i2 = i;
                for (c.a aVar : aVarArr) {
                    if (next.k() == aVar) {
                        i2++;
                    }
                }
                i = i2;
            }
        }
        return i;
    }

    @Override // com.ironsource.b.h.b
    public void f() {
        if (this.i != null) {
            Iterator<c> it = this.i.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.k() == c.a.CAPPED_PER_DAY) {
                    a(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, next, new Object[][]{new Object[]{"status", "false"}});
                    if (next.b()) {
                        next.a(c.a.CAPPED_PER_SESSION);
                    } else if (next.a()) {
                        next.a(c.a.EXHAUSTED);
                    } else {
                        next.a(c.a.INITIATED);
                    }
                }
            }
        }
    }
}
