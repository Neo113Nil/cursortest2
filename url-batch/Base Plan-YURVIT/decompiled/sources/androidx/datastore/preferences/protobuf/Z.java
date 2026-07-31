package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class Z implements Map.Entry, Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final Comparable f1502e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y f1504g;

    public Z(Y y2, Comparable comparable, Object obj) {
        this.f1504g = y2;
        this.f1502e = comparable;
        this.f1503f = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1502e.compareTo(((Z) obj).f1502e);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f1502e;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f1503f;
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
        return this.f1502e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1503f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f1502e;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f1503f;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f1504g.b();
        Object obj2 = this.f1503f;
        this.f1503f = obj;
        return obj2;
    }

    public final String toString() {
        return this.f1502e + "=" + this.f1503f;
    }
}
