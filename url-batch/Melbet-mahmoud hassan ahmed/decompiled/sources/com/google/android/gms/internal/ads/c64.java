package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class c64 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3747a;

    /* renamed from: b, reason: collision with root package name */
    public final s54 f3748b;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<b64> f3749c;

    public c64() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    private c64(CopyOnWriteArrayList<b64> copyOnWriteArrayList, int i7, s54 s54Var, long j7) {
        this.f3749c = copyOnWriteArrayList;
        this.f3747a = i7;
        this.f3748b = s54Var;
    }

    private static final long n(long j7) {
        long d7 = nz3.d(j7);
        if (d7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return d7;
    }

    public final c64 a(int i7, s54 s54Var, long j7) {
        return new c64(this.f3749c, i7, s54Var, 0L);
    }

    public final void b(Handler handler, d64 d64Var) {
        this.f3749c.add(new b64(handler, d64Var));
    }

    public final void c(final p54 p54Var) {
        Iterator<b64> it = this.f3749c.iterator();
        while (it.hasNext()) {
            b64 next = it.next();
            final d64 d64Var = next.f3267b;
            n13.u(next.f3266a, new Runnable() { // from class: com.google.android.gms.internal.ads.a64
                @Override // java.lang.Runnable
                public final void run() {
                    c64 c64Var = c64.this;
                    d64Var.A(c64Var.f3747a, c64Var.f3748b, p54Var);
                }
            });
        }
    }

    public final void d(int i7, c0 c0Var, int i8, Object obj, long j7) {
        c(new p54(1, i7, c0Var, 0, null, n(j7), -9223372036854775807L));
    }

    public final void e(final k54 k54Var, final p54 p54Var) {
        Iterator<b64> it = this.f3749c.iterator();
        while (it.hasNext()) {
            b64 next = it.next();
            final d64 d64Var = next.f3267b;
            n13.u(next.f3266a, new Runnable() { // from class: com.google.android.gms.internal.ads.w54
                @Override // java.lang.Runnable
                public final void run() {
                    c64 c64Var = c64.this;
                    d64Var.D(c64Var.f3747a, c64Var.f3748b, k54Var, p54Var);
                }
            });
        }
    }

    public final void f(k54 k54Var, int i7, int i8, c0 c0Var, int i9, Object obj, long j7, long j8) {
        e(k54Var, new p54(1, -1, null, 0, null, n(j7), n(j8)));
    }

    public final void g(final k54 k54Var, final p54 p54Var) {
        Iterator<b64> it = this.f3749c.iterator();
        while (it.hasNext()) {
            b64 next = it.next();
            final d64 d64Var = next.f3267b;
            n13.u(next.f3266a, new Runnable() { // from class: com.google.android.gms.internal.ads.x54
                @Override // java.lang.Runnable
                public final void run() {
                    c64 c64Var = c64.this;
                    d64Var.h(c64Var.f3747a, c64Var.f3748b, k54Var, p54Var);
                }
            });
        }
    }

    public final void h(k54 k54Var, int i7, int i8, c0 c0Var, int i9, Object obj, long j7, long j8) {
        g(k54Var, new p54(1, -1, null, 0, null, n(j7), n(j8)));
    }

    public final void i(final k54 k54Var, final p54 p54Var, final IOException iOException, final boolean z6) {
        Iterator<b64> it = this.f3749c.iterator();
        while (it.hasNext()) {
            b64 next = it.next();
            final d64 d64Var = next.f3267b;
            n13.u(next.f3266a, new Runnable() { // from class: com.google.android.gms.internal.ads.z54
                @Override // java.lang.Runnable
                public final void run() {
                    c64 c64Var = c64.this;
                    d64Var.u(c64Var.f3747a, c64Var.f3748b, k54Var, p54Var, iOException, z6);
                }
            });
        }
    }

    public final void j(k54 k54Var, int i7, int i8, c0 c0Var, int i9, Object obj, long j7, long j8, IOException iOException, boolean z6) {
        i(k54Var, new p54(1, -1, null, 0, null, n(j7), n(j8)), iOException, z6);
    }

    public final void k(final k54 k54Var, final p54 p54Var) {
        Iterator<b64> it = this.f3749c.iterator();
        while (it.hasNext()) {
            b64 next = it.next();
            final d64 d64Var = next.f3267b;
            n13.u(next.f3266a, new Runnable() { // from class: com.google.android.gms.internal.ads.y54
                @Override // java.lang.Runnable
                public final void run() {
                    c64 c64Var = c64.this;
                    d64Var.r(c64Var.f3747a, c64Var.f3748b, k54Var, p54Var);
                }
            });
        }
    }

    public final void l(k54 k54Var, int i7, int i8, c0 c0Var, int i9, Object obj, long j7, long j8) {
        k(k54Var, new p54(1, -1, null, 0, null, n(j7), n(j8)));
    }

    public final void m(d64 d64Var) {
        Iterator<b64> it = this.f3749c.iterator();
        while (it.hasNext()) {
            b64 next = it.next();
            if (next.f3267b == d64Var) {
                this.f3749c.remove(next);
            }
        }
    }
}
