package r;

import X.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: r.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1398h implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f11701b;

    public /* synthetic */ C1398h(m mVar, int i2) {
        this.f11700a = i2;
        this.f11701b = mVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f11700a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f11700a) {
            case 0:
                m mVar = this.f11701b;
                int e3 = mVar.e();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    mVar.h(entry.getKey(), entry.getValue());
                }
                return e3 != mVar.e();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f11700a) {
            case 0:
                this.f11701b.b();
                break;
            default:
                this.f11701b.b();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f11700a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                m mVar = this.f11701b;
                int f3 = mVar.f(key);
                if (f3 < 0) {
                    return false;
                }
                Object c2 = mVar.c(f3, 1);
                Object value = entry.getValue();
                return c2 == value || (c2 != null && c2.equals(value));
            default:
                return this.f11701b.f(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f11700a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map d6 = this.f11701b.d();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!d6.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f11700a) {
        }
        return m.m(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f11700a) {
            case 0:
                m mVar = this.f11701b;
                int i2 = 0;
                for (int e3 = mVar.e() - 1; e3 >= 0; e3--) {
                    Object c2 = mVar.c(e3, 0);
                    Object c6 = mVar.c(e3, 1);
                    i2 += (c2 == null ? 0 : c2.hashCode()) ^ (c6 == null ? 0 : c6.hashCode());
                }
                return i2;
            default:
                m mVar2 = this.f11701b;
                int i3 = 0;
                for (int e6 = mVar2.e() - 1; e6 >= 0; e6--) {
                    Object c7 = mVar2.c(e6, 0);
                    i3 += c7 == null ? 0 : c7.hashCode();
                }
                return i3;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f11700a) {
            case 0:
                if (this.f11701b.e() == 0) {
                }
                break;
            default:
                if (this.f11701b.e() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f11700a) {
            case 0:
                return new C1399i(this.f11701b);
            default:
                return new C1397g(this.f11701b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f11700a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                m mVar = this.f11701b;
                int f3 = mVar.f(obj);
                if (f3 < 0) {
                    return false;
                }
                mVar.i(f3);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f11700a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map d6 = this.f11701b.d();
                int size = d6.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    d6.remove(it.next());
                }
                return size != d6.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f11700a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map d6 = this.f11701b.d();
                int size = d6.size();
                Iterator it = d6.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != d6.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f11700a) {
        }
        return this.f11701b.e();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f11700a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f11701b.o(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f11700a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                m mVar = this.f11701b;
                int e3 = mVar.e();
                Object[] objArr = new Object[e3];
                for (int i2 = 0; i2 < e3; i2++) {
                    objArr[i2] = mVar.c(i2, 0);
                }
                return objArr;
        }
    }
}
