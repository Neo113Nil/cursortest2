package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class p71 {
    public static final k61 a = new k61(7);
    public static final m71 b = new m71();
    public static final l71 c = new l71();
    public static final n71 d = new n71();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d81 d81Var, long j, fn fnVar) {
        o71 o71Var;
        int i;
        w11 w11Var;
        d81 d81Var2;
        if (fnVar instanceof o71) {
            o71Var = (o71) fnVar;
            int i2 = o71Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o71Var.k = i2 - Integer.MIN_VALUE;
                Object obj = o71Var.j;
                tn tnVar = tn.d;
                i = o71Var.k;
                if (i != 0) {
                    ca0.v(obj);
                    w11Var = new w11();
                    go0 go0Var = go0.d;
                    g gVar = new g(d81Var, j, w11Var, null, 1);
                    o71Var.h = d81Var;
                    o71Var.i = w11Var;
                    o71Var.k = 1;
                    if (d81Var.f(go0Var, gVar, o71Var) == tnVar) {
                        return tnVar;
                    }
                    d81Var2 = d81Var;
                } else {
                    if (i != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w11 w11Var2 = o71Var.i;
                    d81 d81Var3 = o71Var.h;
                    ca0.v(obj);
                    w11Var = w11Var2;
                    d81Var2 = d81Var3;
                }
                return new wq0(d81Var2.h(w11Var.d));
            }
        }
        o71Var = new o71(fnVar);
        Object obj2 = o71Var.j;
        tn tnVar2 = tn.d;
        i = o71Var.k;
        if (i != 0) {
        }
        return new wq0(d81Var2.h(w11Var.d));
    }
}
