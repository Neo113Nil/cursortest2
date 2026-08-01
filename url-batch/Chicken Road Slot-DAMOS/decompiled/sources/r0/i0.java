package r0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8109a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8110b;

    public /* synthetic */ i0(int i3, int i10, int i11) {
        this((i11 & 1) != 0 ? 0 : i3, (i11 & 2) != 0 ? 0 : i10);
    }

    public abstract void a(androidx.datastore.preferences.protobuf.j jVar, n0.a aVar, q0.k kVar, c6.q qVar, j0 j0Var);

    public q0.b b(androidx.datastore.preferences.protobuf.j jVar) {
        return null;
    }

    public final String toString() {
        String c10 = wd.c0.a(getClass()).c();
        return c10 == null ? "" : c10;
    }

    public i0(int i3, int i10) {
        this.f8109a = i3;
        this.f8110b = i10;
    }
}
