package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
final class sa3 extends ra3 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<va3<?>, Set<Throwable>> f11749a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicIntegerFieldUpdater<va3<?>> f11750b;

    sa3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.f11749a = atomicReferenceFieldUpdater;
        this.f11750b = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.ra3
    final int a(va3<?> va3Var) {
        return this.f11750b.decrementAndGet(va3Var);
    }

    @Override // com.google.android.gms.internal.ads.ra3
    final void b(va3<?> va3Var, Set<Throwable> set, Set<Throwable> set2) {
        androidx.work.impl.utils.futures.b.a(this.f11749a, va3Var, null, set2);
    }
}
