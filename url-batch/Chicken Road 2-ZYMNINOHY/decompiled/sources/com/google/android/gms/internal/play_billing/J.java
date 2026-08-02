package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class J extends O3.d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5858a = AtomicReferenceFieldUpdater.newUpdater(M.class, Thread.class, "a");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5859b = AtomicReferenceFieldUpdater.newUpdater(M.class, M.class, "b");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5860c = AtomicReferenceFieldUpdater.newUpdater(N.class, M.class, "c");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5861d = AtomicReferenceFieldUpdater.newUpdater(N.class, H.class, "b");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5862e = AtomicReferenceFieldUpdater.newUpdater(N.class, Object.class, "a");

    @Override // O3.d
    public final H K(Z z) {
        return (H) f5861d.getAndSet(z, H.f5845d);
    }

    @Override // O3.d
    public final M M(Z z) {
        return (M) f5860c.getAndSet(z, M.f5873c);
    }

    @Override // O3.d
    public final void O(M m4, M m5) {
        f5859b.lazySet(m4, m5);
    }

    @Override // O3.d
    public final void P(M m4, Thread thread) {
        f5858a.lazySet(m4, thread);
    }

    @Override // O3.d
    public final boolean Q(Z z, H h2, H h4) {
        return O3.l.E(f5861d, z, h2, h4);
    }

    @Override // O3.d
    public final boolean R(N n, Object obj, Object obj2) {
        return O3.l.E(f5862e, n, obj, obj2);
    }

    @Override // O3.d
    public final boolean S(N n, M m4, M m5) {
        return O3.l.E(f5860c, n, m4, m5);
    }
}
