package A2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g implements Map.Entry, N2.d {

    /* renamed from: d, reason: collision with root package name */
    public final e f833d;

    /* renamed from: e, reason: collision with root package name */
    public final int f834e;

    public g(e map, int i2) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f833d = map;
        this.f834e = i2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.a(entry.getKey(), getKey()) && Intrinsics.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f833d.f819d[this.f834e];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f833d.f820e;
        Intrinsics.c(objArr);
        return objArr[this.f834e];
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
        e eVar = this.f833d;
        eVar.c();
        Object[] objArr = eVar.f820e;
        if (objArr == null) {
            int length = eVar.f819d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            eVar.f820e = objArr;
        }
        int i2 = this.f834e;
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
