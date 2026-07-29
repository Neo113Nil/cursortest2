package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final j f3351a;

    /* renamed from: d, reason: collision with root package name */
    private long f3354d;
    private long g;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f3352b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final List<a> f3353c = Collections.synchronizedList(new ArrayList());
    private final Object e = new Object();
    private final AtomicBoolean f = new AtomicBoolean();

    interface a {
        void h();

        void i();
    }

    o(j jVar) {
        this.f3351a = jVar;
    }

    public void a(a aVar) {
        this.f3353c.add(aVar);
    }

    public void a(boolean z) {
        synchronized (this.e) {
            this.f.set(z);
            if (z) {
                this.g = System.currentTimeMillis();
                this.f3351a.u().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.g);
                final long longValue = ((Long) this.f3351a.a(com.applovin.impl.sdk.b.b.cI)).longValue();
                if (longValue >= 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.o.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (o.this.a() && System.currentTimeMillis() - o.this.g >= longValue) {
                                o.this.f3351a.u().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
                                o.this.f.set(false);
                            }
                        }
                    }, longValue);
                }
            } else {
                this.g = 0L;
                this.f3351a.u().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
            }
        }
    }

    public boolean a() {
        return this.f.get();
    }

    public void b(a aVar) {
        this.f3353c.remove(aVar);
    }

    public boolean b() {
        return this.f3352b.get();
    }

    public void c() {
        if (this.f3352b.compareAndSet(false, true)) {
            this.f3354d = System.currentTimeMillis();
            this.f3351a.u().a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f3354d);
            Iterator it = new ArrayList(this.f3353c).iterator();
            while (it.hasNext()) {
                ((a) it.next()).h();
            }
            final long longValue = ((Long) this.f3351a.a(com.applovin.impl.sdk.b.b.cJ)).longValue();
            if (longValue >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.o.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (o.this.f3352b.get() && System.currentTimeMillis() - o.this.f3354d >= longValue) {
                            o.this.f3351a.u().a("FullScreenAdTracker", "Resetting \"display\" state...");
                            o.this.d();
                        }
                    }
                }, longValue);
            }
        }
    }

    public void d() {
        if (this.f3352b.compareAndSet(true, false)) {
            this.f3351a.u().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            Iterator it = new ArrayList(this.f3353c).iterator();
            while (it.hasNext()) {
                ((a) it.next()).i();
            }
        }
    }
}
