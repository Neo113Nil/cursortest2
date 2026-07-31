package t;

import F.D0;
import b0.InterfaceC0251B;
import e2.AbstractC0381e;
import e2.C0378b;
import e2.C0380d;
import f2.InterfaceC0388c;
import h.AbstractC0416e;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import k.C0523b;
import o.J;
import r.InterfaceC0796H;
import r.InterfaceC0808e;
import r.InterfaceC0811h;
import r0.B;
import r0.Q;
import s.C0873p;

/* loaded from: classes.dex */
public final class m extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f7616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0796H f7617f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f7618g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0388c f7619h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f7620i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0811h f7621j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(y yVar, InterfaceC0796H interfaceC0796H, boolean z3, InterfaceC0388c interfaceC0388c, c cVar, InterfaceC0811h interfaceC0811h, InterfaceC0808e interfaceC0808e, p2.c cVar2, InterfaceC0251B interfaceC0251B) {
        super(2);
        this.f7616e = yVar;
        this.f7617f = interfaceC0796H;
        this.f7618g = z3;
        this.f7619h = interfaceC0388c;
        this.f7620i = cVar;
        this.f7621j = interfaceC0811h;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03e1 A[EDGE_INSN: B:125:0x03e1->B:126:0x03e1 BREAK  A[LOOP:4: B:112:0x0390->B:122:0x03d6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04a5 A[LOOP:6: B:156:0x04a3->B:157:0x04a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a6  */
    @Override // Y1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj, Object obj2) {
        s sVar;
        int i3;
        int r3;
        int g3;
        int i4;
        long j3;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int size;
        int i9;
        u uVar;
        List list;
        int size2;
        int i10;
        int i11;
        int i12;
        int i13;
        r rVar;
        int h3;
        int p;
        boolean z4;
        int b2;
        int i14;
        ArrayList arrayList;
        int i15;
        long j4;
        y yVar;
        ArrayList arrayList2;
        int size3;
        int i16;
        p pVar;
        C0378b f02;
        int[] iArr;
        int i17;
        int i18;
        int i19;
        int i20;
        u uVar2;
        int i21;
        u.y yVar2 = (u.y) obj;
        long j5 = ((M0.a) obj2).f2760a;
        y yVar3 = this.f7616e;
        yVar3.f7703q.getValue();
        J j6 = J.f6443d;
        AbstractC0416e.n(j5, j6);
        M0.j layoutDirection = yVar2.f8101e.getLayoutDirection();
        InterfaceC0796H interfaceC0796H = this.f7617f;
        int k3 = yVar2.f8101e.k(interfaceC0796H.b(layoutDirection));
        int k4 = yVar2.f8101e.k(interfaceC0796H.a(yVar2.f8101e.getLayoutDirection()));
        int k5 = yVar2.f8101e.k(interfaceC0796H.d());
        float c3 = interfaceC0796H.c();
        Q q2 = yVar2.f8101e;
        int k6 = q2.k(c3);
        int i22 = k5 + k6;
        int i23 = k3 + k4;
        boolean z5 = this.f7618g;
        int i24 = !z5 ? k5 : z5 ? k6 : k4;
        int i25 = i22 - i24;
        long J3 = I2.l.J(-i23, -i22, j5);
        h hVar = (h) this.f7619h.b();
        u uVar3 = hVar.f7587b.f7584h;
        c cVar = this.f7620i;
        int i26 = i24;
        if (cVar.f7575d != null && M0.a.b(cVar.f7573b, j5) && cVar.f7574c == q2.a()) {
            s sVar2 = cVar.f7575d;
            Z1.i.c(sVar2);
            sVar = sVar2;
        } else {
            cVar.f7573b = j5;
            cVar.f7574c = q2.a();
            s sVar3 = (s) cVar.f7572a.g(yVar2, new M0.a(j5));
            cVar.f7575d = sVar3;
            sVar = sVar3;
        }
        int length = sVar.f7667a.length;
        if (length != uVar3.f7671b) {
            uVar3.f7671b = length;
            ArrayList arrayList3 = (ArrayList) uVar3.f7673d;
            arrayList3.clear();
            i3 = i23;
            arrayList3.add(new C0523b(0, 0));
            ((ArrayList) uVar3.f7674e).clear();
        } else {
            i3 = i23;
        }
        InterfaceC0811h interfaceC0811h = this.f7621j;
        if (interfaceC0811h == null) {
            throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
        }
        int k7 = q2.k(interfaceC0811h.a());
        int i27 = hVar.f7587b.n().f1502e;
        int g4 = M0.a.g(j5) - i22;
        long c4 = (!z5 || g4 > 0) ? I2.d.c(k3, k5) : I2.d.c(k3, k5 + g4);
        boolean z6 = this.f7618g;
        y yVar4 = this.f7616e;
        int i28 = i3;
        k kVar = new k(hVar, yVar2, k7, yVar4, z6, i26, i25, c4);
        l lVar = new l(sVar, i27, k7, kVar, uVar3);
        D0 d02 = new D0(uVar3, 29, lVar);
        S.i c5 = S.u.c();
        Y1.c f3 = c5 != null ? c5.f() : null;
        S.i d3 = S.u.d(c5);
        try {
            C0873p c0873p = yVar4.f7689b;
            int g5 = c0873p.f7452b.g();
            int A3 = AbstractC0381e.A(g5, c0873p.f7455e, hVar);
            if (g5 != A3) {
                c0873p.f7452b.h(A3);
                c0873p.f7456f.b(g5);
            }
            if (A3 >= i27 && i27 > 0) {
                r3 = uVar3.r(i27 - 1);
                g3 = 0;
                S.u.f(c5, d3, f3);
                y yVar5 = yVar3;
                List l3 = AbstractC0381e.l(hVar, yVar5.f7702o, yVar5.f7699l);
                float f4 = yVar5.f7692e;
                if (i26 >= 0) {
                    throw new IllegalArgumentException("negative beforeContentPadding");
                }
                if (i25 < 0) {
                    throw new IllegalArgumentException("negative afterContentPadding");
                }
                List list2 = M1.u.f2803d;
                M1.v vVar = M1.v.f2804d;
                List list3 = l3;
                androidx.compose.foundation.lazy.layout.a aVar = yVar5.f7698k;
                if (i27 <= 0) {
                    int j7 = M0.a.j(J3);
                    int i29 = M0.a.i(J3);
                    aVar.c(j7, i29, new ArrayList(), hVar.f7588c, kVar, false, length, false, 0, 0);
                    aVar.b();
                    if (!M0.i.a(0L, 0L)) {
                        j7 = I2.l.q(J3, (int) 0);
                        i29 = I2.l.p(J3, (int) 0);
                    }
                    pVar = new p(null, 0, false, 0.0f, q2.Y(I2.l.q(j5, j7 + i28), I2.l.p(j5, i29 + i22), vVar, n.f7622f), false, d02, list2, -i26, g4 + i25, 0, j6, i25, k7);
                    yVar = yVar5;
                } else {
                    long j8 = j5;
                    int round = Math.round(f4);
                    int i30 = g3 - round;
                    if (r3 != 0 || i30 >= 0) {
                        i4 = r3;
                    } else {
                        round += i30;
                        i4 = r3;
                        i30 = 0;
                    }
                    M1.j jVar = new M1.j();
                    int i31 = -i26;
                    int i32 = i31 + (k7 < 0 ? k7 : 0);
                    int i33 = i30 + i32;
                    while (i33 < 0 && i4 > 0) {
                        int i34 = i31;
                        int i35 = i4 - 1;
                        D0 d03 = d02;
                        r b3 = lVar.b(i35);
                        i4 = i35;
                        jVar.add(0, b3);
                        i33 += b3.f7666g;
                        d02 = d03;
                        i31 = i34;
                    }
                    D0 d04 = d02;
                    int i36 = i31;
                    if (i33 < i32) {
                        round += i33;
                        i33 = i32;
                    }
                    int i37 = i33 - i32;
                    int i38 = g4 + i25;
                    int i39 = i38 < 0 ? 0 : i38;
                    int i40 = i37;
                    int i41 = -i37;
                    int i42 = i4;
                    int i43 = 0;
                    boolean z7 = false;
                    while (i43 < jVar.f2799f) {
                        if (i41 >= i39) {
                            jVar.c(i43);
                            z7 = true;
                        } else {
                            i42++;
                            i41 += ((r) jVar.get(i43)).f7666g;
                            i43++;
                        }
                    }
                    boolean z8 = z7;
                    int i44 = i42;
                    while (i44 < i27 && (i41 < i39 || i41 <= 0 || jVar.isEmpty())) {
                        int i45 = i39;
                        r b4 = lVar.b(i44);
                        z3 = z8;
                        q[] qVarArr = b4.f7661b;
                        j3 = j8;
                        if (qVarArr.length == 0) {
                            break;
                        }
                        int i46 = b4.f7666g;
                        i41 += i46;
                        if (i41 <= i32) {
                            if (qVarArr.length == 0) {
                                throw new NoSuchElementException("Array is empty.");
                            }
                            if (qVarArr[qVarArr.length - 1].f7643a != i27 - 1) {
                                i40 -= i46;
                                i4 = i44 + 1;
                                z8 = true;
                                i44++;
                                i39 = i45;
                                j8 = j3;
                            }
                        }
                        jVar.addLast(b4);
                        z8 = z3;
                        i44++;
                        i39 = i45;
                        j8 = j3;
                    }
                    j3 = j8;
                    z3 = z8;
                    if (i41 < g4) {
                        int i47 = g4 - i41;
                        i41 += i47;
                        i6 = i40 - i47;
                        while (i6 < i26 && i4 > 0) {
                            int i48 = i4 - 1;
                            r b5 = lVar.b(i48);
                            jVar.add(0, b5);
                            i6 += b5.f7666g;
                            i4 = i48;
                        }
                        int i49 = round + i47;
                        if (i6 < 0) {
                            i41 += i6;
                            i5 = i49 + i6;
                            i6 = 0;
                        } else {
                            i5 = i49;
                        }
                    } else {
                        i5 = round;
                        i6 = i40;
                    }
                    float f5 = (Integer.signum(Math.round(f4)) != Integer.signum(i5) || Math.abs(Math.round(f4)) < Math.abs(i5)) ? f4 : i5;
                    if (i6 < 0) {
                        throw new IllegalArgumentException("negative initial offset");
                    }
                    int i50 = -i6;
                    r rVar2 = (r) jVar.first();
                    q[] qVarArr2 = rVar2.f7661b;
                    q qVar = qVarArr2.length == 0 ? null : qVarArr2[0];
                    int i51 = qVar != null ? qVar.f7643a : 0;
                    r rVar3 = (r) jVar.k();
                    if (rVar3 != null) {
                        q[] qVarArr3 = rVar3.f7661b;
                        i7 = i6;
                        q qVar2 = qVarArr3.length == 0 ? null : qVarArr3[qVarArr3.length - 1];
                        if (qVar2 != null) {
                            i8 = qVar2.f7643a;
                            size = list3.size();
                            float f6 = f5;
                            i9 = 0;
                            List list4 = null;
                            while (true) {
                                uVar = lVar.f7614e;
                                if (i9 < size) {
                                    break;
                                }
                                int i52 = size;
                                List list5 = list3;
                                y yVar6 = yVar5;
                                int intValue = ((Number) list5.get(i9)).intValue();
                                if (intValue < 0 || intValue >= i51) {
                                    i21 = i51;
                                } else {
                                    i21 = i51;
                                    int i53 = uVar.f7671b;
                                    int y3 = uVar.y(intValue);
                                    q a3 = kVar.a(intValue, lVar.a(0, y3), 0, y3, kVar.f7603c);
                                    if (list4 == null) {
                                        list4 = new ArrayList();
                                    }
                                    List list6 = list4;
                                    list6.add(a3);
                                    list4 = list6;
                                }
                                i9++;
                                yVar5 = yVar6;
                                list3 = list5;
                                size = i52;
                                i51 = i21;
                            }
                            List list7 = list3;
                            y yVar7 = yVar5;
                            int i54 = i51;
                            list = list4 != null ? list2 : list4;
                            size2 = list7.size();
                            List list8 = null;
                            i10 = 0;
                            while (i10 < size2) {
                                int i55 = size2;
                                int intValue2 = ((Number) list7.get(i10)).intValue();
                                List list9 = list7;
                                if (i8 + 1 > intValue2 || intValue2 >= i27) {
                                    uVar2 = uVar;
                                } else {
                                    int i56 = uVar.f7671b;
                                    int y4 = uVar.y(intValue2);
                                    uVar2 = uVar;
                                    q a4 = kVar.a(intValue2, lVar.a(0, y4), 0, y4, kVar.f7603c);
                                    if (list8 == null) {
                                        list8 = new ArrayList();
                                    }
                                    list8.add(a4);
                                }
                                i10++;
                                size2 = i55;
                                list7 = list9;
                                uVar = uVar2;
                            }
                            List list10 = list8 != null ? list2 : list8;
                            if (i26 <= 0 || k7 < 0) {
                                i11 = jVar.f2799f;
                                i12 = i7;
                                r rVar4 = rVar2;
                                i13 = 0;
                                while (i13 < i11) {
                                    int i57 = ((r) jVar.get(i13)).f7666g;
                                    if (i12 == 0 || i57 > i12 || i13 == M1.m.b0(jVar)) {
                                        break;
                                    }
                                    i12 -= i57;
                                    i13++;
                                    rVar4 = (r) jVar.get(i13);
                                }
                                rVar = rVar4;
                            } else {
                                i12 = i7;
                                rVar = rVar2;
                            }
                            h3 = M0.a.h(J3);
                            p = I2.l.p(J3, i41);
                            z4 = i41 >= Math.min(p, g4);
                            if (!z4 && i50 != 0) {
                                throw new IllegalStateException("non-zero firstLineScrollOffset");
                            }
                            i14 = 0;
                            int i58 = 0;
                            for (b2 = jVar.b(); i14 < b2; b2 = b2) {
                                i58 += ((r) jVar.get(i14)).f7661b.length;
                                i14++;
                            }
                            arrayList = new ArrayList(i58);
                            if (z4) {
                                i15 = i8;
                                j4 = J3;
                                int size4 = list.size() - 1;
                                if (size4 >= 0) {
                                    int i59 = i50;
                                    while (true) {
                                        int i60 = size4 - 1;
                                        q qVar3 = (q) list.get(size4);
                                        i59 -= qVar3.f7655m;
                                        qVar3.g(i59, 0, h3, p);
                                        arrayList.add(qVar3);
                                        if (i60 < 0) {
                                            break;
                                        }
                                        size4 = i60;
                                    }
                                }
                                int b6 = jVar.b();
                                int i61 = i50;
                                int i62 = 0;
                                while (i62 < b6) {
                                    r rVar5 = (r) jVar.get(i62);
                                    q[] a5 = rVar5.a(i61, h3, p);
                                    int length2 = a5.length;
                                    int i63 = b6;
                                    int i64 = 0;
                                    while (i64 < length2) {
                                        arrayList.add(a5[i64]);
                                        i64++;
                                        jVar = jVar;
                                    }
                                    i61 += rVar5.f7666g;
                                    i62++;
                                    b6 = i63;
                                }
                                int size5 = list10.size();
                                for (int i65 = 0; i65 < size5; i65++) {
                                    q qVar4 = (q) list10.get(i65);
                                    qVar4.g(i61, 0, h3, p);
                                    arrayList.add(qVar4);
                                    i61 += qVar4.f7655m;
                                }
                            } else {
                                if (!list.isEmpty() || !list10.isEmpty()) {
                                    throw new IllegalArgumentException("no items");
                                }
                                int b7 = jVar.b();
                                int[] iArr2 = new int[b7];
                                int i66 = 0;
                                while (i66 < b7) {
                                    if (z5) {
                                        i19 = i8;
                                        i20 = (b7 - i66) - 1;
                                    } else {
                                        i19 = i8;
                                        i20 = i66;
                                    }
                                    iArr2[i66] = ((r) jVar.get(i20)).f7665f;
                                    i66++;
                                    i8 = i19;
                                }
                                i15 = i8;
                                int[] iArr3 = new int[b7];
                                for (int i67 = 0; i67 < b7; i67++) {
                                    iArr3[i67] = 0;
                                }
                                j4 = J3;
                                interfaceC0811h.c(yVar2, p, iArr2, iArr3);
                                if (z5) {
                                    C0380d f03 = M1.k.f0(iArr3);
                                    f02 = new C0378b(f03.f4769e, f03.f4768d, -f03.f4770f);
                                } else {
                                    f02 = M1.k.f0(iArr3);
                                }
                                int i68 = f02.f4768d;
                                int i69 = f02.f4769e;
                                int i70 = f02.f4770f;
                                if ((i70 > 0 && i68 <= i69) || (i70 < 0 && i69 <= i68)) {
                                    while (true) {
                                        int i71 = iArr3[i68];
                                        if (z5) {
                                            iArr = iArr3;
                                            i17 = (b7 - i68) - 1;
                                        } else {
                                            iArr = iArr3;
                                            i17 = i68;
                                        }
                                        r rVar6 = (r) jVar.get(i17);
                                        if (z5) {
                                            i18 = b7;
                                            i71 = (p - i71) - rVar6.f7665f;
                                        } else {
                                            i18 = b7;
                                        }
                                        q[] a6 = rVar6.a(i71, h3, p);
                                        int i72 = 0;
                                        for (int length3 = a6.length; i72 < length3; length3 = length3) {
                                            arrayList.add(a6[i72]);
                                            i72++;
                                        }
                                        if (i68 == i69) {
                                            break;
                                        }
                                        i68 += i70;
                                        b7 = i18;
                                        iArr3 = iArr;
                                    }
                                }
                            }
                            aVar.c(h3, p, arrayList, kVar.f7601a.f7588c, kVar, false, length, false, i12, i41);
                            aVar.b();
                            if (!M0.i.a(0L, 0L)) {
                                long j9 = j4;
                                h3 = I2.l.q(j9, Math.max(h3, (int) 0));
                                int p3 = I2.l.p(j9, Math.max(p, (int) 0));
                                if (p3 != p) {
                                    int size6 = arrayList.size();
                                    for (int i73 = 0; i73 < size6; i73++) {
                                        ((q) arrayList.get(i73)).f7656n = p3;
                                    }
                                }
                                p = p3;
                            }
                            int i74 = i15;
                            boolean z9 = i74 == i27 + (-1) || i41 > g4;
                            yVar = yVar7;
                            long j10 = j3;
                            B Y2 = q2.Y(I2.l.q(j10, h3 + i28), I2.l.p(j10, p + i22), vVar, new o(arrayList, 0, yVar.p));
                            if (list.isEmpty() || !list10.isEmpty()) {
                                arrayList2 = new ArrayList(arrayList.size());
                                size3 = arrayList.size();
                                i16 = 0;
                                while (i16 < size3) {
                                    Object obj3 = arrayList.get(i16);
                                    int i75 = ((q) obj3).f7643a;
                                    int i76 = i54;
                                    if (i76 <= i75 && i75 <= i74) {
                                        arrayList2.add(obj3);
                                    }
                                    i16++;
                                    i54 = i76;
                                }
                            } else {
                                arrayList2 = arrayList;
                            }
                            pVar = new p(rVar, i12, z9, f6, Y2, z3, d04, arrayList2, i36, i38, i27, j6, i25, k7);
                        }
                    } else {
                        i7 = i6;
                    }
                    i8 = 0;
                    size = list3.size();
                    float f62 = f5;
                    i9 = 0;
                    List list42 = null;
                    while (true) {
                        uVar = lVar.f7614e;
                        if (i9 < size) {
                        }
                        i9++;
                        yVar5 = yVar6;
                        list3 = list5;
                        size = i52;
                        i51 = i21;
                    }
                    List list72 = list3;
                    y yVar72 = yVar5;
                    int i542 = i51;
                    if (list42 != null) {
                    }
                    size2 = list72.size();
                    List list82 = null;
                    i10 = 0;
                    while (i10 < size2) {
                    }
                    if (list82 != null) {
                    }
                    if (i26 <= 0) {
                    }
                    i11 = jVar.f2799f;
                    i12 = i7;
                    r rVar42 = rVar2;
                    i13 = 0;
                    while (i13 < i11) {
                    }
                    rVar = rVar42;
                    h3 = M0.a.h(J3);
                    p = I2.l.p(J3, i41);
                    if (i41 >= Math.min(p, g4)) {
                    }
                    if (!z4) {
                    }
                    i14 = 0;
                    int i582 = 0;
                    while (i14 < b2) {
                    }
                    arrayList = new ArrayList(i582);
                    if (z4) {
                    }
                    aVar.c(h3, p, arrayList, kVar.f7601a.f7588c, kVar, false, length, false, i12, i41);
                    aVar.b();
                    if (!M0.i.a(0L, 0L)) {
                    }
                    int i742 = i15;
                    if (i742 == i27 + (-1)) {
                    }
                    yVar = yVar72;
                    long j102 = j3;
                    B Y22 = q2.Y(I2.l.q(j102, h3 + i28), I2.l.p(j102, p + i22), vVar, new o(arrayList, 0, yVar.p));
                    if (list.isEmpty()) {
                    }
                    arrayList2 = new ArrayList(arrayList.size());
                    size3 = arrayList.size();
                    i16 = 0;
                    while (i16 < size3) {
                    }
                    pVar = new p(rVar, i12, z9, f62, Y22, z3, d04, arrayList2, i36, i38, i27, j6, i25, k7);
                }
                yVar.f(pVar, false);
                return pVar;
            }
            r3 = uVar3.r(A3);
            g3 = c0873p.f7453c.g();
            S.u.f(c5, d3, f3);
            y yVar52 = yVar3;
            List l32 = AbstractC0381e.l(hVar, yVar52.f7702o, yVar52.f7699l);
            float f42 = yVar52.f7692e;
            if (i26 >= 0) {
            }
        } catch (Throwable th) {
            S.u.f(c5, d3, f3);
            throw th;
        }
    }
}
