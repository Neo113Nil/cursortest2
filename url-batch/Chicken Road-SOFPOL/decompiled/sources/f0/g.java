package f0;

import android.os.Trace;
import androidx.lifecycle.m0;
import d6.r;
import d6.u;
import f1.p;
import f1.q;
import f1.s;
import g2.b0;
import g2.e0;
import g2.i0;
import g2.n;
import g2.o;
import h2.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import q6.i;
import u1.d0;
import u1.f0;
import u1.l0;
import w1.h0;
import w1.m;
import w1.n0;
import w1.s1;
import w1.v;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends l implements v, m, s1 {
    public e A;
    public f B;

    /* renamed from: r, reason: collision with root package name */
    public String f2613r;

    /* renamed from: s, reason: collision with root package name */
    public i0 f2614s;

    /* renamed from: t, reason: collision with root package name */
    public j2.d f2615t;

    /* renamed from: u, reason: collision with root package name */
    public int f2616u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2617v;

    /* renamed from: w, reason: collision with root package name */
    public int f2618w;

    /* renamed from: x, reason: collision with root package name */
    public int f2619x;

    /* renamed from: y, reason: collision with root package name */
    public HashMap f2620y;

    /* renamed from: z, reason: collision with root package name */
    public d f2621z;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r0 != null) goto L15;
     */
    @Override // w1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(h0 h0Var) {
        d r02;
        if (this.f8718q) {
            f fVar = this.B;
            if (fVar != null) {
                if (!fVar.f2611c) {
                    fVar = null;
                }
                if (fVar != null) {
                    r02 = fVar.f2612d;
                }
            }
            r02 = r0();
            g2.a aVar = r02.f2599j;
            if (aVar == null) {
                w.a.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.f2621z + ", textSubstitution=" + this.B + ')');
                throw new a5.c();
            }
            q m7 = h0Var.f7680d.f3075e.m();
            boolean z3 = r02.f2600k;
            if (z3) {
                long j7 = r02.f2601l;
                m7.h();
                m7.c(0.0f, 0.0f, (int) (j7 >> 32), (int) (j7 & 4294967295L), 1);
            }
            try {
                b0 b0Var = this.f2614s.f2964a;
                q2.l lVar = b0Var.f2914m;
                if (lVar == null) {
                    lVar = q2.l.f6056b;
                }
                f1.h0 h0Var2 = b0Var.f2915n;
                if (h0Var2 == null) {
                    h0Var2 = f1.h0.f2663d;
                }
                h1.c cVar = b0Var.f2916o;
                if (cVar == null) {
                    cVar = h1.f.f3080b;
                }
                p c8 = b0Var.f2903a.c();
                if (c8 != null) {
                    float a8 = this.f2614s.f2964a.f2903a.a();
                    n2.e eVar = aVar.f2894a.f5312g;
                    int i = eVar.f5321c;
                    float c9 = aVar.c();
                    eVar.c(c8, (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(c9) << 32), a8);
                    eVar.f(h0Var2);
                    eVar.g(lVar);
                    eVar.e(cVar);
                    eVar.b(3);
                    aVar.d(m7);
                    eVar.b(i);
                } else {
                    long j8 = s.f2704h;
                    if (j8 == 16) {
                        j8 = this.f2614s.b() != 16 ? this.f2614s.b() : s.f2698b;
                    }
                    n2.e eVar2 = aVar.f2894a.f5312g;
                    int i8 = eVar2.f5321c;
                    eVar2.d(j8);
                    eVar2.f(h0Var2);
                    eVar2.g(lVar);
                    eVar2.e(cVar);
                    eVar2.b(3);
                    aVar.d(m7);
                    eVar2.b(i8);
                }
                if (z3) {
                    m7.f();
                }
            } catch (Throwable th) {
                if (z3) {
                    m7.f();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r0 != null) goto L13;
     */
    @Override // w1.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f0 e(n0 n0Var, d0 d0Var, long j7) {
        d r02;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            f fVar = this.B;
            if (fVar != null) {
                if (!fVar.f2611c) {
                    fVar = null;
                }
                if (fVar != null) {
                    r02 = fVar.f2612d;
                }
            }
            r02 = r0();
            r02.c(n0Var);
            boolean a8 = r02.a(j7, n0Var.getLayoutDirection());
            g2.q qVar = r02.f2603n;
            if (qVar != null) {
                qVar.a();
            }
            g2.a aVar = r02.f2599j;
            i.b(aVar);
            j jVar = aVar.f2897d;
            long j8 = r02.f2601l;
            if (a8) {
                w1.f.s(this, 2).L0();
                HashMap hashMap = this.f2620y;
                if (hashMap == null) {
                    hashMap = new HashMap(2);
                    this.f2620y = hashMap;
                }
                hashMap.put(u1.d.f7200a, Integer.valueOf(Math.round(jVar.c(0))));
                hashMap.put(u1.d.f7201b, Integer.valueOf(Math.round(jVar.c(jVar.f3108f - 1))));
            }
            int i = (int) (j8 >> 32);
            int i8 = (int) (4294967295L & j8);
            l0 e8 = d0Var.e(m.a.v(i, i, i8, i8));
            HashMap hashMap2 = this.f2620y;
            i.b(hashMap2);
            f0 J = n0Var.J(i, i8, hashMap2, null, new a0.m(e8, 1));
            Trace.endSection();
            return J;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // y0.l
    public final boolean g0() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [f0.e] */
    @Override // w1.s1
    public final void q(d2.j jVar) {
        e eVar = this.A;
        e eVar2 = eVar;
        if (eVar == null) {
            final int i = 0;
            ?? r02 = new p6.c(this) { // from class: f0.e

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ g f2608e;

                {
                    this.f2608e = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0289  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0291  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0293  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x028e  */
                /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
                @Override // p6.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object i(Object obj) {
                    r2.c cVar;
                    g2.f0 f0Var;
                    g2.l lVar;
                    int i8;
                    int i9;
                    int i10;
                    e1.c cVar2;
                    g2.l lVar2;
                    int g3;
                    g2.f0 f0Var2;
                    boolean z3;
                    switch (i) {
                        case 0:
                            List list = (List) obj;
                            g gVar = this.f2608e;
                            d r03 = gVar.r0();
                            i0 d8 = i0.d(gVar.f2614s, s.f2704h, 0L, null, null, 0L, 0, 0L, 16777214);
                            r2.l lVar3 = r03.f2604o;
                            if (lVar3 != null && (cVar = r03.i) != null) {
                                g2.e eVar3 = new g2.e(r03.f2591a);
                                if (r03.f2599j != null && r03.f2603n != null) {
                                    long j7 = r03.f2605p & (-8589934589L);
                                    int i11 = r03.f2596f;
                                    boolean z7 = r03.f2595e;
                                    int i12 = r03.f2594d;
                                    j2.d dVar = r03.f2593c;
                                    u uVar = u.f2326d;
                                    e0 e0Var = new e0(eVar3, d8, uVar, i11, z7, i12, cVar, lVar3, dVar, j7);
                                    n nVar = new n(eVar3, d8, uVar, cVar, dVar);
                                    int i13 = r03.f2596f;
                                    int i14 = r03.f2594d;
                                    g2.l lVar4 = new g2.l();
                                    lVar4.f2973c = nVar;
                                    lVar4.f2971a = i13;
                                    if (r2.a.j(j7) != 0 || r2.a.i(j7) != 0) {
                                        l2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    ArrayList arrayList2 = (ArrayList) nVar.f2978a;
                                    int size = arrayList2.size();
                                    float f6 = 0.0f;
                                    int i15 = 0;
                                    int i16 = 0;
                                    while (true) {
                                        if (i15 < size) {
                                            g2.p pVar = (g2.p) arrayList2.get(i15);
                                            n2.c cVar3 = pVar.f2990a;
                                            int h8 = r2.a.h(j7);
                                            if (r2.a.c(j7)) {
                                                lVar2 = lVar4;
                                                g3 = r2.a.g(j7) - ((int) Math.ceil(f6));
                                                if (g3 < 0) {
                                                    g3 = 0;
                                                }
                                            } else {
                                                lVar2 = lVar4;
                                                g3 = r2.a.g(j7);
                                            }
                                            long b8 = r2.b.b(h8, g3, 5);
                                            g2.l lVar5 = lVar2;
                                            float f8 = f6;
                                            lVar = lVar5;
                                            int i17 = i15;
                                            g2.a aVar = new g2.a(cVar3, lVar5.f2971a - i16, i14, b8);
                                            float b9 = aVar.b() + f8;
                                            j jVar2 = aVar.f2897d;
                                            int i18 = i16 + jVar2.f3108f;
                                            i8 = i18;
                                            arrayList.add(new o(aVar, pVar.f2991b, pVar.f2992c, i16, i18, f8, b9));
                                            if (!jVar2.f3106d && (i8 != lVar.f2971a || i17 == s6.a.t((ArrayList) ((n) lVar.f2973c).f2978a))) {
                                                i15 = i17 + 1;
                                                i16 = i8;
                                                f6 = b9;
                                                lVar4 = lVar;
                                            }
                                        } else {
                                            lVar = lVar4;
                                            i8 = i16;
                                        }
                                    }
                                    lVar.f2972b = i8;
                                    lVar.f2975e = arrayList;
                                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                                    int size2 = arrayList.size();
                                    int i19 = 0;
                                    while (i19 < size2) {
                                        ?? r11 = ((o) arrayList.get(i19)).f2983a.f2899f;
                                        ArrayList arrayList4 = new ArrayList(r11.size());
                                        int size3 = r11.size();
                                        int i20 = 0;
                                        while (i20 < size3) {
                                            e1.c cVar4 = (e1.c) r11.get(i20);
                                            if (cVar4 != null) {
                                                i9 = size2;
                                                i10 = i19;
                                                cVar2 = cVar4.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r10.f2988f) & 4294967295L));
                                            } else {
                                                i9 = size2;
                                                i10 = i19;
                                                cVar2 = null;
                                            }
                                            arrayList4.add(cVar2);
                                            i20++;
                                            size2 = i9;
                                            i19 = i10;
                                        }
                                        r.O(arrayList3, arrayList4);
                                        i19++;
                                    }
                                    if (arrayList3.size() < ((List) ((n) lVar.f2973c).f2980c).size()) {
                                        int size4 = ((List) ((n) lVar.f2973c).f2980c).size() - arrayList3.size();
                                        ArrayList arrayList5 = new ArrayList(size4);
                                        for (int i21 = 0; i21 < size4; i21++) {
                                            arrayList5.add(null);
                                        }
                                        arrayList3 = d6.m.b0(arrayList3, arrayList5);
                                    }
                                    lVar.f2974d = arrayList3;
                                    f0Var = new g2.f0(e0Var, lVar, r03.f2601l);
                                    if (f0Var == null) {
                                        list.add(f0Var);
                                        f0Var2 = f0Var;
                                    } else {
                                        f0Var2 = null;
                                    }
                                    return Boolean.valueOf(f0Var2 == null);
                                }
                            }
                            f0Var = null;
                            if (f0Var == null) {
                            }
                            return Boolean.valueOf(f0Var2 == null);
                        case 1:
                            String str = ((g2.e) obj).f2928e;
                            g gVar2 = this.f2608e;
                            f fVar = gVar2.B;
                            if (fVar == null) {
                                f fVar2 = new f(gVar2.f2613r, str);
                                d dVar2 = new d(str, gVar2.f2614s, gVar2.f2615t, gVar2.f2616u, gVar2.f2617v, gVar2.f2618w, gVar2.f2619x);
                                dVar2.c(gVar2.r0().i);
                                fVar2.f2612d = dVar2;
                                gVar2.B = fVar2;
                            } else if (!i.a(str, fVar.f2610b)) {
                                fVar.f2610b = str;
                                d dVar3 = fVar.f2612d;
                                if (dVar3 != null) {
                                    i0 i0Var = gVar2.f2614s;
                                    j2.d dVar4 = gVar2.f2615t;
                                    int i22 = gVar2.f2616u;
                                    boolean z8 = gVar2.f2617v;
                                    int i23 = gVar2.f2618w;
                                    int i24 = gVar2.f2619x;
                                    dVar3.f2591a = str;
                                    dVar3.f2592b = i0Var;
                                    dVar3.f2593c = dVar4;
                                    dVar3.f2594d = i22;
                                    dVar3.f2595e = z8;
                                    dVar3.f2596f = i23;
                                    dVar3.f2597g = i24;
                                    dVar3.f2606q = (dVar3.f2606q << 2) | 2;
                                    dVar3.b();
                                }
                            }
                            w1.f.n(gVar2);
                            w1.f.m(gVar2);
                            w1.f.l(gVar2);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            g gVar3 = this.f2608e;
                            f fVar3 = gVar3.B;
                            if (fVar3 == null) {
                                z3 = false;
                            } else {
                                fVar3.f2611c = booleanValue;
                                w1.f.n(gVar3);
                                w1.f.m(gVar3);
                                w1.f.l(gVar3);
                                z3 = true;
                            }
                            return Boolean.valueOf(z3);
                    }
                }
            };
            this.A = r02;
            eVar2 = r02;
        }
        g2.e eVar3 = new g2.e(this.f2613r);
        w6.d[] dVarArr = d2.u.f2215a;
        jVar.e(d2.s.f2212z, s6.a.x(eVar3));
        f fVar = this.B;
        if (fVar != null) {
            boolean z3 = fVar.f2611c;
            d2.v vVar = d2.s.B;
            w6.d[] dVarArr2 = d2.u.f2215a;
            w6.d dVar = dVarArr2[16];
            vVar.a(jVar, Boolean.valueOf(z3));
            g2.e eVar4 = new g2.e(fVar.f2610b);
            d2.v vVar2 = d2.s.A;
            w6.d dVar2 = dVarArr2[15];
            vVar2.a(jVar, eVar4);
        }
        final int i8 = 1;
        jVar.e(d2.i.f2134k, new d2.a(null, new p6.c(this) { // from class: f0.e

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f2608e;

            {
                this.f2608e = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0289  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0291  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0293  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x028e  */
            /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
            @Override // p6.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object i(Object obj) {
                r2.c cVar;
                g2.f0 f0Var;
                g2.l lVar;
                int i82;
                int i9;
                int i10;
                e1.c cVar2;
                g2.l lVar2;
                int g3;
                g2.f0 f0Var2;
                boolean z32;
                switch (i8) {
                    case 0:
                        List list = (List) obj;
                        g gVar = this.f2608e;
                        d r03 = gVar.r0();
                        i0 d8 = i0.d(gVar.f2614s, s.f2704h, 0L, null, null, 0L, 0, 0L, 16777214);
                        r2.l lVar3 = r03.f2604o;
                        if (lVar3 != null && (cVar = r03.i) != null) {
                            g2.e eVar32 = new g2.e(r03.f2591a);
                            if (r03.f2599j != null && r03.f2603n != null) {
                                long j7 = r03.f2605p & (-8589934589L);
                                int i11 = r03.f2596f;
                                boolean z7 = r03.f2595e;
                                int i12 = r03.f2594d;
                                j2.d dVar3 = r03.f2593c;
                                u uVar = u.f2326d;
                                e0 e0Var = new e0(eVar32, d8, uVar, i11, z7, i12, cVar, lVar3, dVar3, j7);
                                n nVar = new n(eVar32, d8, uVar, cVar, dVar3);
                                int i13 = r03.f2596f;
                                int i14 = r03.f2594d;
                                g2.l lVar4 = new g2.l();
                                lVar4.f2973c = nVar;
                                lVar4.f2971a = i13;
                                if (r2.a.j(j7) != 0 || r2.a.i(j7) != 0) {
                                    l2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = (ArrayList) nVar.f2978a;
                                int size = arrayList2.size();
                                float f6 = 0.0f;
                                int i15 = 0;
                                int i16 = 0;
                                while (true) {
                                    if (i15 < size) {
                                        g2.p pVar = (g2.p) arrayList2.get(i15);
                                        n2.c cVar3 = pVar.f2990a;
                                        int h8 = r2.a.h(j7);
                                        if (r2.a.c(j7)) {
                                            lVar2 = lVar4;
                                            g3 = r2.a.g(j7) - ((int) Math.ceil(f6));
                                            if (g3 < 0) {
                                                g3 = 0;
                                            }
                                        } else {
                                            lVar2 = lVar4;
                                            g3 = r2.a.g(j7);
                                        }
                                        long b8 = r2.b.b(h8, g3, 5);
                                        g2.l lVar5 = lVar2;
                                        float f8 = f6;
                                        lVar = lVar5;
                                        int i17 = i15;
                                        g2.a aVar = new g2.a(cVar3, lVar5.f2971a - i16, i14, b8);
                                        float b9 = aVar.b() + f8;
                                        j jVar2 = aVar.f2897d;
                                        int i18 = i16 + jVar2.f3108f;
                                        i82 = i18;
                                        arrayList.add(new o(aVar, pVar.f2991b, pVar.f2992c, i16, i18, f8, b9));
                                        if (!jVar2.f3106d && (i82 != lVar.f2971a || i17 == s6.a.t((ArrayList) ((n) lVar.f2973c).f2978a))) {
                                            i15 = i17 + 1;
                                            i16 = i82;
                                            f6 = b9;
                                            lVar4 = lVar;
                                        }
                                    } else {
                                        lVar = lVar4;
                                        i82 = i16;
                                    }
                                }
                                lVar.f2972b = i82;
                                lVar.f2975e = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList.size());
                                int size2 = arrayList.size();
                                int i19 = 0;
                                while (i19 < size2) {
                                    ?? r11 = ((o) arrayList.get(i19)).f2983a.f2899f;
                                    ArrayList arrayList4 = new ArrayList(r11.size());
                                    int size3 = r11.size();
                                    int i20 = 0;
                                    while (i20 < size3) {
                                        e1.c cVar4 = (e1.c) r11.get(i20);
                                        if (cVar4 != null) {
                                            i9 = size2;
                                            i10 = i19;
                                            cVar2 = cVar4.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r10.f2988f) & 4294967295L));
                                        } else {
                                            i9 = size2;
                                            i10 = i19;
                                            cVar2 = null;
                                        }
                                        arrayList4.add(cVar2);
                                        i20++;
                                        size2 = i9;
                                        i19 = i10;
                                    }
                                    r.O(arrayList3, arrayList4);
                                    i19++;
                                }
                                if (arrayList3.size() < ((List) ((n) lVar.f2973c).f2980c).size()) {
                                    int size4 = ((List) ((n) lVar.f2973c).f2980c).size() - arrayList3.size();
                                    ArrayList arrayList5 = new ArrayList(size4);
                                    for (int i21 = 0; i21 < size4; i21++) {
                                        arrayList5.add(null);
                                    }
                                    arrayList3 = d6.m.b0(arrayList3, arrayList5);
                                }
                                lVar.f2974d = arrayList3;
                                f0Var = new g2.f0(e0Var, lVar, r03.f2601l);
                                if (f0Var == null) {
                                    list.add(f0Var);
                                    f0Var2 = f0Var;
                                } else {
                                    f0Var2 = null;
                                }
                                return Boolean.valueOf(f0Var2 == null);
                            }
                        }
                        f0Var = null;
                        if (f0Var == null) {
                        }
                        return Boolean.valueOf(f0Var2 == null);
                    case 1:
                        String str = ((g2.e) obj).f2928e;
                        g gVar2 = this.f2608e;
                        f fVar2 = gVar2.B;
                        if (fVar2 == null) {
                            f fVar22 = new f(gVar2.f2613r, str);
                            d dVar22 = new d(str, gVar2.f2614s, gVar2.f2615t, gVar2.f2616u, gVar2.f2617v, gVar2.f2618w, gVar2.f2619x);
                            dVar22.c(gVar2.r0().i);
                            fVar22.f2612d = dVar22;
                            gVar2.B = fVar22;
                        } else if (!i.a(str, fVar2.f2610b)) {
                            fVar2.f2610b = str;
                            d dVar32 = fVar2.f2612d;
                            if (dVar32 != null) {
                                i0 i0Var = gVar2.f2614s;
                                j2.d dVar4 = gVar2.f2615t;
                                int i22 = gVar2.f2616u;
                                boolean z8 = gVar2.f2617v;
                                int i23 = gVar2.f2618w;
                                int i24 = gVar2.f2619x;
                                dVar32.f2591a = str;
                                dVar32.f2592b = i0Var;
                                dVar32.f2593c = dVar4;
                                dVar32.f2594d = i22;
                                dVar32.f2595e = z8;
                                dVar32.f2596f = i23;
                                dVar32.f2597g = i24;
                                dVar32.f2606q = (dVar32.f2606q << 2) | 2;
                                dVar32.b();
                            }
                        }
                        w1.f.n(gVar2);
                        w1.f.m(gVar2);
                        w1.f.l(gVar2);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        g gVar3 = this.f2608e;
                        f fVar3 = gVar3.B;
                        if (fVar3 == null) {
                            z32 = false;
                        } else {
                            fVar3.f2611c = booleanValue;
                            w1.f.n(gVar3);
                            w1.f.m(gVar3);
                            w1.f.l(gVar3);
                            z32 = true;
                        }
                        return Boolean.valueOf(z32);
                }
            }
        }));
        final int i9 = 2;
        jVar.e(d2.i.f2135l, new d2.a(null, new p6.c(this) { // from class: f0.e

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f2608e;

            {
                this.f2608e = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0289  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0291  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0293  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x028e  */
            /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
            @Override // p6.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object i(Object obj) {
                r2.c cVar;
                g2.f0 f0Var;
                g2.l lVar;
                int i82;
                int i92;
                int i10;
                e1.c cVar2;
                g2.l lVar2;
                int g3;
                g2.f0 f0Var2;
                boolean z32;
                switch (i9) {
                    case 0:
                        List list = (List) obj;
                        g gVar = this.f2608e;
                        d r03 = gVar.r0();
                        i0 d8 = i0.d(gVar.f2614s, s.f2704h, 0L, null, null, 0L, 0, 0L, 16777214);
                        r2.l lVar3 = r03.f2604o;
                        if (lVar3 != null && (cVar = r03.i) != null) {
                            g2.e eVar32 = new g2.e(r03.f2591a);
                            if (r03.f2599j != null && r03.f2603n != null) {
                                long j7 = r03.f2605p & (-8589934589L);
                                int i11 = r03.f2596f;
                                boolean z7 = r03.f2595e;
                                int i12 = r03.f2594d;
                                j2.d dVar3 = r03.f2593c;
                                u uVar = u.f2326d;
                                e0 e0Var = new e0(eVar32, d8, uVar, i11, z7, i12, cVar, lVar3, dVar3, j7);
                                n nVar = new n(eVar32, d8, uVar, cVar, dVar3);
                                int i13 = r03.f2596f;
                                int i14 = r03.f2594d;
                                g2.l lVar4 = new g2.l();
                                lVar4.f2973c = nVar;
                                lVar4.f2971a = i13;
                                if (r2.a.j(j7) != 0 || r2.a.i(j7) != 0) {
                                    l2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = (ArrayList) nVar.f2978a;
                                int size = arrayList2.size();
                                float f6 = 0.0f;
                                int i15 = 0;
                                int i16 = 0;
                                while (true) {
                                    if (i15 < size) {
                                        g2.p pVar = (g2.p) arrayList2.get(i15);
                                        n2.c cVar3 = pVar.f2990a;
                                        int h8 = r2.a.h(j7);
                                        if (r2.a.c(j7)) {
                                            lVar2 = lVar4;
                                            g3 = r2.a.g(j7) - ((int) Math.ceil(f6));
                                            if (g3 < 0) {
                                                g3 = 0;
                                            }
                                        } else {
                                            lVar2 = lVar4;
                                            g3 = r2.a.g(j7);
                                        }
                                        long b8 = r2.b.b(h8, g3, 5);
                                        g2.l lVar5 = lVar2;
                                        float f8 = f6;
                                        lVar = lVar5;
                                        int i17 = i15;
                                        g2.a aVar = new g2.a(cVar3, lVar5.f2971a - i16, i14, b8);
                                        float b9 = aVar.b() + f8;
                                        j jVar2 = aVar.f2897d;
                                        int i18 = i16 + jVar2.f3108f;
                                        i82 = i18;
                                        arrayList.add(new o(aVar, pVar.f2991b, pVar.f2992c, i16, i18, f8, b9));
                                        if (!jVar2.f3106d && (i82 != lVar.f2971a || i17 == s6.a.t((ArrayList) ((n) lVar.f2973c).f2978a))) {
                                            i15 = i17 + 1;
                                            i16 = i82;
                                            f6 = b9;
                                            lVar4 = lVar;
                                        }
                                    } else {
                                        lVar = lVar4;
                                        i82 = i16;
                                    }
                                }
                                lVar.f2972b = i82;
                                lVar.f2975e = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList.size());
                                int size2 = arrayList.size();
                                int i19 = 0;
                                while (i19 < size2) {
                                    ?? r11 = ((o) arrayList.get(i19)).f2983a.f2899f;
                                    ArrayList arrayList4 = new ArrayList(r11.size());
                                    int size3 = r11.size();
                                    int i20 = 0;
                                    while (i20 < size3) {
                                        e1.c cVar4 = (e1.c) r11.get(i20);
                                        if (cVar4 != null) {
                                            i92 = size2;
                                            i10 = i19;
                                            cVar2 = cVar4.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r10.f2988f) & 4294967295L));
                                        } else {
                                            i92 = size2;
                                            i10 = i19;
                                            cVar2 = null;
                                        }
                                        arrayList4.add(cVar2);
                                        i20++;
                                        size2 = i92;
                                        i19 = i10;
                                    }
                                    r.O(arrayList3, arrayList4);
                                    i19++;
                                }
                                if (arrayList3.size() < ((List) ((n) lVar.f2973c).f2980c).size()) {
                                    int size4 = ((List) ((n) lVar.f2973c).f2980c).size() - arrayList3.size();
                                    ArrayList arrayList5 = new ArrayList(size4);
                                    for (int i21 = 0; i21 < size4; i21++) {
                                        arrayList5.add(null);
                                    }
                                    arrayList3 = d6.m.b0(arrayList3, arrayList5);
                                }
                                lVar.f2974d = arrayList3;
                                f0Var = new g2.f0(e0Var, lVar, r03.f2601l);
                                if (f0Var == null) {
                                    list.add(f0Var);
                                    f0Var2 = f0Var;
                                } else {
                                    f0Var2 = null;
                                }
                                return Boolean.valueOf(f0Var2 == null);
                            }
                        }
                        f0Var = null;
                        if (f0Var == null) {
                        }
                        return Boolean.valueOf(f0Var2 == null);
                    case 1:
                        String str = ((g2.e) obj).f2928e;
                        g gVar2 = this.f2608e;
                        f fVar2 = gVar2.B;
                        if (fVar2 == null) {
                            f fVar22 = new f(gVar2.f2613r, str);
                            d dVar22 = new d(str, gVar2.f2614s, gVar2.f2615t, gVar2.f2616u, gVar2.f2617v, gVar2.f2618w, gVar2.f2619x);
                            dVar22.c(gVar2.r0().i);
                            fVar22.f2612d = dVar22;
                            gVar2.B = fVar22;
                        } else if (!i.a(str, fVar2.f2610b)) {
                            fVar2.f2610b = str;
                            d dVar32 = fVar2.f2612d;
                            if (dVar32 != null) {
                                i0 i0Var = gVar2.f2614s;
                                j2.d dVar4 = gVar2.f2615t;
                                int i22 = gVar2.f2616u;
                                boolean z8 = gVar2.f2617v;
                                int i23 = gVar2.f2618w;
                                int i24 = gVar2.f2619x;
                                dVar32.f2591a = str;
                                dVar32.f2592b = i0Var;
                                dVar32.f2593c = dVar4;
                                dVar32.f2594d = i22;
                                dVar32.f2595e = z8;
                                dVar32.f2596f = i23;
                                dVar32.f2597g = i24;
                                dVar32.f2606q = (dVar32.f2606q << 2) | 2;
                                dVar32.b();
                            }
                        }
                        w1.f.n(gVar2);
                        w1.f.m(gVar2);
                        w1.f.l(gVar2);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        g gVar3 = this.f2608e;
                        f fVar3 = gVar3.B;
                        if (fVar3 == null) {
                            z32 = false;
                        } else {
                            fVar3.f2611c = booleanValue;
                            w1.f.n(gVar3);
                            w1.f.m(gVar3);
                            w1.f.l(gVar3);
                            z32 = true;
                        }
                        return Boolean.valueOf(z32);
                }
            }
        }));
        jVar.e(d2.i.f2136m, new d2.a(null, new m0(3, this)));
        jVar.e(d2.i.f2125a, new d2.a(null, eVar2));
    }

    public final d r0() {
        if (this.f2621z == null) {
            this.f2621z = new d(this.f2613r, this.f2614s, this.f2615t, this.f2616u, this.f2617v, this.f2618w, this.f2619x);
        }
        d dVar = this.f2621z;
        i.b(dVar);
        return dVar;
    }
}
