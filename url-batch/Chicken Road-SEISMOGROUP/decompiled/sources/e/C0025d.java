package e;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: e.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025d implements Set {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A.e f536c;

    public /* synthetic */ C0025d(A.e eVar, int i2) {
        this.f535b = i2;
        this.f536c = eVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f535b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f535b) {
            case 0:
                A.e eVar = this.f536c;
                int i2 = ((C0022a) eVar.f10e).f526d;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ((C0022a) eVar.f10e).put(entry.getKey(), entry.getValue());
                }
                return i2 != ((C0022a) eVar.f10e).f526d;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f535b) {
            case 0:
                ((C0022a) this.f536c.f10e).clear();
                break;
            default:
                ((C0022a) this.f536c.f10e).clear();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f535b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                A.e eVar = this.f536c;
                int e2 = ((C0022a) eVar.f10e).e(key);
                if (e2 < 0) {
                    return false;
                }
                Object d2 = eVar.d(e2, 1);
                Object value = entry.getValue();
                return d2 == value || (d2 != null && d2.equals(value));
            default:
                return ((C0022a) this.f536c.f10e).e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f535b) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                C0022a c0022a = (C0022a) this.f536c.f10e;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c0022a.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f535b) {
        }
        return A.e.f(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f535b) {
            case 0:
                A.e eVar = this.f536c;
                int i2 = 0;
                for (int i3 = ((C0022a) eVar.f10e).f526d - 1; i3 >= 0; i3--) {
                    Object d2 = eVar.d(i3, 0);
                    Object d3 = eVar.d(i3, 1);
                    i2 += (d2 == null ? 0 : d2.hashCode()) ^ (d3 == null ? 0 : d3.hashCode());
                }
                return i2;
            default:
                A.e eVar2 = this.f536c;
                int i4 = 0;
                for (int i5 = ((C0022a) eVar2.f10e).f526d - 1; i5 >= 0; i5--) {
                    Object d4 = eVar2.d(i5, 0);
                    i4 += d4 == null ? 0 : d4.hashCode();
                }
                return i4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f535b) {
            case 0:
                if (((C0022a) this.f536c.f10e).f526d == 0) {
                }
                break;
            default:
                if (((C0022a) this.f536c.f10e).f526d == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f535b) {
            case 0:
                return new C0026e(this.f536c);
            default:
                return new C0024c(this.f536c, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f535b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                A.e eVar = this.f536c;
                int e2 = ((C0022a) eVar.f10e).e(obj);
                if (e2 < 0) {
                    return false;
                }
                eVar.e(e2);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f535b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0022a c0022a = (C0022a) this.f536c.f10e;
                int size = c0022a.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c0022a.remove(it.next());
                }
                return size != c0022a.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f535b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0022a c0022a = (C0022a) this.f536c.f10e;
                int size = c0022a.size();
                Iterator it = c0022a.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != c0022a.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f535b) {
        }
        return ((C0022a) this.f536c.f10e).f526d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f535b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                A.e eVar = this.f536c;
                int i2 = ((C0022a) eVar.f10e).f526d;
                Object[] objArr = new Object[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = eVar.d(i3, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f535b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f536c.m(objArr, 0);
        }
    }
}
