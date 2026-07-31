package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class mb4 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f8486a;

    /* renamed from: b, reason: collision with root package name */
    private final nb4 f8487b;

    public mb4(Handler handler, nb4 nb4Var) {
        this.f8486a = nb4Var == null ? null : handler;
        this.f8487b = nb4Var;
    }

    public final void a(final String str, final long j7, final long j8) {
        Handler handler = this.f8486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.lb4
                @Override // java.lang.Runnable
                public final void run() {
                    mb4.this.g(str, j7, j8);
                }
            });
        }
    }

    public final void b(final String str) {
        Handler handler = this.f8486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.kb4
                @Override // java.lang.Runnable
                public final void run() {
                    mb4.this.h(str);
                }
            });
        }
    }

    public final void c(final cd3 cd3Var) {
        cd3Var.a();
        Handler handler = this.f8486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.gb4
                @Override // java.lang.Runnable
                public final void run() {
                    mb4.this.i(cd3Var);
                }
            });
        }
    }

    public final void d(final int i7, final long j7) {
        Handler handler = this.f8486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.cb4
                @Override // java.lang.Runnable
                public final void run() {
                    mb4.this.j(i7, j7);
                }
            });
        }
    }

    public final void e(final cd3 cd3Var) {
        Handler handler = this.f8486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.hb4
                @Override // java.lang.Runnable
                public final void run() {
                    mb4.this.k(cd3Var);
                }
            });
        }
    }

    public final void f(final c0 c0Var, final de3 de3Var) {
        Handler handler = this.f8486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.eb4
                @Override // java.lang.Runnable
                public final void run() {
                    mb4.this.l(c0Var, de3Var);
                }
            });
        }
    }

    final /* synthetic */ void g(String str, long j7, long j8) {
        nb4 nb4Var = this.f8487b;
        int i7 = n13.f8865a;
        nb4Var.s(str, j7, j8);
    }

    final /* synthetic */ void h(String str) {
        nb4 nb4Var = this.f8487b;
        int i7 = n13.f8865a;
        nb4Var.B(str);
    }

    final /* synthetic */ void i(cd3 cd3Var) {
        cd3Var.a();
        nb4 nb4Var = this.f8487b;
        int i7 = n13.f8865a;
        nb4Var.q(cd3Var);
    }

    final /* synthetic */ void j(int i7, long j7) {
        nb4 nb4Var = this.f8487b;
        int i8 = n13.f8865a;
        nb4Var.j(i7, j7);
    }

    final /* synthetic */ void k(cd3 cd3Var) {
        nb4 nb4Var = this.f8487b;
        int i7 = n13.f8865a;
        nb4Var.e(cd3Var);
    }

    final /* synthetic */ void l(c0 c0Var, de3 de3Var) {
        int i7 = n13.f8865a;
        this.f8487b.E(c0Var, de3Var);
    }

    final /* synthetic */ void m(Object obj, long j7) {
        nb4 nb4Var = this.f8487b;
        int i7 = n13.f8865a;
        nb4Var.w(obj, j7);
    }

    final /* synthetic */ void n(long j7, int i7) {
        nb4 nb4Var = this.f8487b;
        int i8 = n13.f8865a;
        nb4Var.c(j7, i7);
    }

    final /* synthetic */ void o(Exception exc) {
        nb4 nb4Var = this.f8487b;
        int i7 = n13.f8865a;
        nb4Var.l(exc);
    }

    final /* synthetic */ void p(ry0 ry0Var) {
        nb4 nb4Var = this.f8487b;
        int i7 = n13.f8865a;
        nb4Var.b(ry0Var);
    }

    public final void q(final Object obj) {
        if (this.f8486a != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f8486a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.jb4
                @Override // java.lang.Runnable
                public final void run() {
                    mb4.this.m(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void r(final long j7, final int i7) {
        Handler handler = this.f8486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.db4
                @Override // java.lang.Runnable
                public final void run() {
                    mb4.this.n(j7, i7);
                }
            });
        }
    }

    public final void s(final Exception exc) {
        Handler handler = this.f8486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ib4
                @Override // java.lang.Runnable
                public final void run() {
                    mb4.this.o(exc);
                }
            });
        }
    }

    public final void t(final ry0 ry0Var) {
        Handler handler = this.f8486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.fb4
                @Override // java.lang.Runnable
                public final void run() {
                    mb4.this.p(ry0Var);
                }
            });
        }
    }
}
