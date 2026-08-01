package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q2 extends AbstractMap {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f2693d;

    /* renamed from: e, reason: collision with root package name */
    public int f2694e;

    /* renamed from: i, reason: collision with root package name */
    public Map f2695i;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2696r;

    /* renamed from: s, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.b1 f2697s;

    /* renamed from: t, reason: collision with root package name */
    public Map f2698t;

    public q2() {
        Map map = Collections.EMPTY_MAP;
        this.f2695i = map;
        this.f2698t = map;
    }

    public final r2 a(int i3) {
        if (i3 < this.f2694e) {
            return (r2) this.f2693d[i3];
        }
        throw new ArrayIndexOutOfBoundsException(i3);
    }

    public final Set b() {
        return this.f2695i.isEmpty() ? Collections.EMPTY_SET : this.f2695i.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int e2 = e(comparable);
        if (e2 >= 0) {
            return ((r2) this.f2693d[e2]).setValue(obj);
        }
        f();
        if (this.f2693d == null) {
            this.f2693d = new Object[16];
        }
        int i3 = -(e2 + 1);
        if (i3 >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f2694e == 16) {
            r2 r2Var = (r2) this.f2693d[15];
            this.f2694e = 15;
            g().put(r2Var.f2725d, r2Var.f2726e);
        }
        Object[] objArr = this.f2693d;
        int length = objArr.length;
        System.arraycopy(objArr, i3, objArr, i3 + 1, 15 - i3);
        this.f2693d[i3] = new r2(this, comparable, obj);
        this.f2694e++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.f2694e != 0) {
            this.f2693d = null;
            this.f2694e = 0;
        }
        if (this.f2695i.isEmpty()) {
            return;
        }
        this.f2695i.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f2695i.containsKey(comparable);
    }

    public final Object d(int i3) {
        f();
        Object[] objArr = this.f2693d;
        Object obj = ((r2) objArr[i3]).f2726e;
        System.arraycopy(objArr, i3 + 1, objArr, i3, (this.f2694e - i3) - 1);
        this.f2694e--;
        if (!this.f2695i.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f2693d;
            int i10 = this.f2694e;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i10] = new r2(this, (Comparable) entry.getKey(), entry.getValue());
            this.f2694e++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i3 = this.f2694e;
        int i10 = i3 - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int compareTo = comparable.compareTo(((r2) this.f2693d[i10]).f2725d);
            if (compareTo > 0) {
                return -(i3 + 1);
            }
            if (compareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int compareTo2 = comparable.compareTo(((r2) this.f2693d[i12]).f2725d);
            if (compareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f2697s == null) {
            this.f2697s = new androidx.datastore.preferences.protobuf.b1(1, this);
        }
        return this.f2697s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return super.equals(obj);
        }
        q2 q2Var = (q2) obj;
        int size = size();
        if (size == q2Var.size()) {
            int i3 = this.f2694e;
            if (i3 != q2Var.f2694e) {
                return entrySet().equals(q2Var.entrySet());
            }
            for (int i10 = 0; i10 < i3; i10++) {
                if (a(i10).equals(q2Var.a(i10))) {
                }
            }
            if (i3 != size) {
                return this.f2695i.equals(q2Var.f2695i);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f2696r) {
            a2.r.a();
        }
    }

    public final SortedMap g() {
        f();
        if (this.f2695i.isEmpty() && !(this.f2695i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2695i = treeMap;
            this.f2698t = treeMap.descendingMap();
        }
        return (SortedMap) this.f2695i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e2 = e(comparable);
        return e2 >= 0 ? ((r2) this.f2693d[e2]).f2726e : this.f2695i.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i3 = this.f2694e;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 += this.f2693d[i11].hashCode();
        }
        return this.f2695i.size() > 0 ? this.f2695i.hashCode() + i10 : i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int e2 = e(comparable);
        if (e2 >= 0) {
            return d(e2);
        }
        if (this.f2695i.isEmpty()) {
            return null;
        }
        return this.f2695i.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2695i.size() + this.f2694e;
    }
}
