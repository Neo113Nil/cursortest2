package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class h implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0306a f3699b;

    public /* synthetic */ h(C0306a c0306a, int i) {
        this.f3698a = i;
        this.f3699b = c0306a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f3698a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f3698a) {
            case 0:
                C0306a c0306a = this.f3699b;
                int d2 = c0306a.d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    switch (c0306a.f3671d) {
                        case 0:
                            ((b) c0306a.f3672e).put(key, value);
                            break;
                        default:
                            ((c) c0306a.f3672e).add(key);
                            break;
                    }
                }
                return d2 != c0306a.d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f3698a) {
            case 0:
                this.f3699b.a();
                break;
            default:
                this.f3699b.a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f3698a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C0306a c0306a = this.f3699b;
                int e2 = c0306a.e(key);
                if (e2 < 0) {
                    return false;
                }
                Object b2 = c0306a.b(e2, 1);
                Object value = entry.getValue();
                return b2 == value || (b2 != null && b2.equals(value));
            default:
                return this.f3699b.e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f3698a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map c2 = this.f3699b.c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c2.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f3698a) {
        }
        return C0306a.h(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f3698a) {
            case 0:
                C0306a c0306a = this.f3699b;
                int i = 0;
                for (int d2 = c0306a.d() - 1; d2 >= 0; d2--) {
                    Object b2 = c0306a.b(d2, 0);
                    Object b3 = c0306a.b(d2, 1);
                    i += (b2 == null ? 0 : b2.hashCode()) ^ (b3 == null ? 0 : b3.hashCode());
                }
                return i;
            default:
                C0306a c0306a2 = this.f3699b;
                int i2 = 0;
                for (int d3 = c0306a2.d() - 1; d3 >= 0; d3--) {
                    Object b4 = c0306a2.b(d3, 0);
                    i2 += b4 == null ? 0 : b4.hashCode();
                }
                return i2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f3698a) {
            case 0:
                if (this.f3699b.d() == 0) {
                }
                break;
            default:
                if (this.f3699b.d() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3698a) {
            case 0:
                return new i(this.f3699b);
            default:
                return new g(this.f3699b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f3698a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0306a c0306a = this.f3699b;
                int e2 = c0306a.e(obj);
                if (e2 < 0) {
                    return false;
                }
                c0306a.g(e2);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f3698a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c2 = this.f3699b.c();
                int size = c2.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c2.remove(it.next());
                }
                return size != c2.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f3698a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c2 = this.f3699b.c();
                int size = c2.size();
                Iterator it = c2.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != c2.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f3698a) {
        }
        return this.f3699b.d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f3698a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f3699b.i(objArr, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f3698a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0306a c0306a = this.f3699b;
                int d2 = c0306a.d();
                Object[] objArr = new Object[d2];
                for (int i = 0; i < d2; i++) {
                    objArr[i] = c0306a.b(i, 0);
                }
                return objArr;
        }
    }
}
