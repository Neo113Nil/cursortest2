package androidx.compose.foundation.lazy.layout;

import F2.h;
import H2.AbstractC0080b;
import M1.q;
import U.k;
import U.l;
import Z1.i;
import j.AbstractC0478D;
import j.AbstractC0479E;
import j.C0475A;
import j.C0506x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import t0.T;
import u.C0947o;
import u.C0949q;
import u.InterfaceC0919A;
import u.r;
import u.w;
import u.x;
import u.z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0506x f3654a;

    /* renamed from: b, reason: collision with root package name */
    public x f3655b;

    /* renamed from: c, reason: collision with root package name */
    public final C0475A f3656c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3657d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3658e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3659f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3660g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f3661h;

    /* renamed from: i, reason: collision with root package name */
    public final l f3662i;

    public a() {
        long[] jArr = AbstractC0478D.f5136a;
        this.f3654a = new C0506x();
        int i3 = AbstractC0479E.f5137a;
        this.f3656c = new C0475A();
        this.f3657d = new ArrayList();
        this.f3658e = new ArrayList();
        this.f3659f = new ArrayList();
        this.f3660g = new ArrayList();
        this.f3661h = new ArrayList();
        this.f3662i = new T(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* renamed from: a, reason: collision with root package name */
            public final a f3647a;

            {
                this.f3647a = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && i.a(this.f3647a, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f3647a);
            }

            @Override // t0.T
            public final k h() {
                C0947o c0947o = new C0947o();
                c0947o.f8080q = this.f3647a;
                return c0947o;
            }

            public final int hashCode() {
                return this.f3647a.hashCode();
            }

            @Override // t0.T
            public final void i(k kVar) {
                C0947o c0947o = (C0947o) kVar;
                a aVar = c0947o.f8080q;
                a aVar2 = this.f3647a;
                if (i.a(aVar, aVar2) || !c0947o.f3303d.p) {
                    return;
                }
                c0947o.f8080q.d();
                aVar2.getClass();
                c0947o.f8080q = aVar2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f3647a + ')';
            }
        };
    }

    public static int e(int[] iArr, z zVar) {
        int f3 = zVar.f();
        int d3 = zVar.d() + f3;
        int i3 = 0;
        while (f3 < d3) {
            int a3 = zVar.a() + iArr[f3];
            iArr[f3] = a3;
            i3 = Math.max(i3, a3);
            f3++;
        }
        return i3;
    }

    public final void a(int i3, Object obj) {
        AbstractC0080b.r(this.f3654a.e(obj));
    }

    public final long b() {
        ArrayList arrayList = this.f3661h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        AbstractC0080b.r(arrayList.get(0));
        throw null;
    }

    public final void c(int i3, int i4, ArrayList arrayList, h hVar, InterfaceC0919A interfaceC0919A, boolean z3, int i5, boolean z4, int i6, int i7) {
        C0475A c0475a;
        ArrayList arrayList2;
        long[] jArr;
        long[] jArr2;
        x xVar = this.f3655b;
        this.f3655b = hVar;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            z zVar = (z) arrayList.get(i8);
            int b2 = zVar.b();
            for (int i9 = 0; i9 < b2; i9++) {
                zVar.e(i9);
            }
        }
        C0506x c0506x = this.f3654a;
        if (c0506x.f5230e == 0) {
            d();
            return;
        }
        z zVar2 = (z) M1.l.n0(arrayList);
        if (zVar2 != null) {
            zVar2.getIndex();
        }
        boolean z5 = z3 || !z4;
        Object[] objArr = c0506x.f5227b;
        long[] jArr3 = c0506x.f5226a;
        int length = jArr3.length - 2;
        C0475A c0475a2 = this.f3656c;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j3 = jArr3[i10];
                c0475a = c0475a2;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j3 & 255) < 128) {
                            jArr2 = jArr3;
                            c0475a.a(objArr[(i10 << 3) + i12]);
                        } else {
                            jArr2 = jArr3;
                        }
                        j3 >>= 8;
                        i12++;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c0475a2 = c0475a;
                jArr3 = jArr;
            }
        } else {
            c0475a = c0475a2;
        }
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            z zVar3 = (z) arrayList.get(i13);
            c0475a.j(zVar3.getKey());
            int b3 = zVar3.b();
            for (int i14 = 0; i14 < b3; i14++) {
                zVar3.e(i14);
            }
        }
        int[] iArr = new int[i5];
        for (int i15 = 0; i15 < i5; i15++) {
            iArr[i15] = 0;
        }
        ArrayList arrayList3 = this.f3658e;
        ArrayList arrayList4 = this.f3657d;
        if (z5 && xVar != null) {
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    q.h0(arrayList4, new C0949q(xVar, 1));
                }
                if (arrayList4.size() > 0) {
                    z zVar4 = (z) arrayList4.get(0);
                    e(iArr, zVar4);
                    Object e3 = c0506x.e(zVar4.getKey());
                    i.c(e3);
                    AbstractC0080b.r(e3);
                    zVar4.c(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, i5, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    q.h0(arrayList3, new C0949q(xVar, 0));
                }
                if (arrayList3.size() > 0) {
                    z zVar5 = (z) arrayList3.get(0);
                    e(iArr, zVar5);
                    Object e4 = c0506x.e(zVar5.getKey());
                    i.c(e4);
                    AbstractC0080b.r(e4);
                    zVar5.c(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, i5, 0);
            }
        }
        Object[] objArr2 = c0475a.f5130b;
        long[] jArr4 = c0475a.f5129a;
        int length2 = jArr4.length - 2;
        ArrayList arrayList5 = this.f3660g;
        ArrayList arrayList6 = this.f3659f;
        if (length2 >= 0) {
            int i16 = length2;
            int i17 = 0;
            while (true) {
                long j4 = jArr4[i17];
                arrayList2 = arrayList3;
                long[] jArr5 = jArr4;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i18 = 8;
                    int i19 = 8 - ((~(i17 - i16)) >>> 31);
                    long j5 = j4;
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j5 & 255) < 128) {
                            Object obj = objArr2[(i17 << 3) + i20];
                            Object e5 = c0506x.e(obj);
                            i.c(e5);
                            AbstractC0080b.r(e5);
                            hVar.b(obj);
                            throw null;
                        }
                        j5 >>= i18;
                        i20++;
                        i18 = 8;
                    }
                    if (i19 != i18) {
                        break;
                    }
                }
                int i21 = i16;
                if (i17 == i21) {
                    break;
                }
                i17++;
                i16 = i21;
                arrayList3 = arrayList2;
                jArr4 = jArr5;
            }
        } else {
            arrayList2 = arrayList3;
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > 1) {
                q.h0(arrayList6, new r(hVar, 1));
            }
            if (arrayList6.size() > 0) {
                z zVar6 = (z) arrayList6.get(0);
                Object e6 = c0506x.e(zVar6.getKey());
                i.c(e6);
                AbstractC0080b.r(e6);
                e(iArr, zVar6);
                if (!z3) {
                    throw null;
                }
                ((z) M1.l.m0(arrayList)).c(0);
                throw null;
            }
            Arrays.fill(iArr, 0, i5, 0);
        }
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > 1) {
                q.h0(arrayList5, new r(hVar, 0));
            }
            if (arrayList5.size() > 0) {
                z zVar7 = (z) arrayList5.get(0);
                Object e7 = c0506x.e(zVar7.getKey());
                i.c(e7);
                AbstractC0080b.r(e7);
                e(iArr, zVar7);
                if (!z3) {
                    throw null;
                }
                ((z) M1.l.s0(arrayList)).c(0);
                throw null;
            }
        }
        Collections.reverse(arrayList6);
        arrayList.addAll(0, arrayList6);
        arrayList.addAll(arrayList5);
        arrayList4.clear();
        arrayList2.clear();
        arrayList6.clear();
        arrayList5.clear();
        c0475a.b();
    }

    public final void d() {
        C0506x c0506x = this.f3654a;
        if (c0506x.f5230e != 0) {
            Object[] objArr = c0506x.f5228c;
            long[] jArr = c0506x.f5226a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j3 = jArr[i3];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((255 & j3) < 128) {
                                AbstractC0080b.r(objArr[(i3 << 3) + i5]);
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
            c0506x.a();
        }
        this.f3655b = w.f8099d;
    }
}
