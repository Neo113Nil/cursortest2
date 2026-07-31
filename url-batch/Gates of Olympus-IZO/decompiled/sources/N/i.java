package N;

import a2.InterfaceC0185b;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends AbstractCollection implements Collection, InterfaceC0185b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2834d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2835e;

    public i(N1.g gVar) {
        Z1.i.f(gVar, "backing");
        this.f2835e = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f2834d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f2834d) {
            case 1:
                Z1.i.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f2834d) {
            case 0:
                ((Q.c) this.f2835e).clear();
                break;
            default:
                ((N1.g) this.f2835e).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f2834d) {
            case 0:
                return ((Q.c) this.f2835e).containsValue(obj);
            default:
                return ((N1.g) this.f2835e).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f2834d) {
            case 1:
                return ((N1.g) this.f2835e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2834d) {
            case 0:
                n[] nVarArr = new n[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    nVarArr[i3] = new o(2);
                }
                return new h((Q.c) this.f2835e, nVarArr);
            default:
                N1.g gVar = (N1.g) this.f2835e;
                gVar.getClass();
                return new N1.d(gVar, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f2834d) {
            case 1:
                N1.g gVar = (N1.g) this.f2835e;
                gVar.c();
                int i3 = gVar.i(obj);
                if (i3 < 0) {
                    return false;
                }
                gVar.l(i3);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f2834d) {
            case 1:
                Z1.i.f(collection, "elements");
                ((N1.g) this.f2835e).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f2834d) {
            case 1:
                Z1.i.f(collection, "elements");
                ((N1.g) this.f2835e).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f2834d) {
            case 0:
                Q.c cVar = (Q.c) this.f2835e;
                cVar.getClass();
                return cVar.f3086h;
            default:
                return ((N1.g) this.f2835e).f2884l;
        }
    }

    public i(Q.c cVar) {
        this.f2835e = cVar;
    }
}
