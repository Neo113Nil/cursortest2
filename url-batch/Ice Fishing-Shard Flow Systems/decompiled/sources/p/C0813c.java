package p;

import java.util.Map;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0813c implements Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final Object f7140d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7141e;

    /* renamed from: i, reason: collision with root package name */
    public C0813c f7142i;

    /* renamed from: l, reason: collision with root package name */
    public C0813c f7143l;

    public C0813c(Object obj, Object obj2) {
        this.f7140d = obj;
        this.f7141e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0813c)) {
            return false;
        }
        C0813c c0813c = (C0813c) obj;
        return this.f7140d.equals(c0813c.f7140d) && this.f7141e.equals(c0813c.f7141e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7140d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7141e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f7140d.hashCode() ^ this.f7141e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f7140d + "=" + this.f7141e;
    }
}
