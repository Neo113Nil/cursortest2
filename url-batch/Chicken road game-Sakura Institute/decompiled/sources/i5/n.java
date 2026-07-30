package i5;

import java.util.Comparator;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends c {

    /* renamed from: f, reason: collision with root package name */
    public final i f4953f;

    /* renamed from: g, reason: collision with root package name */
    public final Comparator f4954g;

    public n(i iVar, Comparator comparator) {
        this.f4953f = iVar;
        this.f4954g = comparator;
    }

    @Override // i5.c
    public final c A(Iterable iterable, Object obj) {
        i iVar = this.f4953f;
        Comparator comparator = this.f4954g;
        return new n(((k) iVar.o(obj, iterable, comparator)).s(2, null, null), comparator);
    }

    @Override // i5.c
    public final c B(Object obj) {
        if (!a(obj)) {
            return this;
        }
        i iVar = this.f4953f;
        Comparator comparator = this.f4954g;
        return new n(iVar.q(obj, comparator).s(2, null, null), comparator);
    }

    public final i C(Object obj) {
        i iVar = this.f4953f;
        while (!iVar.isEmpty()) {
            int compare = this.f4954g.compare(obj, iVar.getKey());
            if (compare < 0) {
                iVar = iVar.d();
            } else {
                if (compare == 0) {
                    return iVar;
                }
                iVar = iVar.m();
            }
        }
        return null;
    }

    @Override // i5.c
    public final boolean a(Object obj) {
        return C(obj) != null;
    }

    @Override // i5.c
    public final Object g(t5.c cVar) {
        i C = C(cVar);
        if (C != null) {
            return C.getValue();
        }
        return null;
    }

    @Override // i5.c
    public final boolean isEmpty() {
        return this.f4953f.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this.f4953f, this.f4954g, false);
    }

    @Override // i5.c
    public final Comparator m() {
        return this.f4954g;
    }

    @Override // i5.c
    public final int size() {
        return this.f4953f.size();
    }

    @Override // i5.c
    public final Iterator t() {
        return new d(this.f4953f, this.f4954g, true);
    }

    @Override // i5.c
    public final Object w() {
        return this.f4953f.t().getKey();
    }

    @Override // i5.c
    public final Object x() {
        return this.f4953f.r().getKey();
    }

    @Override // i5.c
    public final Object y(Object obj) {
        i iVar = this.f4953f;
        i iVar2 = null;
        while (!iVar.isEmpty()) {
            int compare = this.f4954g.compare(obj, iVar.getKey());
            if (compare == 0) {
                if (iVar.d().isEmpty()) {
                    if (iVar2 != null) {
                        return iVar2.getKey();
                    }
                    return null;
                }
                i d8 = iVar.d();
                while (!d8.m().isEmpty()) {
                    d8 = d8.m();
                }
                return d8.getKey();
            }
            if (compare < 0) {
                iVar = iVar.d();
            } else {
                iVar2 = iVar;
                iVar = iVar.m();
            }
        }
        throw new IllegalArgumentException("Couldn't find predecessor key of non-present key: " + obj);
    }

    @Override // i5.c
    public final void z(a8.d dVar) {
        this.f4953f.n(dVar);
    }
}
