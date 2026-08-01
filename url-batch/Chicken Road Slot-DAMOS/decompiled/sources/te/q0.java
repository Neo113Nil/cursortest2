package te;

import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q0 implements Map.Entry, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final Object f9422d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9423e;

    public q0(Object obj, Object obj2) {
        this.f9422d = obj;
        this.f9423e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f9422d.equals(q0Var.f9422d) && this.f9423e.equals(q0Var.f9423e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9422d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9423e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f9423e.hashCode() + (this.f9422d.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f9422d + ", value=" + this.f9423e + ')';
    }
}
