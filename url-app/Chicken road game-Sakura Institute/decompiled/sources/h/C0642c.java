package h;

import java.util.Map;

/* renamed from: h.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0642c implements Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final Object f6815d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6816e;

    /* renamed from: i, reason: collision with root package name */
    public C0642c f6817i;

    /* renamed from: j, reason: collision with root package name */
    public C0642c f6818j;

    public C0642c(Object obj, Object obj2) {
        this.f6815d = obj;
        this.f6816e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0642c)) {
            return false;
        }
        C0642c c0642c = (C0642c) obj;
        return this.f6815d.equals(c0642c.f6815d) && this.f6816e.equals(c0642c.f6816e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6815d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6816e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f6815d.hashCode() ^ this.f6816e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f6815d + "=" + this.f6816e;
    }
}
