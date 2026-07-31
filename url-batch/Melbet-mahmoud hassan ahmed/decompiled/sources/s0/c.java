package s0;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import r0.a2;
import r0.f2;
import r0.r2;
import r0.r3;
import r0.u2;
import r0.v2;
import r0.w3;
import t1.x;

/* loaded from: classes.dex */
public interface c {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f21392a;

        /* renamed from: b, reason: collision with root package name */
        public final r3 f21393b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21394c;

        /* renamed from: d, reason: collision with root package name */
        public final x.b f21395d;

        /* renamed from: e, reason: collision with root package name */
        public final long f21396e;

        /* renamed from: f, reason: collision with root package name */
        public final r3 f21397f;

        /* renamed from: g, reason: collision with root package name */
        public final int f21398g;

        /* renamed from: h, reason: collision with root package name */
        public final x.b f21399h;

        /* renamed from: i, reason: collision with root package name */
        public final long f21400i;

        /* renamed from: j, reason: collision with root package name */
        public final long f21401j;

        public a(long j7, r3 r3Var, int i7, x.b bVar, long j8, r3 r3Var2, int i8, x.b bVar2, long j9, long j10) {
            this.f21392a = j7;
            this.f21393b = r3Var;
            this.f21394c = i7;
            this.f21395d = bVar;
            this.f21396e = j8;
            this.f21397f = r3Var2;
            this.f21398g = i8;
            this.f21399h = bVar2;
            this.f21400i = j9;
            this.f21401j = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f21392a == aVar.f21392a && this.f21394c == aVar.f21394c && this.f21396e == aVar.f21396e && this.f21398g == aVar.f21398g && this.f21400i == aVar.f21400i && this.f21401j == aVar.f21401j && l4.i.a(this.f21393b, aVar.f21393b) && l4.i.a(this.f21395d, aVar.f21395d) && l4.i.a(this.f21397f, aVar.f21397f) && l4.i.a(this.f21399h, aVar.f21399h);
        }

        public int hashCode() {
            return l4.i.b(Long.valueOf(this.f21392a), this.f21393b, Integer.valueOf(this.f21394c), this.f21395d, Long.valueOf(this.f21396e), this.f21397f, Integer.valueOf(this.f21398g), this.f21399h, Long.valueOf(this.f21400i), Long.valueOf(this.f21401j));
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final o2.l f21402a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<a> f21403b;

        public b(o2.l lVar, SparseArray<a> sparseArray) {
            this.f21402a = lVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(lVar.c());
            for (int i7 = 0; i7 < lVar.c(); i7++) {
                int b7 = lVar.b(i7);
                sparseArray2.append(b7, (a) o2.a.e(sparseArray.get(b7)));
            }
            this.f21403b = sparseArray2;
        }

        public boolean a(int i7) {
            return this.f21402a.a(i7);
        }

        public int b(int i7) {
            return this.f21402a.b(i7);
        }

        public a c(int i7) {
            return (a) o2.a.e(this.f21403b.get(i7));
        }

        public int d() {
            return this.f21402a.c();
        }
    }

    void A(a aVar, long j7, int i7);

    void B(a aVar, t1.q qVar, t1.t tVar);

    @Deprecated
    void C(a aVar, List<c2.b> list);

    void D(a aVar, boolean z6);

    void E(a aVar, r0.s1 s1Var, u0.i iVar);

    void F(a aVar);

    void G(a aVar, v2.b bVar);

    void H(a aVar, Exception exc);

    void I(a aVar, t1.q qVar, t1.t tVar, IOException iOException, boolean z6);

    void J(a aVar, float f7);

    void K(a aVar, int i7);

    void L(a aVar, long j7);

    void M(a aVar, boolean z6);

    void N(a aVar, Exception exc);

    void O(a aVar, Exception exc);

    @Deprecated
    void P(a aVar, int i7, u0.e eVar);

    void Q(a aVar, a2 a2Var, int i7);

    void R(a aVar, int i7, long j7, long j8);

    void S(a aVar, t1.q qVar, t1.t tVar);

    @Deprecated
    void T(a aVar, boolean z6, int i7);

    void U(a aVar, u2 u2Var);

    void V(a aVar, Exception exc);

    @Deprecated
    void W(a aVar, int i7, u0.e eVar);

    void X(a aVar, String str);

    void Y(a aVar, v2.e eVar, v2.e eVar2, int i7);

    void Z(v2 v2Var, b bVar);

    @Deprecated
    void a(a aVar, int i7, r0.s1 s1Var);

    @Deprecated
    void a0(a aVar);

    void b(a aVar);

    void b0(a aVar, u0.e eVar);

    void c(a aVar, boolean z6, int i7);

    void c0(a aVar, c2.e eVar);

    void d(a aVar, int i7);

    void d0(a aVar);

    void e(a aVar, int i7, boolean z6);

    void e0(a aVar, p2.z zVar);

    void f(a aVar, w3 w3Var);

    void f0(a aVar, u0.e eVar);

    @Deprecated
    void g(a aVar);

    void g0(a aVar, int i7);

    @Deprecated
    void h(a aVar, boolean z6);

    void h0(a aVar, r2 r2Var);

    void i(a aVar, r0.s1 s1Var, u0.i iVar);

    void i0(a aVar, j1.a aVar2);

    void j(a aVar, int i7);

    @Deprecated
    void j0(a aVar, String str, long j7);

    void k(a aVar, t1.q qVar, t1.t tVar);

    @Deprecated
    void l(a aVar);

    void l0(a aVar, t0.e eVar);

    void m(a aVar, t1.t tVar);

    void m0(a aVar, f2 f2Var);

    void n(a aVar, String str);

    void n0(a aVar, String str, long j7, long j8);

    void o(a aVar, int i7, int i8);

    @Deprecated
    void o0(a aVar, String str, long j7);

    @Deprecated
    void p(a aVar, int i7, int i8, int i9, float f7);

    @Deprecated
    void p0(a aVar, r0.s1 s1Var);

    void q(a aVar, t1.t tVar);

    void r0(a aVar, int i7, long j7, long j8);

    void s(a aVar, u0.e eVar);

    void s0(a aVar, u0.e eVar);

    void t(a aVar);

    void t0(a aVar);

    void u0(a aVar, r2 r2Var);

    void v(a aVar, int i7);

    void v0(a aVar, r0.p pVar);

    void w(a aVar, String str, long j7, long j8);

    @Deprecated
    void w0(a aVar, r0.s1 s1Var);

    void x(a aVar, boolean z6);

    void x0(a aVar, boolean z6);

    @Deprecated
    void y(a aVar, int i7, String str, long j7);

    void y0(a aVar, int i7, long j7);

    @Deprecated
    void z(a aVar, int i7);

    void z0(a aVar, Object obj, long j7);
}
