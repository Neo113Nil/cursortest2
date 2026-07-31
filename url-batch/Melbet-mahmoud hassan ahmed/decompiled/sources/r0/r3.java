package r0;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import m4.q;
import r0.a2;
import r0.i;
import r0.r3;
import u1.c;

/* loaded from: classes.dex */
public abstract class r3 implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final r3 f20909f = new a();

    /* renamed from: g, reason: collision with root package name */
    public static final i.a<r3> f20910g = new i.a() { // from class: r0.q3
        @Override // r0.i.a
        public final i a(Bundle bundle) {
            r3 b7;
            b7 = r3.b(bundle);
            return b7;
        }
    };

    class a extends r3 {
        a() {
        }

        @Override // r0.r3
        public int f(Object obj) {
            return -1;
        }

        @Override // r0.r3
        public b k(int i7, b bVar, boolean z6) {
            throw new IndexOutOfBoundsException();
        }

        @Override // r0.r3
        public int m() {
            return 0;
        }

        @Override // r0.r3
        public Object q(int i7) {
            throw new IndexOutOfBoundsException();
        }

        @Override // r0.r3
        public d s(int i7, d dVar, long j7) {
            throw new IndexOutOfBoundsException();
        }

        @Override // r0.r3
        public int t() {
            return 0;
        }
    }

    public static final class b implements i {

        /* renamed from: m, reason: collision with root package name */
        public static final i.a<b> f20911m = new i.a() { // from class: r0.s3
            @Override // r0.i.a
            public final i a(Bundle bundle) {
                r3.b c7;
                c7 = r3.b.c(bundle);
                return c7;
            }
        };

        /* renamed from: f, reason: collision with root package name */
        public Object f20912f;

        /* renamed from: g, reason: collision with root package name */
        public Object f20913g;

        /* renamed from: h, reason: collision with root package name */
        public int f20914h;

        /* renamed from: i, reason: collision with root package name */
        public long f20915i;

        /* renamed from: j, reason: collision with root package name */
        public long f20916j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f20917k;

        /* renamed from: l, reason: collision with root package name */
        private u1.c f20918l = u1.c.f22442l;

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Bundle bundle) {
            int i7 = bundle.getInt(u(0), 0);
            long j7 = bundle.getLong(u(1), -9223372036854775807L);
            long j8 = bundle.getLong(u(2), 0L);
            boolean z6 = bundle.getBoolean(u(3));
            Bundle bundle2 = bundle.getBundle(u(4));
            u1.c a7 = bundle2 != null ? u1.c.f22444n.a(bundle2) : u1.c.f22442l;
            b bVar = new b();
            bVar.w(null, null, i7, j7, j8, a7, z6);
            return bVar;
        }

        private static String u(int i7) {
            return Integer.toString(i7, 36);
        }

        public int d(int i7) {
            return this.f20918l.c(i7).f22453g;
        }

        public long e(int i7, int i8) {
            c.a c7 = this.f20918l.c(i7);
            if (c7.f22453g != -1) {
                return c7.f22456j[i8];
            }
            return -9223372036854775807L;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return o2.m0.c(this.f20912f, bVar.f20912f) && o2.m0.c(this.f20913g, bVar.f20913g) && this.f20914h == bVar.f20914h && this.f20915i == bVar.f20915i && this.f20916j == bVar.f20916j && this.f20917k == bVar.f20917k && o2.m0.c(this.f20918l, bVar.f20918l);
        }

        public int f() {
            return this.f20918l.f22446g;
        }

        public int g(long j7) {
            return this.f20918l.d(j7, this.f20915i);
        }

        public int h(long j7) {
            return this.f20918l.e(j7, this.f20915i);
        }

        public int hashCode() {
            Object obj = this.f20912f;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f20913g;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f20914h) * 31;
            long j7 = this.f20915i;
            int i7 = (hashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j8 = this.f20916j;
            return ((((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f20917k ? 1 : 0)) * 31) + this.f20918l.hashCode();
        }

        public long i(int i7) {
            return this.f20918l.c(i7).f22452f;
        }

        public long j() {
            return this.f20918l.f22447h;
        }

        public int k(int i7, int i8) {
            c.a c7 = this.f20918l.c(i7);
            if (c7.f22453g != -1) {
                return c7.f22455i[i8];
            }
            return 0;
        }

        public long l(int i7) {
            return this.f20918l.c(i7).f22457k;
        }

        public long m() {
            return this.f20915i;
        }

        public int n(int i7) {
            return this.f20918l.c(i7).e();
        }

        public int o(int i7, int i8) {
            return this.f20918l.c(i7).f(i8);
        }

        public long p() {
            return o2.m0.Y0(this.f20916j);
        }

        public long q() {
            return this.f20916j;
        }

        public int r() {
            return this.f20918l.f22449j;
        }

        public boolean s(int i7) {
            return !this.f20918l.c(i7).g();
        }

        public boolean t(int i7) {
            return this.f20918l.c(i7).f22458l;
        }

        public b v(Object obj, Object obj2, int i7, long j7, long j8) {
            return w(obj, obj2, i7, j7, j8, u1.c.f22442l, false);
        }

        public b w(Object obj, Object obj2, int i7, long j7, long j8, u1.c cVar, boolean z6) {
            this.f20912f = obj;
            this.f20913g = obj2;
            this.f20914h = i7;
            this.f20915i = j7;
            this.f20916j = j8;
            this.f20918l = cVar;
            this.f20917k = z6;
            return this;
        }
    }

    public static final class c extends r3 {

        /* renamed from: h, reason: collision with root package name */
        private final m4.q<d> f20919h;

        /* renamed from: i, reason: collision with root package name */
        private final m4.q<b> f20920i;

        /* renamed from: j, reason: collision with root package name */
        private final int[] f20921j;

        /* renamed from: k, reason: collision with root package name */
        private final int[] f20922k;

        public c(m4.q<d> qVar, m4.q<b> qVar2, int[] iArr) {
            o2.a.a(qVar.size() == iArr.length);
            this.f20919h = qVar;
            this.f20920i = qVar2;
            this.f20921j = iArr;
            this.f20922k = new int[iArr.length];
            for (int i7 = 0; i7 < iArr.length; i7++) {
                this.f20922k[iArr[i7]] = i7;
            }
        }

        @Override // r0.r3
        public int e(boolean z6) {
            if (u()) {
                return -1;
            }
            if (z6) {
                return this.f20921j[0];
            }
            return 0;
        }

        @Override // r0.r3
        public int f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // r0.r3
        public int g(boolean z6) {
            if (u()) {
                return -1;
            }
            return z6 ? this.f20921j[t() - 1] : t() - 1;
        }

        @Override // r0.r3
        public int i(int i7, int i8, boolean z6) {
            if (i8 == 1) {
                return i7;
            }
            if (i7 != g(z6)) {
                return z6 ? this.f20921j[this.f20922k[i7] + 1] : i7 + 1;
            }
            if (i8 == 2) {
                return e(z6);
            }
            return -1;
        }

        @Override // r0.r3
        public b k(int i7, b bVar, boolean z6) {
            b bVar2 = this.f20920i.get(i7);
            bVar.w(bVar2.f20912f, bVar2.f20913g, bVar2.f20914h, bVar2.f20915i, bVar2.f20916j, bVar2.f20918l, bVar2.f20917k);
            return bVar;
        }

        @Override // r0.r3
        public int m() {
            return this.f20920i.size();
        }

        @Override // r0.r3
        public int p(int i7, int i8, boolean z6) {
            if (i8 == 1) {
                return i7;
            }
            if (i7 != e(z6)) {
                return z6 ? this.f20921j[this.f20922k[i7] - 1] : i7 - 1;
            }
            if (i8 == 2) {
                return g(z6);
            }
            return -1;
        }

        @Override // r0.r3
        public Object q(int i7) {
            throw new UnsupportedOperationException();
        }

        @Override // r0.r3
        public d s(int i7, d dVar, long j7) {
            d dVar2 = this.f20919h.get(i7);
            dVar.j(dVar2.f20927f, dVar2.f20929h, dVar2.f20930i, dVar2.f20931j, dVar2.f20932k, dVar2.f20933l, dVar2.f20934m, dVar2.f20935n, dVar2.f20937p, dVar2.f20939r, dVar2.f20940s, dVar2.f20941t, dVar2.f20942u, dVar2.f20943v);
            dVar.f20938q = dVar2.f20938q;
            return dVar;
        }

        @Override // r0.r3
        public int t() {
            return this.f20919h.size();
        }
    }

    public static final class d implements i {

        /* renamed from: w, reason: collision with root package name */
        public static final Object f20923w = new Object();

        /* renamed from: x, reason: collision with root package name */
        private static final Object f20924x = new Object();

        /* renamed from: y, reason: collision with root package name */
        private static final a2 f20925y = new a2.c().c("com.google.android.exoplayer2.Timeline").f(Uri.EMPTY).a();

        /* renamed from: z, reason: collision with root package name */
        public static final i.a<d> f20926z = new i.a() { // from class: r0.t3
            @Override // r0.i.a
            public final i a(Bundle bundle) {
                r3.d b7;
                b7 = r3.d.b(bundle);
                return b7;
            }
        };

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public Object f20928g;

        /* renamed from: i, reason: collision with root package name */
        public Object f20930i;

        /* renamed from: j, reason: collision with root package name */
        public long f20931j;

        /* renamed from: k, reason: collision with root package name */
        public long f20932k;

        /* renamed from: l, reason: collision with root package name */
        public long f20933l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f20934m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f20935n;

        /* renamed from: o, reason: collision with root package name */
        @Deprecated
        public boolean f20936o;

        /* renamed from: p, reason: collision with root package name */
        public a2.g f20937p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f20938q;

        /* renamed from: r, reason: collision with root package name */
        public long f20939r;

        /* renamed from: s, reason: collision with root package name */
        public long f20940s;

        /* renamed from: t, reason: collision with root package name */
        public int f20941t;

        /* renamed from: u, reason: collision with root package name */
        public int f20942u;

        /* renamed from: v, reason: collision with root package name */
        public long f20943v;

        /* renamed from: f, reason: collision with root package name */
        public Object f20927f = f20923w;

        /* renamed from: h, reason: collision with root package name */
        public a2 f20929h = f20925y;

        /* JADX INFO: Access modifiers changed from: private */
        public static d b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(i(1));
            a2 a7 = bundle2 != null ? a2.f20391o.a(bundle2) : null;
            long j7 = bundle.getLong(i(2), -9223372036854775807L);
            long j8 = bundle.getLong(i(3), -9223372036854775807L);
            long j9 = bundle.getLong(i(4), -9223372036854775807L);
            boolean z6 = bundle.getBoolean(i(5), false);
            boolean z7 = bundle.getBoolean(i(6), false);
            Bundle bundle3 = bundle.getBundle(i(7));
            a2.g a8 = bundle3 != null ? a2.g.f20446l.a(bundle3) : null;
            boolean z8 = bundle.getBoolean(i(8), false);
            long j10 = bundle.getLong(i(9), 0L);
            long j11 = bundle.getLong(i(10), -9223372036854775807L);
            int i7 = bundle.getInt(i(11), 0);
            int i8 = bundle.getInt(i(12), 0);
            long j12 = bundle.getLong(i(13), 0L);
            d dVar = new d();
            dVar.j(f20924x, a7, null, j7, j8, j9, z6, z7, a8, j10, j11, i7, i8, j12);
            dVar.f20938q = z8;
            return dVar;
        }

        private static String i(int i7) {
            return Integer.toString(i7, 36);
        }

        public long c() {
            return o2.m0.a0(this.f20933l);
        }

        public long d() {
            return o2.m0.Y0(this.f20939r);
        }

        public long e() {
            return this.f20939r;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return o2.m0.c(this.f20927f, dVar.f20927f) && o2.m0.c(this.f20929h, dVar.f20929h) && o2.m0.c(this.f20930i, dVar.f20930i) && o2.m0.c(this.f20937p, dVar.f20937p) && this.f20931j == dVar.f20931j && this.f20932k == dVar.f20932k && this.f20933l == dVar.f20933l && this.f20934m == dVar.f20934m && this.f20935n == dVar.f20935n && this.f20938q == dVar.f20938q && this.f20939r == dVar.f20939r && this.f20940s == dVar.f20940s && this.f20941t == dVar.f20941t && this.f20942u == dVar.f20942u && this.f20943v == dVar.f20943v;
        }

        public long f() {
            return o2.m0.Y0(this.f20940s);
        }

        public long g() {
            return this.f20943v;
        }

        public boolean h() {
            o2.a.f(this.f20936o == (this.f20937p != null));
            return this.f20937p != null;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f20927f.hashCode()) * 31) + this.f20929h.hashCode()) * 31;
            Object obj = this.f20930i;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            a2.g gVar = this.f20937p;
            int hashCode3 = (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j7 = this.f20931j;
            int i7 = (hashCode3 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j8 = this.f20932k;
            int i8 = (i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
            long j9 = this.f20933l;
            int i9 = (((((((i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.f20934m ? 1 : 0)) * 31) + (this.f20935n ? 1 : 0)) * 31) + (this.f20938q ? 1 : 0)) * 31;
            long j10 = this.f20939r;
            int i10 = (i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f20940s;
            int i11 = (((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f20941t) * 31) + this.f20942u) * 31;
            long j12 = this.f20943v;
            return i11 + ((int) (j12 ^ (j12 >>> 32)));
        }

        public d j(Object obj, a2 a2Var, Object obj2, long j7, long j8, long j9, boolean z6, boolean z7, a2.g gVar, long j10, long j11, int i7, int i8, long j12) {
            a2.h hVar;
            this.f20927f = obj;
            this.f20929h = a2Var != null ? a2Var : f20925y;
            this.f20928g = (a2Var == null || (hVar = a2Var.f20393g) == null) ? null : hVar.f20465i;
            this.f20930i = obj2;
            this.f20931j = j7;
            this.f20932k = j8;
            this.f20933l = j9;
            this.f20934m = z6;
            this.f20935n = z7;
            this.f20936o = gVar != null;
            this.f20937p = gVar;
            this.f20939r = j10;
            this.f20940s = j11;
            this.f20941t = i7;
            this.f20942u = i8;
            this.f20943v = j12;
            this.f20938q = false;
            return this;
        }
    }

    protected r3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r3 b(Bundle bundle) {
        m4.q c7 = c(d.f20926z, o2.b.a(bundle, w(0)));
        m4.q c8 = c(b.f20911m, o2.b.a(bundle, w(1)));
        int[] intArray = bundle.getIntArray(w(2));
        if (intArray == null) {
            intArray = d(c7.size());
        }
        return new c(c7, c8, intArray);
    }

    private static <T extends i> m4.q<T> c(i.a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return m4.q.x();
        }
        q.a aVar2 = new q.a();
        m4.q<Bundle> a7 = h.a(iBinder);
        for (int i7 = 0; i7 < a7.size(); i7++) {
            aVar2.a(aVar.a(a7.get(i7)));
        }
        return aVar2.h();
    }

    private static int[] d(int i7) {
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = i8;
        }
        return iArr;
    }

    private static String w(int i7) {
        return Integer.toString(i7, 36);
    }

    public int e(boolean z6) {
        return u() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        int g7;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj;
        if (r3Var.t() != t() || r3Var.m() != m()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i7 = 0; i7 < t(); i7++) {
            if (!r(i7, dVar).equals(r3Var.r(i7, dVar2))) {
                return false;
            }
        }
        for (int i8 = 0; i8 < m(); i8++) {
            if (!k(i8, bVar, true).equals(r3Var.k(i8, bVar2, true))) {
                return false;
            }
        }
        int e7 = e(true);
        if (e7 != r3Var.e(true) || (g7 = g(true)) != r3Var.g(true)) {
            return false;
        }
        while (e7 != g7) {
            int i9 = i(e7, 0, true);
            if (i9 != r3Var.i(e7, 0, true)) {
                return false;
            }
            e7 = i9;
        }
        return true;
    }

    public abstract int f(Object obj);

    public int g(boolean z6) {
        if (u()) {
            return -1;
        }
        return t() - 1;
    }

    public final int h(int i7, b bVar, d dVar, int i8, boolean z6) {
        int i9 = j(i7, bVar).f20914h;
        if (r(i9, dVar).f20942u != i7) {
            return i7 + 1;
        }
        int i10 = i(i9, i8, z6);
        if (i10 == -1) {
            return -1;
        }
        return r(i10, dVar).f20941t;
    }

    public int hashCode() {
        int i7;
        d dVar = new d();
        b bVar = new b();
        int t6 = 217 + t();
        int i8 = 0;
        while (true) {
            i7 = t6 * 31;
            if (i8 >= t()) {
                break;
            }
            t6 = i7 + r(i8, dVar).hashCode();
            i8++;
        }
        int m7 = i7 + m();
        for (int i9 = 0; i9 < m(); i9++) {
            m7 = (m7 * 31) + k(i9, bVar, true).hashCode();
        }
        int e7 = e(true);
        while (e7 != -1) {
            m7 = (m7 * 31) + e7;
            e7 = i(e7, 0, true);
        }
        return m7;
    }

    public int i(int i7, int i8, boolean z6) {
        if (i8 == 0) {
            if (i7 == g(z6)) {
                return -1;
            }
            return i7 + 1;
        }
        if (i8 == 1) {
            return i7;
        }
        if (i8 == 2) {
            return i7 == g(z6) ? e(z6) : i7 + 1;
        }
        throw new IllegalStateException();
    }

    public final b j(int i7, b bVar) {
        return k(i7, bVar, false);
    }

    public abstract b k(int i7, b bVar, boolean z6);

    public b l(Object obj, b bVar) {
        return k(f(obj), bVar, true);
    }

    public abstract int m();

    public final Pair<Object, Long> n(d dVar, b bVar, int i7, long j7) {
        return (Pair) o2.a.e(o(dVar, bVar, i7, j7, 0L));
    }

    public final Pair<Object, Long> o(d dVar, b bVar, int i7, long j7, long j8) {
        o2.a.c(i7, 0, t());
        s(i7, dVar, j8);
        if (j7 == -9223372036854775807L) {
            j7 = dVar.e();
            if (j7 == -9223372036854775807L) {
                return null;
            }
        }
        int i8 = dVar.f20941t;
        j(i8, bVar);
        while (i8 < dVar.f20942u && bVar.f20916j != j7) {
            int i9 = i8 + 1;
            if (j(i9, bVar).f20916j > j7) {
                break;
            }
            i8 = i9;
        }
        k(i8, bVar, true);
        long j9 = j7 - bVar.f20916j;
        long j10 = bVar.f20915i;
        if (j10 != -9223372036854775807L) {
            j9 = Math.min(j9, j10 - 1);
        }
        return Pair.create(o2.a.e(bVar.f20913g), Long.valueOf(Math.max(0L, j9)));
    }

    public int p(int i7, int i8, boolean z6) {
        if (i8 == 0) {
            if (i7 == e(z6)) {
                return -1;
            }
            return i7 - 1;
        }
        if (i8 == 1) {
            return i7;
        }
        if (i8 == 2) {
            return i7 == e(z6) ? g(z6) : i7 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object q(int i7);

    public final d r(int i7, d dVar) {
        return s(i7, dVar, 0L);
    }

    public abstract d s(int i7, d dVar, long j7);

    public abstract int t();

    public final boolean u() {
        return t() == 0;
    }

    public final boolean v(int i7, b bVar, d dVar, int i8, boolean z6) {
        return h(i7, bVar, dVar, i8, z6) == -1;
    }
}
