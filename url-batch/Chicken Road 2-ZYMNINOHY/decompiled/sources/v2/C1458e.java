package v2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: v2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1458e extends m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f15623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f15624b;

    public C1458e(W w4, Map map) {
        this.f15624b = w4;
        map.getClass();
        this.f15623a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C1456c c1456c = (C1456c) it;
            if (!c1456c.hasNext()) {
                return;
            }
            c1456c.next();
            c1456c.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f15623a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f15623a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f15623a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15623a.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f15623a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1456c(this, this.f15623a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i4;
        Collection collection = (Collection) this.f15623a.remove(obj);
        if (collection != null) {
            i4 = collection.size();
            collection.clear();
            this.f15624b.f15595e -= i4;
        } else {
            i4 = 0;
        }
        return i4 > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15623a.size();
    }
}
