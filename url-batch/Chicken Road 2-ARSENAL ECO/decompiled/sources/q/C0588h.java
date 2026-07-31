package q;

import Q.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: q.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0588h implements Set {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f5732g;

    public /* synthetic */ C0588h(n nVar, int i7) {
        this.f5731f = i7;
        this.f5732g = nVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f5731f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f5731f) {
            case 0:
                n nVar = this.f5732g;
                int e4 = nVar.e();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    nVar.h(entry.getKey(), entry.getValue());
                }
                return e4 != nVar.e();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f5731f) {
            case 0:
                this.f5732g.b();
                break;
            default:
                this.f5732g.b();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5731f) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                n nVar = this.f5732g;
                int f7 = nVar.f(key);
                if (f7 < 0) {
                    return false;
                }
                Object c7 = nVar.c(f7, 1);
                Object value = entry.getValue();
                return c7 == value || (c7 != null && c7.equals(value));
            default:
                return this.f5732g.f(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f5731f) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map d7 = this.f5732g.d();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!d7.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f5731f) {
        }
        return n.m(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f5731f) {
            case 0:
                n nVar = this.f5732g;
                int i7 = 0;
                for (int e4 = nVar.e() - 1; e4 >= 0; e4--) {
                    Object c7 = nVar.c(e4, 0);
                    Object c8 = nVar.c(e4, 1);
                    i7 += (c7 == null ? 0 : c7.hashCode()) ^ (c8 == null ? 0 : c8.hashCode());
                }
                return i7;
            default:
                n nVar2 = this.f5732g;
                int i8 = 0;
                for (int e7 = nVar2.e() - 1; e7 >= 0; e7--) {
                    Object c9 = nVar2.c(e7, 0);
                    i8 += c9 == null ? 0 : c9.hashCode();
                }
                return i8;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f5731f) {
            case 0:
                if (this.f5732g.e() == 0) {
                }
                break;
            default:
                if (this.f5732g.e() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5731f) {
            case 0:
                return new C0589i(this.f5732g);
            default:
                return new C0587g(this.f5732g, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f5731f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                n nVar = this.f5732g;
                int f7 = nVar.f(obj);
                if (f7 < 0) {
                    return false;
                }
                nVar.i(f7);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f5731f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map d7 = this.f5732g.d();
                int size = d7.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    d7.remove(it.next());
                }
                return size != d7.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f5731f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map d7 = this.f5732g.d();
                int size = d7.size();
                Iterator it = d7.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != d7.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f5731f) {
        }
        return this.f5732g.e();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f5731f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f5732g.o(objArr, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f5731f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                n nVar = this.f5732g;
                int e4 = nVar.e();
                Object[] objArr = new Object[e4];
                for (int i7 = 0; i7 < e4; i7++) {
                    objArr[i7] = nVar.c(i7, 0);
                }
                return objArr;
        }
    }
}
