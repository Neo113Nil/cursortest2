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
public final class X extends AbstractMap {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f3467n = 0;

    /* renamed from: d, reason: collision with root package name */
    public List f3468d;

    /* renamed from: e, reason: collision with root package name */
    public Map f3469e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3470i;

    /* renamed from: l, reason: collision with root package name */
    public volatile a0 f3471l;

    /* renamed from: m, reason: collision with root package name */
    public Map f3472m;

    public static X f() {
        X x7 = new X();
        x7.f3468d = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        x7.f3469e = map;
        x7.f3472m = map;
        return x7;
    }

    public final int a(Comparable comparable) {
        int i2;
        int size = this.f3468d.size();
        int i5 = size - 1;
        if (i5 >= 0) {
            int compareTo = comparable.compareTo(((Y) this.f3468d.get(i5)).f3473d);
            if (compareTo > 0) {
                i2 = size + 1;
                return -i2;
            }
            if (compareTo == 0) {
                return i5;
            }
        }
        int i7 = 0;
        while (i7 <= i5) {
            int i8 = (i7 + i5) / 2;
            int compareTo2 = comparable.compareTo(((Y) this.f3468d.get(i8)).f3473d);
            if (compareTo2 < 0) {
                i5 = i8 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i8;
                }
                i7 = i8 + 1;
            }
        }
        i2 = i7 + 1;
        return -i2;
    }

    public final void b() {
        if (this.f3470i) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i2) {
        return (Map.Entry) this.f3468d.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f3468d.isEmpty()) {
            this.f3468d.clear();
        }
        if (this.f3469e.isEmpty()) {
            return;
        }
        this.f3469e.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f3469e.containsKey(comparable);
    }

    public final Set d() {
        return this.f3469e.isEmpty() ? Collections.EMPTY_SET : this.f3469e.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f3469e.isEmpty() && !(this.f3469e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3469e = treeMap;
            this.f3472m = treeMap.descendingMap();
        }
        return (SortedMap) this.f3469e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f3471l == null) {
            this.f3471l = new a0(this, 0);
        }
        return this.f3471l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return super.equals(obj);
        }
        X x7 = (X) obj;
        int size = size();
        if (size == x7.size()) {
            int size2 = this.f3468d.size();
            if (size2 != x7.f3468d.size()) {
                return ((AbstractSet) entrySet()).equals(x7.entrySet());
            }
            for (int i2 = 0; i2 < size2; i2++) {
                if (c(i2).equals(x7.c(i2))) {
                }
            }
            if (size2 != size) {
                return this.f3469e.equals(x7.f3469e);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a7 = a(comparable);
        if (a7 >= 0) {
            return ((Y) this.f3468d.get(a7)).setValue(obj);
        }
        b();
        if (this.f3468d.isEmpty() && !(this.f3468d instanceof ArrayList)) {
            this.f3468d = new ArrayList(16);
        }
        int i2 = -(a7 + 1);
        if (i2 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f3468d.size() == 16) {
            Y y7 = (Y) this.f3468d.remove(15);
            e().put(y7.f3473d, y7.f3474e);
        }
        this.f3468d.add(i2, new Y(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a7 = a(comparable);
        return a7 >= 0 ? ((Y) this.f3468d.get(a7)).f3474e : this.f3469e.get(comparable);
    }

    public final Object h(int i2) {
        b();
        Object obj = ((Y) this.f3468d.remove(i2)).f3474e;
        if (!this.f3469e.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f3468d;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Y(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f3468d.size();
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i2 += ((Y) this.f3468d.get(i5)).hashCode();
        }
        return this.f3469e.size() > 0 ? this.f3469e.hashCode() + i2 : i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a7 = a(comparable);
        if (a7 >= 0) {
            return h(a7);
        }
        if (this.f3469e.isEmpty()) {
            return null;
        }
        return this.f3469e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3469e.size() + this.f3468d.size();
    }
}
