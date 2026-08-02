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
    public static final /* synthetic */ int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public List f2266a;

    /* renamed from: b, reason: collision with root package name */
    public Map f2267b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2268c;

    /* renamed from: d, reason: collision with root package name */
    public volatile b0 f2269d;

    /* renamed from: e, reason: collision with root package name */
    public Map f2270e;

    public static Y f() {
        Y y3 = new Y();
        y3.f2266a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        y3.f2267b = map;
        y3.f2270e = map;
        return y3;
    }

    public final int a(Comparable comparable) {
        int i3;
        int size = this.f2266a.size();
        int i4 = size - 1;
        if (i4 >= 0) {
            int compareTo = comparable.compareTo(((Z) this.f2266a.get(i4)).f2271a);
            if (compareTo > 0) {
                i3 = size + 1;
                return -i3;
            }
            if (compareTo == 0) {
                return i4;
            }
        }
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) / 2;
            int compareTo2 = comparable.compareTo(((Z) this.f2266a.get(i6)).f2271a);
            if (compareTo2 < 0) {
                i4 = i6 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i6;
                }
                i5 = i6 + 1;
            }
        }
        i3 = i5 + 1;
        return -i3;
    }

    public final void b() {
        if (this.f2268c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i3) {
        return (Map.Entry) this.f2266a.get(i3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f2266a.isEmpty()) {
            this.f2266a.clear();
        }
        if (this.f2267b.isEmpty()) {
            return;
        }
        this.f2267b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f2267b.containsKey(comparable);
    }

    public final Set d() {
        return this.f2267b.isEmpty() ? Collections.EMPTY_SET : this.f2267b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f2267b.isEmpty() && !(this.f2267b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2267b = treeMap;
            this.f2270e = treeMap.descendingMap();
        }
        return (SortedMap) this.f2267b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f2269d == null) {
            this.f2269d = new b0(0, this);
        }
        return this.f2269d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return super.equals(obj);
        }
        Y y3 = (Y) obj;
        int size = size();
        if (size == y3.size()) {
            int size2 = this.f2266a.size();
            if (size2 != y3.f2266a.size()) {
                return ((AbstractSet) entrySet()).equals(y3.entrySet());
            }
            for (int i3 = 0; i3 < size2; i3++) {
                if (c(i3).equals(y3.c(i3))) {
                }
            }
            if (size2 != size) {
                return this.f2267b.equals(y3.f2267b);
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
            return ((Z) this.f2266a.get(a3)).setValue(obj);
        }
        b();
        if (this.f2266a.isEmpty() && !(this.f2266a instanceof ArrayList)) {
            this.f2266a = new ArrayList(16);
        }
        int i3 = -(a3 + 1);
        if (i3 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f2266a.size() == 16) {
            Z z = (Z) this.f2266a.remove(15);
            e().put(z.f2271a, z.f2272b);
        }
        this.f2266a.add(i3, new Z(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        return a3 >= 0 ? ((Z) this.f2266a.get(a3)).f2272b : this.f2267b.get(comparable);
    }

    public final Object h(int i3) {
        b();
        Object obj = ((Z) this.f2266a.remove(i3)).f2272b;
        if (!this.f2267b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f2266a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Z(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f2266a.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += ((Z) this.f2266a.get(i4)).hashCode();
        }
        return this.f2267b.size() > 0 ? this.f2267b.hashCode() + i3 : i3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        if (a3 >= 0) {
            return h(a3);
        }
        if (this.f2267b.isEmpty()) {
            return null;
        }
        return this.f2267b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2267b.size() + this.f2266a.size();
    }
}
