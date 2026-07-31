package R0;

import B.C0022x;
import F.C0087c;
import I.C0143d;
import I.C0159l;
import I.C0163n;
import I.C0167p;
import I.C0173s0;
import I.C0186z;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import I.W;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import java.util.UUID;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import u0.AbstractC1101g0;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final C0186z f4107a = new C0186z(W.f2783i, C0216e.f4077g);

    /* JADX WARN: Code restructure failed: missing block: B:51:0x013b, code lost:
    
        if (r7 == r1) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(D d3, InterfaceC0422a interfaceC0422a, E e3, Q.a aVar, C0167p c0167p, int i3, int i4) {
        int i5;
        InterfaceC0422a interfaceC0422a2;
        int i6;
        InterfaceC0422a interfaceC0422a3;
        String str;
        Object G3;
        Object obj;
        boolean z3;
        Object obj2;
        int i7;
        int i8;
        boolean h3;
        Object obj3;
        boolean h4;
        Object G4;
        boolean z4;
        Object G5;
        boolean h5;
        Object G6;
        boolean h6;
        Object G7;
        boolean h7;
        Object G8;
        int i9;
        C0173s0 r3;
        c0167p.S(-830247068);
        if ((i3 & 6) == 0) {
            i5 = (c0167p.f(d3) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i10 = i4 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            interfaceC0422a2 = interfaceC0422a;
            i5 |= c0167p.h(interfaceC0422a2) ? 32 : 16;
            if ((i3 & 384) == 0) {
                i5 |= c0167p.f(e3) ? 256 : 128;
            }
            if ((i3 & 3072) == 0) {
                i5 |= c0167p.h(aVar) ? 2048 : 1024;
            }
            i6 = i5;
            if ((i6 & 1171) == 1170 || !c0167p.x()) {
                interfaceC0422a3 = i10 == 0 ? null : interfaceC0422a2;
                View view = (View) c0167p.k(AndroidCompositionLocals_androidKt.f4942f);
                O0.b bVar = (O0.b) c0167p.k(AbstractC1101g0.f9354f);
                str = (String) c0167p.k(f4107a);
                O0.k kVar = (O0.k) c0167p.k(AbstractC1101g0.f9360l);
                C0163n M3 = C0143d.M(c0167p);
                InterfaceC0142c0 N3 = C0143d.N(aVar, c0167p);
                boolean z5 = false;
                UUID uuid = (UUID) O2.d.c0(new Object[0], null, C0216e.f4078h, c0167p, 3072, 6);
                G3 = c0167p.G();
                obj = C0159l.f2829a;
                if (G3 != obj) {
                    z3 = true;
                    obj2 = obj;
                    i7 = i6;
                    A a3 = new A(interfaceC0422a3, e3, str, view, bVar, d3, uuid);
                    a3.h(M3, new Q.a(1302892335, new C0087c(a3, 6, N3), true));
                    c0167p.a0(a3);
                    G3 = a3;
                } else {
                    z3 = true;
                    obj2 = obj;
                    i7 = i6;
                }
                A a4 = (A) G3;
                i8 = i7;
                int i11 = i8 & 112;
                int i12 = i8 & 896;
                h3 = c0167p.h(a4) | (i11 != 32 ? z3 : false) | (i12 != 256 ? z3 : false) | c0167p.f(str) | c0167p.f(kVar);
                Object G9 = c0167p.G();
                if (h3) {
                    obj3 = obj2;
                } else {
                    obj3 = obj2;
                }
                G9 = new g(a4, interfaceC0422a3, e3, str, kVar, 0);
                c0167p.a0(G9);
                C0143d.c(a4, (InterfaceC0424c) G9, c0167p);
                h4 = (i11 != 32 ? z3 : false) | c0167p.h(a4) | (i12 != 256 ? z3 : false) | c0167p.f(str) | c0167p.f(kVar);
                G4 = c0167p.G();
                if (!h4 || G4 == obj3) {
                    G4 = new h(a4, interfaceC0422a3, e3, str, kVar);
                    c0167p.a0(G4);
                }
                C0143d.g((InterfaceC0422a) G4, c0167p);
                boolean h8 = c0167p.h(a4);
                if ((i8 & 14) == 4) {
                    z5 = z3;
                }
                z4 = h8 | z5;
                G5 = c0167p.G();
                if (!z4 || G5 == obj3) {
                    G5 = new C0022x(a4, 15, d3);
                    c0167p.a0(G5);
                }
                C0143d.c(d3, (InterfaceC0424c) G5, c0167p);
                h5 = c0167p.h(a4);
                G6 = c0167p.G();
                if (!h5 || G6 == obj3) {
                    G6 = new j(a4, null);
                    c0167p.a0(G6);
                }
                C0143d.e(c0167p, (InterfaceC0426e) G6, a4);
                U.n nVar = U.n.f4488a;
                h6 = c0167p.h(a4);
                G7 = c0167p.G();
                if (!h6 || G7 == obj3) {
                    G7 = new k(a4, 0);
                    c0167p.a0(G7);
                }
                U.q d4 = androidx.compose.ui.layout.a.d(nVar, (InterfaceC0424c) G7);
                h7 = c0167p.h(a4) | c0167p.f(kVar);
                G8 = c0167p.G();
                if (!h7 || G8 == obj3) {
                    G8 = new l(a4, kVar);
                    c0167p.a0(G8);
                }
                InterfaceC0885G interfaceC0885G = (InterfaceC0885G) G8;
                i9 = c0167p.f2864P;
                InterfaceC0164n0 m3 = c0167p.m();
                U.q d5 = U.a.d(c0167p, d4);
                InterfaceC0997j.f8759c.getClass();
                C1001n c1001n = C0996i.f8754b;
                c0167p.U();
                if (c0167p.f2863O) {
                    c0167p.d0();
                } else {
                    c0167p.l(c1001n);
                }
                C0143d.R(c0167p, C0996i.f8757e, interfaceC0885G);
                C0143d.R(c0167p, C0996i.f8756d, m3);
                C0995h c0995h = C0996i.f8758f;
                if (!c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i9))) {
                    A.k.o(i9, c0167p, i9, c0995h);
                }
                C0143d.R(c0167p, C0996i.f8755c, d5);
                c0167p.p(z3);
                interfaceC0422a2 = interfaceC0422a3;
            } else {
                c0167p.L();
            }
            r3 = c0167p.r();
            if (r3 == null) {
                r3.f2906d = new m(d3, interfaceC0422a2, e3, aVar, i3, i4);
                return;
            }
            return;
        }
        interfaceC0422a2 = interfaceC0422a;
        if ((i3 & 384) == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        i6 = i5;
        if ((i6 & 1171) == 1170) {
        }
        if (i10 == 0) {
        }
        View view2 = (View) c0167p.k(AndroidCompositionLocals_androidKt.f4942f);
        O0.b bVar2 = (O0.b) c0167p.k(AbstractC1101g0.f9354f);
        str = (String) c0167p.k(f4107a);
        O0.k kVar2 = (O0.k) c0167p.k(AbstractC1101g0.f9360l);
        C0163n M32 = C0143d.M(c0167p);
        InterfaceC0142c0 N32 = C0143d.N(aVar, c0167p);
        boolean z52 = false;
        UUID uuid2 = (UUID) O2.d.c0(new Object[0], null, C0216e.f4078h, c0167p, 3072, 6);
        G3 = c0167p.G();
        obj = C0159l.f2829a;
        if (G3 != obj) {
        }
        A a42 = (A) G3;
        i8 = i7;
        int i112 = i8 & 112;
        int i122 = i8 & 896;
        h3 = c0167p.h(a42) | (i112 != 32 ? z3 : false) | (i122 != 256 ? z3 : false) | c0167p.f(str) | c0167p.f(kVar2);
        Object G92 = c0167p.G();
        if (h3) {
        }
        G92 = new g(a42, interfaceC0422a3, e3, str, kVar2, 0);
        c0167p.a0(G92);
        C0143d.c(a42, (InterfaceC0424c) G92, c0167p);
        h4 = (i112 != 32 ? z3 : false) | c0167p.h(a42) | (i122 != 256 ? z3 : false) | c0167p.f(str) | c0167p.f(kVar2);
        G4 = c0167p.G();
        if (!h4) {
        }
        G4 = new h(a42, interfaceC0422a3, e3, str, kVar2);
        c0167p.a0(G4);
        C0143d.g((InterfaceC0422a) G4, c0167p);
        boolean h82 = c0167p.h(a42);
        if ((i8 & 14) == 4) {
        }
        z4 = h82 | z52;
        G5 = c0167p.G();
        if (!z4) {
        }
        G5 = new C0022x(a42, 15, d3);
        c0167p.a0(G5);
        C0143d.c(d3, (InterfaceC0424c) G5, c0167p);
        h5 = c0167p.h(a42);
        G6 = c0167p.G();
        if (!h5) {
        }
        G6 = new j(a42, null);
        c0167p.a0(G6);
        C0143d.e(c0167p, (InterfaceC0426e) G6, a42);
        U.n nVar2 = U.n.f4488a;
        h6 = c0167p.h(a42);
        G7 = c0167p.G();
        if (!h6) {
        }
        G7 = new k(a42, 0);
        c0167p.a0(G7);
        U.q d42 = androidx.compose.ui.layout.a.d(nVar2, (InterfaceC0424c) G7);
        h7 = c0167p.h(a42) | c0167p.f(kVar2);
        G8 = c0167p.G();
        if (!h7) {
        }
        G8 = new l(a42, kVar2);
        c0167p.a0(G8);
        InterfaceC0885G interfaceC0885G2 = (InterfaceC0885G) G8;
        i9 = c0167p.f2864P;
        InterfaceC0164n0 m32 = c0167p.m();
        U.q d52 = U.a.d(c0167p, d42);
        InterfaceC0997j.f8759c.getClass();
        C1001n c1001n2 = C0996i.f8754b;
        c0167p.U();
        if (c0167p.f2863O) {
        }
        C0143d.R(c0167p, C0996i.f8757e, interfaceC0885G2);
        C0143d.R(c0167p, C0996i.f8756d, m32);
        C0995h c0995h2 = C0996i.f8758f;
        if (!c0167p.f2863O) {
        }
        A.k.o(i9, c0167p, i9, c0995h2);
        C0143d.R(c0167p, C0996i.f8755c, d52);
        c0167p.p(z3);
        interfaceC0422a2 = interfaceC0422a3;
        r3 = c0167p.r();
        if (r3 == null) {
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
