package F0;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements Map.Entry {

    /* renamed from: e, reason: collision with root package name */
    public final f f473e;

    /* renamed from: f, reason: collision with root package name */
    public final int f474f;

    /* renamed from: g, reason: collision with root package name */
    public final int f475g;

    public e(f fVar, int i2) {
        P0.h.e(fVar, "map");
        this.f473e = fVar;
        this.f474f = i2;
        this.f475g = fVar.f484l;
    }

    public final void a() {
        if (this.f473e.f484l != this.f475g) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return P0.h.a(entry.getKey(), getKey()) && P0.h.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f473e.f477e[this.f474f];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f473e.f478f;
        P0.h.b(objArr);
        return objArr[this.f474f];
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
        f fVar = this.f473e;
        fVar.b();
        Object[] objArr = fVar.f478f;
        if (objArr == null) {
            int length = fVar.f477e.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f478f = objArr;
        }
        int i2 = this.f474f;
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
