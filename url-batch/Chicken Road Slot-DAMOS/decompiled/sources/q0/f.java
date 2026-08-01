package q0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends a.a {

    /* renamed from: a, reason: collision with root package name */
    public final a.a f7732a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7733b;

    public f(a.a aVar, int i3) {
        this.f7732a = aVar;
        this.f7733b = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.f7732a.equals(this.f7732a) && fVar.f7733b == this.f7733b;
    }

    public final int hashCode() {
        return this.f7732a.hashCode() + (this.f7733b * 31);
    }
}
