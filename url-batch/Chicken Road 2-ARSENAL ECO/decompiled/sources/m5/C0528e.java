package m5;

import java.util.ConcurrentModificationException;
import java.util.Map;
import y5.InterfaceC0766a;

/* renamed from: m5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528e implements Map.Entry, InterfaceC0766a {

    /* renamed from: f, reason: collision with root package name */
    public final C0529f f5465f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5466g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5467h;

    public C0528e(C0529f map, int i7) {
        kotlin.jvm.internal.i.e(map, "map");
        this.f5465f = map;
        this.f5466g = i7;
        this.f5467h = map.f5476m;
    }

    public final void a() {
        if (this.f5465f.f5476m != this.f5467h) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return kotlin.jvm.internal.i.a(entry.getKey(), getKey()) && kotlin.jvm.internal.i.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f5465f.f5469f[this.f5466g];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f5465f.f5470g;
        kotlin.jvm.internal.i.b(objArr);
        return objArr[this.f5466g];
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
        C0529f c0529f = this.f5465f;
        c0529f.c();
        Object[] objArr = c0529f.f5470g;
        if (objArr == null) {
            int length = c0529f.f5469f.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c0529f.f5470g = objArr;
        }
        int i7 = this.f5466g;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
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
