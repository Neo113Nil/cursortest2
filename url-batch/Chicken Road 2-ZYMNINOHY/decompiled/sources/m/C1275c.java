package m;

import java.util.Map;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1275c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14281a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14282b;

    /* renamed from: c, reason: collision with root package name */
    public C1275c f14283c;

    /* renamed from: d, reason: collision with root package name */
    public C1275c f14284d;

    public C1275c(Object obj, Object obj2) {
        this.f14281a = obj;
        this.f14282b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1275c)) {
            return false;
        }
        C1275c c1275c = (C1275c) obj;
        return this.f14281a.equals(c1275c.f14281a) && this.f14282b.equals(c1275c.f14282b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f14281a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f14282b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f14281a.hashCode() ^ this.f14282b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f14281a + "=" + this.f14282b;
    }
}
