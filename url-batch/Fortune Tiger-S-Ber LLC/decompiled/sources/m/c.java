package m;

import java.util.Map;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: f, reason: collision with root package name */
    public final Object f2899f;
    public final Object g;
    public c h;

    /* renamed from: i, reason: collision with root package name */
    public c f2900i;

    public c(Object obj, Object obj2) {
        this.f2899f = obj;
        this.g = obj2;
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
        return this.f2899f.equals(cVar.f2899f) && this.g.equals(cVar.g);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2899f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f2899f.hashCode() ^ this.g.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f2899f + "=" + this.g;
    }
}
