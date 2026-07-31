package androidx.compose.foundation.lazy.layout;

import a0.b1;
import a0.q;
import a0.r;
import a0.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import o.j0;
import o.k0;
import o.r0;
import o.s0;
import q6.i;
import u1.l0;
import w1.x0;
import y0.l;
import y0.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f513a;

    /* renamed from: b, reason: collision with root package name */
    public b1 f514b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f515c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f516d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f517e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f518f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f519g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f520h;
    public final m i;

    public b() {
        long[] jArr = r0.f5528a;
        this.f513a = new j0();
        k0 k0Var = s0.f5536a;
        this.f515c = new k0();
        this.f516d = new ArrayList();
        this.f517e = new ArrayList();
        this.f518f = new ArrayList();
        this.f519g = new ArrayList();
        this.f520h = new ArrayList();
        this.i = new x0(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* renamed from: a, reason: collision with root package name */
            public final b f507a;

            {
                this.f507a = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && i.a(this.f507a, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f507a);
            }

            @Override // w1.x0
            public final l f() {
                r rVar = new r();
                rVar.f134r = this.f507a;
                return rVar;
            }

            @Override // w1.x0
            public final void g(l lVar) {
                r rVar = (r) lVar;
                b bVar = rVar.f134r;
                b bVar2 = this.f507a;
                if (i.a(bVar, bVar2) || !rVar.f8706d.f8718q) {
                    return;
                }
                b bVar3 = rVar.f134r;
                bVar3.c();
                bVar3.f514b = null;
                rVar.f134r = bVar2;
            }

            public final int hashCode() {
                return this.f507a.hashCode();
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f507a + ')';
            }
        };
    }

    public static int e(int[] iArr, z.l lVar) {
        lVar.getClass();
        int i = iArr[0] + lVar.f9065k;
        iArr[0] = i;
        return Math.max(0, i);
    }

    public final long a() {
        ArrayList arrayList = this.f520h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        q.q(arrayList.get(0));
        throw null;
    }

    public final void b(int i, int i8, ArrayList arrayList, b1 b1Var, z.i iVar, boolean z3, boolean z7, int i9, int i10) {
        long j7;
        boolean z8;
        Throwable th;
        ArrayList arrayList2;
        char c8;
        int i11;
        j0 j0Var;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        Object[] objArr;
        Object[] objArr2;
        b1 b1Var2 = this.f514b;
        this.f514b = b1Var;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            z.l lVar = (z.l) arrayList.get(i15);
            int size2 = lVar.f9057b.size();
            for (int i16 = 0; i16 < size2; i16++) {
                ((l0) lVar.f9057b.get(i16)).g();
            }
        }
        j0 j0Var2 = this.f513a;
        if (j0Var2.i()) {
            c();
            return;
        }
        boolean z9 = z3 || !z7;
        Object[] objArr3 = j0Var2.f5483b;
        long[] jArr = j0Var2.f5482a;
        int length = jArr.length - 2;
        k0 k0Var = this.f515c;
        if (length >= 0) {
            int i17 = 0;
            j7 = 255;
            while (true) {
                long j8 = jArr[i17];
                int i18 = i17;
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8 - ((~(i18 - length)) >>> 31);
                    long j9 = j8;
                    for (int i20 = 0; i20 < i19; i20++) {
                        if ((j9 & 255) < 128) {
                            k0Var.a(objArr3[(i18 << 3) + i20]);
                        }
                        j9 >>= 8;
                    }
                    if (i19 != 8) {
                        break;
                    }
                }
                if (i18 == length) {
                    break;
                } else {
                    i17 = i18 + 1;
                }
            }
        } else {
            j7 = 255;
        }
        int size3 = arrayList.size();
        for (int i21 = 0; i21 < size3; i21++) {
            z.l lVar2 = (z.l) arrayList.get(i21);
            k0Var.l(lVar2.f9061f);
            int size4 = lVar2.f9057b.size();
            for (int i22 = 0; i22 < size4; i22++) {
                ((l0) lVar2.f9057b.get(i22)).g();
            }
            q.q(this.f513a.k(lVar2.f9061f));
        }
        int[] iArr2 = new int[1];
        ArrayList arrayList3 = this.f517e;
        ArrayList arrayList4 = this.f516d;
        if (z9 && b1Var2 != null) {
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    d6.q.N(arrayList4, new s(b1Var2, 2));
                }
                if (arrayList4.size() > 0) {
                    z.l lVar3 = (z.l) arrayList4.get(0);
                    e(iArr2, lVar3);
                    Object g3 = j0Var2.g(lVar3.f9061f);
                    i.b(g3);
                    q.q(g3);
                    lVar3.a(0);
                    throw null;
                }
                Arrays.fill(iArr2, 0, 1, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    d6.q.N(arrayList3, new s(b1Var2, 0));
                }
                if (arrayList3.size() > 0) {
                    z.l lVar4 = (z.l) arrayList3.get(0);
                    e(iArr2, lVar4);
                    Object g7 = j0Var2.g(lVar4.f9061f);
                    i.b(g7);
                    q.q(g7);
                    lVar4.a(0);
                    throw null;
                }
                Arrays.fill(iArr2, 0, 1, 0);
            }
        }
        Object[] objArr4 = k0Var.f5490b;
        long[] jArr2 = k0Var.f5489a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            th = null;
            arrayList2 = arrayList3;
            int i23 = 0;
            while (true) {
                long j10 = jArr2[i23];
                long[] jArr3 = jArr2;
                z8 = z9;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i24 = 8 - ((~(i23 - length2)) >>> 31);
                    int i25 = 0;
                    while (i25 < i24) {
                        if ((j10 & j7) < 128) {
                            objArr2 = objArr4;
                            q.q(j0Var2.g(objArr2[(i23 << 3) + i25]));
                        } else {
                            objArr2 = objArr4;
                        }
                        j10 >>= 8;
                        i25++;
                        objArr4 = objArr2;
                    }
                    objArr = objArr4;
                    if (i24 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr4;
                }
                if (i23 == length2) {
                    break;
                }
                i23++;
                z9 = z8;
                jArr2 = jArr3;
                objArr4 = objArr;
            }
        } else {
            z8 = z9;
            th = null;
            arrayList2 = arrayList3;
        }
        ArrayList arrayList5 = this.f518f;
        if (arrayList5.isEmpty()) {
            c8 = ' ';
            i11 = 1;
        } else {
            if (arrayList5.size() > 1) {
                d6.q.N(arrayList5, new s(b1Var, 3));
            }
            int size5 = arrayList5.size();
            int i26 = 0;
            while (i26 < size5) {
                z.l lVar5 = (z.l) arrayList5.get(i26);
                Object g8 = j0Var2.g(lVar5.f9061f);
                i.b(g8);
                q.q(g8);
                int e8 = e(iArr2, lVar5);
                if (z3) {
                    i13 = size5;
                    i14 = (int) (((z.l) d6.m.R(arrayList)).a(0) >> 32);
                } else {
                    i13 = size5;
                    i14 = 0;
                }
                lVar5.c(i14 - e8, i, i8);
                if (z8) {
                    d(lVar5, true);
                    throw th;
                }
                i26++;
                size5 = i13;
            }
            c8 = ' ';
            i11 = 1;
            Arrays.fill(iArr2, 0, 1, 0);
        }
        ArrayList arrayList6 = this.f519g;
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > i11) {
                d6.q.N(arrayList6, new s(b1Var, 1));
            }
            int size6 = arrayList6.size();
            int i27 = 0;
            while (i27 < size6) {
                z.l lVar6 = (z.l) arrayList6.get(i27);
                Object g9 = j0Var2.g(lVar6.f9061f);
                i.b(g9);
                q.q(g9);
                int e9 = e(iArr2, lVar6);
                if (z3) {
                    z.l lVar7 = (z.l) d6.m.X(arrayList);
                    j0Var = j0Var2;
                    iArr = iArr2;
                    i12 = ((int) (lVar7.a(0) >> c8)) + lVar7.f9065k;
                } else {
                    j0Var = j0Var2;
                    iArr = iArr2;
                    i12 = 0;
                }
                lVar6.c((i12 - lVar6.f9065k) + e9, i, i8);
                if (z8) {
                    d(lVar6, true);
                    throw th;
                }
                i27++;
                iArr2 = iArr;
                j0Var2 = j0Var;
            }
        }
        Collections.reverse(arrayList5);
        arrayList.addAll(0, arrayList5);
        arrayList.addAll(arrayList6);
        arrayList4.clear();
        arrayList2.clear();
        arrayList5.clear();
        arrayList6.clear();
        k0Var.b();
    }

    public final void c() {
        j0 j0Var = this.f513a;
        if (j0Var.j()) {
            Object[] objArr = j0Var.f5484c;
            long[] jArr = j0Var.f5482a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j7 = jArr[i];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j7) < 128) {
                                q.q(objArr[(i << 3) + i9]);
                                throw null;
                            }
                            j7 >>= 8;
                        }
                        if (i8 != 8) {
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
            j0Var.a();
        }
    }

    public final void d(z.l lVar, boolean z3) {
        Object g3 = this.f513a.g(lVar.f9061f);
        i.b(g3);
        q.q(g3);
        throw null;
    }
}
