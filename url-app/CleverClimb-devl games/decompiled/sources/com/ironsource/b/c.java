package com.ironsource.b;

import android.app.Activity;
import com.ironsource.b.d.c;
import java.util.TimerTask;

/* compiled from: AbstractSmash.java */
/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: b, reason: collision with root package name */
    b f6749b;

    /* renamed from: c, reason: collision with root package name */
    com.ironsource.b.e.o f6750c;

    /* renamed from: d, reason: collision with root package name */
    String f6751d;
    String e;
    String f;
    boolean g;
    String i;
    TimerTask l;
    TimerTask m;
    int n;
    int o;
    int p;
    int q;
    final String s = "maxAdsPerSession";
    final String t = "maxAdsPerIteration";
    final String u = "maxAdsPerDay";
    int k = 0;
    int j = 0;

    /* renamed from: a, reason: collision with root package name */
    a f6748a = a.NOT_INITIATED;
    com.ironsource.b.d.d r = com.ironsource.b.d.d.c();
    boolean h = true;

    abstract void h();

    abstract void i();

    abstract void j();

    protected abstract String u();

    /* compiled from: AbstractSmash.java */
    public enum a {
        NOT_INITIATED(0),
        INIT_FAILED(1),
        INITIATED(2),
        AVAILABLE(3),
        NOT_AVAILABLE(4),
        EXHAUSTED(5),
        CAPPED_PER_SESSION(6),
        INIT_PENDING(7),
        LOAD_PENDING(8),
        CAPPED_PER_DAY(9);

        private int k;

        a(int i) {
            this.k = i;
        }

        public int a() {
            return this.k;
        }
    }

    c(com.ironsource.b.e.o oVar) {
        this.e = oVar.c();
        this.f = oVar.h();
        this.g = oVar.g();
        this.f6750c = oVar;
        this.i = oVar.f();
        if (this.g) {
            this.f6751d = this.e;
        } else {
            this.f6751d = oVar.a();
        }
    }

    void a(b bVar) {
        this.f6749b = bVar;
    }

    boolean a() {
        return this.k >= this.n;
    }

    boolean b() {
        return this.j >= this.o;
    }

    boolean c() {
        return this.f6748a == a.CAPPED_PER_DAY;
    }

    boolean d() {
        return (a() || b() || c()) ? false : true;
    }

    void e() {
        this.k++;
        this.j++;
        if (b()) {
            a(a.CAPPED_PER_SESSION);
        } else if (a()) {
            a(a.EXHAUSTED);
        }
    }

    void f() {
        try {
            if (this.l != null) {
                this.l.cancel();
                this.l = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void g() {
        try {
            if (this.m != null) {
                this.m.cancel();
                this.m = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void a(String str, String str2) {
        if (this.f6749b != null) {
            this.f6749b.setPluginData(str, str2);
        }
    }

    a k() {
        return this.f6748a;
    }

    String l() {
        return this.e;
    }

    String m() {
        return this.f;
    }

    public String n() {
        return this.f6751d;
    }

    public String o() {
        return this.i;
    }

    int p() {
        return this.o;
    }

    int q() {
        return this.n;
    }

    public int r() {
        return this.p;
    }

    public b s() {
        return this.f6749b;
    }

    public int t() {
        return this.q;
    }

    synchronized void a(a aVar) {
        if (this.f6748a == aVar) {
            return;
        }
        this.f6748a = aVar;
        this.r.a(c.a.INTERNAL, "Smart Loading - " + m() + " state changed to " + aVar.toString(), 0);
        if (this.f6749b != null && (aVar == a.CAPPED_PER_SESSION || aVar == a.CAPPED_PER_DAY)) {
            this.f6749b.setMediationState(aVar, u());
        }
    }

    public void a(Activity activity) {
        if (this.f6749b != null) {
            this.f6749b.onResume(activity);
        }
        this.h = true;
    }

    public void b(Activity activity) {
        if (this.f6749b != null) {
            this.f6749b.onPause(activity);
        }
        this.h = false;
    }

    public void a(int i) {
        if (this.f6749b != null) {
            this.r.a(c.a.ADAPTER_API, n() + ":setAge(age:" + i + ")", 1);
            this.f6749b.setAge(i);
        }
    }

    public void a(String str) {
        if (this.f6749b != null) {
            this.r.a(c.a.ADAPTER_API, n() + ":setGender(gender:" + str + ")", 1);
            this.f6749b.setGender(str);
        }
    }

    public void b(String str) {
        if (this.f6749b != null) {
            this.r.a(c.a.ADAPTER_API, n() + ":setMediationSegment(segment:" + str + ")", 1);
            this.f6749b.setMediationSegment(str);
        }
    }

    void b(int i) {
        this.q = i;
    }

    void a(boolean z) {
        if (this.f6749b != null) {
            this.r.a(c.a.ADAPTER_API, n() + " | " + u() + "| setConsent(consent:" + z + ")", 1);
            this.f6749b.setConsent(z);
        }
    }
}
