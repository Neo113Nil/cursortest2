package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zw extends bb2 {
    public final tn1 K;

    public zw(b41 b41Var, boolean z, float f, s90 s90Var, t90 t90Var) {
        super(b41Var, z, f, s90Var, t90Var);
        this.K = new tn1();
    }

    @Override // defpackage.bb2
    public final void G0(u42 u42Var, long j, float f) {
        tn1 tn1Var = this.K;
        Object[] objArr = tn1Var.b;
        Object[] objArr2 = tn1Var.c;
        long[] jArr = tn1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j2 = jArr[i];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j2) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            ua2 ua2Var = (ua2) objArr2[i4];
                            ua2Var.k.setValue(Boolean.TRUE);
                            ua2Var.i.U(Unit.a);
                        }
                        j2 >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        boolean z = this.B;
        ua2 ua2Var2 = new ua2(z ? new au1(u42Var.a) : null, f, z);
        tn1Var.m(u42Var, ua2Var2);
        z71.H(u0(), null, new ed(ua2Var2, this, u42Var, null, 3), 3);
        z71.F(this);
    }

    @Override // defpackage.bb2
    public final void H0(k91 k91Var) {
        ns nsVar;
        Object[] objArr;
        int i;
        int i2;
        ns nsVar2;
        Object[] objArr2;
        int i3;
        zw zwVar = this;
        ns nsVar3 = k91Var.m;
        zwVar.E.invoke();
        float f = 0.1f;
        if (0.1f == 0.0f) {
            return;
        }
        tn1 tn1Var = zwVar.K;
        Object[] objArr3 = tn1Var.b;
        Object[] objArr4 = tn1Var.c;
        long[] jArr = tn1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                long j2 = j;
                int i7 = 0;
                while (i7 < i6) {
                    if ((j2 & 255) < 128) {
                        int i8 = (i4 << 3) + i7;
                        Object obj = objArr3[i8];
                        ua2 ua2Var = (ua2) objArr4[i8];
                        long b = aw.b(zwVar.D.a(), f);
                        jc jcVar = ua2Var.h;
                        if (ua2Var.d == null) {
                            long f2 = nsVar3.f();
                            ua2Var.d = Float.valueOf(Math.max(ql2.d(f2), ql2.b(f2)) * 0.3f);
                        }
                        if (ua2Var.a == null) {
                            ua2Var.a = new au1(nsVar3.Z());
                        }
                        if (ua2Var.e == null) {
                            ua2Var.e = new au1(ap.i(ql2.d(nsVar3.f()) / 2.0f, ql2.b(nsVar3.f()) / 2.0f));
                        }
                        float floatValue = (!((Boolean) ua2Var.k.getValue()).booleanValue() || ((Boolean) ua2Var.j.getValue()).booleanValue()) ? ((Number) ua2Var.f.d()).floatValue() : 1.0f;
                        Float f3 = ua2Var.d;
                        f3.getClass();
                        float K = yk3.K(f3.floatValue(), ua2Var.b, ((Number) ua2Var.g.d()).floatValue());
                        au1 au1Var = ua2Var.a;
                        au1Var.getClass();
                        float f4 = floatValue;
                        float d = au1.d(au1Var.a);
                        au1 au1Var2 = ua2Var.e;
                        au1Var2.getClass();
                        int i9 = i7;
                        float K2 = yk3.K(d, au1.d(au1Var2.a), ((Number) jcVar.d()).floatValue());
                        au1 au1Var3 = ua2Var.a;
                        au1Var3.getClass();
                        float e = au1.e(au1Var3.a);
                        au1 au1Var4 = ua2Var.e;
                        au1Var4.getClass();
                        int i10 = i6;
                        long i11 = ap.i(K2, yk3.K(e, au1.e(au1Var4.a), ((Number) jcVar.d()).floatValue()));
                        long b2 = aw.b(b, aw.d(b) * f4);
                        if (ua2Var.c) {
                            float d2 = ql2.d(nsVar3.f());
                            float b3 = ql2.b(nsVar3.f());
                            mh mhVar = nsVar3.n;
                            long v = mhVar.v();
                            mhVar.o().m();
                            ((mh) ((ar0) mhVar.n).n).o().g(0.0f, 0.0f, d2, b3, 1);
                            nsVar2 = nsVar3;
                            i2 = i10;
                            objArr2 = objArr3;
                            i3 = 8;
                            i = i9;
                            yd0.f0(k91Var, b2, K, i11, 120);
                            mhVar.o().j();
                            mhVar.J(v);
                        } else {
                            nsVar2 = nsVar3;
                            i = i9;
                            i2 = i10;
                            objArr2 = objArr3;
                            i3 = 8;
                            yd0.f0(k91Var, b2, K, i11, 120);
                        }
                    } else {
                        i = i7;
                        i2 = i6;
                        nsVar2 = nsVar3;
                        objArr2 = objArr3;
                        i3 = i5;
                    }
                    j2 >>= i3;
                    i7 = i + 1;
                    i6 = i2;
                    i5 = i3;
                    nsVar3 = nsVar2;
                    objArr3 = objArr2;
                    f = 0.1f;
                    zwVar = this;
                }
                nsVar = nsVar3;
                objArr = objArr3;
                if (i6 != i5) {
                    return;
                }
            } else {
                nsVar = nsVar3;
                objArr = objArr3;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            zwVar = this;
            nsVar3 = nsVar;
            objArr3 = objArr;
            f = 0.1f;
        }
    }

    @Override // defpackage.bb2
    public final void J0(u42 u42Var) {
        ua2 ua2Var = (ua2) this.K.g(u42Var);
        if (ua2Var != null) {
            ua2Var.k.setValue(Boolean.TRUE);
            ua2Var.i.U(Unit.a);
        }
    }

    @Override // defpackage.ul1
    public final void z0() {
        this.K.a();
    }
}
