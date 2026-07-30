package s1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0.n2 f8464a = new g0.n2(k0.J);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(y.q qVar, androidx.lifecycle.g0 g0Var, j6.c cVar) {
        v1 v1Var;
        int i7;
        if (cVar instanceof v1) {
            v1Var = (v1) cVar;
            int i8 = v1Var.f8451g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                v1Var.f8451g = i8 - Integer.MIN_VALUE;
                Object obj = v1Var.f8450f;
                i7 = v1Var.f8451g;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    throw new b4.c();
                }
                d6.a.e(obj);
                if (!qVar.f8104f.f8116r) {
                    throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
                }
                r1.g1 u8 = r1.f.u(qVar);
                o0.d dVar = (o0.d) r1.f.t(qVar).f7738y;
                dVar.getClass();
                if (g0.d.K(dVar, f8464a) != null) {
                    throw new ClassCastException();
                }
                v1Var.f8451g = 1;
                b(u8, g0Var, v1Var);
                return;
            }
        }
        v1Var = new v1(cVar);
        Object obj2 = v1Var.f8450f;
        i7 = v1Var.f8451g;
        if (i7 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(r1.g1 g1Var, q6.e eVar, j6.c cVar) {
        w1 w1Var;
        int i7;
        if (cVar instanceof w1) {
            w1Var = (w1) cVar;
            int i8 = w1Var.f8456g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                w1Var.f8456g = i8 - Integer.MIN_VALUE;
                Object obj = w1Var.f8455f;
                i7 = w1Var.f8456g;
                if (i7 != 0) {
                    d6.a.e(obj);
                    w1Var.f8456g = 1;
                    ((r) g1Var).G(eVar, w1Var);
                    return;
                } else {
                    if (i7 == 1) {
                        d6.a.e(obj);
                        throw new b4.c();
                    }
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d6.a.e(obj);
                    throw new b4.c();
                }
            }
        }
        w1Var = new w1(cVar);
        Object obj2 = w1Var.f8455f;
        i7 = w1Var.f8456g;
        if (i7 != 0) {
        }
    }
}
