package s7;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: s7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5005e implements Map.Entry, F7.a {

    /* renamed from: n, reason: collision with root package name */
    public final C5006f f40503n;

    /* renamed from: u, reason: collision with root package name */
    public final int f40504u;

    /* renamed from: v, reason: collision with root package name */
    public final int f40505v;

    public C5005e(C5006f map, int i) {
        kotlin.jvm.internal.h.e(map, "map");
        this.f40503n = map;
        this.f40504u = i;
        this.f40505v = map.f40507A;
    }

    public final void a() {
        if (this.f40503n.f40507A != this.f40505v) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return kotlin.jvm.internal.h.a(entry.getKey(), getKey()) && kotlin.jvm.internal.h.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f40503n.f40513n[this.f40504u];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f40503n.f40514u;
        kotlin.jvm.internal.h.b(objArr);
        return objArr[this.f40504u];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        C5006f c5006f = this.f40503n;
        c5006f.d();
        Object[] objArr = c5006f.f40514u;
        if (objArr == null) {
            int length = c5006f.f40513n.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c5006f.f40514u = objArr;
        }
        int i = this.f40504u;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
