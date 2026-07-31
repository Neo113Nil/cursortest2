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

/* renamed from: androidx.datastore.preferences.protobuf.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248b0 extends AbstractMap {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f5044j = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f5045d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5048g;

    /* renamed from: h, reason: collision with root package name */
    public volatile h0 f5049h;

    /* renamed from: e, reason: collision with root package name */
    public List f5046e = Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    public Map f5047f = Collections.emptyMap();

    /* renamed from: i, reason: collision with root package name */
    public Map f5050i = Collections.emptyMap();

    public C0248b0(int i3) {
        this.f5045d = i3;
    }

    public final int a(Comparable comparable) {
        int i3;
        int size = this.f5046e.size();
        int i4 = size - 1;
        if (i4 >= 0) {
            int compareTo = comparable.compareTo(((f0) this.f5046e.get(i4)).f5061d);
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
            int compareTo2 = comparable.compareTo(((f0) this.f5046e.get(i6)).f5061d);
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
        if (this.f5048g) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i3) {
        return (Map.Entry) this.f5046e.get(i3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f5046e.isEmpty()) {
            this.f5046e.clear();
        }
        if (this.f5047f.isEmpty()) {
            return;
        }
        this.f5047f.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f5047f.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f5047f.isEmpty() ? e0.f5058b : this.f5047f.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f5047f.isEmpty() && !(this.f5047f instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5047f = treeMap;
            this.f5050i = treeMap.descendingMap();
        }
        return (SortedMap) this.f5047f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f5049h == null) {
            this.f5049h = new h0(this, 0);
        }
        return this.f5049h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0248b0)) {
            return super.equals(obj);
        }
        C0248b0 c0248b0 = (C0248b0) obj;
        int size = size();
        if (size != c0248b0.size()) {
            return false;
        }
        int size2 = this.f5046e.size();
        if (size2 != c0248b0.f5046e.size()) {
            return ((AbstractSet) entrySet()).equals(c0248b0.entrySet());
        }
        for (int i3 = 0; i3 < size2; i3++) {
            if (!c(i3).equals(c0248b0.c(i3))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f5047f.equals(c0248b0.f5047f);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a3 = a(comparable);
        if (a3 >= 0) {
            return ((f0) this.f5046e.get(a3)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f5046e.isEmpty();
        int i3 = this.f5045d;
        if (isEmpty && !(this.f5046e instanceof ArrayList)) {
            this.f5046e = new ArrayList(i3);
        }
        int i4 = -(a3 + 1);
        if (i4 >= i3) {
            return e().put(comparable, obj);
        }
        if (this.f5046e.size() == i3) {
            f0 f0Var = (f0) this.f5046e.remove(i3 - 1);
            e().put(f0Var.f5061d, f0Var.f5062e);
        }
        this.f5046e.add(i4, new f0(this, comparable, obj));
        return null;
    }

    public final Object g(int i3) {
        b();
        Object obj = ((f0) this.f5046e.remove(i3)).f5062e;
        if (!this.f5047f.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f5046e;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new f0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        return a3 >= 0 ? ((f0) this.f5046e.get(a3)).f5062e : this.f5047f.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f5046e.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += ((f0) this.f5046e.get(i4)).hashCode();
        }
        return this.f5047f.size() > 0 ? i3 + this.f5047f.hashCode() : i3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        if (a3 >= 0) {
            return g(a3);
        }
        if (this.f5047f.isEmpty()) {
            return null;
        }
        return this.f5047f.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5047f.size() + this.f5046e.size();
    }
}
