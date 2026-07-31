package m;

import F.C0032n;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class f implements Set {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0032n f2837f;

    public /* synthetic */ f(C0032n c0032n, int i2) {
        this.f2836e = i2;
        this.f2837f = c0032n;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f2836e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f2836e) {
            case 0:
                C0032n c0032n = this.f2837f;
                int i2 = ((C0199a) c0032n.f412d).f2849g;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ((C0199a) c0032n.f412d).put(entry.getKey(), entry.getValue());
                }
                return i2 != ((C0199a) c0032n.f412d).f2849g;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f2836e) {
            case 0:
                ((C0199a) this.f2837f.f412d).clear();
                break;
            default:
                ((C0199a) this.f2837f.f412d).clear();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f2836e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C0032n c0032n = this.f2837f;
                int d2 = ((C0199a) c0032n.f412d).d(key);
                if (d2 < 0) {
                    return false;
                }
                Object b2 = c0032n.b(d2, 1);
                Object value = entry.getValue();
                return b2 == value || (b2 != null && b2.equals(value));
            default:
                return ((C0199a) this.f2837f.f412d).d(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f2836e) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                C0199a c0199a = (C0199a) this.f2837f.f412d;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!c0199a.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f2836e) {
        }
        return C0032n.e(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f2836e) {
            case 0:
                C0032n c0032n = this.f2837f;
                int i2 = 0;
                for (int i3 = ((C0199a) c0032n.f412d).f2849g - 1; i3 >= 0; i3--) {
                    Object b2 = c0032n.b(i3, 0);
                    Object b3 = c0032n.b(i3, 1);
                    i2 += (b2 == null ? 0 : b2.hashCode()) ^ (b3 == null ? 0 : b3.hashCode());
                }
                return i2;
            default:
                C0032n c0032n2 = this.f2837f;
                int i4 = 0;
                for (int i5 = ((C0199a) c0032n2.f412d).f2849g - 1; i5 >= 0; i5--) {
                    Object b4 = c0032n2.b(i5, 0);
                    i4 += b4 == null ? 0 : b4.hashCode();
                }
                return i4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f2836e) {
            case 0:
                if (((C0199a) this.f2837f.f412d).f2849g == 0) {
                }
                break;
            default:
                if (((C0199a) this.f2837f.f412d).f2849g == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2836e) {
            case 0:
                return new g(this.f2837f);
            default:
                return new e(this.f2837f, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f2836e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0032n c0032n = this.f2837f;
                int d2 = ((C0199a) c0032n.f412d).d(obj);
                if (d2 < 0) {
                    return false;
                }
                c0032n.c(d2);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f2836e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0199a c0199a = (C0199a) this.f2837f.f412d;
                int size = c0199a.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c0199a.remove(it.next());
                }
                return size != c0199a.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f2836e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0199a c0199a = (C0199a) this.f2837f.f412d;
                int size = c0199a.size();
                Iterator it = c0199a.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != c0199a.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f2836e) {
        }
        return ((C0199a) this.f2837f.f412d).f2849g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f2836e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0032n c0032n = this.f2837f;
                int i2 = ((C0199a) c0032n.f412d).f2849g;
                Object[] objArr = new Object[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = c0032n.b(i3, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f2836e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f2837f.k(0, objArr);
        }
    }
}
