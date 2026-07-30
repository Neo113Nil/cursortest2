package e0;

import a2.k0;
import a2.w;
import a2.y;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.x3;
import d0.y0;
import g0.n1;
import g0.p1;
import g0.z;
import java.util.WeakHashMap;
import q.t0;
import q.u0;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final y f2665a = new y(null, new w());

    public static final void a(long j8, k0 k0Var, q6.e eVar, g0.p pVar, int i7) {
        int i8;
        pVar.S(-716124955);
        if ((i7 & 6) == 0) {
            i8 = (pVar.e(j8) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.f(k0Var) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.h(eVar) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && pVar.x()) {
            pVar.L();
        } else {
            z zVar = x3.f2526a;
            g0.d.b(new n1[]{y0.f2529a.a(new u(j8)), zVar.a(((k0) pVar.k(zVar)).d(k0Var))}, eVar, pVar, ((i8 >> 3) & 112) | 8);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new h(j8, k0Var, eVar, i7, 0);
        }
    }

    public static final q.a b(g0.p pVar) {
        u0 u0Var;
        WeakHashMap weakHashMap = u0.f7347u;
        View view = (View) pVar.k(AndroidCompositionLocals_androidKt.f743f);
        WeakHashMap weakHashMap2 = u0.f7347u;
        synchronized (weakHashMap2) {
            try {
                Object obj = weakHashMap2.get(view);
                if (obj == null) {
                    obj = new u0(view);
                    weakHashMap2.put(view, obj);
                }
                u0Var = (u0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean h3 = pVar.h(u0Var) | pVar.h(view);
        Object G = pVar.G();
        if (h3 || G == g0.l.f3784a) {
            G = new t0(u0Var, 0, view);
            pVar.a0(G);
        }
        g0.d.d(u0Var, (q6.c) G, pVar);
        return u0Var.f7354g;
    }
}
