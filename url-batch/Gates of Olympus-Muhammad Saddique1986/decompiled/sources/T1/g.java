package T1;

import f2.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends S1.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4368d;

    /* renamed from: e, reason: collision with root package name */
    public final f f4369e;

    public g(f fVar, int i3) {
        this.f4368d = i3;
        switch (i3) {
            case 1:
                j.f(fVar, "backing");
                this.f4369e = fVar;
                break;
            default:
                j.f(fVar, "backing");
                this.f4369e = fVar;
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f4368d) {
            case 0:
                j.f((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f4368d) {
            case 0:
                j.f(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                j.f(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // S1.g
    public final int b() {
        switch (this.f4368d) {
        }
        return this.f4369e.f4363l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f4368d) {
            case 0:
                this.f4369e.clear();
                break;
            default:
                this.f4369e.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f4368d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                j.f(entry, "element");
                return this.f4369e.f(entry);
            default:
                return this.f4369e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f4368d) {
            case 0:
                j.f(collection, "elements");
                return this.f4369e.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f4368d) {
        }
        return this.f4369e.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f4368d) {
            case 0:
                f fVar = this.f4369e;
                fVar.getClass();
                return new c(fVar, 0);
            default:
                f fVar2 = this.f4369e;
                fVar2.getClass();
                return new c(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f4368d) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    j.f(entry, "element");
                    f fVar = this.f4369e;
                    fVar.getClass();
                    fVar.c();
                    int h3 = fVar.h(entry.getKey());
                    if (h3 >= 0) {
                        Object[] objArr = fVar.f4356e;
                        j.c(objArr);
                        if (j.a(objArr[h3], entry.getValue())) {
                            fVar.l(h3);
                            break;
                        }
                    }
                }
                break;
            default:
                f fVar2 = this.f4369e;
                fVar2.c();
                int h4 = fVar2.h(obj);
                if (h4 >= 0) {
                    fVar2.l(h4);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f4368d) {
            case 0:
                j.f(collection, "elements");
                this.f4369e.c();
                break;
            default:
                j.f(collection, "elements");
                this.f4369e.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f4368d) {
            case 0:
                j.f(collection, "elements");
                this.f4369e.c();
                break;
            default:
                j.f(collection, "elements");
                this.f4369e.c();
                break;
        }
        return super.retainAll(collection);
    }
}
