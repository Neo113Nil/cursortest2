package m6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class h {
    public static final o1 a(l0 l0Var, y5.g gVar, n0 n0Var, f6.p<? super l0, ? super y5.d<? super v5.q>, ? extends Object> pVar) {
        y5.g c7 = e0.c(l0Var, gVar);
        a x1Var = n0Var.e() ? new x1(c7, pVar) : new d2(c7, true);
        x1Var.w0(n0Var, x1Var, pVar);
        return x1Var;
    }

    public static /* synthetic */ o1 b(l0 l0Var, y5.g gVar, n0 n0Var, f6.p pVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            gVar = y5.h.f23481f;
        }
        if ((i7 & 2) != 0) {
            n0Var = n0.DEFAULT;
        }
        return g.a(l0Var, gVar, n0Var, pVar);
    }
}
