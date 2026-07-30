package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sw0 extends v0 implements Set, Collection, yb0 {
    public static final sw0 i;
    public final Object e;
    public final Object g;
    public final lw0 h;

    static {
        j41 j41Var = j41.j;
        i = new sw0(j41Var, j41Var, lw0.j);
    }

    public sw0(Object obj, Object obj2, lw0 lw0Var) {
        this.e = obj;
        this.g = obj2;
        this.h = lw0Var;
    }

    @Override // defpackage.m
    public final int a() {
        return this.h.i;
    }

    @Override // defpackage.m, java.util.Collection
    public final boolean contains(Object obj) {
        return this.h.containsKey(obj);
    }

    @Override // defpackage.v0, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new n40(this.e, this.h);
    }
}
