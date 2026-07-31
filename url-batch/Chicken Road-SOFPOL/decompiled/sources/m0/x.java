package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final u f5153a;

    public x(u uVar) {
        this.f5153a = uVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return q6.i.a(this.f5153a, ((x) obj).f5153a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5153a.hashCode() * 31;
    }
}
