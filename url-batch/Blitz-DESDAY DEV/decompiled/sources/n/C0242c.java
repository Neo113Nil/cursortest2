package n;

import java.util.Map;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3217a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3218b;

    /* renamed from: c, reason: collision with root package name */
    public C0242c f3219c;
    public C0242c d;

    public C0242c(Object obj, Object obj2) {
        this.f3217a = obj;
        this.f3218b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0242c)) {
            return false;
        }
        C0242c c0242c = (C0242c) obj;
        return this.f3217a.equals(c0242c.f3217a) && this.f3218b.equals(c0242c.f3218b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3217a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3218b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f3217a.hashCode() ^ this.f3218b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f3217a + "=" + this.f3218b;
    }
}
