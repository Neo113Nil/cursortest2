package O2;

import B.A;
import B.C0011l;
import B.C0017s;
import B.C0020v;
import B.C0021w;
import B.C0022x;
import B.Y;
import B.a0;
import B.r;
import C0.J;
import C0.K;
import F.AbstractC0110n0;
import F.d1;
import F.g1;
import I.C0143d;
import I.C0156j0;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import I.W;
import O1.B;
import O1.C0209c;
import O1.D;
import O1.s;
import R1.y;
import S.t;
import S.x;
import T2.AbstractC0226a;
import T2.C0231f;
import T2.C0234i;
import U.q;
import Z.p;
import a.AbstractC0235a;
import a0.AbstractC0236a;
import a0.C0238c;
import a0.C0240e;
import a1.C0243b;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.layout.FillElement;
import androidx.lifecycle.P;
import b0.C0352v;
import c1.AbstractC0394s;
import com.gatesof.olympus.martu.marku.R;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import e2.InterfaceC0429h;
import f1.AbstractC0433a;
import f2.v;
import h0.C0463f;
import h2.AbstractC0508a;
import j.AbstractC0522D;
import j.C0550x;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import l.C0578d;
import l.C0581g;
import l.C0585k;
import l.C0586l;
import l.N;
import l.w;
import m.f0;
import m.l0;
import m.r0;
import m.s0;
import m.v0;
import n.AbstractC0695v;
import n0.C0700A;
import n0.C0711i;
import n0.EnumC0712j;
import n2.AbstractC0721a;
import n2.AbstractC0729i;
import n2.AbstractC0730j;
import n2.AbstractC0737q;
import n2.C0728h;
import p.C;
import q2.AbstractC0837y;
import r.AbstractC0864k;
import r.AbstractC0868o;
import r.C0850L;
import r.C0855b;
import r.C0861h;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import u0.O0;
import x.Q;
import x.Z;

/* loaded from: classes.dex */
public abstract class l implements Decoder, B2.a, E0.e {

    /* renamed from: d, reason: collision with root package name */
    public static C0463f f3905d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f3906e = false;

    /* renamed from: f, reason: collision with root package name */
    public static Method f3907f;

