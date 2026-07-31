package G;

import B0.C;
import B0.q;
import B0.r;
import F.D0;
import F.P;
import F.X0;
import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.C0116q0;
import I.C0119s0;
import I.C0132z;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.C0288u;
import java.util.WeakHashMap;
import r.C0804a;
import r.V;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1505a = new r(new q());

    public static final void a(long j3, C c3, Y1.e eVar, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(-716124955);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.e(j3) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.f(c3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.h(eVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0113p.x()) {
            c0113p.L();
        } else {
            C0132z c0132z = X0.f1161a;
            C0089d.b(new C0116q0[]{P.f1079a.a(new C0288u(j3)), c0132z.a(((C) c0113p.k(c0132z)).c(c3))}, eVar, c0113p, ((i4 >> 3) & 112) | 8);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new g(j3, c3, eVar, i3);
        }
    }

    public static final C0804a b(C0113p c0113p) {
        V v3;
        WeakHashMap weakHashMap = V.f7028u;
        View view = (View) c0113p.k(AndroidCompositionLocals_androidKt.f3742f);
        WeakHashMap weakHashMap2 = V.f7028u;
        synchronized (weakHashMap2) {
            try {
                Object obj = weakHashMap2.get(view);
                if (obj == null) {
                    obj = new V(view);
                    weakHashMap2.put(view, obj);
                }
                v3 = (V) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean h3 = c0113p.h(v3) | c0113p.h(view);
        Object G3 = c0113p.G();
        if (h3 || G3 == C0105l.f2272a) {
            G3 = new D0(v3, 26, view);
            c0113p.a0(G3);
        }
        C0089d.c(v3, (Y1.c) G3, c0113p);
        return v3.f7035g;
    }
}
