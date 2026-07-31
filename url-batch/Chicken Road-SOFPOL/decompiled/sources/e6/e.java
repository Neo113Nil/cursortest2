package e6;

import java.util.ConcurrentModificationException;
import java.util.Map;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements Map.Entry, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final f f2518d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2519e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2520f;

    public e(f fVar, int i) {
        i.e(fVar, "map");
        this.f2518d = fVar;
        this.f2519e = i;
        this.f2520f = fVar.f2528k;
    }

    public final void a() {
        if (this.f2518d.f2528k != this.f2520f) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return i.a(entry.getKey(), getKey()) && i.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f2518d.f2522d[this.f2519e];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f2518d.f2523e;
        i.b(objArr);
        return objArr[this.f2519e];
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
        f fVar = this.f2518d;
        fVar.b();
        Object[] objArr = fVar.f2523e;
        if (objArr == null) {
            int length = fVar.f2522d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f2523e = objArr;
        }
        int i = this.f2519e;
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
