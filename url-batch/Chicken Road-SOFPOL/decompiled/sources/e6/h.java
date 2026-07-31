package e6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import q6.i;
import r0.k;
import r0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends AbstractCollection implements Collection, r6.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2536d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2537e;

    public /* synthetic */ h(int i, Object obj) {
        this.f2536d = i;
        this.f2537e = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f2536d) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f2536d) {
            case 0:
                i.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f2536d) {
            case 0:
                ((f) this.f2537e).clear();
                break;
            default:
                ((u0.f) this.f2537e).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f2536d) {
            case 0:
                return ((f) this.f2537e).containsValue(obj);
            default:
                return ((u0.f) this.f2537e).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f2536d) {
            case 0:
                return ((f) this.f2537e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2536d) {
            case 0:
                f fVar = (f) this.f2537e;
                fVar.getClass();
                return new d(fVar, 2);
            default:
                u0.f fVar2 = (u0.f) this.f2537e;
                k[] kVarArr = new k[8];
                for (int i = 0; i < 8; i++) {
                    kVarArr[i] = new l(2);
                }
                return new r0.f(fVar2, kVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f2536d) {
            case 0:
                f fVar = (f) this.f2537e;
                fVar.b();
                int h8 = fVar.h(obj);
                if (h8 < 0) {
                    return false;
                }
                fVar.k(h8);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f2536d) {
            case 0:
                i.e(collection, "elements");
                ((f) this.f2537e).b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f2536d) {
            case 0:
                i.e(collection, "elements");
                ((f) this.f2537e).b();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f2536d) {
            case 0:
                return ((f) this.f2537e).f2529l;
            default:
                u0.f fVar = (u0.f) this.f2537e;
                fVar.getClass();
                return fVar.f7150h;
        }
    }
}
