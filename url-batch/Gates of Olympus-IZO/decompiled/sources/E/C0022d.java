package E;

import D1.C0014b;
import F.Q;
import b0.C0288u;
import d0.C0321b;
import d0.C0325f;
import j.C0506x;
import k2.AbstractC0552y;
import m.C0593d;
import t0.AbstractC0898f;

/* renamed from: E.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022d extends z {

    /* renamed from: A, reason: collision with root package name */
    public final C0506x f648A;

    public C0022d(q.i iVar, boolean z3, float f3, A2.g gVar, Q q2) {
        super(iVar, z3, f3, gVar, q2);
        this.f648A = new C0506x();
    }

    @Override // U.k
    public final void o0() {
        this.f648A.a();
    }

    @Override // E.z
    public final void v0(q.l lVar, long j3, float f3) {
        C0506x c0506x = this.f648A;
        Object[] objArr = c0506x.f5227b;
        Object[] objArr2 = c0506x.f5228c;
        long[] jArr = c0506x.f5226a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j4 = jArr[i3];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j4) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            q qVar = (q) objArr2[i6];
                            qVar.f690k.setValue(Boolean.TRUE);
                            qVar.f688i.R(L1.z.f2729a);
                        }
                        j4 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        boolean z3 = this.f713r;
        q qVar2 = new q(z3 ? new a0.c(lVar.f6819a) : null, f3, z3);
        c0506x.i(lVar, qVar2);
        AbstractC0552y.q(j0(), null, null, new C0021c(qVar2, this, lVar, null), 3);
        AbstractC0898f.m(this);
    }

    @Override // E.z
    public final void w0(t0.F f3) {
        float f4;
        long[] jArr;
        Object[] objArr;
        Object[] objArr2;
        float f5;
        long[] jArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i3;
        C0022d c0022d = this;
        float f6 = ((C0027i) c0022d.f716u.b()).f663d;
        if (f6 == 0.0f) {
            return;
        }
        C0506x c0506x = c0022d.f648A;
        Object[] objArr5 = c0506x.f5227b;
        Object[] objArr6 = c0506x.f5228c;
        long[] jArr3 = c0506x.f5226a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j3 = jArr3[i4];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((255 & j3) < 128) {
                        int i8 = (i4 << 3) + i7;
                        Object obj = objArr5[i8];
                        q qVar = (q) objArr6[i8];
                        long b2 = C0288u.b(c0022d.f715t.o(), f6);
                        Float f7 = qVar.f683d;
                        f5 = f6;
                        C0321b c0321b = f3.f7748d;
                        if (f7 == null) {
                            long c3 = c0321b.c();
                            float f8 = r.f691a;
                            qVar.f683d = Float.valueOf(Math.max(a0.f.d(c3), a0.f.b(c3)) * 0.3f);
                        }
                        long[] jArr4 = jArr3;
                        if (qVar.f680a == null) {
                            objArr3 = objArr5;
                            qVar.f680a = new a0.c(c0321b.w());
                        } else {
                            objArr3 = objArr5;
                        }
                        if (qVar.f684e == null) {
                            qVar.f684e = new a0.c(I2.l.f(a0.f.d(c0321b.c()) / 2.0f, a0.f.b(c0321b.c()) / 2.0f));
                        }
                        float floatValue = (!((Boolean) qVar.f690k.getValue()).booleanValue() || ((Boolean) qVar.f689j.getValue()).booleanValue()) ? ((Number) qVar.f685f.d()).floatValue() : 1.0f;
                        Float f9 = qVar.f683d;
                        Z1.i.c(f9);
                        objArr4 = objArr6;
                        float G3 = I2.l.G(f9.floatValue(), qVar.f681b, ((Number) qVar.f686g.d()).floatValue());
                        a0.c cVar = qVar.f680a;
                        Z1.i.c(cVar);
                        float d3 = a0.c.d(cVar.f3489a);
                        a0.c cVar2 = qVar.f684e;
                        Z1.i.c(cVar2);
                        float d4 = a0.c.d(cVar2.f3489a);
                        C0593d c0593d = qVar.f687h;
                        jArr2 = jArr4;
                        float G4 = I2.l.G(d3, d4, ((Number) c0593d.d()).floatValue());
                        a0.c cVar3 = qVar.f680a;
                        Z1.i.c(cVar3);
                        i3 = length;
                        float e3 = a0.c.e(cVar3.f3489a);
                        a0.c cVar4 = qVar.f684e;
                        Z1.i.c(cVar4);
                        long f10 = I2.l.f(G4, I2.l.G(e3, a0.c.e(cVar4.f3489a), ((Number) c0593d.d()).floatValue()));
                        long b3 = C0288u.b(b2, C0288u.d(b2) * floatValue);
                        if (qVar.f682c) {
                            float d5 = a0.f.d(c0321b.c());
                            float b4 = a0.f.b(c0321b.c());
                            C0014b c0014b = c0321b.f4444e;
                            long m3 = c0014b.m();
                            c0014b.h().f();
                            try {
                                ((C0014b) ((A2.g) c0014b.f536b).f83b).h().q(0.0f, 0.0f, d5, b4, 1);
                                f3.h0(b3, G3, (r18 & 4) != 0 ? f3.w() : f10, 1.0f, C0325f.f4448b, null, 3);
                            } finally {
                                c0014b.h().a();
                                c0014b.y(m3);
                            }
                        } else {
                            f3.h0(b3, G3, (r18 & 4) != 0 ? f3.w() : f10, 1.0f, C0325f.f4448b, null, 3);
                        }
                    } else {
                        f5 = f6;
                        jArr2 = jArr3;
                        objArr3 = objArr5;
                        objArr4 = objArr6;
                        i3 = length;
                    }
                    j3 >>= 8;
                    i7++;
                    c0022d = this;
                    i5 = 8;
                    f6 = f5;
                    objArr5 = objArr3;
                    objArr6 = objArr4;
                    jArr3 = jArr2;
                    length = i3;
                }
                f4 = f6;
                jArr = jArr3;
                objArr = objArr5;
                objArr2 = objArr6;
                int i9 = length;
                if (i6 != i5) {
                    return;
                } else {
                    length = i9;
                }
            } else {
                f4 = f6;
                jArr = jArr3;
                objArr = objArr5;
                objArr2 = objArr6;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            c0022d = this;
            f6 = f4;
            objArr5 = objArr;
            objArr6 = objArr2;
            jArr3 = jArr;
        }
    }

    @Override // E.z
    public final void y0(q.l lVar) {
        q qVar = (q) this.f648A.e(lVar);
        if (qVar != null) {
            qVar.f690k.setValue(Boolean.TRUE);
            qVar.f688i.R(L1.z.f2729a);
        }
    }
}
