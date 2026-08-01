package n;

import java.util.Map;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: f, reason: collision with root package name */
    public final Object f2700f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2701g;

    /* renamed from: h, reason: collision with root package name */
    public c f2702h;
    public c i;

    public c(Object obj, Object obj2) {
        this.f2700f = obj;
        this.f2701g = obj2;
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
        return this.f2700f.equals(cVar.f2700f) && this.f2701g.equals(cVar.f2701g);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2700f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2701g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f2700f.hashCode() ^ this.f2701g.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f2700f + "=" + this.f2701g;
    }
}
