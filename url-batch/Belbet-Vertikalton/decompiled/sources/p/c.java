package p;

import java.util.Map;

/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3778a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3779b;

    /* renamed from: c, reason: collision with root package name */
    public c f3780c;

    /* renamed from: d, reason: collision with root package name */
    public c f3781d;

    public c(Object obj, Object obj2) {
        this.f3778a = obj;
        this.f3779b = obj2;
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
        return this.f3778a.equals(cVar.f3778a) && this.f3779b.equals(cVar.f3779b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3778a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3779b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f3778a.hashCode() ^ this.f3779b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f3778a + "=" + this.f3779b;
    }
}
