package e6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends d6.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2534d;

    /* renamed from: e, reason: collision with root package name */
    public final f f2535e;

    public /* synthetic */ g(f fVar, int i) {
        this.f2534d = i;
        this.f2535e = fVar;
    }

    @Override // d6.h
    public final int a() {
        switch (this.f2534d) {
        }
        return this.f2535e.f2529l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f2534d) {
            case 0:
                i.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f2534d) {
            case 0:
                i.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                i.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2534d) {
            case 0:
                this.f2535e.clear();
                break;
            default:
                this.f2535e.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f2534d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f2535e.e((Map.Entry) obj);
            default:
                return this.f2535e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f2534d) {
            case 0:
                i.e(collection, "elements");
                return this.f2535e.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f2534d) {
        }
        return this.f2535e.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f2534d) {
            case 0:
                f fVar = this.f2535e;
                fVar.getClass();
                return new d(fVar, 0);
            default:
                f fVar2 = this.f2535e;
                fVar2.getClass();
                return new d(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f2534d) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    f fVar = this.f2535e;
                    fVar.getClass();
                    fVar.b();
                    int g3 = fVar.g(entry.getKey());
                    if (g3 >= 0) {
                        Object[] objArr = fVar.f2523e;
                        i.b(objArr);
                        if (i.a(objArr[g3], entry.getValue())) {
                            fVar.k(g3);
                            break;
                        }
                    }
                }
                break;
            default:
                f fVar2 = this.f2535e;
                fVar2.b();
                int g7 = fVar2.g(obj);
                if (g7 >= 0) {
                    fVar2.k(g7);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f2534d) {
            case 0:
                i.e(collection, "elements");
                this.f2535e.b();
                break;
            default:
                i.e(collection, "elements");
                this.f2535e.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f2534d) {
            case 0:
                i.e(collection, "elements");
                this.f2535e.b();
                break;
            default:
                i.e(collection, "elements");
                this.f2535e.b();
                break;
        }
        return super.retainAll(collection);
    }
}
