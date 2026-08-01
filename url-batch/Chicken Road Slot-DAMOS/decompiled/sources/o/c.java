package o;

import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final Object f7299d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7300e;

    /* renamed from: i, reason: collision with root package name */
    public c f7301i;

    /* renamed from: r, reason: collision with root package name */
    public c f7302r;

    public c(Object obj, Object obj2) {
        this.f7299d = obj;
        this.f7300e = obj2;
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
        return this.f7299d.equals(cVar.f7299d) && this.f7300e.equals(cVar.f7300e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7299d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7300e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f7299d.hashCode() ^ this.f7300e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f7299d + "=" + this.f7300e;
    }
}
