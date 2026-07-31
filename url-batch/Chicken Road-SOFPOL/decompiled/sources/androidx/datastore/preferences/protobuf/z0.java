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

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z0 extends AbstractMap {
    public static final /* synthetic */ int i = 0;

    /* renamed from: d, reason: collision with root package name */
    public List f799d;

    /* renamed from: e, reason: collision with root package name */
    public Map f800e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f801f;

    /* renamed from: g, reason: collision with root package name */
    public volatile c1 f802g;

    /* renamed from: h, reason: collision with root package name */
    public Map f803h;

    public static z0 f() {
        z0 z0Var = new z0();
        z0Var.f799d = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        z0Var.f800e = map;
        z0Var.f803h = map;
        return z0Var;
    }

    public final int a(Comparable comparable) {
        int i8;
        int size = this.f799d.size();
        int i9 = size - 1;
        if (i9 >= 0) {
            int compareTo = comparable.compareTo(((a1) this.f799d.get(i9)).f646d);
            if (compareTo > 0) {
                i8 = size + 1;
                return -i8;
            }
            if (compareTo == 0) {
                return i9;
            }
        }
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) / 2;
            int compareTo2 = comparable.compareTo(((a1) this.f799d.get(i11)).f646d);
            if (compareTo2 < 0) {
                i9 = i11 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i11;
                }
                i10 = i11 + 1;
            }
        }
        i8 = i10 + 1;
        return -i8;
    }

    public final void b() {
        if (this.f801f) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i8) {
        return (Map.Entry) this.f799d.get(i8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f799d.isEmpty()) {
            this.f799d.clear();
        }
        if (this.f800e.isEmpty()) {
            return;
        }
        this.f800e.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f800e.containsKey(comparable);
    }

    public final Set d() {
        return this.f800e.isEmpty() ? Collections.EMPTY_SET : this.f800e.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f800e.isEmpty() && !(this.f800e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f800e = treeMap;
            this.f803h = treeMap.descendingMap();
        }
        return (SortedMap) this.f800e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f802g == null) {
            this.f802g = new c1(this, 0);
        }
        return this.f802g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return super.equals(obj);
        }
        z0 z0Var = (z0) obj;
        int size = size();
        if (size == z0Var.size()) {
            int size2 = this.f799d.size();
            if (size2 != z0Var.f799d.size()) {
                return ((AbstractSet) entrySet()).equals(z0Var.entrySet());
            }
            for (int i8 = 0; i8 < size2; i8++) {
                if (c(i8).equals(z0Var.c(i8))) {
                }
            }
            if (size2 != size) {
                return this.f800e.equals(z0Var.f800e);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a8 = a(comparable);
        if (a8 >= 0) {
            return ((a1) this.f799d.get(a8)).setValue(obj);
        }
        b();
        if (this.f799d.isEmpty() && !(this.f799d instanceof ArrayList)) {
            this.f799d = new ArrayList(16);
        }
        int i8 = -(a8 + 1);
        if (i8 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f799d.size() == 16) {
            a1 a1Var = (a1) this.f799d.remove(15);
            e().put(a1Var.f646d, a1Var.f647e);
        }
        this.f799d.add(i8, new a1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a8 = a(comparable);
        return a8 >= 0 ? ((a1) this.f799d.get(a8)).f647e : this.f800e.get(comparable);
    }

    public final Object h(int i8) {
        b();
        Object obj = ((a1) this.f799d.remove(i8)).f647e;
        if (!this.f800e.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f799d;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new a1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f799d.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += ((a1) this.f799d.get(i9)).hashCode();
        }
        return this.f800e.size() > 0 ? this.f800e.hashCode() + i8 : i8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a8 = a(comparable);
        if (a8 >= 0) {
            return h(a8);
        }
        if (this.f800e.isEmpty()) {
            return null;
        }
        return this.f800e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f800e.size() + this.f799d.size();
    }
}
