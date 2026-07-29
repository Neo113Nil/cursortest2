package com.applovin.impl.sdk;

import com.applovin.impl.sdk.t;

/* loaded from: classes.dex */
public class b implements t.a {

    /* renamed from: a, reason: collision with root package name */
    private final j f2990a;

    /* renamed from: b, reason: collision with root package name */
    private final a f2991b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.impl.sdk.e.j f2992c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f2993d = new Object();
    private long e;

    public interface a {
        void onAdExpired();
    }

    public b(j jVar, a aVar) {
        this.f2990a = jVar;
        this.f2991b = aVar;
    }

    private void d() {
        if (this.f2992c != null) {
            this.f2992c.d();
            this.f2992c = null;
        }
    }

    public void a() {
        synchronized (this.f2993d) {
            d();
            this.f2990a.Q().b(this);
        }
    }

    public void a(long j) {
        synchronized (this.f2993d) {
            a();
            this.e = System.currentTimeMillis() + j;
            this.f2990a.Q().a(this);
            this.f2992c = com.applovin.impl.sdk.e.j.a(j, this.f2990a, new Runnable() { // from class: com.applovin.impl.sdk.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.a();
                    b.this.f2991b.onAdExpired();
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.t.a
    public void b() {
        synchronized (this.f2993d) {
            d();
        }
    }

    @Override // com.applovin.impl.sdk.t.a
    public void c() {
        boolean z;
        synchronized (this.f2993d) {
            long currentTimeMillis = this.e - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                a();
                z = true;
            } else {
                a(currentTimeMillis);
                z = false;
            }
        }
        if (z) {
            this.f2991b.onAdExpired();
        }
    }
}
