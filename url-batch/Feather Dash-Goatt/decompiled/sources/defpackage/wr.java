package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wr extends ie1 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public ln0 e;
    public Object f;
    public int g;

    public wr(long j) {
        super(j);
        ln0 ln0Var = qq0.a;
        ln0Var.getClass();
        this.e = ln0Var;
        this.f = h;
    }

    @Override // defpackage.ie1
    public final void a(ie1 ie1Var) {
        ie1Var.getClass();
        wr wrVar = (wr) ie1Var;
        this.e = wrVar.e;
        this.f = wrVar.f;
        this.g = wrVar.g;
    }

    @Override // defpackage.ie1
    public final ie1 b(long j) {
        return new wr(j);
    }

    public final boolean c(xr xrVar, ib1 ib1Var) {
        boolean z;
        boolean z2;
        Object obj = pb1.c;
        synchronized (obj) {
            z = true;
            if (this.c == ib1Var.g()) {
                if (this.d == ib1Var.h()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.f == h || (z2 && this.g != d(xrVar, ib1Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = ib1Var.g();
            this.d = ib1Var.h();
        }
        return z;
    }

    public final int d(xr xrVar, ib1 ib1Var) {
        ln0 ln0Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ie1 i7;
        synchronized (pb1.c) {
            ln0Var = this.e;
        }
        int i8 = 7;
        if (ln0Var.e == 0) {
            return 7;
        }
        eo0 n = gb0.n();
        Object[] objArr = n.d;
        int i9 = n.g;
        boolean z = false;
        for (int i10 = 0; i10 < i9; i10++) {
            ((gl) objArr[i10]).b();
        }
        try {
            Object[] objArr2 = ln0Var.b;
            int[] iArr = ln0Var.c;
            long[] jArr = ln0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                i = 7;
                int i11 = 0;
                while (true) {
                    long j = jArr[i11];
                    if ((((~j) << i8) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = z ? 1 : 0;
                        while (i14 < i13) {
                            if ((255 & j) < 128) {
                                int i15 = (i11 << 3) + i14;
                                i4 = i8;
                                ge1 ge1Var = (ge1) objArr2[i15];
                                i6 = i12;
                                if (iArr[i15] != 1) {
                                    i5 = length;
                                } else {
                                    if (ge1Var instanceof xr) {
                                        xr xrVar2 = (xr) ge1Var;
                                        i7 = xrVar2.h((wr) pb1.i(xrVar2.h, ib1Var), ib1Var, z, xrVar2.e);
                                    } else {
                                        i7 = pb1.i(ge1Var.a(), ib1Var);
                                    }
                                    i5 = length;
                                    i = (((i * 31) + System.identityHashCode(i7)) * 31) + Long.hashCode(i7.a);
                                }
                            } else {
                                i4 = i8;
                                i5 = length;
                                i6 = i12;
                            }
                            j >>= i6;
                            i14++;
                            i8 = i4;
                            i12 = i6;
                            length = i5;
                            z = false;
                        }
                        i2 = i8;
                        i3 = length;
                        if (i13 != i12) {
                            break;
                        }
                    } else {
                        i2 = i8;
                        i3 = length;
                    }
                    if (i11 == i3) {
                        i8 = i;
                        break;
                    }
                    i11++;
                    i8 = i2;
                    length = i3;
                    z = false;
                }
            }
            i = i8;
            Object[] objArr3 = n.d;
            int i16 = n.g;
            for (int i17 = 0; i17 < i16; i17++) {
                ((gl) objArr3[i17]).a();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr4 = n.d;
            int i18 = n.g;
            for (int i19 = 0; i19 < i18; i19++) {
                ((gl) objArr4[i19]).a();
            }
            throw th;
        }
    }
}
