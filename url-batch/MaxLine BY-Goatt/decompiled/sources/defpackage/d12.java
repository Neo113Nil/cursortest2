package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d12 extends j1 implements Set, Collection, k71 {
    public static final d12 q;
    public final Object n;
    public final Object o;
    public final w02 p;

    static {
        qb2 qb2Var = qb2.Q;
        q = new d12(qb2Var, qb2Var, w02.r);
    }

    public d12(Object obj, Object obj2, w02 w02Var) {
        this.n = obj;
        this.o = obj2;
        this.p = w02Var;
    }

    @Override // defpackage.b0
    public final int a() {
        return this.p.q;
    }

    @Override // defpackage.b0, java.util.Collection
    public final boolean contains(Object obj) {
        return this.p.containsKey(obj);
    }

    @Override // defpackage.j1, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new wu0(this.p, this.n);
    }
}
