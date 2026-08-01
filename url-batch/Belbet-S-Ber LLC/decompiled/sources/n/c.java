package n;

import java.util.Map;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: f, reason: collision with root package name */
    public final Object f2742f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2743g;
    public c h;
    public c i;

    public c(Object obj, Object obj2) {
        this.f2742f = obj;
        this.f2743g = obj2;
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
        return this.f2742f.equals(cVar.f2742f) && this.f2743g.equals(cVar.f2743g);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2742f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2743g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f2742f.hashCode() ^ this.f2743g.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f2742f + "=" + this.f2743g;
    }
}
