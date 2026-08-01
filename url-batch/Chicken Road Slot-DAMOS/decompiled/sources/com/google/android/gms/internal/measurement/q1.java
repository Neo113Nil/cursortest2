package com.google.android.gms.internal.measurement;

import java.util.AbstractList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q1 extends AbstractList {

    /* renamed from: d, reason: collision with root package name */
    public final o1 f2691d;

    /* renamed from: e, reason: collision with root package name */
    public final p1 f2692e;

    public q1(o1 o1Var, p1 p1Var) {
        this.f2691d = o1Var;
        this.f2692e = p1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int e2 = ((l1) this.f2691d).e(i3);
        ((h1) this.f2692e).getClass();
        m0 b10 = m0.b(e2);
        return b10 == null ? m0.UNKNOWN : b10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((l1) this.f2691d).f2492i;
    }
}
