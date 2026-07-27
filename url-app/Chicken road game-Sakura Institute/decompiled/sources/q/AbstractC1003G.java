package q;

import A.AbstractC0017m;
import A0.C0030a;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0213n0;
import i.C0673h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import l0.C0805c;
import p0.AbstractC0954O;
import p0.C0948I;
import p0.InterfaceC0944E;
import p0.InterfaceC0945F;
import r0.C1067h;
import r0.C1069j;
import r0.InterfaceC1070k;
import z2.C1403G;

/* renamed from: q.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1003G {

    /* renamed from: a, reason: collision with root package name */
    public static final C1045x f9159a = new C1045x();

    /* JADX WARN: Removed duplicated region for block: B:65:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(S.o oVar, InterfaceC1027f interfaceC1027f, InterfaceC1029h interfaceC1029h, int i2, int i4, C1009M c1009m, O.a aVar, C0216p c0216p, int i5) {
        C1009M c1009m2;
        C1005I c1005i;
        Object obj;
        int i6;
        C1023b c1023b;
        int i7;
        int i8;
        Object obj2;
        boolean z4;
        Object obj3;
        boolean f4;
        Object I3;
        int i9;
        S.o oVar2;
        InterfaceC1029h interfaceC1029h2;
        int i10;
        int i11;
        InterfaceC1027f interfaceC1027f2;
        c0216p.U(437853230);
        int i12 = i5 | 224694;
        if ((i5 & 1572864) == 0) {
            i12 |= c0216p.h(aVar) ? 1048576 : 524288;
        }
        if ((599187 & i12) == 599186 && c0216p.z()) {
            c0216p.N();
            oVar2 = oVar;
            interfaceC1027f2 = interfaceC1027f;
            interfaceC1029h2 = interfaceC1029h;
            i11 = i2;
            i10 = i4;
            c1009m2 = c1009m;
        } else {
            S.l lVar = S.l.f3977a;
            C1023b c1023b2 = AbstractC1031j.f9265a;
            C1025d c1025d = AbstractC1031j.f9267c;
            c1009m2 = C1009M.f9195e;
            int i13 = i12 & 458752;
            boolean z5 = i13 == 131072;
            Object I4 = c0216p.I();
            Object obj4 = C0208l.f2826a;
            if (z5 || I4 == obj4) {
                I4 = new C1005I(c1009m2.f9196a, c1009m2.f9197b);
                c0216p.c0(I4);
            }
            C1005I c1005i2 = (C1005I) I4;
            int i14 = i12 >> 3;
            boolean f5 = (((i14 & 7168) ^ 3072) > 2048 && c0216p.d(Integer.MAX_VALUE)) | (((i14 & 14) ^ 6) > 4 && c0216p.f(c1023b2)) | (((i14 & 112) ^ 48) > 32 && c0216p.f(c1025d)) | (((i14 & 896) ^ 384) > 256 && c0216p.d(Integer.MAX_VALUE)) | c0216p.f(c1005i2);
            Object I5 = c0216p.I();
            if (f5 || I5 == obj4) {
                c1005i = c1005i2;
                obj = obj4;
                i6 = Integer.MAX_VALUE;
                c1023b = c1023b2;
                i7 = 131072;
                i8 = i13;
                Object c1008l = new C1008L(c1023b2, c1025d, c1023b2.a(), f9159a, c1025d.a(), Integer.MAX_VALUE, Integer.MAX_VALUE, c1005i);
                c0216p.c0(c1008l);
                I5 = c1008l;
            } else {
                c1023b = c1023b2;
                c1005i = c1005i2;
                obj = obj4;
                i6 = Integer.MAX_VALUE;
                i7 = 131072;
                i8 = i13;
            }
            C1008L c1008l2 = (C1008L) I5;
            boolean z6 = ((i12 & 3670016) == 1048576) | (i8 == i7);
            Object I6 = c0216p.I();
            if (z6) {
                obj2 = obj;
            } else {
                obj2 = obj;
                if (I6 != obj2) {
                    z4 = true;
                    obj3 = I6;
                    O.a aVar2 = new O.a(-1953651383, z4, new C0030a(9, (List) obj3));
                    f4 = c0216p.f(c1008l2);
                    I3 = c0216p.I();
                    if (!f4 || I3 == obj2) {
                        I3 = new C0948I(c1008l2);
                        c0216p.c0(I3);
                    }
                    InterfaceC0945F interfaceC0945F = (InterfaceC0945F) I3;
                    i9 = c0216p.f2861P;
                    InterfaceC0213n0 m4 = c0216p.m();
                    S.o d4 = S.a.d(c0216p, lVar);
                    InterfaceC1070k.f9822h.getClass();
                    Function0 function0 = C1069j.f9816b;
                    c0216p.W();
                    if (c0216p.f2860O) {
                        c0216p.f0();
                    } else {
                        c0216p.l(function0);
                    }
                    C0192d.R(c0216p, interfaceC0945F, C1069j.f9820f);
                    C0192d.R(c0216p, m4, C1069j.f9819e);
                    C1067h c1067h = C1069j.f9821g;
                    if (!c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i9))) {
                        AbstractC0017m.r(i9, c0216p, i9, c1067h);
                    }
                    C0192d.R(c0216p, d4, C1069j.f9818d);
                    aVar2.h(c0216p, 0);
                    c0216p.q(z4);
                    oVar2 = lVar;
                    interfaceC1029h2 = c1025d;
                    i10 = i6;
                    i11 = Integer.MAX_VALUE;
                    interfaceC1027f2 = c1023b;
                }
            }
            ArrayList arrayList = new ArrayList();
            z4 = true;
            arrayList.add(new O.a(-139531073, true, new D.A(aVar, 2)));
            Function1 function1 = c1009m2.f9198c;
            C1005I c1005i3 = c1005i;
            Function2 function2 = function1 != null ? (Function2) function1.invoke(c1005i3) : null;
            Function1 function12 = c1009m2.f9199d;
            Function2 function22 = function12 != null ? (Function2) function12.invoke(c1005i3) : null;
            int d5 = AbstractC0784j.d(2);
            if (d5 != 2) {
                if (d5 == 3) {
                    if (function2 != null) {
                        arrayList.add(function2);
                    }
                    if (function22 != null) {
                        arrayList.add(function22);
                    }
                }
            } else if (function2 != null) {
                arrayList.add(function2);
            }
            c0216p.c0(arrayList);
            obj3 = arrayList;
            O.a aVar22 = new O.a(-1953651383, z4, new C0030a(9, (List) obj3));
            f4 = c0216p.f(c1008l2);
            I3 = c0216p.I();
            if (!f4) {
            }
            I3 = new C0948I(c1008l2);
            c0216p.c0(I3);
            InterfaceC0945F interfaceC0945F2 = (InterfaceC0945F) I3;
            i9 = c0216p.f2861P;
            InterfaceC0213n0 m42 = c0216p.m();
            S.o d42 = S.a.d(c0216p, lVar);
            InterfaceC1070k.f9822h.getClass();
            Function0 function02 = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
            }
            C0192d.R(c0216p, interfaceC0945F2, C1069j.f9820f);
            C0192d.R(c0216p, m42, C1069j.f9819e);
            C1067h c1067h2 = C1069j.f9821g;
            if (!c0216p.f2860O) {
            }
            AbstractC0017m.r(i9, c0216p, i9, c1067h2);
            C0192d.R(c0216p, d42, C1069j.f9818d);
            aVar22.h(c0216p, 0);
            c0216p.q(z4);
            oVar2 = lVar;
            interfaceC1029h2 = c1025d;
            i10 = i6;
            i11 = Integer.MAX_VALUE;
            interfaceC1027f2 = c1023b;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C1000D(oVar2, interfaceC1027f2, interfaceC1029h2, i11, i10, c1009m2, aVar, i5);
        }
    }

    public static final long b(List list, L2.c cVar, L2.c cVar2, int i2, int i4, int i5, int i6, int i7, C1005I c1005i) {
        int i8;
        C0673h c0673h;
        int i9 = 0;
        if (list.isEmpty()) {
            return C0673h.a(0, 0);
        }
        int i10 = Integer.MAX_VALUE;
        C0999C c0999c = new C0999C(i6, c1005i, u3.d.a(0, i2, 0, Integer.MAX_VALUE), i7, i4, i5);
        InterfaceC0944E interfaceC0944E = (InterfaceC0944E) C1403G.s(0, list);
        int intValue = interfaceC0944E != null ? ((Number) cVar2.g(interfaceC0944E, 0, Integer.valueOf(i2))).intValue() : 0;
        int intValue2 = interfaceC0944E != null ? ((Number) cVar.g(interfaceC0944E, 0, Integer.valueOf(intValue))).intValue() : 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        if (c0999c.b(list.size() > 1, 0, C0673h.a(i2, Integer.MAX_VALUE), interfaceC0944E == null ? null : new C0673h(C0673h.a(intValue2, intValue)), 0, 0, 0, false, false).f7887b) {
            C0673h a4 = c1005i.a(0, 0, interfaceC0944E != null);
            return C0673h.a(a4 != null ? (int) (a4.f6920a & 4294967295L) : 0, 0);
        }
        int size = list.size();
        int i14 = i2;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            if (i15 >= size) {
                i15 = i16;
                break;
            }
            int i18 = i14 - intValue2;
            int i19 = i15 + 1;
            int max = Math.max(i13, intValue);
            InterfaceC0944E interfaceC0944E2 = (InterfaceC0944E) C1403G.s(i19, list);
            int intValue3 = interfaceC0944E2 != null ? ((Number) cVar2.g(interfaceC0944E2, Integer.valueOf(i19), Integer.valueOf(i2))).intValue() : i9;
            int intValue4 = interfaceC0944E2 != null ? ((Number) cVar.g(interfaceC0944E2, Integer.valueOf(i19), Integer.valueOf(intValue3))).intValue() + i4 : 0;
            boolean z4 = i15 + 2 < list.size();
            int i20 = i19 - i17;
            long a5 = C0673h.a(i18, i10);
            if (interfaceC0944E2 == null) {
                i8 = i19;
                c0673h = null;
            } else {
                i8 = i19;
                c0673h = new C0673h(C0673h.a(intValue4, intValue3));
            }
            i15 = i8;
            C0805c b4 = c0999c.b(z4, i20, a5, c0673h, i11, i12, max, false, false);
            if (b4.f7886a) {
                int i21 = max + i5 + i12;
                C0998B a6 = c0999c.a(b4, interfaceC0944E2 != null, i11, i21, i18, i20);
                int i22 = intValue4 - i4;
                i11++;
                if (b4.f7887b) {
                    if (a6 != null && !a6.f9140d) {
                        i21 += ((int) (a6.f9139c & 4294967295L)) + i5;
                    }
                    i12 = i21;
                } else {
                    i14 = i2;
                    i12 = i21;
                    intValue2 = i22;
                    i17 = i15;
                    i13 = 0;
                }
            } else {
                i13 = max;
                i14 = i18;
                intValue2 = intValue4;
            }
            intValue = intValue3;
            i16 = i15;
            i9 = 0;
            i10 = Integer.MAX_VALUE;
        }
        return C0673h.a(i12 - i5, i15);
    }

    public static final long c(InterfaceC0944E interfaceC0944E, C1008L c1008l, long j4, Function1 function1) {
        if (AbstractC1024c.f(AbstractC1024c.e(interfaceC0944E)) != 0.0f) {
            c1008l.getClass();
            int S3 = interfaceC0944E.S(Integer.MAX_VALUE);
            return C0673h.a(S3, interfaceC0944E.Z(S3));
        }
        AbstractC1024c.e(interfaceC0944E);
        AbstractC0954O a4 = interfaceC0944E.a(j4);
        function1.invoke(a4);
        c1008l.getClass();
        return C0673h.a(a4.g0(), a4.f0());
    }
}
