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
public final class C0437b0 extends AbstractMap {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f5318m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f5319d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5322j;

    /* renamed from: k, reason: collision with root package name */
    public volatile h0 f5323k;

    /* renamed from: e, reason: collision with root package name */
    public List f5320e = Collections.emptyList();

    /* renamed from: i, reason: collision with root package name */
    public Map f5321i = Collections.emptyMap();

    /* renamed from: l, reason: collision with root package name */
    public Map f5324l = Collections.emptyMap();

    public C0437b0(int i2) {
        this.f5319d = i2;
    }

    public final int b(Comparable comparable) {
        int i2;
        int size = this.f5320e.size();
        int i4 = size - 1;
        if (i4 >= 0) {
            int compareTo = comparable.compareTo(((f0) this.f5320e.get(i4)).f5335d);
            if (compareTo > 0) {
                i2 = size + 1;
                return -i2;
            }
            if (compareTo == 0) {
                return i4;
            }
        }
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) / 2;
            int compareTo2 = comparable.compareTo(((f0) this.f5320e.get(i6)).f5335d);
            if (compareTo2 < 0) {
                i4 = i6 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i6;
                }
                i5 = i6 + 1;
            }
        }
        i2 = i5 + 1;
        return -i2;
    }

    public final void c() {
        if (this.f5322j) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.f5320e.isEmpty()) {
            this.f5320e.clear();
        }
        if (this.f5321i.isEmpty()) {
            return;
        }
        this.f5321i.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.f5321i.containsKey(comparable);
    }

    public final Map.Entry d(int i2) {
        return (Map.Entry) this.f5320e.get(i2);
    }

    public final Iterable e() {
        return this.f5321i.isEmpty() ? e0.f5332b : this.f5321i.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f5323k == null) {
            this.f5323k = new h0(this, 0);
        }
        return this.f5323k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0437b0)) {
            return super.equals(obj);
        }
        C0437b0 c0437b0 = (C0437b0) obj;
        int size = size();
        if (size != c0437b0.size()) {
            return false;
        }
        int size2 = this.f5320e.size();
        if (size2 != c0437b0.f5320e.size()) {
            return ((AbstractSet) entrySet()).equals(c0437b0.entrySet());
        }
        for (int i2 = 0; i2 < size2; i2++) {
            if (!d(i2).equals(c0437b0.d(i2))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f5321i.equals(c0437b0.f5321i);
        }
        return true;
    }

    public final SortedMap f() {
        c();
        if (this.f5321i.isEmpty() && !(this.f5321i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5321i = treeMap;
            this.f5324l = treeMap.descendingMap();
        }
        return (SortedMap) this.f5321i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        c();
        int b4 = b(comparable);
        if (b4 >= 0) {
            return ((f0) this.f5320e.get(b4)).setValue(obj);
        }
        c();
        boolean isEmpty = this.f5320e.isEmpty();
        int i2 = this.f5319d;
        if (isEmpty && !(this.f5320e instanceof ArrayList)) {
            this.f5320e = new ArrayList(i2);
        }
        int i4 = -(b4 + 1);
        if (i4 >= i2) {
            return f().put(comparable, obj);
        }
        if (this.f5320e.size() == i2) {
            f0 f0Var = (f0) this.f5320e.remove(i2 - 1);
            f().put(f0Var.f5335d, f0Var.f5336e);
        }
        this.f5320e.add(i4, new f0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b4 = b(comparable);
        return b4 >= 0 ? ((f0) this.f5320e.get(b4)).f5336e : this.f5321i.get(comparable);
    }

    public final Object h(int i2) {
        c();
        Object obj = ((f0) this.f5320e.remove(i2)).f5336e;
        if (!this.f5321i.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.f5320e;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new f0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f5320e.size();
        int i2 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i2 += ((f0) this.f5320e.get(i4)).hashCode();
        }
        return this.f5321i.size() > 0 ? i2 + this.f5321i.hashCode() : i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int b4 = b(comparable);
        if (b4 >= 0) {
            return h(b4);
        }
        if (this.f5321i.isEmpty()) {
            return null;
        }
        return this.f5321i.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5321i.size() + this.f5320e.size();
    }
}
