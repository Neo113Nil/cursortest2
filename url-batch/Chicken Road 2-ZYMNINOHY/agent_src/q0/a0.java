package q0;

import T.C0094l;
import T.C0096n;
import T.C0097o;
import T.InterfaceC0090h;
import W.AbstractC0108a;
import a.AbstractC0124a;
import a0.C0141g;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.Zo;
import java.io.EOFException;
import java.util.Objects;

/* loaded from: classes.dex */
public class a0 implements y0.F {

    /* renamed from: A, reason: collision with root package name */
    public C0097o f14952A;

    /* renamed from: B, reason: collision with root package name */
    public C0097o f14953B;

    /* renamed from: C, reason: collision with root package name */
    public long f14954C;

    /* renamed from: E, reason: collision with root package name */
    public boolean f14956E;

    /* renamed from: F, reason: collision with root package name */
    public long f14957F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f14958G;

    /* renamed from: a, reason: collision with root package name */
    public final X f14959a;

    /* renamed from: d, reason: collision with root package name */
    public final f0.i f14962d;

    /* renamed from: e, reason: collision with root package name */
    public final f0.e f14963e;

    /* renamed from: f, reason: collision with root package name */
    public Z f14964f;

    /* renamed from: g, reason: collision with root package name */
    public C0097o f14965g;

    /* renamed from: h, reason: collision with root package name */
    public e0.t f14966h;

    /* renamed from: p, reason: collision with root package name */
    public int f14972p;

    /* renamed from: q, reason: collision with root package name */
    public int f14973q;

    /* renamed from: r, reason: collision with root package name */
    public int f14974r;

    /* renamed from: s, reason: collision with root package name */
    public int f14975s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14978w;
    public boolean z;

    /* renamed from: b, reason: collision with root package name */
    public final J1.b f14960b = new J1.b();

    /* renamed from: i, reason: collision with root package name */
    public int f14967i = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;

    /* renamed from: j, reason: collision with root package name */
    public long[] f14968j = new long[AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT];

    /* renamed from: k, reason: collision with root package name */
    public long[] f14969k = new long[AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT];
    public long[] n = new long[AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT];

    /* renamed from: m, reason: collision with root package name */
    public int[] f14971m = new int[AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT];

    /* renamed from: l, reason: collision with root package name */
    public int[] f14970l = new int[AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT];
    public y0.E[] o = new y0.E[AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT];

    /* renamed from: c, reason: collision with root package name */
    public final L3.h f14961c = new L3.h(new Zo(9));

    /* renamed from: t, reason: collision with root package name */
    public long f14976t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f14977u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14980y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14979x = true;

    /* renamed from: D, reason: collision with root package name */
    public boolean f14955D = true;

    public a0(B1.j jVar, f0.i iVar, f0.e eVar) {
        this.f14962d = iVar;
        this.f14963e = eVar;
        this.f14959a = new X(jVar);
    }

    public final void A(C0097o c0097o, l2.e eVar) {
        C0097o c0097o2;
        C0097o c0097o3 = this.f14965g;
        boolean z = c0097o3 == null;
        C0094l c0094l = c0097o3 == null ? null : c0097o3.f2871r;
        this.f14965g = c0097o;
        C0094l c0094l2 = c0097o.f2871r;
        f0.i iVar = this.f14962d;
        if (iVar != null) {
            int d4 = iVar.d(c0097o);
            C0096n a3 = c0097o.a();
            a3.f2818N = d4;
            c0097o2 = new C0097o(a3);
        } else {
            c0097o2 = c0097o;
        }
        eVar.f14271c = c0097o2;
        eVar.f14270b = this.f14966h;
        if (iVar == null) {
            return;
        }
        if (z || !Objects.equals(c0094l, c0094l2)) {
            e0.t tVar = this.f14966h;
            f0.e eVar2 = this.f14963e;
            e0.t b4 = iVar.b(eVar2, c0097o);
            this.f14966h = b4;
            eVar.f14270b = b4;
            if (tVar != null) {
                tVar.H(eVar2);
            }
        }
    }

