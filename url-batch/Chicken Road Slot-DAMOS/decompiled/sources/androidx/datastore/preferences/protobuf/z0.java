package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z0 implements Map.Entry, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final Comparable f659d;

    /* renamed from: e, reason: collision with root package name */
    public Object f660e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y0 f661i;

    public z0(y0 y0Var, Comparable comparable, Object obj) {
        this.f661i = y0Var;
        this.f659d = comparable;
        this.f660e = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f659d.compareTo(((z0) obj).f659d);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f659d;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f660e;
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
        return this.f659d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f660e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f659d;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f660e;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f661i.b();
        Object obj2 = this.f660e;
        this.f660e = obj;
        return obj2;
    }

    public final String toString() {
        return this.f659d + "=" + this.f660e;
    }
}
