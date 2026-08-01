package je;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c0 extends ke.d {

    /* renamed from: a, reason: collision with root package name */
    public long f5147a;

    /* renamed from: b, reason: collision with root package name */
    public ge.h f5148b;

    @Override // ke.d
    public final boolean a(ke.b bVar) {
        a0 a0Var = (a0) bVar;
        if (this.f5147a >= 0) {
            return false;
        }
        long j = a0Var.f5134w;
        if (j < a0Var.f5135x) {
            a0Var.f5135x = j;
        }
        this.f5147a = j;
        return true;
    }

    @Override // ke.d
    public final ld.a[] b(ke.b bVar) {
        long j = this.f5147a;
        this.f5147a = -1L;
        this.f5148b = null;
        return ((a0) bVar).v(j);
    }
}
