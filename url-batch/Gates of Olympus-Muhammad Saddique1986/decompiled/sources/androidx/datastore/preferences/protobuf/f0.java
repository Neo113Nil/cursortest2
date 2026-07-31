package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class f0 implements Map.Entry, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final Comparable f5061d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0248b0 f5063f;

    public f0(C0248b0 c0248b0, Comparable comparable, Object obj) {
        this.f5063f = c0248b0;
        this.f5061d = comparable;
        this.f5062e = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5061d.compareTo(((f0) obj).f5061d);
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
        Comparable comparable = this.f5061d;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f5062e;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5061d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5062e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f5061d;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f5062e;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f5063f.b();
        Object obj2 = this.f5062e;
        this.f5062e = obj;
        return obj2;
    }

    public final String toString() {
        return this.f5061d + "=" + this.f5062e;
    }
}
