package r0;

import E1.P;
import E1.X;
import T.C0097o;
import T.F;
import W.AbstractC0108a;
import W.J;
import Y.z;
import a.AbstractC0124a;
import a0.Q;
import d0.C0375b;
import d2.C0389g;
import e0.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q0.C1377t;
import q0.a0;
import q0.b0;
import q0.c0;
import q0.d0;
import t0.C1427b;
import v0.ExecutorC1449a;

/* renamed from: r0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1398i implements b0, d0, u0.i, u0.l {

    /* renamed from: a, reason: collision with root package name */
    public final int f15152a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f15153b;

    /* renamed from: c, reason: collision with root package name */
    public final C0097o[] f15154c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f15155d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1399j f15156e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15157f;

    /* renamed from: g, reason: collision with root package name */
    public final f0.e f15158g;

    /* renamed from: h, reason: collision with root package name */
    public final C1427b f15159h;

    /* renamed from: i, reason: collision with root package name */
    public final u0.n f15160i;

    /* renamed from: j, reason: collision with root package name */
    public final X f15161j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f15162k;

    /* renamed from: l, reason: collision with root package name */
    public final List f15163l;

    /* renamed from: m, reason: collision with root package name */
    public final a0 f15164m;
    public final a0[] n;
    public final C0389g o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC1395f f15165p;

    /* renamed from: q, reason: collision with root package name */
    public C0097o f15166q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC1397h f15167r;

    /* renamed from: s, reason: collision with root package name */
    public long f15168s;

    /* renamed from: t, reason: collision with root package name */
    public long f15169t;

    /* renamed from: u, reason: collision with root package name */
    public int f15170u;
    public AbstractC1390a v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f15171w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15172x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f15173y;

    public C1398i(int i4, int[] iArr, C0097o[] c0097oArr, InterfaceC1399j interfaceC1399j, c0 c0Var, B1.j jVar, long j4, f0.i iVar, f0.e eVar, C1427b c1427b, f0.e eVar2, boolean z, ExecutorC1449a executorC1449a) {
        this.f15152a = i4;
        int i5 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f15153b = iArr;
        this.f15154c = c0097oArr == null ? new C0097o[0] : c0097oArr;
        this.f15156e = interfaceC1399j;
        this.f15157f = c0Var;
        this.f15158g = eVar2;
        this.f15159h = c1427b;
        this.f15171w = z;
        this.f15160i = executorC1449a != null ? new u0.n(executorC1449a) : new u0.n("ChunkSampleStream");
        this.f15161j = new X();
        ArrayList arrayList = new ArrayList();
        this.f15162k = arrayList;
        this.f15163l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.n = new a0[length];
        this.f15155d = new boolean[length];
        int i6 = length + 1;
        int[] iArr2 = new int[i6];
        a0[] a0VarArr = new a0[i6];
        iVar.getClass();
        a0 a0Var = new a0(jVar, iVar, eVar);
        this.f15164m = a0Var;
        iArr2[0] = i4;
        a0VarArr[0] = a0Var;
        while (i5 < length) {
            a0 a0Var2 = new a0(jVar, null, null);
            this.n[i5] = a0Var2;
            int i7 = i5 + 1;
            a0VarArr[i7] = a0Var2;
            iArr2[i7] = this.f15153b[i5];
            i5 = i7;
        }
        this.o = new C0389g(iArr2, 14, a0VarArr);
        this.f15168s = j4;
        this.f15169t = j4;
    }

    public final int A(int i4, int i5) {
        ArrayList arrayList;
        do {
            i5++;
            arrayList = this.f15162k;
            if (i5 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((AbstractC1390a) arrayList.get(i5)).e(0) <= i4);
        return i5 - 1;
    }

    public final void B(C0375b c0375b) {
        this.f15167r = c0375b;
        a0 a0Var = this.f15164m;
        a0Var.k();
        t tVar = a0Var.f14966h;
        if (tVar != null) {
            tVar.H(a0Var.f14963e);
            a0Var.f14966h = null;
            a0Var.f14965g = null;
        }
        for (a0 a0Var2 : this.n) {
            a0Var2.k();
            t tVar2 = a0Var2.f14966h;
            if (tVar2 != null) {
                tVar2.H(a0Var2.f14963e);
                a0Var2.f14966h = null;
                a0Var2.f14965g = null;
            }
        }
        this.f15160i.e(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0036, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(long j4) {
        ArrayList arrayList;
        AbstractC1390a abstractC1390a;
        boolean G4;
        this.f15169t = j4;
        int i4 = 0;
        this.f15171w = false;
        if (y()) {
            this.f15168s = j4;
            return;
        }
        int i5 = 0;
        while (true) {
            arrayList = this.f15162k;
            if (i5 >= arrayList.size()) {
                break;
            }
            abstractC1390a = (AbstractC1390a) arrayList.get(i5);
            long j5 = abstractC1390a.f15144g;
            if (j5 == j4 && abstractC1390a.f15113k == -9223372036854775807L) {
                break;
            } else if (j5 > j4) {
                break;
            } else {
                i5++;
            }
        }
        a0 a0Var = this.f15164m;
        if (abstractC1390a != null) {
            G4 = a0Var.F(abstractC1390a.e(0));
        } else {
            long e4 = e();
            G4 = a0Var.G(j4, e4 == Long.MIN_VALUE || j4 < e4);
        }
        a0[] a0VarArr = this.n;
        if (G4) {
            this.f15170u = A(a0Var.t(), 0);
            int length = a0VarArr.length;
            while (i4 < length) {
                a0VarArr[i4].G(j4, true);
                i4++;
            }
            return;
        }
        this.f15168s = j4;
        this.f15173y = false;
        arrayList.clear();
        this.f15170u = 0;
        u0.n nVar = this.f15160i;
        if (nVar.d()) {
            a0Var.k();
            int length2 = a0VarArr.length;
            while (i4 < length2) {
                a0VarArr[i4].k();
                i4++;
            }
            nVar.b();
            return;
        }
        nVar.f15486c = null;
        a0Var.E(false);
        for (a0 a0Var2 : a0VarArr) {
            a0Var2.E(false);
        }
    }

    @Override // q0.b0
    public final void a() {
        u0.n nVar = this.f15160i;
        nVar.a();
        this.f15164m.z();
        if (nVar.d()) {
            return;
        }
        this.f15156e.a();
    }

    @Override // u0.l
    public final void c() {
        this.f15164m.D();
        for (a0 a0Var : this.n) {
            a0Var.D();
        }
        this.f15156e.release();
        InterfaceC1397h interfaceC1397h = this.f15167r;
        if (interfaceC1397h != null) {
            C0375b c0375b = (C0375b) interfaceC1397h;
            synchronized (c0375b) {
                d0.o oVar = (d0.o) c0375b.n.remove(this);
                if (oVar != null) {
                    oVar.f8192a.D();
                }
            }
        }
    }

    @Override // q0.d0
    public final long e() {
        if (y()) {
            return this.f15168s;
        }
        if (this.f15173y) {
            return Long.MIN_VALUE;
        }
        return s().f15145h;
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, q0.c0] */
    @Override // u0.i
    public final void g(u0.k kVar, long j4, long j5) {
        AbstractC1395f abstractC1395f = (AbstractC1395f) kVar;
        this.f15165p = null;
        this.f15156e.g(abstractC1395f);
        long j6 = abstractC1395f.f15138a;
        Y.k kVar2 = abstractC1395f.f15139b;
        z zVar = abstractC1395f.f15146i;
        C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        this.f15159h.getClass();
        this.f15158g.e(c1377t, abstractC1395f.f15140c, this.f15152a, abstractC1395f.f15141d, abstractC1395f.f15142e, abstractC1395f.f15143f, abstractC1395f.f15144g, abstractC1395f.f15145h);
        this.f15157f.s(this);
    }

    @Override // q0.b0
    public final boolean isReady() {
        return !y() && this.f15164m.x(this.f15173y);
    }

    public final void j(long j4) {
        long j5;
        if (y()) {
            return;
        }
        a0 a0Var = this.f15164m;
        int i4 = a0Var.f14973q;
        a0Var.j(j4, true);
        a0 a0Var2 = this.f15164m;
        int i5 = a0Var2.f14973q;
        if (i5 > i4) {
            synchronized (a0Var2) {
                j5 = a0Var2.f14972p == 0 ? Long.MIN_VALUE : a0Var2.n[a0Var2.f14974r];
            }
            int i6 = 0;
            while (true) {
                a0[] a0VarArr = this.n;
                if (i6 >= a0VarArr.length) {
                    break;
                }
                a0VarArr[i6].j(j5, this.f15155d[i6]);
                i6++;
            }
        }
        int min = Math.min(A(i5, 0), this.f15170u);
        if (min > 0) {
            J.R(this.f15162k, 0, min);
            this.f15170u -= min;
        }
    }

    @Override // q0.b0
    public final int k(long j4) {
        if (y()) {
            return 0;
        }
        boolean z = this.f15173y;
        a0 a0Var = this.f15164m;
        int v = a0Var.v(j4, z);
        AbstractC1390a abstractC1390a = this.v;
        if (abstractC1390a != null) {
            v = Math.min(v, abstractC1390a.e(0) - a0Var.t());
        }
        a0Var.H(v);
        z();
        return v;
    }

    @Override // q0.d0
    public final boolean l() {
        return this.f15160i.d();
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, q0.c0] */
    @Override // u0.i
    public final void m(u0.k kVar, long j4, long j5, boolean z) {
        AbstractC1395f abstractC1395f = (AbstractC1395f) kVar;
        this.f15165p = null;
        this.v = null;
        long j6 = abstractC1395f.f15138a;
        Y.k kVar2 = abstractC1395f.f15139b;
        z zVar = abstractC1395f.f15146i;
        C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        this.f15159h.getClass();
        this.f15158g.c(c1377t, abstractC1395f.f15140c, this.f15152a, abstractC1395f.f15141d, abstractC1395f.f15142e, abstractC1395f.f15143f, abstractC1395f.f15144g, abstractC1395f.f15145h);
        if (z) {
            return;
        }
        if (y()) {
            this.f15164m.E(false);
            for (a0 a0Var : this.n) {
                a0Var.E(false);
            }
        } else if (abstractC1395f instanceof AbstractC1390a) {
            ArrayList arrayList = this.f15162k;
            r(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f15168s = this.f15169t;
            }
        }
        this.f15157f.s(this);
    }

    @Override // q0.b0
    public final int n(l2.e eVar, Z.f fVar, int i4) {
        if (y()) {
            return -3;
        }
        AbstractC1390a abstractC1390a = this.v;
        a0 a0Var = this.f15164m;
        if (abstractC1390a != null && abstractC1390a.e(0) <= a0Var.t()) {
            return -3;
        }
        z();
        return a0Var.C(eVar, fVar, i4, this.f15173y);
    }

    @Override // u0.i
    public final void o(u0.k kVar, long j4, long j5, int i4) {
        C1377t c1377t;
        AbstractC1395f abstractC1395f = (AbstractC1395f) kVar;
        if (i4 == 0) {
            long j6 = abstractC1395f.f15138a;
            c1377t = new C1377t(abstractC1395f.f15139b, j4);
        } else {
            long j7 = abstractC1395f.f15138a;
            Y.k kVar2 = abstractC1395f.f15139b;
            z zVar = abstractC1395f.f15146i;
            c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        }
        this.f15158g.h(c1377t, abstractC1395f.f15140c, this.f15152a, abstractC1395f.f15141d, abstractC1395f.f15142e, abstractC1395f.f15143f, abstractC1395f.f15144g, abstractC1395f.f15145h, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, q0.c0] */
    @Override // u0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g1.e p(u0.k kVar, long j4, long j5, IOException iOException, int i4) {
        g1.e eVar;
        boolean a3;
        AbstractC1395f abstractC1395f = (AbstractC1395f) kVar;
        long j6 = abstractC1395f.f15146i.f3753b;
        boolean z = abstractC1395f instanceof AbstractC1390a;
        ArrayList arrayList = this.f15162k;
        int size = arrayList.size() - 1;
        boolean z4 = (j6 != 0 && z && x(size)) ? false : true;
        Y.k kVar2 = abstractC1395f.f15139b;
        z zVar = abstractC1395f.f15146i;
        boolean z5 = z4;
        C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, j6);
        J.Z(abstractC1395f.f15144g);
        J.Z(abstractC1395f.f15145h);
        P p2 = new P(i4, 9, iOException);
        InterfaceC1399j interfaceC1399j = this.f15156e;
        C1427b c1427b = this.f15159h;
        if (interfaceC1399j.f(abstractC1395f, z5, p2, c1427b)) {
            if (z5) {
                if (z) {
                    AbstractC0124a.t(r(size) == abstractC1395f);
                    if (arrayList.isEmpty()) {
                        this.f15168s = this.f15169t;
                    }
                }
                eVar = u0.n.f15482e;
                if (eVar == null) {
                    c1427b.getClass();
                    long h2 = C1427b.h(p2);
                    eVar = h2 != -9223372036854775807L ? new g1.e(0, h2, false) : u0.n.f15483f;
                }
                a3 = eVar.a();
                this.f15158g.f(c1377t, abstractC1395f.f15140c, this.f15152a, abstractC1395f.f15141d, abstractC1395f.f15142e, abstractC1395f.f15143f, abstractC1395f.f15144g, abstractC1395f.f15145h, iOException, !a3);
                if (!a3) {
                    this.f15165p = null;
                    c1427b.getClass();
                    this.f15157f.s(this);
                }
                return eVar;
            }
            AbstractC0108a.s("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
        }
        eVar = null;
        if (eVar == null) {
        }
        a3 = eVar.a();
        this.f15158g.f(c1377t, abstractC1395f.f15140c, this.f15152a, abstractC1395f.f15141d, abstractC1395f.f15142e, abstractC1395f.f15143f, abstractC1395f.f15144g, abstractC1395f.f15145h, iOException, !a3);
        if (!a3) {
        }
        return eVar;
    }

    public final AbstractC1390a r(int i4) {
        ArrayList arrayList = this.f15162k;
        AbstractC1390a abstractC1390a = (AbstractC1390a) arrayList.get(i4);
        J.R(arrayList, i4, arrayList.size());
        this.f15170u = Math.max(this.f15170u, arrayList.size());
        int i5 = 0;
        this.f15164m.n(abstractC1390a.e(0));
        while (true) {
            a0[] a0VarArr = this.n;
            if (i5 >= a0VarArr.length) {
                return abstractC1390a;
            }
            a0 a0Var = a0VarArr[i5];
            i5++;
            a0Var.n(abstractC1390a.e(i5));
        }
    }

    public final AbstractC1390a s() {
        return (AbstractC1390a) this.f15162k.get(r0.size() - 1);
    }

    @Override // q0.d0
    public final long u() {
        if (this.f15173y) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.f15168s;
        }
        long j4 = this.f15169t;
        AbstractC1390a s4 = s();
        if (!s4.b()) {
            ArrayList arrayList = this.f15162k;
            s4 = arrayList.size() > 1 ? (AbstractC1390a) arrayList.get(arrayList.size() - 2) : null;
        }
        if (s4 != null) {
            j4 = Math.max(j4, s4.f15145h);
        }
        return Math.max(j4, this.f15164m.q());
    }

    @Override // q0.d0
    public final boolean v(Q q4) {
        long j4;
        List list;
        if (!this.f15173y) {
            u0.n nVar = this.f15160i;
            if (!nVar.d() && !nVar.c()) {
                boolean y4 = y();
                if (y4) {
                    list = Collections.EMPTY_LIST;
                    j4 = this.f15168s;
                } else {
                    j4 = s().f15145h;
                    list = this.f15163l;
                }
                this.f15156e.d(q4, j4, list, this.f15161j);
                X x4 = this.f15161j;
                boolean z = x4.f555a;
                AbstractC1395f abstractC1395f = (AbstractC1395f) x4.f556b;
                x4.f556b = null;
                x4.f555a = false;
                if (z) {
                    this.f15168s = -9223372036854775807L;
                    this.f15173y = true;
                    return true;
                }
                if (abstractC1395f != null) {
                    this.f15165p = abstractC1395f;
                    boolean z4 = abstractC1395f instanceof AbstractC1390a;
                    C0389g c0389g = this.o;
                    if (z4) {
                        AbstractC1390a abstractC1390a = (AbstractC1390a) abstractC1395f;
                        if (y4) {
                            long j5 = abstractC1390a.f15144g;
                            long j6 = this.f15168s;
                            if (j5 < j6) {
                                this.f15164m.f14976t = j6;
                                for (a0 a0Var : this.n) {
                                    a0Var.f14976t = this.f15168s;
                                }
                                if (this.f15171w) {
                                    C0097o c0097o = abstractC1390a.f15141d;
                                    this.f15172x = !F.a(c0097o.n, c0097o.f2866k);
                                }
                            }
                            this.f15171w = false;
                            this.f15168s = -9223372036854775807L;
                        }
                        abstractC1390a.f15115m = c0389g;
                        a0[] a0VarArr = (a0[]) c0389g.f8265c;
                        int[] iArr = new int[a0VarArr.length];
                        for (int i4 = 0; i4 < a0VarArr.length; i4++) {
                            a0 a0Var2 = a0VarArr[i4];
                            iArr[i4] = a0Var2.f14973q + a0Var2.f14972p;
                        }
                        abstractC1390a.n = iArr;
                        this.f15162k.add(abstractC1390a);
                    } else if (abstractC1395f instanceof l) {
                        ((l) abstractC1395f).f15180k = c0389g;
                    }
                    nVar.f(abstractC1395f, this, this.f15159h.g(abstractC1395f.f15140c));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // q0.d0
    public final void w(long j4) {
        u0.n nVar = this.f15160i;
        if (nVar.c() || y()) {
            return;
        }
        boolean d4 = nVar.d();
        List list = this.f15163l;
        InterfaceC1399j interfaceC1399j = this.f15156e;
        ArrayList arrayList = this.f15162k;
        if (d4) {
            AbstractC1395f abstractC1395f = this.f15165p;
            abstractC1395f.getClass();
            boolean z = abstractC1395f instanceof AbstractC1390a;
            if (!(z && x(arrayList.size() - 1)) && interfaceC1399j.c(j4, abstractC1395f, list)) {
                nVar.b();
                if (z) {
                    this.v = (AbstractC1390a) abstractC1395f;
                    return;
                }
                return;
            }
            return;
        }
        int e4 = interfaceC1399j.e(list, j4);
        if (e4 < arrayList.size()) {
            AbstractC0124a.t(!nVar.d());
            int size = arrayList.size();
            while (true) {
                if (e4 >= size) {
                    e4 = -1;
                    break;
                } else if (!x(e4)) {
                    break;
                } else {
                    e4++;
                }
            }
            if (e4 == -1) {
                return;
            }
            long j5 = s().f15145h;
            AbstractC1390a r4 = r(e4);
            if (arrayList.isEmpty()) {
                this.f15168s = this.f15169t;
            }
            this.f15173y = false;
            this.f15158g.i(this.f15152a, r4.f15144g, j5);
        }
    }

    public final boolean x(int i4) {
        int t4;
        AbstractC1390a abstractC1390a = (AbstractC1390a) this.f15162k.get(i4);
        if (this.f15164m.t() > abstractC1390a.e(0)) {
            return true;
        }
        int i5 = 0;
        do {
            a0[] a0VarArr = this.n;
            if (i5 >= a0VarArr.length) {
                return false;
            }
            t4 = a0VarArr[i5].t();
            i5++;
        } while (t4 <= abstractC1390a.e(i5));
        return true;
    }

    public final boolean y() {
        return this.f15168s != -9223372036854775807L;
    }

    public final void z() {
        int A4 = A(this.f15164m.t(), this.f15170u - 1);
        while (true) {
            int i4 = this.f15170u;
            if (i4 > A4) {
                return;
            }
            this.f15170u = i4 + 1;
            AbstractC1390a abstractC1390a = (AbstractC1390a) this.f15162k.get(i4);
            C0097o c0097o = abstractC1390a.f15141d;
            if (!c0097o.equals(this.f15166q)) {
                this.f15158g.b(this.f15152a, c0097o, abstractC1390a.f15142e, abstractC1390a.f15143f, abstractC1390a.f15144g);
            }
            this.f15166q = c0097o;
        }
    }
}
