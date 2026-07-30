package c0;

import c7.a0;
import d0.a1;
import d0.z0;
import d6.z;
import r1.f0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends q {
    public final i.x C;

    public c(p.i iVar, boolean z8, float f9, z0 z0Var, a1 a1Var) {
        super(iVar, z8, f9, z0Var, a1Var);
        this.C = new i.x();
    }

    @Override // c0.q
    public final void A0(p.l lVar, long j8, float f9) {
        i.x xVar = this.C;
        Object[] objArr = xVar.f4813b;
        Object[] objArr2 = xVar.f4814c;
        long[] jArr = xVar.f4812a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr[i7];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j9) < 128) {
                            int i10 = (i7 << 3) + i9;
                            Object obj = objArr[i10];
                            j jVar = (j) objArr2[i10];
                            jVar.f1478k.setValue(Boolean.TRUE);
                            jVar.f1476i.O(z.f2639a);
                        }
                        j9 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        h6.d dVar = null;
        boolean z8 = this.f1496t;
        j jVar2 = new j(z8 ? new y0.c(lVar.f6978a) : null, f9, z8);
        xVar.i(lVar, jVar2);
        a0.p(o0(), null, null, new a0.a0(jVar2, this, lVar, dVar, 2), 3);
        r1.f.m(this);
    }

    @Override // c0.q
    public final void B0(f0 f0Var) {
        b1.c cVar;
        Object[] objArr;
        b1.c cVar2;
        int i7;
        int i8;
        int i9;
        Object[] objArr2;
        long j8;
        c cVar3 = this;
        b1.c cVar4 = f0Var.f7767f;
        cVar3.f1499w.a();
        float f9 = 0.1f;
        if (0.1f == 0.0f) {
            return;
        }
        i.x xVar = cVar3.C;
        Object[] objArr3 = xVar.f4813b;
        Object[] objArr4 = xVar.f4814c;
        long[] jArr = xVar.f4812a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                long j10 = j9;
                int i13 = 0;
                while (i13 < i12) {
                    if ((j10 & 255) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr3[i14];
                        j jVar = (j) objArr4[i14];
                        long b9 = z0.u.b(cVar3.f1498v.a(), f9);
                        l.d dVar = jVar.f1475h;
                        if (jVar.f1471d == null) {
                            long d8 = cVar4.d();
                            float f10 = k.f1479a;
                            jVar.f1471d = Float.valueOf(Math.max(y0.f.d(d8), y0.f.b(d8)) * 0.3f);
                        }
                        if (jVar.f1468a == null) {
                            jVar.f1468a = new y0.c(cVar4.Q());
                        }
                        if (jVar.f1472e == null) {
                            jVar.f1472e = new y0.c(u3.r.a(y0.f.d(cVar4.d()) / 2.0f, y0.f.b(cVar4.d()) / 2.0f));
                        }
                        float floatValue = (!((Boolean) jVar.f1478k.getValue()).booleanValue() || ((Boolean) jVar.f1477j.getValue()).booleanValue()) ? ((Number) jVar.f1473f.d()).floatValue() : 1.0f;
                        Float f11 = jVar.f1471d;
                        r6.k.c(f11);
                        float D = a8.m.D(f11.floatValue(), jVar.f1469b, ((Number) jVar.f1474g.d()).floatValue());
                        y0.c cVar5 = jVar.f1468a;
                        r6.k.c(cVar5);
                        float f12 = floatValue;
                        float d9 = y0.c.d(cVar5.f9778a);
                        y0.c cVar6 = jVar.f1472e;
                        r6.k.c(cVar6);
                        int i15 = i13;
                        float D2 = a8.m.D(d9, y0.c.d(cVar6.f9778a), ((Number) dVar.d()).floatValue());
                        y0.c cVar7 = jVar.f1468a;
                        r6.k.c(cVar7);
                        float e9 = y0.c.e(cVar7.f9778a);
                        y0.c cVar8 = jVar.f1472e;
                        r6.k.c(cVar8);
                        int i16 = i12;
                        long a3 = u3.r.a(D2, a8.m.D(e9, y0.c.e(cVar8.f9778a), ((Number) dVar.d()).floatValue()));
                        long b10 = z0.u.b(b9, z0.u.d(b9) * f12);
                        if (jVar.f1470c) {
                            float d10 = y0.f.d(cVar4.d());
                            float b11 = y0.f.b(cVar4.d());
                            b1.b bVar = cVar4.f1234g;
                            long p6 = bVar.p();
                            bVar.k().o();
                            try {
                                ((b1.b) ((b6.c) bVar.f1230g).f1394g).k().j(0.0f, 0.0f, d10, b11, 1);
                                objArr2 = objArr3;
                                i8 = i16;
                                cVar2 = cVar4;
                                i9 = 8;
                                i7 = i15;
                                j8 = p6;
                                try {
                                    b1.e.p(f0Var, b10, D, a3, 120);
                                    a0.m.s(bVar, j8);
                                } catch (Throwable th) {
                                    th = th;
                                    a0.m.s(bVar, j8);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                j8 = p6;
                            }
                        } else {
                            objArr2 = objArr3;
                            i7 = i15;
                            i8 = i16;
                            cVar2 = cVar4;
                            i9 = 8;
                            b1.e.p(f0Var, b10, D, a3, 120);
                        }
                    } else {
                        cVar2 = cVar4;
                        i7 = i13;
                        i8 = i12;
                        i9 = i11;
                        objArr2 = objArr3;
                    }
                    j10 >>= i9;
                    i13 = i7 + 1;
                    i11 = i9;
                    i12 = i8;
                    objArr3 = objArr2;
                    cVar4 = cVar2;
                    f9 = 0.1f;
                    cVar3 = this;
                }
                cVar = cVar4;
                objArr = objArr3;
                if (i12 != i11) {
                    return;
                }
            } else {
                cVar = cVar4;
                objArr = objArr3;
            }
            if (i10 == length) {
                return;
            }
            i10++;
            cVar3 = this;
            objArr3 = objArr;
            cVar4 = cVar;
            f9 = 0.1f;
        }
    }

    @Override // c0.q
    public final void D0(p.l lVar) {
        j jVar = (j) this.C.e(lVar);
        if (jVar != null) {
            jVar.f1478k.setValue(Boolean.TRUE);
            jVar.f1476i.O(z.f2639a);
        }
    }

    @Override // s0.n
    public final void t0() {
        this.C.a();
    }
}
