package T1;

import f2.j;
import g2.InterfaceC0439a;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements Map.Entry, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final f f4348d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4349e;

    public d(f fVar, int i3) {
        j.f(fVar, "map");
        this.f4348d = fVar;
        this.f4349e = i3;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (j.a(entry.getKey(), getKey()) && j.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4348d.f4355d[this.f4349e];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f4348d.f4356e;
        j.c(objArr);
        return objArr[this.f4349e];
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
        f fVar = this.f4348d;
        fVar.c();
        Object[] objArr = fVar.f4356e;
        if (objArr == null) {
            int length = fVar.f4355d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f4356e = objArr;
        }
        int i3 = this.f4349e;
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
