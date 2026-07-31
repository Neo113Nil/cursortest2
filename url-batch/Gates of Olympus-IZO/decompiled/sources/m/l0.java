package m;

import I.C0089d;
import I.C0102j0;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f5799a;

    /* renamed from: b, reason: collision with root package name */
    public final C0102j0 f5800b = C0089d.J(null, I.X.f2228i);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f5801c;

    public l0(s0 s0Var, y0 y0Var, String str) {
        this.f5801c = s0Var;
        this.f5799a = y0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k0 a(Y1.c cVar, Y1.c cVar2) {
        C0102j0 c0102j0 = this.f5800b;
        k0 k0Var = (k0) c0102j0.getValue();
        s0 s0Var = this.f5801c;
        if (k0Var == null) {
            Object j3 = cVar2.j(s0Var.f5841a.a());
            Object j4 = cVar2.j(s0Var.f5841a.a());
            y0 y0Var = this.f5799a;
            r rVar = (r) y0Var.f5883a.j(j4);
            rVar.d();
            o0 o0Var = new o0(s0Var, j3, rVar, y0Var);
            k0Var = new k0(this, o0Var, cVar, cVar2);
            c0102j0.setValue(k0Var);
            s0Var.f5849i.add(o0Var);
        }
        k0Var.f5797f = (Z1.j) cVar2;
        k0Var.f5796e = (Z1.j) cVar;
        k0Var.b(s0Var.f());
        return k0Var;
    }
}
