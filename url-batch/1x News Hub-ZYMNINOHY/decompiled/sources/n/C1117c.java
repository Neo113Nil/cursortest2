package n;

import java.util.Map;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1117c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9974a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9975b;

    /* renamed from: c, reason: collision with root package name */
    public C1117c f9976c;

    /* renamed from: d, reason: collision with root package name */
    public C1117c f9977d;

    public C1117c(Object obj, Object obj2) {
        this.f9974a = obj;
        this.f9975b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1117c)) {
            return false;
        }
        C1117c c1117c = (C1117c) obj;
        return this.f9974a.equals(c1117c.f9974a) && this.f9975b.equals(c1117c.f9975b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9974a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9975b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f9974a.hashCode() ^ this.f9975b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f9974a + "=" + this.f9975b;
    }
}
