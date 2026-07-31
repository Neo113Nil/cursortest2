package m6;

/* loaded from: classes.dex */
public abstract class u1 extends a0 implements x0, j1 {

    /* renamed from: i, reason: collision with root package name */
    public v1 f19333i;

    public final void A(v1 v1Var) {
        this.f19333i = v1Var;
    }

    @Override // m6.j1
    public boolean b() {
        return true;
    }

    @Override // m6.x0
    public void d() {
        z().h0(this);
    }

    @Override // m6.j1
    public z1 h() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.n
    public String toString() {
        return q0.a(this) + '@' + q0.b(this) + "[job@" + q0.b(z()) + ']';
    }

    public final v1 z() {
        v1 v1Var = this.f19333i;
        if (v1Var != null) {
            return v1Var;
        }
        kotlin.jvm.internal.i.m("job");
        return null;
    }
}
