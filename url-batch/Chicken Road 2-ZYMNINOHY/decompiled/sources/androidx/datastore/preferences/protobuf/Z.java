package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class Z implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f4610a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y f4612c;

    public Z(Y y4, Comparable comparable, Object obj) {
        this.f4612c = y4;
        this.f4610a = comparable;
        this.f4611b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4610a.compareTo(((Z) obj).f4610a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f4610a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f4611b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4610a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4611b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f4610a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f4611b;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f4612c.b();
        Object obj2 = this.f4611b;
        this.f4611b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f4610a + "=" + this.f4611b;
    }
}
