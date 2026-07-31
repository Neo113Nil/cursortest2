package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class f0 implements Map.Entry, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final Comparable f3860d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0192b0 f3862f;

    public f0(C0192b0 c0192b0, Comparable comparable, Object obj) {
        this.f3862f = c0192b0;
        this.f3860d = comparable;
        this.f3861e = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3860d.compareTo(((f0) obj).f3860d);
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
        Comparable comparable = this.f3860d;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f3861e;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3860d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3861e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f3860d;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f3861e;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f3862f.b();
        Object obj2 = this.f3861e;
        this.f3861e = obj;
        return obj2;
    }

    public final String toString() {
        return this.f3860d + "=" + this.f3861e;
    }
}
