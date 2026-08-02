package g0;

import T.C0094l;
import T.C0096n;
import T.C0097o;
import T.E;
import T.F;
import T.U;
import W.AbstractC0108a;
import W.G;
import W.J;
import Y.z;
import a.AbstractC0124a;
import a0.P;
import a0.Q;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import h0.C0446b;
import h0.C0447c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import q0.C1360b;
import q0.C1377t;
import q0.Z;
import q0.d0;
import q0.j0;
import r0.AbstractC1395f;
import t0.C1427b;
import v0.ExecutorC1449a;
import v2.I;
import v2.a0;
import y0.y;

/* loaded from: classes.dex */
public final class s implements u0.i, u0.l, d0, y0.p, Z {

    /* renamed from: Y, reason: collision with root package name */
    public static final Set f8933Y = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A, reason: collision with root package name */
    public int f8934A;

    /* renamed from: B, reason: collision with root package name */
    public int f8935B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f8936C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f8937D;

    /* renamed from: E, reason: collision with root package name */
    public int f8938E;

    /* renamed from: F, reason: collision with root package name */
    public C0097o f8939F;

    /* renamed from: G, reason: collision with root package name */
    public C0097o f8940G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f8941H;

    /* renamed from: I, reason: collision with root package name */
    public j0 f8942I;

    /* renamed from: J, reason: collision with root package name */
    public Set f8943J;

    /* renamed from: K, reason: collision with root package name */
    public int[] f8944K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f8945M;

    /* renamed from: N, reason: collision with root package name */
    public boolean[] f8946N;

    /* renamed from: O, reason: collision with root package name */
    public boolean[] f8947O;

    /* renamed from: P, reason: collision with root package name */
    public long f8948P;

    /* renamed from: Q, reason: collision with root package name */
    public long f8949Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f8950R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f8951S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f8952T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f8953U;

    /* renamed from: V, reason: collision with root package name */
    public long f8954V;

    /* renamed from: W, reason: collision with root package name */
    public C0094l f8955W;

    /* renamed from: X, reason: collision with root package name */
    public k f8956X;

    /* renamed from: a, reason: collision with root package name */
    public final String f8957a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8958b;

    /* renamed from: c, reason: collision with root package name */
    public final e0.t f8959c;

    /* renamed from: d, reason: collision with root package name */
    public final j f8960d;

    /* renamed from: e, reason: collision with root package name */
    public final B1.j f8961e;

    /* renamed from: f, reason: collision with root package name */
    public final C0097o f8962f;

    /* renamed from: g, reason: collision with root package name */
    public final f0.i f8963g;

    /* renamed from: h, reason: collision with root package name */
    public final f0.e f8964h;

    /* renamed from: i, reason: collision with root package name */
    public final C1427b f8965i;

    /* renamed from: j, reason: collision with root package name */
    public final u0.n f8966j;

    /* renamed from: k, reason: collision with root package name */
    public final f0.e f8967k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8968l;

    /* renamed from: m, reason: collision with root package name */
    public final f f8969m;
    public final ArrayList n;
    public final List o;

    /* renamed from: p, reason: collision with root package name */
    public final o f8970p;

    /* renamed from: q, reason: collision with root package name */
    public final o f8971q;

    /* renamed from: r, reason: collision with root package name */
    public final Handler f8972r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f8973s;

    /* renamed from: t, reason: collision with root package name */
    public final Map f8974t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC1395f f8975u;
    public r[] v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f8976w;

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f8977x;

    /* renamed from: y, reason: collision with root package name */
    public final SparseIntArray f8978y;
    public q z;

