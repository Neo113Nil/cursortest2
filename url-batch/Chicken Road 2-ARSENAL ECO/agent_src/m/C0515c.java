package m;

import java.util.Map;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0515c implements Map.Entry {

    /* renamed from: f, reason: collision with root package name */
    public final Object f5315f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5316g;

    /* renamed from: h, reason: collision with root package name */
    public C0515c f5317h;

    /* renamed from: i, reason: collision with root package name */
    public C0515c f5318i;

    public C0515c(Object obj, Object obj2) {
        this.f5315f = obj;
        this.f5316g = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0515c)) {
            return false;
        }
        C0515c c0515c = (C0515c) obj;
        return this.f5315f.equals(c0515c.f5315f) && this.f5316g.equals(c0515c.f5316g);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5315f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5316g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f5315f.hashCode() ^ this.f5316g.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f5315f + "=" + this.f5316g;
    }
}
