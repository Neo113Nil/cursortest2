package s;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class g implements Set {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40393n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f40394u;

    public /* synthetic */ g(j jVar, int i) {
        this.f40393n = i;
        this.f40394u = jVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f40393n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f40393n) {
            case 0:
                j jVar = this.f40394u;
                int e6 = jVar.e();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    jVar.h(entry.getKey(), entry.getValue());
                }
                return e6 != jVar.e();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f40393n) {
            case 0:
                this.f40394u.b();
                break;
            default:
                this.f40394u.b();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f40393n) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                j jVar = this.f40394u;
                int f6 = jVar.f(key);
                if (f6 < 0) {
                    return false;
                }
                Object c4 = jVar.c(f6, 1);
                Object value = entry.getValue();
                return c4 == value || (c4 != null && c4.equals(value));
            default:
                return this.f40394u.f(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f40393n) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map d2 = this.f40394u.d();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!d2.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f40393n) {
        }
        return j.m(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f40393n) {
            case 0:
                j jVar = this.f40394u;
                int i = 0;
                for (int e6 = jVar.e() - 1; e6 >= 0; e6--) {
                    Object c4 = jVar.c(e6, 0);
                    Object c9 = jVar.c(e6, 1);
                    i += (c4 == null ? 0 : c4.hashCode()) ^ (c9 == null ? 0 : c9.hashCode());
                }
                return i;
            default:
                j jVar2 = this.f40394u;
                int i4 = 0;
                for (int e9 = jVar2.e() - 1; e9 >= 0; e9--) {
                    Object c10 = jVar2.c(e9, 0);
                    i4 += c10 == null ? 0 : c10.hashCode();
                }
                return i4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f40393n) {
            case 0:
                if (this.f40394u.e() == 0) {
                }
                break;
            default:
                if (this.f40394u.e() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f40393n) {
            case 0:
                return new h(this.f40394u);
            default:
                return new f(this.f40394u, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f40393n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                j jVar = this.f40394u;
                int f6 = jVar.f(obj);
                if (f6 < 0) {
                    return false;
                }
                jVar.i(f6);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f40393n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map d2 = this.f40394u.d();
                int size = d2.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    d2.remove(it.next());
                }
                return size != d2.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f40393n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map d2 = this.f40394u.d();
                int size = d2.size();
                Iterator it = d2.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != d2.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f40393n) {
        }
        return this.f40394u.e();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f40393n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f40394u.o(objArr, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f40393n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                j jVar = this.f40394u;
                int e6 = jVar.e();
                Object[] objArr = new Object[e6];
                for (int i = 0; i < e6; i++) {
                    objArr[i] = jVar.c(i, 0);
                }
                return objArr;
        }
    }
}
