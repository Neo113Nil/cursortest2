package n;

import java.util.Map;

/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3255a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3256b;

    /* renamed from: c, reason: collision with root package name */
    public c f3257c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f3255a = obj;
        this.f3256b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3255a.equals(cVar.f3255a) && this.f3256b.equals(cVar.f3256b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3255a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3256b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f3255a.hashCode() ^ this.f3256b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f3255a + "=" + this.f3256b;
    }
}
