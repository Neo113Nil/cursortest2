package E;

import A0.L;
import A0.y;
import D.N1;
import D.S;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0219q0;
import G.C0222s0;
import G.C0235z;
import Z.C0323u;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import q.C1022a;
import q.n0;
import q.o0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final y f2173a = new y(null, new A0.w());

    public static final void a(long j4, L l4, Function2 function2, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-716124955);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.e(j4) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(l4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(function2) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            C0235z c0235z = N1.f1524a;
            C0192d.b(new C0219q0[]{S.f1616a.a(new C0323u(j4)), c0235z.a(((L) c0216p.k(c0235z)).d(l4))}, function2, c0216p, ((i4 >> 3) & 112) | 8);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new h(j4, l4, function2, i2, 0);
        }
    }

    public static final C1022a b(C0216p c0216p) {
        o0 o0Var;
        WeakHashMap weakHashMap = o0.f9297u;
        View view = (View) c0216p.k(AndroidCompositionLocals_androidKt.f5217f);
        WeakHashMap weakHashMap2 = o0.f9297u;
        synchronized (weakHashMap2) {
            try {
                Object obj = weakHashMap2.get(view);
                if (obj == null) {
                    obj = new o0(view);
                    weakHashMap2.put(view, obj);
                }
                o0Var = (o0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean h4 = c0216p.h(o0Var) | c0216p.h(view);
        Object I3 = c0216p.I();
        if (h4 || I3 == C0208l.f2826a) {
            I3 = new n0(o0Var, 0, view);
            c0216p.c0(I3);
        }
        C0192d.d(o0Var, (Function1) I3, c0216p);
        return o0Var.f9304g;
    }
}
