package k1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z extends v {

    /* renamed from: f, reason: collision with root package name */
    public final j1.c f5357f;

    public z(j1.c cVar) {
        this.f5357f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.f5357f.equals(((z) obj).f5357f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5357f.hashCode();
    }

    @Override // k1.v
    public final j1.c i() {
        return this.f5357f;
    }
}
