package y1;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import j1.a;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m2.b0;
import m4.q;
import n2.c0;
import n2.g0;
import n2.h0;
import o2.a0;
import o2.m0;
import o2.v;
import r0.j3;
import r0.n2;
import r0.s1;
import r0.t1;
import t1.e0;
import t1.p0;
import t1.q0;
import t1.r0;
import t1.x0;
import t1.z0;
import v0.w;
import v0.y;
import w0.d0;
import w0.e0;
import y1.f;
import y1.p;

/* loaded from: classes.dex */
final class p implements h0.b<v1.f>, h0.f, r0, w0.n, p0.d {

    /* renamed from: d0, reason: collision with root package name */
    private static final Set<Integer> f23331d0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private d[] A;
    private Set<Integer> C;
    private SparseIntArray D;
    private e0 E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;
    private int J;
    private s1 K;
    private s1 L;
    private boolean M;
    private z0 N;
    private Set<x0> O;
    private int[] P;
    private int Q;
    private boolean R;
    private boolean[] S;
    private boolean[] T;
    private long U;
    private long V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    private long f23332a0;

    /* renamed from: b0, reason: collision with root package name */
    private v0.m f23333b0;

    /* renamed from: c0, reason: collision with root package name */
    private i f23334c0;

    /* renamed from: f, reason: collision with root package name */
    private final String f23335f;

    /* renamed from: g, reason: collision with root package name */
    private final int f23336g;

    /* renamed from: h, reason: collision with root package name */
    private final b f23337h;

    /* renamed from: i, reason: collision with root package name */
    private final f f23338i;

    /* renamed from: j, reason: collision with root package name */
    private final n2.b f23339j;

    /* renamed from: k, reason: collision with root package name */
    private final s1 f23340k;

    /* renamed from: l, reason: collision with root package name */
    private final y f23341l;

    /* renamed from: m, reason: collision with root package name */
    private final w.a f23342m;

    /* renamed from: n, reason: collision with root package name */
    private final g0 f23343n;

    /* renamed from: p, reason: collision with root package name */
    private final e0.a f23345p;

    /* renamed from: q, reason: collision with root package name */
    private final int f23346q;

    /* renamed from: s, reason: collision with root package name */
    private final ArrayList<i> f23348s;

    /* renamed from: t, reason: collision with root package name */
    private final List<i> f23349t;

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f23350u;

    /* renamed from: v, reason: collision with root package name */
    private final Runnable f23351v;

    /* renamed from: w, reason: collision with root package name */
    private final Handler f23352w;

    /* renamed from: x, reason: collision with root package name */
    private final ArrayList<l> f23353x;

    /* renamed from: y, reason: collision with root package name */
    private final Map<String, v0.m> f23354y;

    /* renamed from: z, reason: collision with root package name */
    private v1.f f23355z;

    /* renamed from: o, reason: collision with root package name */
    private final h0 f23344o = new h0("Loader:HlsSampleStreamWrapper");

    /* renamed from: r, reason: collision with root package name */
    private final f.b f23347r = new f.b();
    private int[] B = new int[0];

    public interface b extends r0.a<p> {
        void b();

        void k(Uri uri);
    }

    private static class c implements w0.e0 {

        /* renamed from: g, reason: collision with root package name */
        private static final s1 f23356g = new s1.b().e0("application/id3").E();

        /* renamed from: h, reason: collision with root package name */
        private static final s1 f23357h = new s1.b().e0("application/x-emsg").E();

        /* renamed from: a, reason: collision with root package name */
        private final l1.b f23358a = new l1.b();

        /* renamed from: b, reason: collision with root package name */
        private final w0.e0 f23359b;

        /* renamed from: c, reason: collision with root package name */
        private final s1 f23360c;

        /* renamed from: d, reason: collision with root package name */
        private s1 f23361d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f23362e;

        /* renamed from: f, reason: collision with root package name */
        private int f23363f;

        public c(w0.e0 e0Var, int i7) {
            s1 s1Var;
            this.f23359b = e0Var;
            if (i7 == 1) {
                s1Var = f23356g;
            } else {
                if (i7 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i7);
                }
                s1Var = f23357h;
            }
            this.f23360c = s1Var;
            this.f23362e = new byte[0];
            this.f23363f = 0;
        }

        private boolean g(l1.a aVar) {
            s1 d7 = aVar.d();
            return d7 != null && m0.c(this.f23360c.f20956q, d7.f20956q);
        }

        private void h(int i7) {
            byte[] bArr = this.f23362e;
            if (bArr.length < i7) {
                this.f23362e = Arrays.copyOf(bArr, i7 + (i7 / 2));
            }
        }

