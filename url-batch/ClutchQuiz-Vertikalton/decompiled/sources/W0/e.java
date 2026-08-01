package W0;

import java.util.Map;

/* loaded from: classes.dex */
public final class e implements Map.Entry, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public final f f906a;

    /* renamed from: b, reason: collision with root package name */
    public final int f907b;

    public e(f fVar, int i) {
        g1.f.e(fVar, "map");
        this.f906a = fVar;
        this.f907b = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (g1.f.a(entry.getKey(), getKey()) && g1.f.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f906a.f909a[this.f907b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f906a.f910b;
        g1.f.b(objArr);
        return objArr[this.f907b];
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
        f fVar = this.f906a;
        fVar.c();
        Object[] objArr = fVar.f910b;
        if (objArr == null) {
            int length = fVar.f909a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f910b = objArr;
        }
        int i = this.f907b;
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
