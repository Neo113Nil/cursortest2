package t1;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import r0.s1;
import t1.e0;
import t1.x;

/* loaded from: classes.dex */
public interface e0 {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f22003a;

        /* renamed from: b, reason: collision with root package name */
        public final x.b f22004b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0139a> f22005c;

        /* renamed from: d, reason: collision with root package name */
        private final long f22006d;

        /* renamed from: t1.e0$a$a, reason: collision with other inner class name */
        private static final class C0139a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f22007a;

            /* renamed from: b, reason: collision with root package name */
            public e0 f22008b;

            public C0139a(Handler handler, e0 e0Var) {
                this.f22007a = handler;
                this.f22008b = e0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private a(CopyOnWriteArrayList<C0139a> copyOnWriteArrayList, int i7, x.b bVar, long j7) {
            this.f22005c = copyOnWriteArrayList;
            this.f22003a = i7;
            this.f22004b = bVar;
            this.f22006d = j7;
        }

        private long h(long j7) {
            long Y0 = o2.m0.Y0(j7);
            if (Y0 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f22006d + Y0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(e0 e0Var, t tVar) {
            e0Var.O(this.f22003a, this.f22004b, tVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(e0 e0Var, q qVar, t tVar) {
            e0Var.C(this.f22003a, this.f22004b, qVar, tVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(e0 e0Var, q qVar, t tVar) {
            e0Var.I(this.f22003a, this.f22004b, qVar, tVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(e0 e0Var, q qVar, t tVar, IOException iOException, boolean z6) {
            e0Var.Q(this.f22003a, this.f22004b, qVar, tVar, iOException, z6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(e0 e0Var, q qVar, t tVar) {
            e0Var.X(this.f22003a, this.f22004b, qVar, tVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(e0 e0Var, x.b bVar, t tVar) {
            e0Var.J(this.f22003a, bVar, tVar);
        }

        public void A(q qVar, int i7, int i8, s1 s1Var, int i9, Object obj, long j7, long j8) {
            B(qVar, new t(i7, i8, s1Var, i9, obj, h(j7), h(j8)));
        }

        public void B(final q qVar, final t tVar) {
            Iterator<C0139a> it = this.f22005c.iterator();
            while (it.hasNext()) {
                C0139a next = it.next();
                final e0 e0Var = next.f22008b;
                o2.m0.K0(next.f22007a, new Runnable() { // from class: t1.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        e0.a.this.o(e0Var, qVar, tVar);
                    }
                });
            }
        }

        public void C(e0 e0Var) {
            Iterator<C0139a> it = this.f22005c.iterator();
            while (it.hasNext()) {
                C0139a next = it.next();
                if (next.f22008b == e0Var) {
                    this.f22005c.remove(next);
                }
            }
        }

        public void D(int i7, long j7, long j8) {
            E(new t(1, i7, null, 3, null, h(j7), h(j8)));
        }

        public void E(final t tVar) {
            final x.b bVar = (x.b) o2.a.e(this.f22004b);
            Iterator<C0139a> it = this.f22005c.iterator();
            while (it.hasNext()) {
                C0139a next = it.next();
                final e0 e0Var = next.f22008b;
                o2.m0.K0(next.f22007a, new Runnable() { // from class: t1.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        e0.a.this.p(e0Var, bVar, tVar);
                    }
                });
            }
        }

        public a F(int i7, x.b bVar, long j7) {
            return new a(this.f22005c, i7, bVar, j7);
        }

        public void g(Handler handler, e0 e0Var) {
            o2.a.e(handler);
            o2.a.e(e0Var);
            this.f22005c.add(new C0139a(handler, e0Var));
        }

        public void i(int i7, s1 s1Var, int i8, Object obj, long j7) {
            j(new t(1, i7, s1Var, i8, obj, h(j7), -9223372036854775807L));
        }

        public void j(final t tVar) {
            Iterator<C0139a> it = this.f22005c.iterator();
            while (it.hasNext()) {
                C0139a next = it.next();
                final e0 e0Var = next.f22008b;
                o2.m0.K0(next.f22007a, new Runnable() { // from class: t1.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        e0.a.this.k(e0Var, tVar);
                    }
                });
            }
        }

        public void q(q qVar, int i7) {
            r(qVar, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void r(q qVar, int i7, int i8, s1 s1Var, int i9, Object obj, long j7, long j8) {
            s(qVar, new t(i7, i8, s1Var, i9, obj, h(j7), h(j8)));
        }

        public void s(final q qVar, final t tVar) {
            Iterator<C0139a> it = this.f22005c.iterator();
            while (it.hasNext()) {
                C0139a next = it.next();
                final e0 e0Var = next.f22008b;
                o2.m0.K0(next.f22007a, new Runnable() { // from class: t1.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        e0.a.this.l(e0Var, qVar, tVar);
                    }
                });
            }
        }

        public void t(q qVar, int i7) {
            u(qVar, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void u(q qVar, int i7, int i8, s1 s1Var, int i9, Object obj, long j7, long j8) {
            v(qVar, new t(i7, i8, s1Var, i9, obj, h(j7), h(j8)));
        }

        public void v(final q qVar, final t tVar) {
            Iterator<C0139a> it = this.f22005c.iterator();
            while (it.hasNext()) {
                C0139a next = it.next();
                final e0 e0Var = next.f22008b;
                o2.m0.K0(next.f22007a, new Runnable() { // from class: t1.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        e0.a.this.m(e0Var, qVar, tVar);
                    }
                });
            }
        }

        public void w(q qVar, int i7, int i8, s1 s1Var, int i9, Object obj, long j7, long j8, IOException iOException, boolean z6) {
            y(qVar, new t(i7, i8, s1Var, i9, obj, h(j7), h(j8)), iOException, z6);
        }

        public void x(q qVar, int i7, IOException iOException, boolean z6) {
            w(qVar, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z6);
        }

        public void y(final q qVar, final t tVar, final IOException iOException, final boolean z6) {
            Iterator<C0139a> it = this.f22005c.iterator();
            while (it.hasNext()) {
                C0139a next = it.next();
                final e0 e0Var = next.f22008b;
                o2.m0.K0(next.f22007a, new Runnable() { // from class: t1.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        e0.a.this.n(e0Var, qVar, tVar, iOException, z6);
                    }
                });
            }
        }

        public void z(q qVar, int i7) {
            A(qVar, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
    }

    void C(int i7, x.b bVar, q qVar, t tVar);

    void I(int i7, x.b bVar, q qVar, t tVar);

    void J(int i7, x.b bVar, t tVar);

    void O(int i7, x.b bVar, t tVar);

    void Q(int i7, x.b bVar, q qVar, t tVar, IOException iOException, boolean z6);

    void X(int i7, x.b bVar, q qVar, t tVar);
}
