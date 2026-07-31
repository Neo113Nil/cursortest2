package a0;

import b6.v1;
import b6.w1;
import b6.x1;
import b6.y1;
import j0.n2;
import j0.o1;
import j0.p1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import m0.b2;
import m0.i2;
import m0.t1;
import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f54d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f55e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f56f;

    public /* synthetic */ e0(int i, int i8, Object obj, Object obj2) {
        this.f54d = i8;
        this.f55e = obj;
        this.f56f = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:237:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x089f A[LOOP:15: B:291:0x089d->B:292:0x089f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x08df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0a59  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0b98  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0bba  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0bd9  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0c0c  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0c18  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0c1b  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0c11  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0c09  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0bc9  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0baa  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0a43  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0895  */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v36, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Collection, java.util.List] */
    @Override // p6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj, Object obj2) {
        int i;
        int i8;
        int i9;
        ?? arrayList;
        u1.x0 x0Var;
        List list;
        int i10;
        v6.d dVar;
        int i11;
        int i12;
        long j7;
        z.p pVar;
        int i13;
        int i14;
        int i15;
        int i16;
        float f6;
        int i17;
        float f8;
        int i18;
        int i19;
        List list2;
        List list3;
        int i20;
        List list4;
        int size;
        int i21;
        int size2;
        int i22;
        boolean z3;
        boolean z7;
        int i23;
        int i24;
        d6.v vVar;
        z.h hVar;
        int i25;
        f0 f0Var;
        z.l lVar;
        int i26;
        z.i iVar;
        ArrayList arrayList2;
        boolean z8;
        int i27;
        int i28;
        d6.k kVar;
        z.i iVar2;
        int i29;
        boolean z9;
        List list5;
        Integer valueOf;
        u1.x0 x0Var2;
        List list6;
        z.k kVar2;
        int i30;
        o.w wVar;
        z.i iVar3;
        int a8;
        Object obj3;
        long j8;
        int i31;
        int i32;
        int max;
        z.l lVar2;
        float f9;
        float f10;
        z.l lVar3;
        z.l lVar4;
        int i33;
        Object obj4;
        int i34;
        int min;
        z.l lVar5;
        Object obj5;
        switch (this.f54d) {
            case 0:
                boolean a9 = r2.k.a(0L, 0L);
                x xVar = (x) this.f55e;
                z.j jVar = (z.j) this.f56f;
                u1.x0 x0Var3 = (u1.x0) obj;
                f0 f0Var2 = new f0(xVar, x0Var3);
                long j9 = ((r2.a) obj2).f6514a;
                x.d dVar2 = jVar.f9036d;
                x.f0 f0Var3 = jVar.f9034b;
                z.p pVar2 = jVar.f9033a;
                pVar2.f9094s.getValue();
                boolean z10 = pVar2.f9078b || x0Var3.p();
                u.j0 j0Var = u.j0.f7028e;
                r2.o.q(j9, j0Var);
                r2.l layoutDirection = x0Var3.getLayoutDirection();
                r2.l lVar6 = r2.l.f6529d;
                int H = x0Var3.H(layoutDirection == lVar6 ? f0Var3.d(layoutDirection) : f0Var3.b(layoutDirection));
                r2.l layoutDirection2 = x0Var3.getLayoutDirection();
                int H2 = x0Var3.H(layoutDirection2 == lVar6 ? f0Var3.b(layoutDirection2) : f0Var3.d(layoutDirection2));
                int H3 = x0Var3.H(f0Var3.c());
                int H4 = x0Var3.H(f0Var3.a()) + H3;
                int i35 = H2 + H;
                int i36 = i35 - H;
                long h8 = r2.b.h(-i35, -H4, j9);
                z.h hVar2 = (z.h) jVar.f9035c.b();
                z.c cVar = hVar2.f9020c;
                int h9 = r2.a.h(h8);
                int g3 = r2.a.g(h8);
                cVar.f9011a.h(h9);
                cVar.f9012b.h(g3);
                if (dVar2 == null) {
                    w.a.b("null horizontalAlignment when isVertical == false");
                    throw new a5.c();
                }
                int H5 = x0Var3.H(dVar2.a());
                int c8 = hVar2.c();
                int h10 = r2.a.h(j9) - i35;
                z.p pVar3 = pVar2;
                z.i iVar4 = new z.i(h8, hVar2, f0Var2, c8, H5, jVar.f9039g, H, i36, (H3 & 4294967295L) | (H << 32), jVar.f9033a);
                long j10 = h8;
                w0.f e8 = w0.q.e();
                Integer num = null;
                p6.c e9 = e8 != null ? e8.e() : null;
                w0.f h11 = w0.q.h(e8);
                try {
                    i0.h hVar3 = pVar3.f9081e;
                    int g7 = ((m0.e1) hVar3.f3283b).g();
                    int f11 = g0.f(g7, hVar3.f3285d, hVar2);
                    if (g7 != f11) {
                        i9 = c8;
                        ((m0.e1) hVar3.f3283b).h(f11);
                        h0 h0Var = (h0) hVar3.f3286e;
                        i = f11;
                        if (g7 != h0Var.f89e) {
                            h0Var.f89e = g7;
                            int i37 = (g7 / 30) * 30;
                            i8 = H;
                            h0Var.f88d.setValue(r2.o.u0(Math.max(i37 - 100, 0), i37 + 130));
                        } else {
                            i8 = H;
                        }
                    } else {
                        i = f11;
                        i8 = H;
                        i9 = c8;
                    }
                    int g8 = ((m0.e1) hVar3.f3284c).g();
                    w0.q.k(e8, h11, e9);
                    k0 k0Var = pVar3.f9093r;
                    l lVar7 = pVar3.f9090o;
                    o0.e eVar = lVar7.f112a;
                    boolean z11 = eVar.f5580f != 0;
                    List list7 = d6.u.f2326d;
                    if (z11 || !k0Var.f109d.isEmpty()) {
                        arrayList = new ArrayList();
                        if (lVar7.f112a.f5580f != 0) {
                            int i38 = eVar.f5580f;
                            list = list7;
                            if (i38 == 0) {
                                throw new NoSuchElementException("MutableVector is empty.");
                            }
                            i10 = g8;
                            Object[] objArr = eVar.f5578d;
                            x0Var = x0Var3;
                            int i39 = ((k) objArr[0]).f107a;
                            int i40 = 0;
                            while (i40 < i38) {
                                int i41 = i40;
                                int i42 = ((k) objArr[i40]).f107a;
                                if (i42 < i39) {
                                    i39 = i42;
                                }
                                i40 = i41 + 1;
                            }
                            if (i39 < 0) {
                                w.a.a("negative minIndex");
                            }
                            int i43 = eVar.f5580f;
                            if (i43 == 0) {
                                throw new NoSuchElementException("MutableVector is empty.");
                            }
                            Object[] objArr2 = eVar.f5578d;
                            int i44 = ((k) objArr2[0]).f108b;
                            int i45 = 0;
                            while (i45 < i43) {
                                Object[] objArr3 = objArr2;
                                int i46 = ((k) objArr2[i45]).f108b;
                                if (i46 > i44) {
                                    i44 = i46;
                                }
                                i45++;
                                objArr2 = objArr3;
                            }
                            dVar = new v6.d(i39, Math.min(i44, hVar2.c() - 1), 1);
                        } else {
                            x0Var = x0Var3;
                            list = list7;
                            i10 = g8;
                            dVar = v6.d.f7499g;
                        }
                        int size3 = k0Var.f109d.size();
                        for (int i47 = 0; i47 < size3; i47++) {
                            i0 i0Var = (i0) k0Var.get(i47);
                            int f12 = g0.f(i0Var.f93c, i0Var.f91a, hVar2);
                            int i48 = dVar.f7492d;
                            if ((f12 > dVar.f7493e || i48 > f12) && f12 >= 0 && f12 < hVar2.c()) {
                                arrayList.add(Integer.valueOf(f12));
                            }
                        }
                        int i49 = dVar.f7492d;
                        int i50 = dVar.f7493e;
                        if (i49 <= i50) {
                            while (true) {
                                arrayList.add(Integer.valueOf(i49));
                                if (i49 != i50) {
                                    i49++;
                                }
                            }
                        }
                    } else {
                        x0Var = x0Var3;
                        arrayList = list7;
                        list = arrayList;
                        i10 = g8;
                    }
                    float floatValue = (x0Var.p() || !z10) ? pVar3.f9084h : ((Number) ((r.k) pVar3.f9098w.f12f).f6331e.getValue()).floatValue();
                    androidx.compose.foundation.lazy.layout.b bVar = pVar3.f9089n;
                    boolean p7 = x0Var.p();
                    z.k kVar3 = pVar3.f9079c;
                    a7.u uVar = jVar.f9037e;
                    m0.z0 z0Var = pVar3.f9097v;
                    i iVar5 = jVar.f9038f;
                    if (i8 < 0) {
                        w.a.a("invalid beforeContentPadding");
                    }
                    if (i36 < 0) {
                        w.a.a("invalid afterContentPadding");
                    }
                    d6.v vVar2 = d6.v.f2327d;
                    z.h hVar4 = iVar4.f9023b;
                    if (i9 <= 0) {
                        int j11 = r2.a.j(j10);
                        int i51 = r2.a.i(j10);
                        bVar.b(j11, i51, new ArrayList(), hVar4.f9021d, iVar4, p7, z10, 0, 0);
                        if (!p7) {
                            bVar.a();
                            if (!a9) {
                                j11 = r2.b.f((int) 0, j10);
                                i51 = r2.b.e((int) 0, j10);
                            }
                        }
                        u1.x0 x0Var4 = x0Var;
                        kVar2 = new z.k(null, 0, false, 0.0f, x0Var4.e0(r2.b.f(j11 + i35, j9), r2.b.e(i51 + H4, j9), vVar2, new s1(23)), 0.0f, false, uVar, f0Var2, iVar4.f9025d, list, -i8, h10 + i36, 0, j0Var, i36, H5);
                        x0Var2 = x0Var4;
                        pVar = pVar3;
                    } else {
                        int i52 = i;
                        float f13 = floatValue;
                        int i53 = i9;
                        int i54 = i8;
                        if (i52 >= i53) {
                            i52 = i53 - 1;
                            i10 = 0;
                        }
                        int round = Math.round(f13);
                        int i55 = i10 - round;
                        if (i52 == 0 && i55 < 0) {
                            round += i55;
                            i55 = 0;
                        }
                        int i56 = i52;
                        d6.k kVar4 = new d6.k();
                        int i57 = -i54;
                        if (H5 < 0) {
                            i12 = H5;
                            i11 = i12;
                        } else {
                            i11 = H5;
                            i12 = 0;
                        }
                        int i58 = i57 + i12;
                        int i59 = i55 + i58;
                        int i60 = 0;
                        while (true) {
                            j7 = iVar4.f9025d;
                            if (i59 < 0 && i56 > 0) {
                                z.p pVar4 = pVar3;
                                int i61 = i56 - 1;
                                z.l a10 = iVar4.a(i61, j7);
                                kVar4.add(0, a10);
                                i60 = Math.max(i60, a10.f9066l);
                                i59 += a10.f9065k;
                                i56 = i61;
                                pVar3 = pVar4;
                            }
                        }
                        pVar = pVar3;
                        if (i59 < i58) {
                            round -= i58 - i59;
                            i59 = i58;
                        }
                        int i62 = round;
                        int i63 = i59 - i58;
                        int i64 = h10 + i36;
                        int i65 = i60;
                        int i66 = i64 < 0 ? 0 : i64;
                        int i67 = -i63;
                        int i68 = i57;
                        int i69 = i63;
                        int i70 = i56;
                        int i71 = 0;
                        boolean z12 = false;
                        while (i71 < kVar4.f2322f) {
                            if (i67 >= i66) {
                                kVar4.b(i71);
                                z12 = true;
                            } else {
                                i70++;
                                i67 += ((z.l) kVar4.get(i71)).f9065k;
                                i71++;
                            }
                        }
                        int i72 = i65;
                        int i73 = i70;
                        while (i73 < i53 && (i67 < i66 || i67 <= 0 || kVar4.isEmpty())) {
                            int i74 = i66;
                            z.l a11 = iVar4.a(i73, j7);
                            long j12 = j10;
                            int i75 = a11.f9065k;
                            i67 += i75;
                            if (i67 > i58 || i73 == i53 - 1) {
                                i72 = Math.max(i72, a11.f9066l);
                                kVar4.addLast(a11);
                            } else {
                                i69 -= i75;
                                i56 = i73 + 1;
                                z12 = true;
                            }
                            i73++;
                            i66 = i74;
                            j10 = j12;
                        }
                        long j13 = j10;
                        int i76 = h10;
                        if (i67 < i76) {
                            int i77 = i76 - i67;
                            int i78 = i67 + i77;
                            int i79 = i69 - i77;
                            while (i79 < i54 && i56 > 0) {
                                int i80 = i56 - 1;
                                int i81 = i77;
                                z.l a12 = iVar4.a(i80, j7);
                                kVar4.add(0, a12);
                                i72 = Math.max(i72, a12.f9066l);
                                i79 += a12.f9065k;
                                i56 = i80;
                                i77 = i81;
                            }
                            int i82 = i79;
                            i13 = i62 + i77;
                            if (i82 < 0) {
                                i13 += i82;
                                i14 = i78 + i82;
                                i15 = i56;
                                i16 = 0;
                            } else {
                                i14 = i78;
                                i15 = i56;
                                i16 = i82;
                            }
                        } else {
                            i13 = i62;
                            i14 = i67;
                            i15 = i56;
                            i16 = i69;
                        }
                        int i83 = i72;
                        int i84 = i73;
                        float f14 = (Integer.signum(Math.round(f13)) != Integer.signum(i13) || Math.abs(Math.round(f13)) < Math.abs(i13)) ? f13 : i13;
                        float f15 = f13 - f14;
                        float f16 = (!p7 || i13 <= i62 || f15 > 0.0f) ? 0.0f : (i13 - i62) + f15;
                        if (i16 < 0) {
                            w.a.a("negative currentFirstItemScrollOffset");
                        }
                        int i85 = -i16;
                        z.l lVar8 = (z.l) kVar4.first();
                        if (i54 > 0 || i11 < 0) {
                            int a13 = kVar4.a();
                            f6 = f16;
                            int i86 = i16;
                            int i87 = 0;
                            while (true) {
                                if (i87 < a13) {
                                    f8 = f14;
                                    int i88 = ((z.l) kVar4.get(i87)).f9065k;
                                    if (i86 != 0 && i88 <= i86) {
                                        i17 = i86;
                                        if (i87 != s6.a.t(kVar4)) {
                                            i86 = i17 - i88;
                                            i87++;
                                            lVar8 = (z.l) kVar4.get(i87);
                                            f14 = f8;
                                        }
                                    }
                                } else {
                                    i17 = i86;
                                    f8 = f14;
                                }
                            }
                            i17 = i86;
                            i16 = i17;
                        } else {
                            f6 = f16;
                            f8 = f14;
                        }
                        z.l lVar9 = lVar8;
                        int max2 = Math.max(0, i15);
                        int i89 = i15 - 1;
                        List list8 = null;
                        if (max2 <= i89) {
                            while (true) {
                                if (list8 == null) {
                                    list8 = new ArrayList();
                                }
                                list8.add(iVar4.a(i89, j7));
                                if (i89 != max2) {
                                    i89--;
                                }
                            }
                        }
                        int size4 = arrayList.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i90 = size4 - 1;
                                int intValue = ((Number) arrayList.get(size4)).intValue();
                                if (intValue < max2) {
                                    if (list8 == null) {
                                        list8 = new ArrayList();
                                    }
                                    list8.add(iVar4.a(intValue, j7));
                                }
                                if (i90 >= 0) {
                                    size4 = i90;
                                }
                            }
                        }
                        if (list8 == null) {
                            list8 = list;
                        }
                        int size5 = list8.size();
                        int i91 = i83;
                        int i92 = 0;
                        while (i92 < size5) {
                            i91 = Math.max(i91, ((z.l) list8.get(i92)).f9066l);
                            i92++;
                            i85 = i85;
                        }
                        int i93 = i85;
                        int i94 = i53 - 1;
                        int min2 = Math.min(((z.l) d6.m.X(kVar4)).f9056a, i94);
                        int i95 = ((z.l) d6.m.X(kVar4)).f9056a + 1;
                        if (i95 <= min2) {
                            List list9 = null;
                            while (true) {
                                if (list9 == null) {
                                    list9 = new ArrayList();
                                }
                                i18 = i91;
                                list2 = list9;
                                i19 = i16;
                                list2.add(iVar4.a(i95, j7));
                                if (i95 != min2) {
                                    i95++;
                                    i16 = i19;
                                    list9 = list2;
                                    i91 = i18;
                                }
                            }
                        } else {
                            i18 = i91;
                            i19 = i16;
                            list2 = null;
                        }
                        if (p7 && kVar3 != null) {
                            ?? r13 = kVar3.f9049k;
                            if (!r13.isEmpty()) {
                                List list10 = list2;
                                for (int size6 = r13.size() - 1; -1 < size6; size6--) {
                                    if (((z.l) r13.get(size6)).f9056a > min2 && (size6 == 0 || ((z.l) r13.get(size6 - 1)).f9056a <= min2)) {
                                        lVar2 = (z.l) r13.get(size6);
                                        z.l lVar10 = (z.l) d6.m.X(r13);
                                        if (lVar2 != null || (i34 = lVar2.f9056a) > (min = Math.min(lVar10.f9056a, i94))) {
                                            list3 = list8;
                                            i20 = i76;
                                            list4 = list10;
                                        } else {
                                            int i96 = i34;
                                            list4 = list10;
                                            while (true) {
                                                list3 = list8;
                                                if (list4 != null) {
                                                    int size7 = list4.size();
                                                    i20 = i76;
                                                    int i97 = 0;
                                                    while (true) {
                                                        if (i97 < size7) {
                                                            obj5 = list4.get(i97);
                                                            int i98 = size7;
                                                            if (((z.l) obj5).f9056a != i96) {
                                                                i97++;
                                                                size7 = i98;
                                                            }
                                                        } else {
                                                            obj5 = null;
                                                        }
                                                    }
                                                    lVar5 = (z.l) obj5;
                                                } else {
                                                    i20 = i76;
                                                    lVar5 = null;
                                                }
                                                if (lVar5 == null) {
                                                    if (list4 == null) {
                                                        list4 = new ArrayList();
                                                    }
                                                    list4.add(iVar4.a(i96, j7));
                                                }
                                                if (i96 != min) {
                                                    i96++;
                                                    list8 = list3;
                                                    i76 = i20;
                                                }
                                            }
                                        }
                                        f9 = ((kVar3.f9051m - lVar10.i) - lVar10.f9064j) - f8;
                                        if (f9 > 0.0f) {
                                            int i99 = lVar10.f9056a + 1;
                                            int i100 = 0;
                                            while (i99 < i53 && i100 < f9) {
                                                if (i99 <= min2) {
                                                    int a14 = kVar4.a();
                                                    int i101 = 0;
                                                    while (true) {
                                                        if (i101 < a14) {
                                                            obj4 = kVar4.get(i101);
                                                            f10 = f9;
                                                            if (((z.l) obj4).f9056a != i99) {
                                                                i101++;
                                                                f9 = f10;
                                                            }
                                                        } else {
                                                            f10 = f9;
                                                            obj4 = null;
                                                        }
                                                    }
                                                    lVar3 = (z.l) obj4;
                                                } else {
                                                    f10 = f9;
                                                    if (list4 != null) {
                                                        int size8 = list4.size();
                                                        int i102 = 0;
                                                        while (true) {
                                                            if (i102 < size8) {
                                                                lVar4 = list4.get(i102);
                                                                if (((z.l) lVar4).f9056a != i99) {
                                                                    i102++;
                                                                }
                                                            } else {
                                                                lVar4 = 0;
                                                            }
                                                        }
                                                        lVar3 = lVar4;
                                                    } else {
                                                        lVar3 = null;
                                                    }
                                                }
                                                if (lVar3 != null) {
                                                    i99++;
                                                    i33 = lVar3.f9065k;
                                                } else {
                                                    if (list4 == null) {
                                                        list4 = new ArrayList();
                                                    }
                                                    list4.add(iVar4.a(i99, j7));
                                                    i99++;
                                                    i33 = ((z.l) d6.m.X(list4)).f9065k;
                                                }
                                                i100 += i33;
                                                f9 = f10;
                                            }
                                        }
                                        if (list4 != null && ((z.l) d6.m.X(list4)).f9056a > min2) {
                                            min2 = ((z.l) d6.m.X(list4)).f9056a;
                                        }
                                        size = arrayList.size();
                                        for (i21 = 0; i21 < size; i21++) {
                                            int intValue2 = ((Number) arrayList.get(i21)).intValue();
                                            if (intValue2 > min2) {
                                                if (list4 == null) {
                                                    list4 = new ArrayList();
                                                }
                                                list4.add(iVar4.a(intValue2, j7));
                                            }
                                        }
                                        List list11 = list4 == null ? list : list4;
                                        size2 = list11.size();
                                        int i103 = i18;
                                        for (i22 = 0; i22 < size2; i22++) {
                                            i103 = Math.max(i103, ((z.l) list11.get(i22)).f9066l);
                                        }
                                        boolean z13 = !q6.i.a(lVar9, kVar4.first()) && list3.isEmpty() && list11.isEmpty();
                                        int f17 = r2.b.f(i14, j13);
                                        int e10 = r2.b.e(i103, j13);
                                        int i104 = i20;
                                        z3 = i14 < Math.min(f17, i104);
                                        if (z3 && i93 != 0) {
                                            w.a.c("non-zero itemsScrollOffset");
                                        }
                                        z7 = z13;
                                        ArrayList arrayList3 = new ArrayList(list11.size() + list3.size() + kVar4.a());
                                        if (z3) {
                                            if (!list3.isEmpty() || !list11.isEmpty()) {
                                                w.a.a("no extra items");
                                            }
                                            int a15 = kVar4.a();
                                            i24 = i104;
                                            int[] iArr = new int[a15];
                                            for (int i105 = 0; i105 < a15; i105++) {
                                                iArr[i105] = ((z.l) kVar4.get(i105)).f9064j;
                                            }
                                            int[] iArr2 = new int[a15];
                                            if (dVar2 == null) {
                                                w.a.b("null horizontalArrangement when isVertical == false");
                                                throw new a5.c();
                                            }
                                            i23 = i14;
                                            vVar = vVar2;
                                            hVar = hVar4;
                                            lVar = lVar9;
                                            i25 = f17;
                                            i26 = i84;
                                            iVar = iVar4;
                                            arrayList2 = arrayList3;
                                            dVar2.c(f0Var2, i25, iArr, lVar6, iArr2);
                                            f0Var = f0Var2;
                                            int i106 = new v6.d(0, a15 - 1, 1).f7493e;
                                            if (i106 >= 0) {
                                                int i107 = 0;
                                                while (true) {
                                                    int i108 = iArr2[i107];
                                                    z.l lVar11 = (z.l) kVar4.get(i107);
                                                    lVar11.c(i108, i25, e10);
                                                    arrayList2.add(lVar11);
                                                    if (i107 != i106) {
                                                        i107++;
                                                    }
                                                }
                                            }
                                        } else {
                                            i23 = i14;
                                            i24 = i104;
                                            vVar = vVar2;
                                            hVar = hVar4;
                                            i25 = f17;
                                            f0Var = f0Var2;
                                            lVar = lVar9;
                                            i26 = i84;
                                            iVar = iVar4;
                                            arrayList2 = arrayList3;
                                            int size9 = list3.size();
                                            int i109 = i93;
                                            int i110 = 0;
                                            while (i110 < size9) {
                                                int i111 = size9;
                                                z.l lVar12 = (z.l) list3.get(i110);
                                                i109 -= lVar12.f9065k;
                                                lVar12.c(i109, i25, e10);
                                                arrayList2.add(lVar12);
                                                i110++;
                                                size9 = i111;
                                            }
                                            int a16 = kVar4.a();
                                            int i112 = i93;
                                            for (int i113 = 0; i113 < a16; i113++) {
                                                z.l lVar13 = (z.l) kVar4.get(i113);
                                                lVar13.c(i112, i25, e10);
                                                arrayList2.add(lVar13);
                                                i112 += lVar13.f9065k;
                                            }
                                            int size10 = list11.size();
                                            for (int i114 = 0; i114 < size10; i114++) {
                                                z.l lVar14 = (z.l) list11.get(i114);
                                                lVar14.c(i112, i25, e10);
                                                arrayList2.add(lVar14);
                                                i112 += lVar14.f9065k;
                                            }
                                        }
                                        ArrayList arrayList4 = arrayList2;
                                        bVar.b(i25, e10, arrayList4, hVar.f9021d, iVar, p7, z10, i19, i23);
                                        z.i iVar6 = iVar;
                                        int i115 = i23;
                                        if (!p7) {
                                            bVar.a();
                                            if (!a9) {
                                                z8 = p7;
                                                i27 = i115;
                                                int f18 = r2.b.f(Math.max(i25, (int) 0), j13);
                                                e10 = r2.b.e(Math.max(e10, (int) 0), j13);
                                                if (f18 != i25) {
                                                    int size11 = arrayList4.size();
                                                    for (int i116 = 0; i116 < size11; i116++) {
                                                        ((z.l) arrayList4.get(i116)).f9068n = f18;
                                                    }
                                                }
                                                i28 = f18;
                                                z.l lVar15 = (z.l) kVar4.f();
                                                int i117 = lVar15 == null ? lVar15.f9056a : 0;
                                                z.l lVar16 = (z.l) kVar4.h();
                                                int i118 = lVar16 == null ? lVar16.f9056a : 0;
                                                hVar.f9019b.getClass();
                                                o.w wVar2 = o.k.f5488a;
                                                if (iVar5 != null || arrayList4.isEmpty() || (i30 = wVar2.f5560b) == 0) {
                                                    kVar = kVar4;
                                                    iVar2 = iVar6;
                                                    i29 = i68;
                                                    z9 = true;
                                                    list5 = list;
                                                } else {
                                                    if (i118 - i117 < 0 || i30 == 0) {
                                                        wVar = wVar2;
                                                    } else {
                                                        v6.d u02 = r2.o.u0(0, i30);
                                                        int i119 = u02.f7492d;
                                                        int i120 = u02.f7493e;
                                                        int i121 = -1;
                                                        if (i119 <= i120) {
                                                            while (wVar2.b(i119) <= i117) {
                                                                i121 = wVar2.b(i119);
                                                                if (i119 != i120) {
                                                                    i119++;
                                                                }
                                                            }
                                                        }
                                                        if (i121 == -1) {
                                                            wVar = o.k.f5488a;
                                                        } else {
                                                            wVar = new o.w(1);
                                                            wVar.a(i121);
                                                        }
                                                    }
                                                    ArrayList arrayList5 = new ArrayList();
                                                    ArrayList arrayList6 = new ArrayList(arrayList4.size());
                                                    int size12 = arrayList4.size();
                                                    int i122 = 0;
                                                    while (i122 < size12) {
                                                        Object obj6 = arrayList4.get(i122);
                                                        d6.k kVar5 = kVar4;
                                                        int i123 = ((z.l) obj6).f9056a;
                                                        int i124 = size12;
                                                        int[] iArr3 = wVar2.f5559a;
                                                        int i125 = wVar2.f5560b;
                                                        o.w wVar3 = wVar2;
                                                        int i126 = 0;
                                                        while (true) {
                                                            if (i126 < i125) {
                                                                int i127 = i126;
                                                                if (iArr3[i127] == i123) {
                                                                    arrayList6.add(obj6);
                                                                } else {
                                                                    i126 = i127 + 1;
                                                                }
                                                            }
                                                        }
                                                        i122++;
                                                        kVar4 = kVar5;
                                                        size12 = i124;
                                                        wVar2 = wVar3;
                                                    }
                                                    kVar = kVar4;
                                                    int[] iArr4 = wVar.f5559a;
                                                    int i128 = wVar.f5560b;
                                                    int i129 = 0;
                                                    while (i129 < i128) {
                                                        int i130 = iArr4[i129];
                                                        int size13 = arrayList4.size();
                                                        int[] iArr5 = iArr4;
                                                        int i131 = 0;
                                                        int i132 = 0;
                                                        while (true) {
                                                            if (i131 < size13) {
                                                                Object obj7 = arrayList4.get(i131);
                                                                int i133 = i131 + 1;
                                                                if (((z.l) obj7).f9056a != i130) {
                                                                    i132++;
                                                                    i131 = i133;
                                                                }
                                                            } else {
                                                                i132 = -1;
                                                            }
                                                        }
                                                        z.l a17 = i132 == -1 ? iVar6.a(i130, j7) : (z.l) arrayList4.remove(i132);
                                                        int i134 = i128;
                                                        int i135 = a17.f9065k;
                                                        if (i132 == -1) {
                                                            iVar3 = iVar6;
                                                            a8 = Integer.MIN_VALUE;
                                                        } else {
                                                            iVar3 = iVar6;
                                                            a8 = (int) (a17.a(0) >> 32);
                                                        }
                                                        int size14 = arrayList6.size();
                                                        int i136 = 0;
                                                        while (true) {
                                                            if (i136 < size14) {
                                                                obj3 = arrayList6.get(i136);
                                                                if (((z.l) obj3).f9056a == i130) {
                                                                    i136++;
                                                                }
                                                            } else {
                                                                obj3 = null;
                                                            }
                                                        }
                                                        z.l lVar17 = (z.l) obj3;
                                                        if (lVar17 != null) {
                                                            j8 = j7;
                                                            i31 = (int) (lVar17.a(0) >> 32);
                                                        } else {
                                                            j8 = j7;
                                                            i31 = Integer.MIN_VALUE;
                                                        }
                                                        if (a8 == Integer.MIN_VALUE) {
                                                            i32 = i68;
                                                            max = i32;
                                                        } else {
                                                            i32 = i68;
                                                            max = Math.max(i32, a8);
                                                        }
                                                        if (i31 != Integer.MIN_VALUE) {
                                                            max = Math.min(max, i31 - i135);
                                                        }
                                                        a17.f9067m = true;
                                                        a17.c(max, i28, e10);
                                                        arrayList5.add(a17);
                                                        i129++;
                                                        i68 = i32;
                                                        iArr4 = iArr5;
                                                        i128 = i134;
                                                        iVar6 = iVar3;
                                                        j7 = j8;
                                                    }
                                                    iVar2 = iVar6;
                                                    i29 = i68;
                                                    z9 = true;
                                                    list5 = arrayList5;
                                                }
                                                if (z7) {
                                                    z.l lVar18 = (z.l) kVar.f();
                                                    if (lVar18 != null) {
                                                        valueOf = Integer.valueOf(lVar18.f9056a);
                                                        if (z7) {
                                                        }
                                                        if (i26 >= i53) {
                                                        }
                                                        x0Var2 = x0Var;
                                                        u1.f0 e02 = x0Var2.e0(r2.b.f(i28 + i35, j9), r2.b.e(e10 + H4, j9), vVar, new b6.c0(z0Var, arrayList4, list5, z8));
                                                        if (valueOf == null) {
                                                        }
                                                        if (num == null) {
                                                        }
                                                        if (arrayList4.isEmpty()) {
                                                        }
                                                        kVar2 = new z.k(lVar, i19, r13, f8, e02, f6, z12, uVar, f0Var, iVar2.f9025d, list6, i29, i64, i53, j0Var, i36, i11);
                                                    }
                                                    valueOf = null;
                                                    if (z7) {
                                                    }
                                                    if (i26 >= i53) {
                                                    }
                                                    x0Var2 = x0Var;
                                                    u1.f0 e022 = x0Var2.e0(r2.b.f(i28 + i35, j9), r2.b.e(e10 + H4, j9), vVar, new b6.c0(z0Var, arrayList4, list5, z8));
                                                    if (valueOf == null) {
                                                    }
                                                    if (num == null) {
                                                    }
                                                    if (arrayList4.isEmpty()) {
                                                    }
                                                    kVar2 = new z.k(lVar, i19, r13, f8, e022, f6, z12, uVar, f0Var, iVar2.f9025d, list6, i29, i64, i53, j0Var, i36, i11);
                                                } else {
                                                    z.l lVar19 = (z.l) d6.m.S(arrayList4);
                                                    if (lVar19 != null) {
                                                        valueOf = Integer.valueOf(lVar19.f9056a);
                                                        if (z7) {
                                                            z.l lVar20 = (z.l) kVar.h();
                                                            if (lVar20 != null) {
                                                                num = Integer.valueOf(lVar20.f9056a);
                                                            }
                                                        } else {
                                                            z.l lVar21 = (z.l) d6.m.Y(arrayList4);
                                                            if (lVar21 != null) {
                                                                num = Integer.valueOf(lVar21.f9056a);
                                                            }
                                                        }
                                                        boolean z14 = (i26 >= i53 || i27 > i24) ? z9 : false;
                                                        x0Var2 = x0Var;
                                                        u1.f0 e0222 = x0Var2.e0(r2.b.f(i28 + i35, j9), r2.b.e(e10 + H4, j9), vVar, new b6.c0(z0Var, arrayList4, list5, z8));
                                                        int intValue3 = valueOf == null ? valueOf.intValue() : 0;
                                                        int intValue4 = num == null ? num.intValue() : 0;
                                                        if (arrayList4.isEmpty()) {
                                                            ArrayList h02 = d6.m.h0(list5);
                                                            int size15 = arrayList4.size();
                                                            for (int i137 = 0; i137 < size15; i137++) {
                                                                z.l lVar22 = (z.l) arrayList4.get(i137);
                                                                int i138 = lVar22.f9056a;
                                                                if (intValue3 <= i138 && i138 <= intValue4) {
                                                                    h02.add(lVar22);
                                                                }
                                                            }
                                                            d6.q.N(h02, g0.f82a);
                                                            list6 = h02;
                                                        } else {
                                                            list6 = list;
                                                        }
                                                        kVar2 = new z.k(lVar, i19, z14, f8, e0222, f6, z12, uVar, f0Var, iVar2.f9025d, list6, i29, i64, i53, j0Var, i36, i11);
                                                    }
                                                    valueOf = null;
                                                    if (z7) {
                                                    }
                                                    if (i26 >= i53) {
                                                    }
                                                    x0Var2 = x0Var;
                                                    u1.f0 e02222 = x0Var2.e0(r2.b.f(i28 + i35, j9), r2.b.e(e10 + H4, j9), vVar, new b6.c0(z0Var, arrayList4, list5, z8));
                                                    if (valueOf == null) {
                                                    }
                                                    if (num == null) {
                                                    }
                                                    if (arrayList4.isEmpty()) {
                                                    }
                                                    kVar2 = new z.k(lVar, i19, z14, f8, e02222, f6, z12, uVar, f0Var, iVar2.f9025d, list6, i29, i64, i53, j0Var, i36, i11);
                                                }
                                            }
                                        }
                                        z8 = p7;
                                        i27 = i115;
                                        i28 = i25;
                                        z.l lVar152 = (z.l) kVar4.f();
                                        if (lVar152 == null) {
                                        }
                                        z.l lVar162 = (z.l) kVar4.h();
                                        if (lVar162 == null) {
                                        }
                                        hVar.f9019b.getClass();
                                        o.w wVar22 = o.k.f5488a;
                                        if (iVar5 != null) {
                                        }
                                        kVar = kVar4;
                                        iVar2 = iVar6;
                                        i29 = i68;
                                        z9 = true;
                                        list5 = list;
                                        if (z7) {
                                        }
                                    }
                                }
                                lVar2 = null;
                                z.l lVar102 = (z.l) d6.m.X(r13);
                                if (lVar2 != null) {
                                }
                                list3 = list8;
                                i20 = i76;
                                list4 = list10;
                                f9 = ((kVar3.f9051m - lVar102.i) - lVar102.f9064j) - f8;
                                if (f9 > 0.0f) {
                                }
                                if (list4 != null) {
                                    min2 = ((z.l) d6.m.X(list4)).f9056a;
                                }
                                size = arrayList.size();
                                while (i21 < size) {
                                }
                                if (list4 == null) {
                                }
                                size2 = list11.size();
                                int i1032 = i18;
                                while (i22 < size2) {
                                }
                                if (q6.i.a(lVar9, kVar4.first())) {
                                }
                                int f172 = r2.b.f(i14, j13);
                                int e102 = r2.b.e(i1032, j13);
                                int i1042 = i20;
                                if (i14 < Math.min(f172, i1042)) {
                                }
                                if (z3) {
                                    w.a.c("non-zero itemsScrollOffset");
                                }
                                z7 = z13;
                                ArrayList arrayList32 = new ArrayList(list11.size() + list3.size() + kVar4.a());
                                if (z3) {
                                }
                                ArrayList arrayList42 = arrayList2;
                                bVar.b(i25, e102, arrayList42, hVar.f9021d, iVar, p7, z10, i19, i23);
                                z.i iVar62 = iVar;
                                int i1152 = i23;
                                if (!p7) {
                                }
                                z8 = p7;
                                i27 = i1152;
                                i28 = i25;
                                z.l lVar1522 = (z.l) kVar4.f();
                                if (lVar1522 == null) {
                                }
                                z.l lVar1622 = (z.l) kVar4.h();
                                if (lVar1622 == null) {
                                }
                                hVar.f9019b.getClass();
                                o.w wVar222 = o.k.f5488a;
                                if (iVar5 != null) {
                                }
                                kVar = kVar4;
                                iVar2 = iVar62;
                                i29 = i68;
                                z9 = true;
                                list5 = list;
                                if (z7) {
                                }
                            }
                        }
                        list3 = list8;
                        i20 = i76;
                        list4 = list2;
                        if (list4 != null) {
                        }
                        size = arrayList.size();
                        while (i21 < size) {
                        }
                        if (list4 == null) {
                        }
                        size2 = list11.size();
                        int i10322 = i18;
                        while (i22 < size2) {
                        }
                        if (q6.i.a(lVar9, kVar4.first())) {
                        }
                        int f1722 = r2.b.f(i14, j13);
                        int e1022 = r2.b.e(i10322, j13);
                        int i10422 = i20;
                        if (i14 < Math.min(f1722, i10422)) {
                        }
                        if (z3) {
                        }
                        z7 = z13;
                        ArrayList arrayList322 = new ArrayList(list11.size() + list3.size() + kVar4.a());
                        if (z3) {
                        }
                        ArrayList arrayList422 = arrayList2;
                        bVar.b(i25, e1022, arrayList422, hVar.f9021d, iVar, p7, z10, i19, i23);
                        z.i iVar622 = iVar;
                        int i11522 = i23;
                        if (!p7) {
                        }
                        z8 = p7;
                        i27 = i11522;
                        i28 = i25;
                        z.l lVar15222 = (z.l) kVar4.f();
                        if (lVar15222 == null) {
                        }
                        z.l lVar16222 = (z.l) kVar4.h();
                        if (lVar16222 == null) {
                        }
                        hVar.f9019b.getClass();
                        o.w wVar2222 = o.k.f5488a;
                        if (iVar5 != null) {
                        }
                        kVar = kVar4;
                        iVar2 = iVar622;
                        i29 = i68;
                        z9 = true;
                        list5 = list;
                        if (z7) {
                        }
                    }
                    pVar.f(kVar2, x0Var2.p(), false);
                    return kVar2;
                } catch (Throwable th) {
                    w0.q.k(e8, h11, e9);
                    throw th;
                }
            case 1:
                ((Integer) obj2).getClass();
                b6.k.a((b6.a) this.f55e, (y0.m) this.f56f, (m0.s) obj, m0.b.w(1));
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                b6.k.f((b6.h) this.f55e, (y0.m) this.f56f, (m0.s) obj, m0.b.w(1));
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                o4.o oVar = (o4.o) this.f55e;
                o4.t tVar = (o4.t) this.f56f;
                m0.s sVar = (m0.s) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (sVar.N(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (d6.m.Q(s6.a.y(x1.f1507d.f1525a, w1.f1496d.f1525a, v1.f1482d.f1525a, y1.f1514d.f1525a), oVar != null ? (String) oVar.f5671e.f4352e : null)) {
                        sVar.V(1952026559);
                        o1.a(null, 0L, 0L, 0.0f, null, u0.h.d(749239604, new b6.a0(2, oVar, tVar), sVar), sVar, 196608);
                    } else {
                        sVar.V(1950101676);
                    }
                    sVar.p(false);
                } else {
                    sVar.Q();
                }
                return c6.m.f1757a;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).getClass();
                b6.k.s((p6.a) this.f55e, (y0.m) this.f56f, (m0.s) obj, m0.b.w(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                b6.k.A((y0.m) this.f55e, (u0.c) this.f56f, (m0.s) obj, m0.b.w(49));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((j0.j0) this.f55e).a((c5.x) this.f56f, (m0.s) obj, m0.b.w(1));
                break;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                ((j0.k0) this.f55e).a((p1) this.f56f, (m0.s) obj, m0.b.w(1));
                break;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                ((Integer) obj2).getClass();
                n2.a((g2.i0) this.f55e, (u0.c) this.f56f, (m0.s) obj, m0.b.w(1));
                break;
            case x.v0.f8304b /* 9 */:
                u0.i iVar7 = (u0.i) this.f55e;
                i2 i2Var = (i2) this.f56f;
                int intValue6 = ((Integer) obj).intValue();
                if (obj2 instanceof m0.j) {
                    iVar7.f7159f.b((m0.j) obj2);
                } else if (obj2 instanceof b2) {
                    b2 b2Var = (b2) obj2;
                    if (!(b2Var.f4881a instanceof m0.p)) {
                        m0.t.f(i2Var, intValue6, obj2);
                        iVar7.e(b2Var);
                    }
                } else if (obj2 instanceof t1) {
                    m0.t.f(i2Var, intValue6, obj2);
                    ((t1) obj2).d();
                }
                return c6.m.f1757a;
            case x.v0.f8306d /* 10 */:
                ((Integer) obj2).getClass();
                m.a.f((List) this.f55e, (Collection) this.f56f, (m0.s) obj, m0.b.w(1));
                break;
            default:
                ((Integer) obj2).getClass();
                h0.a.e((v0.c) this.f55e, (u0.c) this.f56f, (m0.s) obj, m0.b.w(1));
                break;
        }
        return c6.m.f1757a;
    }

    public /* synthetic */ e0(int i, Object obj, Object obj2) {
        this.f54d = i;
        this.f55e = obj;
        this.f56f = obj2;
    }
}
