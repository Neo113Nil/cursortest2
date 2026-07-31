package s;

import B.C0011l;
import E.F;
import I.C0143d;
import I.C0150g0;
import I.C0167p;
import R1.y;
import b0.D;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import k2.C0570b;
import k2.C0572d;
import l2.InterfaceC0602c;
import n.AbstractC0695v;
import n0.C0710h;
import p.C0775m;
import p.P;
import r.InterfaceC0849K;
import r.InterfaceC0859f;
import r.InterfaceC0862i;
import r0.InterfaceC0886H;
import r0.InterfaceC0902Y;
import t.C0981i;
import t.x;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0933b extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8213e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0951t f8214f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0849K f8215g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f8216h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0862i f8217i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f8218j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8219k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U.c f8220l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8221m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f8222n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f8223o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0933b(U.q qVar, C0951t c0951t, InterfaceC0849K interfaceC0849K, boolean z3, InterfaceC0862i interfaceC0862i, U.c cVar, C0775m c0775m, boolean z4, InterfaceC0424c interfaceC0424c, int i3) {
        super(2);
        this.f8221m = qVar;
        this.f8214f = c0951t;
        this.f8215g = interfaceC0849K;
        this.f8216h = z3;
        this.f8217i = interfaceC0862i;
        this.f8220l = cVar;
        this.f8222n = c0775m;
        this.f8218j = z4;
        this.f8223o = interfaceC0424c;
        this.f8219k = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06d2 A[LOOP:15: B:246:0x06d0->B:247:0x06d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0715 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x023a A[LOOP:28: B:458:0x023a->B:460:0x0243, LOOP_START, PHI: r2
      0x023a: PHI (r2v19 int) = (r2v18 int), (r2v20 int) binds: [B:457:0x0238, B:460:0x0243] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x01fc  */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v84 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object] */
    @Override // e2.InterfaceC0426e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj, Object obj2) {
        int i3;
        boolean m3;
        x xVar;
        ?? arrayList;
        K.d dVar;
        C0572d c0572d;
        int size;
        int i4;
        int i5;
        int i6;
        int i7;
        long j3;
        int i8;
        int i9;
        int i10;
        int i11;
        C0944m c0944m;
        int i12;
        C0944m c0944m2;
        int i13;
        List list;
        List list2;
        int i14;
        int i15;
        ArrayList arrayList2;
        boolean z3;
        List list3;
        int i16;
        List list4;
        int size2;
        int i17;
        int size3;
        int i18;
        long j4;
        boolean z4;
        int D;
        int i19;
        int C;
        int i20;
        boolean z5;
        boolean z6;
        C0944m c0944m3;
        float f3;
        boolean z7;
        ArrayList arrayList3;
        C0943l c0943l;
        C0951t c0951t;
        InterfaceC0902Y interfaceC0902Y;
        boolean z8;
        C0570b c0570b;
        int i21;
        int i22;
        float f4;
        int i23;
        C0944m c0944m4;
        float f5;
        float f6;
        C0944m c0944m5;
        C0944m c0944m6;
        int i24;
        Object obj3;
        int min;
        int i25;
        C0944m c0944m7;
        Object obj4;
        int i26;
        switch (this.f8213e) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC0695v.a((U.q) this.f8221m, this.f8214f, this.f8215g, this.f8216h, this.f8217i, this.f8220l, (C0775m) this.f8222n, this.f8218j, (InterfaceC0424c) this.f8223o, (C0167p) obj, C0143d.U(this.f8219k | 1));
                return y.f4171a;
            default:
                t.u uVar = (t.u) obj;
                long j5 = ((O0.a) obj2).f3725a;
                C0951t c0951t2 = this.f8214f;
                c0951t2.f8334r.getValue();
                boolean z9 = c0951t2.f8318b || uVar.f8512e.D();
                P p3 = P.f7567d;
                AbstractC0695v.g(j5, p3);
                O0.k layoutDirection = uVar.f8512e.getLayoutDirection();
                InterfaceC0849K interfaceC0849K = this.f8215g;
                int l3 = uVar.f8512e.l(interfaceC0849K.b(layoutDirection));
                int l4 = uVar.f8512e.l(interfaceC0849K.a(uVar.f8512e.getLayoutDirection()));
                int l5 = uVar.f8512e.l(interfaceC0849K.d());
                float c2 = interfaceC0849K.c();
                InterfaceC0902Y interfaceC0902Y2 = uVar.f8512e;
                int l6 = interfaceC0902Y2.l(c2);
                int i27 = l5 + l6;
                int i28 = l3 + l4;
                boolean z10 = this.f8216h;
                if (!z10) {
                    l6 = l5;
                } else if (!z10) {
                    l6 = l4;
                }
                int i29 = i27 - l6;
                long Y2 = O2.d.Y(-i28, -i27, j5);
                C0939h c0939h = (C0939h) ((InterfaceC0602c) this.f8221m).b();
                C0934c c0934c = c0939h.f8236c;
                int i30 = l6;
                int h3 = O0.a.h(Y2);
                int g3 = O0.a.g(Y2);
                c0934c.f8224a.h(h3);
                c0934c.f8225b.h(g3);
                InterfaceC0862i interfaceC0862i = this.f8217i;
                if (interfaceC0862i == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                int l7 = interfaceC0902Y2.l(interfaceC0862i.a());
                int c3 = c0939h.c();
                int g4 = O0.a.g(j5) - i27;
                t.u uVar2 = uVar;
                C0941j c0941j = new C0941j(Y2, c0939h, uVar, c3, l7, this.f8220l, (U.h) this.f8223o, this.f8216h, i30, i29, (!z10 || g4 > 0) ? l0.c.c(l3, l5) : l0.c.c(l3, l5 + g4), this.f8214f);
                S.i c4 = S.u.c();
                InterfaceC0424c f7 = c4 != null ? c4.f() : null;
                S.i d3 = S.u.d(c4);
                try {
                    F f8 = c0951t2.f8320d;
                    int g5 = ((C0150g0) f8.f923b).g();
                    int k3 = n.r.k(g5, f8.f925d, c0939h);
                    if (g5 != k3) {
                        ((C0150g0) f8.f923b).h(k3);
                        t.v vVar = (t.v) f8.f926e;
                        if (g5 != vVar.f8516e) {
                            vVar.f8516e = g5;
                            int i31 = (g5 / 30) * 30;
                            i3 = 0;
                            vVar.f8515d.setValue(O2.d.g0(Math.max(i31 - 100, 0), i31 + 130));
                            int g6 = ((C0150g0) f8.f924c).g();
                            S.u.f(c4, d3, f7);
                            C0710h c0710h = c0951t2.f8330n;
                            m3 = c0710h.f7291a.m();
                            S1.u uVar3 = S1.u.f4320d;
                            xVar = c0951t2.f8333q;
                            if (m3 && xVar.f8523d.isEmpty()) {
                                arrayList = uVar3;
                            } else {
                                arrayList = new ArrayList();
                                dVar = c0710h.f7291a;
                                if (dVar.m()) {
                                    c0572d = C0572d.f6426g;
                                } else {
                                    if (dVar.l()) {
                                        throw new NoSuchElementException("MutableVector is empty.");
                                    }
                                    Object[] objArr = dVar.f3214d;
                                    int i32 = ((C0981i) objArr[i3]).f8481a;
                                    int i33 = dVar.f3216f;
                                    if (i33 > 0) {
                                        int i34 = i3;
                                        do {
                                            int i35 = ((C0981i) objArr[i34]).f8481a;
                                            if (i35 < i32) {
                                                i32 = i35;
                                            }
                                            i34++;
                                        } while (i34 < i33);
                                    }
                                    if (i32 < 0) {
                                        throw new IllegalArgumentException("negative minIndex");
                                    }
                                    if (dVar.l()) {
                                        throw new NoSuchElementException("MutableVector is empty.");
                                    }
                                    Object[] objArr2 = dVar.f3214d;
                                    int i36 = ((C0981i) objArr2[i3]).f8482b;
                                    int i37 = dVar.f3216f;
                                    if (i37 > 0) {
                                        int i38 = i3;
                                        do {
                                            int i39 = ((C0981i) objArr2[i38]).f8482b;
                                            if (i39 > i36) {
                                                i36 = i39;
                                            }
                                            i38++;
                                        } while (i38 < i37);
                                    }
                                    c0572d = new C0572d(i32, Math.min(i36, c0939h.c() - 1), 1);
                                }
                                size = xVar.f8523d.size();
                                for (i4 = i3; i4 < size; i4++) {
                                    t.w wVar = (t.w) xVar.get(i4);
                                    int k4 = n.r.k(wVar.f8519c.g(), wVar.f8517a, c0939h);
                                    int i40 = c0572d.f6419d;
                                    if ((k4 > c0572d.f6420e || i40 > k4) && k4 >= 0 && k4 < c0939h.c()) {
                                        arrayList.add(Integer.valueOf(k4));
                                    }
                                }
                                i5 = c0572d.f6419d;
                                i6 = c0572d.f6420e;
                                if (i5 <= i6) {
                                    while (true) {
                                        arrayList.add(Integer.valueOf(i5));
                                        if (i5 != i6) {
                                            i5++;
                                        }
                                    }
                                }
                            }
                            float floatValue = (interfaceC0902Y2.D() && z9) ? ((Number) c0951t2.f8338v.f6849e.getValue()).floatValue() : c0951t2.f8323g;
                            if (this.f8218j) {
                                c0939h.f8235b.getClass();
                            }
                            boolean D3 = interfaceC0902Y2.D();
                            C0943l c0943l2 = c0951t2.f8319c;
                            if (i30 >= 0) {
                                throw new IllegalArgumentException("invalid beforeContentPadding");
                            }
                            if (i29 < 0) {
                                throw new IllegalArgumentException("invalid afterContentPadding");
                            }
                            S1.v vVar2 = S1.v.f4321d;
                            C0939h c0939h2 = c0941j.f8252a;
                            v2.c cVar = (v2.c) this.f8222n;
                            int i41 = g6;
                            androidx.compose.foundation.lazy.layout.a aVar = c0951t2.f8329m;
                            C0011l c0011l = c0939h2.f8237d;
                            if (c3 <= 0) {
                                int j6 = O0.a.j(Y2);
                                int i42 = O0.a.i(Y2);
                                aVar.b(j6, i42, new ArrayList(), c0011l, c0941j, D3, z9, 0, 0);
                                if (!D3) {
                                    aVar.a();
                                    if (!O0.j.a(0L, 0L)) {
                                        int D4 = O2.d.D(Y2, (int) 0);
                                        i42 = O2.d.C(Y2, (int) 0);
                                        j6 = D4;
                                    }
                                }
                                c0951t = c0951t2;
                                c0943l = new C0943l(null, 0, false, 0.0f, interfaceC0902Y2.i0(O2.d.D(j5, j6 + i28), O2.d.C(j5, i42 + i27), vVar2, C0942k.f8265f), 0.0f, false, cVar, uVar2, c0941j.f8254c, uVar3, -i30, g4 + i29, 0, p3, i29, l7);
                                interfaceC0902Y = interfaceC0902Y2;
                                z8 = false;
                            } else {
                                int i43 = g4;
                                if (k3 >= c3) {
                                    k3 = c3 - 1;
                                    i41 = 0;
                                }
                                int round = Math.round(floatValue);
                                int i44 = i41 - round;
                                if (k3 != 0 || i44 >= 0) {
                                    i7 = k3;
                                } else {
                                    round += i44;
                                    i7 = k3;
                                    i44 = 0;
                                }
                                S1.j jVar = new S1.j();
                                int i45 = -i30;
                                int i46 = i45 + (l7 < 0 ? l7 : 0);
                                int i47 = i44 + i46;
                                int i48 = 0;
                                while (true) {
                                    j3 = c0941j.f8254c;
                                    if (i47 < 0 && i7 > 0) {
                                        androidx.compose.foundation.lazy.layout.a aVar2 = aVar;
                                        int i49 = i7 - 1;
                                        C0944m a3 = c0941j.a(j3, i49);
                                        jVar.add(0, a3);
                                        i48 = Math.max(i48, a3.f8298n);
                                        i47 += a3.f8297m;
                                        i7 = i49;
                                        aVar = aVar2;
                                    }
                                }
                                androidx.compose.foundation.lazy.layout.a aVar3 = aVar;
                                if (i47 < i46) {
                                    round += i47;
                                    i47 = i46;
                                }
                                int i50 = round;
                                int i51 = i47 - i46;
                                int i52 = i43 + i29;
                                int i53 = i48;
                                int i54 = i52 >= 0 ? i52 : 0;
                                int i55 = -i51;
                                int i56 = i51;
                                int i57 = i7;
                                int i58 = 0;
                                boolean z11 = false;
                                while (i58 < jVar.f4316f) {
                                    if (i55 >= i54) {
                                        jVar.c(i58);
                                        z11 = true;
                                    } else {
                                        i57++;
                                        i55 += ((C0944m) jVar.get(i58)).f8297m;
                                        i58++;
                                    }
                                }
                                int i59 = i53;
                                boolean z12 = z11;
                                int i60 = i57;
                                List list5 = arrayList;
                                while (i60 < c3 && (i55 < i54 || i55 <= 0 || jVar.isEmpty())) {
                                    int i61 = i54;
                                    C0944m a4 = c0941j.a(j3, i60);
                                    List list6 = list5;
                                    int i62 = a4.f8297m;
                                    int i63 = i55 + i62;
                                    if (i63 <= i46) {
                                        i26 = i63;
                                        if (i60 != c3 - 1) {
                                            i56 -= i62;
                                            i7 = i60 + 1;
                                            z12 = true;
                                            i60++;
                                            i54 = i61;
                                            list5 = list6;
                                            i55 = i26;
                                        }
                                    } else {
                                        i26 = i63;
                                    }
                                    i59 = Math.max(i59, a4.f8298n);
                                    jVar.addLast(a4);
                                    i60++;
                                    i54 = i61;
                                    list5 = list6;
                                    i55 = i26;
                                }
                                List list7 = list5;
                                if (i55 < i43) {
                                    int i64 = i43 - i55;
                                    i55 += i64;
                                    i11 = i56 - i64;
                                    while (i11 < i30 && i7 > 0) {
                                        int i65 = i7 - 1;
                                        int i66 = i60;
                                        C0944m a5 = c0941j.a(j3, i65);
                                        jVar.add(0, a5);
                                        i59 = Math.max(i59, a5.f8298n);
                                        i11 += a5.f8297m;
                                        i7 = i65;
                                        i60 = i66;
                                    }
                                    i8 = i60;
                                    i9 = i50;
                                    int i67 = i9 + i64;
                                    if (i11 < 0) {
                                        i55 += i11;
                                        i10 = i67 + i11;
                                        i11 = 0;
                                    } else {
                                        i10 = i67;
                                    }
                                } else {
                                    i8 = i60;
                                    i9 = i50;
                                    i10 = i9;
                                    i11 = i56;
                                }
                                int i68 = i59;
                                float f9 = (Integer.signum(Math.round(floatValue)) != Integer.signum(i10) || Math.abs(Math.round(floatValue)) < Math.abs(i10)) ? floatValue : i10;
                                float f10 = floatValue - f9;
                                float f11 = (!D3 || i10 <= i9 || f10 > 0.0f) ? 0.0f : (i10 - i9) + f10;
                                if (i11 < 0) {
                                    throw new IllegalArgumentException("negative currentFirstItemScrollOffset");
                                }
                                int i69 = -i11;
                                C0944m c0944m8 = (C0944m) jVar.first();
                                if (i30 > 0 || l7 < 0) {
                                    int i70 = jVar.f4316f;
                                    int i71 = i11;
                                    int i72 = 0;
                                    while (true) {
                                        if (i72 < i70) {
                                            c0944m = c0944m8;
                                            int i73 = ((C0944m) jVar.get(i72)).f8297m;
                                            if (i71 != 0 && i73 <= i71) {
                                                int i74 = i70;
                                                if (i72 != S1.m.z0(jVar)) {
                                                    i71 -= i73;
                                                    i72++;
                                                    c0944m8 = (C0944m) jVar.get(i72);
                                                    i70 = i74;
                                                }
                                            }
                                        } else {
                                            c0944m = c0944m8;
                                        }
                                    }
                                    i12 = i71;
                                    c0944m2 = c0944m;
                                } else {
                                    c0944m2 = c0944m8;
                                    i12 = i11;
                                }
                                int i75 = this.f8219k;
                                int max = Math.max(0, i7 - i75);
                                float f12 = f11;
                                int i76 = i7 - 1;
                                if (max <= i76) {
                                    list = null;
                                    while (true) {
                                        if (list == null) {
                                            list = new ArrayList();
                                        }
                                        i13 = i12;
                                        list.add(c0941j.a(j3, i76));
                                        if (i76 != max) {
                                            i76--;
                                            i12 = i13;
                                        }
                                    }
                                } else {
                                    i13 = i12;
                                    list = null;
                                }
                                int size4 = list7.size() - 1;
                                if (size4 >= 0) {
                                    while (true) {
                                        int i77 = size4 - 1;
                                        list2 = list7;
                                        int intValue = ((Number) list2.get(size4)).intValue();
                                        if (intValue < max) {
                                            if (list == null) {
                                                list = new ArrayList();
                                            }
                                            list.add(c0941j.a(j3, intValue));
                                        }
                                        if (i77 >= 0) {
                                            list7 = list2;
                                            size4 = i77;
                                        }
                                    }
                                } else {
                                    list2 = list7;
                                }
                                if (list == null) {
                                    list = uVar3;
                                }
                                int i78 = i68;
                                int i79 = 0;
                                for (int size5 = list.size(); i79 < size5; size5 = size5) {
                                    i78 = Math.max(i78, ((C0944m) list.get(i79)).f8298n);
                                    i79++;
                                }
                                int i80 = c3 - 1;
                                int min2 = Math.min(((C0944m) S1.l.Q0(jVar)).f8285a + i75, i80);
                                int i81 = ((C0944m) S1.l.Q0(jVar)).f8285a + 1;
                                if (i81 <= min2) {
                                    ArrayList arrayList4 = null;
                                    while (true) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        i14 = i43;
                                        i15 = i78;
                                        arrayList2 = arrayList4;
                                        arrayList2.add(c0941j.a(j3, i81));
                                        if (i81 != min2) {
                                            i81++;
                                            arrayList4 = arrayList2;
                                            i78 = i15;
                                            i43 = i14;
                                        }
                                    }
                                } else {
                                    i14 = i43;
                                    i15 = i78;
                                    arrayList2 = null;
                                }
                                if (D3 && c0943l2 != null) {
                                    ?? r13 = c0943l2.f8277j;
                                    if (!r13.isEmpty()) {
                                        z3 = D3;
                                        ArrayList arrayList5 = arrayList2;
                                        for (int size6 = r13.size() - 1; -1 < size6; size6--) {
                                            if (((C0944m) r13.get(size6)).f8285a > min2 && (size6 == 0 || ((C0944m) r13.get(size6 - 1)).f8285a <= min2)) {
                                                c0944m4 = (C0944m) r13.get(size6);
                                                C0944m c0944m9 = (C0944m) S1.l.Q0(r13);
                                                if (c0944m4 != null || (i25 = c0944m4.f8285a) > (min = Math.min(c0944m9.f8285a, i80))) {
                                                    list3 = list;
                                                    i16 = i55;
                                                    list4 = arrayList5;
                                                } else {
                                                    list4 = arrayList5;
                                                    while (true) {
                                                        if (list4 != null) {
                                                            i16 = i55;
                                                            int size7 = list4.size();
                                                            list3 = list;
                                                            int i82 = 0;
                                                            while (true) {
                                                                if (i82 < size7) {
                                                                    obj4 = list4.get(i82);
                                                                    int i83 = size7;
                                                                    if (((C0944m) obj4).f8285a != i25) {
                                                                        i82++;
                                                                        size7 = i83;
                                                                    }
                                                                } else {
                                                                    obj4 = null;
                                                                }
                                                            }
                                                            c0944m7 = (C0944m) obj4;
                                                        } else {
                                                            list3 = list;
                                                            i16 = i55;
                                                            c0944m7 = null;
                                                        }
                                                        if (c0944m7 == null) {
                                                            if (list4 == null) {
                                                                list4 = new ArrayList();
                                                            }
                                                            list4.add(c0941j.a(j3, i25));
                                                        }
                                                        if (i25 != min) {
                                                            i25++;
                                                            list = list3;
                                                            i55 = i16;
                                                        }
                                                    }
                                                }
                                                f5 = ((c0943l2.f8279l - c0944m9.f8295k) - c0944m9.f8296l) - f9;
                                                if (f5 > 0.0f) {
                                                    int i84 = c0944m9.f8285a + 1;
                                                    int i85 = 0;
                                                    while (i84 < c3 && i85 < f5) {
                                                        if (i84 <= min2) {
                                                            int b3 = jVar.b();
                                                            int i86 = 0;
                                                            while (true) {
                                                                if (i86 < b3) {
                                                                    obj3 = jVar.get(i86);
                                                                    f6 = f5;
                                                                    if (((C0944m) obj3).f8285a != i84) {
                                                                        i86++;
                                                                        f5 = f6;
                                                                    }
                                                                } else {
                                                                    f6 = f5;
                                                                    obj3 = null;
                                                                }
                                                            }
                                                            c0944m5 = (C0944m) obj3;
                                                        } else {
                                                            f6 = f5;
                                                            if (list4 != null) {
                                                                int size8 = list4.size();
                                                                int i87 = 0;
                                                                while (true) {
                                                                    if (i87 < size8) {
                                                                        c0944m6 = list4.get(i87);
                                                                        if (((C0944m) c0944m6).f8285a != i84) {
                                                                            i87++;
                                                                        }
                                                                    } else {
                                                                        c0944m6 = 0;
                                                                    }
                                                                }
                                                                c0944m5 = c0944m6;
                                                            } else {
                                                                c0944m5 = null;
                                                            }
                                                        }
                                                        if (c0944m5 != null) {
                                                            i84++;
                                                            i24 = c0944m5.f8297m;
                                                        } else {
                                                            if (list4 == null) {
                                                                list4 = new ArrayList();
                                                            }
                                                            list4.add(c0941j.a(j3, i84));
                                                            i84++;
                                                            i24 = ((C0944m) S1.l.Q0(list4)).f8297m;
                                                        }
                                                        i85 += i24;
                                                        f5 = f6;
                                                    }
                                                }
                                                if (list4 != null && ((C0944m) S1.l.Q0(list4)).f8285a > min2) {
                                                    min2 = ((C0944m) S1.l.Q0(list4)).f8285a;
                                                }
                                                size2 = list2.size();
                                                for (i17 = 0; i17 < size2; i17++) {
                                                    int intValue2 = ((Number) list2.get(i17)).intValue();
                                                    if (intValue2 > min2) {
                                                        if (list4 == null) {
                                                            list4 = new ArrayList();
                                                        }
                                                        list4.add(c0941j.a(j3, intValue2));
                                                    }
                                                }
                                                if (list4 == null) {
                                                    list4 = uVar3;
                                                }
                                                size3 = list4.size();
                                                int i88 = i15;
                                                for (i18 = 0; i18 < size3; i18++) {
                                                    i88 = Math.max(i88, ((C0944m) list4.get(i18)).f8298n);
                                                }
                                                if (!f2.j.a(c0944m2, jVar.first()) && list3.isEmpty() && list4.isEmpty()) {
                                                    j4 = Y2;
                                                    z4 = true;
                                                } else {
                                                    j4 = Y2;
                                                    z4 = false;
                                                }
                                                D = O2.d.D(j4, i88);
                                                i19 = i16;
                                                C = O2.d.C(j4, i19);
                                                i20 = i14;
                                                z5 = i19 < Math.min(C, i20);
                                                if (!z5 && i69 != 0) {
                                                    throw new IllegalStateException("non-zero itemsScrollOffset");
                                                }
                                                ArrayList arrayList6 = new ArrayList(list4.size() + list3.size() + jVar.b());
                                                if (!z5) {
                                                    z6 = z4;
                                                    c0944m3 = c0944m2;
                                                    f3 = f9;
                                                    z7 = true;
                                                    int size9 = list3.size();
                                                    int i89 = i69;
                                                    int i90 = 0;
                                                    while (i90 < size9) {
                                                        List list8 = list3;
                                                        C0944m c0944m10 = (C0944m) list8.get(i90);
                                                        i89 -= c0944m10.f8297m;
                                                        c0944m10.c(i89, D, C);
                                                        arrayList6.add(c0944m10);
                                                        i90++;
                                                        size9 = size9;
                                                        list3 = list8;
                                                    }
                                                    int b4 = jVar.b();
                                                    int i91 = i69;
                                                    for (int i92 = 0; i92 < b4; i92++) {
                                                        C0944m c0944m11 = (C0944m) jVar.get(i92);
                                                        c0944m11.c(i91, D, C);
                                                        arrayList6.add(c0944m11);
                                                        i91 += c0944m11.f8297m;
                                                    }
                                                    int size10 = list4.size();
                                                    for (int i93 = 0; i93 < size10; i93++) {
                                                        C0944m c0944m12 = (C0944m) list4.get(i93);
                                                        c0944m12.c(i91, D, C);
                                                        arrayList6.add(c0944m12);
                                                        i91 += c0944m12.f8297m;
                                                    }
                                                } else {
                                                    if (!list3.isEmpty() || !list4.isEmpty()) {
                                                        throw new IllegalArgumentException("no extra items");
                                                    }
                                                    int b5 = jVar.b();
                                                    int[] iArr = new int[b5];
                                                    int i94 = 0;
                                                    while (i94 < b5) {
                                                        if (z10) {
                                                            f4 = f9;
                                                            i23 = (b5 - i94) - 1;
                                                        } else {
                                                            f4 = f9;
                                                            i23 = i94;
                                                        }
                                                        iArr[i94] = ((C0944m) jVar.get(i23)).f8296l;
                                                        i94++;
                                                        f9 = f4;
                                                    }
                                                    f3 = f9;
                                                    int[] iArr2 = new int[b5];
                                                    for (int i95 = 0; i95 < b5; i95++) {
                                                        iArr2[i95] = 0;
                                                    }
                                                    if (interfaceC0862i == null) {
                                                        throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                                                    }
                                                    c0944m3 = c0944m2;
                                                    interfaceC0862i.c(C, uVar2, iArr, iArr2);
                                                    if (z10) {
                                                        z6 = z4;
                                                        uVar2 = uVar2;
                                                        C0572d c0572d2 = new C0572d(0, b5 - 1, 1);
                                                        c0570b = new C0570b(c0572d2.f6420e, 0, -c0572d2.f6421f);
                                                    } else {
                                                        z6 = z4;
                                                        uVar2 = uVar2;
                                                        c0570b = new C0572d(0, b5 - 1, 1);
                                                    }
                                                    int i96 = c0570b.f6419d;
                                                    int i97 = c0570b.f6420e;
                                                    int i98 = c0570b.f6421f;
                                                    if ((i98 <= 0 || i96 > i97) && (i98 >= 0 || i97 > i96)) {
                                                        z7 = true;
                                                    } else {
                                                        while (true) {
                                                            int i99 = iArr2[i96];
                                                            if (z10) {
                                                                z7 = true;
                                                                i21 = (b5 - i96) - 1;
                                                            } else {
                                                                i21 = i96;
                                                                z7 = true;
                                                            }
                                                            C0944m c0944m13 = (C0944m) jVar.get(i21);
                                                            if (z10) {
                                                                i22 = b5;
                                                                i99 = (C - i99) - c0944m13.f8296l;
                                                            } else {
                                                                i22 = b5;
                                                            }
                                                            c0944m13.c(i99, D, C);
                                                            arrayList6.add(c0944m13);
                                                            if (i96 != i97) {
                                                                i96 += i98;
                                                                b5 = i22;
                                                            }
                                                        }
                                                    }
                                                }
                                                aVar3.b(D, C, arrayList6, c0011l, c0941j, z3, z9, i13, i19);
                                                if (!z3) {
                                                    aVar3.a();
                                                    if (!O0.j.a(0L, 0L)) {
                                                        D = O2.d.D(j4, Math.max(D, (int) 0));
                                                        int C3 = O2.d.C(j4, Math.max(C, (int) 0));
                                                        if (C3 != C) {
                                                            int size11 = arrayList6.size();
                                                            for (int i100 = 0; i100 < size11; i100++) {
                                                                ((C0944m) arrayList6.get(i100)).f8299o = C3;
                                                            }
                                                        }
                                                        C = C3;
                                                    }
                                                }
                                                boolean z13 = (i8 >= c3 || i19 > i20) ? z7 : false;
                                                InterfaceC0886H i02 = interfaceC0902Y2.i0(O2.d.D(j5, D + i28), O2.d.C(j5, C + i27), vVar2, new R.h(arrayList6, (C0944m) null, z3, c0951t2.f8337u));
                                                if (z6) {
                                                    arrayList3 = arrayList6;
                                                } else {
                                                    arrayList3 = new ArrayList(arrayList6.size());
                                                    int size12 = arrayList6.size();
                                                    for (int i101 = 0; i101 < size12; i101++) {
                                                        Object obj5 = arrayList6.get(i101);
                                                        C0944m c0944m14 = (C0944m) obj5;
                                                        if (c0944m14.f8285a >= ((C0944m) jVar.first()).f8285a) {
                                                            if (c0944m14.f8285a <= ((C0944m) jVar.last()).f8285a) {
                                                                arrayList3.add(obj5);
                                                            }
                                                        }
                                                    }
                                                }
                                                c0951t = c0951t2;
                                                ArrayList arrayList7 = arrayList3;
                                                interfaceC0902Y = interfaceC0902Y2;
                                                z8 = false;
                                                c0943l = new C0943l(c0944m3, i13, z13, f3, i02, f12, z12, cVar, uVar2, c0941j.f8254c, arrayList7, i45, i52, c3, p3, i29, l7);
                                            }
                                        }
                                        c0944m4 = null;
                                        C0944m c0944m92 = (C0944m) S1.l.Q0(r13);
                                        if (c0944m4 != null) {
                                        }
                                        list3 = list;
                                        i16 = i55;
                                        list4 = arrayList5;
                                        f5 = ((c0943l2.f8279l - c0944m92.f8295k) - c0944m92.f8296l) - f9;
                                        if (f5 > 0.0f) {
                                        }
                                        if (list4 != null) {
                                            min2 = ((C0944m) S1.l.Q0(list4)).f8285a;
                                        }
                                        size2 = list2.size();
                                        while (i17 < size2) {
                                        }
                                        if (list4 == null) {
                                        }
                                        size3 = list4.size();
                                        int i882 = i15;
                                        while (i18 < size3) {
                                        }
                                        if (!f2.j.a(c0944m2, jVar.first())) {
                                        }
                                        j4 = Y2;
                                        z4 = false;
                                        D = O2.d.D(j4, i882);
                                        i19 = i16;
                                        C = O2.d.C(j4, i19);
                                        i20 = i14;
                                        if (i19 < Math.min(C, i20)) {
                                        }
                                        if (!z5) {
                                        }
                                        ArrayList arrayList62 = new ArrayList(list4.size() + list3.size() + jVar.b());
                                        if (!z5) {
                                        }
                                        aVar3.b(D, C, arrayList62, c0011l, c0941j, z3, z9, i13, i19);
                                        if (!z3) {
                                        }
                                        if (i8 >= c3) {
                                        }
                                        InterfaceC0886H i022 = interfaceC0902Y2.i0(O2.d.D(j5, D + i28), O2.d.C(j5, C + i27), vVar2, new R.h(arrayList62, (C0944m) null, z3, c0951t2.f8337u));
                                        if (z6) {
                                        }
                                        c0951t = c0951t2;
                                        ArrayList arrayList72 = arrayList3;
                                        interfaceC0902Y = interfaceC0902Y2;
                                        z8 = false;
                                        c0943l = new C0943l(c0944m3, i13, z13, f3, i022, f12, z12, cVar, uVar2, c0941j.f8254c, arrayList72, i45, i52, c3, p3, i29, l7);
                                    }
                                }
                                z3 = D3;
                                list3 = list;
                                i16 = i55;
                                list4 = arrayList2;
                                if (list4 != null) {
                                }
                                size2 = list2.size();
                                while (i17 < size2) {
                                }
                                if (list4 == null) {
                                }
                                size3 = list4.size();
                                int i8822 = i15;
                                while (i18 < size3) {
                                }
                                if (!f2.j.a(c0944m2, jVar.first())) {
                                }
                                j4 = Y2;
                                z4 = false;
                                D = O2.d.D(j4, i8822);
                                i19 = i16;
                                C = O2.d.C(j4, i19);
                                i20 = i14;
                                if (i19 < Math.min(C, i20)) {
                                }
                                if (!z5) {
                                }
                                ArrayList arrayList622 = new ArrayList(list4.size() + list3.size() + jVar.b());
                                if (!z5) {
                                }
                                aVar3.b(D, C, arrayList622, c0011l, c0941j, z3, z9, i13, i19);
                                if (!z3) {
                                }
                                if (i8 >= c3) {
                                }
                                InterfaceC0886H i0222 = interfaceC0902Y2.i0(O2.d.D(j5, D + i28), O2.d.C(j5, C + i27), vVar2, new R.h(arrayList622, (C0944m) null, z3, c0951t2.f8337u));
                                if (z6) {
                                }
                                c0951t = c0951t2;
                                ArrayList arrayList722 = arrayList3;
                                interfaceC0902Y = interfaceC0902Y2;
                                z8 = false;
                                c0943l = new C0943l(c0944m3, i13, z13, f3, i0222, f12, z12, cVar, uVar2, c0941j.f8254c, arrayList722, i45, i52, c3, p3, i29, l7);
                            }
                            c0951t.f(c0943l, interfaceC0902Y.D(), z8);
                            return c0943l;
                        }
                    }
                    i3 = 0;
                    int g62 = ((C0150g0) f8.f924c).g();
                    S.u.f(c4, d3, f7);
                    C0710h c0710h2 = c0951t2.f8330n;
                    m3 = c0710h2.f7291a.m();
                    S1.u uVar32 = S1.u.f4320d;
                    xVar = c0951t2.f8333q;
                    if (m3) {
                    }
                    arrayList = new ArrayList();
                    dVar = c0710h2.f7291a;
                    if (dVar.m()) {
                    }
                    size = xVar.f8523d.size();
                    while (i4 < size) {
                    }
                    i5 = c0572d.f6419d;
                    i6 = c0572d.f6420e;
                    if (i5 <= i6) {
                    }
                    if (interfaceC0902Y2.D()) {
                    }
                    if (this.f8218j) {
                    }
                    boolean D32 = interfaceC0902Y2.D();
                    C0943l c0943l22 = c0951t2.f8319c;
                    if (i30 >= 0) {
                    }
                } catch (Throwable th) {
                    S.u.f(c4, d3, f7);
                    throw th;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0933b(C0951t c0951t, InterfaceC0849K interfaceC0849K, boolean z3, InterfaceC0602c interfaceC0602c, InterfaceC0862i interfaceC0862i, InterfaceC0859f interfaceC0859f, boolean z4, int i3, v2.c cVar, D d3, U.c cVar2, U.h hVar) {
        super(2);
        this.f8214f = c0951t;
        this.f8215g = interfaceC0849K;
        this.f8216h = z3;
        this.f8221m = interfaceC0602c;
        this.f8217i = interfaceC0862i;
        this.f8218j = z4;
        this.f8219k = i3;
        this.f8222n = cVar;
        this.f8220l = cVar2;
        this.f8223o = hVar;
    }
}
