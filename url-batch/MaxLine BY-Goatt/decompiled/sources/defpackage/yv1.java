package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yv1 extends pw1 {
    public static final yv1 d;
    public static final yv1 e;
    public static final yv1 f;
    public static final yv1 g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new yv1(i, 2, 0);
        int i2 = 1;
        e = new yv1(i2, i2, 1);
        f = new yv1(i, 2, 2);
        int i3 = 1;
        g = new yv1(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yv1(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.pw1
    public final void a(gn gnVar, rh rhVar, zl2 zl2Var, q82 q82Var, qw1 qw1Var) {
        switch (this.c) {
            case 0:
                Object invoke = ((Function0) gnVar.g(0)).invoke();
                m6 m6Var = (m6) gnVar.g(1);
                int f2 = gnVar.f(0);
                m6Var.getClass();
                zl2Var.T(zl2Var.c(m6Var), invoke);
                rhVar.f(f2, invoke);
                rhVar.c(invoke);
                break;
            case 1:
                m6 m6Var2 = (m6) gnVar.g(0);
                int f3 = gnVar.f(0);
                rhVar.p();
                m6Var2.getClass();
                rhVar.b(f3, zl2Var.C(zl2Var.c(m6Var2)));
                break;
            case 2:
                Object g2 = gnVar.g(0);
                m6 m6Var3 = (m6) gnVar.g(1);
                int f4 = gnVar.f(0);
                if (g2 instanceof s82) {
                    s82 s82Var = (s82) g2;
                    q82Var.e.b(s82Var);
                    q82Var.d.a(s82Var);
                }
                Object J = zl2Var.J(zl2Var.c(m6Var3), f4, g2);
                if (!(J instanceof s82)) {
                    if (J instanceof n72) {
                        ((n72) J).c();
                        break;
                    }
                } else {
                    q82Var.d((s82) J);
                    break;
                }
                break;
            default:
                Object g3 = gnVar.g(0);
                int f5 = gnVar.f(0);
                if (g3 instanceof s82) {
                    s82 s82Var2 = (s82) g3;
                    q82Var.e.b(s82Var2);
                    q82Var.d.a(s82Var2);
                }
                Object J2 = zl2Var.J(zl2Var.t, f5, g3);
                if (!(J2 instanceof s82)) {
                    if (J2 instanceof n72) {
                        ((n72) J2).c();
                        break;
                    }
                } else {
                    q82Var.d((s82) J2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.pw1
    public m6 b(gn gnVar) {
        switch (this.c) {
            case 0:
                return (m6) gnVar.g(1);
            case 1:
                return (m6) gnVar.g(0);
            default:
                return super.b(gnVar);
        }
    }
}
