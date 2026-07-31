package N1;

import a2.InterfaceC0184a;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements Map.Entry, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final g f2869d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2870e;

    public e(g gVar, int i3) {
        Z1.i.f(gVar, "map");
        this.f2869d = gVar;
        this.f2870e = i3;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Z1.i.a(entry.getKey(), getKey()) && Z1.i.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2869d.f2876d[this.f2870e];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f2869d.f2877e;
        Z1.i.c(objArr);
        return objArr[this.f2870e];
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
        g gVar = this.f2869d;
        gVar.c();
        Object[] objArr = gVar.f2877e;
        if (objArr == null) {
            int length = gVar.f2876d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            gVar.f2877e = objArr;
        }
        int i3 = this.f2870e;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
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
