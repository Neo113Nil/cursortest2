package n;

import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final Object f5234d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5235e;

    /* renamed from: f, reason: collision with root package name */
    public c f5236f;

    /* renamed from: g, reason: collision with root package name */
    public c f5237g;

    public c(Object obj, Object obj2) {
        this.f5234d = obj;
        this.f5235e = obj2;
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
        return this.f5234d.equals(cVar.f5234d) && this.f5235e.equals(cVar.f5235e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5234d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5235e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f5234d.hashCode() ^ this.f5235e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f5234d + "=" + this.f5235e;
    }
}
