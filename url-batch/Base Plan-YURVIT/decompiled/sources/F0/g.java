package F0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends E0.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f490e;

    /* renamed from: f, reason: collision with root package name */
    public final f f491f;

    public /* synthetic */ g(f fVar, int i2) {
        this.f490e = i2;
        this.f491f = fVar;
    }

    @Override // E0.b
    public final int a() {
        switch (this.f490e) {
        }
        return this.f491f.f485m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f490e) {
            case 0:
                P0.h.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f490e) {
            case 0:
                P0.h.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                P0.h.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f490e) {
            case 0:
                this.f491f.clear();
                break;
            default:
                this.f491f.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f490e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                P0.h.e(entry, "element");
                return this.f491f.e(entry);
            default:
                return this.f491f.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f490e) {
            case 0:
                P0.h.e(collection, "elements");
                return this.f491f.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f490e) {
        }
        return this.f491f.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f490e) {
            case 0:
                f fVar = this.f491f;
                fVar.getClass();
                return new d(fVar, 0);
            default:
                f fVar2 = this.f491f;
                fVar2.getClass();
                return new d(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f490e) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    P0.h.e(entry, "element");
                    f fVar = this.f491f;
                    fVar.getClass();
                    fVar.b();
                    int g2 = fVar.g(entry.getKey());
                    if (g2 >= 0) {
                        Object[] objArr = fVar.f478f;
                        P0.h.b(objArr);
                        if (P0.h.a(objArr[g2], entry.getValue())) {
                            fVar.k(g2);
                            break;
                        }
                    }
                }
                break;
            default:
                f fVar2 = this.f491f;
                fVar2.b();
                int g3 = fVar2.g(obj);
                if (g3 >= 0) {
                    fVar2.k(g3);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f490e) {
            case 0:
                P0.h.e(collection, "elements");
                this.f491f.b();
                break;
            default:
                P0.h.e(collection, "elements");
                this.f491f.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f490e) {
            case 0:
                P0.h.e(collection, "elements");
                this.f491f.b();
                break;
            default:
                P0.h.e(collection, "elements");
                this.f491f.b();
                break;
        }
        return super.retainAll(collection);
    }
}
