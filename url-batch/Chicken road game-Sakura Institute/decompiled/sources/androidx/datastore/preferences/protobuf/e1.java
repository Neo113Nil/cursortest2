package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e1 implements Map.Entry, Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final Comparable f805f;

    /* renamed from: g, reason: collision with root package name */
    public Object f806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a1 f807h;

    public e1(a1 a1Var, Comparable comparable, Object obj) {
        this.f807h = a1Var;
        this.f805f = comparable;
        this.f806g = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f805f.compareTo(((e1) obj).f805f);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f805f;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f806g;
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
        return this.f805f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f806g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f805f;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f806g;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f807h.b();
        Object obj2 = this.f806g;
        this.f806g = obj;
        return obj2;
    }

    public final String toString() {
        return this.f805f + "=" + this.f806g;
    }
}
