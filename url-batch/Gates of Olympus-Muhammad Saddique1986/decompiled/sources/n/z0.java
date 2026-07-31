package n;

import B.C0022x;
import F.C0114p0;
import F.v1;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import a0.C0239d;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import n2.AbstractC0730j;
import o.C0739a;
import o2.EnumC0748c;
import p.C0775m;
import p.InterfaceC0778n0;
import r.AbstractC0868o;
import r0.InterfaceC0885G;
import s.C0939h;
import t0.AbstractC0993f;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import t0.InterfaceC0999l;
import t1.C1013A;
import u.C1082i;
import u.C1083j;
import u.InterfaceC1074a;
import u0.AbstractC1101g0;

/* loaded from: classes.dex */
public abstract class z0 {
    public static final void a(o.n nVar, InterfaceC0422a interfaceC0422a, U.q qVar, C0022x c0022x, C0167p c0167p, int i3) {
        int i4;
        U.q qVar2;
        c0167p.S(645832757);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(nVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(interfaceC0422a) ? 32 : 16;
        }
        int i5 = i4 | 384;
        if ((i3 & 3072) == 0) {
            i5 |= c0167p.h(c0022x) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && c0167p.x()) {
            c0167p.L();
            qVar2 = qVar;
        } else {
            U.n nVar2 = U.n.f4488a;
            o.m mVar = (o.m) nVar.f7419a.getValue();
            if (!(mVar instanceof o.l)) {
                C0173s0 r3 = c0167p.r();
                if (r3 != null) {
                    r3.f2906d = new C0739a(nVar, interfaceC0422a, nVar2, c0022x, i3, 0);
                    return;
                }
                return;
            }
            boolean f3 = c0167p.f(mVar);
            Object G3 = c0167p.G();
            if (f3 || G3 == C0159l.f2829a) {
                G3 = new o.g(l0.c.K(((o.l) mVar).f7418a));
                c0167p.a0(G3);
            }
            o.p.c((o.g) G3, interfaceC0422a, nVar2, c0022x, c0167p, i5 & 8176);
            qVar2 = nVar2;
        }
        C0173s0 r4 = c0167p.r();
        if (r4 != null) {
            r4.f2906d = new C0739a(nVar, interfaceC0422a, qVar2, c0022x, i3, 1);
        }
    }

