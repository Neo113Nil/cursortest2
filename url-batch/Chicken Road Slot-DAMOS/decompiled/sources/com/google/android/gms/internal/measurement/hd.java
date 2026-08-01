package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class hd implements jd {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2377d;

    /* renamed from: a, reason: collision with root package name */
    public final a8.m f2378a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2379b;

    /* renamed from: c, reason: collision with root package name */
    public final h1 f2380c;

    public hd(a8.m mVar) {
        h1 h1Var = h1.f2360u;
        this.f2378a = mVar;
        this.f2379b = Math.max(5, 10);
        this.f2380c = h1Var;
    }

    @Override // com.google.android.gms.internal.measurement.jd
    public final void a() {
        synchronized (hd.class) {
            try {
                if (!f2377d) {
                    bd bdVar = new bd(3, this);
                    long j = this.f2379b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    f8.u0 u0Var = (f8.u0) this.f2378a.get();
                    gd gdVar = new gd(this, bdVar, u0Var, j);
                    u0Var.getClass();
                    f8.z0 z0Var = new f8.z0(Executors.callable(gdVar, null));
                    f8.s0 s0Var = new f8.s0(z0Var, u0Var.f4186e.schedule(z0Var, j, timeUnit));
                    s0Var.a(new bd(1, s0Var), f8.d0.f4128d);
                    f2377d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
