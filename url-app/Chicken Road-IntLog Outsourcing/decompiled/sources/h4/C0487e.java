package h4;

import java.util.ConcurrentModificationException;
import java.util.Map;
import u4.InterfaceC1481a;

/* renamed from: h4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487e implements Map.Entry, InterfaceC1481a {

    /* renamed from: a, reason: collision with root package name */
    public final C0488f f5803a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5804b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5805c;

    public C0487e(C0488f map, int i2) {
        kotlin.jvm.internal.i.e(map, "map");
        this.f5803a = map;
        this.f5804b = i2;
        this.f5805c = map.f5814h;
    }

    public final void a() {
        if (this.f5803a.f5814h != this.f5805c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (kotlin.jvm.internal.i.a(entry.getKey(), getKey()) && kotlin.jvm.internal.i.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f5803a.f5807a[this.f5804b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f5803a.f5808b;
        kotlin.jvm.internal.i.b(objArr);
        return objArr[this.f5804b];
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
        C0488f c0488f = this.f5803a;
        c0488f.d();
        Object[] objArr = c0488f.f5808b;
        if (objArr == null) {
            int length = c0488f.f5807a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c0488f.f5808b = objArr;
        }
        int i2 = this.f5804b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
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
