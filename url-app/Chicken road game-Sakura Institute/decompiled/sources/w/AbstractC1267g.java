package w;

import A.C0022s;
import A0.C0036g;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0191c0;
import Z.AbstractC0319p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p.C0935k;

/* renamed from: w.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1267g {
    static {
        float f4 = 40;
        M1.a.d(f4, f4);
    }

    public static final void a(String str, Function1 function1, S.o oVar, boolean z4, boolean z5, A0.L l4, O o4, N n2, boolean z6, int i2, int i4, C0022s c0022s, Function1 function12, C0935k c0935k, AbstractC0319p abstractC0319p, L2.c cVar, C0216p c0216p, int i5, int i6) {
        int i7;
        int i8;
        Function1 function13;
        Function1 function14;
        c0216p.U(945255183);
        if ((i5 & 6) == 0) {
            i7 = (c0216p.f(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= c0216p.h(function1) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= c0216p.f(oVar) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= c0216p.g(z4) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= c0216p.g(z5) ? 16384 : 8192;
        }
        if ((i5 & 196608) == 0) {
            i7 |= c0216p.f(l4) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= c0216p.f(o4) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= c0216p.f(n2) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= c0216p.g(z6) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= c0216p.d(i2) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (c0216p.d(i4) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= c0216p.f(c0022s) ? 32 : 16;
        }
        int i9 = i8 | 384;
        if ((i6 & 3072) == 0) {
            i9 |= c0216p.f(c0935k) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i9 |= c0216p.f(abstractC0319p) ? 16384 : 8192;
        }
        if ((i6 & 196608) == 0) {
            i9 |= c0216p.h(cVar) ? 131072 : 65536;
        }
        int i10 = i9;
        if ((306783379 & i7) == 306783378 && (i10 & 74899) == 74898 && c0216p.z()) {
            c0216p.N();
            function14 = function12;
        } else {
            c0216p.P();
            if ((i5 & 1) == 0 || c0216p.y()) {
                function13 = C1265e.f11162e;
            } else {
                c0216p.N();
                function13 = function12;
            }
            c0216p.r();
            Object I3 = c0216p.I();
            Object obj = C0208l.f2826a;
            G.W w4 = G.W.f2779l;
            if (I3 == obj) {
                I3 = C0192d.K(new G0.y(6, 0L, str), w4);
                c0216p.c0(I3);
            }
            InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I3;
            G0.y yVar = (G0.y) interfaceC0191c0.getValue();
            G0.y yVar2 = new G0.y(new C0036g(str, null, 6), yVar.f3094b, yVar.f3095c);
            boolean f4 = c0216p.f(yVar2);
            Object I4 = c0216p.I();
            if (f4 || I4 == obj) {
                I4 = new A.f0(yVar2, 15, interfaceC0191c0);
                c0216p.c0(I4);
            }
            C0192d.g((Function0) I4, c0216p);
            boolean z7 = (i7 & 14) == 4;
            Object I5 = c0216p.I();
            if (z7 || I5 == obj) {
                I5 = C0192d.K(str, w4);
                c0216p.c0(I5);
            }
            Object obj2 = (InterfaceC0191c0) I5;
            o4.getClass();
            int i11 = o4.f11048a;
            G0.n nVar = new G0.n(i11);
            if (G0.n.a(i11, -1)) {
                nVar = null;
            }
            int i12 = nVar != null ? nVar.f3074a : 0;
            Boolean bool = o4.f11049b;
            boolean booleanValue = bool != null ? bool.booleanValue() : true;
            int i13 = o4.f11050c;
            G0.o oVar2 = new G0.o(i13);
            if (G0.o.a(i13, 0)) {
                oVar2 = null;
            }
            int i14 = oVar2 != null ? oVar2.f3075a : 1;
            int i15 = o4.f11051d;
            G0.l lVar = !G0.l.a(i15, -1) ? new G0.l(i15) : null;
            int i16 = lVar != null ? lVar.f3066a : 1;
            H0.b bVar = o4.f11053f;
            if (bVar == null) {
                bVar = H0.b.f3225i;
            }
            G0.m mVar = new G0.m(z6, i12, booleanValue, i14, i16, bVar);
            boolean z8 = !z6;
            int i17 = z6 ? 1 : i4;
            int i18 = z6 ? 1 : i2;
            boolean f5 = ((i7 & 112) == 32) | c0216p.f(obj2);
            Object I6 = c0216p.I();
            if (f5 || I6 == obj) {
                I6 = new P.h(function1, interfaceC0191c0, obj2, 13);
                c0216p.c0(I6);
            }
            int i19 = i10 << 9;
            M.c(yVar2, (Function1) I6, oVar, l4, c0022s, function13, c0935k, abstractC0319p, z8, i18, i17, mVar, n2, z4, z5, cVar, c0216p, (i7 & 896) | ((i7 >> 6) & 7168) | (i19 & 57344) | (i19 & 458752) | (3670016 & i19) | (i19 & 29360128), (i7 & 57344) | ((i7 >> 15) & 896) | (i7 & 7168) | (i10 & 458752));
            function14 = function13;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C1266f(str, function1, oVar, z4, z5, l4, o4, n2, z6, i2, i4, c0022s, function14, c0935k, abstractC0319p, cVar, i5, i6);
        }
    }
}
