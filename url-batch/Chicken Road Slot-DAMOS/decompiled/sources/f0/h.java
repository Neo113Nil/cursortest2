package f0;

import a2.f0;
import android.os.Trace;
import b0.j;
import b1.m;
import c2.i0;
import c2.l;
import c2.o0;
import c2.v;
import c2.x1;
import com.google.android.gms.internal.measurement.se;
import d1.k;
import j2.i;
import j2.q;
import j2.s;
import j2.t;
import j2.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k1.e0;
import k1.n;
import k1.p;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.x;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m2.a0;
import m2.d0;
import m2.h0;
import m2.o;
import wd.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends k implements v, l, x1 {
    public String C;
    public h0 D;
    public p2.h E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public HashMap J;
    public d K;
    public h0 L;
    public f M;
    public g N;

    public final d I() {
        h0 h0Var = this.L;
        if (h0Var == null) {
            h0Var = this.D;
        }
        h0 h0Var2 = h0Var;
        if (this.K == null) {
            this.K = new d(this.C, h0Var2, this.E, this.F, this.G, this.H, this.I);
        }
        d dVar = this.K;
        dVar.getClass();
        return dVar;
    }

    public final boolean J(int i3) {
        h0 h0Var = this.L;
        h0 h0Var2 = this.D;
        b0 b0Var = new b0();
        b0Var.f10141d = h0Var2;
        c2.k.x(this, "StyleOuterNode", new a1.f(22));
        this.L = (h0) b0Var.f10141d;
        if (h0Var == null) {
            return false;
        }
        return !h0Var.equals(r0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r0 != null) goto L15;
     */
    @Override // c2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(i0 i0Var) {
        d I;
        if (this.B) {
            g gVar = this.N;
            if (gVar != null) {
                if (!gVar.f4035c) {
                    gVar = null;
                }
                if (gVar != null) {
                    I = gVar.f4036d;
                }
            }
            I = I();
            m2.a aVar = I.j;
            if (aVar == null) {
                a0.a.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.K + ", textSubstitution=" + this.N + ')');
                throw new hd.d();
            }
            n p4 = i0Var.f1585d.f6406e.p();
            boolean z10 = I.f4018k;
            if (z10) {
                long j = I.f4019l;
                p4.h();
                p4.l(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L));
            }
            try {
                J(2);
                h0 h0Var = this.L;
                if (h0Var == null) {
                    h0Var = this.D;
                }
                a0 a0Var = h0Var.f6481a;
                w2.l lVar = a0Var.f6432m;
                if (lVar == null) {
                    lVar = w2.l.f10044b;
                }
                e0 e0Var = a0Var.f6433n;
                if (e0Var == null) {
                    e0Var = e0.f5315d;
                }
                m1.c cVar = a0Var.f6434o;
                if (cVar == null) {
                    cVar = m1.f.f6411b;
                }
                k1.v c10 = a0Var.f6422a.c();
                if (c10 != null) {
                    float a9 = h0Var.f6481a.f6422a.a();
                    t2.d dVar = aVar.f6416a.f9232u;
                    int i3 = dVar.f9240c;
                    float c11 = aVar.c();
                    dVar.c(c10, (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(c11) << 32), a9);
                    dVar.f(e0Var);
                    dVar.g(lVar);
                    dVar.e(cVar);
                    dVar.b(3);
                    aVar.d(p4);
                    dVar.b(i3);
                } else {
                    long j3 = p.g;
                    if (j3 == 16) {
                        j3 = h0Var.b() != 16 ? h0Var.b() : p.f5336b;
                    }
                    t2.d dVar2 = aVar.f6416a.f9232u;
                    int i10 = dVar2.f9240c;
                    dVar2.d(j3);
                    dVar2.f(e0Var);
                    dVar2.g(lVar);
                    dVar2.e(cVar);
                    dVar2.b(3);
                    aVar.d(p4);
                    dVar2.b(i10);
                }
                if (z10) {
                    p4.f();
                }
            } catch (Throwable th) {
                if (z10) {
                    p4.f();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [f0.f] */
    @Override // c2.x1
    public final void u(u uVar) {
        f fVar = this.M;
        f fVar2 = fVar;
        if (fVar == null) {
            final int i3 = 0;
            ?? r02 = new Function1(this) { // from class: f0.f

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ h f4032e;

                {
                    this.f4032e = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0271  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0279  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x027b  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0276  */
                /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    x2.c cVar;
                    m2.e0 e0Var;
                    m mVar;
                    int i10;
                    int i11;
                    int i12;
                    j1.c cVar2;
                    m mVar2;
                    int g;
                    m2.e0 e0Var2;
                    boolean z10;
                    switch (i3) {
                        case 0:
                            List list = (List) obj;
                            h hVar = this.f4032e;
                            d I = hVar.I();
                            h0 c10 = h0.c(hVar.D, p.g, 0L, null, 0L, 0, 0L, 16777214);
                            x2.l lVar = I.f4022o;
                            if (lVar != null && (cVar = I.f4017i) != null) {
                                m2.e eVar = new m2.e(I.f4010a);
                                if (I.j != null && I.f4021n != null) {
                                    long j = I.f4023p & (-8589934589L);
                                    j0 j0Var = j0.f5574d;
                                    int i13 = I.f4015f;
                                    boolean z11 = I.f4014e;
                                    int i14 = I.f4013d;
                                    p2.h hVar2 = I.f4012c;
                                    d0 d0Var = new d0(eVar, c10, j0Var, i13, z11, i14, cVar, lVar, hVar2, j);
                                    se seVar = new se(eVar, c10, j0Var, cVar, hVar2);
                                    int i15 = I.f4015f;
                                    int i16 = I.f4013d;
                                    m mVar3 = new m();
                                    mVar3.f1009c = seVar;
                                    mVar3.f1007a = i15;
                                    if (x2.a.j(j) != 0 || x2.a.i(j) != 0) {
                                        r2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    ArrayList arrayList2 = (ArrayList) seVar.f2802s;
                                    int size = arrayList2.size();
                                    float f3 = 0.0f;
                                    int i17 = 0;
                                    int i18 = 0;
                                    while (true) {
                                        if (i17 < size) {
                                            m2.n nVar = (m2.n) arrayList2.get(i17);
                                            t2.c cVar3 = nVar.f6498a;
                                            int h10 = x2.a.h(j);
                                            if (x2.a.c(j)) {
                                                mVar2 = mVar3;
                                                g = x2.a.g(j) - ((int) Math.ceil(f3));
                                                if (g < 0) {
                                                    g = 0;
                                                }
                                            } else {
                                                mVar2 = mVar3;
                                                g = x2.a.g(j);
                                            }
                                            long b10 = x2.b.b(h10, g, 5);
                                            m mVar4 = mVar2;
                                            float f10 = f3;
                                            mVar = mVar4;
                                            int i19 = i17;
                                            m2.a aVar = new m2.a(cVar3, mVar4.f1007a - i18, i16, b10);
                                            float b11 = aVar.b() + f10;
                                            n2.h hVar3 = aVar.f6419d;
                                            int i20 = i18 + hVar3.f7012f;
                                            i10 = i20;
                                            arrayList.add(new m2.m(aVar, nVar.f6499b, nVar.f6500c, i18, i20, f10, b11));
                                            if (!hVar3.f7010d && (i10 != mVar.f1007a || i19 == y.e((ArrayList) ((se) mVar.f1009c).f2802s))) {
                                                i17 = i19 + 1;
                                                i18 = i10;
                                                f3 = b11;
                                                mVar3 = mVar;
                                            }
                                        } else {
                                            mVar = mVar3;
                                            i10 = i18;
                                        }
                                    }
                                    mVar.f1008b = i10;
                                    mVar.f1011e = arrayList;
                                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                                    int size2 = arrayList.size();
                                    int i21 = 0;
                                    while (i21 < size2) {
                                        ?? r11 = ((m2.m) arrayList.get(i21)).f6492a.f6421f;
                                        ArrayList arrayList4 = new ArrayList(r11.size());
                                        int size3 = r11.size();
                                        int i22 = 0;
                                        while (i22 < size3) {
                                            j1.c cVar4 = (j1.c) r11.get(i22);
                                            if (cVar4 != null) {
                                                i11 = size2;
                                                i12 = i21;
                                                cVar2 = cVar4.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r10.f6497f) & 4294967295L));
                                            } else {
                                                i11 = size2;
                                                i12 = i21;
                                                cVar2 = null;
                                            }
                                            arrayList4.add(cVar2);
                                            i22++;
                                            size2 = i11;
                                            i21 = i12;
                                        }
                                        kotlin.collections.d0.l(arrayList3, arrayList4);
                                        i21++;
                                    }
                                    if (arrayList3.size() < ((List) ((se) mVar.f1009c).f2799e).size()) {
                                        int size4 = ((List) ((se) mVar.f1009c).f2799e).size() - arrayList3.size();
                                        ArrayList arrayList5 = new ArrayList(size4);
                                        for (int i23 = 0; i23 < size4; i23++) {
                                            arrayList5.add(null);
                                        }
                                        arrayList3 = CollectionsKt.G(arrayList3, arrayList5);
                                    }
                                    mVar.f1010d = arrayList3;
                                    e0Var = new m2.e0(d0Var, mVar, I.f4019l);
                                    if (e0Var == null) {
                                        list.add(e0Var);
                                        e0Var2 = e0Var;
                                    } else {
                                        e0Var2 = null;
                                    }
                                    return Boolean.valueOf(e0Var2 == null);
                                }
                            }
                            e0Var = null;
                            if (e0Var == null) {
                            }
                            return Boolean.valueOf(e0Var2 == null);
                        case 1:
                            String str = ((m2.e) obj).f6454e;
                            h hVar4 = this.f4032e;
                            g gVar = hVar4.N;
                            if (gVar == null) {
                                g gVar2 = new g(hVar4.C, str);
                                d dVar = new d(str, hVar4.D, hVar4.E, hVar4.F, hVar4.G, hVar4.H, hVar4.I);
                                dVar.c(hVar4.I().f4017i);
                                gVar2.f4036d = dVar;
                                hVar4.N = gVar2;
                            } else if (!Intrinsics.a(str, gVar.f4034b)) {
                                gVar.f4034b = str;
                                d dVar2 = gVar.f4036d;
                                if (dVar2 != null) {
                                    dVar2.d(str, hVar4.D, hVar4.E, hVar4.F, hVar4.G, hVar4.H, hVar4.I);
                                }
                            }
                            c2.k.n(hVar4);
                            c2.k.m(hVar4);
                            c2.k.l(hVar4);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            h hVar5 = this.f4032e;
                            g gVar3 = hVar5.N;
                            if (gVar3 == null) {
                                z10 = false;
                            } else {
                                gVar3.f4035c = booleanValue;
                                c2.k.n(hVar5);
                                c2.k.m(hVar5);
                                c2.k.l(hVar5);
                                z10 = true;
                            }
                            return Boolean.valueOf(z10);
                    }
                }
            };
            this.M = r02;
            fVar2 = r02;
        }
        m2.e eVar = new m2.e(this.C);
        wd.y[] yVarArr = s.f5019a;
        uVar.b(q.A, x.c(eVar));
        g gVar = this.N;
        if (gVar != null) {
            boolean z10 = gVar.f4035c;
            t tVar = q.C;
            wd.y[] yVarArr2 = s.f5019a;
            wd.y yVar = yVarArr2[17];
            uVar.b(tVar, Boolean.valueOf(z10));
            m2.e eVar2 = new m2.e(gVar.f4034b);
            t tVar2 = q.B;
            wd.y yVar2 = yVarArr2[16];
            uVar.b(tVar2, eVar2);
        }
        final int i10 = 1;
        uVar.b(i.f4959k, new j2.a(null, new Function1(this) { // from class: f0.f

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ h f4032e;

            {
                this.f4032e = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0271  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0279  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x027b  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0276  */
            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                x2.c cVar;
                m2.e0 e0Var;
                m mVar;
                int i102;
                int i11;
                int i12;
                j1.c cVar2;
                m mVar2;
                int g;
                m2.e0 e0Var2;
                boolean z102;
                switch (i10) {
                    case 0:
                        List list = (List) obj;
                        h hVar = this.f4032e;
                        d I = hVar.I();
                        h0 c10 = h0.c(hVar.D, p.g, 0L, null, 0L, 0, 0L, 16777214);
                        x2.l lVar = I.f4022o;
                        if (lVar != null && (cVar = I.f4017i) != null) {
                            m2.e eVar3 = new m2.e(I.f4010a);
                            if (I.j != null && I.f4021n != null) {
                                long j = I.f4023p & (-8589934589L);
                                j0 j0Var = j0.f5574d;
                                int i13 = I.f4015f;
                                boolean z11 = I.f4014e;
                                int i14 = I.f4013d;
                                p2.h hVar2 = I.f4012c;
                                d0 d0Var = new d0(eVar3, c10, j0Var, i13, z11, i14, cVar, lVar, hVar2, j);
                                se seVar = new se(eVar3, c10, j0Var, cVar, hVar2);
                                int i15 = I.f4015f;
                                int i16 = I.f4013d;
                                m mVar3 = new m();
                                mVar3.f1009c = seVar;
                                mVar3.f1007a = i15;
                                if (x2.a.j(j) != 0 || x2.a.i(j) != 0) {
                                    r2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = (ArrayList) seVar.f2802s;
                                int size = arrayList2.size();
                                float f3 = 0.0f;
                                int i17 = 0;
                                int i18 = 0;
                                while (true) {
                                    if (i17 < size) {
                                        m2.n nVar = (m2.n) arrayList2.get(i17);
                                        t2.c cVar3 = nVar.f6498a;
                                        int h10 = x2.a.h(j);
                                        if (x2.a.c(j)) {
                                            mVar2 = mVar3;
                                            g = x2.a.g(j) - ((int) Math.ceil(f3));
                                            if (g < 0) {
                                                g = 0;
                                            }
                                        } else {
                                            mVar2 = mVar3;
                                            g = x2.a.g(j);
                                        }
                                        long b10 = x2.b.b(h10, g, 5);
                                        m mVar4 = mVar2;
                                        float f10 = f3;
                                        mVar = mVar4;
                                        int i19 = i17;
                                        m2.a aVar = new m2.a(cVar3, mVar4.f1007a - i18, i16, b10);
                                        float b11 = aVar.b() + f10;
                                        n2.h hVar3 = aVar.f6419d;
                                        int i20 = i18 + hVar3.f7012f;
                                        i102 = i20;
                                        arrayList.add(new m2.m(aVar, nVar.f6499b, nVar.f6500c, i18, i20, f10, b11));
                                        if (!hVar3.f7010d && (i102 != mVar.f1007a || i19 == y.e((ArrayList) ((se) mVar.f1009c).f2802s))) {
                                            i17 = i19 + 1;
                                            i18 = i102;
                                            f3 = b11;
                                            mVar3 = mVar;
                                        }
                                    } else {
                                        mVar = mVar3;
                                        i102 = i18;
                                    }
                                }
                                mVar.f1008b = i102;
                                mVar.f1011e = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList.size());
                                int size2 = arrayList.size();
                                int i21 = 0;
                                while (i21 < size2) {
                                    ?? r11 = ((m2.m) arrayList.get(i21)).f6492a.f6421f;
                                    ArrayList arrayList4 = new ArrayList(r11.size());
                                    int size3 = r11.size();
                                    int i22 = 0;
                                    while (i22 < size3) {
                                        j1.c cVar4 = (j1.c) r11.get(i22);
                                        if (cVar4 != null) {
                                            i11 = size2;
                                            i12 = i21;
                                            cVar2 = cVar4.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r10.f6497f) & 4294967295L));
                                        } else {
                                            i11 = size2;
                                            i12 = i21;
                                            cVar2 = null;
                                        }
                                        arrayList4.add(cVar2);
                                        i22++;
                                        size2 = i11;
                                        i21 = i12;
                                    }
                                    kotlin.collections.d0.l(arrayList3, arrayList4);
                                    i21++;
                                }
                                if (arrayList3.size() < ((List) ((se) mVar.f1009c).f2799e).size()) {
                                    int size4 = ((List) ((se) mVar.f1009c).f2799e).size() - arrayList3.size();
                                    ArrayList arrayList5 = new ArrayList(size4);
                                    for (int i23 = 0; i23 < size4; i23++) {
                                        arrayList5.add(null);
                                    }
                                    arrayList3 = CollectionsKt.G(arrayList3, arrayList5);
                                }
                                mVar.f1010d = arrayList3;
                                e0Var = new m2.e0(d0Var, mVar, I.f4019l);
                                if (e0Var == null) {
                                    list.add(e0Var);
                                    e0Var2 = e0Var;
                                } else {
                                    e0Var2 = null;
                                }
                                return Boolean.valueOf(e0Var2 == null);
                            }
                        }
                        e0Var = null;
                        if (e0Var == null) {
                        }
                        return Boolean.valueOf(e0Var2 == null);
                    case 1:
                        String str = ((m2.e) obj).f6454e;
                        h hVar4 = this.f4032e;
                        g gVar2 = hVar4.N;
                        if (gVar2 == null) {
                            g gVar22 = new g(hVar4.C, str);
                            d dVar = new d(str, hVar4.D, hVar4.E, hVar4.F, hVar4.G, hVar4.H, hVar4.I);
                            dVar.c(hVar4.I().f4017i);
                            gVar22.f4036d = dVar;
                            hVar4.N = gVar22;
                        } else if (!Intrinsics.a(str, gVar2.f4034b)) {
                            gVar2.f4034b = str;
                            d dVar2 = gVar2.f4036d;
                            if (dVar2 != null) {
                                dVar2.d(str, hVar4.D, hVar4.E, hVar4.F, hVar4.G, hVar4.H, hVar4.I);
                            }
                        }
                        c2.k.n(hVar4);
                        c2.k.m(hVar4);
                        c2.k.l(hVar4);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        h hVar5 = this.f4032e;
                        g gVar3 = hVar5.N;
                        if (gVar3 == null) {
                            z102 = false;
                        } else {
                            gVar3.f4035c = booleanValue;
                            c2.k.n(hVar5);
                            c2.k.m(hVar5);
                            c2.k.l(hVar5);
                            z102 = true;
                        }
                        return Boolean.valueOf(z102);
                }
            }
        }));
        final int i11 = 2;
        uVar.b(i.f4960l, new j2.a(null, new Function1(this) { // from class: f0.f

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ h f4032e;

            {
                this.f4032e = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0271  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0279  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x027b  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0276  */
            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                x2.c cVar;
                m2.e0 e0Var;
                m mVar;
                int i102;
                int i112;
                int i12;
                j1.c cVar2;
                m mVar2;
                int g;
                m2.e0 e0Var2;
                boolean z102;
                switch (i11) {
                    case 0:
                        List list = (List) obj;
                        h hVar = this.f4032e;
                        d I = hVar.I();
                        h0 c10 = h0.c(hVar.D, p.g, 0L, null, 0L, 0, 0L, 16777214);
                        x2.l lVar = I.f4022o;
                        if (lVar != null && (cVar = I.f4017i) != null) {
                            m2.e eVar3 = new m2.e(I.f4010a);
                            if (I.j != null && I.f4021n != null) {
                                long j = I.f4023p & (-8589934589L);
                                j0 j0Var = j0.f5574d;
                                int i13 = I.f4015f;
                                boolean z11 = I.f4014e;
                                int i14 = I.f4013d;
                                p2.h hVar2 = I.f4012c;
                                d0 d0Var = new d0(eVar3, c10, j0Var, i13, z11, i14, cVar, lVar, hVar2, j);
                                se seVar = new se(eVar3, c10, j0Var, cVar, hVar2);
                                int i15 = I.f4015f;
                                int i16 = I.f4013d;
                                m mVar3 = new m();
                                mVar3.f1009c = seVar;
                                mVar3.f1007a = i15;
                                if (x2.a.j(j) != 0 || x2.a.i(j) != 0) {
                                    r2.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = (ArrayList) seVar.f2802s;
                                int size = arrayList2.size();
                                float f3 = 0.0f;
                                int i17 = 0;
                                int i18 = 0;
                                while (true) {
                                    if (i17 < size) {
                                        m2.n nVar = (m2.n) arrayList2.get(i17);
                                        t2.c cVar3 = nVar.f6498a;
                                        int h10 = x2.a.h(j);
                                        if (x2.a.c(j)) {
                                            mVar2 = mVar3;
                                            g = x2.a.g(j) - ((int) Math.ceil(f3));
                                            if (g < 0) {
                                                g = 0;
                                            }
                                        } else {
                                            mVar2 = mVar3;
                                            g = x2.a.g(j);
                                        }
                                        long b10 = x2.b.b(h10, g, 5);
                                        m mVar4 = mVar2;
                                        float f10 = f3;
                                        mVar = mVar4;
                                        int i19 = i17;
                                        m2.a aVar = new m2.a(cVar3, mVar4.f1007a - i18, i16, b10);
                                        float b11 = aVar.b() + f10;
                                        n2.h hVar3 = aVar.f6419d;
                                        int i20 = i18 + hVar3.f7012f;
                                        i102 = i20;
                                        arrayList.add(new m2.m(aVar, nVar.f6499b, nVar.f6500c, i18, i20, f10, b11));
                                        if (!hVar3.f7010d && (i102 != mVar.f1007a || i19 == y.e((ArrayList) ((se) mVar.f1009c).f2802s))) {
                                            i17 = i19 + 1;
                                            i18 = i102;
                                            f3 = b11;
                                            mVar3 = mVar;
                                        }
                                    } else {
                                        mVar = mVar3;
                                        i102 = i18;
                                    }
                                }
                                mVar.f1008b = i102;
                                mVar.f1011e = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList.size());
                                int size2 = arrayList.size();
                                int i21 = 0;
                                while (i21 < size2) {
                                    ?? r11 = ((m2.m) arrayList.get(i21)).f6492a.f6421f;
                                    ArrayList arrayList4 = new ArrayList(r11.size());
                                    int size3 = r11.size();
                                    int i22 = 0;
                                    while (i22 < size3) {
                                        j1.c cVar4 = (j1.c) r11.get(i22);
                                        if (cVar4 != null) {
                                            i112 = size2;
                                            i12 = i21;
                                            cVar2 = cVar4.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r10.f6497f) & 4294967295L));
                                        } else {
                                            i112 = size2;
                                            i12 = i21;
                                            cVar2 = null;
                                        }
                                        arrayList4.add(cVar2);
                                        i22++;
                                        size2 = i112;
                                        i21 = i12;
                                    }
                                    kotlin.collections.d0.l(arrayList3, arrayList4);
                                    i21++;
                                }
                                if (arrayList3.size() < ((List) ((se) mVar.f1009c).f2799e).size()) {
                                    int size4 = ((List) ((se) mVar.f1009c).f2799e).size() - arrayList3.size();
                                    ArrayList arrayList5 = new ArrayList(size4);
                                    for (int i23 = 0; i23 < size4; i23++) {
                                        arrayList5.add(null);
                                    }
                                    arrayList3 = CollectionsKt.G(arrayList3, arrayList5);
                                }
                                mVar.f1010d = arrayList3;
                                e0Var = new m2.e0(d0Var, mVar, I.f4019l);
                                if (e0Var == null) {
                                    list.add(e0Var);
                                    e0Var2 = e0Var;
                                } else {
                                    e0Var2 = null;
                                }
                                return Boolean.valueOf(e0Var2 == null);
                            }
                        }
                        e0Var = null;
                        if (e0Var == null) {
                        }
                        return Boolean.valueOf(e0Var2 == null);
                    case 1:
                        String str = ((m2.e) obj).f6454e;
                        h hVar4 = this.f4032e;
                        g gVar2 = hVar4.N;
                        if (gVar2 == null) {
                            g gVar22 = new g(hVar4.C, str);
                            d dVar = new d(str, hVar4.D, hVar4.E, hVar4.F, hVar4.G, hVar4.H, hVar4.I);
                            dVar.c(hVar4.I().f4017i);
                            gVar22.f4036d = dVar;
                            hVar4.N = gVar22;
                        } else if (!Intrinsics.a(str, gVar2.f4034b)) {
                            gVar2.f4034b = str;
                            d dVar2 = gVar2.f4036d;
                            if (dVar2 != null) {
                                dVar2.d(str, hVar4.D, hVar4.E, hVar4.F, hVar4.G, hVar4.H, hVar4.I);
                            }
                        }
                        c2.k.n(hVar4);
                        c2.k.m(hVar4);
                        c2.k.l(hVar4);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        h hVar5 = this.f4032e;
                        g gVar3 = hVar5.N;
                        if (gVar3 == null) {
                            z102 = false;
                        } else {
                            gVar3.f4035c = booleanValue;
                            c2.k.n(hVar5);
                            c2.k.m(hVar5);
                            c2.k.l(hVar5);
                            z102 = true;
                        }
                        return Boolean.valueOf(z102);
                }
            }
        }));
        uVar.b(i.f4961m, new j2.a(null, new a1.b(9, this)));
        uVar.b(i.f4951a, new j2.a(null, fVar2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r1 != null) goto L19;
     */
    @Override // c2.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a2.h0 v(o0 o0Var, f0 f0Var, long j) {
        d I;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            if (J(1)) {
                h0 h0Var = this.L;
                if (h0Var == null) {
                    h0Var = this.D;
                }
                I().d(this.C, h0Var, this.E, this.F, this.G, this.H, this.I);
            }
            g gVar = this.N;
            if (gVar != null) {
                if (!gVar.f4035c) {
                    gVar = null;
                }
                if (gVar != null) {
                    I = gVar.f4036d;
                }
            }
            I = I();
            I.c(o0Var);
            boolean a9 = I.a(j, o0Var.getLayoutDirection());
            o oVar = I.f4021n;
            if (oVar != null) {
                oVar.b();
            }
            m2.a aVar = I.j;
            aVar.getClass();
            n2.h hVar = aVar.f6419d;
            long j3 = I.f4019l;
            if (a9) {
                c2.k.s(this, 2).K0();
                HashMap hashMap = this.J;
                if (hashMap == null) {
                    hashMap = new HashMap(2);
                    this.J = hashMap;
                }
                hashMap.put(a2.d.f73a, Integer.valueOf(Math.round(hVar.c(0))));
                hashMap.put(a2.d.f74b, Integer.valueOf(Math.round(hVar.c(hVar.f7012f - 1))));
            }
            int i3 = (int) (j3 >> 32);
            int i10 = (int) (4294967295L & j3);
            a2.o0 c10 = f0Var.c(k7.e.r(i3, i3, i10, i10));
            HashMap hashMap2 = this.J;
            hashMap2.getClass();
            a2.h0 x10 = o0Var.x(i3, i10, hashMap2, null, new j(c10, 3));
            Trace.endSection();
            return x10;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // d1.k
    public final boolean x() {
        return false;
    }
}
