package androidx.compose.foundation.lazy.layout;

import A.C0016l;
import S.n;
import S.o;
import i.AbstractC0664E;
import i.AbstractC0665F;
import i.C0661B;
import i.y;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0954O;
import r.k;
import r0.B;
import r0.T;
import s.C1102f;
import s.C1108l;
import s.C1110n;
import s.C1111o;
import s.s;
import z2.C1399C;
import z2.C1403G;
import z2.C1436t;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final y f5094a;

    /* renamed from: b, reason: collision with root package name */
    public s f5095b;

    /* renamed from: c, reason: collision with root package name */
    public final C0661B f5096c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5097d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5098e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5099f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5100g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f5101h;

    /* renamed from: i, reason: collision with root package name */
    public final o f5102i;

    public a() {
        long[] jArr = AbstractC0664E.f6891a;
        this.f5094a = new y();
        int i2 = AbstractC0665F.f6892a;
        this.f5096c = new C0661B();
        this.f5097d = new ArrayList();
        this.f5098e = new ArrayList();
        this.f5099f = new ArrayList();
        this.f5100g = new ArrayList();
        this.f5101h = new ArrayList();
        this.f5102i = new T(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* renamed from: a, reason: collision with root package name */
            public final a f5087a;

            {
                this.f5087a = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && Intrinsics.a(this.f5087a, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f5087a);
            }

            public final int hashCode() {
                return this.f5087a.hashCode();
            }

            @Override // r0.T
            public final n l() {
                C1108l c1108l = new C1108l();
                c1108l.f9944t = this.f5087a;
                return c1108l;
            }

            @Override // r0.T
            public final void m(n nVar) {
                C1108l c1108l = (C1108l) nVar;
                a aVar = c1108l.f9944t;
                a aVar2 = this.f5087a;
                if (Intrinsics.a(aVar, aVar2) || !c1108l.f3978d.f3990s) {
                    return;
                }
                c1108l.f9944t.c();
                aVar2.getClass();
                c1108l.f9944t = aVar2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f5087a + ')';
            }
        };
    }

    public static int e(int[] iArr, r.o oVar) {
        oVar.getClass();
        int i2 = iArr[0] + oVar.f9531m;
        iArr[0] = i2;
        return Math.max(0, i2);
    }

    public final long a() {
        ArrayList arrayList = this.f5101h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        B.c(arrayList.get(0));
        throw null;
    }

    public final void b(int i2, int i4, ArrayList arrayList, C0016l c0016l, k kVar, boolean z4, boolean z5, int i5, int i6) {
        ArrayList arrayList2;
        boolean z6;
        int i7;
        int i8;
        ArrayList arrayList3;
        int i9;
        int i10;
        s sVar;
        int i11;
        y yVar = this.f5094a;
        s sVar2 = this.f5095b;
        this.f5095b = c0016l;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            r.o oVar = (r.o) arrayList.get(i12);
            int size2 = oVar.f9520b.size();
            for (int i13 = 0; i13 < size2; i13++) {
                ((AbstractC0954O) oVar.f9520b.get(i13)).r();
            }
        }
        if (yVar.f6986e == 0) {
            c();
            return;
        }
        boolean z7 = z4 || !z5;
        Object[] objArr = yVar.f6983b;
        long[] jArr = yVar.f6982a;
        int length = jArr.length - 2;
        long j4 = 255;
        C0661B c0661b = this.f5096c;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j5 = jArr[i14];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j5 & j4) < 128) {
                            c0661b.a(objArr[(i14 << 3) + i16]);
                        }
                        j5 >>= 8;
                        i16++;
                        j4 = 255;
                    }
                    if (i15 != 8) {
                        break;
                    }
                }
                if (i14 == length) {
                    break;
                }
                i14++;
                j4 = 255;
            }
        }
        int size3 = arrayList.size();
        for (int i17 = 0; i17 < size3; i17++) {
            r.o oVar2 = (r.o) arrayList.get(i17);
            c0661b.j(oVar2.f9526h);
            int size4 = oVar2.f9520b.size();
            for (int i18 = 0; i18 < size4; i18++) {
                ((AbstractC0954O) oVar2.f9520b.get(i18)).r();
            }
        }
        int[] iArr = {0};
        ArrayList arrayList4 = this.f5098e;
        ArrayList arrayList5 = this.f5097d;
        if (z7 && sVar2 != null) {
            if (arrayList5.isEmpty()) {
                sVar = sVar2;
                i11 = 0;
            } else {
                int i19 = 1;
                if (arrayList5.size() > 1) {
                    sVar = sVar2;
                    C1399C.i(arrayList5, new C1110n(sVar, i19));
                } else {
                    sVar = sVar2;
                }
                if (arrayList5.size() > 0) {
                    r.o oVar3 = (r.o) arrayList5.get(0);
                    e(iArr, oVar3);
                    Object e4 = yVar.e(oVar3.f9526h);
                    Intrinsics.c(e4);
                    B.c(e4);
                    oVar3.a(0);
                    throw null;
                }
                i11 = 0;
                C1436t.l(iArr, 0);
            }
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    C1399C.i(arrayList4, new C1110n(sVar, i11));
                }
                if (arrayList4.size() > 0) {
                    r.o oVar4 = (r.o) arrayList4.get(i11);
                    e(iArr, oVar4);
                    Object e5 = yVar.e(oVar4.f9526h);
                    Intrinsics.c(e5);
                    B.c(e5);
                    oVar4.a(i11);
                    throw null;
                }
                C1436t.l(iArr, i11);
            }
        }
        Object[] objArr2 = c0661b.f6885b;
        long[] jArr2 = c0661b.f6884a;
        int length2 = jArr2.length - 2;
        ArrayList arrayList6 = this.f5100g;
        ArrayList arrayList7 = this.f5099f;
        if (length2 >= 0) {
            z6 = z7;
            int i20 = 0;
            while (true) {
                long j6 = jArr2[i20];
                arrayList2 = arrayList4;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i21 = 8;
                    int i22 = 8 - ((~(i20 - length2)) >>> 31);
                    long j7 = j6;
                    int i23 = 0;
                    while (i23 < i22) {
                        if ((j7 & 255) < 128) {
                            Object obj = objArr2[(i20 << 3) + i23];
                            Object e6 = yVar.e(obj);
                            Intrinsics.c(e6);
                            B.c(e6);
                            c0016l.b(obj);
                            throw null;
                        }
                        j7 >>= i21;
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
            }
        } else {
            arrayList2 = arrayList4;
            z6 = z7;
        }
        int i24 = 1;
        if (arrayList7.isEmpty()) {
            i7 = i2;
            i8 = i4;
            arrayList3 = arrayList7;
            i9 = 1;
            i10 = 0;
        } else {
            if (arrayList7.size() > 1) {
                C1399C.i(arrayList7, new C1111o(c0016l, i24));
            }
            int size5 = arrayList7.size();
            int i25 = 0;
            while (i25 < size5) {
                r.o oVar5 = (r.o) arrayList7.get(i25);
                Object e7 = yVar.e(oVar5.f9526h);
                Intrinsics.c(e7);
                B.c(e7);
                int e8 = e(iArr, oVar5);
                if (!z4) {
                    throw null;
                }
                ArrayList arrayList8 = arrayList7;
                oVar5.c(((int) (((r.o) C1403G.q(arrayList)).a(0) & 4294967295L)) - e8, i2, i4);
                if (z6) {
                    d(oVar5, true);
                    throw null;
                }
                i25++;
                arrayList7 = arrayList8;
            }
            i7 = i2;
            i8 = i4;
            arrayList3 = arrayList7;
            i10 = 0;
            i9 = 1;
            C1436t.l(iArr, 0);
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > i9) {
                C1399C.i(arrayList6, new C1111o(c0016l, i10));
            }
            int size6 = arrayList6.size();
            int i26 = 0;
            while (i26 < size6) {
                r.o oVar6 = (r.o) arrayList6.get(i26);
                Object e9 = yVar.e(oVar6.f9526h);
                Intrinsics.c(e9);
                B.c(e9);
                int e10 = e(iArr, oVar6);
                if (!z4) {
                    throw null;
                }
                int[] iArr2 = iArr;
                int i27 = size6;
                oVar6.c(((int) (((r.o) C1403G.x(arrayList)).a(0) & 4294967295L)) + e10, i7, i8);
                if (z6) {
                    d(oVar6, true);
                    throw null;
                }
                i26++;
                size6 = i27;
                iArr = iArr2;
            }
        }
        ArrayList arrayList9 = arrayList3;
        Intrinsics.checkNotNullParameter(arrayList9, "<this>");
        Collections.reverse(arrayList9);
        Unit unit = Unit.f7487a;
        arrayList.addAll(0, arrayList9);
        arrayList.addAll(arrayList6);
        arrayList5.clear();
        arrayList2.clear();
        arrayList9.clear();
        arrayList6.clear();
        c0661b.b();
    }

    public final void c() {
        y yVar = this.f5094a;
        if (yVar.f6986e != 0) {
            Object[] objArr = yVar.f6984c;
            long[] jArr = yVar.f6982a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j4 = jArr[i2];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((255 & j4) < 128) {
                                B.c(objArr[(i2 << 3) + i5]);
                                throw null;
                            }
                            j4 >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            yVar.a();
        }
        this.f5095b = C1102f.f9929b;
    }

    public final void d(r.o oVar, boolean z4) {
        Object e4 = this.f5094a.e(oVar.f9526h);
        Intrinsics.c(e4);
        B.c(e4);
        throw null;
    }
}
