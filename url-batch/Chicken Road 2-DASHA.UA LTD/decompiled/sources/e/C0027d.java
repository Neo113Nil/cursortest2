package e;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: e.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027d implements Set {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f479b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B.e f480c;

    public /* synthetic */ C0027d(B.e eVar, int i2) {
        this.f479b = i2;
        this.f480c = eVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f479b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f479b) {
            case 0:
                B.e eVar = this.f480c;
                int i2 = ((C0024a) eVar.f10d).f470d;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ((C0024a) eVar.f10d).put(entry.getKey(), entry.getValue());
                }
                return i2 != ((C0024a) eVar.f10d).f470d;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f479b) {
            case 0:
                ((C0024a) this.f480c.f10d).clear();
                break;
            default:
                ((C0024a) this.f480c.f10d).clear();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f479b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                B.e eVar = this.f480c;
                int e2 = ((C0024a) eVar.f10d).e(key);
                if (e2 < 0) {
                    return false;
                }
                Object b2 = eVar.b(e2, 1);
                Object value = entry.getValue();
                return b2 == value || (b2 != null && b2.equals(value));
            default:
                return ((C0024a) this.f480c.f10d).e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f479b) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                C0024a c0024a = (C0024a) this.f480c.f10d;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c0024a.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f479b) {
        }
        return B.e.d(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f479b) {
            case 0:
                B.e eVar = this.f480c;
                int i2 = 0;
                for (int i3 = ((C0024a) eVar.f10d).f470d - 1; i3 >= 0; i3--) {
                    Object b2 = eVar.b(i3, 0);
                    Object b3 = eVar.b(i3, 1);
                    i2 += (b2 == null ? 0 : b2.hashCode()) ^ (b3 == null ? 0 : b3.hashCode());
                }
                return i2;
            default:
                B.e eVar2 = this.f480c;
                int i4 = 0;
                for (int i5 = ((C0024a) eVar2.f10d).f470d - 1; i5 >= 0; i5--) {
                    Object b4 = eVar2.b(i5, 0);
                    i4 += b4 == null ? 0 : b4.hashCode();
                }
                return i4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f479b) {
            case 0:
                if (((C0024a) this.f480c.f10d).f470d == 0) {
                }
                break;
            default:
                if (((C0024a) this.f480c.f10d).f470d == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f479b) {
            case 0:
                return new C0028e(this.f480c);
            default:
                return new C0026c(this.f480c, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f479b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                B.e eVar = this.f480c;
                int e2 = ((C0024a) eVar.f10d).e(obj);
                if (e2 < 0) {
                    return false;
                }
                eVar.c(e2);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f479b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0024a c0024a = (C0024a) this.f480c.f10d;
                int size = c0024a.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c0024a.remove(it.next());
                }
                return size != c0024a.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f479b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0024a c0024a = (C0024a) this.f480c.f10d;
                int size = c0024a.size();
                Iterator it = c0024a.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != c0024a.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f479b) {
        }
        return ((C0024a) this.f480c.f10d).f470d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f479b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                B.e eVar = this.f480c;
                int i2 = ((C0024a) eVar.f10d).f470d;
                Object[] objArr = new Object[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = eVar.b(i3, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f479b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f480c.i(objArr, 0);
        }
    }
}
