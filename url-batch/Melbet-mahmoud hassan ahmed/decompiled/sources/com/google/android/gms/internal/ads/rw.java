package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class rw extends r2.d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f11433a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private r2.d f11434b;

    @Override // r2.d, com.google.android.gms.internal.ads.yu
    public final void M() {
        synchronized (this.f11433a) {
            r2.d dVar = this.f11434b;
            if (dVar != null) {
                dVar.M();
            }
        }
    }

    @Override // r2.d
    public final void e() {
        synchronized (this.f11433a) {
            r2.d dVar = this.f11434b;
            if (dVar != null) {
                dVar.e();
            }
        }
    }

    @Override // r2.d
    public void f(r2.n nVar) {
        synchronized (this.f11433a) {
            r2.d dVar = this.f11434b;
            if (dVar != null) {
                dVar.f(nVar);
            }
        }
    }

    @Override // r2.d
    public final void h() {
        synchronized (this.f11433a) {
            r2.d dVar = this.f11434b;
            if (dVar != null) {
                dVar.h();
            }
        }
    }

    @Override // r2.d
    public void m() {
        synchronized (this.f11433a) {
            r2.d dVar = this.f11434b;
            if (dVar != null) {
                dVar.m();
            }
        }
    }

    @Override // r2.d
    public final void q() {
        synchronized (this.f11433a) {
            r2.d dVar = this.f11434b;
            if (dVar != null) {
                dVar.q();
            }
        }
    }

    public final void r(r2.d dVar) {
        synchronized (this.f11433a) {
            this.f11434b = dVar;
        }
    }
}
