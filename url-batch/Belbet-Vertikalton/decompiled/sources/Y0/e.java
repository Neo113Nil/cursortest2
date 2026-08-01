package Y0;

import java.util.Map;

/* loaded from: classes.dex */
public final class e implements Map.Entry, k1.a {

    /* renamed from: a, reason: collision with root package name */
    public final f f1402a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1403b;

    public e(f fVar, int i) {
        j1.h.e(fVar, "map");
        this.f1402a = fVar;
        this.f1403b = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (j1.h.a(entry.getKey(), getKey()) && j1.h.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1402a.f1405a[this.f1403b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f1402a.f1406b;
        j1.h.b(objArr);
        return objArr[this.f1403b];
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
        f fVar = this.f1402a;
        fVar.c();
        Object[] objArr = fVar.f1406b;
        if (objArr == null) {
            int length = fVar.f1405a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f1406b = objArr;
        }
        int i = this.f1403b;
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
