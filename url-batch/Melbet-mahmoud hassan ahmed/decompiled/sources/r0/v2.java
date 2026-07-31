package r0;

import android.os.Bundle;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import o2.l;
import r0.i;
import r0.v2;

/* loaded from: classes.dex */
public interface v2 {

    public static final class b implements i {

        /* renamed from: g, reason: collision with root package name */
        public static final b f21058g = new a().e();

        /* renamed from: h, reason: collision with root package name */
        public static final i.a<b> f21059h = new i.a() { // from class: r0.w2
            @Override // r0.i.a
            public final i a(Bundle bundle) {
                v2.b c7;
                c7 = v2.b.c(bundle);
                return c7;
            }
        };

        /* renamed from: f, reason: collision with root package name */
        private final o2.l f21060f;

        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            private static final int[] f21061b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            /* renamed from: a, reason: collision with root package name */
            private final l.b f21062a = new l.b();

            public a a(int i7) {
                this.f21062a.a(i7);
                return this;
            }

            public a b(b bVar) {
                this.f21062a.b(bVar.f21060f);
                return this;
            }

            public a c(int... iArr) {
                this.f21062a.c(iArr);
                return this;
            }

            public a d(int i7, boolean z6) {
                this.f21062a.d(i7, z6);
                return this;
            }

            public b e() {
                return new b(this.f21062a.e());
            }
        }

        private b(o2.l lVar) {
            this.f21060f = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(d(0));
            if (integerArrayList == null) {
                return f21058g;
            }
            a aVar = new a();
            for (int i7 = 0; i7 < integerArrayList.size(); i7++) {
                aVar.a(integerArrayList.get(i7).intValue());
            }
            return aVar.e();
        }

        private static String d(int i7) {
            return Integer.toString(i7, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f21060f.equals(((b) obj).f21060f);
            }
            return false;
        }

        public int hashCode() {
            return this.f21060f.hashCode();
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final o2.l f21063a;

        public c(o2.l lVar) {
            this.f21063a = lVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f21063a.equals(((c) obj).f21063a);
            }
            return false;
        }

        public int hashCode() {
            return this.f21063a.hashCode();
        }
    }

    public interface d {
        @Deprecated
        void A(boolean z6, int i7);

        void B(w3 w3Var);

        @Deprecated
        void E(boolean z6);

        @Deprecated
        void F(int i7);

        void G(v2 v2Var, c cVar);

        void H(e eVar, e eVar2, int i7);

        void K(boolean z6);

        void L();

        @Deprecated
        void M();

        void R(float f7);

        void T(b bVar);

        void V(int i7);

        void W(boolean z6, int i7);

        void a0(boolean z6);

        void b(boolean z6);

        void b0(r3 r3Var, int i7);

        void c0(int i7, int i8);

        void e0(f2 f2Var);

        void f0(t0.e eVar);

        @Deprecated
        void i(List<c2.b> list);

        void i0(r2 r2Var);

        void j(u2 u2Var);

        void j0(p pVar);

        void l0(r2 r2Var);

        void m0(int i7, boolean z6);

        void n0(int i7);

        void o0(a2 a2Var, int i7);

        void p0(boolean z6);

        void r(p2.z zVar);

        void s(c2.e eVar);

        void u(j1.a aVar);

        void z(int i7);
    }

    public static final class e implements i {

        /* renamed from: p, reason: collision with root package name */
        public static final i.a<e> f21064p = new i.a() { // from class: r0.y2
            @Override // r0.i.a
            public final i a(Bundle bundle) {
                v2.e b7;
                b7 = v2.e.b(bundle);
                return b7;
            }
        };

        /* renamed from: f, reason: collision with root package name */
        public final Object f21065f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public final int f21066g;

        /* renamed from: h, reason: collision with root package name */
        public final int f21067h;

        /* renamed from: i, reason: collision with root package name */
        public final a2 f21068i;

        /* renamed from: j, reason: collision with root package name */
        public final Object f21069j;

        /* renamed from: k, reason: collision with root package name */
        public final int f21070k;

        /* renamed from: l, reason: collision with root package name */
        public final long f21071l;

        /* renamed from: m, reason: collision with root package name */
        public final long f21072m;

        /* renamed from: n, reason: collision with root package name */
        public final int f21073n;

        /* renamed from: o, reason: collision with root package name */
        public final int f21074o;

        public e(Object obj, int i7, a2 a2Var, Object obj2, int i8, long j7, long j8, int i9, int i10) {
            this.f21065f = obj;
            this.f21066g = i7;
            this.f21067h = i7;
            this.f21068i = a2Var;
            this.f21069j = obj2;
            this.f21070k = i8;
            this.f21071l = j7;
            this.f21072m = j8;
            this.f21073n = i9;
            this.f21074o = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e b(Bundle bundle) {
            int i7 = bundle.getInt(c(0), -1);
            Bundle bundle2 = bundle.getBundle(c(1));
            return new e(null, i7, bundle2 == null ? null : a2.f20391o.a(bundle2), null, bundle.getInt(c(2), -1), bundle.getLong(c(3), -9223372036854775807L), bundle.getLong(c(4), -9223372036854775807L), bundle.getInt(c(5), -1), bundle.getInt(c(6), -1));
        }

        private static String c(int i7) {
            return Integer.toString(i7, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f21067h == eVar.f21067h && this.f21070k == eVar.f21070k && this.f21071l == eVar.f21071l && this.f21072m == eVar.f21072m && this.f21073n == eVar.f21073n && this.f21074o == eVar.f21074o && l4.i.a(this.f21065f, eVar.f21065f) && l4.i.a(this.f21069j, eVar.f21069j) && l4.i.a(this.f21068i, eVar.f21068i);
        }

        public int hashCode() {
            return l4.i.b(this.f21065f, Integer.valueOf(this.f21067h), this.f21068i, this.f21069j, Integer.valueOf(this.f21070k), Long.valueOf(this.f21071l), Long.valueOf(this.f21072m), Integer.valueOf(this.f21073n), Integer.valueOf(this.f21074o));
        }
    }

    int A();

    void B();

    boolean C();

    int D();

    int D0();

    boolean E();

    int G();

    long H();

    r3 I();

    void I0(long j7);

    int K();

    boolean L();

    long N();

    boolean O();

    int T();

    void W();

    void X(int i7);

    void a();

    u2 d();

    void e(u2 u2Var);

    void g(float f7);

    r2 h();

    void i(boolean z6);

    void j(Surface surface);

    boolean k();

    long l();

    long m();

    void n(int i7, long j7);

    long o();

    boolean p();

    boolean q();

    void r(boolean z6);

    void s();

    void u(d dVar);

    w3 v();

    boolean x();

    int y();

    int z();
}