    public l() {
        new ConcurrentHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    public static final void F(l0 l0Var, q qVar, InterfaceC0424c interfaceC0424c, U.d dVar, InterfaceC0424c interfaceC0424c2, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        C0586l c0586l;
        C0550x c0550x;
        t tVar;
        Object obj;
        C0586l c0586l2;
        ?? r13;
        int i5;
        c0167p.S(-114689412);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(l0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(qVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(interfaceC0424c) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.f(dVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0167p.h(interfaceC0424c2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0167p.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && c0167p.x()) {
            c0167p.L();
        } else {
            int i6 = i4 & 14;
            boolean z3 = i6 == 4;
            Object G3 = c0167p.G();
            Object obj2 = C0159l.f2829a;
            if (z3 || G3 == obj2) {
                G3 = new C0586l(l0Var, dVar);
                c0167p.a0(G3);
            }
            C0586l c0586l3 = (C0586l) G3;
            boolean z4 = i6 == 4;
            Object G4 = c0167p.G();
            Object obj3 = G4;
            if (z4 || G4 == obj2) {
                Object[] objArr = {l0Var.f6836a.a()};
                t tVar2 = new t();
                tVar2.addAll(S1.k.w0(objArr));
                c0167p.a0(tVar2);
                obj3 = tVar2;
            }
            t tVar3 = (t) obj3;
            boolean z5 = i6 == 4;
            Object G5 = c0167p.G();
            if (z5 || G5 == obj2) {
                long[] jArr = AbstractC0522D.f6254a;
                G5 = new C0550x();
                c0167p.a0(G5);
            }
            C0550x c0550x2 = (C0550x) G5;
            boolean contains = tVar3.contains(l0Var.f6836a.a());
            s0 s0Var = l0Var.f6836a;
            if (!contains) {
                tVar3.clear();
                tVar3.add(s0Var.a());
            }
            Object a3 = s0Var.a();
            C0156j0 c0156j0 = l0Var.f6839d;
            if (f2.j.a(a3, c0156j0.getValue())) {
                if (tVar3.size() != 1 || !f2.j.a(tVar3.get(0), s0Var.a())) {
                    tVar3.clear();
                    tVar3.add(s0Var.a());
                }
                if (c0550x2.f6348e != 1 || c0550x2.b(s0Var.a())) {
                    c0550x2.a();
                }
                c0586l3.f6502b = dVar;
            }
            if (f2.j.a(s0Var.a(), c0156j0.getValue()) || tVar3.contains(c0156j0.getValue())) {
                c0586l = c0586l3;
            } else {
                ListIterator listIterator = tVar3.listIterator();
                int i7 = 0;
                while (true) {
                    x xVar = (x) listIterator;
                    ListIterator listIterator2 = listIterator;
                    if (!xVar.hasNext()) {
                        c0586l = c0586l3;
                        i5 = -1;
                        i7 = -1;
                        break;
                    }
                    Object n3 = interfaceC0424c2.n(xVar.next());
                    c0586l = c0586l3;
                    if (f2.j.a(n3, interfaceC0424c2.n(c0156j0.getValue()))) {
                        i5 = -1;
                        break;
                    } else {
                        i7++;
                        c0586l3 = c0586l;
                        listIterator = listIterator2;
                    }
                }
                if (i7 == i5) {
                    tVar3.add(c0156j0.getValue());
                } else {
                    tVar3.set(i7, c0156j0.getValue());
                }
            }
            if (c0550x2.b(c0156j0.getValue()) && c0550x2.b(s0Var.a())) {
                c0167p.Q(915535767);
                c0167p.p(false);
                c0550x = c0550x2;
                tVar = tVar3;
                obj = obj2;
                r13 = 0;
                c0586l2 = c0586l;
            } else {
                boolean z6 = false;
                c0167p.Q(912931457);
                c0550x2.a();
                int size = tVar3.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj4 = tVar3.get(i8);
                    C0550x c0550x3 = c0550x2;
                    t tVar4 = tVar3;
                    C0586l c0586l4 = c0586l;
                    c0550x3.i(obj4, Q.f.b(885640742, new C0578d(l0Var, obj4, interfaceC0424c, c0586l4, tVar4, aVar), c0167p));
                    i8++;
                    c0550x2 = c0550x3;
                    obj2 = obj2;
                    z6 = z6;
                    tVar3 = tVar4;
                    c0586l = c0586l4;
                }
                c0550x = c0550x2;
                tVar = tVar3;
                obj = obj2;
                boolean z7 = z6;
                c0586l2 = c0586l;
                c0167p.p(z7);
                r13 = z7;
            }
            C0586l c0586l5 = c0586l2;
            boolean f3 = c0167p.f(l0Var.f()) | c0167p.f(c0586l5);
            Object G6 = c0167p.G();
            if (f3 || G6 == obj) {
                G6 = (w) interfaceC0424c.n(c0586l5);
                c0167p.a0(G6);
            }
            w wVar = (w) G6;
            c0586l5.getClass();
            boolean f4 = c0167p.f(c0586l5);
            Object G7 = c0167p.G();
            if (f4 || G7 == obj) {
                G7 = C0143d.K(Boolean.FALSE, W.f2783i);
                c0167p.a0(G7);
            }
            InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) G7;
            InterfaceC0142c0 N3 = C0143d.N(wVar.f6546d, c0167p);
            l0 l0Var2 = c0586l5.f6501a;
            if (f2.j.a(l0Var2.f6836a.a(), l0Var2.f6839d.getValue())) {
                interfaceC0142c0.setValue(Boolean.FALSE);
            } else if (N3.getValue() != null) {
                interfaceC0142c0.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) interfaceC0142c0.getValue()).booleanValue();
            q qVar2 = U.n.f4488a;
            if (booleanValue) {
                c0167p.Q(249037309);
                f0 a4 = r0.a(c0586l5.f6501a, v0.f6906h, null, c0167p, 0, 2);
                boolean f5 = c0167p.f(a4);
                Object G8 = c0167p.G();
                if (f5 || G8 == obj) {
                    N n4 = (N) N3.getValue();
                    if (n4 == null || n4.f6465a) {
                        qVar2 = AbstractC0508a.v(qVar2);
                    }
                    G8 = qVar2.i(new C0585k(c0586l5, a4, N3));
                    c0167p.a0(G8);
                }
                qVar2 = (q) G8;
                c0167p.p(r13);
            } else {
                c0167p.Q(249353726);
                c0167p.p(r13);
            }
            q i9 = qVar.i(qVar2);
            Object G9 = c0167p.G();
            if (G9 == obj) {
                G9 = new C0581g(c0586l5);
                c0167p.a0(G9);
            }
            C0581g c0581g = (C0581g) G9;
            int i10 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            q d3 = U.a.d(c0167p, i9);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, c0581g);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i10))) {
                A.k.o(i10, c0167p, i10, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            c0167p.Q(-1491001814);
            int size2 = tVar.size();
            int i11 = r13;
            while (i11 < size2) {
                t tVar5 = tVar;
                Object obj5 = tVar5.get(i11);
                c0167p.M(1908315325, r13, interfaceC0424c2.n(obj5), null);
                InterfaceC0426e interfaceC0426e = (InterfaceC0426e) c0550x.e(obj5);
                if (interfaceC0426e == null) {
                    c0167p.Q(-971711888);
                } else {
                    c0167p.Q(1908317105);
                    interfaceC0426e.h(c0167p, Integer.valueOf((int) r13));
                }
                c0167p.p(r13);
                c0167p.p(r13);
                i11++;
                tVar = tVar5;
            }
            c0167p.p(r13);
            c0167p.p(true);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new g1(l0Var, qVar, interfaceC0424c, dVar, interfaceC0424c2, aVar, i3);
        }
    }

    public static O0.c G() {
        return new O0.c(1.0f, 1.0f);
    }

    public static final void H(List list, InterfaceC0422a interfaceC0422a, InterfaceC0429h interfaceC0429h, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-949056256);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(list) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(interfaceC0422a) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(interfaceC0429h) ? 256 : 128;
        }
        int i5 = i4;
        if ((i5 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            c0167p.Q(323802071);
            Object G3 = c0167p.G();
            W w2 = C0159l.f2829a;
            Double d3 = null;
            W w3 = W.f2783i;
            if (G3 == w2) {
                G3 = C0143d.K(null, w3);
                c0167p.a0(G3);
            }
            InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) G3;
            boolean z3 = false;
            c0167p.p(false);
            c0167p.Q(323804012);
            Object G4 = c0167p.G();
            if (G4 == w2) {
                G4 = C0143d.K("", w3);
                c0167p.a0(G4);
            }
            InterfaceC0142c0 interfaceC0142c02 = (InterfaceC0142c0) G4;
            c0167p.p(false);
            c0167p.Q(323805651);
            Object G5 = c0167p.G();
            if (G5 == w2) {
                G5 = C0143d.K("Haircut", w3);
                c0167p.a0(G5);
            }
            InterfaceC0142c0 interfaceC0142c03 = (InterfaceC0142c0) G5;
            c0167p.p(false);
            c0167p.Q(323807564);
            Object G6 = c0167p.G();
            if (G6 == w2) {
                G6 = C0143d.K("", w3);
                c0167p.a0(G6);
            }
            InterfaceC0142c0 interfaceC0142c04 = (InterfaceC0142c0) G6;
            c0167p.p(false);
            c0167p.Q(323809100);
            Object G7 = c0167p.G();
            if (G7 == w2) {
                G7 = C0143d.K("", w3);
                c0167p.a0(G7);
            }
            InterfaceC0142c0 interfaceC0142c05 = (InterfaceC0142c0) G7;
            c0167p.p(false);
            c0167p.Q(323810767);
            Object G8 = c0167p.G();
            if (G8 == w2) {
                G8 = C0143d.K(Boolean.FALSE, w3);
                c0167p.a0(G8);
            }
            InterfaceC0142c0 interfaceC0142c06 = (InterfaceC0142c0) G8;
            c0167p.p(false);
            String w4 = AbstractC0737q.w((String) interfaceC0142c04.getValue(), ',', '.');
            try {
                C0728h c0728h = AbstractC0729i.f7370a;
                c0728h.getClass();
                if (c0728h.f7369d.matcher(w4).matches()) {
                    d3 = Double.valueOf(Double.parseDouble(w4));
                }
            } catch (NumberFormatException unused) {
            }
            Double d4 = d3;
            if ((((J1.a) interfaceC0142c0.getValue()) != null || !AbstractC0730j.K((String) interfaceC0142c02.getValue())) && d4 != null && d4.doubleValue() >= 0.0d) {
                z3 = true;
            }
            d1.a(interfaceC0422a, Q.f.b(-1823120056, new B(interfaceC0429h, d4, z3, interfaceC0142c0, interfaceC0142c02, interfaceC0142c03, interfaceC0142c05), c0167p), null, Q.f.b(-424166454, new O1.g(interfaceC0422a, 1), c0167p), null, s.f3859f, Q.f.b(-473219699, new D(interfaceC0142c0, interfaceC0142c06, list, interfaceC0142c02, interfaceC0142c03, interfaceC0142c04, interfaceC0142c05), c0167p), null, 0L, 0L, 0L, 0L, 0.0f, null, c0167p, ((i5 >> 3) & 14) | 1772592, 0);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new N1.b(list, interfaceC0422a, interfaceC0429h, i3, 3);
        }
    }

    public static final void I(Q1.j jVar, C0167p c0167p, int i3) {
        int i4;
        int i5;
        boolean z3;
        InterfaceC0142c0 interfaceC0142c0;
        Object obj;
        InterfaceC0142c0 interfaceC0142c02;
        int i6;
        final InterfaceC0142c0 interfaceC0142c03;
        final Q1.j jVar2 = jVar;
        c0167p.S(768399937);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(jVar2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            InterfaceC0142c0 i7 = AbstractC0695v.i(jVar2.f3991c, c0167p);
            InterfaceC0142c0 i8 = AbstractC0695v.i(jVar2.f3992d, c0167p);
            c0167p.Q(292210451);
            Object G3 = c0167p.G();
            Object obj2 = C0159l.f2829a;
            if (G3 == obj2) {
                G3 = C0143d.K(Boolean.FALSE, W.f2783i);
                c0167p.a0(G3);
            }
            InterfaceC0142c0 interfaceC0142c04 = (InterfaceC0142c0) G3;
            c0167p.p(false);
            FillElement fillElement = androidx.compose.foundation.layout.c.f4829b;
            InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4461d, false);
            int i9 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            q d3 = U.a.d(c0167p, fillElement);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, e3);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i9))) {
                A.k.o(i9, c0167p, i9, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            androidx.compose.foundation.layout.a aVar = androidx.compose.foundation.layout.a.f4827a;
            if (((List) i7.getValue()).isEmpty()) {
                c0167p.Q(1480796996);
                AbstractC0508a.d("No haircuts logged. Tap + to record one.", null, c0167p, 6);
                c0167p.p(false);
                i5 = 16;
                z3 = false;
                interfaceC0142c0 = interfaceC0142c04;
                obj = obj2;
            } else {
                c0167p.Q(1480941735);
                float f3 = 16;
                C0850L c0850l = new C0850L(f3, f3, f3, f3);
                C0855b c0855b = AbstractC0864k.f8051a;
                C0861h c0861h = new C0861h(10);
                c0167p.Q(1156158649);
                boolean f4 = c0167p.f(i7) | c0167p.h(jVar2);
                Object G4 = c0167p.G();
                if (f4 || G4 == obj2) {
                    G4 = new O1.t(i7, jVar2);
                    c0167p.a0(G4);
                }
                c0167p.p(false);
                i5 = 16;
                z3 = false;
                interfaceC0142c0 = interfaceC0142c04;
                obj = obj2;
                AbstractC0695v.a(fillElement, null, c0850l, false, c0861h, null, null, false, (InterfaceC0424c) G4, c0167p, 24966);
                c0167p.p(false);
            }
            q f5 = androidx.compose.foundation.layout.b.f(aVar.a(), i5);
            Q.a aVar2 = s.f3855b;
            Q.a aVar3 = s.f3856c;
            c0167p.Q(1156216803);
            Object G5 = c0167p.G();
            Object obj3 = obj;
            if (G5 == obj3) {
                interfaceC0142c02 = interfaceC0142c0;
                i6 = 1;
                G5 = new C0209c(interfaceC0142c02, i6);
                c0167p.a0(G5);
            } else {
                interfaceC0142c02 = interfaceC0142c0;
                i6 = 1;
            }
            c0167p.p(z3);
            InterfaceC0142c0 interfaceC0142c05 = interfaceC0142c02;
            boolean z4 = z3;
            AbstractC0110n0.a(aVar2, aVar3, (InterfaceC0422a) G5, f5, false, null, 0L, 0L, null, null, c0167p, 438);
            c0167p.p(true);
            if (((Boolean) interfaceC0142c05.getValue()).booleanValue()) {
                List list = (List) i8.getValue();
                c0167p.Q(292294789);
                Object G6 = c0167p.G();
                if (G6 == obj3) {
                    interfaceC0142c03 = interfaceC0142c05;
                    G6 = new C0209c(interfaceC0142c03, 2);
                    c0167p.a0(G6);
                } else {
                    interfaceC0142c03 = interfaceC0142c05;
                }
                InterfaceC0422a interfaceC0422a = (InterfaceC0422a) G6;
                c0167p.p(z4);
                c0167p.Q(292296294);
                jVar2 = jVar;
                boolean h3 = c0167p.h(jVar2);
                Object G7 = c0167p.G();
                if (h3 || G7 == obj3) {
                    G7 = new InterfaceC0429h() { // from class: O1.z
                        @Override // e2.InterfaceC0429h
                        public final Object i(J1.a aVar4, String str, String str2, Object obj4, Object obj5) {
                            double doubleValue = ((Double) obj4).doubleValue();
                            String str3 = (String) obj5;
                            f2.j.f(str, "walkIn");
                            f2.j.f(str2, "service");
                            f2.j.f(str3, "note");
                            Q1.j jVar3 = jVar2;
                            AbstractC0837y.r(P.j(jVar3), null, null, new Q1.h(aVar4, str, str2, doubleValue, str3, jVar3, null), 3);
                            interfaceC0142c03.setValue(Boolean.FALSE);
                            return R1.y.f4171a;
                        }
                    };
                    c0167p.a0(G7);
                }
                c0167p.p(z4);
                H(list, interfaceC0422a, (InterfaceC0429h) G7, c0167p, 48);
            } else {
                jVar2 = jVar;
            }
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new M1.c(i3, 5, jVar2);
        }
    }

    public static final long J(int i3, int i4) {
        if (i3 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i3 + ", end: " + i4 + ']').toString());
        }
        if (i4 >= 0) {
            long j3 = (i4 & 4294967295L) | (i3 << 32);
            int i5 = J.f568c;
            return j3;
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i3 + ", end: " + i4 + ']').toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K(C0700A c0700a, X1.a aVar) {
        C0020v c0020v;
        int i3;
        int size;
        int i4;
        if (aVar instanceof C0020v) {
            c0020v = (C0020v) aVar;
            int i5 = c0020v.f455i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0020v.f455i = i5 - Integer.MIN_VALUE;
                Object obj = c0020v.f454h;
                W1.a aVar2 = W1.a.f4608d;
                i3 = c0020v.f455i;
                if (i3 != 0) {
                    R1.a.e(obj);
                    EnumC0712j enumC0712j = EnumC0712j.f7296e;
                    c0020v.f453g = c0700a;
                    c0020v.f455i = 1;
                    obj = c0700a.b(enumC0712j, c0020v);
                    if (obj == aVar2) {
                    }
                    C0711i c0711i = (C0711i) obj;
                    ?? r22 = c0711i.f7292a;
                    size = r22.size();
                    i4 = 0;
                    while (i4 < size) {
                    }
                    return c0711i;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0700a = c0020v.f453g;
                R1.a.e(obj);
                C0711i c0711i2 = (C0711i) obj;
                ?? r222 = c0711i2.f7292a;
                size = r222.size();
                i4 = 0;
                while (i4 < size) {
                    if (n0.q.a((n0.s) r222.get(i4))) {
                        i4++;
                    } else {
                        EnumC0712j enumC0712j2 = EnumC0712j.f7296e;
                        c0020v.f453g = c0700a;
                        c0020v.f455i = 1;
                        obj = c0700a.b(enumC0712j2, c0020v);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        C0711i c0711i22 = (C0711i) obj;
                        ?? r2222 = c0711i22.f7292a;
                        size = r2222.size();
                        i4 = 0;
                        while (i4 < size) {
                        }
                    }
                }
                return c0711i22;
            }
        }
        c0020v = new C0020v(aVar);
        Object obj2 = c0020v.f454h;
        W1.a aVar22 = W1.a.f4608d;
        i3 = c0020v.f455i;
        if (i3 != 0) {
        }
    }

    public static final void L(J2.a aVar, J2.c cVar, String str) {
        J2.e.f3200i.fine(cVar.f3192b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f3185a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object M(C0700A c0700a, Y y3, C0011l c0011l, C0711i c0711i, X1.a aVar) {
        C0021w c0021w;
        int i3;
        int i4;
        a0 a0Var;
        boolean z3;
        int i5;
        Q q3;
        C0700A c0700a2 = c0700a;
        Y y4 = y3;
        if (aVar instanceof C0021w) {
            c0021w = (C0021w) aVar;
            int i6 = c0021w.f459j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0021w.f459j = i6 - Integer.MIN_VALUE;
                C0021w c0021w2 = c0021w;
                Object obj = c0021w2.f458i;
                W1.a aVar2 = W1.a.f4608d;
                i3 = c0021w2.f459j;
                if (i3 == 0) {
                    if (i3 == 1) {
                        Y y5 = c0021w2.f457h;
                        C0700A c0700a3 = c0021w2.f456g;
                        R1.a.e(obj);
                        if (((Boolean) obj).booleanValue()) {
                            ?? r12 = c0700a3.f7256h.f7264v.f7292a;
                            int size = r12.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                n0.s sVar = (n0.s) r12.get(i7);
                                if (n0.q.b(sVar)) {
                                    sVar.a();
                                }
                            }
                        }
                        y5.getClass();
                        return y.f4171a;
                    }
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Y y6 = c0021w2.f457h;
                    C0700A c0700a4 = c0021w2.f456g;
                    R1.a.e(obj);
                    y4 = y6;
                    c0700a2 = c0700a4;
                    i5 = 0;
                    if (((Boolean) obj).booleanValue()) {
                        ?? r02 = c0700a2.f7256h.f7264v.f7292a;
                        int size2 = r02.size();
                        for (int i8 = i5; i8 < size2; i8++) {
                            n0.s sVar2 = (n0.s) r02.get(i8);
                            if (n0.q.b(sVar2)) {
                                sVar2.a();
                            }
                        }
                    }
                    y4.getClass();
                    return y.f4171a;
                }
                R1.a.e(obj);
                n0.s sVar3 = (n0.s) c0011l.f423g;
                n0.s sVar4 = (n0.s) c0711i.f7292a.get(0);
                if (sVar3 != null) {
                    long j3 = sVar4.f7309b - sVar3.f7309b;
                    O0 o02 = (O0) c0011l.f422f;
                    if (j3 < o02.e()) {
                        float f3 = C.f7486a;
                        if (C0238c.c(C0238c.g(sVar3.f7310c, sVar4.f7310c)) >= (n0.q.e(sVar3.f7316i, 2) ? o02.a() * C.f7486a : o02.a())) {
                            i4 = 1;
                            c0011l.f421e = i4;
                            c0011l.f423g = sVar4;
                            n0.s sVar5 = (n0.s) c0711i.f7292a.get(0);
                            int i9 = c0011l.f421e;
                            r rVar = i9 != i4 ? i9 != 2 ? C0017s.f443f : C0017s.f442e : C0017s.f441d;
                            long j4 = sVar5.f7310c;
                            a0Var = (a0) y4.f334d;
                            if (a0Var.h()) {
                            }
                            z3 = false;
                            if (z3) {
                            }
                            return y.f4171a;
                        }
                        i4 = 1;
                        c0011l.f421e++;
                        c0011l.f423g = sVar4;
                        n0.s sVar52 = (n0.s) c0711i.f7292a.get(0);
                        int i92 = c0011l.f421e;
                        r rVar2 = i92 != i4 ? i92 != 2 ? C0017s.f443f : C0017s.f442e : C0017s.f441d;
                        long j42 = sVar52.f7310c;
                        a0Var = (a0) y4.f334d;
                        if (a0Var.h() || a0Var.j().f3097a.f596a.length() == 0 || (q3 = a0Var.f345d) == null || q3.d() == null) {
                            z3 = false;
                        } else {
                            p pVar = a0Var.f350i;
                            if (pVar != null) {
                                pVar.a(Z.i.f4681i);
                            }
                            a0Var.f353l = j42;
                            a0Var.f358q = -1;
                            a0Var.f(true);
                            y3.t(a0Var.j(), a0Var.f353l, true, rVar2);
                            z3 = true;
                        }
                        if (z3) {
                            i5 = 0;
                            C0022x c0022x = new C0022x(y4, i5, rVar2);
                            c0021w2.f456g = c0700a2;
                            c0021w2.f457h = y4;
                            c0021w2.f459j = 2;
                            obj = C.c(c0700a2, sVar52.f7308a, c0022x, c0021w2);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                            y4.getClass();
                        }
                        return y.f4171a;
                    }
                }
                i4 = 1;
                c0011l.f421e = i4;
                c0011l.f423g = sVar4;
                n0.s sVar522 = (n0.s) c0711i.f7292a.get(0);
                int i922 = c0011l.f421e;
                r rVar22 = i922 != i4 ? i922 != 2 ? C0017s.f443f : C0017s.f442e : C0017s.f441d;
                long j422 = sVar522.f7310c;
                a0Var = (a0) y4.f334d;
                if (a0Var.h()) {
                }
                z3 = false;
                if (z3) {
                }
                return y.f4171a;
            }
        }
        c0021w = new C0021w(aVar);
        C0021w c0021w22 = c0021w;
        Object obj2 = c0021w22.f458i;
        W1.a aVar22 = W1.a.f4608d;
        i3 = c0021w22.f459j;
        if (i3 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00b2, B:15:0x00ba, B:17:0x00c6, B:19:0x00d2, B:21:0x00d5, B:24:0x00d7, B:28:0x00db, B:32:0x0041, B:34:0x0065, B:36:0x0069, B:38:0x0079, B:39:0x0085, B:43:0x0098, B:48:0x0081, B:50:0x004b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db A[Catch: CancellationException -> 0x0030, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00b2, B:15:0x00ba, B:17:0x00c6, B:19:0x00d2, B:21:0x00d5, B:24:0x00d7, B:28:0x00db, B:32:0x0041, B:34:0x0065, B:36:0x0069, B:38:0x0079, B:39:0x0085, B:43:0x0098, B:48:0x0081, B:50:0x004b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:12:0x002b, B:13:0x00b2, B:15:0x00ba, B:17:0x00c6, B:19:0x00d2, B:21:0x00d5, B:24:0x00d7, B:28:0x00db, B:32:0x0041, B:34:0x0065, B:36:0x0069, B:38:0x0079, B:39:0x0085, B:43:0x0098, B:48:0x0081, B:50:0x004b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object N(C0700A c0700a, Z z3, C0711i c0711i, X1.a aVar) {
        A a3;
        int i3;
        n0.s sVar;
        n0.s sVar2;
        int i4 = 0;
        try {
            if (aVar instanceof A) {
                a3 = (A) aVar;
                int i5 = a3.f265k;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    a3.f265k = i5 - Integer.MIN_VALUE;
                    Object obj = a3.f264j;
                    W1.a aVar2 = W1.a.f4608d;
                    i3 = a3.f265k;
                    if (i3 != 0) {
                        R1.a.e(obj);
                        sVar = (n0.s) S1.l.K0(c0711i.f7292a);
                        long j3 = sVar.f7308a;
                        a3.f261g = c0700a;
                        a3.f262h = z3;
                        a3.f263i = sVar;
                        a3.f265k = 1;
                        obj = C.b(c0700a, j3, a3);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            z3 = a3.f262h;
                            c0700a = a3.f261g;
                            R1.a.e(obj);
                            if (((Boolean) obj).booleanValue()) {
                                z3.onCancel();
                            } else {
                                ?? r11 = c0700a.f7256h.f7264v.f7292a;
                                int size = r11.size();
                                while (i4 < size) {
                                    n0.s sVar3 = (n0.s) r11.get(i4);
                                    if (n0.q.b(sVar3)) {
                                        sVar3.a();
                                    }
                                    i4++;
                                }
                                z3.a();
                            }
                            return y.f4171a;
                        }
                        n0.s sVar4 = a3.f263i;
                        z3 = a3.f262h;
                        C0700A c0700a2 = a3.f261g;
                        R1.a.e(obj);
                        sVar = sVar4;
                        c0700a = c0700a2;
                    }
                    sVar2 = (n0.s) obj;
                    if (sVar2 != null) {
                        long j4 = sVar2.f7310c;
                        O0 e3 = c0700a.e();
                        int i6 = sVar.f7316i;
                        float f3 = C.f7486a;
                        if (C0238c.c(C0238c.g(sVar.f7310c, j4)) < (n0.q.e(i6, 2) ? e3.a() * C.f7486a : e3.a())) {
                            z3.c(j4);
                            long j5 = sVar2.f7308a;
                            B.B b3 = new B.B(z3, i4);
                            a3.f261g = c0700a;
                            a3.f262h = z3;
                            a3.f263i = null;
                            a3.f265k = 2;
                            obj = C.c(c0700a, j5, b3, a3);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                    }
                    return y.f4171a;
                }
            }
            if (i3 != 0) {
            }
            sVar2 = (n0.s) obj;
            if (sVar2 != null) {
            }
            return y.f4171a;
        } catch (CancellationException e4) {
            z3.onCancel();
            throw e4;
        }
        a3 = new A(aVar);
        Object obj2 = a3.f264j;
        W1.a aVar22 = W1.a.f4608d;
        i3 = a3.f265k;
    }

    public static final boolean O(int i3, int i4, int i5, byte[] bArr, byte[] bArr2) {
        f2.j.f(bArr, "a");
        f2.j.f(bArr2, "b");
        for (int i6 = 0; i6 < i5; i6++) {
            if (bArr[i6 + i3] != bArr2[i6 + i4]) {
                return false;
            }
        }
        return true;
    }

    public static T1.b P(T1.b bVar) {
        bVar.k();
        bVar.f4346f = true;
        return bVar.f4345e > 0 ? bVar : T1.b.f4343g;
    }

    public static final A2.h Q(String str, AbstractC0235a abstractC0235a, SerialDescriptor[] serialDescriptorArr, InterfaceC0424c interfaceC0424c) {
        f2.j.f(str, "serialName");
        f2.j.f(interfaceC0424c, "builder");
        if (AbstractC0730j.K(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (abstractC0235a.equals(A2.k.f257c)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        A2.a aVar = new A2.a(str);
        interfaceC0424c.n(aVar);
        return new A2.h(str, abstractC0235a, aVar.f224b.size(), S1.k.w0(serialDescriptorArr), aVar);
    }

    public static final void R(long j3, long j4, long j5) {
        if ((j4 | j5) < 0 || j4 > j3 || j3 - j4 < j5) {
            throw new ArrayIndexOutOfBoundsException("size=" + j3 + " offset=" + j4 + " byteCount=" + j5);
        }
    }

    public static final long S(long j3, int i3) {
        int i4 = J.f568c;
        int i5 = (int) (j3 >> 32);
        int y3 = d.y(i5, 0, i3);
        int i6 = (int) (4294967295L & j3);
        int y4 = d.y(i6, 0, i3);
        return (y3 == i5 && y4 == i6) ? j3 : J(y3, y4);
    }

    public static int T(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r7 == r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if (r8 != (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress W(int i3, int i4, String str) {
        int i5;
        int i6;
        int i7;
        int i8 = 16;
        byte[] bArr = new byte[16];
        boolean z3 = false;
        int i9 = i3;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            if (i9 >= i4) {
                i5 = i8;
                break;
            }
            if (i10 != i8) {
                int i13 = i9 + 2;
                if (i13 <= i4 && AbstractC0737q.y(str, "::", i9, z3)) {
                    if (i11 == -1) {
                        i10 += 2;
                        if (i13 != i4) {
                            i11 = i10;
                            i12 = i13;
                            i9 = i12;
                            int i14 = 0;
                            while (i9 < i4) {
                            }
                            i7 = i9 - i12;
                            if (i7 == 0) {
                                break;
                            }
                            break;
                        }
                        i5 = i8;
                        i11 = i10;
                        break;
                    }
                    return null;
                }
                if (i10 != 0) {
                    if (!AbstractC0737q.y(str, ":", i9, z3)) {
                        if (AbstractC0737q.y(str, ".", i9, z3)) {
                            int i15 = i10 - 2;
                            int i16 = i15;
                            loop2: while (true) {
                                if (i12 < i4) {
                                    if (i16 == i8) {
                                        break;
                                    }
                                    if (i16 != i15) {
                                        if (str.charAt(i12) != '.') {
                                            break;
                                        }
                                        i12++;
                                    }
                                    ?? r14 = z3;
                                    int i17 = i12;
                                    while (i17 < i4) {
                                        char charAt = str.charAt(i17);
                                        if (f2.j.g(charAt, 48) < 0 || f2.j.g(charAt, 57) > 0) {
                                            break;
                                        }
                                        if ((r14 == 0 && i12 != i17) || (i6 = ((r14 * 10) + charAt) - 48) > 255) {
                                            break loop2;
                                        }
                                        i17++;
                                        r14 = i6;
                                    }
                                    if (i17 - i12 == 0) {
                                        break;
                                    }
                                    bArr[i16] = (byte) r14;
                                    i16++;
                                    i12 = i17;
                                    i8 = 16;
                                    z3 = false;
                                } else if (i16 == i10 + 2) {
                                    i10 += 2;
                                    i5 = 16;
                                }
                            }
                        }
                        return null;
                    }
                    i9++;
                }
                i12 = i9;
                i9 = i12;
                int i142 = 0;
                while (i9 < i4) {
                    int q3 = H2.b.q(str.charAt(i9));
                    if (q3 == -1) {
                        break;
                    }
                    i142 = (i142 << 4) + q3;
                    i9++;
                }
                i7 = i9 - i12;
                if (i7 == 0 || i7 > 4) {
                    break;
                }
                int i18 = i10 + 1;
                bArr[i10] = (byte) ((i142 >>> 8) & 255);
                i10 += 2;
                bArr[i18] = (byte) (i142 & 255);
                i8 = 16;
                z3 = false;
            } else {
                return null;
            }
        }
        return null;
    }

    public static boolean Y(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        int i3 = AbstractC0394s.f5610a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = c1.r.f5606d;
        c1.r rVar = (c1.r) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (rVar == null) {
            rVar = new c1.r();
            rVar.f5607a = null;
            rVar.f5608b = null;
            rVar.f5609c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, rVar);
        }
        WeakReference weakReference2 = rVar.f5609c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        rVar.f5609c = new WeakReference(keyEvent);
        if (rVar.f5608b == null) {
            rVar.f5608b = new SparseArray();
        }
        SparseArray sparseArray = rVar.f5608b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static final boolean Z(int i3, int i4) {
        return i3 == i4;
    }

    public static final String b0(long j3) {
        String str;
        if (j3 <= -999500000) {
            str = ((j3 - 500000000) / 1000000000) + " s ";
        } else if (j3 <= -999500) {
            str = ((j3 - 500000) / 1000000) + " ms";
        } else if (j3 <= 0) {
            str = ((j3 - 500) / 1000) + " µs";
        } else if (j3 < 999500) {
            str = ((j3 + 500) / 1000) + " µs";
        } else if (j3 < 999500000) {
            str = ((j3 + 500000) / 1000000) + " ms";
        } else {
            str = ((j3 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static A.b c0(A.b bVar, O0.k kVar, K k3, O0.b bVar2, H0.d dVar) {
        if (bVar != null && kVar == bVar.f3a && f2.j.a(k3, bVar.f4b) && bVar2.a() == bVar.f5c.f3726d && dVar == bVar.f6d) {
            return bVar;
        }
        A.b bVar3 = A.b.f2h;
        if (bVar3 != null && kVar == bVar3.f3a && f2.j.a(k3, bVar3.f4b) && bVar2.a() == bVar3.f5c.f3726d && dVar == bVar3.f6d) {
            return bVar3;
        }
        A.b bVar4 = new A.b(kVar, AbstractC0235a.G(k3, kVar), new O0.c(bVar2.a(), bVar2.r()), dVar);
        A.b.f2h = bVar4;
        return bVar4;
    }

    public static G2.s d0(String str) {
        if (str.equals("http/1.0")) {
            return G2.s.f2273e;
        }
        if (str.equals("http/1.1")) {
            return G2.s.f2274f;
        }
        if (str.equals("h2_prior_knowledge")) {
            return G2.s.f2277i;
        }
        if (str.equals("h2")) {
            return G2.s.f2276h;
        }
        if (str.equals("spdy/3.1")) {
            return G2.s.f2275g;
        }
        if (str.equals("quic")) {
            return G2.s.f2278j;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static final int e0(int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i3 >= i4) {
                return i4;
            }
            int i6 = i4 % i5;
            if (i6 < 0) {
                i6 += i5;
            }
            int i7 = i3 % i5;
            if (i7 < 0) {
                i7 += i5;
            }
            int i8 = (i6 - i7) % i5;
            if (i8 < 0) {
                i8 += i5;
            }
            return i4 - i8;
        }
        if (i5 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i3 <= i4) {
            return i4;
        }
        int i9 = -i5;
        int i10 = i3 % i9;
        if (i10 < 0) {
            i10 += i9;
        }
        int i11 = i4 % i9;
        if (i11 < 0) {
            i11 += i9;
        }
        int i12 = (i10 - i11) % i9;
        if (i12 < 0) {
            i12 += i9;
        }
        return i4 + i12;
    }

    public static final long f0(double d3) {
        return q0(4294967296L, (float) d3);
    }

    public static final long g0(int i3) {
        return q0(4294967296L, i3);
    }

    public static final int h0(int i3, int i4) {
        return (i3 >> i4) & 31;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final boolean i0(C0711i c0711i) {
        ?? r5 = c0711i.f7292a;
        int size = r5.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (!n0.q.e(((n0.s) r5.get(i3)).f7316i, 2)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean j0(C0240e c0240e) {
        float b3 = AbstractC0236a.b(c0240e.f4732e);
        long j3 = c0240e.f4732e;
        if (b3 == AbstractC0236a.c(j3)) {
            float b4 = AbstractC0236a.b(j3);
            long j4 = c0240e.f4733f;
            if (b4 == AbstractC0236a.b(j4) && AbstractC0236a.b(j3) == AbstractC0236a.c(j4)) {
                float b5 = AbstractC0236a.b(j3);
                long j5 = c0240e.f4734g;
                if (b5 == AbstractC0236a.b(j5) && AbstractC0236a.b(j3) == AbstractC0236a.c(j5)) {
                    float b6 = AbstractC0236a.b(j3);
                    long j6 = c0240e.f4735h;
                    if (b6 == AbstractC0236a.b(j6) && AbstractC0236a.b(j3) == AbstractC0236a.c(j6)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean k0(long j3) {
        O0.n[] nVarArr = O0.m.f3745b;
        return (j3 & 1095216660480L) == 0;
    }

    public static List l0(Object obj) {
        List singletonList = Collections.singletonList(obj);
        f2.j.e(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static final long m0(long j3, float f3) {
        return (Float.isNaN(f3) || f3 >= 1.0f) ? j3 : C0352v.b(j3, C0352v.d(j3) * f3);
    }

    public static final long q0(long j3, float f3) {
        long floatToIntBits = j3 | (Float.floatToIntBits(f3) & 4294967295L);
        O0.n[] nVarArr = O0.m.f3745b;
        return floatToIntBits;
    }

    public static String r0(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        C0234i c0234i = C0234i.f4410g;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        f2.j.e(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i3 = 0;
        R(encoded.length, 0, length);
        byte[] p02 = S1.k.p0(encoded, 0, length);
        C0234i c0234i2 = new C0234i(p02);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(p02, 0, c0234i2.b());
        byte[] digest = messageDigest.digest();
        f2.j.c(digest);
        new C0234i(digest);
        byte[] bArr = AbstractC0226a.f4393a;
        f2.j.f(bArr, "map");
        byte[] bArr2 = new byte[((digest.length + 2) / 3) * 4];
        int length2 = digest.length - (digest.length % 3);
        int i4 = 0;
        while (i3 < length2) {
            byte b3 = digest[i3];
            int i5 = i3 + 2;
            byte b4 = digest[i3 + 1];
            i3 += 3;
            byte b5 = digest[i5];
            bArr2[i4] = bArr[(b3 & 255) >> 2];
            bArr2[i4 + 1] = bArr[((b3 & 3) << 4) | ((b4 & 255) >> 4)];
            int i6 = i4 + 3;
            bArr2[i4 + 2] = bArr[((b4 & 15) << 2) | ((b5 & 255) >> 6)];
            i4 += 4;
            bArr2[i6] = bArr[b5 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b6 = digest[i3];
            bArr2[i4] = bArr[(b6 & 255) >> 2];
            bArr2[1 + i4] = bArr[(b6 & 3) << 4];
            bArr2[2 + i4] = 61;
            bArr2[i4 + 3] = 61;
        } else if (length3 == 2) {
            int i7 = i3 + 1;
            byte b7 = digest[i3];
            byte b8 = digest[i7];
            bArr2[i4] = bArr[(b7 & 255) >> 2];
            bArr2[1 + i4] = bArr[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            bArr2[i4 + 2] = bArr[(b8 & 15) << 2];
            bArr2[i4 + 3] = 61;
        }
        sb.append(new String(bArr2, AbstractC0721a.f7347a));
        return sb.toString();
    }

    public static final R.i t0(C0167p c0167p) {
        c0167p.Q(-796080049);
        R.i iVar = (R.i) d.c0(new Object[0], R.i.f4026d, R.j.f4030f, c0167p, 3072, 4);
        iVar.f4029c = (R.k) c0167p.k(R.m.f4036a);
        c0167p.p(false);
        return iVar;
    }

    public static void u0(EditorInfo editorInfo, CharSequence charSequence) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            AbstractC0433a.a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i3 >= 30) {
            AbstractC0433a.a(editorInfo, charSequence);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i5 = editorInfo.initialSelEnd;
        int i6 = i4 > i5 ? i5 : i4;
        if (i4 <= i5) {
            i4 = i5;
        }
        int length = charSequence.length();
        if (i6 < 0 || i4 > length) {
            v0(editorInfo, null, 0, 0);
            return;
        }
        int i7 = editorInfo.inputType & 4095;
        if (i7 == 129 || i7 == 225 || i7 == 18) {
            v0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            v0(editorInfo, charSequence, i6, i4);
            return;
        }
        int i8 = i4 - i6;
        int i9 = i8 > 1024 ? 0 : i8;
        int i10 = 2048 - i9;
        int min = Math.min(charSequence.length() - i4, i10 - Math.min(i6, (int) (i10 * 0.8d)));
        int min2 = Math.min(i6, i10 - min);
        int i11 = i6 - min2;
        if (Character.isLowSurrogate(charSequence.charAt(i11))) {
            i11++;
            min2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i4 + min) - 1))) {
            min--;
        }
        int i12 = min2 + i9;
        v0(editorInfo, i9 != i8 ? TextUtils.concat(charSequence.subSequence(i11, i11 + min2), charSequence.subSequence(i4, min + i4)) : charSequence.subSequence(i11, i12 + min + i11), min2, i12);
    }

    public static void v0(EditorInfo editorInfo, CharSequence charSequence, int i3, int i4) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i3);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i4);
    }

    public static final String w0(String str) {
        f2.j.f(str, "<this>");
        int i3 = 0;
        int i4 = -1;
        if (!AbstractC0730j.C(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                f2.j.e(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                f2.j.e(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                f2.j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i5 = 0; i5 < length; i5++) {
                    char charAt = lowerCase.charAt(i5);
                    if (f2.j.g(charAt, 31) <= 0 || f2.j.g(charAt, 127) >= 0 || AbstractC0730j.H(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress W2 = (AbstractC0737q.z(str, "[") && AbstractC0737q.r(str, "]", false)) ? W(1, str.length() - 1, str) : W(0, str.length(), str);
        if (W2 == null) {
            return null;
        }
        byte[] address = W2.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return W2.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < address.length) {
            int i8 = i6;
            while (i8 < 16 && address[i8] == 0 && address[i8 + 1] == 0) {
                i8 += 2;
            }
            int i9 = i8 - i6;
            if (i9 > i7 && i9 >= 4) {
                i4 = i6;
                i7 = i9;
            }
            i6 = i8 + 2;
        }
        C0231f c0231f = new C0231f();
        while (i3 < address.length) {
            if (i3 == i4) {
                c0231f.E(58);
                i3 += i7;
                if (i3 == 16) {
                    c0231f.E(58);
                }
            } else {
                if (i3 > 0) {
                    c0231f.E(58);
                }
                byte b3 = address[i3];
                byte[] bArr = H2.b.f2632a;
                c0231f.F(((b3 & 255) << 8) | (address[i3 + 1] & 255));
                i3 += 2;
            }
        }
        return c0231f.u(c0231f.f4409e, AbstractC0721a.f7347a);
    }

    @Override // B2.a
    public int A(C2.Q q3, int i3) {
        f2.j.f(q3, "descriptor");
        return i();
    }

    @Override // E0.e
    public int B(int i3) {
        int n02 = n0(i3);
        if (n02 == -1 || n0(n02) == -1) {
            return -1;
        }
        return n02;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double C() {
        X();
        throw null;
    }

    @Override // E0.e
    public int D(int i3) {
        int s02 = s0(i3);
        if (s02 == -1 || s0(s02) == -1) {
            return -1;
        }
        return s02;
    }

    @Override // B2.a
    public Decoder E(C2.Q q3, int i3) {
        f2.j.f(q3, "descriptor");
        return b(q3.h(i3));
    }

    public abstract Typeface U(Context context, C0243b[] c0243bArr);

    public Typeface V(Context context, InputStream inputStream) {
        File file;
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
            for (int i3 = 0; i3 < 100; i3++) {
                file = new File(cacheDir, str + i3);
                if (file.createNewFile()) {
                    break;
                }
            }
        }
        file = null;
        if (file == null) {
            return null;
        }
        try {
            if (AbstractC0235a.r(file, inputStream)) {
                return Typeface.createFromFile(file.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            file.delete();
        }
    }

    public void X() {
        throw new z2.c(v.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public B2.a a(SerialDescriptor serialDescriptor) {
        f2.j.f(serialDescriptor, "descriptor");
        return this;
    }

    public C0243b a0(C0243b[] c0243bArr) {
        C0243b c0243b = null;
        int i3 = Integer.MAX_VALUE;
        for (C0243b c0243b2 : c0243bArr) {
            int abs = (c0243b2.f4741d ? 1 : 0) + (Math.abs(c0243b2.f4740c - 400) * 2);
            if (c0243b == null || i3 > abs) {
                c0243b = c0243b2;
                i3 = abs;
            }
        }
        return c0243b;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder b(SerialDescriptor serialDescriptor) {
        f2.j.f(serialDescriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long c();

    @Override // B2.a
    public Object d(SerialDescriptor serialDescriptor, int i3, String str) {
        C2.a0 a0Var = C2.a0.f733a;
        f2.j.f(serialDescriptor, "descriptor");
        C2.a0.f734b.getClass();
        if (j()) {
            return f(a0Var);
        }
        return null;
    }

    @Override // B2.a
    public boolean e(C2.Q q3, int i3) {
        f2.j.f(q3, "descriptor");
        return h();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Object f(KSerializer kSerializer) {
        f2.j.f(kSerializer, "deserializer");
        return kSerializer.deserialize(this);
    }

    public Object g(SerialDescriptor serialDescriptor, int i3, KSerializer kSerializer, Object obj) {
        f2.j.f(serialDescriptor, "descriptor");
        f2.j.f(kSerializer, "deserializer");
        return f(kSerializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean h() {
        X();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int i();

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean j() {
        return true;
    }

    @Override // B2.a
    public char k(C2.Q q3, int i3) {
        f2.j.f(q3, "descriptor");
        return n();
    }

    @Override // B2.a
    public float l(C2.Q q3, int i3) {
        f2.j.f(q3, "descriptor");
        return u();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char n() {
        X();
        throw null;
    }

    public abstract int n0(int i3);

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte o();

    public abstract void o0(Throwable th);

    @Override // B2.a
    public long p(C2.Q q3, int i3) {
        f2.j.f(q3, "descriptor");
        return c();
    }

    public abstract void p0(G1.g gVar);

    @Override // B2.a
    public double q(C2.Q q3, int i3) {
        f2.j.f(q3, "descriptor");
        return C();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short s();

    public abstract int s0(int i3);

    @Override // kotlinx.serialization.encoding.Decoder
    public String t() {
        X();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float u() {
        X();
        throw null;
    }

    @Override // E0.e
    public int v(int i3) {
        return s0(i3);
    }

    @Override // E0.e
    public int w(int i3) {
        return n0(i3);
    }

    @Override // B2.a
    public short x(C2.Q q3, int i3) {
        f2.j.f(q3, "descriptor");
        return s();
    }

    @Override // B2.a
    public byte y(C2.Q q3, int i3) {
        f2.j.f(q3, "descriptor");
        return o();
    }

    public void z(SerialDescriptor serialDescriptor) {
        f2.j.f(serialDescriptor, "descriptor");
    }
}
