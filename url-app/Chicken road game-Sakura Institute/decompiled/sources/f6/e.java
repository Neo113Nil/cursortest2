package f6;

import java.util.Map;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements Map.Entry, s6.d {

    /* renamed from: f, reason: collision with root package name */
    public final g f3411f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3412g;

    public e(g gVar, int i7) {
        k.f(gVar, "map");
        this.f3411f = gVar;
        this.f3412g = i7;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return k.a(entry.getKey(), getKey()) && k.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3411f.f3418f[this.f3412g];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f3411f.f3419g;
        k.c(objArr);
        return objArr[this.f3412g];
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
        g gVar = this.f3411f;
        gVar.c();
        Object[] objArr = gVar.f3419g;
        if (objArr == null) {
            int length = gVar.f3418f.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            gVar.f3419g = objArr;
        }
        int i7 = this.f3412g;
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
