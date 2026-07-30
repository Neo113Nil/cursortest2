package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.ads.kD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3460kD extends AbstractC3406jD {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f32276a = AtomicReferenceFieldUpdater.newUpdater(C3784qD.class, Thread.class, "a");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f32277b = AtomicReferenceFieldUpdater.newUpdater(C3784qD.class, C3784qD.class, "b");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f32278c = AtomicReferenceFieldUpdater.newUpdater(AbstractC3837rD.class, C3784qD.class, "v");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f32279d = AtomicReferenceFieldUpdater.newUpdater(AbstractC3837rD.class, C3191fD.class, "u");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f32280e = AtomicReferenceFieldUpdater.newUpdater(AbstractC3837rD.class, Object.class, "n");

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final void e(C3784qD c3784qD, Thread thread) {
        f32276a.lazySet(c3784qD, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final void g(C3784qD c3784qD, C3784qD c3784qD2) {
        f32277b.lazySet(c3784qD, c3784qD2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final boolean i(AbstractC3837rD abstractC3837rD, C3784qD c3784qD, C3784qD c3784qD2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f32278c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC3837rD, c3784qD, c3784qD2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC3837rD) == c3784qD);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final boolean k(AbstractC3354iD abstractC3354iD, C3191fD c3191fD, C3191fD c3191fD2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f32279d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC3354iD, c3191fD, c3191fD2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC3354iD) == c3191fD);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final C3784qD l(AbstractC3354iD abstractC3354iD) {
        return (C3784qD) f32278c.getAndSet(abstractC3354iD, C3784qD.f33669c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final C3191fD n(AbstractC3354iD abstractC3354iD) {
        return (C3191fD) f32279d.getAndSet(abstractC3354iD, C3191fD.f30633d);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final boolean o(AbstractC3837rD abstractC3837rD, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f32280e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC3837rD, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC3837rD) == obj);
        return false;
    }
}
