package i;

import java.util.Map;

/* renamed from: i.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511c implements Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final Object f6226d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6227e;

    /* renamed from: f, reason: collision with root package name */
    public C0511c f6228f;

    /* renamed from: g, reason: collision with root package name */
    public C0511c f6229g;

    public C0511c(Object obj, Object obj2) {
        this.f6226d = obj;
        this.f6227e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0511c)) {
            return false;
        }
        C0511c c0511c = (C0511c) obj;
        return this.f6226d.equals(c0511c.f6226d) && this.f6227e.equals(c0511c.f6227e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6226d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6227e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f6226d.hashCode() ^ this.f6227e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f6226d + "=" + this.f6227e;
    }
}
