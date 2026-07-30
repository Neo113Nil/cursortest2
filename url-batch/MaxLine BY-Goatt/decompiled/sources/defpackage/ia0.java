package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ia0 extends zo2 implements so2 {
    public final Function0 n;
    public final zm2 o;
    public ha0 p = new ha0(tm2.k().g());

    public ia0(zm2 zm2Var, Function0 function0) {
        this.n = function0;
        this.o = zm2Var;
    }

    @Override // defpackage.yo2
    public final ap2 a() {
        return this.p;
    }

    @Override // defpackage.yo2
    public final void d(ap2 ap2Var) {
        ap2Var.getClass();
        this.p = (ha0) ap2Var;
    }

    @Override // defpackage.so2
    public final Object getValue() {
        Function1 e = tm2.k().e();
        if (e != null) {
            e.invoke(this);
        }
        nm2 k = tm2.k();
        return h((ha0) tm2.j(this.p, k), k, true, this.n).f;
    }

    public final ha0 h(ha0 ha0Var, nm2 nm2Var, boolean z, Function0 function0) {
        eo1 d;
        zm2 zm2Var;
        int i;
        ha0 ha0Var2 = ha0Var;
        if (ha0Var2.c(this, nm2Var)) {
            if (z) {
                d = ij2.d();
                Object[] objArr = d.m;
                int i2 = d.o;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((yz) objArr[i3]).b();
                }
                try {
                    hn1 hn1Var = ha0Var2.e;
                    mh mhVar = an2.a;
                    v31 v31Var = (v31) mhVar.get();
                    if (v31Var == null) {
                        v31Var = new v31();
                        mhVar.E(v31Var);
                    }
                    int i4 = v31Var.a;
                    Object[] objArr2 = hn1Var.b;
                    int[] iArr = hn1Var.c;
                    long[] jArr = hn1Var.a;
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
                                        yo2 yo2Var = (yo2) objArr2[i9];
                                        i = i6;
                                        v31Var.a = i4 + iArr[i9];
                                        Function1 e = nm2Var.e();
                                        if (e != null) {
                                            e.invoke(yo2Var);
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
                    v31Var.a = i4;
                    Unit unit = Unit.a;
                    Object[] objArr3 = d.m;
                    int i10 = d.o;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((yz) objArr3[i11]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return ha0Var2;
        }
        final hn1 hn1Var2 = new hn1();
        mh mhVar2 = an2.a;
        final v31 v31Var2 = (v31) mhVar2.get();
        if (v31Var2 == null) {
            v31Var2 = new v31();
            mhVar2.E(v31Var2);
        }
        final int i12 = v31Var2.a;
        d = ij2.d();
        Object[] objArr4 = d.m;
        int i13 = d.o;
        for (int i14 = 0; i14 < i13; i14++) {
            ((yz) objArr4[i14]).b();
        }
        try {
            v31Var2.a = i12 + 1;
            Object g = ci2.g(function0, new Function1() { // from class: ga0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    if (obj == ia0.this) {
                        lh.g("A derived state calculation cannot read itself");
                        return null;
                    }
                    if (obj instanceof yo2) {
                        int i15 = v31Var2.a - i12;
                        hn1 hn1Var3 = hn1Var2;
                        int d2 = hn1Var3.d(obj);
                        hn1Var3.h(Math.min(i15, d2 >= 0 ? hn1Var3.c[d2] : Integer.MAX_VALUE), obj);
                    }
                    return Unit.a;
                }
            });
            v31Var2.a = i12;
            Object[] objArr5 = d.m;
            int i15 = d.o;
            for (int i16 = 0; i16 < i15; i16++) {
                ((yz) objArr5[i16]).a();
            }
            Object obj = tm2.c;
            synchronized (obj) {
                try {
                    nm2 k = tm2.k();
                    Object obj2 = ha0Var2.f;
                    if (obj2 == ha0.h || (zm2Var = this.o) == null || !zm2Var.d(g, obj2)) {
                        ha0 ha0Var3 = this.p;
                        synchronized (obj) {
                            ap2 m = tm2.m(ha0Var3, this);
                            m.a(ha0Var3);
                            m.a = k.g();
                            ha0Var2 = (ha0) m;
                            ha0Var2.e = hn1Var2;
                            ha0Var2.g = ha0Var2.d(this, k);
                            ha0Var2.f = g;
                        }
                        return ha0Var2;
                    }
                    ha0Var2.e = hn1Var2;
                    ha0Var2.g = ha0Var2.d(this, k);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            v31 v31Var3 = (v31) an2.a.get();
            if (v31Var3 == null || v31Var3.a != 0) {
                return ha0Var2;
            }
            tm2.k().m();
            synchronized (obj) {
                nm2 k2 = tm2.k();
                ha0Var2.c = k2.g();
                ha0Var2.d = k2.h();
                Unit unit2 = Unit.a;
                return ha0Var2;
            }
        } finally {
            Object[] objArr6 = d.m;
            int i17 = d.o;
            for (int i18 = 0; i18 < i17; i18++) {
                ((yz) objArr6[i18]).a();
            }
        }
    }

    public final ha0 i() {
        nm2 k = tm2.k();
        return h((ha0) tm2.j(this.p, k), k, false, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        ha0 ha0Var = (ha0) tm2.i(this.p);
        sb.append(ha0Var.c(this, tm2.k()) ? String.valueOf(ha0Var.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
