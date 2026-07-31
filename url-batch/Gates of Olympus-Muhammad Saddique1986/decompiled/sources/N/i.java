package N;

import g2.InterfaceC0440b;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends AbstractCollection implements Collection, InterfaceC0440b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3516d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3517e;

    public i(Q.c cVar) {
        this.f3517e = cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f3516d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f3516d) {
            case 1:
                f2.j.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f3516d) {
            case 0:
                ((Q.c) this.f3517e).clear();
                break;
            default:
                ((T1.f) this.f3517e).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f3516d) {
            case 0:
                return ((Q.c) this.f3517e).containsValue(obj);
            default:
                return ((T1.f) this.f3517e).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f3516d) {
            case 1:
                return ((T1.f) this.f3517e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3516d) {
            case 0:
                n[] nVarArr = new n[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    nVarArr[i3] = new o(2);
                }
                return new h((Q.c) this.f3517e, nVarArr);
            default:
                T1.f fVar = (T1.f) this.f3517e;
                fVar.getClass();
                return new T1.c(fVar, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f3516d) {
            case 1:
                T1.f fVar = (T1.f) this.f3517e;
                fVar.c();
                int i3 = fVar.i(obj);
                if (i3 < 0) {
                    return false;
                }
                fVar.l(i3);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f3516d) {
            case 1:
                f2.j.f(collection, "elements");
                ((T1.f) this.f3517e).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f3516d) {
            case 1:
                f2.j.f(collection, "elements");
                ((T1.f) this.f3517e).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f3516d) {
            case 0:
                Q.c cVar = (Q.c) this.f3517e;
                cVar.getClass();
                return cVar.f3952h;
            default:
                return ((T1.f) this.f3517e).f4363l;
        }
    }

    public i(T1.f fVar) {
        f2.j.f(fVar, "backing");
        this.f3517e = fVar;
    }
}
