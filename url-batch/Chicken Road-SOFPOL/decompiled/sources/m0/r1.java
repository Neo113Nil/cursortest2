package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f5064a;

    public r1(p6.a aVar) {
        this.f5064a = new u0(aVar);
    }

    public abstract l.q a(Object obj);

    public w2 b() {
        return this.f5064a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final w2 c(l.q qVar, w2 w2Var) {
        i0 i0Var = null;
        if (w2Var instanceof i0) {
            if (qVar.f4380b) {
                i0Var = (i0) w2Var;
                i0Var.f4948a.setValue(qVar.b());
            }
        } else if (w2Var instanceof v2) {
            if ((qVar.f4379a || qVar.f4384f != null) && !qVar.f4380b) {
                v2 v2Var = (v2) w2Var;
                if (q6.i.a(qVar.b(), v2Var.f5143a)) {
                    i0Var = v2Var;
                }
            }
        } else if (w2Var instanceof c0) {
            qVar.getClass();
        }
        if (i0Var != null) {
            return i0Var;
        }
        if (!qVar.f4380b) {
            return new v2(qVar.b());
        }
        Object obj = qVar.f4384f;
        n2 n2Var = (n2) qVar.f4383e;
        if (n2Var == null) {
            n2Var = v0.i;
        }
        return new i0(new h1(obj, n2Var));
    }
}
