package m6;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final /* synthetic */ class t1 {
    public static final w a(o1 o1Var) {
        return new r1(o1Var);
    }

    public static /* synthetic */ w b(o1 o1Var, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            o1Var = null;
        }
        return s1.a(o1Var);
    }

    public static final void c(y5.g gVar, CancellationException cancellationException) {
        o1 o1Var = (o1) gVar.get(o1.f19317c);
        if (o1Var == null) {
            return;
        }
        o1Var.D(cancellationException);
    }

    public static final void d(o1 o1Var) {
        if (!o1Var.b()) {
            throw o1Var.x();
        }
    }

    public static final void e(y5.g gVar) {
        o1 o1Var = (o1) gVar.get(o1.f19317c);
        if (o1Var == null) {
            return;
        }
        s1.d(o1Var);
    }
}
