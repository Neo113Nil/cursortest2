package G;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: G.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0217p0 {

    /* renamed from: a, reason: collision with root package name */
    public final U f2888a;

    public AbstractC0217p0(Function0 function0) {
        this.f2888a = new U(function0);
    }

    public abstract C0219q0 a(Object obj);

    public a1 b() {
        return this.f2888a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a1 c(C0219q0 c0219q0, a1 a1Var) {
        a1 z02;
        J j4 = null;
        if (a1Var instanceof J) {
            if (c0219q0.f2892d) {
                j4 = (J) a1Var;
                j4.f2710a.setValue(c0219q0.a());
            }
        } else if (a1Var instanceof Z0) {
            if ((c0219q0.f2890b || c0219q0.f2893e != null) && !c0219q0.f2892d) {
                Z0 z03 = (Z0) a1Var;
                if (Intrinsics.a(c0219q0.a(), z03.f2784a)) {
                    j4 = z03;
                }
            }
        } else if (a1Var instanceof A) {
            c0219q0.getClass();
            ((A) a1Var).getClass();
        }
        if (j4 != null) {
            return j4;
        }
        if (c0219q0.f2892d) {
            M0 m02 = c0219q0.f2891c;
            if (m02 == null) {
                m02 = W.f2779l;
            }
            z02 = new J(C0192d.K(c0219q0.f2893e, m02));
        } else {
            z02 = new Z0(c0219q0.a());
        }
        return z02;
    }
}
