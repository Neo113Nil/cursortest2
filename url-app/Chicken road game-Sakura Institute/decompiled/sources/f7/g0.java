package f7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g0 extends g7.d {

    /* renamed from: a, reason: collision with root package name */
    public long f3472a;

    /* renamed from: b, reason: collision with root package name */
    public c7.h f3473b;

    @Override // g7.d
    public final boolean a(g7.b bVar) {
        e0 e0Var = (e0) bVar;
        if (this.f3472a >= 0) {
            return false;
        }
        long j8 = e0Var.f3465n;
        if (j8 < e0Var.f3466o) {
            e0Var.f3466o = j8;
        }
        this.f3472a = j8;
        return true;
    }

    @Override // g7.d
    public final h6.d[] b(g7.b bVar) {
        long j8 = this.f3472a;
        this.f3472a = -1L;
        this.f3473b = null;
        return ((e0) bVar).w(j8);
    }
}
