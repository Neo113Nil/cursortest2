package e;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class d implements Set {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0.e f112c;

    public /* synthetic */ d(c0.e eVar, int i2) {
        this.f111b = i2;
        this.f112c = eVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f111b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f111b) {
            case 0:
                a aVar = (a) this.f112c.f73d;
                int i2 = aVar.f102d;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    aVar.put(entry.getKey(), entry.getValue());
                }
                return i2 != aVar.f102d;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f111b) {
            case 0:
                ((a) this.f112c.f73d).clear();
                break;
            default:
                ((a) this.f112c.f73d).clear();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f111b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                c0.e eVar = this.f112c;
                int e2 = ((a) eVar.f73d).e(key);
                if (e2 < 0) {
                    return false;
                }
                Object b2 = eVar.b(e2, 1);
                Object value = entry.getValue();
                return b2 == value || (b2 != null && b2.equals(value));
            default:
                return ((a) this.f112c.f73d).e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f111b) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                a aVar = (a) this.f112c.f73d;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!aVar.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f111b) {
        }
        return c0.e.d(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f111b) {
            case 0:
                c0.e eVar = this.f112c;
                int i2 = 0;
                for (int i3 = ((a) eVar.f73d).f102d - 1; i3 >= 0; i3--) {
                    Object b2 = eVar.b(i3, 0);
                    Object b3 = eVar.b(i3, 1);
                    i2 += (b2 == null ? 0 : b2.hashCode()) ^ (b3 == null ? 0 : b3.hashCode());
                }
                return i2;
            default:
                c0.e eVar2 = this.f112c;
                int i4 = 0;
                for (int i5 = ((a) eVar2.f73d).f102d - 1; i5 >= 0; i5--) {
                    Object b4 = eVar2.b(i5, 0);
                    i4 += b4 == null ? 0 : b4.hashCode();
                }
                return i4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f111b) {
            case 0:
                if (((a) this.f112c.f73d).f102d == 0) {
                }
                break;
            default:
                if (((a) this.f112c.f73d).f102d == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f111b) {
            case 0:
                return new e(this.f112c);
            default:
                return new c(this.f112c, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f111b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                c0.e eVar = this.f112c;
                int e2 = ((a) eVar.f73d).e(obj);
                if (e2 < 0) {
                    return false;
                }
                eVar.c(e2);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f111b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                a aVar = (a) this.f112c.f73d;
                int i2 = aVar.f102d;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    aVar.remove(it.next());
                }
                return i2 != aVar.f102d;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f111b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                a aVar = (a) this.f112c.f73d;
                int i2 = aVar.f102d;
                Iterator it = ((d) aVar.keySet()).iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return i2 != aVar.f102d;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f111b) {
        }
        return ((a) this.f112c.f73d).f102d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f111b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                c0.e eVar = this.f112c;
                int i2 = ((a) eVar.f73d).f102d;
                Object[] objArr = new Object[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = eVar.b(i3, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f111b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f112c.g(objArr, 0);
        }
    }
}
