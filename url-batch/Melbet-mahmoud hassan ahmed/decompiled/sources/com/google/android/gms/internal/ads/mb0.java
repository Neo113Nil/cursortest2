package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mb0 extends ip0<ha0> {

    /* renamed from: d, reason: collision with root package name */
    private final a3.h0<ha0> f8478d;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8477c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f8479e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f8480f = 0;

    public mb0(a3.h0<ha0> h0Var) {
        this.f8478d = h0Var;
    }

    public final hb0 f() {
        hb0 hb0Var = new hb0(this);
        synchronized (this.f8477c) {
            e(new ib0(this, hb0Var), new jb0(this, hb0Var));
            r3.o.k(this.f8480f >= 0);
            this.f8480f++;
        }
        return hb0Var;
    }

    public final void g() {
        synchronized (this.f8477c) {
            r3.o.k(this.f8480f >= 0);
            a3.r1.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f8479e = true;
            h();
        }
    }

    protected final void h() {
        synchronized (this.f8477c) {
            r3.o.k(this.f8480f >= 0);
            if (this.f8479e && this.f8480f == 0) {
                a3.r1.k("No reference is left (including root). Cleaning up engine.");
                e(new lb0(this), new ep0());
            } else {
                a3.r1.k("There are still references to the engine. Not destroying.");
            }
        }
    }

    protected final void i() {
        synchronized (this.f8477c) {
            r3.o.k(this.f8480f > 0);
            a3.r1.k("Releasing 1 reference for JS Engine");
            this.f8480f--;
            h();
        }
    }
}
