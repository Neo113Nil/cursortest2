package defpackage;

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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bm2 extends AbstractMap {
    public static final /* synthetic */ int r = 0;
    public List m;
    public Map n;
    public boolean o;
    public volatile ci p;
    public Map q;

    public static bm2 f() {
        bm2 bm2Var = new bm2();
        bm2Var.m = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        bm2Var.n = map;
        bm2Var.q = map;
        return bm2Var;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.m.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((cm2) this.m.get(i2)).m);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((cm2) this.m.get(i4)).m);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final void b() {
        if (this.o) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.m.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.m.isEmpty()) {
            this.m.clear();
        }
        if (this.n.isEmpty()) {
            return;
        }
        this.n.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.n.containsKey(comparable);
    }

    public final Set d() {
        return this.n.isEmpty() ? Collections.EMPTY_SET : this.n.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.n.isEmpty() && !(this.n instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.n = treeMap;
            this.q = treeMap.descendingMap();
        }
        return (SortedMap) this.n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.p == null) {
            this.p = new ci(this, 1);
        }
        return this.p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2)) {
            return super.equals(obj);
        }
        bm2 bm2Var = (bm2) obj;
        int size = size();
        if (size == bm2Var.size()) {
            int size2 = this.m.size();
            if (size2 != bm2Var.m.size()) {
                return ((AbstractSet) entrySet()).equals(bm2Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(bm2Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.n.equals(bm2Var.n);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((cm2) this.m.get(a)).setValue(obj);
        }
        b();
        if (this.m.isEmpty() && !(this.m instanceof ArrayList)) {
            this.m = new ArrayList(16);
        }
        int i = -(a + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.m.size() == 16) {
            cm2 cm2Var = (cm2) this.m.remove(15);
            e().put(cm2Var.m, cm2Var.n);
        }
        this.m.add(i, new cm2(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        return a >= 0 ? ((cm2) this.m.get(a)).n : this.n.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((cm2) this.m.remove(i)).n;
        if (!this.n.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.m;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new cm2(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.m.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((cm2) this.m.get(i2)).hashCode();
        }
        return this.n.size() > 0 ? this.n.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return h(a);
        }
        if (this.n.isEmpty()) {
            return null;
        }
        return this.n.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.n.size() + this.m.size();
    }
}
