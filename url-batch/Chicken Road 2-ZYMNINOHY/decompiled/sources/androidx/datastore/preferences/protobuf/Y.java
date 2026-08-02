package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class Y extends AbstractMap {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f4604f = 0;

    /* renamed from: a, reason: collision with root package name */
    public List f4605a;

    /* renamed from: b, reason: collision with root package name */
    public Map f4606b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4607c;

    /* renamed from: d, reason: collision with root package name */
    public volatile b0 f4608d;

    /* renamed from: e, reason: collision with root package name */
    public Map f4609e;

    public static Y f() {
        Y y4 = new Y();
        y4.f4605a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        y4.f4606b = map;
        y4.f4609e = map;
        return y4;
    }

    public final int a(Comparable comparable) {
        int i4;
        int size = this.f4605a.size();
        int i5 = size - 1;
        if (i5 >= 0) {
            int compareTo = comparable.compareTo(((Z) this.f4605a.get(i5)).f4610a);
            if (compareTo > 0) {
                i4 = size + 1;
                return -i4;
            }
            if (compareTo == 0) {
                return i5;
            }
        }
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) / 2;
            int compareTo2 = comparable.compareTo(((Z) this.f4605a.get(i7)).f4610a);
            if (compareTo2 < 0) {
                i5 = i7 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i7;
                }
                i6 = i7 + 1;
            }
        }
        i4 = i6 + 1;
        return -i4;
    }

    public final void b() {
        if (this.f4607c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i4) {
        return (Map.Entry) this.f4605a.get(i4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f4605a.isEmpty()) {
            this.f4605a.clear();
        }
        if (this.f4606b.isEmpty()) {
            return;
        }
        this.f4606b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f4606b.containsKey(comparable);
    }

    public final Set d() {
        return this.f4606b.isEmpty() ? Collections.EMPTY_SET : this.f4606b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f4606b.isEmpty() && !(this.f4606b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4606b = treeMap;
            this.f4609e = treeMap.descendingMap();
        }
        return (SortedMap) this.f4606b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f4608d == null) {
            this.f4608d = new b0(0, this);
        }
        return this.f4608d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return super.equals(obj);
        }
        Y y4 = (Y) obj;
        int size = size();
        if (size == y4.size()) {
            int size2 = this.f4605a.size();
            if (size2 != y4.f4605a.size()) {
                return ((AbstractSet) entrySet()).equals(y4.entrySet());
            }
            for (int i4 = 0; i4 < size2; i4++) {
                if (c(i4).equals(y4.c(i4))) {
                }
            }
            if (size2 != size) {
                return this.f4606b.equals(y4.f4606b);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a3 = a(comparable);
        if (a3 >= 0) {
            return ((Z) this.f4605a.get(a3)).setValue(obj);
        }
        b();
        if (this.f4605a.isEmpty() && !(this.f4605a instanceof ArrayList)) {
            this.f4605a = new ArrayList(16);
        }
        int i4 = -(a3 + 1);
        if (i4 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f4605a.size() == 16) {
            Z z = (Z) this.f4605a.remove(15);
            e().put(z.f4610a, z.f4611b);
        }
        this.f4605a.add(i4, new Z(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        return a3 >= 0 ? ((Z) this.f4605a.get(a3)).f4611b : this.f4606b.get(comparable);
    }

    public final Object h(int i4) {
        b();
        Object obj = ((Z) this.f4605a.remove(i4)).f4611b;
        if (!this.f4606b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f4605a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Z(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f4605a.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += ((Z) this.f4605a.get(i5)).hashCode();
        }
        return this.f4606b.size() > 0 ? this.f4606b.hashCode() + i4 : i4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        if (a3 >= 0) {
            return h(a3);
        }
        if (this.f4606b.isEmpty()) {
            return null;
        }
        return this.f4606b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4606b.size() + this.f4605a.size();
    }
}
