package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n0 implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Iterator f2555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Iterator f2556e;

    public n0(n1 n1Var, Iterator it, Iterator it2) {
        this.f2555d = it;
        this.f2556e = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2555d.hasNext()) {
            return true;
        }
        return this.f2556e.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f2555d;
        if (it.hasNext()) {
            return new i5(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f2556e;
        if (it2.hasNext()) {
            return new i5((String) it2.next());
        }
        kotlin.collections.i0.c();
        return null;
    }
}
