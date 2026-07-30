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

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fb1 extends AbstractMap {
    public static final /* synthetic */ int j = 0;
    public List d;
    public Map e;
    public boolean g;
    public volatile n9 h;
    public Map i;

    public static fb1 f() {
        fb1 fb1Var = new fb1();
        fb1Var.d = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        fb1Var.e = map;
        fb1Var.i = map;
        return fb1Var;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.d.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((gb1) this.d.get(i2)).d);
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
            int compareTo2 = comparable.compareTo(((gb1) this.d.get(i4)).d);
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
        if (this.g) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.d.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.d.isEmpty()) {
            this.d.clear();
        }
        if (this.e.isEmpty()) {
            return;
        }
        this.e.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.e.containsKey(comparable);
    }

    public final Set d() {
        return this.e.isEmpty() ? Collections.EMPTY_SET : this.e.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.e.isEmpty() && !(this.e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.e = treeMap;
            this.i = treeMap.descendingMap();
        }
        return (SortedMap) this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.h == null) {
            this.h = new n9(this, 1);
        }
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb1)) {
            return super.equals(obj);
        }
        fb1 fb1Var = (fb1) obj;
        int size = size();
        if (size == fb1Var.size()) {
            int size2 = this.d.size();
            if (size2 != fb1Var.d.size()) {
                return ((AbstractSet) entrySet()).equals(fb1Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(fb1Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.e.equals(fb1Var.e);
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
            return ((gb1) this.d.get(a)).setValue(obj);
        }
        b();
        if (this.d.isEmpty() && !(this.d instanceof ArrayList)) {
            this.d = new ArrayList(16);
        }
        int i = -(a + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.d.size() == 16) {
            gb1 gb1Var = (gb1) this.d.remove(15);
            e().put(gb1Var.d, gb1Var.e);
        }
        this.d.add(i, new gb1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        return a >= 0 ? ((gb1) this.d.get(a)).e : this.e.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((gb1) this.d.remove(i)).e;
        if (!this.e.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.d;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new gb1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((gb1) this.d.get(i2)).hashCode();
        }
        return this.e.size() > 0 ? this.e.hashCode() + i : i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return h(a);
        }
        if (this.e.isEmpty()) {
            return null;
        }
        return this.e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.e.size() + this.d.size();
    }
}
