package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ag, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2939ag {

    /* renamed from: h, reason: collision with root package name */
    public final String f29248h;
    public final t2.E i;

    /* renamed from: a, reason: collision with root package name */
    public long f29241a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f29242b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f29243c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f29244d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f29245e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f29246f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final Object f29247g = new Object();

    /* renamed from: j, reason: collision with root package name */
    public int f29249j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f29250k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f29251l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f29252m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f29253n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f29254o = new HashMap();

    public C2939ag(String str, t2.E e6) {
        this.f29248h = str;
        this.i = e6;
    }

    public final void a(q2.d1 d1Var, long j9) {
        long j10;
        long j11;
        Bundle bundle;
        int i;
        synchronized (this.f29246f) {
            try {
                t2.E e6 = this.i;
                e6.i();
                synchronized (e6.f40830a) {
                    j10 = e6.f40843o;
                }
                p2.j.f39798C.f39810k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f29242b == -1) {
                    if (currentTimeMillis - j10 > ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31410C1)).longValue()) {
                        this.f29244d = -1;
                    } else {
                        e6.i();
                        synchronized (e6.f40830a) {
                            i = e6.f40845q;
                        }
                        this.f29244d = i;
                    }
                    this.f29242b = j9;
                    this.f29241a = j9;
                } else {
                    this.f29241a = j9;
                }
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31820w4)).booleanValue() || (bundle = d1Var.f40031v) == null || bundle.getInt("gw", 2) != 1) {
                    this.f29243c++;
                    int i4 = this.f29244d + 1;
                    this.f29244d = i4;
                    if (i4 == 0) {
                        this.f29245e = 0L;
                        e6.o(currentTimeMillis);
                    } else {
                        e6.i();
                        synchronized (e6.f40830a) {
                            j11 = e6.f40844p;
                        }
                        this.f29245e = currentTimeMillis - j11;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (((Boolean) AbstractC2768Sa.f27572a.r()).booleanValue()) {
            synchronized (this.f29246f) {
                this.f29243c--;
                this.f29244d--;
            }
        }
    }
}
