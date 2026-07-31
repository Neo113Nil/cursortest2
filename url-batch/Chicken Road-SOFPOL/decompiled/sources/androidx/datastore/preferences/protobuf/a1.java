package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a1 implements Map.Entry, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final Comparable f646d;

    /* renamed from: e, reason: collision with root package name */
    public Object f647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z0 f648f;

    public a1(z0 z0Var, Comparable comparable, Object obj) {
        this.f648f = z0Var;
        this.f646d = comparable;
        this.f647e = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f646d.compareTo(((a1) obj).f646d);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f646d;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f647e;
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
        return this.f646d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f647e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f646d;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f647e;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f648f.b();
        Object obj2 = this.f647e;
        this.f647e = obj;
        return obj2;
    }

    public final String toString() {
        return this.f646d + "=" + this.f647e;
    }
}
