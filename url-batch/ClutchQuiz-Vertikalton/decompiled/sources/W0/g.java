package W0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends V0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f919a;

    /* renamed from: b, reason: collision with root package name */
    public final f f920b;

    public g(f fVar, int i) {
        this.f919a = i;
        switch (i) {
            case 1:
                g1.f.e(fVar, "backing");
                this.f920b = fVar;
                break;
            default:
                g1.f.e(fVar, "backing");
                this.f920b = fVar;
                break;
        }
    }

    @Override // V0.b
    public final int a() {
        switch (this.f919a) {
        }
        return this.f920b.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f919a) {
            case 0:
                g1.f.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f919a) {
            case 0:
                g1.f.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                g1.f.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f919a) {
            case 0:
                this.f920b.clear();
                break;
            default:
                this.f920b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f919a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                g1.f.e(entry, "element");
                return this.f920b.f(entry);
            default:
                return this.f920b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f919a) {
            case 0:
                g1.f.e(collection, "elements");
                return this.f920b.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f919a) {
        }
        return this.f920b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f919a) {
            case 0:
                f fVar = this.f920b;
                fVar.getClass();
                return new d(fVar, 0);
            default:
                f fVar2 = this.f920b;
                fVar2.getClass();
                return new d(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f919a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    g1.f.e(entry, "element");
                    f fVar = this.f920b;
                    fVar.getClass();
                    fVar.c();
                    int h = fVar.h(entry.getKey());
                    if (h >= 0) {
                        Object[] objArr = fVar.f910b;
                        g1.f.b(objArr);
                        if (g1.f.a(objArr[h], entry.getValue())) {
                            fVar.l(h);
                            break;
                        }
                    }
                }
                break;
            default:
                f fVar2 = this.f920b;
                fVar2.c();
                int h2 = fVar2.h(obj);
                if (h2 >= 0) {
                    fVar2.l(h2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f919a) {
            case 0:
                g1.f.e(collection, "elements");
                this.f920b.c();
                break;
            default:
                g1.f.e(collection, "elements");
                this.f920b.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f919a) {
            case 0:
                g1.f.e(collection, "elements");
                this.f920b.c();
                break;
            default:
                g1.f.e(collection, "elements");
                this.f920b.c();
                break;
        }
        return super.retainAll(collection);
    }
}
