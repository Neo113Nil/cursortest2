package i;

import java.util.Map;

/* renamed from: i.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0458c implements Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final Object f5086d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5087e;

    /* renamed from: f, reason: collision with root package name */
    public C0458c f5088f;

    /* renamed from: g, reason: collision with root package name */
    public C0458c f5089g;

    public C0458c(Object obj, Object obj2) {
        this.f5086d = obj;
        this.f5087e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0458c)) {
            return false;
        }
        C0458c c0458c = (C0458c) obj;
        return this.f5086d.equals(c0458c.f5086d) && this.f5087e.equals(c0458c.f5087e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5086d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5087e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f5086d.hashCode() ^ this.f5087e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f5086d + "=" + this.f5087e;
    }
}
