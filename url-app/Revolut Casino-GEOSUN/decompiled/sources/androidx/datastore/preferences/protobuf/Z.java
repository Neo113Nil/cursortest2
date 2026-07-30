package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class Z implements Map.Entry, Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final Comparable f1414e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y f1416g;

    public Z(Y y2, Comparable comparable, Object obj) {
        this.f1416g = y2;
        this.f1414e = comparable;
        this.f1415f = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1414e.compareTo(((Z) obj).f1414e);
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
        Comparable comparable = this.f1414e;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f1415f;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1414e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1415f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f1414e;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f1415f;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f1416g.b();
        Object obj2 = this.f1415f;
        this.f1415f = obj;
        return obj2;
    }

    public final String toString() {
        return this.f1414e + "=" + this.f1415f;
    }
}
