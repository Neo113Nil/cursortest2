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

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f4405f = 0;

    /* renamed from: a, reason: collision with root package name */
    public List f4406a;

    /* renamed from: b, reason: collision with root package name */
    public Map f4407b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4408c;

    /* renamed from: d, reason: collision with root package name */
    public volatile a0 f4409d;

    /* renamed from: e, reason: collision with root package name */
    public Map f4410e;

    public static X g() {
        X x5 = new X();
        x5.f4406a = Collections.emptyList();
        x5.f4407b = Collections.emptyMap();
        x5.f4410e = Collections.emptyMap();
        return x5;
    }

    public final int a(Comparable comparable) {
        int i2;
        int size = this.f4406a.size();
        int i3 = size - 1;
        if (i3 >= 0) {
            int compareTo = comparable.compareTo(((Y) this.f4406a.get(i3)).f4411a);
            if (compareTo > 0) {
                i2 = size + 1;
                return -i2;
            }
            if (compareTo == 0) {
                return i3;
            }
        }
        int i6 = 0;
        while (i6 <= i3) {
            int i7 = (i6 + i3) / 2;
            int compareTo2 = comparable.compareTo(((Y) this.f4406a.get(i7)).f4411a);
            if (compareTo2 < 0) {
                i3 = i7 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i7;
                }
                i6 = i7 + 1;
            }
        }
        i2 = i6 + 1;
        return -i2;
    }

    public final void c() {
        if (this.f4408c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.f4406a.isEmpty()) {
            this.f4406a.clear();
        }
        if (this.f4407b.isEmpty()) {
            return;
        }
        this.f4407b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f4407b.containsKey(comparable);
    }

    public final Map.Entry d(int i2) {
        return (Map.Entry) this.f4406a.get(i2);
    }

    public final Set e() {
        return this.f4407b.isEmpty() ? Collections.emptySet() : this.f4407b.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f4409d == null) {
            this.f4409d = new a0(this);
        }
        return this.f4409d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return super.equals(obj);
        }
        X x5 = (X) obj;
        int size = size();
        if (size != x5.size()) {
            return false;
        }
        int size2 = this.f4406a.size();
        if (size2 != x5.f4406a.size()) {
            return ((AbstractSet) entrySet()).equals(x5.entrySet());
        }
        for (int i2 = 0; i2 < size2; i2++) {
            if (!d(i2).equals(x5.d(i2))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f4407b.equals(x5.f4407b);
        }
        return true;
    }

    public final SortedMap f() {
        c();
        if (this.f4407b.isEmpty() && !(this.f4407b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4407b = treeMap;
            this.f4410e = treeMap.descendingMap();
        }
        return (SortedMap) this.f4407b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a6 = a(comparable);
        return a6 >= 0 ? ((Y) this.f4406a.get(a6)).f4412b : this.f4407b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        c();
        int a6 = a(comparable);
        if (a6 >= 0) {
            return ((Y) this.f4406a.get(a6)).setValue(obj);
        }
        c();
        if (this.f4406a.isEmpty() && !(this.f4406a instanceof ArrayList)) {
            this.f4406a = new ArrayList(16);
        }
        int i2 = -(a6 + 1);
        if (i2 >= 16) {
            return f().put(comparable, obj);
        }
        if (this.f4406a.size() == 16) {
            Y y5 = (Y) this.f4406a.remove(15);
            f().put(y5.f4411a, y5.f4412b);
        }
        this.f4406a.add(i2, new Y(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f4406a.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((Y) this.f4406a.get(i3)).hashCode();
        }
        return this.f4407b.size() > 0 ? i2 + this.f4407b.hashCode() : i2;
    }

    public final Object i(int i2) {
        c();
        Object obj = ((Y) this.f4406a.remove(i2)).f4412b;
        if (!this.f4407b.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.f4406a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Y(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int a6 = a(comparable);
        if (a6 >= 0) {
            return i(a6);
        }
        if (this.f4407b.isEmpty()) {
            return null;
        }
        return this.f4407b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4407b.size() + this.f4406a.size();
    }
}
