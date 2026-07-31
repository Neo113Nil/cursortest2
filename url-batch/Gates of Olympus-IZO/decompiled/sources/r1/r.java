package r1;

import b0.C0261L;
import f.AbstractC0382a;
import h1.C0438i;
import java.util.HashSet;
import java.util.Iterator;
import s0.C0887d;
import t0.AbstractC0898f;
import t0.C0895c;
import t0.D;
import t0.E;
import t0.I;
import t0.J;
import t0.L;
import t0.a0;
import z.C1072h;
import z.C1075k;

/* loaded from: classes.dex */
public final class r extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7249f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i3, Object obj) {
        super(0);
        this.f7248e = i3;
        this.f7249f = obj;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f7248e) {
            case 0:
                break;
            case 1:
                C0887d c0887d = (C0887d) this.f7249f;
                int i3 = 0;
                c0887d.f7508f = false;
                HashSet hashSet = new HashSet();
                K.d dVar = c0887d.f7506d;
                int i4 = dVar.f2642f;
                K.d dVar2 = c0887d.f7507e;
                if (i4 > 0) {
                    Object[] objArr = dVar.f2640d;
                    int i5 = 0;
                    do {
                        D d3 = (D) objArr[i5];
                        s0.h hVar = (s0.h) dVar2.f2640d[i5];
                        U.k kVar = (U.k) d3.f7735x.f2356f;
                        if (kVar.p) {
                            C0887d.b(kVar, hVar, hashSet);
                        }
                        i5++;
                    } while (i5 < i4);
                }
                dVar.h();
                dVar2.h();
                K.d dVar3 = c0887d.f7504b;
                int i6 = dVar3.f2642f;
                K.d dVar4 = c0887d.f7505c;
                if (i6 > 0) {
                    Object[] objArr2 = dVar3.f2640d;
                    do {
                        C0895c c0895c = (C0895c) objArr2[i3];
                        s0.h hVar2 = (s0.h) dVar4.f2640d[i3];
                        if (c0895c.p) {
                            C0887d.b(c0895c, hVar2, hashSet);
                        }
                        i3++;
                    } while (i3 < i6);
                }
                dVar3.h();
                dVar4.h();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((C0895c) it.next()).x0();
                }
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                L l3 = ((D) this.f7249f).f7736y;
                l3.f7813r.f7793y = true;
                I i7 = l3.f7814s;
                if (i7 != null) {
                    i7.f7767v = true;
                }
                break;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                J j3 = (J) this.f7249f;
                L l4 = j3.f7777I;
                int i8 = 0;
                l4.f7807k = 0;
                K.d t3 = l4.f7797a.t();
                int i9 = t3.f2642f;
                if (i9 > 0) {
                    Object[] objArr3 = t3.f2640d;
                    int i10 = 0;
                    do {
                        J j4 = ((D) objArr3[i10]).f7736y.f7813r;
                        j4.f7779j = j4.f7780k;
                        j4.f7780k = Integer.MAX_VALUE;
                        j4.f7790v = false;
                        if (j4.f7783n == 2) {
                            j4.f7783n = 3;
                        }
                        i10++;
                    } while (i10 < i9);
                }
                L l5 = j3.f7777I;
                K.d t4 = l5.f7797a.t();
                int i11 = t4.f2642f;
                if (i11 > 0) {
                    Object[] objArr4 = t4.f2640d;
                    int i12 = 0;
                    do {
                        ((D) objArr4[i12]).f7736y.f7813r.f7791w.f7741d = false;
                        i12++;
                    } while (i12 < i11);
                }
                j3.A().k0().j();
                D d4 = l5.f7797a;
                K.d t5 = d4.t();
                int i13 = t5.f2642f;
                if (i13 > 0) {
                    Object[] objArr5 = t5.f2640d;
                    int i14 = 0;
                    do {
                        D d5 = (D) objArr5[i14];
                        if (d5.f7736y.f7813r.f7779j != d5.r()) {
                            d4.I();
                            d4.w();
                            if (d5.r() == Integer.MAX_VALUE) {
                                d5.f7736y.f7813r.d0();
                            }
                        }
                        i14++;
                    } while (i14 < i13);
                }
                K.d t6 = d4.t();
                int i15 = t6.f2642f;
                if (i15 > 0) {
                    Object[] objArr6 = t6.f2640d;
                    do {
                        E e3 = ((D) objArr6[i8]).f7736y.f7813r.f7791w;
                        e3.f7742e = e3.f7741d;
                        i8++;
                    } while (i8 < i15);
                }
                break;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                L l6 = (L) this.f7249f;
                l6.a().b(l6.f7815t);
                break;
            case 5:
                a0 a0Var = ((a0) this.f7249f).f7878q;
                if (a0Var != null) {
                    a0Var.H0();
                }
                break;
            case 6:
                C0261L c0261l = a0.f7869H;
                ((Y1.c) this.f7249f).j(c0261l);
                c0261l.f4238x = c0261l.f4232r.a(c0261l.f4235u, c0261l.f4237w, c0261l.f4236v);
                break;
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case 8:
                w1.g gVar = (w1.g) this.f7249f;
                String str = gVar.f8595e;
                w1.c cVar = new w1.c();
                cVar.f8582a = null;
                w1.f fVar = new w1.f(gVar.f8594d, gVar.f8595e, cVar, gVar.f8596f);
                fVar.setWriteAheadLoggingEnabled(gVar.f8598h);
                break;
            case AbstractC0382a.f4777a /* 9 */:
                C1072h c1072h = (C1072h) this.f7249f;
                c1072h.f8914F = null;
                AbstractC0898f.o(c1072h);
                AbstractC0898f.n(c1072h);
                AbstractC0898f.m(c1072h);
                break;
            default:
                C1075k c1075k = (C1075k) this.f7249f;
                c1075k.B = null;
                AbstractC0898f.o(c1075k);
                AbstractC0898f.n(c1075k);
                AbstractC0898f.m(c1075k);
                break;
        }
        return Boolean.TRUE;
    }
}
