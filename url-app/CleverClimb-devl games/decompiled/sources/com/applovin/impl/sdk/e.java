package com.applovin.impl.sdk;

import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;

/* loaded from: classes.dex */
public class e implements o.a, t.a {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.e.j f3154a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3155b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final j f3156c;

    /* renamed from: d, reason: collision with root package name */
    private final a f3157d;
    private long e;

    public interface a {
        void onAdRefresh();
    }

    public e(j jVar, a aVar) {
        this.f3157d = aVar;
        this.f3156c = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this.f3155b) {
            this.f3154a = null;
            this.f3156c.Q().b(this);
            this.f3156c.R().b(this);
        }
    }

    public void a(long j) {
        synchronized (this.f3155b) {
            e();
            this.e = j;
            this.f3154a = com.applovin.impl.sdk.e.j.a(j, this.f3156c, new Runnable() { // from class: com.applovin.impl.sdk.e.1
                @Override // java.lang.Runnable
                public void run() {
                    e.this.j();
                    e.this.f3157d.onAdRefresh();
                }
            });
            this.f3156c.Q().a(this);
            this.f3156c.R().a(this);
            if (((Boolean) this.f3156c.a(com.applovin.impl.sdk.b.a.z)).booleanValue() && (this.f3156c.R().b() || this.f3156c.Q().a())) {
                this.f3154a.b();
            }
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this.f3155b) {
            z = this.f3154a != null;
        }
        return z;
    }

    @Override // com.applovin.impl.sdk.t.a
    public void b() {
        if (((Boolean) this.f3156c.a(com.applovin.impl.sdk.b.a.y)).booleanValue()) {
            f();
        }
    }

    @Override // com.applovin.impl.sdk.t.a
    public void c() {
        if (((Boolean) this.f3156c.a(com.applovin.impl.sdk.b.a.y)).booleanValue()) {
            synchronized (this.f3155b) {
                if (this.f3156c.R().b()) {
                    this.f3156c.u().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                    return;
                }
                boolean z = false;
                if (this.f3154a != null) {
                    long d2 = this.e - d();
                    long longValue = ((Long) this.f3156c.a(com.applovin.impl.sdk.b.a.x)).longValue();
                    if (longValue < 0 || d2 <= longValue) {
                        this.f3154a.c();
                    } else {
                        e();
                        z = true;
                    }
                }
                if (z) {
                    this.f3157d.onAdRefresh();
                }
            }
        }
    }

    public long d() {
        long a2;
        synchronized (this.f3155b) {
            a2 = this.f3154a != null ? this.f3154a.a() : -1L;
        }
        return a2;
    }

    public void e() {
        synchronized (this.f3155b) {
            if (this.f3154a != null) {
                this.f3154a.d();
                j();
            }
        }
    }

    public void f() {
        synchronized (this.f3155b) {
            if (this.f3154a != null) {
                this.f3154a.b();
            }
        }
    }

    public void g() {
        synchronized (this.f3155b) {
            if (this.f3154a != null) {
                this.f3154a.c();
            }
        }
    }

    @Override // com.applovin.impl.sdk.o.a
    public void h() {
        if (((Boolean) this.f3156c.a(com.applovin.impl.sdk.b.a.z)).booleanValue()) {
            f();
        }
    }

    @Override // com.applovin.impl.sdk.o.a
    public void i() {
        if (((Boolean) this.f3156c.a(com.applovin.impl.sdk.b.a.z)).booleanValue()) {
            synchronized (this.f3155b) {
                if (this.f3156c.Q().a()) {
                    this.f3156c.u().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                } else {
                    if (this.f3154a != null) {
                        this.f3154a.c();
                    }
                }
            }
        }
    }
}
