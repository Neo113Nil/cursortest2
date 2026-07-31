package G;

import m.AbstractC0639y;
import m.C0619d;
import m.C0635u;
import m.t0;
import q.C0806b;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f1990a;

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f1991b;

    /* renamed from: c, reason: collision with root package name */
    public static final t0 f1992c;

    static {
        C0635u c0635u = new C0635u(0.4f, 0.0f, 0.6f, 1.0f);
        f1990a = new t0(120, 0, AbstractC0639y.f6909a);
        f1991b = new t0(150, 0, c0635u);
        f1992c = new t0(120, 0, c0635u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0017, code lost:
    
        if ((r10 instanceof q.C0808d) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0033, code lost:
    
        if ((r9 instanceof q.C0808d) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C0619d c0619d, float f3, q.i iVar, q.i iVar2, X1.c cVar) {
        t0 t0Var;
        t0 t0Var2 = null;
        if (iVar2 != null) {
            boolean z3 = iVar2 instanceof q.m;
            t0Var = f1990a;
            if (!z3) {
                if (!(iVar2 instanceof C0806b)) {
                    if (!(iVar2 instanceof q.g)) {
                    }
                }
            }
            t0Var2 = t0Var;
        } else if (iVar != null) {
            boolean z4 = iVar instanceof q.m;
            t0Var = f1991b;
            if (!z4 && !(iVar instanceof C0806b)) {
                if (iVar instanceof q.g) {
                    t0Var2 = f1992c;
                }
            }
            t0Var2 = t0Var;
        }
        t0 t0Var3 = t0Var2;
        R1.y yVar = R1.y.f4171a;
        W1.a aVar = W1.a.f4608d;
        if (t0Var3 != null) {
            Object c2 = C0619d.c(c0619d, new O0.e(f3), t0Var3, null, cVar, 12);
            return c2 == aVar ? c2 : yVar;
        }
        Object e3 = c0619d.e(cVar, new O0.e(f3));
        return e3 == aVar ? e3 : yVar;
    }
}
