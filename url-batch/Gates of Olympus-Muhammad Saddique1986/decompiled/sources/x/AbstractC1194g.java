package x;

import C0.C0031g;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0142c0;
import a.AbstractC0235a;
import b0.AbstractC0347p;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0427f;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1194g {
    static {
        float f3 = 40;
        AbstractC0235a.d(f3, f3);
    }

    public static final void a(String str, InterfaceC0424c interfaceC0424c, U.q qVar, boolean z3, boolean z4, C0.K k3, P p3, O o3, boolean z5, int i3, int i4, B.r rVar, InterfaceC0424c interfaceC0424c2, q.k kVar, AbstractC0347p abstractC0347p, InterfaceC0427f interfaceC0427f, C0167p c0167p, int i5, int i6) {
        int i7;
        int i8;
        InterfaceC0424c interfaceC0424c3;
        InterfaceC0424c interfaceC0424c4;
        c0167p.S(945255183);
        if ((i5 & 6) == 0) {
            i7 = (c0167p.f(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= c0167p.h(interfaceC0424c) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= c0167p.f(qVar) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= c0167p.g(z3) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= c0167p.g(z4) ? 16384 : 8192;
        }
        if ((i5 & 196608) == 0) {
            i7 |= c0167p.f(k3) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= c0167p.f(p3) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= c0167p.f(o3) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= c0167p.g(z5) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= c0167p.d(i3) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (c0167p.d(i4) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= c0167p.f(rVar) ? 32 : 16;
        }
        int i9 = i8 | 384;
        if ((i6 & 3072) == 0) {
            i9 |= c0167p.f(kVar) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i9 |= c0167p.f(abstractC0347p) ? 16384 : 8192;
        }
        if ((i6 & 196608) == 0) {
            i9 |= c0167p.h(interfaceC0427f) ? 131072 : 65536;
        }
        int i10 = i9;
        if ((306783379 & i7) == 306783378 && (i10 & 74899) == 74898 && c0167p.x()) {
            c0167p.L();
            interfaceC0424c4 = interfaceC0424c2;
        } else {
            c0167p.N();
            if ((i5 & 1) == 0 || c0167p.w()) {
                interfaceC0424c3 = C1192e.f10074f;
            } else {
                c0167p.L();
                interfaceC0424c3 = interfaceC0424c2;
            }
            c0167p.q();
            Object G3 = c0167p.G();
            Object obj = C0159l.f2829a;
            I.W w2 = I.W.f2783i;
            if (G3 == obj) {
                G3 = C0143d.K(new I0.z(str, 0L, 6), w2);
                c0167p.a0(G3);
            }
            InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) G3;
            I0.z zVar = (I0.z) interfaceC0142c0.getValue();
            I0.z zVar2 = new I0.z(new C0031g(str, null, 6), zVar.f3098b, zVar.f3099c);
            boolean f3 = c0167p.f(zVar2);
            Object G4 = c0167p.G();
            if (f3 || G4 == obj) {
                G4 = new B.f0(zVar2, 14, interfaceC0142c0);
                c0167p.a0(G4);
            }
            C0143d.g((InterfaceC0422a) G4, c0167p);
            boolean z6 = (i7 & 14) == 4;
            Object G5 = c0167p.G();
            if (z6 || G5 == obj) {
                G5 = C0143d.K(str, w2);
                c0167p.a0(G5);
            }
            Object obj2 = (InterfaceC0142c0) G5;
            p3.getClass();
            int i11 = p3.f9969a;
            I0.n nVar = new I0.n(i11);
            if (I0.n.a(i11, -1)) {
                nVar = null;
            }
            int i12 = nVar != null ? nVar.f3078a : 0;
            Boolean bool = p3.f9970b;
            boolean booleanValue = bool != null ? bool.booleanValue() : true;
            int i13 = p3.f9971c;
            I0.o oVar = new I0.o(i13);
            if (I0.o.a(i13, 0)) {
                oVar = null;
            }
            int i14 = oVar != null ? oVar.f3079a : 1;
            int i15 = p3.f9972d;
            I0.l lVar = !I0.l.a(i15, -1) ? new I0.l(i15) : null;
            int i16 = lVar != null ? lVar.f3070a : 1;
            J0.b bVar = p3.f9974f;
            if (bVar == null) {
                bVar = J0.b.f3155f;
            }
            I0.m mVar = new I0.m(z5, i12, booleanValue, i14, i16, bVar);
            boolean z7 = !z5;
            int i17 = z5 ? 1 : i4;
            int i18 = z5 ? 1 : i3;
            boolean f4 = ((i7 & 112) == 32) | c0167p.f(obj2);
            Object G6 = c0167p.G();
            if (f4 || G6 == obj) {
                G6 = new R.h(interfaceC0424c, interfaceC0142c0, obj2, 12);
                c0167p.a0(G6);
            }
            int i19 = i10 << 9;
            N.c(zVar2, (InterfaceC0424c) G6, qVar, k3, rVar, interfaceC0424c3, kVar, abstractC0347p, z7, i18, i17, mVar, o3, z3, z4, interfaceC0427f, c0167p, (i7 & 896) | ((i7 >> 6) & 7168) | (i19 & 57344) | (i19 & 458752) | (3670016 & i19) | (i19 & 29360128), (i7 & 57344) | ((i7 >> 15) & 896) | (i7 & 7168) | (i10 & 458752));
            interfaceC0424c4 = interfaceC0424c3;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C1193f(str, interfaceC0424c, qVar, z3, z4, k3, p3, o3, z5, i3, i4, rVar, interfaceC0424c4, kVar, abstractC0347p, interfaceC0427f, i5, i6);
        }
    }
}
