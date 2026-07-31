package E;

import B.Y;
import F.W;
import F.X;
import a0.C0238c;
import a0.C0241f;
import b0.C0352v;
import d0.C0401b;
import d0.C0406g;
import j.C0550x;
import m.C0619d;
import q2.AbstractC0837y;
import t0.AbstractC0993f;

/* renamed from: E.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076d extends y {

    /* renamed from: A, reason: collision with root package name */
    public final C0550x f951A;

    public C0076d(q.j jVar, boolean z3, float f3, W w2, X x3) {
        super(jVar, z3, f3, w2, x3);
        this.f951A = new C0550x();
    }

    @Override // E.y
    public final void B0(q.m mVar) {
        p pVar = (p) this.f951A.e(mVar);
        if (pVar != null) {
            pVar.f990k.setValue(Boolean.TRUE);
            pVar.f988i.V(R1.y.f4171a);
        }
    }

    @Override // U.p
    public final void r0() {
        this.f951A.a();
    }

    @Override // E.y
    public final void y0(q.m mVar, long j3, float f3) {
        C0550x c0550x = this.f951A;
        Object[] objArr = c0550x.f6345b;
        Object[] objArr2 = c0550x.f6346c;
        long[] jArr = c0550x.f6344a;
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
                            p pVar = (p) objArr2[i6];
                            pVar.f990k.setValue(Boolean.TRUE);
                            pVar.f988i.V(R1.y.f4171a);
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
        boolean z3 = this.f1013r;
        p pVar2 = new p(z3 ? new C0238c(mVar.f7845a) : null, f3, z3);
        c0550x.i(mVar, pVar2);
        AbstractC0837y.r(m0(), null, null, new C0075c(pVar2, this, mVar, null), 3);
        AbstractC0993f.m(this);
    }

    @Override // E.y
    public final void z0(t0.G g3) {
        float f3;
        long[] jArr;
        Object[] objArr;
        Object[] objArr2;
        float f4;
        long[] jArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i3;
        C0076d c0076d = this;
        float f5 = ((C0080h) c0076d.f1016u.b()).f963d;
        if (f5 == 0.0f) {
            return;
        }
        C0550x c0550x = c0076d.f951A;
        Object[] objArr5 = c0550x.f6345b;
        Object[] objArr6 = c0550x.f6346c;
        long[] jArr3 = c0550x.f6344a;
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
                        p pVar = (p) objArr6[i8];
                        long b3 = C0352v.b(c0076d.f1015t.a(), f5);
                        Float f6 = pVar.f983d;
                        f4 = f5;
                        C0401b c0401b = g3.f8573d;
                        if (f6 == null) {
                            long d3 = c0401b.d();
                            float f7 = q.f991a;
                            pVar.f983d = Float.valueOf(Math.max(C0241f.d(d3), C0241f.b(d3)) * 0.3f);
                        }
                        long[] jArr4 = jArr3;
                        if (pVar.f980a == null) {
                            objArr3 = objArr5;
                            pVar.f980a = new C0238c(c0401b.y());
                        } else {
                            objArr3 = objArr5;
                        }
                        if (pVar.f984e == null) {
                            pVar.f984e = new C0238c(l0.c.e(C0241f.d(c0401b.d()) / 2.0f, C0241f.b(c0401b.d()) / 2.0f));
                        }
                        float floatValue = (!((Boolean) pVar.f990k.getValue()).booleanValue() || ((Boolean) pVar.f989j.getValue()).booleanValue()) ? ((Number) pVar.f985f.d()).floatValue() : 1.0f;
                        Float f8 = pVar.f983d;
                        f2.j.c(f8);
                        objArr4 = objArr6;
                        float G3 = l0.c.G(f8.floatValue(), pVar.f981b, ((Number) pVar.f986g.d()).floatValue());
                        C0238c c0238c = pVar.f980a;
                        f2.j.c(c0238c);
                        float d4 = C0238c.d(c0238c.f4722a);
                        C0238c c0238c2 = pVar.f984e;
                        f2.j.c(c0238c2);
                        float d5 = C0238c.d(c0238c2.f4722a);
                        C0619d c0619d = pVar.f987h;
                        jArr2 = jArr4;
                        float G4 = l0.c.G(d4, d5, ((Number) c0619d.d()).floatValue());
                        C0238c c0238c3 = pVar.f980a;
                        f2.j.c(c0238c3);
                        i3 = length;
                        float e3 = C0238c.e(c0238c3.f4722a);
                        C0238c c0238c4 = pVar.f984e;
                        f2.j.c(c0238c4);
                        long e4 = l0.c.e(G4, l0.c.G(e3, C0238c.e(c0238c4.f4722a), ((Number) c0619d.d()).floatValue()));
                        long b4 = C0352v.b(b3, C0352v.d(b3) * floatValue);
                        if (pVar.f982c) {
                            float d6 = C0241f.d(c0401b.d());
                            float b5 = C0241f.b(c0401b.d());
                            G1.m mVar = c0401b.f5649e;
                            long n3 = mVar.n();
                            mVar.h().f();
                            try {
                                ((G1.m) ((Y) mVar.f2116b).f334d).h().r(0.0f, 0.0f, d6, b5, 1);
                                g3.M(b4, G3, (r18 & 4) != 0 ? g3.y() : e4, 1.0f, C0406g.f5653a, null, 3);
                            } finally {
                                A.k.q(mVar, n3);
                            }
                        } else {
                            g3.M(b4, G3, (r18 & 4) != 0 ? g3.y() : e4, 1.0f, C0406g.f5653a, null, 3);
                        }
                    } else {
                        f4 = f5;
                        jArr2 = jArr3;
                        objArr3 = objArr5;
                        objArr4 = objArr6;
                        i3 = length;
                    }
                    j3 >>= 8;
                    i7++;
                    c0076d = this;
                    i5 = 8;
                    f5 = f4;
                    objArr5 = objArr3;
                    objArr6 = objArr4;
                    jArr3 = jArr2;
                    length = i3;
                }
                f3 = f5;
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
                f3 = f5;
                jArr = jArr3;
                objArr = objArr5;
                objArr2 = objArr6;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            c0076d = this;
            f5 = f3;
            objArr5 = objArr;
            objArr6 = objArr2;
            jArr3 = jArr;
        }
    }
}