    public final synchronized long B() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.f14975s != this.f14972p ? this.f14968j[u(this.f14975s)] : this.f14954C;
    }

    public final int C(l2.e eVar, Z.f fVar, int i4, boolean z) {
        int i5;
        boolean z4 = (i4 & 2) != 0;
        J1.b bVar = this.f14960b;
        synchronized (this) {
            try {
                fVar.f3782f = false;
                i5 = -3;
                if (this.f14975s != this.f14972p) {
                    C0097o c0097o = ((Y) this.f14961c.b(t())).f14943a;
                    if (!z4 && c0097o == this.f14965g) {
                        int u4 = u(this.f14975s);
                        if (y(u4)) {
                            fVar.f3496b = this.f14971m[u4];
                            if (this.f14975s == this.f14972p - 1 && (z || this.f14978w)) {
                                fVar.a(536870912);
                            }
                            fVar.f3783g = this.n[u4];
                            bVar.f1156a = this.f14970l[u4];
                            bVar.f1157b = this.f14969k[u4];
                            bVar.f1158c = this.o[u4];
                            i5 = -4;
                        } else {
                            fVar.f3782f = true;
                        }
                    }
                    A(c0097o, eVar);
                    i5 = -5;
                } else {
                    if (!z && !this.f14978w) {
                        C0097o c0097o2 = this.f14953B;
                        if (c0097o2 == null || (!z4 && c0097o2 == this.f14965g)) {
                        }
                        A(c0097o2, eVar);
                        i5 = -5;
                    }
                    fVar.f3496b = 4;
                    fVar.f3783g = Long.MIN_VALUE;
                    i5 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i5 == -4 && !fVar.g(4)) {
            boolean z5 = (i4 & 1) != 0;
            if ((i4 & 4) == 0) {
                if (z5) {
                    X x4 = this.f14959a;
                    X.e(x4.f14940e, fVar, this.f14960b, x4.f14938c);
                } else {
                    X x5 = this.f14959a;
                    x5.f14940e = X.e(x5.f14940e, fVar, this.f14960b, x5.f14938c);
                }
            }
            if (!z5) {
                this.f14975s++;
            }
        }
        return i5;
    }

    public final void D() {
        E(true);
        e0.t tVar = this.f14966h;
        if (tVar != null) {
            tVar.H(this.f14963e);
            this.f14966h = null;
            this.f14965g = null;
        }
    }

    public final void E(boolean z) {
        X x4 = this.f14959a;
        S0.d dVar = x4.f14939d;
        if (((u0.a) dVar.f2409c) != null) {
            B1.j jVar = x4.f14936a;
            synchronized (jVar) {
                ((C0141g) jVar.f203d).f4125c.b(dVar);
                S0.d dVar2 = dVar;
                while (dVar2 != null) {
                    u0.a aVar = (u0.a) dVar2.f2409c;
                    aVar.getClass();
                    jVar.z(aVar);
                    dVar2 = (S0.d) dVar2.f2410d;
                    if (dVar2 == null || ((u0.a) dVar2.f2409c) == null) {
                        dVar2 = null;
                    }
                }
            }
            dVar.f2409c = null;
            dVar.f2410d = null;
        }
        S0.d dVar3 = x4.f14939d;
        int i4 = x4.f14937b;
        AbstractC0124a.t(((u0.a) dVar3.f2409c) == null);
        dVar3.f2407a = 0L;
        dVar3.f2408b = i4;
        S0.d dVar4 = x4.f14939d;
        x4.f14940e = dVar4;
        x4.f14941f = dVar4;
        x4.f14942g = 0L;
        B1.j jVar2 = x4.f14936a;
        synchronized (jVar2) {
            ((C0141g) jVar2.f203d).f4125c.d();
        }
        this.f14972p = 0;
        this.f14973q = 0;
        this.f14974r = 0;
        this.f14975s = 0;
        this.f14979x = true;
        this.f14976t = Long.MIN_VALUE;
        this.f14977u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.f14978w = false;
        L3.h hVar = this.f14961c;
        SparseArray sparseArray = (SparseArray) hVar.f1682d;
        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
            ((Zo) hVar.f1681c).accept(sparseArray.valueAt(i5));
        }
        hVar.f1680b = -1;
        sparseArray.clear();
        if (z) {
            this.f14952A = null;
            this.f14953B = null;
            this.f14980y = true;
            this.f14955D = true;
        }
    }

    public final synchronized boolean F(int i4) {
        synchronized (this) {
            this.f14975s = 0;
            X x4 = this.f14959a;
            x4.f14940e = x4.f14939d;
        }
        int i5 = this.f14973q;
        if (i4 >= i5 && i4 <= this.f14972p + i5) {
            this.f14976t = Long.MIN_VALUE;
            this.f14975s = i4 - i5;
            return true;
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    public final synchronized boolean G(long j4, boolean z) {
        Throwable th;
        a0 a0Var;
        long j5;
        int o;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f14975s = 0;
                        X x4 = this.f14959a;
                        x4.f14940e = x4.f14939d;
                        int u4 = u(0);
                        int i4 = this.f14975s;
                        int i5 = this.f14972p;
                        if (!(i4 != i5) || j4 < this.n[u4] || (j4 > this.v && !z)) {
                            return false;
                        }
                        if (this.f14955D) {
                            o = i5 - i4;
                            int i6 = 0;
                            while (true) {
                                if (i6 < o) {
                                    try {
                                        if (this.n[u4] >= j4) {
                                            o = i6;
                                            break;
                                        }
                                        u4++;
                                        if (u4 == this.f14967i) {
                                            u4 = 0;
                                        }
                                        i6++;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } else if (!z) {
                                    o = -1;
                                }
                            }
                            a0Var = this;
                            j5 = j4;
                        } else {
                            a0Var = this;
                            j5 = j4;
                            o = a0Var.o(j5, u4, i5 - i4, true);
                        }
                        if (o == -1) {
                            return false;
                        }
                        a0Var.f14976t = j5;
                        a0Var.f14975s += o;
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final synchronized void H(int i4) {
        boolean z;
        if (i4 >= 0) {
            try {
                if (this.f14975s + i4 <= this.f14972p) {
                    z = true;
                    AbstractC0124a.h(z);
                    this.f14975s += i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        AbstractC0124a.h(z);
        this.f14975s += i4;
    }

    @Override // y0.F
    public final void b(W.u uVar, int i4, int i5) {
        while (true) {
            X x4 = this.f14959a;
            if (i4 <= 0) {
                x4.getClass();
                return;
            }
            int b4 = x4.b(i4);
            S0.d dVar = x4.f14941f;
            u0.a aVar = (u0.a) dVar.f2409c;
            uVar.k(aVar.f15432a, ((int) (x4.f14942g - dVar.f2407a)) + aVar.f15433b, b4);
            i4 -= b4;
            long j4 = x4.f14942g + b4;
            x4.f14942g = j4;
            S0.d dVar2 = x4.f14941f;
            if (j4 == dVar2.f2408b) {
                x4.f14941f = (S0.d) dVar2.f2410d;
            }
        }
    }

    @Override // y0.F
    public final void d(C0097o c0097o) {
        C0097o p2 = p(c0097o);
        boolean z = false;
        this.z = false;
        this.f14952A = c0097o;
        synchronized (this) {
            try {
                this.f14980y = false;
                if (!Objects.equals(p2, this.f14953B)) {
                    if (!(((SparseArray) this.f14961c.f1682d).size() == 0)) {
                        SparseArray sparseArray = (SparseArray) this.f14961c.f1682d;
                        if (((Y) sparseArray.valueAt(sparseArray.size() - 1)).f14943a.equals(p2)) {
                            SparseArray sparseArray2 = (SparseArray) this.f14961c.f1682d;
                            this.f14953B = ((Y) sparseArray2.valueAt(sparseArray2.size() - 1)).f14943a;
                            boolean z4 = this.f14955D;
                            C0097o c0097o2 = this.f14953B;
                            this.f14955D = z4 & T.F.a(c0097o2.n, c0097o2.f2866k);
                            this.f14956E = false;
                            z = true;
                        }
                    }
                    this.f14953B = p2;
                    boolean z42 = this.f14955D;
                    C0097o c0097o22 = this.f14953B;
                    this.f14955D = z42 & T.F.a(c0097o22.n, c0097o22.f2866k);
                    this.f14956E = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Z z5 = this.f14964f;
        if (z5 == null || !z) {
            return;
        }
        z5.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x010a, code lost:
    
        if (((q0.Y) r10.valueAt(r10.size() - 1)).f14943a.equals(r9.f14953B) == false) goto L75;
     */
    @Override // y0.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(long j4, int i4, int i5, int i6, y0.E e4) {
        f0.h hVar;
        boolean z;
        if (this.z) {
            C0097o c0097o = this.f14952A;
            c0097o.getClass();
            d(c0097o);
        }
        int i7 = i4 & 1;
        boolean z4 = i7 != 0;
        if (this.f14979x) {
            if (!z4) {
                return;
            } else {
                this.f14979x = false;
            }
        }
        long j5 = j4 + this.f14957F;
        if (this.f14955D) {
            if (j5 < this.f14976t) {
                return;
            }
            if (i7 == 0) {
                if (!this.f14956E) {
                    AbstractC0108a.s("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f14953B);
                    this.f14956E = true;
                }
                i4 |= 1;
            }
        }
        if (this.f14958G) {
            if (!z4) {
                return;
            }
            synchronized (this) {
                if (this.f14972p == 0) {
                    z = j5 > this.f14977u;
                } else if (r() >= j5) {
                    z = false;
                } else {
                    m(this.f14973q + h(j5));
                    z = true;
                }
            }
            if (!z) {
                return;
            } else {
                this.f14958G = false;
            }
        }
        long j6 = (this.f14959a.f14942g - i5) - i6;
        synchronized (this) {
            try {
                int i8 = this.f14972p;
                if (i8 > 0) {
                    int u4 = u(i8 - 1);
                    AbstractC0124a.h(this.f14969k[u4] + ((long) this.f14970l[u4]) <= j6);
                }
                this.f14978w = (536870912 & i4) != 0;
                this.v = Math.max(this.v, j5);
                int u5 = u(this.f14972p);
                this.n[u5] = j5;
                this.f14969k[u5] = j6;
                this.f14970l[u5] = i5;
                this.f14971m[u5] = i4;
                this.o[u5] = e4;
                this.f14968j[u5] = this.f14954C;
                if (!(((SparseArray) this.f14961c.f1682d).size() == 0)) {
                    SparseArray sparseArray = (SparseArray) this.f14961c.f1682d;
                }
                C0097o c0097o2 = this.f14953B;
                c0097o2.getClass();
                f0.i iVar = this.f14962d;
                if (iVar != null) {
                    iVar.getClass();
                    hVar = f0.h.f8494a;
                } else {
                    hVar = f0.h.f8494a;
                }
                L3.h hVar2 = this.f14961c;
                int i9 = this.f14973q + this.f14972p;
                Y y4 = new Y(c0097o2, hVar);
                SparseArray sparseArray2 = (SparseArray) hVar2.f1682d;
                if (hVar2.f1680b == -1) {
                    AbstractC0124a.t(sparseArray2.size() == 0);
                    hVar2.f1680b = 0;
                }
                if (sparseArray2.size() > 0) {
                    int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                    AbstractC0124a.h(i9 >= keyAt);
                    if (keyAt == i9) {
                        ((Zo) hVar2.f1681c).accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                    }
                }
                sparseArray2.append(i9, y4);
                int i10 = this.f14972p + 1;
                this.f14972p = i10;
                int i11 = this.f14967i;
                if (i10 == i11) {
                    int i12 = i11 + AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
                    long[] jArr = new long[i12];
                    long[] jArr2 = new long[i12];
                    long[] jArr3 = new long[i12];
                    int[] iArr = new int[i12];
                    int[] iArr2 = new int[i12];
                    y0.E[] eArr = new y0.E[i12];
                    int i13 = this.f14974r;
                    int i14 = i11 - i13;
                    System.arraycopy(this.f14969k, i13, jArr2, 0, i14);
                    System.arraycopy(this.n, this.f14974r, jArr3, 0, i14);
                    System.arraycopy(this.f14971m, this.f14974r, iArr, 0, i14);
                    System.arraycopy(this.f14970l, this.f14974r, iArr2, 0, i14);
                    System.arraycopy(this.o, this.f14974r, eArr, 0, i14);
                    System.arraycopy(this.f14968j, this.f14974r, jArr, 0, i14);
                    int i15 = this.f14974r;
                    System.arraycopy(this.f14969k, 0, jArr2, i14, i15);
                    System.arraycopy(this.n, 0, jArr3, i14, i15);
                    System.arraycopy(this.f14971m, 0, iArr, i14, i15);
                    System.arraycopy(this.f14970l, 0, iArr2, i14, i15);
                    System.arraycopy(this.o, 0, eArr, i14, i15);
                    System.arraycopy(this.f14968j, 0, jArr, i14, i15);
                    this.f14969k = jArr2;
                    this.n = jArr3;
                    this.f14971m = iArr;
                    this.f14970l = iArr2;
                    this.o = eArr;
                    this.f14968j = jArr;
                    this.f14974r = 0;
                    this.f14967i = i12;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y0.F
    public final int f(InterfaceC0090h interfaceC0090h, int i4, boolean z) {
        X x4 = this.f14959a;
        int b4 = x4.b(i4);
        S0.d dVar = x4.f14941f;
        u0.a aVar = (u0.a) dVar.f2409c;
        int read = interfaceC0090h.read(aVar.f15432a, ((int) (x4.f14942g - dVar.f2407a)) + aVar.f15433b, b4);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j4 = x4.f14942g + read;
        x4.f14942g = j4;
        S0.d dVar2 = x4.f14941f;
        if (j4 == dVar2.f2408b) {
            x4.f14941f = (S0.d) dVar2.f2410d;
        }
        return read;
    }

    public final int h(long j4) {
        int i4 = this.f14972p;
        int u4 = u(i4 - 1);
        while (i4 > this.f14975s && this.n[u4] >= j4) {
            i4--;
            u4--;
            if (u4 == -1) {
                u4 = this.f14967i - 1;
            }
        }
        return i4;
    }

    public final long i(int i4) {
        this.f14977u = Math.max(this.f14977u, s(i4));
        this.f14972p -= i4;
        int i5 = this.f14973q + i4;
        this.f14973q = i5;
        int i6 = this.f14974r + i4;
        this.f14974r = i6;
        int i7 = this.f14967i;
        if (i6 >= i7) {
            this.f14974r = i6 - i7;
        }
        int i8 = this.f14975s - i4;
        this.f14975s = i8;
        int i9 = 0;
        if (i8 < 0) {
            this.f14975s = 0;
        }
        L3.h hVar = this.f14961c;
        SparseArray sparseArray = (SparseArray) hVar.f1682d;
        while (i9 < sparseArray.size() - 1) {
            int i10 = i9 + 1;
            if (i5 < sparseArray.keyAt(i10)) {
                break;
            }
            ((Zo) hVar.f1681c).accept(sparseArray.valueAt(i9));
            sparseArray.removeAt(i9);
            int i11 = hVar.f1680b;
            if (i11 > 0) {
                hVar.f1680b = i11 - 1;
            }
            i9 = i10;
        }
        if (this.f14972p != 0) {
            return this.f14969k[this.f14974r];
        }
        int i12 = this.f14974r;
        if (i12 == 0) {
            i12 = this.f14967i;
        }
        return this.f14969k[i12 - 1] + this.f14970l[r7];
    }

    public final void j(long j4, boolean z) {
        Throwable th;
        X x4 = this.f14959a;
        synchronized (this) {
            try {
                try {
                    int i4 = this.f14972p;
                    long j5 = -1;
                    if (i4 != 0) {
                        long[] jArr = this.n;
                        int i5 = this.f14974r;
                        if (j4 >= jArr[i5]) {
                            if (z) {
                                try {
                                    int i6 = this.f14975s;
                                    if (i6 != i4) {
                                        i4 = i6 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int o = o(j4, i5, i4, false);
                            if (o != -1) {
                                j5 = i(o);
                            }
                            x4.a(j5);
                        }
                    }
                    x4.a(j5);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final void k() {
        long i4;
        X x4 = this.f14959a;
        synchronized (this) {
            int i5 = this.f14972p;
            i4 = i5 == 0 ? -1L : i(i5);
        }
        x4.a(i4);
    }

    public final void l(long j4) {
        if (this.f14972p == 0) {
            return;
        }
        AbstractC0124a.h(j4 > r());
        n(this.f14973q + h(j4));
    }

    public final long m(int i4) {
        int i5 = this.f14973q;
        int i6 = this.f14972p;
        int i7 = (i5 + i6) - i4;
        boolean z = false;
        AbstractC0124a.h(i7 >= 0 && i7 <= i6 - this.f14975s);
        int i8 = this.f14972p - i7;
        this.f14972p = i8;
        this.v = Math.max(this.f14977u, s(i8));
        if (i7 == 0 && this.f14978w) {
            z = true;
        }
        this.f14978w = z;
        L3.h hVar = this.f14961c;
        SparseArray sparseArray = (SparseArray) hVar.f1682d;
        for (int size = sparseArray.size() - 1; size >= 0 && i4 < sparseArray.keyAt(size); size--) {
            ((Zo) hVar.f1681c).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        hVar.f1680b = sparseArray.size() > 0 ? Math.min(hVar.f1680b, sparseArray.size() - 1) : -1;
        int i9 = this.f14972p;
        if (i9 == 0) {
            return 0L;
        }
        return this.f14969k[u(i9 - 1)] + this.f14970l[r9];
    }

    public final void n(int i4) {
        X x4 = this.f14959a;
        long m4 = m(i4);
        int i5 = x4.f14937b;
        AbstractC0124a.h(m4 <= x4.f14942g);
        x4.f14942g = m4;
        if (m4 != 0) {
            S0.d dVar = x4.f14939d;
            if (m4 != dVar.f2407a) {
                while (x4.f14942g > dVar.f2408b) {
                    dVar = (S0.d) dVar.f2410d;
                }
                S0.d dVar2 = (S0.d) dVar.f2410d;
                dVar2.getClass();
                if (((u0.a) dVar2.f2409c) != null) {
                    B1.j jVar = x4.f14936a;
                    synchronized (jVar) {
                        ((C0141g) jVar.f203d).f4125c.b(dVar2);
                        S0.d dVar3 = dVar2;
                        while (dVar3 != null) {
                            u0.a aVar = (u0.a) dVar3.f2409c;
                            aVar.getClass();
                            jVar.z(aVar);
                            dVar3 = (S0.d) dVar3.f2410d;
                            if (dVar3 == null || ((u0.a) dVar3.f2409c) == null) {
                                dVar3 = null;
                            }
                        }
                    }
                    dVar2.f2409c = null;
                    dVar2.f2410d = null;
                }
                S0.d dVar4 = new S0.d(dVar.f2408b, i5);
                dVar.f2410d = dVar4;
                if (x4.f14942g == dVar.f2408b) {
                    dVar = dVar4;
                }
                x4.f14941f = dVar;
                if (x4.f14940e == dVar2) {
                    x4.f14940e = dVar4;
                    return;
                }
                return;
            }
        }
        S0.d dVar5 = x4.f14939d;
        if (((u0.a) dVar5.f2409c) != null) {
            B1.j jVar2 = x4.f14936a;
            synchronized (jVar2) {
                ((C0141g) jVar2.f203d).f4125c.b(dVar5);
                S0.d dVar6 = dVar5;
                while (dVar6 != null) {
                    u0.a aVar2 = (u0.a) dVar6.f2409c;
                    aVar2.getClass();
                    jVar2.z(aVar2);
                    dVar6 = (S0.d) dVar6.f2410d;
                    if (dVar6 == null || ((u0.a) dVar6.f2409c) == null) {
                        dVar6 = null;
                    }
                }
            }
            dVar5.f2409c = null;
            dVar5.f2410d = null;
        }
        S0.d dVar7 = new S0.d(x4.f14942g, i5);
        x4.f14939d = dVar7;
        x4.f14940e = dVar7;
        x4.f14941f = dVar7;
    }

    public final int o(long j4, int i4, int i5, boolean z) {
        int i6 = -1;
        for (int i7 = 0; i7 < i5; i7++) {
            long j5 = this.n[i4];
            if (j5 > j4) {
                break;
            }
            if (!z || (this.f14971m[i4] & 1) != 0) {
                if (j5 == j4) {
                    return i7;
                }
                i6 = i7;
            }
            i4++;
            if (i4 == this.f14967i) {
                i4 = 0;
            }
        }
        return i6;
    }

    public C0097o p(C0097o c0097o) {
        if (this.f14957F == 0 || c0097o.f2872s == Long.MAX_VALUE) {
            return c0097o;
        }
        C0096n a3 = c0097o.a();
        a3.f2834r = c0097o.f2872s + this.f14957F;
        return new C0097o(a3);
    }

    public final synchronized long q() {
        return this.v;
    }

    public final synchronized long r() {
        return Math.max(this.f14977u, s(this.f14975s));
    }

    public final long s(int i4) {
        long j4 = Long.MIN_VALUE;
        if (i4 == 0) {
            return Long.MIN_VALUE;
        }
        int u4 = u(i4 - 1);
        for (int i5 = 0; i5 < i4; i5++) {
            j4 = Math.max(j4, this.n[u4]);
            if ((this.f14971m[u4] & 1) != 0) {
                return j4;
            }
            u4--;
            if (u4 == -1) {
                u4 = this.f14967i - 1;
            }
        }
        return j4;
    }

    public final int t() {
        return this.f14973q + this.f14975s;
    }

    public final int u(int i4) {
        int i5 = this.f14974r + i4;
        int i6 = this.f14967i;
        return i5 < i6 ? i5 : i5 - i6;
    }

    public final synchronized int v(long j4, boolean z) {
        try {
            try {
                int u4 = u(this.f14975s);
                int i4 = this.f14975s;
                int i5 = this.f14972p;
                if (!(i4 != i5) || j4 < this.n[u4]) {
                    return 0;
                }
                if (j4 > this.v && z) {
                    return i5 - i4;
                }
                int o = o(j4, u4, i5 - i4, true);
                if (o == -1) {
                    return 0;
                }
                return o;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized C0097o w() {
        return this.f14980y ? null : this.f14953B;
    }

    public final synchronized boolean x(boolean z) {
        C0097o c0097o;
        boolean z4 = false;
        if (this.f14975s != this.f14972p) {
            if (((Y) this.f14961c.b(t())).f14943a != this.f14965g) {
                return true;
            }
            return y(u(this.f14975s));
        }
        if (z || this.f14978w || ((c0097o = this.f14953B) != null && c0097o != this.f14965g)) {
            z4 = true;
        }
        return z4;
    }

    public final boolean y(int i4) {
        e0.t tVar = this.f14966h;
        if (tVar == null || tVar.F() == 4) {
            return true;
        }
        if ((this.f14971m[i4] & 1073741824) != 0) {
            return false;
        }
        this.f14966h.getClass();
        return false;
    }

    public final void z() {
        e0.t tVar = this.f14966h;
        if (tVar == null || tVar.F() != 1) {
            return;
        }
        f0.c z = this.f14966h.z();
        z.getClass();
        throw z;
    }
}
