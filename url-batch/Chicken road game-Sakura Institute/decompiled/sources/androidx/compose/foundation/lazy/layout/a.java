package androidx.compose.foundation.lazy.layout;

import e6.q;
import i.b0;
import i.e0;
import i.f0;
import i.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p1.n0;
import r.m;
import r1.s0;
import r6.i;
import r6.k;
import s.f;
import s.l;
import s.r;
import s0.n;
import s0.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final x f651a;

    /* renamed from: b, reason: collision with root package name */
    public r f652b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f653c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f654d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f655e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f656f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f657g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f658h;

    /* renamed from: i, reason: collision with root package name */
    public final o f659i;

    public a() {
        long[] jArr = e0.f4736a;
        this.f651a = new x();
        int i7 = f0.f4740a;
        this.f653c = new b0();
        this.f654d = new ArrayList();
        this.f655e = new ArrayList();
        this.f656f = new ArrayList();
        this.f657g = new ArrayList();
        this.f658h = new ArrayList();
        this.f659i = new s0(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* renamed from: a, reason: collision with root package name */
            public final a f645a;

            {
                this.f645a = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && k.a(this.f645a, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f645a);
            }

            public final int hashCode() {
                return this.f645a.hashCode();
            }

            @Override // r1.s0
            public final n l() {
                l lVar = new l();
                lVar.f8035s = this.f645a;
                return lVar;
            }

            @Override // r1.s0
            public final void m(n nVar) {
                l lVar = (l) nVar;
                a aVar = lVar.f8035s;
                a aVar2 = this.f645a;
                if (k.a(aVar, aVar2) || !lVar.f8104f.f8116r) {
                    return;
                }
                lVar.f8035s.c();
                lVar.f8035s = aVar2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f645a + ')';
            }
        };
    }

    public static int e(int[] iArr, m mVar) {
        mVar.getClass();
        int i7 = iArr[0] + mVar.f7657l;
        iArr[0] = i7;
        return Math.max(0, i7);
    }

    public final long a() {
        ArrayList arrayList = this.f658h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        i.e(arrayList.get(0));
        throw null;
    }

    public final void b(int i7, int i8, ArrayList arrayList, a0.l lVar, r.i iVar, boolean z8, boolean z9, int i9, int i10) {
        long j8;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j9;
        int i11;
        r rVar = this.f652b;
        this.f652b = lVar;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            m mVar = (m) arrayList.get(i12);
            int size2 = mVar.f7647b.size();
            for (int i13 = 0; i13 < size2; i13++) {
                ((n0) mVar.f7647b.get(i13)).g();
            }
        }
        x xVar = this.f651a;
        if (xVar.f4816e == 0) {
            c();
            return;
        }
        boolean z10 = z8 || !z9;
        Object[] objArr = xVar.f4813b;
        long[] jArr = xVar.f4812a;
        int length = jArr.length - 2;
        b0 b0Var = this.f653c;
        if (length >= 0) {
            int i14 = 0;
            j8 = 255;
            while (true) {
                long j10 = jArr[i14];
                int i15 = i14;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    long j11 = j10;
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j11 & 255) < 128) {
                            b0Var.a(objArr[(i15 << 3) + i17]);
                        }
                        j11 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                }
                if (i15 == length) {
                    break;
                } else {
                    i14 = i15 + 1;
                }
            }
        } else {
            j8 = 255;
        }
        int size3 = arrayList.size();
        for (int i18 = 0; i18 < size3; i18++) {
            m mVar2 = (m) arrayList.get(i18);
            b0Var.j(mVar2.f7652g);
            int size4 = mVar2.f7647b.size();
            for (int i19 = 0; i19 < size4; i19++) {
                ((n0) mVar2.f7647b.get(i19)).g();
            }
            i.e(this.f651a.g(mVar2.f7652g));
        }
        int[] iArr = {0};
        ArrayList arrayList4 = this.f655e;
        ArrayList arrayList5 = this.f654d;
        if (z10 && rVar != null) {
            if (!arrayList5.isEmpty()) {
                if (arrayList5.size() > 1) {
                    q.b0(arrayList5, new s.m(rVar, 1));
                }
                if (arrayList5.size() > 0) {
                    m mVar3 = (m) arrayList5.get(0);
                    e(iArr, mVar3);
                    Object e9 = xVar.e(mVar3.f7652g);
                    k.c(e9);
                    i.e(e9);
                    mVar3.a(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    q.b0(arrayList4, new s.m(rVar, 0));
                }
                if (arrayList4.size() > 0) {
                    m mVar4 = (m) arrayList4.get(0);
                    e(iArr, mVar4);
                    Object e10 = xVar.e(mVar4.f7652g);
                    k.c(e10);
                    i.e(e10);
                    mVar4.a(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, 1, 0);
            }
        }
        Object[] objArr2 = b0Var.f4722b;
        long[] jArr2 = b0Var.f4721a;
        int length2 = jArr2.length - 2;
        boolean z11 = z10;
        if (length2 >= 0) {
            int i20 = 0;
            while (true) {
                long j12 = jArr2[i20];
                arrayList2 = arrayList4;
                arrayList3 = arrayList5;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i21 = 8;
                    int i22 = 8 - ((~(i20 - length2)) >>> 31);
                    long j13 = j12;
                    int i23 = 0;
                    while (i23 < i22) {
                        if ((j13 & j8) < 128) {
                            Object obj = objArr2[(i20 << 3) + i23];
                            Object e11 = xVar.e(obj);
                            k.c(e11);
                            i.e(e11);
                            lVar.b(obj);
                            throw null;
                        }
                        j13 >>= i21;
                        i23++;
                        i21 = 8;
                    }
                    if (i22 != i21) {
                        break;
                    }
                }
                if (i20 == length2) {
                    break;
                }
                i20++;
                arrayList4 = arrayList2;
                arrayList5 = arrayList3;
            }
        } else {
            arrayList2 = arrayList4;
            arrayList3 = arrayList5;
        }
        ArrayList arrayList6 = this.f656f;
        if (arrayList6.isEmpty()) {
            j9 = 4294967295L;
            i11 = 1;
        } else {
            if (arrayList6.size() > 1) {
                q.b0(arrayList6, new s.n(lVar, 1));
            }
            int size5 = arrayList6.size();
            for (int i24 = 0; i24 < size5; i24++) {
                m mVar5 = (m) arrayList6.get(i24);
                Object e12 = xVar.e(mVar5.f7652g);
                k.c(e12);
                i.e(e12);
                mVar5.c((z8 ? (int) (((m) e6.l.h0(arrayList)).a(0) & 4294967295L) : 0) - e(iArr, mVar5), i7, i8);
                if (z11) {
                    d(mVar5, true);
                    throw null;
                }
            }
            j9 = 4294967295L;
            i11 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        ArrayList arrayList7 = this.f657g;
        if (!arrayList7.isEmpty()) {
            if (arrayList7.size() > i11) {
                q.b0(arrayList7, new s.n(lVar, 0));
            }
            int size6 = arrayList7.size();
            for (int i25 = 0; i25 < size6; i25++) {
                m mVar6 = (m) arrayList7.get(i25);
                Object e13 = xVar.e(mVar6.f7652g);
                k.c(e13);
                i.e(e13);
                mVar6.c((z8 ? (int) (((m) e6.l.n0(arrayList)).a(0) & j9) : 0 - mVar6.f7657l) + e(iArr, mVar6), i7, i8);
                if (z11) {
                    d(mVar6, true);
                    throw null;
                }
            }
        }
        Collections.reverse(arrayList6);
        arrayList.addAll(0, arrayList6);
        arrayList.addAll(arrayList7);
        arrayList3.clear();
        arrayList2.clear();
        arrayList6.clear();
        arrayList7.clear();
        b0Var.b();
    }

    public final void c() {
        x xVar = this.f651a;
        if (xVar.f4816e != 0) {
            Object[] objArr = xVar.f4814c;
            long[] jArr = xVar.f4812a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j8 = jArr[i7];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j8) < 128) {
                                i.e(objArr[(i7 << 3) + i9]);
                                throw null;
                            }
                            j8 >>= 8;
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
            xVar.a();
        }
        this.f652b = f.f8002g;
    }

    public final void d(m mVar, boolean z8) {
        Object e9 = this.f651a.e(mVar.f7652g);
        k.c(e9);
        i.e(e9);
        throw null;
    }
}
