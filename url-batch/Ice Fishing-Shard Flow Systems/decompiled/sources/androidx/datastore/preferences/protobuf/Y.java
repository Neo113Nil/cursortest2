package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class Y implements Map.Entry, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final Comparable f3473d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3474e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X f3475i;

    public Y(X x7, Comparable comparable, Object obj) {
        this.f3475i = x7;
        this.f3473d = comparable;
        this.f3474e = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3473d.compareTo(((Y) obj).f3473d);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f3473d;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f3474e;
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
        return this.f3473d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3474e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f3473d;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f3474e;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f3475i.b();
        Object obj2 = this.f3474e;
        this.f3474e = obj;
        return obj2;
    }

    public final String toString() {
        return this.f3473d + "=" + this.f3474e;
    }
}
