package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class Z implements Map.Entry, Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final Comparable f1662e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y f1664g;

    public Z(Y y2, Comparable comparable, Object obj) {
        this.f1664g = y2;
        this.f1662e = comparable;
        this.f1663f = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1662e.compareTo(((Z) obj).f1662e);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f1662e;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f1663f;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1662e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1663f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f1662e;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f1663f;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f1664g.b();
        Object obj2 = this.f1663f;
        this.f1663f = obj;
        return obj2;
    }

    public final String toString() {
        return this.f1662e + "=" + this.f1663f;
    }
}
