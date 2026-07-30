package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xr extends he1 implements yd1 {
    public final Function0 e;
    public final vb1 g;
    public wr h = new wr(pb1.j().g());

    public xr(Function0 function0, j50 j50Var) {
        this.e = function0;
        this.g = j50Var;
    }

    @Override // defpackage.ge1
    public final ie1 a() {
        return this.h;
    }

    @Override // defpackage.ge1
    public final void d(ie1 ie1Var) {
        ie1Var.getClass();
        this.h = (wr) ie1Var;
    }

    @Override // defpackage.yd1
    public final Object getValue() {
        Function1 e = pb1.j().e();
        if (e != null) {
            e.invoke(this);
        }
        ib1 j = pb1.j();
        return h((wr) pb1.i(this.h, j), j, true, this.e).f;
    }

    public final wr h(wr wrVar, ib1 ib1Var, boolean z, Function0 function0) {
        eo0 n;
        vb1 vb1Var;
        int i;
        wr wrVar2 = wrVar;
        if (wrVar2.c(this, ib1Var)) {
            if (z) {
                n = gb0.n();
                Object[] objArr = n.d;
                int i2 = n.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((gl) objArr[i3]).b();
                }
                try {
                    ln0 ln0Var = wrVar2.e;
                    i8 i8Var = wb1.a;
                    z90 z90Var = (z90) i8Var.get();
                    if (z90Var == null) {
                        z90Var = new z90();
                        i8Var.q(z90Var);
                    }
                    int i4 = z90Var.a;
                    Object[] objArr2 = ln0Var.b;
                    int[] iArr = ln0Var.c;
                    long[] jArr = ln0Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        ge1 ge1Var = (ge1) objArr2[i9];
                                        i = i6;
                                        z90Var.a = i4 + iArr[i9];
                                        Function1 e = ib1Var.e();
                                        if (e != null) {
                                            e.invoke(ge1Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    z90Var.a = i4;
                    Object[] objArr3 = n.d;
                    int i10 = n.g;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((gl) objArr3[i11]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return wrVar2;
        }
        ln0 ln0Var2 = new ln0();
        i8 i8Var2 = wb1.a;
        z90 z90Var2 = (z90) i8Var2.get();
        if (z90Var2 == null) {
            z90Var2 = new z90();
            i8Var2.q(z90Var2);
        }
        int i12 = z90Var2.a;
        n = gb0.n();
        Object[] objArr4 = n.d;
        int i13 = n.g;
        for (int i14 = 0; i14 < i13; i14++) {
            ((gl) objArr4[i14]).b();
        }
        try {
            z90Var2.a = i12 + 1;
            Object t = ca0.t(new vr(this, z90Var2, ln0Var2, i12), function0);
            z90Var2.a = i12;
            Object[] objArr5 = n.d;
            int i15 = n.g;
            for (int i16 = 0; i16 < i15; i16++) {
                ((gl) objArr5[i16]).a();
            }
            Object obj = pb1.c;
            synchronized (obj) {
                try {
                    ib1 j2 = pb1.j();
                    Object obj2 = wrVar2.f;
                    if (obj2 == wr.h || (vb1Var = this.g) == null || !vb1Var.b(t, obj2)) {
                        wr wrVar3 = this.h;
                        synchronized (obj) {
                            ie1 m = pb1.m(wrVar3, this);
                            m.a(wrVar3);
                            m.a = j2.g();
                            wrVar2 = (wr) m;
                            wrVar2.e = ln0Var2;
                            wrVar2.g = wrVar2.d(this, j2);
                            wrVar2.f = t;
                        }
                        return wrVar2;
                    }
                    wrVar2.e = ln0Var2;
                    wrVar2.g = wrVar2.d(this, j2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            z90 z90Var3 = (z90) wb1.a.get();
            if (z90Var3 == null || z90Var3.a != 0) {
                return wrVar2;
            }
            pb1.j().m();
            synchronized (obj) {
                ib1 j3 = pb1.j();
                wrVar2.c = j3.g();
                wrVar2.d = j3.h();
                return wrVar2;
            }
        } finally {
            Object[] objArr6 = n.d;
            int i17 = n.g;
            for (int i18 = 0; i18 < i17; i18++) {
                ((gl) objArr6[i18]).a();
            }
        }
    }

    public final wr i() {
        ib1 j = pb1.j();
        return h((wr) pb1.i(this.h, j), j, false, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        wr wrVar = (wr) pb1.h(this.h);
        sb.append(wrVar.c(this, pb1.j()) ? String.valueOf(wrVar.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
