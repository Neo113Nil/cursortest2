package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class bb0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ mb0 f3311f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ha0 f3312g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ nb0 f3313h;

    bb0(nb0 nb0Var, mb0 mb0Var, ha0 ha0Var) {
        this.f3313h = nb0Var;
        this.f3311f = mb0Var;
        this.f3312g = ha0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.f3313h.f9012a;
        synchronized (obj) {
            if (this.f3311f.a() != -1 && this.f3311f.a() != 1) {
                this.f3311f.c();
                dc3 dc3Var = wo0.f13898e;
                final ha0 ha0Var = this.f3312g;
                dc3Var.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ab0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ha0.this.c();
                    }
                });
                a3.r1.k("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
