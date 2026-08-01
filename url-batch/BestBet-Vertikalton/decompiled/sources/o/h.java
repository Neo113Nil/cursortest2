package o;

import h0.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class h implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f3581b;

    public /* synthetic */ h(r rVar, int i) {
        this.f3580a = i;
        this.f3581b = rVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f3580a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f3580a) {
            case 0:
                r rVar = this.f3581b;
                int e2 = rVar.e();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    rVar.h(entry.getKey(), entry.getValue());
                }
                return e2 != rVar.e();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f3580a) {
            case 0:
                this.f3581b.b();
                break;
            default:
                this.f3581b.b();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f3580a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                r rVar = this.f3581b;
                int f2 = rVar.f(key);
                if (f2 < 0) {
                    return false;
                }
                Object c2 = rVar.c(f2, 1);
                Object value = entry.getValue();
                return c2 == value || (c2 != null && c2.equals(value));
            default:
                return this.f3581b.f(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f3580a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map d = this.f3581b.d();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!d.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f3580a) {
        }
        return r.m(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f3580a) {
            case 0:
                r rVar = this.f3581b;
                int i = 0;
                for (int e2 = rVar.e() - 1; e2 >= 0; e2--) {
                    Object c2 = rVar.c(e2, 0);
                    Object c3 = rVar.c(e2, 1);
                    i += (c2 == null ? 0 : c2.hashCode()) ^ (c3 == null ? 0 : c3.hashCode());
                }
                return i;
            default:
                r rVar2 = this.f3581b;
                int i2 = 0;
                for (int e3 = rVar2.e() - 1; e3 >= 0; e3--) {
                    Object c4 = rVar2.c(e3, 0);
                    i2 += c4 == null ? 0 : c4.hashCode();
                }
                return i2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f3580a) {
            case 0:
                if (this.f3581b.e() == 0) {
                }
                break;
            default:
                if (this.f3581b.e() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3580a) {
            case 0:
                return new i(this.f3581b);
            default:
                return new g(this.f3581b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f3580a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                r rVar = this.f3581b;
                int f2 = rVar.f(obj);
                if (f2 < 0) {
                    return false;
                }
                rVar.i(f2);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f3580a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map d = this.f3581b.d();
                int size = d.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    d.remove(it.next());
                }
                return size != d.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f3580a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map d = this.f3581b.d();
                int size = d.size();
                Iterator it = d.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != d.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f3580a) {
        }
        return this.f3581b.e();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f3580a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f3581b.o(objArr, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f3580a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                r rVar = this.f3581b;
                int e2 = rVar.e();
                Object[] objArr = new Object[e2];
                for (int i = 0; i < e2; i++) {
                    objArr[i] = rVar.c(i, 0);
                }
                return objArr;
        }
    }
}
