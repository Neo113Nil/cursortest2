package Z0;

import java.util.Map;
import l1.InterfaceC0284a;

/* loaded from: classes.dex */
public final class e implements Map.Entry, InterfaceC0284a {

    /* renamed from: a, reason: collision with root package name */
    public final f f1537a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1538b;

    public e(f fVar, int i) {
        k1.e.e(fVar, "map");
        this.f1537a = fVar;
        this.f1538b = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (k1.e.a(entry.getKey(), getKey()) && k1.e.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1537a.f1540a[this.f1538b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f1537a.f1541b;
        k1.e.b(objArr);
        return objArr[this.f1538b];
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
        f fVar = this.f1537a;
        fVar.c();
        Object[] objArr = fVar.f1541b;
        if (objArr == null) {
            int length = fVar.f1540a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f1541b = objArr;
        }
        int i = this.f1538b;
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
