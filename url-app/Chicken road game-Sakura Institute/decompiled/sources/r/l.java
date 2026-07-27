package r;

import A.C0016l;
import C.F;
import G.C0199g0;
import Q.AbstractC0274j;
import Z.A;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;
import l0.C0810h;
import n.AbstractC0864b;
import o.N;
import p0.InterfaceC0946G;
import p0.InterfaceC0964Z;
import q.InterfaceC1021Z;
import q.InterfaceC1027f;
import q.InterfaceC1029h;
import s.C1104h;
import z2.C1403G;
import z2.C1405I;
import z2.C1433q;
import z2.C1441y;

/* loaded from: classes.dex */
public final class l extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f9489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1021Z f9490e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f9491i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S2.c f9492j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1029h f9493k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f9494l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f9495m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b3.c f9496n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ S.e f9497o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ S.f f9498p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v vVar, InterfaceC1021Z interfaceC1021Z, boolean z4, S2.c cVar, InterfaceC1029h interfaceC1029h, InterfaceC1027f interfaceC1027f, boolean z5, int i2, b3.c cVar2, A a4, S.e eVar, S.f fVar) {
        super(2);
        this.f9489d = vVar;
        this.f9490e = interfaceC1021Z;
        this.f9491i = z4;
        this.f9492j = cVar;
        this.f9493k = interfaceC1029h;
        this.f9494l = z5;
        this.f9495m = i2;
        this.f9496n = cVar2;
        this.f9497o = eVar;
        this.f9498p = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:234:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06e2 A[LOOP:15: B:246:0x06e0->B:247:0x06e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0722  */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj, Object obj2) {
        IntRange intRange;
        List list;
        int i2;
        C1405I c1405i;
        int i4;
        long j4;
        n nVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        l lVar;
        o oVar;
        int i10;
        int i11;
        List list2;
        int i12;
        int i13;
        ArrayList arrayList;
        int i14;
        boolean z4;
        List list3;
        List list4;
        int size;
        int i15;
        int size2;
        int i16;
        long j5;
        boolean z5;
        int s4;
        int i17;
        int r2;
        boolean z6;
        o oVar2;
        float f4;
        boolean z7;
        int i18;
        ArrayList arrayList2;
        n nVar2;
        v vVar;
        kotlin.ranges.a aVar;
        int i19;
        float f5;
        int i20;
        o oVar3;
        float f6;
        int i21;
        o oVar4;
        Object obj3;
        int i22;
        Object obj4;
        int min;
        int i23;
        o oVar5;
        Object obj5;
        int i24;
        s.t tVar = (s.t) obj;
        long j6 = ((M0.a) obj2).f3539a;
        v vVar2 = this.f9489d;
        vVar2.f9568r.getValue();
        boolean z8 = vVar2.f9552b || tVar.f9964e.A();
        N n2 = N.f8665d;
        M1.a.q(j6, n2);
        M0.k layoutDirection = tVar.f9964e.getLayoutDirection();
        InterfaceC1021Z interfaceC1021Z = this.f9490e;
        int l4 = tVar.f9964e.l(interfaceC1021Z.b(layoutDirection));
        int l5 = tVar.f9964e.l(interfaceC1021Z.a(tVar.f9964e.getLayoutDirection()));
        int l6 = tVar.f9964e.l(interfaceC1021Z.d());
        float c4 = interfaceC1021Z.c();
        InterfaceC0964Z interfaceC0964Z = tVar.f9964e;
        int l7 = interfaceC0964Z.l(c4);
        int i25 = l6 + l7;
        int i26 = l4 + l5;
        boolean z9 = this.f9491i;
        if (!z9) {
            l7 = l6;
        } else if (!z9) {
            l7 = l5;
        }
        int i27 = i25 - l7;
        long Q3 = u3.d.Q(-i26, -i25, j6);
        h hVar = (h) this.f9492j.invoke();
        c cVar = hVar.f9456c;
        int i28 = l7;
        int i29 = M0.a.i(Q3);
        int h4 = M0.a.h(Q3);
        cVar.f9448a.f(i29);
        cVar.f9449b.f(h4);
        InterfaceC1029h interfaceC1029h = this.f9493k;
        if (interfaceC1029h == null) {
            throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
        }
        int l8 = interfaceC0964Z.l(interfaceC1029h.a());
        int c5 = hVar.c();
        int h5 = M0.a.h(j6) - i25;
        s.t tVar2 = tVar;
        k kVar = new k(Q3, hVar, tVar, c5, l8, this.f9497o, this.f9498p, this.f9491i, i28, i27, (!z9 || h5 > 0) ? j0.c.g(l4, l6) : j0.c.g(l4, l6 + h5), this.f9489d);
        AbstractC0274j c6 = Q.w.c();
        Function1 f7 = c6 != null ? c6.f() : null;
        AbstractC0274j d4 = Q.w.d(c6);
        try {
            F f8 = vVar2.f9554d;
            int d5 = ((C0199g0) f8.f1052b).d();
            int p4 = AbstractC0864b.p(d5, f8.f1054d, hVar);
            if (d5 != p4) {
                ((C0199g0) f8.f1052b).f(p4);
                s.u uVar = (s.u) f8.f1055e;
                if (d5 != uVar.f9968e) {
                    uVar.f9968e = d5;
                    int i30 = (d5 / 30) * 30;
                    uVar.f9967d.setValue(kotlin.ranges.b.h(Math.max(i30 - 100, 0), i30 + 130));
                }
            }
            int d6 = ((C0199g0) f8.f1053c).d();
            Unit unit = Unit.f7487a;
            Q.w.f(c6, d4, f7);
            C0810h c0810h = vVar2.f9564n;
            boolean l9 = c0810h.f7906a.l();
            s.w wVar = vVar2.f9567q;
            if (l9 || !wVar.f9975d.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                I.d dVar = c0810h.f7906a;
                if (!dVar.l()) {
                    IntRange.f7502k.getClass();
                    intRange = IntRange.f7503l;
                } else {
                    if (dVar.k()) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    Object[] objArr = dVar.f3330d;
                    int i31 = ((C1104h) objArr[0]).f9933a;
                    int i32 = dVar.f3332i;
                    if (i32 > 0) {
                        int i33 = 0;
                        do {
                            int i34 = ((C1104h) objArr[i33]).f9933a;
                            if (i34 < i31) {
                                i31 = i34;
                            }
                            i33++;
                        } while (i33 < i32);
                    }
                    if (i31 < 0) {
                        throw new IllegalArgumentException("negative minIndex");
                    }
                    if (dVar.k()) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    Object[] objArr2 = dVar.f3330d;
                    int i35 = ((C1104h) objArr2[0]).f9934b;
                    int i36 = dVar.f3332i;
                    if (i36 > 0) {
                        int i37 = 0;
                        do {
                            int i38 = ((C1104h) objArr2[i37]).f9934b;
                            if (i38 > i35) {
                                i35 = i38;
                            }
                            i2 = 1;
                            i37++;
                        } while (i37 < i36);
                    } else {
                        i2 = 1;
                    }
                    intRange = new IntRange(i31, Math.min(i35, hVar.c() - i2), i2);
                }
                int size3 = wVar.f9975d.size();
                for (int i39 = 0; i39 < size3; i39++) {
                    s.v vVar3 = (s.v) wVar.get(i39);
                    int p5 = AbstractC0864b.p(vVar3.f9971c.d(), vVar3.f9969a, hVar);
                    int i40 = intRange.f7505d;
                    if ((p5 > intRange.f7506e || i40 > p5) && p5 >= 0 && p5 < hVar.c()) {
                        arrayList3.add(Integer.valueOf(p5));
                    }
                }
                int i41 = intRange.f7505d;
                int i42 = intRange.f7506e;
                if (i41 <= i42) {
                    while (true) {
                        arrayList3.add(Integer.valueOf(i41));
                        if (i41 == i42) {
                            break;
                        }
                        i41++;
                    }
                }
                list = arrayList3;
            } else {
                list = C1405I.f11931d;
            }
            float floatValue = (interfaceC0964Z.A() || !z8) ? vVar2.f9557g : ((Number) vVar2.f9572v.f7813e.getValue()).floatValue();
            if (this.f9494l) {
                hVar.f9455b.getClass();
                c1405i = C1405I.f11931d;
            } else {
                c1405i = C1405I.f11931d;
            }
            boolean A4 = interfaceC0964Z.A();
            n nVar3 = vVar2.f9553c;
            j jVar = new j(tVar2, j6, i26, i25);
            if (i28 < 0) {
                throw new IllegalArgumentException("invalid beforeContentPadding");
            }
            if (i27 < 0) {
                throw new IllegalArgumentException("invalid afterContentPadding");
            }
            h hVar2 = kVar.f9476a;
            b3.c cVar2 = this.f9496n;
            androidx.compose.foundation.lazy.layout.a aVar2 = vVar2.f9563m;
            C0016l c0016l = hVar2.f9457d;
            if (c5 <= 0) {
                int k4 = M0.a.k(Q3);
                int j7 = M0.a.j(Q3);
                aVar2.b(k4, j7, new ArrayList(), c0016l, kVar, A4, z8, 0, 0);
                if (!A4) {
                    aVar2.a();
                    if (!M0.j.a(0L, 0L)) {
                        k4 = u3.d.s(Q3, (int) 0);
                        j7 = u3.d.r(Q3, (int) 0);
                    }
                }
                nVar2 = new n(null, 0, false, 0.0f, (InterfaceC0946G) jVar.g(Integer.valueOf(k4), Integer.valueOf(j7), m.f9499e), 0.0f, false, cVar2, tVar2, kVar.f9478c, C1405I.f11931d, -i28, h5 + i27, 0, n2, i27, l8);
                vVar = vVar2;
            } else {
                int i43 = d6;
                if (p4 >= c5) {
                    p4 = c5 - 1;
                    i43 = 0;
                }
                int round = Math.round(floatValue);
                int i44 = i43 - round;
                if (p4 != 0 || i44 >= 0) {
                    i4 = p4;
                } else {
                    round += i44;
                    i4 = p4;
                    i44 = 0;
                }
                C1433q c1433q = new C1433q();
                int i45 = -i28;
                int i46 = i45 + (l8 < 0 ? l8 : 0);
                int i47 = i44 + i46;
                int i48 = 0;
                while (true) {
                    j4 = kVar.f9478c;
                    if (i47 >= 0 || i4 <= 0) {
                        break;
                    }
                    C1405I c1405i2 = c1405i;
                    int i49 = i4 - 1;
                    o a4 = kVar.a(j4, i49);
                    c1433q.add(0, a4);
                    i48 = Math.max(i48, a4.f9532n);
                    i47 += a4.f9531m;
                    i4 = i49;
                    c1405i = c1405i2;
                }
                C1405I c1405i3 = c1405i;
                if (i47 < i46) {
                    round += i47;
                    i47 = i46;
                }
                int i50 = round;
                int i51 = i47 - i46;
                int i52 = h5 + i27;
                int i53 = i48;
                int i54 = i52 < 0 ? 0 : i52;
                int i55 = -i51;
                int i56 = i51;
                int i57 = i4;
                int i58 = 0;
                boolean z10 = false;
                while (i58 < c1433q.f11958i) {
                    if (i55 >= i54) {
                        c1433q.h(i58);
                        z10 = true;
                    } else {
                        i57++;
                        i55 += ((o) c1433q.get(i58)).f9531m;
                        i58++;
                    }
                }
                int i59 = i53;
                boolean z11 = z10;
                int i60 = i57;
                while (true) {
                    if (i60 >= c5) {
                        nVar = nVar3;
                        i5 = h5;
                        break;
                    }
                    if (i55 >= i54 && i55 > 0 && !c1433q.isEmpty()) {
                        nVar = nVar3;
                        i5 = h5;
                        break;
                    }
                    int i61 = i54;
                    o a5 = kVar.a(j4, i60);
                    n nVar4 = nVar3;
                    int i62 = a5.f9531m;
                    int i63 = i55 + i62;
                    if (i63 > i46 || i60 == c5 - 1) {
                        int max = Math.max(i59, a5.f9532n);
                        c1433q.addLast(a5);
                        i59 = max;
                        i24 = 1;
                    } else {
                        i56 -= i62;
                        i4 = i60 + 1;
                        i24 = 1;
                        z11 = true;
                    }
                    i60 += i24;
                    i54 = i61;
                    nVar3 = nVar4;
                    i55 = i63;
                }
                if (i55 < i5) {
                    int i64 = i5 - i55;
                    i55 += i64;
                    i9 = i56 - i64;
                    while (i9 < i28 && i4 > 0) {
                        int i65 = i60;
                        int i66 = i4 - 1;
                        int i67 = i5;
                        o a6 = kVar.a(j4, i66);
                        c1433q.add(0, a6);
                        i59 = Math.max(i59, a6.f9532n);
                        i9 += a6.f9531m;
                        i4 = i66;
                        i60 = i65;
                        i5 = i67;
                    }
                    i6 = i60;
                    i7 = i5;
                    i8 = i64 + i50;
                    if (i9 < 0) {
                        i8 += i9;
                        i55 += i9;
                        i9 = 0;
                    }
                } else {
                    i6 = i60;
                    i7 = i5;
                    i8 = i50;
                    i9 = i56;
                }
                float f9 = (Integer.signum(Math.round(floatValue)) != Integer.signum(i8) || Math.abs(Math.round(floatValue)) < Math.abs(i8)) ? floatValue : i8;
                float f10 = floatValue - f9;
                float f11 = (!A4 || i8 <= i50 || f10 > 0.0f) ? 0.0f : (i8 - i50) + f10;
                if (i9 < 0) {
                    throw new IllegalArgumentException("negative currentFirstItemScrollOffset");
                }
                int i68 = -i9;
                o oVar6 = (o) c1433q.first();
                if (i28 > 0 || l8 < 0) {
                    int i69 = c1433q.f11958i;
                    o oVar7 = oVar6;
                    int i70 = 0;
                    while (i70 < i69) {
                        int i71 = ((o) c1433q.get(i70)).f9531m;
                        if (i9 == 0 || i71 > i9) {
                            break;
                        }
                        int i72 = i69;
                        if (i70 == C1441y.d(c1433q)) {
                            break;
                        }
                        i9 -= i71;
                        i70++;
                        oVar7 = (o) c1433q.get(i70);
                        i69 = i72;
                    }
                    lVar = this;
                    oVar = oVar7;
                } else {
                    oVar = oVar6;
                    lVar = this;
                }
                int i73 = lVar.f9495m;
                int i74 = i59;
                int max2 = Math.max(0, i4 - i73);
                float f12 = f11;
                int i75 = i4 - 1;
                if (max2 <= i75) {
                    list2 = null;
                    while (true) {
                        if (list2 == null) {
                            list2 = new ArrayList();
                        }
                        i10 = i9;
                        list2.add(kVar.a(j4, i75));
                        i11 = -1;
                        if (i75 == max2) {
                            break;
                        }
                        i75--;
                        i9 = i10;
                    }
                } else {
                    i10 = i9;
                    i11 = -1;
                    list2 = null;
                }
                int size4 = list.size() + i11;
                if (size4 >= 0) {
                    while (true) {
                        int i76 = size4 - 1;
                        int intValue = ((Number) list.get(size4)).intValue();
                        if (intValue < max2) {
                            if (list2 == null) {
                                list2 = new ArrayList();
                            }
                            list2.add(kVar.a(j4, intValue));
                        }
                        if (i76 < 0) {
                            break;
                        }
                        size4 = i76;
                    }
                }
                if (list2 == null) {
                    list2 = C1405I.f11931d;
                }
                int i77 = i74;
                int i78 = 0;
                for (int size5 = list2.size(); i78 < size5; size5 = size5) {
                    i77 = Math.max(i77, ((o) list2.get(i78)).f9532n);
                    i78++;
                }
                int i79 = ((o) C1403G.x(c1433q)).f9519a + i73;
                int i80 = c5 - 1;
                int min2 = Math.min(i79, i80);
                int i81 = ((o) C1403G.x(c1433q)).f9519a + 1;
                if (i81 <= min2) {
                    ArrayList arrayList4 = null;
                    while (true) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        i13 = i77;
                        arrayList = arrayList4;
                        i12 = i68;
                        arrayList.add(kVar.a(j4, i81));
                        if (i81 == min2) {
                            break;
                        }
                        i81++;
                        i68 = i12;
                        arrayList4 = arrayList;
                        i77 = i13;
                    }
                } else {
                    i12 = i68;
                    i13 = i77;
                    arrayList = null;
                }
                if (A4 && nVar != null) {
                    ?? r12 = nVar.f9511j;
                    if (!r12.isEmpty()) {
                        ArrayList arrayList5 = arrayList;
                        z4 = A4;
                        int i82 = -1;
                        for (int size6 = r12.size() - 1; i82 < size6; size6--) {
                            if (((o) r12.get(size6)).f9519a > min2 && (size6 == 0 || ((o) r12.get(size6 - 1)).f9519a <= min2)) {
                                oVar3 = (o) r12.get(size6);
                                break;
                            }
                            i82 = -1;
                        }
                        oVar3 = null;
                        o oVar8 = (o) C1403G.x(r12);
                        if (oVar3 != null && (i23 = oVar3.f9519a) <= (min = Math.min(oVar8.f9519a, i80))) {
                            int i83 = i23;
                            list4 = arrayList5;
                            while (true) {
                                i14 = i55;
                                if (list4 != null) {
                                    int size7 = list4.size();
                                    list3 = list2;
                                    int i84 = 0;
                                    while (true) {
                                        if (i84 >= size7) {
                                            obj5 = null;
                                            break;
                                        }
                                        obj5 = list4.get(i84);
                                        int i85 = size7;
                                        if (((o) obj5).f9519a == i83) {
                                            break;
                                        }
                                        i84++;
                                        size7 = i85;
                                    }
                                    oVar5 = (o) obj5;
                                } else {
                                    list3 = list2;
                                    oVar5 = null;
                                }
                                if (oVar5 == null) {
                                    if (list4 == null) {
                                        list4 = new ArrayList();
                                    }
                                    list4.add(kVar.a(j4, i83));
                                }
                                if (i83 == min) {
                                    break;
                                }
                                i83++;
                                list2 = list3;
                                i55 = i14;
                            }
                        } else {
                            i14 = i55;
                            list3 = list2;
                            list4 = arrayList5;
                        }
                        float f13 = ((r0.f9513l - oVar8.f9529k) - oVar8.f9530l) - f9;
                        if (f13 > 0.0f) {
                            int i86 = oVar8.f9519a + 1;
                            int i87 = 0;
                            while (i86 < c5 && i87 < f13) {
                                if (i86 <= min2) {
                                    int e4 = c1433q.e();
                                    int i88 = 0;
                                    while (true) {
                                        if (i88 >= e4) {
                                            f6 = f13;
                                            obj4 = null;
                                            break;
                                        }
                                        obj4 = c1433q.get(i88);
                                        f6 = f13;
                                        if (((o) obj4).f9519a == i86) {
                                            break;
                                        }
                                        i88++;
                                        f13 = f6;
                                    }
                                    oVar4 = (o) obj4;
                                    i21 = 1;
                                } else {
                                    f6 = f13;
                                    if (list4 != null) {
                                        int size8 = list4.size();
                                        int i89 = 0;
                                        while (true) {
                                            if (i89 >= size8) {
                                                i21 = 1;
                                                obj3 = null;
                                                break;
                                            }
                                            Object obj6 = list4.get(i89);
                                            if (((o) obj6).f9519a == i86) {
                                                obj3 = obj6;
                                                i21 = 1;
                                                break;
                                            }
                                            i89++;
                                        }
                                        oVar4 = (o) obj3;
                                    } else {
                                        i21 = 1;
                                        oVar4 = null;
                                    }
                                }
                                if (oVar4 != null) {
                                    i86 += i21;
                                    i22 = oVar4.f9531m;
                                } else {
                                    if (list4 == null) {
                                        list4 = new ArrayList();
                                    }
                                    list4.add(kVar.a(j4, i86));
                                    i86++;
                                    i22 = ((o) C1403G.x(list4)).f9531m;
                                }
                                i87 += i22;
                                f13 = f6;
                            }
                        }
                        if (list4 != null && ((o) C1403G.x(list4)).f9519a > min2) {
                            min2 = ((o) C1403G.x(list4)).f9519a;
                        }
                        size = list.size();
                        for (i15 = 0; i15 < size; i15++) {
                            int intValue2 = ((Number) list.get(i15)).intValue();
                            if (intValue2 > min2) {
                                if (list4 == null) {
                                    list4 = new ArrayList();
                                }
                                list4.add(kVar.a(j4, intValue2));
                            }
                        }
                        if (list4 == null) {
                            list4 = C1405I.f11931d;
                        }
                        size2 = list4.size();
                        int i90 = i13;
                        for (i16 = 0; i16 < size2; i16++) {
                            i90 = Math.max(i90, ((o) list4.get(i16)).f9532n);
                        }
                        if (!Intrinsics.a(oVar, c1433q.first()) && list3.isEmpty() && list4.isEmpty()) {
                            j5 = Q3;
                            z5 = true;
                        } else {
                            j5 = Q3;
                            z5 = false;
                        }
                        s4 = u3.d.s(j5, i90);
                        i17 = i14;
                        r2 = u3.d.r(j5, i17);
                        int i91 = i7;
                        z6 = i17 >= Math.min(r2, i91);
                        if (!z6 && i12 != 0) {
                            throw new IllegalStateException("non-zero itemsScrollOffset");
                        }
                        ArrayList arrayList6 = new ArrayList(list4.size() + list3.size() + c1433q.e());
                        if (z6) {
                            oVar2 = oVar;
                            f4 = f9;
                            z7 = z5;
                            i18 = i91;
                            int size9 = list3.size();
                            int i92 = i12;
                            int i93 = 0;
                            while (i93 < size9) {
                                List list5 = list3;
                                o oVar9 = (o) list5.get(i93);
                                i92 -= oVar9.f9531m;
                                oVar9.c(i92, s4, r2);
                                arrayList6.add(oVar9);
                                i93++;
                                list3 = list5;
                            }
                            int e5 = c1433q.e();
                            int i94 = i12;
                            for (int i95 = 0; i95 < e5; i95++) {
                                o oVar10 = (o) c1433q.get(i95);
                                oVar10.c(i94, s4, r2);
                                arrayList6.add(oVar10);
                                i94 += oVar10.f9531m;
                            }
                            int size10 = list4.size();
                            for (int i96 = 0; i96 < size10; i96++) {
                                o oVar11 = (o) list4.get(i96);
                                oVar11.c(i94, s4, r2);
                                arrayList6.add(oVar11);
                                i94 += oVar11.f9531m;
                            }
                        } else {
                            if (!list3.isEmpty() || !list4.isEmpty()) {
                                throw new IllegalArgumentException("no extra items");
                            }
                            int e6 = c1433q.e();
                            int[] iArr = new int[e6];
                            int i97 = 0;
                            while (i97 < e6) {
                                if (z9) {
                                    f5 = f9;
                                    i20 = (e6 - i97) - 1;
                                } else {
                                    f5 = f9;
                                    i20 = i97;
                                }
                                iArr[i97] = ((o) c1433q.get(i20)).f9530l;
                                i97++;
                                f9 = f5;
                            }
                            f4 = f9;
                            int[] iArr2 = new int[e6];
                            int i98 = 0;
                            while (i98 < e6) {
                                iArr2[i98] = 0;
                                i98++;
                                oVar = oVar;
                            }
                            oVar2 = oVar;
                            if (interfaceC1029h == null) {
                                throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                            }
                            interfaceC1029h.c(r2, tVar2, iArr, iArr2);
                            if (z9) {
                                tVar2 = tVar2;
                                z7 = z5;
                                Intrinsics.checkNotNullParameter(iArr2, "<this>");
                                Intrinsics.checkNotNullParameter(iArr2, "<this>");
                                i18 = i91;
                                IntRange intRange2 = new IntRange(0, e6 - 1, 1);
                                Intrinsics.checkNotNullParameter(intRange2, "<this>");
                                a.C0003a c0003a = kotlin.ranges.a.f7504j;
                                int i99 = -intRange2.f7507i;
                                c0003a.getClass();
                                aVar = new kotlin.ranges.a(intRange2.f7506e, 0, i99);
                            } else {
                                Intrinsics.checkNotNullParameter(iArr2, "<this>");
                                Intrinsics.checkNotNullParameter(iArr2, "<this>");
                                tVar2 = tVar2;
                                z7 = z5;
                                aVar = new IntRange(0, e6 - 1, 1);
                                i18 = i91;
                            }
                            int i100 = aVar.f7505d;
                            int i101 = aVar.f7506e;
                            int i102 = aVar.f7507i;
                            if ((i102 > 0 && i100 <= i101) || (i102 < 0 && i101 <= i100)) {
                                while (true) {
                                    int i103 = iArr2[i100];
                                    o oVar12 = (o) c1433q.get(!z9 ? i100 : (e6 - i100) - 1);
                                    if (z9) {
                                        i19 = e6;
                                        i103 = (r2 - i103) - oVar12.f9530l;
                                    } else {
                                        i19 = e6;
                                    }
                                    oVar12.c(i103, s4, r2);
                                    arrayList6.add(oVar12);
                                    if (i100 == i101) {
                                        break;
                                    }
                                    i100 += i102;
                                    e6 = i19;
                                }
                            }
                        }
                        aVar2.b(s4, r2, arrayList6, c0016l, kVar, z4, z8, i10, i17);
                        if (!z4) {
                            aVar2.a();
                            if (!M0.j.a(0L, 0L)) {
                                s4 = u3.d.s(j5, Math.max(s4, (int) 0));
                                int r4 = u3.d.r(j5, Math.max(r2, (int) 0));
                                if (r4 != r2) {
                                    int size11 = arrayList6.size();
                                    for (int i104 = 0; i104 < size11; i104++) {
                                        ((o) arrayList6.get(i104)).f9533o = r4;
                                    }
                                }
                                r2 = r4;
                            }
                        }
                        c1405i3.getClass();
                        boolean z12 = i6 >= c5 || i17 > i18;
                        InterfaceC0946G interfaceC0946G = (InterfaceC0946G) jVar.g(Integer.valueOf(s4), Integer.valueOf(r2), new P.h(arrayList6, (o) null, z4, vVar2.f9571u));
                        if (z7) {
                            arrayList2 = new ArrayList(arrayList6.size());
                            int size12 = arrayList6.size();
                            for (int i105 = 0; i105 < size12; i105++) {
                                Object obj7 = arrayList6.get(i105);
                                o oVar13 = (o) obj7;
                                if (oVar13.f9519a >= ((o) c1433q.first()).f9519a) {
                                    if (oVar13.f9519a <= ((o) c1433q.last()).f9519a) {
                                        arrayList2.add(obj7);
                                    }
                                }
                            }
                        } else {
                            arrayList2 = arrayList6;
                        }
                        vVar = vVar2;
                        nVar2 = new n(oVar2, i10, z12, f4, interfaceC0946G, f12, z11, cVar2, tVar2, kVar.f9478c, arrayList2, i45, i52, c5, n2, i27, l8);
                    }
                }
                i14 = i55;
                z4 = A4;
                list3 = list2;
                list4 = arrayList;
                if (list4 != null) {
                    min2 = ((o) C1403G.x(list4)).f9519a;
                }
                size = list.size();
                while (i15 < size) {
                }
                if (list4 == null) {
                }
                size2 = list4.size();
                int i902 = i13;
                while (i16 < size2) {
                }
                if (!Intrinsics.a(oVar, c1433q.first())) {
                }
                j5 = Q3;
                z5 = false;
                s4 = u3.d.s(j5, i902);
                i17 = i14;
                r2 = u3.d.r(j5, i17);
                int i912 = i7;
                if (i17 >= Math.min(r2, i912)) {
                }
                if (!z6) {
                }
                ArrayList arrayList62 = new ArrayList(list4.size() + list3.size() + c1433q.e());
                if (z6) {
                }
                aVar2.b(s4, r2, arrayList62, c0016l, kVar, z4, z8, i10, i17);
                if (!z4) {
                }
                c1405i3.getClass();
                if (i6 >= c5) {
                }
                InterfaceC0946G interfaceC0946G2 = (InterfaceC0946G) jVar.g(Integer.valueOf(s4), Integer.valueOf(r2), new P.h(arrayList62, (o) null, z4, vVar2.f9571u));
                if (z7) {
                }
                vVar = vVar2;
                nVar2 = new n(oVar2, i10, z12, f4, interfaceC0946G2, f12, z11, cVar2, tVar2, kVar.f9478c, arrayList2, i45, i52, c5, n2, i27, l8);
            }
            n nVar5 = nVar2;
            vVar.f(nVar5, interfaceC0964Z.A(), false);
            return nVar5;
        } catch (Throwable th) {
            Q.w.f(c6, d4, f7);
            throw th;
        }
    }
}
