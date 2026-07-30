package r;

import c0.w;
import g0.d1;
import g0.z0;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import o.j0;
import p1.g0;
import p1.w0;
import q.h0;
import z0.c0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f7619g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h0 f7620h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q6.a f7621i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q.h f7622j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f7623k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h7.c f7624l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s0.e f7625m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s sVar, h0 h0Var, x6.c cVar, q.h hVar, boolean z8, h7.c cVar2, c0 c0Var, s0.e eVar) {
        super(2);
        this.f7619g = sVar;
        this.f7620h = h0Var;
        this.f7621i = cVar;
        this.f7622j = hVar;
        this.f7623k = z8;
        this.f7624l = cVar2;
        this.f7625m = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06bd A[LOOP:15: B:239:0x06bb->B:240:0x06bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0848 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x08d5  */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    @Override // q6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, Object obj2) {
        String str;
        int i7;
        s.s sVar;
        ?? arrayList;
        int i8;
        e6.u uVar;
        w6.d dVar;
        int i9;
        s sVar2;
        long j8;
        int i10;
        int i11;
        int i12;
        float f9;
        m mVar;
        int i13;
        float f10;
        List list;
        int i14;
        int i15;
        ArrayList arrayList2;
        List list2;
        int i16;
        List list3;
        int size;
        int i17;
        int size2;
        int i18;
        boolean z8;
        int w4;
        int v5;
        int i19;
        boolean z9;
        int i20;
        int i21;
        boolean z10;
        ArrayList arrayList3;
        l lVar;
        m mVar2;
        float f11;
        m mVar3;
        m mVar4;
        int i22;
        Object obj3;
        int i23;
        int min;
        List list4;
        m mVar5;
        Object obj4;
        int i24;
        boolean a3 = m2.j.a(0L, 0L);
        s.s sVar3 = (s.s) obj;
        long j9 = ((m2.a) obj2).f6306a;
        s sVar4 = this.f7619g;
        sVar4.f7691r.getValue();
        boolean z11 = sVar4.f7675b || sVar3.f8056g.v();
        j0 j0Var = j0.f6657f;
        r4.a.p(j9, j0Var);
        m2.k layoutDirection = sVar3.f8056g.getLayoutDirection();
        h0 h0Var = this.f7620h;
        int K = sVar3.f8056g.K(h0Var.b(layoutDirection));
        int K2 = sVar3.f8056g.K(h0Var.c(sVar3.f8056g.getLayoutDirection()));
        float d8 = h0Var.d();
        w0 w0Var = sVar3.f8056g;
        w0 w0Var2 = sVar3.f8056g;
        int K3 = w0Var.K(d8);
        int K4 = w0Var2.K(h0Var.a()) + K3;
        int i25 = K2 + K;
        int i26 = K4 - K3;
        long M = r4.a.M(-i25, -K4, j9);
        h hVar = (h) this.f7621i.a();
        b bVar = hVar.f7606c;
        a0.l lVar2 = hVar.f7607d;
        int h3 = m2.a.h(M);
        int g9 = m2.a.g(M);
        bVar.f7593a.f(h3);
        bVar.f7594b.f(g9);
        q.h hVar2 = this.f7622j;
        if (hVar2 == null) {
            throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
        }
        int K5 = w0Var2.K(hVar2.a());
        int c4 = hVar.c();
        int g10 = m2.a.g(j9) - K4;
        i iVar = new i(M, hVar, sVar3, c4, K5, this.f7625m, K3, i26, a8.m.c(K, K3), this.f7619g);
        q0.g c6 = q0.r.c();
        q6.c f12 = c6 != null ? c6.f() : null;
        q0.g d9 = q0.r.d(c6);
        try {
            w wVar = sVar4.f7677d;
            int e9 = ((d1) wVar.f1514b).e();
            int U = j1.c.U(e9, wVar.f1516d, hVar);
            if (e9 != U) {
                sVar = sVar3;
                ((d1) wVar.f1514b).f(U);
                s.t tVar = (s.t) wVar.f1517e;
                str = "null verticalArrangement when isVertical == true";
                if (e9 != tVar.f8060g) {
                    tVar.f8060g = e9;
                    int i27 = (e9 / 30) * 30;
                    i7 = c4;
                    tVar.f8059f.setValue(v1.g.o(Math.max(i27 - 100, 0), i27 + 130));
                } else {
                    i7 = c4;
                }
            } else {
                str = "null verticalArrangement when isVertical == true";
                i7 = c4;
                sVar = sVar3;
            }
            int e10 = ((d1) wVar.f1515c).e();
            q0.r.f(c6, d9, f12);
            s.v vVar = sVar4.f7690q;
            i0.d dVar2 = sVar4.f7687n.f5811a;
            boolean m8 = dVar2.m();
            e6.u uVar2 = e6.u.f2826f;
            if (m8 || !vVar.f8067f.isEmpty()) {
                arrayList = new ArrayList();
                if (!dVar2.m()) {
                    i8 = e10;
                    uVar = uVar2;
                    dVar = w6.d.f9528i;
                } else {
                    if (dVar2.l()) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    Object[] objArr = dVar2.f4840f;
                    i8 = e10;
                    int i28 = ((s.h) objArr[0]).f8010a;
                    int i29 = dVar2.f4842h;
                    uVar = uVar2;
                    if (i29 > 0) {
                        int i30 = i28;
                        int i31 = 0;
                        while (true) {
                            Object[] objArr2 = objArr;
                            int i32 = ((s.h) objArr[i31]).f8010a;
                            if (i32 < i30) {
                                i30 = i32;
                            }
                            int i33 = i31 + 1;
                            if (i33 >= i29) {
                                break;
                            }
                            i31 = i33;
                            objArr = objArr2;
                        }
                        i9 = i30;
                    } else {
                        i9 = i28;
                    }
                    if (i9 < 0) {
                        throw new IllegalArgumentException("negative minIndex");
                    }
                    if (dVar2.l()) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    Object[] objArr3 = dVar2.f4840f;
                    int i34 = ((s.h) objArr3[0]).f8011b;
                    int i35 = dVar2.f4842h;
                    if (i35 > 0) {
                        int i36 = i34;
                        int i37 = 0;
                        while (true) {
                            Object[] objArr4 = objArr3;
                            int i38 = ((s.h) objArr3[i37]).f8011b;
                            if (i38 > i36) {
                                i36 = i38;
                            }
                            i37++;
                            if (i37 >= i35) {
                                break;
                            }
                            objArr3 = objArr4;
                        }
                        i34 = i36;
                    }
                    dVar = new w6.d(i9, Math.min(i34, hVar.c() - 1), 1);
                }
                int size3 = vVar.f8067f.size();
                for (int i39 = 0; i39 < size3; i39++) {
                    s.u uVar3 = (s.u) vVar.get(i39);
                    int U2 = j1.c.U(uVar3.f8063c.e(), uVar3.f8061a, hVar);
                    int i40 = dVar.f9521f;
                    if ((U2 > dVar.f9522g || i40 > U2) && U2 >= 0 && U2 < hVar.c()) {
                        arrayList.add(Integer.valueOf(U2));
                    }
                }
                int i41 = dVar.f9521f;
                int i42 = dVar.f9522g;
                if (i41 <= i42) {
                    while (true) {
                        arrayList.add(Integer.valueOf(i41));
                        if (i41 == i42) {
                            break;
                        }
                        i41++;
                    }
                }
            } else {
                i8 = e10;
                arrayList = uVar2;
                uVar = arrayList;
            }
            float floatValue = (w0Var2.v() || !z11) ? sVar4.f7680g : ((Number) sVar4.f7695v.f5563g.getValue()).floatValue();
            if (this.f7623k) {
                hVar.f7605b.getClass();
            }
            androidx.compose.foundation.lazy.layout.a aVar = sVar4.f7686m;
            boolean v8 = w0Var2.v();
            l lVar3 = sVar4.f7676c;
            z0 z0Var = sVar4.f7694u;
            if (K3 < 0) {
                throw new IllegalArgumentException("invalid beforeContentPadding");
            }
            if (i26 < 0) {
                throw new IllegalArgumentException("invalid afterContentPadding");
            }
            e6.v vVar2 = e6.v.f2827f;
            h7.c cVar = this.f7624l;
            if (i7 <= 0) {
                int j10 = m2.a.j(M);
                int i43 = m2.a.i(M);
                aVar.b(j10, i43, new ArrayList(), lVar2, iVar, v8, z11, 0, 0);
                if (!v8) {
                    aVar.a();
                    if (!a3) {
                        j10 = r4.a.w(M, (int) 0);
                        i43 = r4.a.v(M, (int) 0);
                    }
                }
                lVar = new l(null, 0, false, 0.0f, w0Var2.C(r4.a.w(j9, j10 + i25), r4.a.v(j9, i43 + K4), vVar2, k.f7626h), 0.0f, false, cVar, sVar, iVar.f7610c, uVar, -K3, g10 + i26, 0, j0Var, i26, K5);
                sVar2 = sVar4;
            } else {
                int i44 = g10;
                int i45 = i7;
                float f13 = floatValue;
                s.s sVar5 = sVar;
                if (U >= i45) {
                    U = i45 - 1;
                    i8 = 0;
                }
                int round = Math.round(f13);
                int i46 = i8 - round;
                if (U == 0 && i46 < 0) {
                    round += i46;
                    i46 = 0;
                }
                int i47 = U;
                e6.j jVar = new e6.j();
                sVar2 = sVar4;
                int i48 = -K3;
                int i49 = i48 + (K5 < 0 ? K5 : 0);
                int i50 = i46 + i49;
                int i51 = 0;
                while (true) {
                    j8 = iVar.f7610c;
                    if (i50 >= 0 || i47 <= 0) {
                        break;
                    }
                    z0 z0Var2 = z0Var;
                    int i52 = i47 - 1;
                    m a9 = iVar.a(j8, i52);
                    jVar.add(0, a9);
                    i51 = Math.max(i51, a9.f7658m);
                    i50 += a9.f7657l;
                    i47 = i52;
                    z0Var = z0Var2;
                }
                z0 z0Var3 = z0Var;
                if (i50 < i49) {
                    round += i50;
                    i50 = i49;
                }
                int i53 = round;
                int i54 = i50 - i49;
                int i55 = i44 + i26;
                int i56 = i51;
                int i57 = i55 < 0 ? 0 : i55;
                int i58 = -i54;
                int i59 = i47;
                int i60 = 0;
                boolean z12 = false;
                while (i60 < jVar.f2822h) {
                    if (i58 >= i57) {
                        jVar.g(i60);
                        z12 = true;
                    } else {
                        i59++;
                        i58 += ((m) jVar.get(i60)).f7657l;
                        i60++;
                    }
                }
                int i61 = i56;
                int i62 = i54;
                int i63 = i59;
                boolean z13 = z12;
                while (i63 < i45 && (i58 < i57 || i58 <= 0 || jVar.isEmpty())) {
                    int i64 = i62;
                    m a10 = iVar.a(j8, i63);
                    int i65 = i57;
                    int i66 = a10.f7657l;
                    int i67 = i58 + i66;
                    if (i67 <= i49) {
                        i24 = i67;
                        if (i63 != i45 - 1) {
                            i62 = i64 - i66;
                            i47 = i63 + 1;
                            z13 = true;
                            i63++;
                            i57 = i65;
                            i58 = i24;
                        }
                    } else {
                        i24 = i67;
                    }
                    int max = Math.max(i61, a10.f7658m);
                    jVar.addLast(a10);
                    i61 = max;
                    i62 = i64;
                    i63++;
                    i57 = i65;
                    i58 = i24;
                }
                int i68 = i62;
                if (i58 < i44) {
                    int i69 = i44 - i58;
                    i11 = i68 - i69;
                    int i70 = i58 + i69;
                    while (i11 < K3 && i47 > 0) {
                        int i71 = i47 - 1;
                        int i72 = i70;
                        m a11 = iVar.a(j8, i71);
                        jVar.add(0, a11);
                        i61 = Math.max(i61, a11.f7658m);
                        i11 += a11.f7657l;
                        i70 = i72;
                        i47 = i71;
                    }
                    int i73 = i70;
                    i10 = i69 + i53;
                    if (i11 < 0) {
                        i10 += i11;
                        i58 = i73 + i11;
                        i12 = i47;
                        i11 = 0;
                        int i74 = i61;
                        float f14 = (Integer.signum(Math.round(f13)) == Integer.signum(i10) || Math.abs(Math.round(f13)) < Math.abs(i10)) ? f13 : i10;
                        float f15 = f13 - f14;
                        float f16 = (v8 || i10 <= i53 || f15 > 0.0f) ? 0.0f : (i10 - i53) + f15;
                        if (i11 >= 0) {
                            throw new IllegalArgumentException("negative currentFirstItemScrollOffset");
                        }
                        int i75 = -i11;
                        m mVar6 = (m) jVar.first();
                        if (K3 > 0 || K5 < 0) {
                            f9 = f14;
                            int i76 = jVar.f2822h;
                            m mVar7 = mVar6;
                            int i77 = i11;
                            int i78 = 0;
                            while (i78 < i76) {
                                int i79 = i76;
                                int i80 = ((m) jVar.get(i78)).f7657l;
                                if (i77 == 0 || i80 > i77 || i78 == e6.m.W(jVar)) {
                                    break;
                                }
                                i77 -= i80;
                                i78++;
                                mVar7 = (m) jVar.get(i78);
                                i76 = i79;
                            }
                            mVar = mVar7;
                            i13 = i77;
                        } else {
                            f9 = f14;
                            i13 = i11;
                            mVar = mVar6;
                        }
                        int max2 = Math.max(0, i12);
                        int i81 = i12 - 1;
                        if (max2 <= i81) {
                            list = null;
                            while (true) {
                                if (list == null) {
                                    list = new ArrayList();
                                }
                                f10 = f16;
                                list.add(iVar.a(j8, i81));
                                if (i81 == max2) {
                                    break;
                                }
                                i81--;
                                f16 = f10;
                            }
                        } else {
                            f10 = f16;
                            list = null;
                        }
                        int size4 = arrayList.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i82 = size4 - 1;
                                int intValue = ((Number) arrayList.get(size4)).intValue();
                                if (intValue < max2) {
                                    if (list == null) {
                                        list = new ArrayList();
                                    }
                                    list.add(iVar.a(j8, intValue));
                                }
                                if (i82 < 0) {
                                    break;
                                }
                                size4 = i82;
                            }
                        }
                        if (list == null) {
                            list = uVar;
                        }
                        int i83 = i74;
                        int i84 = 0;
                        for (int size5 = list.size(); i84 < size5; size5 = size5) {
                            i83 = Math.max(i83, ((m) list.get(i84)).f7658m);
                            i84++;
                        }
                        int i85 = i45 - 1;
                        int min2 = Math.min(((m) e6.l.n0(jVar)).f7646a, i85);
                        int i86 = i83;
                        int i87 = ((m) e6.l.n0(jVar)).f7646a + 1;
                        if (i87 <= min2) {
                            ArrayList arrayList4 = null;
                            while (true) {
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                i14 = i63;
                                i15 = i75;
                                arrayList2 = arrayList4;
                                arrayList2.add(iVar.a(j8, i87));
                                if (i87 == min2) {
                                    break;
                                }
                                i87++;
                                arrayList4 = arrayList2;
                                i75 = i15;
                                i63 = i14;
                            }
                        } else {
                            i14 = i63;
                            i15 = i75;
                            arrayList2 = null;
                        }
                        if (v8 && lVar3 != null) {
                            ?? r52 = lVar3.f7638j;
                            if (!r52.isEmpty()) {
                                ArrayList arrayList5 = arrayList2;
                                for (int size6 = r52.size() - 1; -1 < size6; size6--) {
                                    if (((m) r52.get(size6)).f7646a > min2 && (size6 == 0 || ((m) r52.get(size6 - 1)).f7646a <= min2)) {
                                        mVar2 = (m) r52.get(size6);
                                        break;
                                    }
                                }
                                mVar2 = null;
                                m mVar8 = (m) e6.l.n0(r52);
                                if (mVar2 != null && (i23 = mVar2.f7646a) <= (min = Math.min(mVar8.f7646a, i85))) {
                                    list3 = arrayList5;
                                    while (true) {
                                        if (list3 != null) {
                                            list2 = list;
                                            int size7 = list3.size();
                                            i16 = i44;
                                            int i88 = 0;
                                            while (true) {
                                                if (i88 >= size7) {
                                                    list4 = list3;
                                                    obj4 = null;
                                                    break;
                                                }
                                                obj4 = list3.get(i88);
                                                list4 = list3;
                                                if (((m) obj4).f7646a == i23) {
                                                    break;
                                                }
                                                i88++;
                                                list3 = list4;
                                            }
                                            mVar5 = (m) obj4;
                                        } else {
                                            list4 = list3;
                                            list2 = list;
                                            i16 = i44;
                                            mVar5 = null;
                                        }
                                        if (mVar5 == null) {
                                            list3 = list4 == null ? new ArrayList() : list4;
                                            list3.add(iVar.a(j8, i23));
                                        } else {
                                            list3 = list4;
                                        }
                                        if (i23 == min) {
                                            break;
                                        }
                                        i23++;
                                        list = list2;
                                        i44 = i16;
                                    }
                                } else {
                                    list2 = list;
                                    i16 = i44;
                                    list3 = arrayList5;
                                }
                                float f17 = ((lVar3.f7640l - mVar8.f7655j) - mVar8.f7656k) - f9;
                                if (f17 > 0.0f) {
                                    int i89 = mVar8.f7646a + 1;
                                    int i90 = 0;
                                    while (i89 < i45 && i90 < f17) {
                                        if (i89 <= min2) {
                                            int a12 = jVar.a();
                                            int i91 = 0;
                                            while (true) {
                                                if (i91 >= a12) {
                                                    f11 = f17;
                                                    obj3 = null;
                                                    break;
                                                }
                                                obj3 = jVar.get(i91);
                                                f11 = f17;
                                                if (((m) obj3).f7646a == i89) {
                                                    break;
                                                }
                                                i91++;
                                                f17 = f11;
                                            }
                                            mVar3 = (m) obj3;
                                        } else {
                                            f11 = f17;
                                            if (list3 != null) {
                                                int size8 = list3.size();
                                                int i92 = 0;
                                                while (true) {
                                                    if (i92 >= size8) {
                                                        mVar4 = 0;
                                                        break;
                                                    }
                                                    mVar4 = list3.get(i92);
                                                    if (((m) mVar4).f7646a == i89) {
                                                        break;
                                                    }
                                                    i92++;
                                                }
                                                mVar3 = mVar4;
                                            } else {
                                                mVar3 = null;
                                            }
                                        }
                                        if (mVar3 != null) {
                                            i89++;
                                            i22 = mVar3.f7657l;
                                        } else {
                                            if (list3 == null) {
                                                list3 = new ArrayList();
                                            }
                                            list3.add(iVar.a(j8, i89));
                                            i89++;
                                            i22 = ((m) e6.l.n0(list3)).f7657l;
                                        }
                                        i90 += i22;
                                        f17 = f11;
                                    }
                                }
                                if (list3 != null && ((m) e6.l.n0(list3)).f7646a > min2) {
                                    min2 = ((m) e6.l.n0(list3)).f7646a;
                                }
                                size = arrayList.size();
                                for (i17 = 0; i17 < size; i17++) {
                                    int intValue2 = ((Number) arrayList.get(i17)).intValue();
                                    if (intValue2 > min2) {
                                        if (list3 == null) {
                                            list3 = new ArrayList();
                                        }
                                        list3.add(iVar.a(j8, intValue2));
                                    }
                                }
                                if (list3 == null) {
                                    list3 = uVar;
                                }
                                size2 = list3.size();
                                int i93 = i86;
                                for (i18 = 0; i18 < size2; i18++) {
                                    i93 = Math.max(i93, ((m) list3.get(i18)).f7658m);
                                }
                                z8 = !r6.k.a(mVar, jVar.first()) && list2.isEmpty() && list3.isEmpty();
                                w4 = r4.a.w(M, i93);
                                v5 = r4.a.v(M, i58);
                                i19 = i16;
                                z9 = i58 >= Math.min(v5, i19);
                                if (!z9 && i15 != 0) {
                                    throw new IllegalStateException("non-zero itemsScrollOffset");
                                }
                                ArrayList arrayList6 = new ArrayList(list3.size() + list2.size() + jVar.a());
                                if (z9) {
                                    i20 = i58;
                                    int i94 = i15;
                                    int i95 = 0;
                                    for (int size9 = list2.size(); i95 < size9; size9 = size9) {
                                        m mVar9 = (m) list2.get(i95);
                                        i94 -= mVar9.f7657l;
                                        mVar9.c(i94, w4, v5);
                                        arrayList6.add(mVar9);
                                        i95++;
                                    }
                                    int a13 = jVar.a();
                                    int i96 = i15;
                                    for (int i97 = 0; i97 < a13; i97++) {
                                        m mVar10 = (m) jVar.get(i97);
                                        mVar10.c(i96, w4, v5);
                                        arrayList6.add(mVar10);
                                        i96 += mVar10.f7657l;
                                    }
                                    int size10 = list3.size();
                                    for (int i98 = 0; i98 < size10; i98++) {
                                        m mVar11 = (m) list3.get(i98);
                                        mVar11.c(i96, w4, v5);
                                        arrayList6.add(mVar11);
                                        i96 += mVar11.f7657l;
                                    }
                                } else {
                                    if (!list2.isEmpty() || !list3.isEmpty()) {
                                        throw new IllegalArgumentException("no extra items");
                                    }
                                    int a14 = jVar.a();
                                    int[] iArr = new int[a14];
                                    for (int i99 = 0; i99 < a14; i99++) {
                                        iArr[i99] = ((m) jVar.get(i99)).f7656k;
                                    }
                                    int[] iArr2 = new int[a14];
                                    int i100 = 0;
                                    while (i100 < a14) {
                                        iArr2[i100] = 0;
                                        i100++;
                                        i58 = i58;
                                    }
                                    i20 = i58;
                                    if (hVar2 == null) {
                                        throw new IllegalArgumentException(str);
                                    }
                                    hVar2.c(v5, sVar5, iArr, iArr2);
                                    w6.d dVar3 = new w6.d(0, a14 - 1, 1);
                                    int i101 = dVar3.f9522g;
                                    int i102 = dVar3.f9523h;
                                    if ((i102 > 0 && i101 >= 0) || (i102 < 0 && i101 <= 0)) {
                                        int i103 = 0;
                                        while (true) {
                                            int i104 = iArr2[i103];
                                            int i105 = i102;
                                            m mVar12 = (m) jVar.get(i103);
                                            mVar12.c(i104, w4, v5);
                                            arrayList6.add(mVar12);
                                            if (i103 == i101) {
                                                break;
                                            }
                                            i103 += i105;
                                            i102 = i105;
                                        }
                                    }
                                }
                                i21 = i20;
                                int i106 = i13;
                                aVar.b(w4, v5, arrayList6, lVar2, iVar, v8, z11, i106, i21);
                                int i107 = v5;
                                if (!v8) {
                                    aVar.a();
                                    if (!a3) {
                                        z10 = z8;
                                        w4 = r4.a.w(M, Math.max(w4, (int) 0));
                                        int v9 = r4.a.v(M, Math.max(i107, (int) 0));
                                        if (v9 != i107) {
                                            int size11 = arrayList6.size();
                                            for (int i108 = 0; i108 < size11; i108++) {
                                                ((m) arrayList6.get(i108)).f7659n = v9;
                                            }
                                        }
                                        i107 = v9;
                                        boolean z14 = i14 >= i45 || i21 > i19;
                                        w0Var2 = w0Var2;
                                        g0 C = w0Var2.C(r4.a.w(j9, w4 + i25), r4.a.v(j9, i107 + K4), vVar2, new c.h(arrayList6, (m) null, v8, z0Var3));
                                        if (z10) {
                                            arrayList3 = arrayList6;
                                        } else {
                                            ArrayList arrayList7 = new ArrayList(arrayList6.size());
                                            int size12 = arrayList6.size();
                                            for (int i109 = 0; i109 < size12; i109++) {
                                                Object obj5 = arrayList6.get(i109);
                                                m mVar13 = (m) obj5;
                                                if (mVar13.f7646a >= ((m) jVar.first()).f7646a && mVar13.f7646a <= ((m) jVar.last()).f7646a) {
                                                    arrayList7.add(obj5);
                                                }
                                            }
                                            arrayList3 = arrayList7;
                                        }
                                        lVar = new l(mVar, i106, z14, f9, C, f10, z13, cVar, sVar5, iVar.f7610c, arrayList3, i48, i55, i45, j0Var, i26, K5);
                                    }
                                }
                                z10 = z8;
                                if (i14 >= i45) {
                                }
                                w0Var2 = w0Var2;
                                g0 C2 = w0Var2.C(r4.a.w(j9, w4 + i25), r4.a.v(j9, i107 + K4), vVar2, new c.h(arrayList6, (m) null, v8, z0Var3));
                                if (z10) {
                                }
                                lVar = new l(mVar, i106, z14, f9, C2, f10, z13, cVar, sVar5, iVar.f7610c, arrayList3, i48, i55, i45, j0Var, i26, K5);
                            }
                        }
                        list2 = list;
                        i16 = i44;
                        list3 = arrayList2;
                        if (list3 != null) {
                            min2 = ((m) e6.l.n0(list3)).f7646a;
                        }
                        size = arrayList.size();
                        while (i17 < size) {
                        }
                        if (list3 == null) {
                        }
                        size2 = list3.size();
                        int i932 = i86;
                        while (i18 < size2) {
                        }
                        if (r6.k.a(mVar, jVar.first())) {
                        }
                        w4 = r4.a.w(M, i932);
                        v5 = r4.a.v(M, i58);
                        i19 = i16;
                        if (i58 >= Math.min(v5, i19)) {
                        }
                        if (!z9) {
                        }
                        ArrayList arrayList62 = new ArrayList(list3.size() + list2.size() + jVar.a());
                        if (z9) {
                        }
                        i21 = i20;
                        int i1062 = i13;
                        aVar.b(w4, v5, arrayList62, lVar2, iVar, v8, z11, i1062, i21);
                        int i1072 = v5;
                        if (!v8) {
                        }
                        z10 = z8;
                        if (i14 >= i45) {
                        }
                        w0Var2 = w0Var2;
                        g0 C22 = w0Var2.C(r4.a.w(j9, w4 + i25), r4.a.v(j9, i1072 + K4), vVar2, new c.h(arrayList62, (m) null, v8, z0Var3));
                        if (z10) {
                        }
                        lVar = new l(mVar, i1062, z14, f9, C22, f10, z13, cVar, sVar5, iVar.f7610c, arrayList3, i48, i55, i45, j0Var, i26, K5);
                    } else {
                        i58 = i73;
                    }
                } else {
                    i10 = i53;
                    i11 = i68;
                }
                i12 = i47;
                int i742 = i61;
                if (Integer.signum(Math.round(f13)) == Integer.signum(i10)) {
                }
                float f152 = f13 - f14;
                if (v8) {
                }
                if (i11 >= 0) {
                }
            }
            sVar2.f(lVar, w0Var2.v(), false);
            return lVar;
        } catch (Throwable th) {
            q0.r.f(c6, d9, f12);
            throw th;
        }
    }
}
