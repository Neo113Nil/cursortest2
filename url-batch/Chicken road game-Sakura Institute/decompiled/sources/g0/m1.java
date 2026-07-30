package g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f3794a;

    public m1(q6.a aVar) {
        this.f3794a = new r0(aVar);
    }

    public abstract n1 a(Object obj);

    public p2 b() {
        return this.f3794a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x003f, code lost:
    
        if (r0 != false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p2 c(n1 n1Var, p2 p2Var) {
        o2 o2Var;
        Object obj;
        Object obj2 = null;
        if (p2Var instanceof i0) {
            if (n1Var.f3808d) {
                i0 i0Var = (i0) p2Var;
                g1 g1Var = i0Var.f3750a;
                if (n1Var.f3806b) {
                    obj = null;
                } else {
                    obj = n1Var.f3809e;
                    if (obj == null) {
                        d.x("Unexpected form of a provided value");
                        throw null;
                    }
                }
                g1Var.setValue(obj);
                o2Var = i0Var;
            }
            o2Var = null;
        } else {
            if (p2Var instanceof o2) {
                boolean z8 = n1Var.f3806b;
                Object obj3 = n1Var.f3809e;
                if ((z8 || obj3 != null) && !n1Var.f3808d) {
                    if (z8) {
                        obj3 = null;
                    } else if (obj3 == null) {
                        d.x("Unexpected form of a provided value");
                        throw null;
                    }
                    o2 o2Var2 = (o2) p2Var;
                    boolean a3 = r6.k.a(obj3, o2Var2.f3819a);
                    o2Var = o2Var2;
                }
            } else if (p2Var instanceof a0) {
                n1Var.getClass();
            }
            o2Var = null;
        }
        if (o2Var != null) {
            return o2Var;
        }
        boolean z9 = n1Var.f3808d;
        Object obj4 = n1Var.f3809e;
        if (z9) {
            f2 f2Var = n1Var.f3807c;
            if (f2Var == null) {
                f2Var = t0.f3903k;
            }
            return new i0(d.J(obj4, f2Var));
        }
        if (!n1Var.f3806b) {
            if (obj4 == null) {
                d.x("Unexpected form of a provided value");
                throw null;
            }
            obj2 = obj4;
        }
        return new o2(obj2);
    }
}
