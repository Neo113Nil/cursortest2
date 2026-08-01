package Y0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends X0.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1415a;

    /* renamed from: b, reason: collision with root package name */
    public final f f1416b;

    public g(f fVar, int i) {
        this.f1415a = i;
        switch (i) {
            case 1:
                j1.h.e(fVar, "backing");
                this.f1416b = fVar;
                break;
            default:
                j1.h.e(fVar, "backing");
                this.f1416b = fVar;
                break;
        }
    }

    @Override // X0.g
    public final int a() {
        switch (this.f1415a) {
        }
        return this.f1416b.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f1415a) {
            case 0:
                j1.h.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f1415a) {
            case 0:
                j1.h.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                j1.h.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f1415a) {
            case 0:
                this.f1416b.clear();
                break;
            default:
                this.f1416b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f1415a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                j1.h.e(entry, "element");
                return this.f1416b.f(entry);
            default:
                return this.f1416b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f1415a) {
            case 0:
                j1.h.e(collection, "elements");
                return this.f1416b.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f1415a) {
        }
        return this.f1416b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f1415a) {
            case 0:
                f fVar = this.f1416b;
                fVar.getClass();
                return new d(fVar, 0);
            default:
                f fVar2 = this.f1416b;
                fVar2.getClass();
                return new d(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f1415a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    j1.h.e(entry, "element");
                    f fVar = this.f1416b;
                    fVar.getClass();
                    fVar.c();
                    int h2 = fVar.h(entry.getKey());
                    if (h2 >= 0) {
                        Object[] objArr = fVar.f1406b;
                        j1.h.b(objArr);
                        if (j1.h.a(objArr[h2], entry.getValue())) {
                            fVar.l(h2);
                            break;
                        }
                    }
                }
                break;
            default:
                f fVar2 = this.f1416b;
                fVar2.c();
                int h3 = fVar2.h(obj);
                if (h3 >= 0) {
                    fVar2.l(h3);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f1415a) {
            case 0:
                j1.h.e(collection, "elements");
                this.f1416b.c();
                break;
            default:
                j1.h.e(collection, "elements");
                this.f1416b.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f1415a) {
            case 0:
                j1.h.e(collection, "elements");
                this.f1416b.c();
                break;
            default:
                j1.h.e(collection, "elements");
                this.f1416b.c();
                break;
        }
        return super.retainAll(collection);
    }
}
