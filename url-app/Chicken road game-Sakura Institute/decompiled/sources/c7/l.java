package c7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends b1 implements k {

    /* renamed from: j, reason: collision with root package name */
    public final f1 f1712j;

    public l(f1 f1Var) {
        this.f1712j = f1Var;
    }

    @Override // c7.k
    public final boolean e(Throwable th) {
        return j().s(th);
    }

    @Override // c7.b1
    public final boolean k() {
        return true;
    }

    @Override // c7.b1
    public final void l(Throwable th) {
        this.f1712j.m(j());
    }
}
