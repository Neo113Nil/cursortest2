package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d2 extends AbstractC0325d1 {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5168b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5169c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5170d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5171e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5172f;

    public d2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(9);
        this.f5168b = atomicReferenceFieldUpdater;
        this.f5169c = atomicReferenceFieldUpdater2;
        this.f5170d = atomicReferenceFieldUpdater3;
        this.f5171e = atomicReferenceFieldUpdater4;
        this.f5172f = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final boolean A(r2 r2Var, F1 f12, F1 f13) {
        return AbstractC0325d1.n(this.f5171e, r2Var, f12, f13);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final boolean D(r2 r2Var, Object obj, Object obj2) {
        return AbstractC0325d1.n(this.f5172f, r2Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final boolean I(r2 r2Var, q2 q2Var, q2 q2Var2) {
        return AbstractC0325d1.n(this.f5170d, r2Var, q2Var, q2Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final void k(q2 q2Var, q2 q2Var2) {
        this.f5169c.lazySet(q2Var, q2Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final void v(q2 q2Var, Thread thread) {
        this.f5168b.lazySet(q2Var, thread);
    }
}