    public static final void b(o.n nVar, InterfaceC0422a interfaceC0422a, C0022x c0022x, U.q qVar, boolean z3, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        U.q qVar2;
        c0167p.S(-84584070);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(nVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(interfaceC0422a) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(c0022x) ? 256 : 128;
        }
        int i5 = i4 | 3072;
        if ((i3 & 24576) == 0) {
            i5 |= c0167p.g(z3) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= c0167p.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i5) == 74898 && c0167p.x()) {
            c0167p.L();
            qVar2 = qVar;
        } else {
            U.n nVar2 = U.n.f4488a;
            U.q a3 = z3 ? n0.w.a(nVar2, o.f.f7394a, new o.d(nVar, null)) : nVar2;
            InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4461d, true);
            int i6 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            U.q d3 = U.a.d(c0167p, a3);
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
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i6))) {
                A.k.o(i6, c0167p, i6, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            aVar.h(c0167p, Integer.valueOf((i5 >> 15) & 14));
            a(nVar, interfaceC0422a, null, c0022x, c0167p, (i5 & 126) | ((i5 << 3) & 7168));
            c0167p.p(true);
            qVar2 = nVar2;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0114p0(nVar, interfaceC0422a, c0022x, qVar2, z3, aVar, i3);
        }
    }

    public static final void c(C1013A c1013a, String str, U.q qVar, U.d dVar, String str2, InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2, InterfaceC0424c interfaceC0424c3, InterfaceC0424c interfaceC0424c4, InterfaceC0424c interfaceC0424c5, InterfaceC0424c interfaceC0424c6, C0167p c0167p, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        U.d dVar2;
        String str3;
        InterfaceC0424c interfaceC0424c7;
        InterfaceC0424c interfaceC0424c8;
        InterfaceC0424c interfaceC0424c9;
        InterfaceC0424c interfaceC0424c10;
        InterfaceC0424c interfaceC0424c11;
        U.d dVar3;
        InterfaceC0424c interfaceC0424c12;
        InterfaceC0424c interfaceC0424c13;
        InterfaceC0424c interfaceC0424c14;
        InterfaceC0424c interfaceC0424c15;
        InterfaceC0424c interfaceC0424c16;
        String str4;
        c0167p.S(1840250294);
        if ((i3 & 6) == 0) {
            i5 = (c0167p.h(c1013a) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0167p.f(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= c0167p.f(qVar) ? 256 : 128;
        }
        int i8 = 1797120 | i5;
        if ((12582912 & i3) == 0) {
            i8 = 5991424 | i5;
        }
        if ((100663296 & i3) == 0) {
            i8 |= 33554432;
        }
        int i9 = 805306368 | i8;
        if ((i4 & 6) == 0) {
            i6 = i4 | (c0167p.h(interfaceC0424c6) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((306783379 & i9) == 306783378 && (i6 & 3) == 2 && c0167p.x()) {
            c0167p.L();
            dVar3 = dVar;
            str4 = str2;
            interfaceC0424c12 = interfaceC0424c;
            interfaceC0424c13 = interfaceC0424c2;
            interfaceC0424c14 = interfaceC0424c3;
            interfaceC0424c15 = interfaceC0424c4;
            interfaceC0424c16 = interfaceC0424c5;
        } else {
            c0167p.N();
            if ((i3 & 1) == 0 || c0167p.w()) {
                i7 = i9 & (-264241153);
                dVar2 = U.b.f4461d;
                str3 = null;
                interfaceC0424c7 = null;
                interfaceC0424c8 = u1.x.f9658g;
                interfaceC0424c9 = interfaceC0424c8;
                interfaceC0424c10 = u1.x.f9659h;
                interfaceC0424c11 = interfaceC0424c10;
            } else {
                c0167p.L();
                i7 = i9 & (-264241153);
                dVar2 = dVar;
                str3 = str2;
                interfaceC0424c8 = interfaceC0424c;
                interfaceC0424c10 = interfaceC0424c2;
                interfaceC0424c9 = interfaceC0424c3;
                interfaceC0424c11 = interfaceC0424c4;
                interfaceC0424c7 = interfaceC0424c5;
            }
            c0167p.q();
            boolean z3 = ((i7 & 112) == 32) | ((i7 & 57344) == 16384) | ((i6 & 14) == 4);
            Object G3 = c0167p.G();
            if (z3 || G3 == C0159l.f2829a) {
                t1.y yVar = new t1.y(c1013a.f8827v, str, str3);
                interfaceC0424c6.n(yVar);
                G3 = yVar.c();
                c0167p.a0(G3);
            }
            t1.x xVar = (t1.x) G3;
            int i10 = i7 & 8078;
            int i11 = i7 >> 3;
            String str5 = str3;
            d(c1013a, xVar, qVar, dVar2, interfaceC0424c8, interfaceC0424c10, interfaceC0424c9, interfaceC0424c11, interfaceC0424c7, c0167p, (57344 & i11) | i10 | (458752 & i11) | (i11 & 234881024));
            dVar3 = dVar2;
            interfaceC0424c12 = interfaceC0424c8;
            interfaceC0424c13 = interfaceC0424c10;
            interfaceC0424c14 = interfaceC0424c9;
            interfaceC0424c15 = interfaceC0424c11;
            interfaceC0424c16 = interfaceC0424c7;
            str4 = str5;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new u1.r(c1013a, str, qVar, dVar3, str4, interfaceC0424c12, interfaceC0424c13, interfaceC0424c14, interfaceC0424c15, interfaceC0424c16, interfaceC0424c6, i3, i4);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v39 ??, still in use, count: 1, list:
          (r5v39 ?? I:java.lang.Object) from 0x0967: INVOKE (r44v0 ?? I:I.p), (r5v39 ?? I:java.lang.Object) VIRTUAL call: I.p.a0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:320)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void d(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v39 ??, still in use, count: 1, list:
          (r5v39 ?? I:java.lang.Object) from 0x0967: INVOKE (r44v0 ?? I:I.p), (r5v39 ?? I:java.lang.Object) VIRTUAL call: I.p.a0(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:320)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public static final boolean e(InterfaceC0142c0 interfaceC0142c0) {
        return ((Boolean) interfaceC0142c0.getValue()).booleanValue();
    }

    public static final void f(C0939h c0939h, Object obj, int i3, Object obj2, C0167p c0167p, int i4) {
        int i5;
        c0167p.S(1439843069);
        if ((i4 & 6) == 0) {
            i5 = (c0167p.f(c0939h) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0167p.f(obj) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0167p.d(i3) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0167p.f(obj2) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && c0167p.x()) {
            c0167p.L();
        } else {
            ((R.c) obj).e(obj2, Q.f.b(980966366, new v1(i3, obj2, c0939h), c0167p), c0167p, 48);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new t.s(c0939h, obj, i3, obj2, i4);
        }
    }

    public static final boolean g(C0239d c0239d, float f3, float f4) {
        return f3 <= c0239d.f4726c && c0239d.f4724a <= f3 && f4 <= c0239d.f4727d && c0239d.f4725b <= f4;
    }

    public static final double h(double d3, EnumC0748c enumC0748c, EnumC0748c enumC0748c2) {
        f2.j.f(enumC0748c2, "targetUnit");
        long convert = enumC0748c2.f7452d.convert(1L, enumC0748c.f7452d);
        return convert > 0 ? d3 * convert : d3 / r8.convert(1L, r9);
    }

    public static androidx.lifecycle.V i(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            f2.j.e(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (androidx.lifecycle.V) newInstance;
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        }
    }

    public static boolean j(String str, String str2) {
        f2.j.f(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i3 < str.length()) {
                    char charAt = str.charAt(i3);
                    int i6 = i5 + 1;
                    if (i5 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i4 - 1 == 0 && i5 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i4++;
                    }
                    i3++;
                    i5 = i6;
                } else if (i4 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return f2.j.a(AbstractC0730j.Y(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final ArrayList k(Map map, InterfaceC0424c interfaceC0424c) {
        f2.j.f(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() != null) {
                throw new ClassCastException();
            }
            f2.j.c(null);
            throw null;
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) interfaceC0424c.n((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Object l(InterfaceC0999l interfaceC0999l, C0239d c0239d, X1.c cVar) {
        InterfaceC1074a interfaceC1074a;
        Object P3;
        boolean z3 = ((U.p) interfaceC0999l).f4489d.f4501p;
        R1.y yVar = R1.y.f4171a;
        if (!z3) {
            return yVar;
        }
        t0.b0 s3 = AbstractC0993f.s(interfaceC0999l);
        if (((U.p) interfaceC0999l).f4489d.f4501p) {
            InterfaceC1074a interfaceC1074a2 = (InterfaceC1074a) AbstractC0993f.j(interfaceC0999l, C1082i.f9111s);
            if (interfaceC1074a2 == null) {
                interfaceC1074a2 = new C1083j(interfaceC0999l);
            }
            interfaceC1074a = interfaceC1074a2;
        } else {
            interfaceC1074a = null;
        }
        return (interfaceC1074a != null && (P3 = interfaceC1074a.P(s3, new B.f0(c0239d, 10, s3), cVar)) == W1.a.f4608d) ? P3 : yVar;
    }

    public static final U.q m(U.q qVar, InterfaceC0778n0 interfaceC0778n0, p.P p3, boolean z3, boolean z4, C0775m c0775m, q.k kVar, C0167p c0167p) {
        l0 l0Var;
        Context context = (Context) c0167p.k(AndroidCompositionLocals_androidKt.f4938b);
        j0 j0Var = (j0) c0167p.k(k0.f7160a);
        if (j0Var != null) {
            c0167p.Q(1586021609);
            boolean f3 = c0167p.f(context) | c0167p.f(j0Var);
            Object G3 = c0167p.G();
            if (f3 || G3 == C0159l.f2829a) {
                G3 = new C0687m(context, j0Var);
                c0167p.a0(G3);
            }
            c0167p.p(false);
            l0Var = (C0687m) G3;
        } else {
            c0167p.Q(1586120933);
            c0167p.p(false);
            l0Var = i0.f7148f;
        }
        p.P p4 = p.P.f7567d;
        U.q i3 = qVar.i(p3 == p4 ? AbstractC0658A.f7015c : AbstractC0658A.f7014b).i(l0Var.a());
        boolean z5 = !z4;
        if (((O0.k) c0167p.k(AbstractC1101g0.f9360l)) == O0.k.f3742e && p3 != p4) {
            z5 = z4;
        }
        return androidx.compose.foundation.gestures.a.b(i3, interfaceC0778n0, p3, l0Var, z3, z5, c0775m, kVar, null);
    }

    public static final void n(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void o(String str) {
        throw new IllegalStateException(str);
    }

    public static final void p(String str) {
        throw new IllegalStateException(str);
    }
}
