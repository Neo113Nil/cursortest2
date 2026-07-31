package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class vq0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final gq0 f13475f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13476g = false;

    vq0(gq0 gq0Var) {
        this.f13475f = gq0Var;
    }

    private final void c() {
        s33 s33Var = a3.g2.f72i;
        s33Var.removeCallbacks(this);
        s33Var.postDelayed(this, 250L);
    }

    public final void a() {
        this.f13476g = true;
        this.f13475f.z();
    }

    public final void b() {
        this.f13476g = false;
        c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f13476g) {
            return;
        }
        this.f13475f.z();
        c();
    }
}
