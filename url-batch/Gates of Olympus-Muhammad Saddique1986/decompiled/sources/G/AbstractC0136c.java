package G;

import C0.K;
import F.V;
import F.x1;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0170q0;
import I.C0173s0;
import I.C0186z;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.C0352v;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import java.util.WeakHashMap;
import p.C0758d0;
import r.C0854a;
import r.Y;

/* renamed from: G.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0136c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0.y f1976a = new C0.y(null, new C0.w());

    public static final void a(long j3, K k3, InterfaceC0426e interfaceC0426e, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-716124955);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.e(j3) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(k3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(interfaceC0426e) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            C0186z c0186z = x1.f1884a;
            C0143d.b(new C0170q0[]{V.f1382a.a(new C0352v(j3)), c0186z.a(((K) c0167p.k(c0186z)).d(k3))}, interfaceC0426e, c0167p, ((i4 >> 3) & 112) | 8);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new m(j3, k3, interfaceC0426e, i3, 0);
        }
    }

    public static final C0854a b(C0167p c0167p) {
        Y y3;
        WeakHashMap weakHashMap = Y.f8002u;
        View view = (View) c0167p.k(AndroidCompositionLocals_androidKt.f4942f);
        WeakHashMap weakHashMap2 = Y.f8002u;
        synchronized (weakHashMap2) {
            try {
                Object obj = weakHashMap2.get(view);
                if (obj == null) {
                    obj = new Y(view);
                    weakHashMap2.put(view, obj);
                }
                y3 = (Y) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean h3 = c0167p.h(y3) | c0167p.h(view);
        Object G3 = c0167p.G();
        if (h3 || G3 == C0159l.f2829a) {
            G3 = new C0758d0(y3, 2, view);
            c0167p.a0(G3);
        }
        C0143d.c(y3, (InterfaceC0424c) G3, c0167p);
        return y3.f8009g;
    }
}
