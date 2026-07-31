package m6;

/* loaded from: classes.dex */
public class r1 extends v1 implements w {

    /* renamed from: g, reason: collision with root package name */
    private final boolean f19328g;

    public r1(o1 o1Var) {
        super(true);
        S(o1Var);
        this.f19328g = t0();
    }

    private final boolean t0() {
        q N = N();
        r rVar = N instanceof r ? (r) N : null;
        if (rVar == null) {
            return false;
        }
        do {
            v1 z6 = rVar.z();
            if (z6.K()) {
                return true;
            }
            q N2 = z6.N();
            rVar = N2 instanceof r ? (r) N2 : null;
        } while (rVar != null);
        return false;
    }

    @Override // m6.v1
    public boolean K() {
        return this.f19328g;
    }

    @Override // m6.v1
    public boolean L() {
        return true;
    }
}
