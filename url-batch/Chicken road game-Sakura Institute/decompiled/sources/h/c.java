package h;

import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: f, reason: collision with root package name */
    public final Object f4576f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4577g;

    /* renamed from: h, reason: collision with root package name */
    public c f4578h;

    /* renamed from: i, reason: collision with root package name */
    public c f4579i;

    public c(Object obj, Object obj2) {
        this.f4576f = obj;
        this.f4577g = obj2;
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
        return this.f4576f.equals(cVar.f4576f) && this.f4577g.equals(cVar.f4577g);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4576f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4577g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f4576f.hashCode() ^ this.f4577g.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f4576f + "=" + this.f4577g;
    }
}
