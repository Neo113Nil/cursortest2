package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cp3 extends AbstractMap {
    public Object[] m;
    public int n;
    public Map o;
    public boolean p;
    public volatile ci q;
    public Map r;

    public cp3() {
        Map map = Collections.EMPTY_MAP;
        this.o = map;
        this.r = map;
    }

    public final dp3 a(int i) {
        if (i < this.n) {
            return (dp3) this.m[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        return this.o.isEmpty() ? Collections.EMPTY_SET : this.o.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int e = e(comparable);
        if (e >= 0) {
            return ((dp3) this.m[e]).setValue(obj);
        }
        f();
        if (this.m == null) {
            this.m = new Object[16];
        }
        int i = -(e + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.n == 16) {
            dp3 dp3Var = (dp3) this.m[15];
            this.n = 15;
            g().put(dp3Var.m, dp3Var.n);
        }
        Object[] objArr = this.m;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.m[i] = new dp3(this, comparable, obj);
        this.n++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.n != 0) {
            this.m = null;
            this.n = 0;
        }
        if (this.o.isEmpty()) {
            return;
        }
        this.o.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.o.containsKey(comparable);
    }

    public final Object d(int i) {
        f();
        Object[] objArr = this.m;
        Object obj = ((dp3) objArr[i]).n;
        System.arraycopy(objArr, i + 1, objArr, i, (this.n - i) - 1);
        this.n--;
        if (!this.o.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.m;
            int i2 = this.n;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new dp3(this, (Comparable) entry.getKey(), entry.getValue());
            this.n++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i = this.n;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((dp3) this.m[i2]).m);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((dp3) this.m[i4]).m);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.q == null) {
            this.q = new ci(this, 2);
        }
        return this.q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp3)) {
            return super.equals(obj);
        }
        cp3 cp3Var = (cp3) obj;
        int size = size();
        if (size == cp3Var.size()) {
            int i = this.n;
            if (i != cp3Var.n) {
                return entrySet().equals(cp3Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (a(i2).equals(cp3Var.a(i2))) {
                }
            }
            if (i != size) {
                return this.o.equals(cp3Var.o);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.p) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap g() {
        f();
        if (this.o.isEmpty() && !(this.o instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.o = treeMap;
            this.r = treeMap.descendingMap();
        }
        return (SortedMap) this.o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e = e(comparable);
        return e >= 0 ? ((dp3) this.m[e]).n : this.o.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.n;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.m[i3].hashCode();
        }
        return this.o.size() > 0 ? this.o.hashCode() + i2 : i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int e = e(comparable);
        if (e >= 0) {
            return d(e);
        }
        if (this.o.isEmpty()) {
            return null;
        }
        return this.o.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.o.size() + this.n;
    }
}
