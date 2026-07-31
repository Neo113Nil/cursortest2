package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
final class y93 extends u93 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<fa3, Thread> f14587a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<fa3, fa3> f14588b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<ga3, fa3> f14589c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<ga3, x93> f14590d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<ga3, Object> f14591e;

    y93(AtomicReferenceFieldUpdater<fa3, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<fa3, fa3> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<ga3, fa3> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<ga3, x93> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<ga3, Object> atomicReferenceFieldUpdater5) {
        super(null);
        this.f14587a = atomicReferenceFieldUpdater;
        this.f14588b = atomicReferenceFieldUpdater2;
        this.f14589c = atomicReferenceFieldUpdater3;
        this.f14590d = atomicReferenceFieldUpdater4;
        this.f14591e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.u93
    final void a(fa3 fa3Var, fa3 fa3Var2) {
        this.f14588b.lazySet(fa3Var, fa3Var2);
    }

    @Override // com.google.android.gms.internal.ads.u93
    final void b(fa3 fa3Var, Thread thread) {
        this.f14587a.lazySet(fa3Var, thread);
    }

    @Override // com.google.android.gms.internal.ads.u93
    final boolean c(ga3<?> ga3Var, x93 x93Var, x93 x93Var2) {
        return androidx.work.impl.utils.futures.b.a(this.f14590d, ga3Var, x93Var, x93Var2);
    }

    @Override // com.google.android.gms.internal.ads.u93
    final boolean d(ga3<?> ga3Var, Object obj, Object obj2) {
        return androidx.work.impl.utils.futures.b.a(this.f14591e, ga3Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.u93
    final boolean e(ga3<?> ga3Var, fa3 fa3Var, fa3 fa3Var2) {
        return androidx.work.impl.utils.futures.b.a(this.f14589c, ga3Var, fa3Var, fa3Var2);
    }
}
