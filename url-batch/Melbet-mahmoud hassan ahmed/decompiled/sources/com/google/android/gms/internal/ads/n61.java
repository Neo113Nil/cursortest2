package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class n61 implements lc1, zn {

    /* renamed from: f, reason: collision with root package name */
    private final rr2 f8946f;

    /* renamed from: g, reason: collision with root package name */
    private final ob1 f8947g;

    /* renamed from: h, reason: collision with root package name */
    private final uc1 f8948h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f8949i = new AtomicBoolean();

    /* renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f8950j = new AtomicBoolean();

    public n61(rr2 rr2Var, ob1 ob1Var, uc1 uc1Var) {
        this.f8946f = rr2Var;
        this.f8947g = ob1Var;
        this.f8948h = uc1Var;
    }

    private final void a() {
        if (this.f8949i.compareAndSet(false, true)) {
            this.f8947g.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.lc1
    public final synchronized void m() {
        if (this.f8946f.f11377f != 1) {
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final void o0(xn xnVar) {
        if (this.f8946f.f11377f == 1 && xnVar.f14258j) {
            a();
        }
        if (xnVar.f14258j && this.f8950j.compareAndSet(false, true)) {
            this.f8948h.zza();
        }
    }
}
