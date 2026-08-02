package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class s1 extends U.i {

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6009g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6010h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6011i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6012j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6013k;

    public s1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f6009g = atomicReferenceFieldUpdater;
        this.f6010h = atomicReferenceFieldUpdater2;
        this.f6011i = atomicReferenceFieldUpdater3;
        this.f6012j = atomicReferenceFieldUpdater4;
        this.f6013k = atomicReferenceFieldUpdater5;
    }

    @Override // U.i
    public final void H(F1 f12, F1 f13) {
        this.f6010h.lazySet(f12, f13);
    }

    @Override // U.i
    public final void J(F1 f12, Thread thread) {
        this.f6009g.lazySet(f12, thread);
    }

    @Override // U.i
    public final boolean K(G1 g12, U0 u02, U0 u03) {
        return O3.d.L(this.f6012j, g12, u02, u03);
    }

    @Override // U.i
    public final boolean M(G1 g12, Object obj, Object obj2) {
        return O3.d.L(this.f6013k, g12, obj, obj2);
    }

    @Override // U.i
    public final boolean N(G1 g12, F1 f12, F1 f13) {
        return O3.d.L(this.f6011i, g12, f12, f13);
    }
}
