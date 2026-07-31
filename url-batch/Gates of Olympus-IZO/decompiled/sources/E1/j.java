package E1;

import F.C0047j0;
import F.H0;
import H1.y;
import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.C0119s0;
import I.InterfaceC0088c0;
import M1.B;
import R.o;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0225j;
import androidx.lifecycle.V;
import androidx.lifecycle.b0;
import b0.C0265P;
import b0.C0288u;
import f.AbstractC0382a;
import h0.C0424e;
import h0.C0425f;
import h0.C0429j;
import h0.G;
import h0.p;
import h0.r;
import h0.t;
import h0.u;
import h0.v;
import h0.x;
import h0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import n1.C0674a;
import o1.AbstractC0751b;
import q1.C0775D;
import q1.C0784h;
import q1.J;
import q1.w;
import r1.q;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final List f765a;

    static {
        C0425f c0425f = I2.l.f2513b;
        if (c0425f == null) {
            C0424e c0424e = new C0424e("Filled.Category", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i3 = G.f4893a;
            long j3 = C0288u.f4292b;
            C0265P c0265p = new C0265P(j3);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new h0.n(12.0f, 2.0f));
            arrayList.add(new u(-5.5f, 9.0f));
            arrayList.add(new t(11.0f));
            C0429j c0429j = C0429j.f4999c;
            arrayList.add(c0429j);
            C0424e.a(c0424e, arrayList, c0265p);
            C0265P c0265p2 = new C0265P(j3);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new h0.n(17.5f, 17.5f));
            arrayList2.add(new v(-4.5f, 0.0f));
            arrayList2.add(new r(4.5f, 4.5f, 0.0f, true, true, 9.0f, 0.0f));
            arrayList2.add(new r(4.5f, 4.5f, 0.0f, true, true, -9.0f, 0.0f));
            C0424e.a(c0424e, arrayList2, c0265p2);
            C0265P c0265p3 = new C0265P(j3);
            ArrayList arrayList3 = new ArrayList(32);
            arrayList3.add(new h0.n(3.0f, 13.5f));
            arrayList3.add(new t(8.0f));
            arrayList3.add(new z(8.0f));
            arrayList3.add(new h0.l(3.0f));
            arrayList3.add(c0429j);
            C0424e.a(c0424e, arrayList3, c0265p3);
            c0425f = c0424e.b();
            I2.l.f2513b = c0425f;
        }
        m mVar = new m("joints", "Joints", c0425f);
        C0425f c0425f2 = I2.d.f2496b;
        if (c0425f2 == null) {
            C0424e c0424e2 = new C0424e("Filled.Quiz", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = G.f4893a;
            long j4 = C0288u.f4292b;
            C0265P c0265p4 = new C0265P(j4);
            A2.n nVar = new A2.n(2);
            nVar.j(4.0f, 6.0f);
            nVar.f(2.0f);
            nVar.m(14.0f);
            nVar.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            nVar.g(14.0f);
            nVar.m(-2.0f);
            nVar.f(4.0f);
            nVar.l(6.0f);
            nVar.c();
            C0424e.a(c0424e2, nVar.f118a, c0265p4);
            C0265P c0265p5 = new C0265P(j4);
            A2.n nVar2 = new A2.n(2);
            nVar2.j(20.0f, 2.0f);
            nVar2.f(8.0f);
            nVar2.d(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f);
            nVar2.m(12.0f);
            nVar2.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            nVar2.g(12.0f);
            nVar2.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            nVar2.l(4.0f);
            nVar2.d(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
            nVar2.c();
            nVar2.j(14.01f, 15.0f);
            nVar2.e(-0.59f, 0.0f, -1.05f, -0.47f, -1.05f, -1.05f);
            nVar2.e(0.0f, -0.59f, 0.47f, -1.04f, 1.05f, -1.04f);
            nVar2.e(0.59f, 0.0f, 1.04f, 0.45f, 1.04f, 1.04f);
            nVar2.d(15.04f, 14.53f, 14.6f, 15.0f, 14.01f, 15.0f);
            nVar2.c();
            nVar2.j(16.51f, 8.83f);
            nVar2.e(-0.63f, 0.93f, -1.23f, 1.21f, -1.56f, 1.81f);
            nVar2.e(-0.13f, 0.24f, -0.18f, 0.4f, -0.18f, 1.18f);
            nVar2.g(-1.52f);
            nVar2.e(0.0f, -0.41f, -0.06f, -1.08f, 0.26f, -1.65f);
            nVar2.e(0.41f, -0.73f, 1.18f, -1.16f, 1.63f, -1.8f);
            nVar2.e(0.48f, -0.68f, 0.21f, -1.94f, -1.14f, -1.94f);
            nVar2.e(-0.88f, 0.0f, -1.32f, 0.67f, -1.5f, 1.23f);
            nVar2.i(-1.37f, -0.57f);
            nVar2.d(11.51f, 5.96f, 12.52f, 5.0f, 13.99f, 5.0f);
            nVar2.e(1.23f, 0.0f, 2.08f, 0.56f, 2.51f, 1.26f);
            nVar2.d(16.87f, 6.87f, 17.08f, 7.99f, 16.51f, 8.83f);
            nVar2.c();
            C0424e.a(c0424e2, nVar2.f118a, c0265p5);
            c0425f2 = c0424e2.b();
            I2.d.f2496b = c0425f2;
        }
        m mVar2 = new m("guess", "Guess", c0425f2);
        C0425f c0425f3 = B.f2785b;
        if (c0425f3 == null) {
            C0424e c0424e3 = new C0424e("Filled.Extension", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i5 = G.f4893a;
            C0265P c0265p6 = new C0265P(C0288u.f4292b);
            A2.n nVar3 = new A2.n(2);
            nVar3.j(20.5f, 11.0f);
            nVar3.f(19.0f);
            nVar3.l(7.0f);
            nVar3.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            nVar3.g(-4.0f);
            nVar3.l(3.5f);
            nVar3.d(13.0f, 2.12f, 11.88f, 1.0f, 10.5f, 1.0f);
            ArrayList arrayList4 = nVar3.f118a;
            arrayList4.add(new p(8.0f, 2.12f, 8.0f, 3.5f));
            nVar3.l(5.0f);
            nVar3.f(4.0f);
            nVar3.e(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
            nVar3.m(3.8f);
            nVar3.f(3.5f);
            nVar3.e(1.49f, 0.0f, 2.7f, 1.21f, 2.7f, 2.7f);
            arrayList4.add(new x(-1.21f, 2.7f, -2.7f, 2.7f));
            nVar3.f(2.0f);
            nVar3.l(20.0f);
            nVar3.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            nVar3.g(3.8f);
            nVar3.m(-1.5f);
            nVar3.e(0.0f, -1.49f, 1.21f, -2.7f, 2.7f, -2.7f);
            nVar3.e(1.49f, 0.0f, 2.7f, 1.21f, 2.7f, 2.7f);
            nVar3.l(22.0f);
            nVar3.f(17.0f);
            nVar3.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            nVar3.m(-4.0f);
            nVar3.g(1.5f);
            nVar3.e(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
            arrayList4.add(new p(21.88f, 11.0f, 20.5f, 11.0f));
            nVar3.c();
            C0424e.a(c0424e3, arrayList4, c0265p6);
            c0425f3 = c0424e3.b();
            B.f2785b = c0425f3;
        }
        m mVar3 = new m("match", "Match", c0425f3);
        C0425f c0425f4 = I2.d.f2495a;
        if (c0425f4 == null) {
            C0424e c0424e4 = new C0424e("Filled.Bookmarks", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i6 = G.f4893a;
            C0265P c0265p7 = new C0265P(C0288u.f4292b);
            A2.n nVar4 = new A2.n(2);
            nVar4.j(19.0f, 18.0f);
            nVar4.i(2.0f, 1.0f);
            nVar4.l(3.0f);
            nVar4.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            nVar4.f(8.99f);
            nVar4.d(7.89f, 1.0f, 7.0f, 1.9f, 7.0f, 3.0f);
            nVar4.g(10.0f);
            nVar4.e(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
            nVar4.m(13.0f);
            nVar4.c();
            nVar4.j(15.0f, 5.0f);
            nVar4.f(5.0f);
            nVar4.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
            nVar4.m(16.0f);
            nVar4.i(7.0f, -3.0f);
            nVar4.i(7.0f, 3.0f);
            nVar4.l(7.0f);
            nVar4.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            nVar4.c();
            C0424e.a(c0424e4, nVar4.f118a, c0265p7);
            c0425f4 = c0424e4.b();
            I2.d.f2495a = c0425f4;
        }
        f765a = M1.m.c0(mVar, mVar2, mVar3, new m("saved", "Saved", c0425f4));
    }

    public static final void a(com.gates.olympus.miruv.data.e eVar, C0113p c0113p, int i3) {
        int i4;
        w wVar;
        boolean z3 = false;
        Z1.i.f(eVar, "repository");
        c0113p.S(1891365969);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(eVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            Context context = (Context) c0113p.k(AndroidCompositionLocals_androidKt.f3738b);
            Object[] copyOf = Arrays.copyOf(new J[0], 0);
            q qVar = q.f7247e;
            C0047j0 c0047j0 = new C0047j0(28, context);
            C2.c cVar = o.f3164a;
            C2.c cVar2 = new C2.c(qVar, 3, c0047j0);
            boolean h3 = c0113p.h(context);
            Object G3 = c0113p.G();
            if (h3 || G3 == C0105l.f2272a) {
                G3 = new r1.r(0, context);
                c0113p.a0(G3);
            }
            C0775D c0775d = (C0775D) I2.d.H(copyOf, cVar2, (Y1.a) G3, c0113p, 0, 4);
            n nVar = new n(eVar);
            c0113p.R(1729797275);
            b0 a3 = AbstractC0751b.a(c0113p);
            if (a3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            V A3 = AbstractC0382a.A(Z1.u.a(y.class), a3, nVar, a3 instanceof InterfaceC0225j ? ((InterfaceC0225j) a3).a() : C0674a.f6271b, c0113p);
            c0113p.p(false);
            y yVar = (y) A3;
            c0113p.R(1729797275);
            b0 a4 = AbstractC0751b.a(c0113p);
            if (a4 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            V A4 = AbstractC0382a.A(Z1.u.a(G1.r.class), a4, nVar, a4 instanceof InterfaceC0225j ? ((InterfaceC0225j) a4).a() : C0674a.f6271b, c0113p);
            c0113p.p(false);
            G1.r rVar = (G1.r) A4;
            c0113p.R(1729797275);
            b0 a5 = AbstractC0751b.a(c0113p);
            if (a5 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            V A5 = AbstractC0382a.A(Z1.u.a(I1.m.class), a5, nVar, a5 instanceof InterfaceC0225j ? ((InterfaceC0225j) a5).a() : C0674a.f6271b, c0113p);
            c0113p.p(false);
            I1.m mVar = (I1.m) A5;
            c0113p.R(1729797275);
            b0 a6 = AbstractC0751b.a(c0113p);
            if (a6 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            V A6 = AbstractC0382a.A(Z1.u.a(J1.k.class), a6, nVar, a6 instanceof InterfaceC0225j ? ((InterfaceC0225j) a6).a() : C0674a.f6271b, c0113p);
            c0113p.p(false);
            J1.k kVar = (J1.k) A6;
            InterfaceC0088c0 v3 = C0089d.v(c0775d.D, null, null, c0113p, 48, 2);
            C0784h c0784h = (C0784h) v3.getValue();
            String str = (c0784h == null || (wVar = c0784h.f6895e) == null) ? null : wVar.f6968j;
            List list = f765a;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((m) it.next()).f769a.equals(str)) {
                        z3 = true;
                        break;
                    }
                }
            }
            H0.a(null, null, Q.f.b(-45378282, new e(z3, v3, c0775d), c0113p), null, null, 0, 0L, 0L, null, Q.f.b(1786913248, new i(c0775d, yVar, rVar, mVar, kVar), c0113p), c0113p, 805306752, 507);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new H1.e(eVar, i3, 2);
        }
    }
}
