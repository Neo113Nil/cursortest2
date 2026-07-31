package I;

/* renamed from: I.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0114p0 {

    /* renamed from: a, reason: collision with root package name */
    public final V f2332a;

    public AbstractC0114p0(Y1.a aVar) {
        this.f2332a = new V(aVar);
    }

    public abstract C0116q0 a(Object obj);

    public a1 b() {
        return this.f2332a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a1 c(C0116q0 c0116q0, a1 a1Var) {
        a1 z02;
        K k3 = null;
        if (a1Var instanceof K) {
            if (c0116q0.f2336d) {
                k3 = (K) a1Var;
                k3.f2157a.setValue(c0116q0.a());
            }
        } else if (a1Var instanceof Z0) {
            if ((c0116q0.f2334b || c0116q0.f2337e != null) && !c0116q0.f2336d) {
                Z0 z03 = (Z0) a1Var;
                if (Z1.i.a(c0116q0.a(), z03.f2230a)) {
                    k3 = z03;
                }
            }
        } else if (a1Var instanceof A) {
            c0116q0.getClass();
            ((A) a1Var).getClass();
        }
        if (k3 != null) {
            return k3;
        }
        if (c0116q0.f2336d) {
            N0 n02 = c0116q0.f2335c;
            if (n02 == null) {
                n02 = X.f2228i;
            }
            z02 = new K(C0089d.J(c0116q0.f2337e, n02));
        } else {
            z02 = new Z0(c0116q0.a());
        }
        return z02;
    }
}
