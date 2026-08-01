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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y0 extends AbstractMap {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f652t = 0;

    /* renamed from: d, reason: collision with root package name */
    public List f653d;

    /* renamed from: e, reason: collision with root package name */
    public Map f654e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f655i;

    /* renamed from: r, reason: collision with root package name */
    public volatile b1 f656r;

    /* renamed from: s, reason: collision with root package name */
    public Map f657s;

    public static y0 f() {
        y0 y0Var = new y0();
        y0Var.f653d = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        y0Var.f654e = map;
        y0Var.f657s = map;
        return y0Var;
    }

    public final int a(Comparable comparable) {
        int i3;
        int size = this.f653d.size();
        int i10 = size - 1;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((z0) this.f653d.get(i10)).f659d);
            if (compareTo > 0) {
                i3 = size + 1;
                return -i3;
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((z0) this.f653d.get(i12)).f659d);
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        i3 = i11 + 1;
        return -i3;
    }

    public final void b() {
        if (this.f655i) {
            a2.r.a();
        }
    }

    public final Map.Entry c(int i3) {
        return (Map.Entry) this.f653d.get(i3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f653d.isEmpty()) {
            this.f653d.clear();
        }
        if (this.f654e.isEmpty()) {
            return;
        }
        this.f654e.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f654e.containsKey(comparable);
    }

    public final Set d() {
        return this.f654e.isEmpty() ? Collections.EMPTY_SET : this.f654e.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f654e.isEmpty() && !(this.f654e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f654e = treeMap;
            this.f657s = treeMap.descendingMap();
        }
        return (SortedMap) this.f654e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f656r == null) {
            this.f656r = new b1(0, this);
        }
        return this.f656r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return super.equals(obj);
        }
        y0 y0Var = (y0) obj;
        int size = size();
        if (size == y0Var.size()) {
            int size2 = this.f653d.size();
            if (size2 != y0Var.f653d.size()) {
                return ((AbstractSet) entrySet()).equals(y0Var.entrySet());
            }
            for (int i3 = 0; i3 < size2; i3++) {
                if (c(i3).equals(y0Var.c(i3))) {
                }
            }
            if (size2 != size) {
                return this.f654e.equals(y0Var.f654e);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a9 = a(comparable);
        if (a9 >= 0) {
            return ((z0) this.f653d.get(a9)).setValue(obj);
        }
        b();
        if (this.f653d.isEmpty() && !(this.f653d instanceof ArrayList)) {
            this.f653d = new ArrayList(16);
        }
        int i3 = -(a9 + 1);
        if (i3 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f653d.size() == 16) {
            z0 z0Var = (z0) this.f653d.remove(15);
            e().put(z0Var.f659d, z0Var.f660e);
        }
        this.f653d.add(i3, new z0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a9 = a(comparable);
        return a9 >= 0 ? ((z0) this.f653d.get(a9)).f660e : this.f654e.get(comparable);
    }

    public final Object h(int i3) {
        b();
        Object obj = ((z0) this.f653d.remove(i3)).f660e;
        if (!this.f654e.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f653d;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new z0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f653d.size();
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i3 += ((z0) this.f653d.get(i10)).hashCode();
        }
        return this.f654e.size() > 0 ? this.f654e.hashCode() + i3 : i3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a9 = a(comparable);
        if (a9 >= 0) {
            return h(a9);
        }
        if (this.f654e.isEmpty()) {
            return null;
        }
        return this.f654e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f654e.size() + this.f653d.size();
    }
}
