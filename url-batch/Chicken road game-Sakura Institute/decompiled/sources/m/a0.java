package m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 extends s0.n implements r1.k, r1.c1 {

    /* renamed from: s, reason: collision with root package name */
    public s.u f6105s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6106t;

    @Override // r1.c1
    public final void I() {
        r6.v vVar = new r6.v();
        r1.f.q(this, new a0.b1(vVar, 4, this));
        s.u uVar = (s.u) vVar.f7968f;
        if (this.f6106t) {
            s.u uVar2 = this.f6105s;
            if (uVar2 != null) {
                uVar2.b();
            }
            if (uVar != null) {
                uVar.a();
            } else {
                uVar = null;
            }
            this.f6105s = uVar;
        }
    }

    @Override // s0.n
    public final boolean p0() {
        return false;
    }

    @Override // s0.n
    public final void u0() {
        s.u uVar = this.f6105s;
        if (uVar != null) {
            uVar.b();
        }
        this.f6105s = null;
    }
}
