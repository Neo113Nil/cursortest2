package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final y0.c f8293a;

    public t(y0.c cVar) {
        this.f8293a = cVar;
    }

    public final int a(int i, r2.l lVar) {
        return this.f8293a.a(0, i, lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && q6.i.a(this.f8293a, ((t) obj).f8293a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f8293a.f8696a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f8293a + ')';
    }
}
