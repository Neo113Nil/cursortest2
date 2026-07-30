package com.google.android.gms.internal.ads;

import java.util.Random;

/* loaded from: classes2.dex */
public final class Iv {

    /* renamed from: a, reason: collision with root package name */
    public final long f25655a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25656b;

    /* renamed from: f, reason: collision with root package name */
    public final S2.a f25660f;

    /* renamed from: g, reason: collision with root package name */
    public final Mt f25661g;

    /* renamed from: h, reason: collision with root package name */
    public long f25662h;

    /* renamed from: d, reason: collision with root package name */
    public long f25658d = 5;

    /* renamed from: e, reason: collision with root package name */
    public long f25659e = 0;
    public final Random i = new Random();

    /* renamed from: c, reason: collision with root package name */
    public long f25657c = 0;

    public Iv(long j9, long j10, S2.a aVar, Mt mt) {
        this.f25655a = j9;
        this.f25656b = j10;
        this.f25661g = mt;
        this.f25660f = aVar;
        a();
    }

    public final synchronized void a() {
        this.f25662h = this.f25655a;
        this.f25657c = 0L;
        this.f25659e = 0L;
    }

    public final synchronized long b() {
        double d2;
        double d3;
        long j9;
        d2 = this.f25662h;
        d3 = 0.2d * d2;
        j9 = (long) (d2 + d3);
        return ((long) (d2 - d3)) + ((long) (this.i.nextDouble() * ((j9 - r0) + 1)));
    }

    public final synchronized void c() {
        long b9 = b();
        this.f25660f.getClass();
        this.f25659e = System.currentTimeMillis() + b9;
        double d2 = this.f25662h;
        long j9 = this.f25656b;
        this.f25662h = Math.min((long) (d2 + d2), j9);
        this.f25657c++;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31491M)).booleanValue()) {
            this.f25661g.w(System.currentTimeMillis(), this.f25657c, this.f25662h, this.f25658d, j9);
        }
    }

    public final synchronized boolean d() {
        if (((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31500N)).intValue() < 0) {
            return false;
        }
        if (this.f25657c > Math.max(this.f25658d, ((Integer) r1.f40119c.a(r0)).intValue())) {
            if (this.f25662h >= this.f25656b) {
                return true;
            }
        }
        return false;
    }
}