        private a0 i(int i7, int i8) {
            int i9 = this.f23363f - i8;
            a0 a0Var = new a0(Arrays.copyOfRange(this.f23362e, i9 - i7, i9));
            byte[] bArr = this.f23362e;
            System.arraycopy(bArr, i9, bArr, 0, i8);
            this.f23363f = i8;
            return a0Var;
        }

        @Override // w0.e0
        public /* synthetic */ int a(n2.i iVar, int i7, boolean z6) {
            return d0.a(this, iVar, i7, z6);
        }

        @Override // w0.e0
        public void b(long j7, int i7, int i8, int i9, e0.a aVar) {
            o2.a.e(this.f23361d);
            a0 i10 = i(i8, i9);
            if (!m0.c(this.f23361d.f20956q, this.f23360c.f20956q)) {
                if (!"application/x-emsg".equals(this.f23361d.f20956q)) {
                    o2.r.i("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f23361d.f20956q);
                    return;
                }
                l1.a c7 = this.f23358a.c(i10);
                if (!g(c7)) {
                    o2.r.i("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f23360c.f20956q, c7.d()));
                    return;
                }
                i10 = new a0((byte[]) o2.a.e(c7.f()));
            }
            int a7 = i10.a();
            this.f23359b.d(i10, a7);
            this.f23359b.b(j7, i7, a7, i9, aVar);
        }

        @Override // w0.e0
        public void c(a0 a0Var, int i7, int i8) {
            h(this.f23363f + i7);
            a0Var.j(this.f23362e, this.f23363f, i7);
            this.f23363f += i7;
        }

        @Override // w0.e0
        public /* synthetic */ void d(a0 a0Var, int i7) {
            d0.b(this, a0Var, i7);
        }

        @Override // w0.e0
        public void e(s1 s1Var) {
            this.f23361d = s1Var;
            this.f23359b.e(this.f23360c);
        }

        @Override // w0.e0
        public int f(n2.i iVar, int i7, boolean z6, int i8) {
            h(this.f23363f + i7);
            int read = iVar.read(this.f23362e, this.f23363f, i7);
            if (read != -1) {
                this.f23363f += read;
                return read;
            }
            if (z6) {
                return -1;
            }
            throw new EOFException();
        }
    }

    private static final class d extends p0 {
        private final Map<String, v0.m> H;
        private v0.m I;

        private d(n2.b bVar, y yVar, w.a aVar, Map<String, v0.m> map) {
            super(bVar, yVar, aVar);
            this.H = map;
        }

        private j1.a h0(j1.a aVar) {
            if (aVar == null) {
                return null;
            }
            int h7 = aVar.h();
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= h7) {
                    i8 = -1;
                    break;
                }
                a.b g7 = aVar.g(i8);
                if ((g7 instanceof o1.l) && "com.apple.streaming.transportStreamTimestamp".equals(((o1.l) g7).f19682g)) {
                    break;
                }
                i8++;
            }
            if (i8 == -1) {
                return aVar;
            }
            if (h7 == 1) {
                return null;
            }
            a.b[] bVarArr = new a.b[h7 - 1];
            while (i7 < h7) {
                if (i7 != i8) {
                    bVarArr[i7 < i8 ? i7 : i7 - 1] = aVar.g(i7);
                }
                i7++;
            }
            return new j1.a(bVarArr);
        }

        @Override // t1.p0, w0.e0
        public void b(long j7, int i7, int i8, int i9, e0.a aVar) {
            super.b(j7, i7, i8, i9, aVar);
        }

        public void i0(v0.m mVar) {
            this.I = mVar;
            I();
        }

        public void j0(i iVar) {
            f0(iVar.f23288k);
        }