    /* JADX WARN: Type inference failed for: r2v13, types: [g0.o] */
    /* JADX WARN: Type inference failed for: r2v14, types: [g0.o] */
    public s(String str, int i4, e0.t tVar, j jVar, Map map, B1.j jVar2, long j4, C0097o c0097o, f0.i iVar, f0.e eVar, C1427b c1427b, f0.e eVar2, int i5, ExecutorC1449a executorC1449a) {
        this.f8957a = str;
        this.f8958b = i4;
        this.f8959c = tVar;
        this.f8960d = jVar;
        this.f8974t = map;
        this.f8961e = jVar2;
        this.f8962f = c0097o;
        this.f8963g = iVar;
        this.f8964h = eVar;
        this.f8965i = c1427b;
        this.f8967k = eVar2;
        this.f8968l = i5;
        this.f8966j = executorC1449a != null ? new u0.n(executorC1449a) : new u0.n("Loader:HlsSampleStreamWrapper");
        f fVar = new f();
        fVar.f8836b = null;
        final int i6 = 0;
        fVar.f8835a = false;
        fVar.f8837c = null;
        this.f8969m = fVar;
        this.f8976w = new int[0];
        Set set = f8933Y;
        this.f8977x = new HashSet(set.size());
        this.f8978y = new SparseIntArray(set.size());
        this.v = new r[0];
        this.f8947O = new boolean[0];
        this.f8946N = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        this.o = Collections.unmodifiableList(arrayList);
        this.f8973s = new ArrayList();
        this.f8970p = new Runnable(this) { // from class: g0.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f8920b;

            {
                this.f8920b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i6) {
                    case 0:
                        this.f8920b.F();
                        break;
                    default:
                        s sVar = this.f8920b;
                        sVar.f8936C = true;
                        sVar.F();
                        break;
                }
            }
        };
        final int i7 = 1;
        this.f8971q = new Runnable(this) { // from class: g0.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f8920b;

            {
                this.f8920b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.f8920b.F();
                        break;
                    default:
                        s sVar = this.f8920b;
                        sVar.f8936C = true;
                        sVar.F();
                        break;
                }
            }
        };
        this.f8972r = J.o(null);
        this.f8948P = j4;
        this.f8949Q = j4;
    }

    public static C0097o A(C0097o c0097o, C0097o c0097o2, boolean z) {
        String b4;
        if (c0097o == null) {
            return c0097o2;
        }
        String str = c0097o.f2866k;
        String str2 = c0097o2.n;
        int h2 = F.h(str2);
        if (J.u(h2, str) == 1) {
            b4 = J.v(h2, str);
            str2 = F.d(b4);
        } else {
            b4 = F.b(str, str2);
        }
        C0096n a3 = c0097o2.a();
        a3.f2819a = c0097o.f2856a;
        a3.f2820b = c0097o.f2857b;
        a3.f2821c = I.k(c0097o.f2858c);
        a3.f2822d = c0097o.f2859d;
        a3.f2823e = c0097o.f2860e;
        a3.f2824f = c0097o.f2861f;
        a3.f2826h = z ? c0097o.f2863h : -1;
        a3.f2827i = z ? c0097o.f2864i : -1;
        a3.f2828j = b4;
        if (h2 == 2) {
            a3.f2836t = c0097o.f2874u;
            a3.f2837u = c0097o.v;
            a3.f2839x = c0097o.f2877y;
        }
        if (str2 != null) {
            a3.f2831m = F.n(str2);
        }
        int i4 = c0097o.f2846F;
        if (i4 != -1 && h2 == 1) {
            a3.f2810E = i4;
        }
        E e4 = c0097o.f2867l;
        if (e4 != null) {
            E e5 = c0097o2.f2867l;
            if (e5 != null) {
                e4 = e5.b(e4);
            }
            a3.f2829k = e4;
        }
        return new C0097o(a3);
    }

    public static int D(int i4) {
        if (i4 == 1) {
            return 2;
        }
        if (i4 != 2) {
            return i4 != 3 ? 0 : 1;
        }
        return 3;
    }

    public static y0.m s(int i4, int i5) {
        AbstractC0108a.s("HlsSampleStreamWrapper", "Unmapped track with id " + i4 + " of type " + i5);
        return new y0.m();
    }

    public final void B(int i4) {
        ArrayList arrayList;
        AbstractC0124a.t(!this.f8966j.d());
        while (true) {
            arrayList = this.n;
            if (i4 >= arrayList.size()) {
                i4 = -1;
                break;
            } else if (n(i4)) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 == -1) {
            return;
        }
        long j4 = C().f15145h;
        k kVar = (k) arrayList.get(i4);
        J.R(arrayList, i4, arrayList.size());
        for (int i5 = 0; i5 < this.v.length; i5++) {
            this.v[i5].n(kVar.g(i5));
        }
        if (arrayList.isEmpty()) {
            this.f8949Q = this.f8948P;
        } else {
            ((k) v2.r.j(arrayList)).f8872J = true;
        }
        this.f8952T = false;
        this.f8967k.i(this.f8934A, kVar.f15144g, j4);
    }

    public final k C() {
        return (k) this.n.get(r0.size() - 1);
    }

    public final boolean E() {
        return this.f8949Q != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        int i4;
        if (!this.f8941H && this.f8944K == null && this.f8936C) {
            int i5 = 0;
            for (r rVar : this.v) {
                if (rVar.w() == null) {
                    return;
                }
            }
            j0 j0Var = this.f8942I;
            if (j0Var != null) {
                int i6 = j0Var.f15034a;
                int[] iArr = new int[i6];
                this.f8944K = iArr;
                Arrays.fill(iArr, -1);
                for (int i7 = 0; i7 < i6; i7++) {
                    int i8 = 0;
                    while (true) {
                        r[] rVarArr = this.v;
                        if (i8 < rVarArr.length) {
                            C0097o w4 = rVarArr[i8].w();
                            w4.getClass();
                            C0097o c0097o = this.f8942I.a(i7).f2708d[0];
                            String str = w4.n;
                            String str2 = c0097o.n;
                            int h2 = F.h(str);
                            if (h2 == 3) {
                                if (Objects.equals(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || w4.f2851K == c0097o.f2851K) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i8++;
                            } else if (h2 == F.h(str2)) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                    this.f8944K[i7] = i8;
                }
                ArrayList arrayList = this.f8973s;
                int size = arrayList.size();
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    ((n) obj).b();
                }
                return;
            }
            int length = this.v.length;
            int i9 = 0;
            int i10 = -1;
            int i11 = -2;
            while (true) {
                int i12 = 1;
                if (i9 >= length) {
                    break;
                }
                C0097o w5 = this.v[i9].w();
                w5.getClass();
                String str3 = w5.n;
                if (F.m(str3)) {
                    i12 = 2;
                } else if (!F.i(str3)) {
                    i12 = F.l(str3) ? 3 : -2;
                }
                if (D(i12) > D(i11)) {
                    i10 = i9;
                    i11 = i12;
                } else if (i12 == i11 && i10 != -1) {
                    i10 = -1;
                }
                i9++;
            }
            U u4 = this.f8960d.f8852h;
            int i13 = u4.f2705a;
            this.L = -1;
            this.f8944K = new int[length];
            for (int i14 = 0; i14 < length; i14++) {
                this.f8944K[i14] = i14;
            }
            U[] uArr = new U[length];
            int i15 = 0;
            while (i15 < length) {
                C0097o w6 = this.v[i15].w();
                w6.getClass();
                String str4 = this.f8957a;
                C0097o c0097o2 = this.f8962f;
                if (i15 == i10) {
                    C0097o[] c0097oArr = new C0097o[i13];
                    for (int i16 = i5; i16 < i13; i16++) {
                        C0097o c0097o3 = u4.f2708d[i16];
                        if (i11 == 1 && c0097o2 != null) {
                            c0097o3 = c0097o3.d(c0097o2);
                        }
                        c0097oArr[i16] = i13 == 1 ? w6.d(c0097o3) : A(c0097o3, w6, true);
                    }
                    uArr[i15] = new U(str4, c0097oArr);
                    this.L = i15;
                    i4 = 0;
                } else {
                    if (i11 != 2 || !F.i(w6.n)) {
                        c0097o2 = null;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(":muxed:");
                    sb.append(i15 < i10 ? i15 : i15 - 1);
                    i4 = 0;
                    uArr[i15] = new U(sb.toString(), A(c0097o2, w6, false));
                }
                i15++;
                i5 = i4;
            }
            int i17 = i5;
            this.f8942I = y(uArr);
            AbstractC0124a.t(this.f8943J == null ? 1 : i17);
            this.f8943J = Collections.EMPTY_SET;
            this.f8937D = true;
            this.f8959c.G();
        }
    }

    public final void G() {
        this.f8966j.a();
        j jVar = this.f8960d;
        C1360b c1360b = jVar.n;
        if (c1360b != null) {
            throw c1360b;
        }
        Uri uri = jVar.o;
        if (uri == null || !uri.equals(jVar.f8858p)) {
            return;
        }
        C0447c c0447c = jVar.f8851g;
        C0446b c0446b = (C0446b) c0447c.f9057d.get(jVar.o);
        c0446b.f9043b.a();
        IOException iOException = c0446b.f9051j;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void H(U[] uArr, int... iArr) {
        this.f8942I = y(uArr);
        this.f8943J = new HashSet();
        for (int i4 : iArr) {
            this.f8943J.add(this.f8942I.a(i4));
        }
        this.L = 0;
        this.f8972r.post(new R1.n(26, this.f8959c));
        this.f8937D = true;
    }

    public final void I() {
        for (r rVar : this.v) {
            rVar.E(this.f8950R);
        }
        this.f8950R = false;
    }

    public final boolean J(long j4, boolean z) {
        k kVar;
        boolean z4;
        boolean G4;
        this.f8948P = j4;
        if (E()) {
            this.f8949Q = j4;
            return true;
        }
        boolean z5 = this.f8960d.f8859q;
        ArrayList arrayList = this.n;
        if (z5) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                kVar = (k) arrayList.get(i4);
                if (kVar.f15144g == j4) {
                    break;
                }
            }
        }
        kVar = null;
        if (this.f8936C && !z && !arrayList.isEmpty()) {
            int length = this.v.length;
            for (int i5 = 0; i5 < length; i5++) {
                r rVar = this.v[i5];
                if (kVar != null) {
                    G4 = rVar.F(kVar.g(i5));
                } else {
                    long e4 = e();
                    G4 = rVar.G(j4, e4 == Long.MIN_VALUE || j4 < e4);
                }
                if (!G4 && (this.f8947O[i5] || !this.f8945M)) {
                    z4 = false;
                    break;
                }
            }
            z4 = true;
            if (z4) {
                return false;
            }
        }
        this.f8949Q = j4;
        this.f8952T = false;
        arrayList.clear();
        u0.n nVar = this.f8966j;
        if (!nVar.d()) {
            nVar.f15486c = null;
            I();
            return true;
        }
        if (this.f8936C) {
            for (r rVar2 : this.v) {
                rVar2.k();
            }
        }
        nVar.b();
        return true;
    }

    @Override // q0.Z
    public final void a() {
        this.f8972r.post(this.f8970p);
    }

    @Override // u0.l
    public final void c() {
        for (r rVar : this.v) {
            rVar.D();
        }
    }

    @Override // q0.d0
    public final long e() {
        if (E()) {
            return this.f8949Q;
        }
        if (this.f8952T) {
            return Long.MIN_VALUE;
        }
        return C().f15145h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u0.i
    public final void g(u0.k kVar, long j4, long j5) {
        AbstractC1395f abstractC1395f = (AbstractC1395f) kVar;
        this.f8975u = null;
        if (abstractC1395f instanceof e) {
            e eVar = (e) abstractC1395f;
            byte[] bArr = eVar.f8832j;
            j jVar = this.f8960d;
            jVar.f8857m = bArr;
            e0.t tVar = jVar.f8854j;
            Uri uri = eVar.f15139b.f3701a;
            byte[] bArr2 = eVar.f8834l;
            bArr2.getClass();
            C0436d c0436d = (C0436d) tVar.f8416a;
            uri.getClass();
        }
        long j6 = abstractC1395f.f15138a;
        Y.k kVar2 = abstractC1395f.f15139b;
        z zVar = abstractC1395f.f15146i;
        C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        this.f8965i.getClass();
        this.f8967k.e(c1377t, abstractC1395f.f15140c, this.f8958b, abstractC1395f.f15141d, abstractC1395f.f15142e, abstractC1395f.f15143f, abstractC1395f.f15144g, abstractC1395f.f15145h);
        if (this.f8937D) {
            this.f8959c.s(this);
            return;
        }
        P p2 = new P();
        p2.f3982a = this.f8948P;
        v(new Q(p2));
    }

    public final void k() {
        AbstractC0124a.t(this.f8937D);
        this.f8942I.getClass();
        this.f8943J.getClass();
    }

    @Override // q0.d0
    public final boolean l() {
        return this.f8966j.d();
    }

    @Override // u0.i
    public final void m(u0.k kVar, long j4, long j5, boolean z) {
        AbstractC1395f abstractC1395f = (AbstractC1395f) kVar;
        this.f8975u = null;
        long j6 = abstractC1395f.f15138a;
        Y.k kVar2 = abstractC1395f.f15139b;
        z zVar = abstractC1395f.f15146i;
        C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        this.f8965i.getClass();
        this.f8967k.c(c1377t, abstractC1395f.f15140c, this.f8958b, abstractC1395f.f15141d, abstractC1395f.f15142e, abstractC1395f.f15143f, abstractC1395f.f15144g, abstractC1395f.f15145h);
        if (z) {
            return;
        }
        if (E() || this.f8938E == 0) {
            I();
        }
        if (this.f8938E > 0) {
            this.f8959c.s(this);
        }
    }

    public final boolean n(int i4) {
        int i5 = i4;
        while (true) {
            ArrayList arrayList = this.n;
            if (i5 >= arrayList.size()) {
                k kVar = (k) arrayList.get(i4);
                for (int i6 = 0; i6 < this.v.length; i6++) {
                    if (this.v[i6].t() > kVar.g(i6)) {
                        return false;
                    }
                }
                return true;
            }
            if (((k) arrayList.get(i5)).L) {
                return false;
            }
            i5++;
        }
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
        this.f8967k.h(c1377t, abstractC1395f.f15140c, this.f8958b, abstractC1395f.f15141d, abstractC1395f.f15142e, abstractC1395f.f15143f, abstractC1395f.f15144g, abstractC1395f.f15145h, i4);
    }

    @Override // u0.i
    public final g1.e p(u0.k kVar, long j4, long j5, IOException iOException, int i4) {
        boolean z;
        g1.e eVar;
        int i5;
        AbstractC1395f abstractC1395f = (AbstractC1395f) kVar;
        boolean z4 = abstractC1395f instanceof k;
        if (z4 && !((k) abstractC1395f).h() && (iOException instanceof Y.v) && ((i5 = ((Y.v) iOException).f3743c) == 410 || i5 == 404)) {
            return u0.n.f15481d;
        }
        long j6 = abstractC1395f.f15146i.f3753b;
        Y.k kVar2 = abstractC1395f.f15139b;
        z zVar = abstractC1395f.f15146i;
        C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, j6);
        J.Z(abstractC1395f.f15144g);
        J.Z(abstractC1395f.f15145h);
        E1.P p2 = new E1.P(i4, 9, iOException);
        j jVar = this.f8960d;
        u0.h e4 = AbstractC0347t0.e(jVar.f8860r);
        this.f8965i.getClass();
        g1.e f4 = C1427b.f(e4, p2);
        if (f4 == null || f4.f9026a != 2) {
            z = false;
        } else {
            long j7 = f4.f9027b;
            t0.t tVar = jVar.f8860r;
            z = tVar.o(tVar.u(jVar.f8852h.a(abstractC1395f.f15141d)), j7);
        }
        if (z) {
            if (z4 && j6 == 0) {
                ArrayList arrayList = this.n;
                AbstractC0124a.t(((k) arrayList.remove(arrayList.size() - 1)) == abstractC1395f);
                if (arrayList.isEmpty()) {
                    this.f8949Q = this.f8948P;
                } else {
                    ((k) v2.r.j(arrayList)).f8872J = true;
                }
            }
            eVar = u0.n.f15482e;
        } else {
            long h2 = C1427b.h(p2);
            eVar = h2 != -9223372036854775807L ? new g1.e(0, h2, false) : u0.n.f15483f;
        }
        g1.e eVar2 = eVar;
        boolean a3 = eVar2.a();
        this.f8967k.f(c1377t, abstractC1395f.f15140c, this.f8958b, abstractC1395f.f15141d, abstractC1395f.f15142e, abstractC1395f.f15143f, abstractC1395f.f15144g, abstractC1395f.f15145h, iOException, !a3);
        if (!a3) {
            this.f8975u = null;
        }
        if (z) {
            if (!this.f8937D) {
                P p4 = new P();
                p4.f3982a = this.f8948P;
                v(new Q(p4));
                return eVar2;
            }
            this.f8959c.s(this);
        }
        return eVar2;
    }

    @Override // y0.p
    public final void r() {
        this.f8953U = true;
        this.f8972r.post(this.f8971q);
    }

    @Override // q0.d0
    public final long u() {
        if (this.f8952T) {
            return Long.MIN_VALUE;
        }
        if (E()) {
            return this.f8949Q;
        }
        long j4 = this.f8948P;
        k C4 = C();
        if (!C4.f8870H) {
            ArrayList arrayList = this.n;
            C4 = arrayList.size() > 1 ? (k) arrayList.get(arrayList.size() - 2) : null;
        }
        if (C4 != null) {
            j4 = Math.max(j4, C4.f15145h);
        }
        if (this.f8936C) {
            for (r rVar : this.v) {
                j4 = Math.max(j4, rVar.q());
            }
        }
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02dc  */
    @Override // q0.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(Q q4) {
        long max;
        long j4;
        List list;
        f fVar;
        long j5;
        long j6;
        long j7;
        f fVar2;
        long j8;
        k kVar;
        h0.l lVar;
        Uri uri;
        j jVar;
        i d4;
        long j9;
        boolean z;
        List list2;
        boolean z4;
        e0.t tVar;
        byte[] bArr;
        u0.n nVar;
        boolean z5;
        byte[] bArr2;
        Y.h hVar;
        h0.i iVar;
        f fVar3;
        b0.i iVar2;
        Y.k kVar2;
        Y.h hVar2;
        boolean z6;
        M0.h hVar3;
        W.u uVar;
        C0434b c0434b;
        G g4;
        byte[] bArr3;
        Y.h hVar4;
        String str;
        C0446b c0446b;
        if (!this.f8952T) {
            u0.n nVar2 = this.f8966j;
            if (!nVar2.d() && !nVar2.c()) {
                if (E()) {
                    List list3 = Collections.EMPTY_LIST;
                    max = this.f8949Q;
                    for (r rVar : this.v) {
                        rVar.f14976t = this.f8949Q;
                    }
                    list = list3;
                    j4 = max;
                } else {
                    k C4 = C();
                    boolean z7 = C4.f8870H;
                    long j10 = C4.f15144g;
                    if (z7 && C4.h()) {
                        long j11 = C4.f8873K;
                        max = j11 != -9223372036854775807L ? j10 + j11 : -9223372036854775807L;
                    } else {
                        max = Math.max(this.f8948P, j10);
                    }
                    long j12 = this.f8948P;
                    boolean z8 = this.f8936C;
                    List list4 = this.o;
                    if (z8) {
                        for (r rVar2 : this.v) {
                            j12 = Math.max(j12, rVar2.r());
                        }
                    }
                    j4 = j12;
                    list = list4;
                }
                f fVar4 = this.f8969m;
                fVar4.f8836b = null;
                fVar4.f8835a = false;
                fVar4.f8837c = null;
                boolean z9 = this.f8937D || !list.isEmpty();
                j jVar2 = this.f8960d;
                e0.t tVar2 = jVar2.f8854j;
                Uri[] uriArr = jVar2.f8849e;
                C0447c c0447c = jVar2.f8851g;
                k kVar3 = list.isEmpty() ? null : (k) v2.r.j(list);
                int a3 = kVar3 == null ? -1 : jVar2.f8852h.a(kVar3.f15141d);
                long j13 = q4.f3985a;
                long j14 = max - j13;
                long j15 = jVar2.f8861s;
                long j16 = j15 != -9223372036854775807L ? j15 - j13 : -9223372036854775807L;
                if (kVar3 == null || jVar2.f8859q) {
                    fVar = fVar4;
                    j5 = j13;
                } else {
                    fVar = fVar4;
                    long j17 = kVar3.f15145h - kVar3.f15144g;
                    j5 = j13;
                    j14 = Math.max(0L, j14 - j17);
                    if (j16 != -9223372036854775807L) {
                        j16 = Math.max(0L, j16 - j17);
                    }
                }
                long j18 = max;
                k kVar4 = kVar3;
                jVar2.f8860r.j(j5, j14, j16, list, jVar2.a(kVar3, max));
                int k4 = jVar2.f8860r.k();
                int i4 = a3;
                boolean z10 = a3 != k4;
                Uri uri2 = uriArr[k4];
                if (c0447c.c(uri2)) {
                    f fVar5 = fVar;
                    h0.l a4 = c0447c.a(true, uri2);
                    a4.getClass();
                    long j19 = a4.f9134h;
                    jVar2.f8859q = a4.f9167c;
                    if (a4.o) {
                        j6 = j18;
                        j7 = -9223372036854775807L;
                    } else {
                        j6 = j18;
                        j7 = (a4.f9145u + j19) - c0447c.n;
                    }
                    jVar2.f8861s = j7;
                    long j20 = j19 - c0447c.n;
                    fVar2 = fVar5;
                    long j21 = j6;
                    Pair c4 = jVar2.c(kVar4, z10, a4, j20, j21);
                    long longValue = ((Long) c4.first).longValue();
                    int intValue = ((Integer) c4.second).intValue();
                    if (z10 && kVar4 != null) {
                        j8 = j20;
                        if (longValue < a4.f9137k || ((d4 = j.d(a4, longValue, intValue)) != null && j8 + d4.f8841a.f9118e < j4)) {
                            Uri uri3 = uriArr[i4];
                            h0.l a5 = c0447c.a(true, uri3);
                            a5.getClass();
                            long j22 = a5.f9134h - c0447c.n;
                            Pair c5 = jVar2.c(kVar4, false, a5, j22, j21);
                            kVar = kVar4;
                            long longValue2 = ((Long) c5.first).longValue();
                            j8 = j22;
                            k4 = i4;
                            lVar = a5;
                            uri = uri3;
                            intValue = ((Integer) c5.second).intValue();
                            jVar = jVar2;
                            longValue = longValue2;
                            String str2 = lVar.f9165a;
                            boolean z11 = lVar.f9167c;
                            j9 = lVar.f9137k;
                            I i5 = lVar.f9142r;
                            if (k4 != i4 && i4 != -1) {
                                c0446b = (C0446b) c0447c.f9057d.get(uriArr[i4]);
                                if (c0446b != null) {
                                    c0446b.f9052k = false;
                                }
                            }
                            if (longValue >= j9) {
                                jVar.n = new C1360b();
                            } else {
                                i d5 = j.d(lVar, longValue, intValue);
                                if (d5 == null) {
                                    if (!lVar.o) {
                                        fVar2.f8837c = uri;
                                        jVar.f8858p = uri;
                                    } else if (z9 || i5.isEmpty()) {
                                        fVar2.f8835a = true;
                                    } else {
                                        d5 = new i((h0.j) v2.r.j(i5), (j9 + i5.size()) - 1, -1);
                                    }
                                }
                                boolean z12 = d5.f8844d;
                                h0.j jVar3 = d5.f8841a;
                                jVar.f8858p = null;
                                SystemClock.elapsedRealtime();
                                h0.i iVar3 = jVar3.f9115b;
                                long j23 = jVar3.f9118e;
                                Uri q5 = (iVar3 == null || (str = iVar3.f9120g) == null) ? null : AbstractC0108a.q(str2, str);
                                e e4 = jVar.e(q5, k4, true);
                                fVar2.f8836b = e4;
                                if (e4 == null) {
                                    String str3 = jVar3.f9120g;
                                    Uri q6 = str3 == null ? null : AbstractC0108a.q(str2, str3);
                                    e e5 = jVar.e(q6, k4, false);
                                    fVar2.f8836b = e5;
                                    if (e5 == null) {
                                        boolean z13 = jVar3 instanceof h0.g ? ((h0.g) jVar3).f9107l || (d5.f8843c == 0 && z11) : z11;
                                        if (kVar == null) {
                                            AtomicInteger atomicInteger = k.f8862M;
                                        } else if (!uri.equals(kVar.f8876m) || !kVar.f8870H) {
                                            long j24 = j8 + j23;
                                            if (!z13 || j24 < j21) {
                                                z = true;
                                                if (z || !z12) {
                                                    C0435c c0435c = jVar.f8845a;
                                                    Y.h hVar5 = jVar.f8846b;
                                                    C0097o c0097o = jVar.f8850f[k4];
                                                    List list5 = jVar.f8853i;
                                                    int m4 = jVar.f8860r.m();
                                                    Object q7 = jVar.f8860r.q();
                                                    boolean z14 = jVar.f8856l;
                                                    e0.t tVar3 = jVar.f8848d;
                                                    if (q6 != null) {
                                                        tVar2.getClass();
                                                        list2 = list5;
                                                        z4 = z14;
                                                        tVar = tVar2;
                                                        bArr = null;
                                                    } else {
                                                        list2 = list5;
                                                        z4 = z14;
                                                        tVar = tVar2;
                                                        bArr = (byte[]) ((C0436d) tVar.f8416a).get(q6);
                                                    }
                                                    byte[] bArr4 = q5 != null ? null : (byte[]) ((C0436d) tVar.f8416a).get(q5);
                                                    b0.i iVar4 = jVar.f8855k;
                                                    AtomicInteger atomicInteger2 = k.f8862M;
                                                    Map map = Collections.EMPTY_MAP;
                                                    Uri q8 = AbstractC0108a.q(str2, jVar3.f9114a);
                                                    nVar = nVar2;
                                                    long j25 = jVar3.f9122i;
                                                    long j26 = jVar3.f9123j;
                                                    int i6 = !z12 ? 8 : 0;
                                                    AbstractC0124a.o(q8, "The uri must be set.");
                                                    Y.k kVar5 = new Y.k(q8, 1, null, map, j25, j26, null, i6);
                                                    z5 = bArr == null;
                                                    if (z5) {
                                                        bArr2 = null;
                                                    } else {
                                                        String str4 = jVar3.f9121h;
                                                        str4.getClass();
                                                        bArr2 = k.f(str4);
                                                    }
                                                    if (bArr == null) {
                                                        bArr2.getClass();
                                                        hVar = new C0433a(hVar5, bArr, bArr2);
                                                    } else {
                                                        hVar = hVar5;
                                                    }
                                                    iVar = jVar3.f9115b;
                                                    if (iVar == null) {
                                                        boolean z15 = bArr4 != null;
                                                        if (z15) {
                                                            String str5 = iVar.f9121h;
                                                            str5.getClass();
                                                            bArr3 = k.f(str5);
                                                        } else {
                                                            bArr3 = null;
                                                        }
                                                        boolean z16 = z15;
                                                        Uri q9 = AbstractC0108a.q(str2, iVar.f9114a);
                                                        fVar3 = fVar2;
                                                        iVar2 = iVar4;
                                                        long j27 = iVar.f9122i;
                                                        long j28 = iVar.f9123j;
                                                        AbstractC0124a.o(q9, "The uri must be set.");
                                                        Y.k kVar6 = new Y.k(q9, 1, null, map, j27, j28, null, 0);
                                                        if (bArr4 != null) {
                                                            bArr3.getClass();
                                                            hVar4 = new C0433a(hVar5, bArr4, bArr3);
                                                        } else {
                                                            hVar4 = hVar5;
                                                        }
                                                        z6 = z16;
                                                        hVar2 = hVar4;
                                                        kVar2 = kVar6;
                                                    } else {
                                                        fVar3 = fVar2;
                                                        iVar2 = iVar4;
                                                        kVar2 = null;
                                                        hVar2 = null;
                                                        z6 = false;
                                                    }
                                                    long j29 = j8 + j23;
                                                    long j30 = j29 + jVar3.f9116c;
                                                    int i7 = lVar.f9136j + jVar3.f9117d;
                                                    if (kVar == null) {
                                                        Y.k kVar7 = kVar.f8878q;
                                                        boolean z17 = kVar2 == kVar7 || (kVar2 != null && kVar7 != null && kVar2.f3701a.equals(kVar7.f3701a) && kVar2.f3705e == kVar7.f3705e);
                                                        boolean z18 = uri.equals(kVar.f8876m) && kVar.f8870H;
                                                        hVar3 = kVar.f8885y;
                                                        uVar = kVar.z;
                                                        c0434b = (z17 && z18 && !kVar.f8872J && kVar.f8875l == i7) ? kVar.f8865C : null;
                                                    } else {
                                                        hVar3 = new M0.h(null);
                                                        uVar = new W.u(10);
                                                        c0434b = null;
                                                    }
                                                    M0.h hVar6 = hVar3;
                                                    W.u uVar2 = uVar;
                                                    long j31 = d5.f8842b;
                                                    int i8 = d5.f8843c;
                                                    boolean z19 = !z12;
                                                    boolean z20 = jVar3.f9124k;
                                                    SparseArray sparseArray = (SparseArray) tVar3.f8416a;
                                                    g4 = (G) sparseArray.get(i7);
                                                    if (g4 == null) {
                                                        g4 = new G(9223372036854775806L);
                                                        sparseArray.put(i7, g4);
                                                    }
                                                    fVar2 = fVar3;
                                                    fVar2.f8836b = new k(c0435c, hVar, kVar5, c0097o, z5, hVar2, kVar2, z6, uri, list2, m4, q7, j29, j30, j31, i8, z19, i7, z20, z4, g4, jVar3.f9119f, c0434b, hVar6, uVar2, z, z13, iVar2);
                                                }
                                            }
                                        }
                                        z = false;
                                        if (z) {
                                        }
                                        C0435c c0435c2 = jVar.f8845a;
                                        Y.h hVar52 = jVar.f8846b;
                                        C0097o c0097o2 = jVar.f8850f[k4];
                                        List list52 = jVar.f8853i;
                                        int m42 = jVar.f8860r.m();
                                        Object q72 = jVar.f8860r.q();
                                        boolean z142 = jVar.f8856l;
                                        e0.t tVar32 = jVar.f8848d;
                                        if (q6 != null) {
                                        }
                                        if (q5 != null) {
                                        }
                                        b0.i iVar42 = jVar.f8855k;
                                        AtomicInteger atomicInteger22 = k.f8862M;
                                        Map map2 = Collections.EMPTY_MAP;
                                        Uri q82 = AbstractC0108a.q(str2, jVar3.f9114a);
                                        nVar = nVar2;
                                        long j252 = jVar3.f9122i;
                                        long j262 = jVar3.f9123j;
                                        if (!z12) {
                                        }
                                        AbstractC0124a.o(q82, "The uri must be set.");
                                        Y.k kVar52 = new Y.k(q82, 1, null, map2, j252, j262, null, i6);
                                        if (bArr == null) {
                                        }
                                        if (z5) {
                                        }
                                        if (bArr == null) {
                                        }
                                        iVar = jVar3.f9115b;
                                        if (iVar == null) {
                                        }
                                        long j292 = j8 + j23;
                                        long j302 = j292 + jVar3.f9116c;
                                        int i72 = lVar.f9136j + jVar3.f9117d;
                                        if (kVar == null) {
                                        }
                                        M0.h hVar62 = hVar3;
                                        W.u uVar22 = uVar;
                                        long j312 = d5.f8842b;
                                        int i82 = d5.f8843c;
                                        boolean z192 = !z12;
                                        boolean z202 = jVar3.f9124k;
                                        SparseArray sparseArray2 = (SparseArray) tVar32.f8416a;
                                        g4 = (G) sparseArray2.get(i72);
                                        if (g4 == null) {
                                        }
                                        fVar2 = fVar3;
                                        fVar2.f8836b = new k(c0435c2, hVar, kVar52, c0097o2, z5, hVar2, kVar2, z6, uri, list2, m42, q72, j292, j302, j312, i82, z192, i72, z202, z4, g4, jVar3.f9119f, c0434b, hVar62, uVar22, z, z13, iVar2);
                                    }
                                }
                            }
                            nVar = nVar2;
                        }
                    } else {
                        j8 = j20;
                    }
                    kVar = kVar4;
                    jVar = jVar2;
                    lVar = a4;
                    uri = uri2;
                    String str22 = lVar.f9165a;
                    boolean z112 = lVar.f9167c;
                    j9 = lVar.f9137k;
                    I i52 = lVar.f9142r;
                    if (k4 != i4) {
                        c0446b = (C0446b) c0447c.f9057d.get(uriArr[i4]);
                        if (c0446b != null) {
                        }
                    }
                    if (longValue >= j9) {
                    }
                    nVar = nVar2;
                } else {
                    f fVar6 = fVar;
                    fVar6.f8837c = uri2;
                    jVar2.f8858p = uri2;
                    nVar = nVar2;
                    fVar2 = fVar6;
                }
                boolean z21 = fVar2.f8835a;
                AbstractC1395f abstractC1395f = (AbstractC1395f) fVar2.f8836b;
                Uri uri4 = (Uri) fVar2.f8837c;
                if (z21) {
                    this.f8949Q = -9223372036854775807L;
                    this.f8952T = true;
                    return true;
                }
                if (abstractC1395f == null) {
                    if (uri4 == null) {
                        return false;
                    }
                    ((C0446b) ((l) this.f8959c.f8416a).f8887b.f9057d.get(uri4)).c(true);
                    return false;
                }
                if (abstractC1395f instanceof k) {
                    k kVar8 = (k) abstractC1395f;
                    ArrayList arrayList = this.n;
                    if (!arrayList.isEmpty()) {
                        if (!C().h()) {
                            B(arrayList.size() - 1);
                        }
                        if (kVar8.n && kVar8.L) {
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                }
                                long j32 = ((k) arrayList.get(size)).f15144g;
                                long j33 = kVar8.f15144g;
                                if (j32 < j33) {
                                    break;
                                }
                                if (j32 == j33 && n(size)) {
                                    B(size);
                                    kVar8.L = false;
                                    break;
                                }
                                size--;
                            }
                        }
                    }
                    this.f8956X = kVar8;
                    this.f8939F = kVar8.f15141d;
                    this.f8949Q = -9223372036854775807L;
                    arrayList.add(kVar8);
                    v2.F j34 = I.j();
                    for (r rVar3 : this.v) {
                        j34.b(Integer.valueOf(rVar3.f14973q + rVar3.f14972p));
                    }
                    a0 f4 = j34.f();
                    kVar8.f8866D = this;
                    kVar8.f8871I = f4;
                    for (r rVar4 : this.v) {
                        rVar4.getClass();
                        rVar4.f14954C = kVar8.f8874k;
                        if (kVar8.L) {
                            rVar4.f14958G = true;
                        }
                    }
                }
                this.f8975u = abstractC1395f;
                nVar.f(abstractC1395f, this, this.f8965i.g(abstractC1395f.f15140c));
                return true;
            }
        }
        return false;
    }

    @Override // q0.d0
    public final void w(long j4) {
        u0.n nVar = this.f8966j;
        if (nVar.c() || E()) {
            return;
        }
        boolean d4 = nVar.d();
        j jVar = this.f8960d;
        List list = this.o;
        if (d4) {
            this.f8975u.getClass();
            if (jVar.n != null ? false : jVar.f8860r.n(j4, this.f8975u, list)) {
                nVar.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && jVar.b((k) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            B(size);
        }
        int size2 = (jVar.n != null || jVar.f8860r.length() < 2) ? list.size() : jVar.f8860r.t(list, j4);
        if (size2 < this.n.size()) {
            B(size2);
        }
    }

    public final j0 y(U[] uArr) {
        for (int i4 = 0; i4 < uArr.length; i4++) {
            U u4 = uArr[i4];
            C0097o[] c0097oArr = new C0097o[u4.f2705a];
            for (int i5 = 0; i5 < u4.f2705a; i5++) {
                C0097o c0097o = u4.f2708d[i5];
                int d4 = this.f8963g.d(c0097o);
                C0096n a3 = c0097o.a();
                a3.f2818N = d4;
                c0097oArr[i5] = new C0097o(a3);
            }
            uArr[i4] = new U(u4.f2706b, c0097oArr);
        }
        return new j0(uArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [g0.r[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [g0.r[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [y0.F] */
    /* JADX WARN: Type inference failed for: r5v4, types: [g0.r, q0.a0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // y0.p
    public final y0.F z(int i4, int i5) {
        Integer valueOf = Integer.valueOf(i5);
        Set set = f8933Y;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.f8977x;
        SparseIntArray sparseIntArray = this.f8978y;
        ?? r5 = 0;
        r5 = 0;
        if (contains) {
            AbstractC0124a.h(set.contains(Integer.valueOf(i5)));
            int i6 = sparseIntArray.get(i5, -1);
            if (i6 != -1) {
                if (hashSet.add(Integer.valueOf(i5))) {
                    this.f8976w[i6] = i4;
                }
                r5 = this.f8976w[i6] == i4 ? this.v[i6] : s(i4, i5);
            }
        } else {
            int i7 = 0;
            while (true) {
                ?? r12 = this.v;
                if (i7 >= r12.length) {
                    break;
                }
                if (this.f8976w[i7] == i4) {
                    r5 = r12[i7];
                    break;
                }
                i7++;
            }
        }
        if (r5 == 0) {
            if (this.f8953U) {
                return s(i4, i5);
            }
            int length = this.v.length;
            boolean z = i5 == 1 || i5 == 2;
            r5 = new r(this.f8961e, this.f8963g, this.f8964h, this.f8974t);
            r5.f14976t = this.f8948P;
            if (z) {
                r5.f8932I = this.f8955W;
                r5.z = true;
            }
            long j4 = this.f8954V;
            if (r5.f14957F != j4) {
                r5.f14957F = j4;
                r5.z = true;
            }
            if (this.f8956X != null) {
                r5.f14954C = r6.f8874k;
            }
            r5.f14964f = this;
            int i8 = length + 1;
            int[] copyOf = Arrays.copyOf(this.f8976w, i8);
            this.f8976w = copyOf;
            copyOf[length] = i4;
            r[] rVarArr = this.v;
            String str = J.f3263a;
            ?? copyOf2 = Arrays.copyOf(rVarArr, rVarArr.length + 1);
            copyOf2[rVarArr.length] = r5;
            this.v = (r[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f8947O, i8);
            this.f8947O = copyOf3;
            copyOf3[length] = z;
            this.f8945M |= z;
            hashSet.add(Integer.valueOf(i5));
            sparseIntArray.append(i5, length);
            if (D(i5) > D(this.f8934A)) {
                this.f8935B = length;
                this.f8934A = i5;
            }
            this.f8946N = Arrays.copyOf(this.f8946N, i8);
        }
        if (i5 != 5) {
            return r5;
        }
        if (this.z == null) {
            this.z = new q(r5, this.f8968l);
        }
        return this.z;
    }

    @Override // y0.p
    public final void x(y yVar) {
    }
}
