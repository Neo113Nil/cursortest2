package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ha0 extends ap2 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public hn1 e;
    public Object f;
    public int g;

    public ha0(long j) {
        super(j);
        hn1 hn1Var = nt1.a;
        hn1Var.getClass();
        this.e = hn1Var;
        this.f = h;
    }

    @Override // defpackage.ap2
    public final void a(ap2 ap2Var) {
        ap2Var.getClass();
        ha0 ha0Var = (ha0) ap2Var;
        this.e = ha0Var.e;
        this.f = ha0Var.f;
        this.g = ha0Var.g;
    }

    @Override // defpackage.ap2
    public final ap2 b(long j) {
        return new ha0(j);
    }

    public final boolean c(ia0 ia0Var, nm2 nm2Var) {
        boolean z;
        boolean z2;
        Object obj = tm2.c;
        synchronized (obj) {
            z = true;
            if (this.c == nm2Var.g()) {
                if (this.d == nm2Var.h()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.f == h || (z2 && this.g != d(ia0Var, nm2Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = nm2Var.g();
            this.d = nm2Var.h();
            Unit unit = Unit.a;
        }
        return z;
    }

    public final int d(ia0 ia0Var, nm2 nm2Var) {
        hn1 hn1Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ap2 j;
        synchronized (tm2.c) {
            hn1Var = this.e;
        }
        int i7 = 7;
        if (hn1Var.e == 0) {
            return 7;
        }
        eo1 d = ij2.d();
        Object[] objArr = d.m;
        int i8 = d.o;
        boolean z = false;
        for (int i9 = 0; i9 < i8; i9++) {
            ((yz) objArr[i9]).b();
        }
        try {
            Object[] objArr2 = hn1Var.b;
            int[] iArr = hn1Var.c;
            long[] jArr = hn1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                i = 7;
                int i10 = 0;
                while (true) {
                    long j2 = jArr[i10];
                    if ((((~j2) << i7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8;
                        int i12 = 8 - ((~(i10 - length)) >>> 31);
                        int i13 = z ? 1 : 0;
                        while (i13 < i12) {
                            if ((255 & j2) < 128) {
                                int i14 = (i10 << 3) + i13;
                                i4 = i7;
                                yo2 yo2Var = (yo2) objArr2[i14];
                                i6 = i11;
                                if (iArr[i14] != 1) {
                                    i5 = length;
                                } else {
                                    if (yo2Var instanceof ia0) {
                                        ia0 ia0Var2 = (ia0) yo2Var;
                                        j = ia0Var2.h((ha0) tm2.j(ia0Var2.p, nm2Var), nm2Var, z, ia0Var2.n);
                                    } else {
                                        j = tm2.j(yo2Var.a(), nm2Var);
                                    }
                                    i5 = length;
                                    i = (((i * 31) + System.identityHashCode(j)) * 31) + Long.hashCode(j.a);
                                }
                            } else {
                                i4 = i7;
                                i5 = length;
                                i6 = i11;
                            }
                            j2 >>= i6;
                            i13++;
                            i7 = i4;
                            i11 = i6;
                            length = i5;
                            z = false;
                        }
                        i2 = i7;
                        i3 = length;
                        if (i12 != i11) {
                            break;
                        }
                    } else {
                        i2 = i7;
                        i3 = length;
                    }
                    if (i10 == i3) {
                        i7 = i;
                        break;
                    }
                    i10++;
                    i7 = i2;
                    length = i3;
                    z = false;
                }
            }
            i = i7;
            Unit unit = Unit.a;
            Object[] objArr3 = d.m;
            int i15 = d.o;
            for (int i16 = 0; i16 < i15; i16++) {
                ((yz) objArr3[i16]).a();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr4 = d.m;
            int i17 = d.o;
            for (int i18 = 0; i18 < i17; i18++) {
                ((yz) objArr4[i18]).a();
            }
            throw th;
        }
    }
}
