package androidx.compose.foundation.lazy.layout;

import A.k;
import B.C0011l;
import S1.l;
import U.p;
import U.q;
import f2.j;
import j.AbstractC0522D;
import j.AbstractC0523E;
import j.C0519A;
import j.C0550x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import r0.AbstractC0893O;
import s.C0941j;
import s.C0944m;
import t.C0979g;
import t.C0985m;
import t.o;
import t.t;
import t0.U;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0550x f4839a;

    /* renamed from: b, reason: collision with root package name */
    public t f4840b;

    /* renamed from: c, reason: collision with root package name */
    public final C0519A f4841c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4842d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4843e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4844f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4845g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4846h;

    /* renamed from: i, reason: collision with root package name */
    public final q f4847i;

    public a() {
        long[] jArr = AbstractC0522D.f6254a;
        this.f4839a = new C0550x();
        int i3 = AbstractC0523E.f6255a;
        this.f4841c = new C0519A();
        this.f4842d = new ArrayList();
        this.f4843e = new ArrayList();
        this.f4844f = new ArrayList();
        this.f4845g = new ArrayList();
        this.f4846h = new ArrayList();
        this.f4847i = new U(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* renamed from: a, reason: collision with root package name */
            public final a f4832a;

            {
                this.f4832a = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && j.a(this.f4832a, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f4832a);
            }

            public final int hashCode() {
                return this.f4832a.hashCode();
            }

            @Override // t0.U
            public final p l() {
                C0985m c0985m = new C0985m();
                c0985m.f8492q = this.f4832a;
                return c0985m;
            }

            @Override // t0.U
            public final void m(p pVar) {
                C0985m c0985m = (C0985m) pVar;
                a aVar = c0985m.f8492q;
                a aVar2 = this.f4832a;
                if (j.a(aVar, aVar2) || !c0985m.f4489d.f4501p) {
                    return;
                }
                c0985m.f8492q.c();
                aVar2.getClass();
                c0985m.f8492q = aVar2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f4832a + ')';
            }
        };
    }

    public static int e(int[] iArr, C0944m c0944m) {
        c0944m.getClass();
        int i3 = iArr[0] + c0944m.f8297m;
        iArr[0] = i3;
        return Math.max(0, i3);
    }

    public final long a() {
        ArrayList arrayList = this.f4846h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        k.r(arrayList.get(0));
        throw null;
    }

    public final void b(int i3, int i4, ArrayList arrayList, C0011l c0011l, C0941j c0941j, boolean z3, boolean z4, int i5, int i6) {
        ArrayList arrayList2;
        boolean z5;
        int i7;
        int i8;
        C0519A c0519a;
        int i9;
        t tVar = this.f4840b;
        this.f4840b = c0011l;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0944m c0944m = (C0944m) arrayList.get(i10);
            int size2 = c0944m.f8286b.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((AbstractC0893O) c0944m.f8286b.get(i11)).t();
            }
        }
        C0550x c0550x = this.f4839a;
        if (c0550x.f6348e == 0) {
            c();
            return;
        }
        boolean z6 = z3 || !z4;
        Object[] objArr = c0550x.f6345b;
        long[] jArr = c0550x.f6344a;
        int length = jArr.length - 2;
        long j3 = 255;
        C0519A c0519a2 = this.f4841c;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j4 = jArr[i12];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j4 & j3) < 128) {
                            c0519a2.a(objArr[(i12 << 3) + i14]);
                        }
                        j4 >>= 8;
                        i14++;
                        j3 = 255;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                j3 = 255;
            }
        }
        int size3 = arrayList.size();
        for (int i15 = 0; i15 < size3; i15++) {
            C0944m c0944m2 = (C0944m) arrayList.get(i15);
            c0519a2.j(c0944m2.f8292h);
            int size4 = c0944m2.f8286b.size();
            for (int i16 = 0; i16 < size4; i16++) {
                ((AbstractC0893O) c0944m2.f8286b.get(i16)).t();
            }
        }
        int[] iArr = {0};
        ArrayList arrayList3 = this.f4843e;
        ArrayList arrayList4 = this.f4842d;
        if (z6 && tVar != null) {
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    S1.q.F0(arrayList4, new o(tVar, 1));
                }
                if (arrayList4.size() > 0) {
                    C0944m c0944m3 = (C0944m) arrayList4.get(0);
                    e(iArr, c0944m3);
                    Object e3 = c0550x.e(c0944m3.f8292h);
                    j.c(e3);
                    k.r(e3);
                    c0944m3.a(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    S1.q.F0(arrayList3, new o(tVar, 0));
                }
                if (arrayList3.size() > 0) {
                    C0944m c0944m4 = (C0944m) arrayList3.get(0);
                    e(iArr, c0944m4);
                    Object e4 = c0550x.e(c0944m4.f8292h);
                    j.c(e4);
                    k.r(e4);
                    c0944m4.a(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, 1, 0);
            }
        }
        Object[] objArr2 = c0519a2.f6248b;
        long[] jArr2 = c0519a2.f6247a;
        int length2 = jArr2.length - 2;
        ArrayList arrayList5 = this.f4845g;
        ArrayList arrayList6 = this.f4844f;
        if (length2 >= 0) {
            z5 = z6;
            int i17 = 0;
            while (true) {
                long j5 = jArr2[i17];
                arrayList2 = arrayList3;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8;
                    int i19 = 8 - ((~(i17 - length2)) >>> 31);
                    long j6 = j5;
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j6 & 255) < 128) {
                            Object obj = objArr2[(i17 << 3) + i20];
                            Object e5 = c0550x.e(obj);
                            j.c(e5);
                            k.r(e5);
                            c0011l.b(obj);
                            throw null;
                        }
                        j6 >>= i18;
                        i20++;
                        i18 = 8;
                    }
                    if (i19 != i18) {
                        break;
                    }
                }
                if (i17 == length2) {
                    break;
                }
                i17++;
                arrayList3 = arrayList2;
            }
        } else {
            arrayList2 = arrayList3;
            z5 = z6;
        }
        if (arrayList6.isEmpty()) {
            i7 = i3;
            i8 = i4;
            c0519a = c0519a2;
            i9 = 1;
        } else {
            if (arrayList6.size() > 1) {
                S1.q.F0(arrayList6, new t.p(c0011l, 1));
            }
            int size5 = arrayList6.size();
            int i21 = 0;
            while (i21 < size5) {
                C0944m c0944m5 = (C0944m) arrayList6.get(i21);
                Object e6 = c0550x.e(c0944m5.f8292h);
                j.c(e6);
                k.r(e6);
                int e7 = e(iArr, c0944m5);
                if (!z3) {
                    throw null;
                }
                C0519A c0519a3 = c0519a2;
                c0944m5.c(((int) (((C0944m) l.K0(arrayList)).a(0) & 4294967295L)) - e7, i3, i4);
                if (z5) {
                    d(c0944m5, true);
                    throw null;
                }
                i21++;
                c0519a2 = c0519a3;
            }
            i7 = i3;
            i8 = i4;
            c0519a = c0519a2;
            i9 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > i9) {
                S1.q.F0(arrayList5, new t.p(c0011l, 0));
            }
            int size6 = arrayList5.size();
            int i22 = 0;
            while (i22 < size6) {
                C0944m c0944m6 = (C0944m) arrayList5.get(i22);
                Object e8 = c0550x.e(c0944m6.f8292h);
                j.c(e8);
                k.r(e8);
                int e9 = e(iArr, c0944m6);
                if (!z3) {
                    throw null;
                }
                int[] iArr2 = iArr;
                int i23 = size6;
                c0944m6.c(((int) (((C0944m) l.Q0(arrayList)).a(0) & 4294967295L)) + e9, i7, i8);
                if (z5) {
                    d(c0944m6, true);
                    throw null;
                }
                i22++;
                size6 = i23;
                iArr = iArr2;
            }
        }
        Collections.reverse(arrayList6);
        arrayList.addAll(0, arrayList6);
        arrayList.addAll(arrayList5);
        arrayList4.clear();
        arrayList2.clear();
        arrayList6.clear();
        arrayList5.clear();
        c0519a.b();
    }

    public final void c() {
        C0550x c0550x = this.f4839a;
        if (c0550x.f6348e != 0) {
            Object[] objArr = c0550x.f6346c;
            long[] jArr = c0550x.f6344a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j3 = jArr[i3];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((255 & j3) < 128) {
                                k.r(objArr[(i3 << 3) + i5]);
                                throw null;
                            }
                            j3 >>= 8;
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
            c0550x.a();
        }
        this.f4840b = C0979g.f8477e;
    }

    public final void d(C0944m c0944m, boolean z3) {
        Object e3 = this.f4839a.e(c0944m.f8292h);
        j.c(e3);
        k.r(e3);
        throw null;
    }
}
