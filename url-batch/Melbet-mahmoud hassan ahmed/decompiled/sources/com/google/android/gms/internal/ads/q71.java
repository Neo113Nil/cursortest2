package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class q71 implements z2.q {

    /* renamed from: f, reason: collision with root package name */
    private final dc1 f10600f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f10601g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f10602h = new AtomicBoolean(false);

    public q71(dc1 dc1Var) {
        this.f10600f = dc1Var;
    }

    private final void d() {
        if (this.f10602h.get()) {
            return;
        }
        this.f10602h.set(true);
        this.f10600f.zza();
    }

    @Override // z2.q
    public final void B3() {
        d();
    }

    @Override // z2.q
    public final void E(int i7) {
        this.f10601g.set(true);
        d();
    }

    @Override // z2.q
    public final void a() {
        this.f10600f.c();
    }

    @Override // z2.q
    public final void b() {
    }

    public final boolean c() {
        return this.f10601g.get();
    }

    @Override // z2.q
    public final void k6() {
    }

    @Override // z2.q
    public final void o4() {
    }
}
