package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.impl.aj;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m implements aj.a {

    /* renamed from: a, reason: collision with root package name */
    private final l f3850a;

    /* renamed from: b, reason: collision with root package name */
    private final com.chartboost.sdk.Libraries.f f3851b;

    /* renamed from: c, reason: collision with root package name */
    private final ah f3852c;

    /* renamed from: d, reason: collision with root package name */
    private final ap f3853d;
    private final com.chartboost.sdk.Tracking.a e;
    private final AtomicReference<com.chartboost.sdk.Model.e> f;
    private int g = 1;
    private int h = 0;
    private long i = 0;
    private aj j = null;
    private AtomicInteger k = null;

    public m(l lVar, com.chartboost.sdk.Libraries.f fVar, ah ahVar, ap apVar, com.chartboost.sdk.Tracking.a aVar, AtomicReference<com.chartboost.sdk.Model.e> atomicReference) {
        this.f3850a = lVar;
        this.f3851b = fVar;
        this.f3852c = ahVar;
        this.f3853d = apVar;
        this.e = aVar;
        this.f = atomicReference;
    }

    public synchronized void a() {
        com.chartboost.sdk.Model.e eVar;
        try {
            CBLogging.b("Chartboost SDK", "Sdk Version = 7.3.1, Commit: ea5c9878e5dca6c95016765177cbd146c39a21f7");
            eVar = this.f.get();
            a(eVar);
        } catch (Exception e) {
            if (this.g == 2) {
                CBLogging.a("Prefetcher", "Change state to COOLDOWN");
                this.g = 4;
                this.j = null;
            }
            com.chartboost.sdk.Tracking.a.a(getClass(), "prefetch", e);
        }
        if (!eVar.f3623c && !eVar.f3622b && com.chartboost.sdk.i.v) {
            if (this.g == 3) {
                if (this.k.get() > 0) {
                    return;
                }
                CBLogging.a("Prefetcher", "Change state to COOLDOWN");
                this.g = 4;
                this.k = null;
            }
            if (this.g == 4) {
                if (this.i - System.nanoTime() > 0) {
                    CBLogging.a("Prefetcher", "Prefetch session is still active. Won't be making any new prefetch until the prefetch session expires");
                    return;
                }
                CBLogging.a("Prefetcher", "Change state to IDLE");
                this.g = 1;
                this.h = 0;
                this.i = 0L;
            }
            if (this.g != 1) {
                return;
            }
            if (eVar.y) {
                am amVar = new am(eVar.H, this.f3853d, this.e, 2, this);
                amVar.a("cache_assets", this.f3851b.c(), 0);
                amVar.l = true;
                CBLogging.a("Prefetcher", "Change state to AWAIT_PREFETCH_RESPONSE");
                this.g = 2;
                this.h = 2;
                this.i = System.nanoTime() + TimeUnit.MINUTES.toNanos(eVar.D);
                this.j = amVar;
            } else if (eVar.e) {
                aj ajVar = new aj("/api/video-prefetch", this.f3853d, this.e, 2, this);
                ajVar.a("local-videos", this.f3851b.b());
                ajVar.l = true;
                CBLogging.a("Prefetcher", "Change state to AWAIT_PREFETCH_RESPONSE");
                this.g = 2;
                this.h = 1;
                this.i = System.nanoTime() + TimeUnit.MINUTES.toNanos(eVar.i);
                this.j = ajVar;
            } else {
                CBLogging.b("Prefetcher", "Did not prefetch because neither native nor webview are enabled.");
                return;
            }
            this.f3852c.a(this.j);
            return;
        }
        b();
    }

    private void a(com.chartboost.sdk.Model.e eVar) {
        boolean z = eVar.y;
        if ((this.h == 1 && !(!z && eVar.e)) || (this.h == 2 && !z)) {
            CBLogging.a("Prefetcher", "Change state to IDLE");
            this.g = 1;
            this.h = 0;
            this.i = 0L;
            this.j = null;
            AtomicInteger atomicInteger = this.k;
            this.k = null;
            if (atomicInteger != null) {
                this.f3850a.a(atomicInteger);
            }
        }
    }

    public synchronized void b() {
        if (this.g == 2) {
            CBLogging.a("Prefetcher", "Change state to COOLDOWN");
            this.g = 4;
            this.j = null;
        } else if (this.g == 3) {
            CBLogging.a("Prefetcher", "Change state to COOLDOWN");
            this.g = 4;
            AtomicInteger atomicInteger = this.k;
            this.k = null;
            if (atomicInteger != null) {
                this.f3850a.a(atomicInteger);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.aj.a
    public synchronized void a(aj ajVar, JSONObject jSONObject) {
        try {
        } catch (Exception e) {
            com.chartboost.sdk.Tracking.a.a(getClass(), "onSuccess", e);
        }
        if (this.g != 2) {
            return;
        }
        if (ajVar != this.j) {
            return;
        }
        CBLogging.a("Prefetcher", "Change state to DOWNLOAD_ASSETS");
        this.g = 3;
        this.j = null;
        this.k = new AtomicInteger();
        if (jSONObject != null) {
            CBLogging.a("Prefetcher", "Got Asset list for Prefetch from server :)" + jSONObject);
            if (this.h == 1) {
                this.f3850a.a(3, com.chartboost.sdk.Model.b.a(jSONObject), this.k, null);
            } else if (this.h == 2) {
                this.f3850a.a(3, com.chartboost.sdk.Model.b.a(jSONObject, this.f.get().v), this.k, null);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.aj.a
    public synchronized void a(aj ajVar, CBError cBError) {
        if (this.g != 2) {
            return;
        }
        if (ajVar != this.j) {
            return;
        }
        this.j = null;
        CBLogging.a("Prefetcher", "Change state to COOLDOWN");
        this.g = 4;
    }
}
