package n0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j0 implements c1.d {

    /* renamed from: d, reason: collision with root package name */
    public final n f6724d;

    public j0(n nVar) {
        this.f6724d = nVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            return this.f6724d.equals(((j0) obj).f6724d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6724d.hashCode() * 31;
    }
}
