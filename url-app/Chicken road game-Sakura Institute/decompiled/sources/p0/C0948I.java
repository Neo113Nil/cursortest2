package p0;

import i.C0673h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l0.C0805c;
import l0.C0814l;
import q.AbstractC1003G;
import q.AbstractC1024c;
import q.C0998B;
import q.C0999C;
import q.C1001E;
import q.C1002F;
import q.C1004H;
import q.C1005I;
import q.C1008L;
import q.C1033l;
import q.InterfaceC1029h;
import r0.AbstractC1065f;
import z2.C1403G;
import z2.C1405I;
import z2.C1412P;

/* renamed from: p0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0948I implements InterfaceC0945F {

    /* renamed from: a, reason: collision with root package name */
    public final C1008L f8997a;

    public C0948I(C1008L c1008l) {
        this.f8997a = c1008l;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [L2.c, M2.p] */
    /* JADX WARN: Type inference failed for: r9v4, types: [L2.c, M2.p] */
    @Override // p0.InterfaceC0945F
    public final int a(InterfaceC0977m interfaceC0977m, List list, int i2) {
        ArrayList l4 = AbstractC1065f.l(interfaceC0977m);
        C1008L c1008l = this.f8997a;
        c1008l.getClass();
        List list2 = (List) C1403G.s(1, l4);
        InterfaceC0944E interfaceC0944E = list2 != null ? (InterfaceC0944E) C1403G.r(list2) : null;
        List list3 = (List) C1403G.s(2, l4);
        c1008l.f9191h.b(interfaceC0944E, list3 != null ? (InterfaceC0944E) C1403G.r(list3) : null, u3.d.b(0, i2, 7));
        List list4 = (List) C1403G.r(l4);
        if (list4 == null) {
            list4 = C1405I.f11931d;
        }
        int l5 = interfaceC0977m.l(c1008l.f9186c);
        int l6 = interfaceC0977m.l(c1008l.f9188e);
        ?? r7 = c1008l.f9194k;
        ?? r9 = c1008l.f9193j;
        if (list4.isEmpty()) {
            return 0;
        }
        int size = list4.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = 0;
        }
        int size2 = list4.size();
        int[] iArr2 = new int[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            iArr2[i5] = 0;
        }
        int size3 = list4.size();
        for (int i6 = 0; i6 < size3; i6++) {
            InterfaceC0944E interfaceC0944E2 = (InterfaceC0944E) list4.get(i6);
            int intValue = ((Number) r7.g(interfaceC0944E2, Integer.valueOf(i6), Integer.valueOf(i2))).intValue();
            iArr[i6] = intValue;
            iArr2[i6] = ((Number) r9.g(interfaceC0944E2, Integer.valueOf(i6), Integer.valueOf(intValue))).intValue();
        }
        int i7 = c1008l.f9190g;
        int i8 = c1008l.f9189f;
        int i9 = Integer.MAX_VALUE;
        if (i7 != Integer.MAX_VALUE && i8 != Integer.MAX_VALUE) {
            i9 = i8 * i7;
        }
        int size4 = list4.size();
        C1005I c1005i = c1008l.f9191h;
        if (i9 < size4) {
            c1005i.getClass();
        }
        if (i9 >= list4.size()) {
            int i10 = c1005i.f9163a;
        }
        int min = Math.min(i9, list4.size());
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += iArr[i12];
        }
        int size5 = ((list4.size() - 1) * l5) + i11;
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i13 = iArr2[0];
        Intrinsics.checkNotNullParameter(iArr2, "<this>");
        R2.b it = new IntRange(1, size2 - 1, 1).iterator();
        int i14 = i13;
        while (it.f3947i) {
            int i15 = iArr2[it.b()];
            if (i14 < i15) {
                i14 = i15;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i16 = iArr[0];
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        R2.b it2 = new IntRange(1, size - 1, 1).iterator();
        while (it2.f3947i) {
            int i17 = iArr[it2.b()];
            if (i16 < i17) {
                i16 = i17;
            }
        }
        int i18 = size5;
        while (i16 <= size5 && i14 != i2) {
            i18 = (i16 + size5) / 2;
            int[] iArr3 = iArr2;
            int[] iArr4 = iArr;
            long b4 = AbstractC1003G.b(list4, new C1001E(iArr, 0), new C1001E(iArr2, 1), i18, l5, l6, i8, i7, c1005i);
            int i19 = (int) (b4 >> 32);
            int i20 = (int) (b4 & 4294967295L);
            if (i19 <= i2 && i20 >= min) {
                if (i19 >= i2) {
                    break;
                }
                size5 = i18 - 1;
            } else {
                i16 = i18 + 1;
                if (i16 > size5) {
                    return i16;
                }
            }
            i14 = i19;
            iArr2 = iArr3;
            iArr = iArr4;
        }
        return i18;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [L2.c, M2.p] */
    /* JADX WARN: Type inference failed for: r3v5, types: [L2.c, M2.p] */
    @Override // p0.InterfaceC0945F
    public final int e(InterfaceC0977m interfaceC0977m, List list, int i2) {
        ArrayList l4 = AbstractC1065f.l(interfaceC0977m);
        C1008L c1008l = this.f8997a;
        c1008l.getClass();
        List list2 = (List) C1403G.s(1, l4);
        InterfaceC0944E interfaceC0944E = list2 != null ? (InterfaceC0944E) C1403G.r(list2) : null;
        List list3 = (List) C1403G.s(2, l4);
        c1008l.f9191h.b(interfaceC0944E, list3 != null ? (InterfaceC0944E) C1403G.r(list3) : null, u3.d.b(i2, 0, 13));
        List list4 = (List) C1403G.r(l4);
        if (list4 == null) {
            list4 = C1405I.f11931d;
        }
        return (int) (AbstractC1003G.b(list4, c1008l.f9194k, c1008l.f9193j, i2, interfaceC0977m.l(c1008l.f9186c), interfaceC0977m.l(c1008l.f9188e), c1008l.f9189f, c1008l.f9190g, c1008l.f9191h) >> 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0948I) && Intrinsics.a(this.f8997a, ((C0948I) obj).f8997a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020c  */
    @Override // p0.InterfaceC0945F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0946G f(InterfaceC0947H interfaceC0947H, List list, long j4) {
        InterfaceC0946G t4;
        InterfaceC0944E interfaceC0944E;
        InterfaceC0944E interfaceC0944E2;
        long j5;
        I.d dVar;
        C0673h c0673h;
        C1008L c1008l;
        InterfaceC0946G t5;
        InterfaceC0944E interfaceC0944E3;
        C1005I c1005i;
        long j6;
        InterfaceC0944E interfaceC0944E4;
        M2.E e4;
        C0673h c0673h2;
        Iterator it;
        int i2;
        C0673h c0673h3;
        i.p pVar;
        i.p pVar2;
        int i4;
        int i5;
        int i6;
        C0998B c0998b;
        InterfaceC0946G t6;
        ArrayList l4 = AbstractC1065f.l(interfaceC0947H);
        C1008L c1008l2 = this.f8997a;
        if (c1008l2.f9190g != 0 && c1008l2.f9189f != 0 && !l4.isEmpty()) {
            int h4 = M0.a.h(j4);
            C1005I c1005i2 = c1008l2.f9191h;
            if (h4 != 0) {
                List list2 = (List) C1403G.q(l4);
                if (list2.isEmpty()) {
                    t6 = interfaceC0947H.t(0, 0, C1412P.c(), C1033l.f9277k);
                    return t6;
                }
                List list3 = (List) C1403G.s(1, l4);
                InterfaceC0944E interfaceC0944E5 = list3 != null ? (InterfaceC0944E) C1403G.r(list3) : null;
                List list4 = (List) C1403G.s(2, l4);
                InterfaceC0944E interfaceC0944E6 = list4 != null ? (InterfaceC0944E) C1403G.r(list4) : null;
                list2.size();
                c1005i2.getClass();
                long h5 = AbstractC1024c.h(AbstractC1024c.d(AbstractC1024c.c(j4, 1), 10));
                if (interfaceC0944E5 != null) {
                    AbstractC1003G.c(interfaceC0944E5, c1008l2, h5, new C1004H(c1005i2, c1008l2, 0));
                    c1005i2.f9165c = interfaceC0944E5;
                }
                if (interfaceC0944E6 != null) {
                    AbstractC1003G.c(interfaceC0944E6, c1008l2, h5, new C1004H(c1005i2, c1008l2, 1));
                    c1005i2.f9167e = interfaceC0944E6;
                }
                Iterator it2 = list2.iterator();
                long c4 = AbstractC1024c.c(j4, 1);
                I.d dVar2 = new I.d(new InterfaceC0946G[16]);
                int i7 = M0.a.i(c4);
                int k4 = M0.a.k(c4);
                int h6 = M0.a.h(c4);
                i.q qVar = i.j.f6922a;
                i.q qVar2 = new i.q();
                ArrayList arrayList = new ArrayList();
                int ceil = (int) Math.ceil(interfaceC0947H.L(c1008l2.f9186c));
                int ceil2 = (int) Math.ceil(interfaceC0947H.L(c1008l2.f9188e));
                long a4 = u3.d.a(0, i7, 0, h6);
                long h7 = AbstractC1024c.h(AbstractC1024c.d(a4, 14));
                M2.E e5 = new M2.E();
                if (it2.hasNext()) {
                    try {
                        interfaceC0944E = (InterfaceC0944E) it2.next();
                    } catch (IndexOutOfBoundsException unused) {
                        interfaceC0944E = null;
                    }
                    interfaceC0944E2 = interfaceC0944E;
                } else {
                    interfaceC0944E2 = null;
                }
                if (interfaceC0944E2 != null) {
                    dVar = dVar2;
                    j5 = a4;
                    c0673h = new C0673h(AbstractC1003G.c(interfaceC0944E2, c1008l2, h7, new C0814l(e5, 4)));
                } else {
                    j5 = a4;
                    dVar = dVar2;
                    c0673h = null;
                }
                long j7 = h7;
                Integer valueOf = c0673h != null ? Integer.valueOf((int) (c0673h.f6920a >> 32)) : null;
                Integer valueOf2 = c0673h != null ? Integer.valueOf((int) (c0673h.f6920a & 4294967295L)) : null;
                i.p pVar3 = new i.p();
                i.p pVar4 = new i.p();
                int i8 = c1008l2.f9189f;
                Integer num = valueOf2;
                C1005I c1005i3 = c1008l2.f9191h;
                InterfaceC0944E interfaceC0944E7 = interfaceC0944E2;
                C0999C c0999c = new C0999C(i8, c1005i3, c4, c1008l2.f9190g, ceil, ceil2);
                C0805c b4 = c0999c.b(it2.hasNext(), 0, C0673h.a(i7, h6), c0673h, 0, 0, 0, false, false);
                C0998B a5 = b4.f7887b ? c0999c.a(b4, c0673h != null, -1, 0, i7, 0) : null;
                int i9 = i7;
                i.p pVar5 = pVar3;
                C0805c c0805c = b4;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = k4;
                C0998B c0998b2 = a5;
                InterfaceC0944E interfaceC0944E8 = interfaceC0944E7;
                int i16 = 0;
                while (!c0805c.f7887b && interfaceC0944E8 != null) {
                    Intrinsics.c(valueOf);
                    int intValue = valueOf.intValue();
                    Intrinsics.c(num);
                    i.p pVar6 = pVar4;
                    int intValue2 = num.intValue();
                    int i17 = i7;
                    int i18 = i11 + intValue;
                    i10 = Math.max(i10, intValue2);
                    int i19 = i9 - intValue;
                    int i20 = i16 + 1;
                    c1005i3.getClass();
                    arrayList.add(interfaceC0944E8);
                    qVar2.i(i16, e5.f3580d);
                    int i21 = i20 - i12;
                    if (it2.hasNext()) {
                        try {
                            interfaceC0944E3 = (InterfaceC0944E) it2.next();
                        } catch (IndexOutOfBoundsException unused2) {
                        }
                        e5.f3580d = null;
                        if (interfaceC0944E3 == null) {
                            c1005i = c1005i3;
                            j6 = j7;
                            e4 = e5;
                            interfaceC0944E4 = interfaceC0944E3;
                            c0673h2 = new C0673h(AbstractC1003G.c(interfaceC0944E3, c1008l2, j6, new C0814l(e5, 3)));
                        } else {
                            c1005i = c1005i3;
                            j6 = j7;
                            interfaceC0944E4 = interfaceC0944E3;
                            e4 = e5;
                            c0673h2 = null;
                        }
                        Integer valueOf3 = c0673h2 == null ? Integer.valueOf(((int) (c0673h2.f6920a >> 32)) + ceil) : null;
                        long j8 = j6;
                        Integer valueOf4 = c0673h2 == null ? Integer.valueOf((int) (c0673h2.f6920a & 4294967295L)) : null;
                        boolean hasNext = it2.hasNext();
                        long a6 = C0673h.a(i19, h6);
                        if (c0673h2 != null) {
                            it = it2;
                            i2 = h6;
                            c0673h3 = null;
                        } else {
                            Intrinsics.c(valueOf3);
                            int intValue3 = valueOf3.intValue();
                            Intrinsics.c(valueOf4);
                            it = it2;
                            i2 = h6;
                            c0673h3 = new C0673h(C0673h.a(intValue3, valueOf4.intValue()));
                        }
                        c0805c = c0999c.b(hasNext, i21, a6, c0673h3, i14, i13, i10, false, false);
                        if (c0805c.f7886a) {
                            pVar = pVar5;
                            pVar2 = pVar6;
                            i4 = i17;
                            valueOf = valueOf3;
                            i5 = i19;
                            i6 = i18;
                            c0998b = c0998b2;
                        } else {
                            i4 = i17;
                            int min = Math.min(Math.max(i15, i18), i4);
                            int i22 = i13 + i10;
                            C0998B a7 = c0999c.a(c0805c, c0673h2 != null, i14, i22, i19, i21);
                            pVar6.a(i10);
                            int i23 = (h6 - i22) - ceil2;
                            i.p pVar7 = pVar5;
                            pVar7.a(i20);
                            i14++;
                            i12 = i20;
                            i13 = i22 + ceil2;
                            i2 = i23;
                            pVar2 = pVar6;
                            valueOf = valueOf3 != null ? Integer.valueOf(valueOf3.intValue() - ceil) : null;
                            i10 = 0;
                            i15 = min;
                            i5 = i4;
                            c0998b = a7;
                            pVar = pVar7;
                            i6 = 0;
                        }
                        pVar5 = pVar;
                        c0998b2 = c0998b;
                        num = valueOf4;
                        i11 = i6;
                        interfaceC0944E8 = interfaceC0944E4;
                        it2 = it;
                        i16 = i20;
                        i7 = i4;
                        pVar4 = pVar2;
                        h6 = i2;
                        c1005i3 = c1005i;
                        i9 = i5;
                        e5 = e4;
                        j7 = j8;
                    }
                    interfaceC0944E3 = null;
                    e5.f3580d = null;
                    if (interfaceC0944E3 == null) {
                    }
                    if (c0673h2 == null) {
                    }
                    long j82 = j6;
                    if (c0673h2 == null) {
                    }
                    boolean hasNext2 = it2.hasNext();
                    long a62 = C0673h.a(i19, h6);
                    if (c0673h2 != null) {
                    }
                    c0805c = c0999c.b(hasNext2, i21, a62, c0673h3, i14, i13, i10, false, false);
                    if (c0805c.f7886a) {
                    }
                    pVar5 = pVar;
                    c0998b2 = c0998b;
                    num = valueOf4;
                    i11 = i6;
                    interfaceC0944E8 = interfaceC0944E4;
                    it2 = it;
                    i16 = i20;
                    i7 = i4;
                    pVar4 = pVar2;
                    h6 = i2;
                    c1005i3 = c1005i;
                    i9 = i5;
                    e5 = e4;
                    j7 = j82;
                }
                i.p pVar8 = pVar4;
                i.p pVar9 = pVar5;
                if (c0998b2 != null) {
                    C0998B c0998b3 = c0998b2;
                    arrayList.add(c0998b3.f9137a);
                    qVar2.i(arrayList.size() - 1, c0998b3.f9138b);
                    int i24 = pVar9.f6939b - 1;
                    boolean z4 = c0998b3.f9140d;
                    long j9 = c0998b3.f9139c;
                    if (z4) {
                        pVar8.e(i24, Math.max(pVar8.c(i24), (int) (j9 & 4294967295L)));
                        int i25 = pVar9.f6939b;
                        if (i25 == 0) {
                            throw new NoSuchElementException("IntList is empty.");
                        }
                        pVar9.e(i24, pVar9.f6938a[i25 - 1] + 1);
                    } else {
                        pVar8.a((int) (4294967295L & j9));
                        int i26 = pVar9.f6939b;
                        if (i26 == 0) {
                            throw new NoSuchElementException("IntList is empty.");
                        }
                        pVar9.a(pVar9.f6938a[i26 - 1] + 1);
                    }
                }
                int size = arrayList.size();
                AbstractC0954O[] abstractC0954OArr = new AbstractC0954O[size];
                for (int i27 = 0; i27 < size; i27++) {
                    abstractC0954OArr[i27] = qVar2.f(i27);
                }
                int i28 = pVar9.f6939b;
                int[] iArr = new int[i28];
                for (int i29 = 0; i29 < i28; i29++) {
                    iArr[i29] = 0;
                }
                int i30 = 0;
                int i31 = pVar9.f6939b;
                int[] iArr2 = new int[i31];
                int i32 = 0;
                while (i32 < i31) {
                    iArr2[i32] = i30;
                    i32++;
                    i30 = 0;
                }
                int[] iArr3 = pVar9.f6938a;
                int i33 = pVar9.f6939b;
                int i34 = i15;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                AbstractC0954O[] abstractC0954OArr2 = abstractC0954OArr;
                while (i35 < i33) {
                    int i38 = iArr3[i35];
                    int i39 = i35;
                    AbstractC0954O[] abstractC0954OArr3 = abstractC0954OArr2;
                    I.d dVar3 = dVar;
                    InterfaceC0946G g4 = AbstractC1024c.g(c1008l2, i34, M0.a.j(j5), M0.a.i(j5), pVar8.c(i35), ceil, interfaceC0947H, arrayList, abstractC0954OArr2, i36, i38, iArr, i39);
                    int g5 = g4.g();
                    int j10 = g4.j();
                    iArr2[i39] = j10;
                    i37 += j10;
                    i34 = Math.max(i34, g5);
                    dVar3.b(g4);
                    i35 = i39 + 1;
                    dVar = dVar3;
                    i36 = i38;
                    pVar8 = pVar8;
                    i33 = i33;
                    ceil = ceil;
                    arrayList = arrayList;
                    abstractC0954OArr2 = abstractC0954OArr3;
                    iArr3 = iArr3;
                    c1008l2 = c1008l2;
                    j5 = j5;
                }
                I.d dVar4 = dVar;
                int i40 = i34;
                C1008L c1008l3 = c1008l2;
                if (dVar4.k()) {
                    c1008l = c1008l3;
                    i40 = 0;
                    i37 = 0;
                } else {
                    c1008l = c1008l3;
                }
                InterfaceC1029h interfaceC1029h = c1008l.f9185b;
                int e6 = kotlin.ranges.b.e(((dVar4.f3332i - 1) * interfaceC0947H.l(interfaceC1029h.a())) + i37, M0.a.j(c4), M0.a.h(c4));
                interfaceC1029h.c(e6, interfaceC0947H, iArr2, iArr);
                t5 = interfaceC0947H.t(kotlin.ranges.b.e(i40, M0.a.k(c4), M0.a.i(c4)), e6, C1412P.c(), new C1002F(0, dVar4));
                return t5;
            }
            c1005i2.getClass();
        }
        t4 = interfaceC0947H.t(0, 0, C1412P.c(), C1033l.f9276j);
        return t4;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [L2.c, M2.p] */
    /* JADX WARN: Type inference failed for: r3v5, types: [L2.c, M2.p] */
    @Override // p0.InterfaceC0945F
    public final int g(InterfaceC0977m interfaceC0977m, List list, int i2) {
        ArrayList l4 = AbstractC1065f.l(interfaceC0977m);
        C1008L c1008l = this.f8997a;
        c1008l.getClass();
        List list2 = (List) C1403G.s(1, l4);
        InterfaceC0944E interfaceC0944E = list2 != null ? (InterfaceC0944E) C1403G.r(list2) : null;
        List list3 = (List) C1403G.s(2, l4);
        c1008l.f9191h.b(interfaceC0944E, list3 != null ? (InterfaceC0944E) C1403G.r(list3) : null, u3.d.b(i2, 0, 13));
        List list4 = (List) C1403G.r(l4);
        if (list4 == null) {
            list4 = C1405I.f11931d;
        }
        return (int) (AbstractC1003G.b(list4, c1008l.f9194k, c1008l.f9193j, i2, interfaceC0977m.l(c1008l.f9186c), interfaceC0977m.l(c1008l.f9188e), c1008l.f9189f, c1008l.f9190g, c1008l.f9191h) >> 32);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [L2.c, M2.p] */
    @Override // p0.InterfaceC0945F
    public final int h(InterfaceC0977m interfaceC0977m, List list, int i2) {
        ArrayList l4 = AbstractC1065f.l(interfaceC0977m);
        C1008L c1008l = this.f8997a;
        c1008l.getClass();
        List list2 = (List) C1403G.s(1, l4);
        InterfaceC0944E interfaceC0944E = list2 != null ? (InterfaceC0944E) C1403G.r(list2) : null;
        List list3 = (List) C1403G.s(2, l4);
        c1008l.f9191h.b(interfaceC0944E, list3 != null ? (InterfaceC0944E) C1403G.r(list3) : null, u3.d.b(0, i2, 7));
        List list4 = (List) C1403G.r(l4);
        if (list4 == null) {
            list4 = C1405I.f11931d;
        }
        int l5 = interfaceC0977m.l(c1008l.f9186c);
        ?? r12 = c1008l.f9192i;
        int size = list4.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            int intValue = ((Number) r12.g((InterfaceC0944E) list4.get(i4), Integer.valueOf(i4), Integer.valueOf(i2))).intValue() + l5;
            int i8 = i4 + 1;
            if (i8 - i6 == c1008l.f9189f || i8 == list4.size()) {
                i5 = Math.max(i5, (i7 + intValue) - l5);
                i6 = i4;
                i7 = 0;
            } else {
                i7 += intValue;
            }
            i4 = i8;
        }
        return i5;
    }

    public final int hashCode() {
        return this.f8997a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f8997a + ')';
    }
}
