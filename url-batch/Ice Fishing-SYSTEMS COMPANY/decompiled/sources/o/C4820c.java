package o;

import java.util.Map;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4820c implements Map.Entry {

    /* renamed from: n, reason: collision with root package name */
    public final Object f39663n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f39664u;

    /* renamed from: v, reason: collision with root package name */
    public C4820c f39665v;

    /* renamed from: w, reason: collision with root package name */
    public C4820c f39666w;

    public C4820c(Object obj, Object obj2) {
        this.f39663n = obj;
        this.f39664u = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4820c)) {
            return false;
        }
        C4820c c4820c = (C4820c) obj;
        return this.f39663n.equals(c4820c.f39663n) && this.f39664u.equals(c4820c.f39664u);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f39663n;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f39664u;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f39663n.hashCode() ^ this.f39664u.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f39663n + "=" + this.f39664u;
    }
}
