package n;

import I.C0079n;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273f implements Set {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0079n f3245f;

    public /* synthetic */ C0273f(C0079n c0079n, int i2) {
        this.f3244e = i2;
        this.f3245f = c0079n;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f3244e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f3244e) {
            case 0:
                C0079n c0079n = this.f3245f;
                int i2 = ((C0268a) c0079n.f692h).f3257g;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ((C0268a) c0079n.f692h).put(entry.getKey(), entry.getValue());
                }
                return i2 != ((C0268a) c0079n.f692h).f3257g;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f3244e) {
            case 0:
                ((C0268a) this.f3245f.f692h).clear();
                break;
            default:
                ((C0268a) this.f3245f.f692h).clear();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f3244e) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    C0079n c0079n = this.f3245f;
                    int d2 = ((C0268a) c0079n.f692h).d(key);
                    if (d2 >= 0) {
                        Object a2 = c0079n.a(d2, 1);
                        Object value = entry.getValue();
                        if (a2 == value || (a2 != null && a2.equals(value))) {
                        }
                    }
                }
                break;
            default:
                if (((C0268a) this.f3245f.f692h).d(obj) >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f3244e) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                C0268a c0268a = (C0268a) this.f3245f.f692h;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c0268a.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f3244e) {
        }
        return C0079n.e(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f3244e) {
            case 0:
                C0079n c0079n = this.f3245f;
                int i2 = 0;
                for (int i3 = ((C0268a) c0079n.f692h).f3257g - 1; i3 >= 0; i3--) {
                    Object a2 = c0079n.a(i3, 0);
                    Object a3 = c0079n.a(i3, 1);
                    i2 += (a2 == null ? 0 : a2.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
                }
                return i2;
            default:
                C0079n c0079n2 = this.f3245f;
                int i4 = 0;
                for (int i5 = ((C0268a) c0079n2.f692h).f3257g - 1; i5 >= 0; i5--) {
                    Object a4 = c0079n2.a(i5, 0);
                    i4 += a4 == null ? 0 : a4.hashCode();
                }
                return i4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f3244e) {
            case 0:
                if (((C0268a) this.f3245f.f692h).f3257g == 0) {
                }
                break;
            default:
                if (((C0268a) this.f3245f.f692h).f3257g == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3244e) {
            case 0:
                return new C0274g(this.f3245f);
            default:
                return new C0272e(this.f3245f, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f3244e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0079n c0079n = this.f3245f;
                int d2 = ((C0268a) c0079n.f692h).d(obj);
                if (d2 < 0) {
                    return false;
                }
                c0079n.b(d2);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f3244e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0268a c0268a = (C0268a) this.f3245f.f692h;
                int size = c0268a.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c0268a.remove(it.next());
                }
                return size != c0268a.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f3244e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0268a c0268a = (C0268a) this.f3245f.f692h;
                int size = c0268a.size();
                Iterator it = c0268a.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != c0268a.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f3244e) {
        }
        return ((C0268a) this.f3245f.f692h).f3257g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f3244e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0079n c0079n = this.f3245f;
                int i2 = ((C0268a) c0079n.f692h).f3257g;
                Object[] objArr = new Object[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = c0079n.a(i3, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f3244e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f3245f.k(0, objArr);
        }
    }
}
