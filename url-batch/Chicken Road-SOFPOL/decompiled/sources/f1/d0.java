package f1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d0 extends p {

    /* renamed from: e, reason: collision with root package name */
    public final e1.c f2632e;

    public d0(e1.c cVar) {
        this.f2632e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return q6.i.a(this.f2632e, ((d0) obj).f2632e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2632e.hashCode();
    }

    @Override // f1.p
    public final e1.c k() {
        return this.f2632e;
    }
}
