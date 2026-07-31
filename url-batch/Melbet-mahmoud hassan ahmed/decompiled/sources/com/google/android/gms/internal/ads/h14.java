package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes.dex */
public final class h14 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f5996a;

    /* renamed from: b, reason: collision with root package name */
    private final i14 f5997b;

    public h14(Handler handler, i14 i14Var) {
        this.f5996a = i14Var == null ? null : handler;
        this.f5997b = i14Var;
    }

    public final void a(final Exception exc) {
        Handler handler = this.f5996a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.c14
                @Override // java.lang.Runnable
                public final void run() {
                    h14.this.h(exc);
                }
            });
        }
    }

    public final void b(final Exception exc) {
        Handler handler = this.f5996a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.d14
                @Override // java.lang.Runnable
                public final void run() {
                    h14.this.i(exc);
                }
            });
        }
    }

    public final void c(final String str, final long j7, final long j8) {
        Handler handler = this.f5996a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.f14
                @Override // java.lang.Runnable
                public final void run() {
                    h14.this.j(str, j7, j8);
                }
            });
        }
    }

    public final void d(final String str) {
        Handler handler = this.f5996a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.e14
                @Override // java.lang.Runnable
                public final void run() {
                    h14.this.k(str);
                }
            });
        }
    }

    public final void e(final cd3 cd3Var) {
        cd3Var.a();
        Handler handler = this.f5996a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.a14
                @Override // java.lang.Runnable
                public final void run() {
                    h14.this.l(cd3Var);
                }
            });
        }
    }

    public final void f(final cd3 cd3Var) {
        Handler handler = this.f5996a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.b14
                @Override // java.lang.Runnable
                public final void run() {
                    h14.this.m(cd3Var);
                }
            });
        }
    }

    public final void g(final c0 c0Var, final de3 de3Var) {
        Handler handler = this.f5996a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.z04
                @Override // java.lang.Runnable
                public final void run() {
                    h14.this.n(c0Var, de3Var);
                }
            });
        }
    }

    final /* synthetic */ void h(Exception exc) {
        i14 i14Var = this.f5997b;
        int i7 = n13.f8865a;
        i14Var.z(exc);
    }

    final /* synthetic */ void i(Exception exc) {
        i14 i14Var = this.f5997b;
        int i7 = n13.f8865a;
        i14Var.i(exc);
    }

    final /* synthetic */ void j(String str, long j7, long j8) {
        i14 i14Var = this.f5997b;
        int i7 = n13.f8865a;
        i14Var.k(str, j7, j8);
    }

    final /* synthetic */ void k(String str) {
        i14 i14Var = this.f5997b;
        int i7 = n13.f8865a;
        i14Var.M(str);
    }

    final /* synthetic */ void l(cd3 cd3Var) {
        cd3Var.a();
        i14 i14Var = this.f5997b;
        int i7 = n13.f8865a;
        i14Var.n(cd3Var);
    }

    final /* synthetic */ void m(cd3 cd3Var) {
        i14 i14Var = this.f5997b;
        int i7 = n13.f8865a;
        i14Var.f(cd3Var);
    }

    final /* synthetic */ void n(c0 c0Var, de3 de3Var) {
        int i7 = n13.f8865a;
        this.f5997b.y(c0Var, de3Var);
    }

    final /* synthetic */ void o(long j7) {
        i14 i14Var = this.f5997b;
        int i7 = n13.f8865a;
        i14Var.C(j7);
    }

    final /* synthetic */ void p(boolean z6) {
        i14 i14Var = this.f5997b;
        int i7 = n13.f8865a;
        i14Var.a(z6);
    }

    final /* synthetic */ void q(int i7, long j7, long j8) {
        i14 i14Var = this.f5997b;
        int i8 = n13.f8865a;
        i14Var.p(i7, j7, j8);
    }

    public final void r(final long j7) {
        Handler handler = this.f5996a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.y04
                @Override // java.lang.Runnable
                public final void run() {
                    h14.this.o(j7);
                }
            });
        }
    }

    public final void s(final boolean z6) {
        Handler handler = this.f5996a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.g14
                @Override // java.lang.Runnable
                public final void run() {
                    h14.this.p(z6);
                }
            });
        }
    }

    public final void t(final int i7, final long j7, final long j8) {
        Handler handler = this.f5996a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.x04
                @Override // java.lang.Runnable
                public final void run() {
                    h14.this.q(i7, j7, j8);
                }
            });
        }
    }
}
