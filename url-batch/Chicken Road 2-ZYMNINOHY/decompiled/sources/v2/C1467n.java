package v2;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: v2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1467n extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15659a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15660b;

    public /* synthetic */ C1467n(int i4, Serializable serializable) {
        this.f15659a = i4;
        this.f15660b = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f15659a) {
            case 0:
                ((W) this.f15660b).f();
                break;
            case 1:
                ((C1474v) this.f15660b).clear();
                break;
            default:
                ((AbstractMap) this.f15660b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f15659a) {
            case 0:
                return ((W) this.f15660b).b(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((AbstractMap) this.f15660b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f15659a) {
            case 2:
                return ((AbstractMap) this.f15660b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f15659a) {
            case 0:
                return new C1454a((W) this.f15660b);
            case 1:
                C1474v c1474v = (C1474v) this.f15660b;
                Map c4 = c1474v.c();
                return c4 != null ? c4.values().iterator() : new C1471s(c1474v, 2);
            default:
                return new U(((AbstractMap) this.f15660b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f15659a) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.f15660b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (V3.b.n(obj, entry.getValue())) {
                            abstractMap.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f15659a) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.f15660b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f15659a) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.f15660b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f15659a) {
            case 0:
                return ((W) this.f15660b).f15595e;
            case 1:
                return ((C1474v) this.f15660b).size();
            default:
                return ((AbstractMap) this.f15660b).size();
        }
    }

    public C1467n(AbstractMap abstractMap) {
        this.f15659a = 2;
        this.f15660b = abstractMap;
    }
}
