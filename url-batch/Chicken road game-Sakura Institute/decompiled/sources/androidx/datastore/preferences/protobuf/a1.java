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

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a1 extends AbstractMap {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f777l = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f778f;

    /* renamed from: g, reason: collision with root package name */
    public List f779g = Collections.EMPTY_LIST;

    /* renamed from: h, reason: collision with root package name */
    public Map f780h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f781i;

    /* renamed from: j, reason: collision with root package name */
    public volatile g1 f782j;

    /* renamed from: k, reason: collision with root package name */
    public Map f783k;

    public a1(int i7) {
        this.f778f = i7;
        Map map = Collections.EMPTY_MAP;
        this.f780h = map;
        this.f783k = map;
    }

    public final int a(Comparable comparable) {
        int i7;
        int size = this.f779g.size();
        int i8 = size - 1;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo(((e1) this.f779g.get(i8)).f805f);
            if (compareTo > 0) {
                i7 = size + 1;
                return -i7;
            }
            if (compareTo == 0) {
                return i8;
            }
        }
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) / 2;
            int compareTo2 = comparable.compareTo(((e1) this.f779g.get(i10)).f805f);
            if (compareTo2 < 0) {
                i8 = i10 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i10;
                }
                i9 = i10 + 1;
            }
        }
        i7 = i9 + 1;
        return -i7;
    }

    public final void b() {
        if (this.f781i) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i7) {
        return (Map.Entry) this.f779g.get(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f779g.isEmpty()) {
            this.f779g.clear();
        }
        if (this.f780h.isEmpty()) {
            return;
        }
        this.f780h.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f780h.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f780h.isEmpty() ? d1.f803b : this.f780h.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f780h.isEmpty() && !(this.f780h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f780h = treeMap;
            this.f783k = treeMap.descendingMap();
        }
        return (SortedMap) this.f780h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f782j == null) {
            this.f782j = new g1(this, 0);
        }
        return this.f782j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return super.equals(obj);
        }
        a1 a1Var = (a1) obj;
        int size = size();
        if (size == a1Var.size()) {
            int size2 = this.f779g.size();
            if (size2 != a1Var.f779g.size()) {
                return ((AbstractSet) entrySet()).equals(a1Var.entrySet());
            }
            for (int i7 = 0; i7 < size2; i7++) {
                if (c(i7).equals(a1Var.c(i7))) {
                }
            }
            if (size2 != size) {
                return this.f780h.equals(a1Var.f780h);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a3 = a(comparable);
        if (a3 >= 0) {
            return ((e1) this.f779g.get(a3)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f779g.isEmpty();
        int i7 = this.f778f;
        if (isEmpty && !(this.f779g instanceof ArrayList)) {
            this.f779g = new ArrayList(i7);
        }
        int i8 = -(a3 + 1);
        if (i8 >= i7) {
            return e().put(comparable, obj);
        }
        if (this.f779g.size() == i7) {
            e1 e1Var = (e1) this.f779g.remove(i7 - 1);
            e().put(e1Var.f805f, e1Var.f806g);
        }
        this.f779g.add(i8, new e1(this, comparable, obj));
        return null;
    }

    public final Object g(int i7) {
        b();
        Object obj = ((e1) this.f779g.remove(i7)).f806g;
        if (!this.f780h.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f779g;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new e1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        return a3 >= 0 ? ((e1) this.f779g.get(a3)).f806g : this.f780h.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f779g.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += ((e1) this.f779g.get(i8)).hashCode();
        }
        return this.f780h.size() > 0 ? this.f780h.hashCode() + i7 : i7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        if (a3 >= 0) {
            return g(a3);
        }
        if (this.f780h.isEmpty()) {
            return null;
        }
        return this.f780h.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f780h.size() + this.f779g.size();
    }
}
