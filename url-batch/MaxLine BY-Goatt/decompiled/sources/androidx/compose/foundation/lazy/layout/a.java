package androidx.compose.foundation.lazy.layout;

import defpackage.cm1;
import defpackage.gb1;
import defpackage.hb1;
import defpackage.ib1;
import defpackage.ka1;
import defpackage.n12;
import defpackage.nb1;
import defpackage.oa1;
import defpackage.oe2;
import defpackage.pe2;
import defpackage.q40;
import defpackage.qb2;
import defpackage.tn1;
import defpackage.ul1;
import defpackage.un1;
import defpackage.uv;
import defpackage.vl1;
import defpackage.yf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a {
    public final tn1 a;
    public nb1 b;
    public final un1 c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final vl1 i;

    public a() {
        long[] jArr = oe2.a;
        this.a = new tn1();
        int i = pe2.a;
        this.c = new un1();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new cm1(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement
            public final a a;

            {
                this.a = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && this.a == ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @Override // defpackage.cm1
            public final ul1 i() {
                gb1 gb1Var = new gb1();
                gb1Var.A = this.a;
                return gb1Var;
            }

            @Override // defpackage.cm1
            public final void m(ul1 ul1Var) {
                gb1 gb1Var = (gb1) ul1Var;
                a aVar = gb1Var.A;
                a aVar2 = this.a;
                if (Intrinsics.b(aVar, aVar2) || !gb1Var.m.z) {
                    return;
                }
                gb1Var.A.c();
                gb1Var.A = aVar2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
            }
        };
    }

    public static int d(int[] iArr, oa1 oa1Var) {
        int i = oa1Var.i;
        int i2 = oa1Var.j + i;
        int i3 = 0;
        while (i < i2) {
            int i4 = iArr[i] + oa1Var.l;
            iArr[i] = i4;
            i3 = Math.max(i3, i4);
            i++;
        }
        return i3;
    }

    public final long a() {
        ArrayList arrayList = this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        q40.t(arrayList.get(0));
        throw null;
    }

    public final void b(int i, int i2, ArrayList arrayList, yf yfVar, ka1 ka1Var, int i3, int i4, int i5) {
        char c;
        int i6;
        long j;
        int i7;
        int i8;
        char c2;
        nb1 nb1Var = this.b;
        this.b = yfVar;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            oa1 oa1Var = (oa1) arrayList.get(i9);
            int size2 = oa1Var.e.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((n12) oa1Var.e.get(i10)).i();
            }
        }
        tn1 tn1Var = this.a;
        if (tn1Var.i()) {
            c();
            return;
        }
        Object[] objArr = tn1Var.b;
        long[] jArr = tn1Var.a;
        int length = jArr.length - 2;
        char c3 = 7;
        un1 un1Var = this.c;
        if (length >= 0) {
            j = 255;
            int i11 = 0;
            while (true) {
                long j2 = jArr[i11];
                Object[] objArr2 = objArr;
                i6 = 0;
                if ((((~j2) << c3) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j2 & 255) < 128) {
                            c2 = c3;
                            un1Var.a(objArr2[(i11 << 3) + i13]);
                        } else {
                            c2 = c3;
                        }
                        j2 >>= 8;
                        i13++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                objArr = objArr2;
                c3 = c;
            }
        } else {
            c = 7;
            i6 = 0;
            j = 255;
        }
        int size3 = arrayList.size();
        for (int i14 = i6; i14 < size3; i14++) {
            oa1 oa1Var2 = (oa1) arrayList.get(i14);
            Object obj = oa1Var2.b;
            List list = oa1Var2.e;
            un1Var.k(obj);
            int size4 = list.size();
            for (int i15 = i6; i15 < size4; i15++) {
                ((n12) list.get(i15)).i();
            }
            q40.t(tn1Var.k(oa1Var2.b));
        }
        int[] iArr = new int[i3];
        for (int i16 = i6; i16 < i3; i16++) {
            iArr[i16] = i6;
        }
        ArrayList arrayList2 = this.e;
        ArrayList arrayList3 = this.d;
        int i17 = 1;
        if (nb1Var != null) {
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    uv.n(arrayList3, new hb1(nb1Var, i17));
                }
                if (arrayList3.size() > 0) {
                    oa1 oa1Var3 = (oa1) arrayList3.get(i6);
                    d(iArr, oa1Var3);
                    Object g = tn1Var.g(oa1Var3.b);
                    g.getClass();
                    q40.t(g);
                    throw null;
                }
                int i18 = i6;
                Arrays.fill(iArr, i18, i3, i18);
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    i8 = 0;
                    uv.n(arrayList2, new hb1(nb1Var, i8));
                } else {
                    i8 = 0;
                }
                if (arrayList2.size() > 0) {
                    oa1 oa1Var4 = (oa1) arrayList2.get(i8);
                    d(iArr, oa1Var4);
                    Object g2 = tn1Var.g(oa1Var4.b);
                    g2.getClass();
                    q40.t(g2);
                    throw null;
                }
                Arrays.fill(iArr, i8, i3, i8);
            }
        }
        Object[] objArr3 = un1Var.b;
        long[] jArr2 = un1Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i19 = 0;
            while (true) {
                long j3 = jArr2[i19];
                long[] jArr3 = jArr2;
                if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i20 = 8 - ((~(i19 - length2)) >>> 31);
                    long j4 = j3;
                    for (int i21 = 0; i21 < i20; i21++) {
                        if ((j4 & j) < 128) {
                            Object obj2 = objArr3[(i19 << 3) + i21];
                            Object g3 = tn1Var.g(obj2);
                            g3.getClass();
                            q40.t(g3);
                            yfVar.a(obj2);
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i20 != 8) {
                        break;
                    }
                }
                if (i19 == length2) {
                    break;
                }
                i19++;
                jArr2 = jArr3;
            }
        }
        ArrayList arrayList4 = this.f;
        if (!arrayList4.isEmpty()) {
            int i22 = 1;
            if (arrayList4.size() > 1) {
                uv.n(arrayList4, new ib1(yfVar, i22));
            }
            if (arrayList4.size() > 0) {
                oa1 oa1Var5 = (oa1) arrayList4.get(0);
                Object g4 = tn1Var.g(oa1Var5.b);
                g4.getClass();
                q40.t(g4);
                d(iArr, oa1Var5);
                throw null;
            }
            Arrays.fill(iArr, 0, i3, 0);
        }
        ArrayList arrayList5 = this.g;
        if (arrayList5.isEmpty()) {
            i7 = 0;
        } else {
            if (arrayList5.size() > 1) {
                i7 = 0;
                uv.n(arrayList5, new ib1(yfVar, i7));
            } else {
                i7 = 0;
            }
            if (arrayList5.size() > 0) {
                oa1 oa1Var6 = (oa1) arrayList5.get(i7);
                Object g5 = tn1Var.g(oa1Var6.b);
                g5.getClass();
                q40.t(g5);
                d(iArr, oa1Var6);
                throw null;
            }
        }
        Collections.reverse(arrayList4);
        Unit unit = Unit.a;
        arrayList.addAll(i7, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList3.clear();
        arrayList2.clear();
        arrayList4.clear();
        arrayList5.clear();
        un1Var.b();
    }

    public final void c() {
        tn1 tn1Var = this.a;
        if (tn1Var.j()) {
            Object[] objArr = tn1Var.c;
            long[] jArr = tn1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                q40.t(objArr[(i << 3) + i3]);
                                throw null;
                            }
                            j >>= 8;
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
            tn1Var.a();
        }
        this.b = qb2.V;
    }
}
