package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.play_billing.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224g0 extends AbstractC0216d1 {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2862b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2863c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2864d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2865e;
    public final AtomicReferenceFieldUpdater f;

    public C0224g0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(7);
        this.f2862b = atomicReferenceFieldUpdater;
        this.f2863c = atomicReferenceFieldUpdater2;
        this.f2864d = atomicReferenceFieldUpdater3;
        this.f2865e = atomicReferenceFieldUpdater4;
        this.f = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final boolean D(AbstractC0245n0 abstractC0245n0, Object obj, Object obj2) {
        return AbstractC0216d1.k(this.f, abstractC0245n0, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final boolean F(AbstractC0245n0 abstractC0245n0, C0242m0 c0242m0, C0242m0 c0242m02) {
        return AbstractC0216d1.k(this.f2864d, abstractC0245n0, c0242m0, c0242m02);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final C0221f0 d(AbstractC0245n0 abstractC0245n0) {
        return (C0221f0) this.f2865e.getAndSet(abstractC0245n0, C0221f0.f2855d);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final C0242m0 o(AbstractC0245n0 abstractC0245n0) {
        return (C0242m0) this.f2864d.getAndSet(abstractC0245n0, C0242m0.f2883c);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final void s(C0242m0 c0242m0, C0242m0 c0242m02) {
        this.f2863c.lazySet(c0242m0, c0242m02);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final void u(C0242m0 c0242m0, Thread thread) {
        this.f2862b.lazySet(c0242m0, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final boolean z(AbstractC0245n0 abstractC0245n0, C0221f0 c0221f0, C0221f0 c0221f02) {
        return AbstractC0216d1.k(this.f2865e, abstractC0245n0, c0221f0, c0221f02);
    }
}