        @Override // t1.p0
        public s1 w(s1 s1Var) {
            v0.m mVar;
            v0.m mVar2 = this.I;
            if (mVar2 == null) {
                mVar2 = s1Var.f20959t;
            }
            if (mVar2 != null && (mVar = this.H.get(mVar2.f22683h)) != null) {
                mVar2 = mVar;
            }
            j1.a h02 = h0(s1Var.f20954o);
            if (mVar2 != s1Var.f20959t || h02 != s1Var.f20954o) {
                s1Var = s1Var.b().M(mVar2).X(h02).E();
            }
            return super.w(s1Var);
        }
    }

    public p(String str, int i7, b bVar, f fVar, Map<String, v0.m> map, n2.b bVar2, long j7, s1 s1Var, y yVar, w.a aVar, g0 g0Var, e0.a aVar2, int i8) {
        this.f23335f = str;
        this.f23336g = i7;
        this.f23337h = bVar;
        this.f23338i = fVar;
        this.f23354y = map;
        this.f23339j = bVar2;
        this.f23340k = s1Var;
        this.f23341l = yVar;
        this.f23342m = aVar;
        this.f23343n = g0Var;
        this.f23345p = aVar2;
        this.f23346q = i8;
        Set<Integer> set = f23331d0;
        this.C = new HashSet(set.size());
        this.D = new SparseIntArray(set.size());
        this.A = new d[0];
        this.T = new boolean[0];
        this.S = new boolean[0];
        ArrayList<i> arrayList = new ArrayList<>();
        this.f23348s = arrayList;
        this.f23349t = Collections.unmodifiableList(arrayList);
        this.f23353x = new ArrayList<>();
        this.f23350u = new Runnable() { // from class: y1.o
            @Override // java.lang.Runnable
            public final void run() {
                p.this.T();
            }
        };
        this.f23351v = new Runnable() { // from class: y1.n
            @Override // java.lang.Runnable
            public final void run() {
                p.this.c0();
            }
        };
        this.f23352w = m0.w();
        this.U = j7;
        this.V = j7;
    }

    private boolean A(int i7) {
        for (int i8 = i7; i8 < this.f23348s.size(); i8++) {
            if (this.f23348s.get(i8).f23291n) {
                return false;
            }
        }
        i iVar = this.f23348s.get(i7);
        for (int i9 = 0; i9 < this.A.length; i9++) {
            if (this.A[i9].C() > iVar.m(i9)) {
                return false;
            }
        }
        return true;
    }

    private static w0.k C(int i7, int i8) {
        o2.r.i("HlsSampleStreamWrapper", "Unmapped track with id " + i7 + " of type " + i8);
        return new w0.k();
    }

    private p0 D(int i7, int i8) {
        int length = this.A.length;
        boolean z6 = true;
        if (i8 != 1 && i8 != 2) {
            z6 = false;
        }
        d dVar = new d(this.f23339j, this.f23341l, this.f23342m, this.f23354y);
        dVar.b0(this.U);
        if (z6) {
            dVar.i0(this.f23333b0);
        }
        dVar.a0(this.f23332a0);
        i iVar = this.f23334c0;
        if (iVar != null) {
            dVar.j0(iVar);
        }
        dVar.d0(this);
        int i9 = length + 1;
        int[] copyOf = Arrays.copyOf(this.B, i9);
        this.B = copyOf;
        copyOf[length] = i7;
        this.A = (d[]) m0.E0(this.A, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.T, i9);
        this.T = copyOf2;
        copyOf2[length] = z6;
        this.R = copyOf2[length] | this.R;
        this.C.add(Integer.valueOf(i8));
        this.D.append(i8, length);
        if (M(i8) > M(this.F)) {
            this.G = length;
            this.F = i8;
        }
        this.S = Arrays.copyOf(this.S, i9);
        return dVar;
    }

    private z0 E(x0[] x0VarArr) {
        for (int i7 = 0; i7 < x0VarArr.length; i7++) {
            x0 x0Var = x0VarArr[i7];
            s1[] s1VarArr = new s1[x0Var.f22259f];
            for (int i8 = 0; i8 < x0Var.f22259f; i8++) {
                s1 b7 = x0Var.b(i8);
                s1VarArr[i8] = b7.c(this.f23341l.e(b7));
            }
            x0VarArr[i7] = new x0(x0Var.f22260g, s1VarArr);
        }
        return new z0(x0VarArr);
    }

    private static s1 F(s1 s1Var, s1 s1Var2, boolean z6) {
        String d7;
        String str;
        if (s1Var == null) {
            return s1Var2;
        }
        int k7 = v.k(s1Var2.f20956q);
        if (m0.K(s1Var.f20953n, k7) == 1) {
            d7 = m0.L(s1Var.f20953n, k7);
            str = v.g(d7);
        } else {
            d7 = v.d(s1Var.f20953n, s1Var2.f20956q);
            str = s1Var2.f20956q;
        }
        s1.b I = s1Var2.b().S(s1Var.f20945f).U(s1Var.f20946g).V(s1Var.f20947h).g0(s1Var.f20948i).c0(s1Var.f20949j).G(z6 ? s1Var.f20950k : -1).Z(z6 ? s1Var.f20951l : -1).I(d7);
        if (k7 == 2) {
            I.j0(s1Var.f20961v).Q(s1Var.f20962w).P(s1Var.f20963x);
        }
        if (str != null) {
            I.e0(str);
        }
        int i7 = s1Var.D;
        if (i7 != -1 && k7 == 1) {
            I.H(i7);
        }
        j1.a aVar = s1Var.f20954o;
        if (aVar != null) {
            j1.a aVar2 = s1Var2.f20954o;
            if (aVar2 != null) {
                aVar = aVar2.c(aVar);
            }
            I.X(aVar);
        }
        return I.E();
    }

    private void G(int i7) {
        o2.a.f(!this.f23344o.j());
        while (true) {
            if (i7 >= this.f23348s.size()) {
                i7 = -1;
                break;
            } else if (A(i7)) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        long j7 = K().f22754h;
        i H = H(i7);
        if (this.f23348s.isEmpty()) {
            this.V = this.U;
        } else {
            ((i) m4.t.c(this.f23348s)).o();
        }
        this.Y = false;
        this.f23345p.D(this.F, H.f22753g, j7);
    }

    private i H(int i7) {
        i iVar = this.f23348s.get(i7);
        ArrayList<i> arrayList = this.f23348s;
        m0.M0(arrayList, i7, arrayList.size());
        for (int i8 = 0; i8 < this.A.length; i8++) {
            this.A[i8].u(iVar.m(i8));
        }
        return iVar;
    }

    private boolean I(i iVar) {
        int i7 = iVar.f23288k;
        int length = this.A.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (this.S[i8] && this.A[i8].Q() == i7) {
                return false;
            }
        }
        return true;
    }

    private static boolean J(s1 s1Var, s1 s1Var2) {
        String str = s1Var.f20956q;
        String str2 = s1Var2.f20956q;
        int k7 = v.k(str);
        if (k7 != 3) {
            return k7 == v.k(str2);
        }
        if (m0.c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || s1Var.I == s1Var2.I;
        }
        return false;
    }

    private i K() {
        return this.f23348s.get(r0.size() - 1);
    }

    private w0.e0 L(int i7, int i8) {
        o2.a.a(f23331d0.contains(Integer.valueOf(i8)));
        int i9 = this.D.get(i8, -1);
        if (i9 == -1) {
            return null;
        }
        if (this.C.add(Integer.valueOf(i8))) {
            this.B[i9] = i7;
        }
        return this.B[i9] == i7 ? this.A[i9] : C(i7, i8);
    }

    private static int M(int i7) {
        if (i7 == 1) {
            return 2;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 1;
        }
        return 3;
    }

    private void N(i iVar) {
        this.f23334c0 = iVar;
        this.K = iVar.f22750d;
        this.V = -9223372036854775807L;
        this.f23348s.add(iVar);
        q.a r7 = m4.q.r();
        for (d dVar : this.A) {
            r7.a(Integer.valueOf(dVar.G()));
        }
        iVar.n(this, r7.h());
        for (d dVar2 : this.A) {
            dVar2.j0(iVar);
            if (iVar.f23291n) {
                dVar2.g0();
            }
        }
    }

    private static boolean O(v1.f fVar) {
        return fVar instanceof i;
    }

    private boolean P() {
        return this.V != -9223372036854775807L;
    }

    private void S() {
        int i7 = this.N.f22275f;
        int[] iArr = new int[i7];
        this.P = iArr;
        Arrays.fill(iArr, -1);
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = 0;
            while (true) {
                d[] dVarArr = this.A;
                if (i9 >= dVarArr.length) {
                    break;
                }
                if (J((s1) o2.a.h(dVarArr[i9].F()), this.N.b(i8).b(0))) {
                    this.P[i8] = i9;
                    break;
                }
                i9++;
            }
        }
        Iterator<l> it = this.f23353x.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (!this.M && this.P == null && this.H) {
            for (d dVar : this.A) {
                if (dVar.F() == null) {
                    return;
                }
            }
            if (this.N != null) {
                S();
                return;
            }
            z();
            l0();
            this.f23337h.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        this.H = true;
        T();
    }

    private void g0() {
        for (d dVar : this.A) {
            dVar.W(this.W);
        }
        this.W = false;
    }

    private boolean h0(long j7) {
        int length = this.A.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (!this.A[i7].Z(j7, false) && (this.T[i7] || !this.R)) {
                return false;
            }
        }
        return true;
    }

    private void l0() {
        this.I = true;
    }

    private void q0(q0[] q0VarArr) {
        this.f23353x.clear();
        for (q0 q0Var : q0VarArr) {
            if (q0Var != null) {
                this.f23353x.add((l) q0Var);
            }
        }
    }

    private void x() {
        o2.a.f(this.I);
        o2.a.e(this.N);
        o2.a.e(this.O);
    }

    private void z() {
        s1 s1Var;
        int length = this.A.length;
        int i7 = 0;
        int i8 = -2;
        int i9 = -1;
        while (true) {
            if (i7 >= length) {
                break;
            }
            String str = ((s1) o2.a.h(this.A[i7].F())).f20956q;
            int i10 = v.s(str) ? 2 : v.o(str) ? 1 : v.r(str) ? 3 : -2;
            if (M(i10) > M(i8)) {
                i9 = i7;
                i8 = i10;
            } else if (i10 == i8 && i9 != -1) {
                i9 = -1;
            }
            i7++;
        }
        x0 j7 = this.f23338i.j();
        int i11 = j7.f22259f;
        this.Q = -1;
        this.P = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            this.P[i12] = i12;
        }
        x0[] x0VarArr = new x0[length];
        int i13 = 0;
        while (i13 < length) {
            s1 s1Var2 = (s1) o2.a.h(this.A[i13].F());
            if (i13 == i9) {
                s1[] s1VarArr = new s1[i11];
                for (int i14 = 0; i14 < i11; i14++) {
                    s1 b7 = j7.b(i14);
                    if (i8 == 1 && (s1Var = this.f23340k) != null) {
                        b7 = b7.j(s1Var);
                    }
                    s1VarArr[i14] = i11 == 1 ? s1Var2.j(b7) : F(b7, s1Var2, true);
                }
                x0VarArr[i13] = new x0(this.f23335f, s1VarArr);
                this.Q = i13;
            } else {
                s1 s1Var3 = (i8 == 2 && v.o(s1Var2.f20956q)) ? this.f23340k : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f23335f);
                sb.append(":muxed:");
                sb.append(i13 < i9 ? i13 : i13 - 1);
                x0VarArr[i13] = new x0(sb.toString(), F(s1Var3, s1Var2, false));
            }
            i13++;
        }
        this.N = E(x0VarArr);
        o2.a.f(this.O == null);
        this.O = Collections.emptySet();
    }

    public void B() {
        if (this.I) {
            return;
        }
        g(this.U);
    }

    public boolean Q(int i7) {
        return !P() && this.A[i7].K(this.Y);
    }

    public boolean R() {
        return this.F == 2;
    }

    public void U() {
        this.f23344o.b();
        this.f23338i.n();
    }

    public void V(int i7) {
        U();
        this.A[i7].N();
    }

    @Override // n2.h0.b
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void m(v1.f fVar, long j7, long j8, boolean z6) {
        this.f23355z = null;
        t1.q qVar = new t1.q(fVar.f22747a, fVar.f22748b, fVar.f(), fVar.e(), j7, j8, fVar.b());
        this.f23343n.a(fVar.f22747a);
        this.f23345p.r(qVar, fVar.f22749c, this.f23336g, fVar.f22750d, fVar.f22751e, fVar.f22752f, fVar.f22753g, fVar.f22754h);
        if (z6) {
            return;
        }
        if (P() || this.J == 0) {
            g0();
        }
        if (this.J > 0) {
            this.f23337h.l(this);
        }
    }

    @Override // n2.h0.b
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void l(v1.f fVar, long j7, long j8) {
        this.f23355z = null;
        this.f23338i.p(fVar);
        t1.q qVar = new t1.q(fVar.f22747a, fVar.f22748b, fVar.f(), fVar.e(), j7, j8, fVar.b());
        this.f23343n.a(fVar.f22747a);
        this.f23345p.u(qVar, fVar.f22749c, this.f23336g, fVar.f22750d, fVar.f22751e, fVar.f22752f, fVar.f22753g, fVar.f22754h);
        if (this.I) {
            this.f23337h.l(this);
        } else {
            g(this.U);
        }
    }

    @Override // n2.h0.b
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public h0.c o(v1.f fVar, long j7, long j8, IOException iOException, int i7) {
        h0.c h7;
        int i8;
        boolean O = O(fVar);
        if (O && !((i) fVar).q() && (iOException instanceof c0) && ((i8 = ((c0) iOException).f19398i) == 410 || i8 == 404)) {
            return h0.f19434d;
        }
        long b7 = fVar.b();
        t1.q qVar = new t1.q(fVar.f22747a, fVar.f22748b, fVar.f(), fVar.e(), j7, j8, b7);
        g0.c cVar = new g0.c(qVar, new t1.t(fVar.f22749c, this.f23336g, fVar.f22750d, fVar.f22751e, fVar.f22752f, m0.Y0(fVar.f22753g), m0.Y0(fVar.f22754h)), iOException, i7);
        g0.b b8 = this.f23343n.b(b0.c(this.f23338i.k()), cVar);
        boolean m7 = (b8 == null || b8.f19422a != 2) ? false : this.f23338i.m(fVar, b8.f19423b);
        if (m7) {
            if (O && b7 == 0) {
                ArrayList<i> arrayList = this.f23348s;
                o2.a.f(arrayList.remove(arrayList.size() - 1) == fVar);
                if (this.f23348s.isEmpty()) {
                    this.V = this.U;
                } else {
                    ((i) m4.t.c(this.f23348s)).o();
                }
            }
            h7 = h0.f19436f;
        } else {
            long c7 = this.f23343n.c(cVar);
            h7 = c7 != -9223372036854775807L ? h0.h(false, c7) : h0.f19437g;
        }
        h0.c cVar2 = h7;
        boolean z6 = !cVar2.c();
        this.f23345p.w(qVar, fVar.f22749c, this.f23336g, fVar.f22750d, fVar.f22751e, fVar.f22752f, fVar.f22753g, fVar.f22754h, iOException, z6);
        if (z6) {
            this.f23355z = null;
            this.f23343n.a(fVar.f22747a);
        }
        if (m7) {
            if (this.I) {
                this.f23337h.l(this);
            } else {
                g(this.U);
            }
        }
        return cVar2;
    }

    public void Z() {
        this.C.clear();
    }

    @Override // t1.r0
    public boolean a() {
        return this.f23344o.j();
    }

    public boolean a0(Uri uri, g0.c cVar, boolean z6) {
        g0.b b7;
        if (!this.f23338i.o(uri)) {
            return true;
        }
        long j7 = (z6 || (b7 = this.f23343n.b(b0.c(this.f23338i.k()), cVar)) == null || b7.f19422a != 2) ? -9223372036854775807L : b7.f19423b;
        return this.f23338i.q(uri, j7) && j7 != -9223372036854775807L;
    }

    @Override // t1.p0.d
    public void b(s1 s1Var) {
        this.f23352w.post(this.f23350u);
    }

    public void b0() {
        if (this.f23348s.isEmpty()) {
            return;
        }
        i iVar = (i) m4.t.c(this.f23348s);
        int c7 = this.f23338i.c(iVar);
        if (c7 == 1) {
            iVar.v();
        } else if (c7 == 2 && !this.Y && this.f23344o.j()) {
            this.f23344o.f();
        }
    }

    @Override // t1.r0
    public long c() {
        if (P()) {
            return this.V;
        }
        if (this.Y) {
            return Long.MIN_VALUE;
        }
        return K().f22754h;
    }

    @Override // w0.n
    public w0.e0 d(int i7, int i8) {
        w0.e0 e0Var;
        if (!f23331d0.contains(Integer.valueOf(i8))) {
            int i9 = 0;
            while (true) {
                w0.e0[] e0VarArr = this.A;
                if (i9 >= e0VarArr.length) {
                    e0Var = null;
                    break;
                }
                if (this.B[i9] == i7) {
                    e0Var = e0VarArr[i9];
                    break;
                }
                i9++;
            }
        } else {
            e0Var = L(i7, i8);
        }
        if (e0Var == null) {
            if (this.Z) {
                return C(i7, i8);
            }
            e0Var = D(i7, i8);
        }
        if (i8 != 5) {
            return e0Var;
        }
        if (this.E == null) {
            this.E = new c(e0Var, this.f23346q);
        }
        return this.E;
    }

    public void d0(x0[] x0VarArr, int i7, int... iArr) {
        this.N = E(x0VarArr);
        this.O = new HashSet();
        for (int i8 : iArr) {
            this.O.add(this.N.b(i8));
        }
        this.Q = i7;
        Handler handler = this.f23352w;
        final b bVar = this.f23337h;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: y1.m
            @Override // java.lang.Runnable
            public final void run() {
                p.b.this.b();
            }
        });
        l0();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    @Override // t1.r0
    public long e() {
        /*
            r7 = this;
            boolean r0 = r7.Y
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.P()
            if (r0 == 0) goto L10
            long r0 = r7.V
            return r0
        L10:
            long r0 = r7.U
            y1.i r2 = r7.K()
            boolean r3 = r2.h()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList<y1.i> r2 = r7.f23348s
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList<y1.i> r2 = r7.f23348s
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            y1.i r2 = (y1.i) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.f22754h
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.H
            if (r2 == 0) goto L55
            y1.p$d[] r2 = r7.A
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.z()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.p.e():long");
    }

    public int e0(int i7, t1 t1Var, u0.g gVar, int i8) {
        if (P()) {
            return -3;
        }
        int i9 = 0;
        if (!this.f23348s.isEmpty()) {
            int i10 = 0;
            while (i10 < this.f23348s.size() - 1 && I(this.f23348s.get(i10))) {
                i10++;
            }
            m0.M0(this.f23348s, 0, i10);
            i iVar = this.f23348s.get(0);
            s1 s1Var = iVar.f22750d;
            if (!s1Var.equals(this.L)) {
                this.f23345p.i(this.f23336g, s1Var, iVar.f22751e, iVar.f22752f, iVar.f22753g);
            }
            this.L = s1Var;
        }
        if (!this.f23348s.isEmpty() && !this.f23348s.get(0).q()) {
            return -3;
        }
        int S = this.A[i7].S(t1Var, gVar, i8, this.Y);
        if (S == -5) {
            s1 s1Var2 = (s1) o2.a.e(t1Var.f21040b);
            if (i7 == this.G) {
                int Q = this.A[i7].Q();
                while (i9 < this.f23348s.size() && this.f23348s.get(i9).f23288k != Q) {
                    i9++;
                }
                s1Var2 = s1Var2.j(i9 < this.f23348s.size() ? this.f23348s.get(i9).f22750d : (s1) o2.a.e(this.K));
            }
            t1Var.f21040b = s1Var2;
        }
        return S;
    }

    public long f(long j7, j3 j3Var) {
        return this.f23338i.b(j7, j3Var);
    }

    public void f0() {
        if (this.I) {
            for (d dVar : this.A) {
                dVar.R();
            }
        }
        this.f23344o.m(this);
        this.f23352w.removeCallbacksAndMessages(null);
        this.M = true;
        this.f23353x.clear();
    }

    @Override // t1.r0
    public boolean g(long j7) {
        List<i> list;
        long max;
        if (this.Y || this.f23344o.j() || this.f23344o.i()) {
            return false;
        }
        if (P()) {
            list = Collections.emptyList();
            max = this.V;
            for (d dVar : this.A) {
                dVar.b0(this.V);
            }
        } else {
            list = this.f23349t;
            i K = K();
            max = K.h() ? K.f22754h : Math.max(this.U, K.f22753g);
        }
        List<i> list2 = list;
        long j8 = max;
        this.f23347r.a();
        this.f23338i.e(j7, j8, list2, this.I || !list2.isEmpty(), this.f23347r);
        f.b bVar = this.f23347r;
        boolean z6 = bVar.f23277b;
        v1.f fVar = bVar.f23276a;
        Uri uri = bVar.f23278c;
        if (z6) {
            this.V = -9223372036854775807L;
            this.Y = true;
            return true;
        }
        if (fVar == null) {
            if (uri != null) {
                this.f23337h.k(uri);
            }
            return false;
        }
        if (O(fVar)) {
            N((i) fVar);
        }
        this.f23355z = fVar;
        this.f23345p.A(new t1.q(fVar.f22747a, fVar.f22748b, this.f23344o.n(fVar, this, this.f23343n.d(fVar.f22749c))), fVar.f22749c, this.f23336g, fVar.f22750d, fVar.f22751e, fVar.f22752f, fVar.f22753g, fVar.f22754h);
        return true;
    }

    @Override // t1.r0
    public void h(long j7) {
        if (this.f23344o.i() || P()) {
            return;
        }
        if (this.f23344o.j()) {
            o2.a.e(this.f23355z);
            if (this.f23338i.v(j7, this.f23355z, this.f23349t)) {
                this.f23344o.f();
                return;
            }
            return;
        }
        int size = this.f23349t.size();
        while (size > 0 && this.f23338i.c(this.f23349t.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f23349t.size()) {
            G(size);
        }
        int h7 = this.f23338i.h(j7, this.f23349t);
        if (h7 < this.f23348s.size()) {
            G(h7);
        }
    }

    @Override // w0.n
    public void i(w0.b0 b0Var) {
    }

    public boolean i0(long j7, boolean z6) {
        this.U = j7;
        if (P()) {
            this.V = j7;
            return true;
        }
        if (this.H && !z6 && h0(j7)) {
            return false;
        }
        this.V = j7;
        this.Y = false;
        this.f23348s.clear();
        if (this.f23344o.j()) {
            if (this.H) {
                for (d dVar : this.A) {
                    dVar.r();
                }
            }
            this.f23344o.f();
        } else {
            this.f23344o.g();
            g0();
        }
        return true;
    }

    @Override // w0.n
    public void j() {
        this.Z = true;
        this.f23352w.post(this.f23351v);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean j0(m2.t[] tVarArr, boolean[] zArr, q0[] q0VarArr, boolean[] zArr2, long j7, boolean z6) {
        boolean z7;
        boolean z8;
        x();
        int i7 = this.J;
        int i8 = 0;
        for (int i9 = 0; i9 < tVarArr.length; i9++) {
            l lVar = (l) q0VarArr[i9];
            if (lVar != null && (tVarArr[i9] == null || !zArr[i9])) {
                this.J--;
                lVar.e();
                q0VarArr[i9] = null;
            }
        }
        boolean z9 = z6 || (!this.X ? j7 == this.U : i7 != 0);
        m2.t k7 = this.f23338i.k();
        boolean z10 = z9;
        m2.t tVar = k7;
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            m2.t tVar2 = tVarArr[i10];
            if (tVar2 != null) {
                int c7 = this.N.c(tVar2.c());
                if (c7 == this.Q) {
                    this.f23338i.u(tVar2);
                    tVar = tVar2;
                }
                if (q0VarArr[i10] == null) {
                    this.J++;
                    q0VarArr[i10] = new l(this, c7);
                    zArr2[i10] = true;
                    if (this.P != null) {
                        ((l) q0VarArr[i10]).a();
                        if (!z10) {
                            d dVar = this.A[this.P[c7]];
                            z10 = (dVar.Z(j7, true) || dVar.C() == 0) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.J == 0) {
            this.f23338i.r();
            this.L = null;
            this.W = true;
            this.f23348s.clear();
            if (this.f23344o.j()) {
                if (this.H) {
                    d[] dVarArr = this.A;
                    int length = dVarArr.length;
                    while (i8 < length) {
                        dVarArr[i8].r();
                        i8++;
                    }
                }
                this.f23344o.f();
            } else {
                g0();
            }
        } else {
            if (!this.f23348s.isEmpty() && !m0.c(tVar, k7)) {
                if (!this.X) {
                    long j8 = j7 < 0 ? -j7 : 0L;
                    i K = K();
                    tVar.m(j7, j8, -9223372036854775807L, this.f23349t, this.f23338i.a(K, j7));
                    if (tVar.o() == this.f23338i.j().c(K.f22750d)) {
                        z8 = false;
                        if (z8) {
                            this.W = true;
                            z7 = true;
                            z10 = true;
                            if (z10) {
                                i0(j7, z7);
                                while (i8 < q0VarArr.length) {
                                    if (q0VarArr[i8] != null) {
                                        zArr2[i8] = true;
                                    }
                                    i8++;
                                }
                            }
                        }
                    }
                }
                z8 = true;
                if (z8) {
                }
            }
            z7 = z6;
            if (z10) {
            }
        }
        q0(q0VarArr);
        this.X = true;
        return z10;
    }

    @Override // n2.h0.f
    public void k() {
        for (d dVar : this.A) {
            dVar.T();
        }
    }

    public void k0(v0.m mVar) {
        if (m0.c(this.f23333b0, mVar)) {
            return;
        }
        this.f23333b0 = mVar;
        int i7 = 0;
        while (true) {
            d[] dVarArr = this.A;
            if (i7 >= dVarArr.length) {
                return;
            }
            if (this.T[i7]) {
                dVarArr[i7].i0(mVar);
            }
            i7++;
        }
    }

    public void m0(boolean z6) {
        this.f23338i.t(z6);
    }

    public void n0(long j7) {
        if (this.f23332a0 != j7) {
            this.f23332a0 = j7;
            for (d dVar : this.A) {
                dVar.a0(j7);
            }
        }
    }

    public int o0(int i7, long j7) {
        if (P()) {
            return 0;
        }
        d dVar = this.A[i7];
        int E = dVar.E(j7, this.Y);
        i iVar = (i) m4.t.d(this.f23348s, null);
        if (iVar != null && !iVar.q()) {
            E = Math.min(E, iVar.m(i7) - dVar.C());
        }
        dVar.e0(E);
        return E;
    }

    public z0 p() {
        x();
        return this.N;
    }

    public void p0(int i7) {
        x();
        o2.a.e(this.P);
        int i8 = this.P[i7];
        o2.a.f(this.S[i8]);
        this.S[i8] = false;
    }

    public void s() {
        U();
        if (this.Y && !this.I) {
            throw n2.a("Loading finished before preparation is complete.", null);
        }
    }

    public void t(long j7, boolean z6) {
        if (!this.H || P()) {
            return;
        }
        int length = this.A.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.A[i7].q(j7, z6, this.S[i7]);
        }
    }

    public int y(int i7) {
        x();
        o2.a.e(this.P);
        int i8 = this.P[i7];
        if (i8 == -1) {
            return this.O.contains(this.N.b(i7)) ? -3 : -2;
        }
        boolean[] zArr = this.S;
        if (zArr[i8]) {
            return -2;
        }
        zArr[i8] = true;
        return i8;
    }
}
