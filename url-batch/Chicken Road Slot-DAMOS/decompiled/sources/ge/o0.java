package ge;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o0 implements z0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4382d;

    public o0(boolean z10) {
        this.f4382d = z10;
    }

    @Override // ge.z0
    public final boolean d() {
        return this.f4382d;
    }

    @Override // ge.z0
    public final m1 e() {
        return null;
    }

    public final String toString() {
        return n0.l.h(new StringBuilder("Empty{"), this.f4382d ? "Active" : "New", '}');
    }
}
