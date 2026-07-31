package p2;

import android.os.Handler;
import android.os.SystemClock;
import o2.m0;
import p2.x;
import r0.s1;

/* loaded from: classes.dex */
public interface x {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f20101a;

        /* renamed from: b, reason: collision with root package name */
        private final x f20102b;

        public a(Handler handler, x xVar) {
            this.f20101a = xVar != null ? (Handler) o2.a.e(handler) : null;
            this.f20102b = xVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(String str, long j7, long j8) {
            ((x) m0.j(this.f20102b)).g(str, j7, j8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(String str) {
            ((x) m0.j(this.f20102b)).d(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(u0.e eVar) {
            eVar.c();
            ((x) m0.j(this.f20102b)).o(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(int i7, long j7) {
            ((x) m0.j(this.f20102b)).x(i7, j7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(u0.e eVar) {
            ((x) m0.j(this.f20102b)).v(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(s1 s1Var, u0.i iVar) {
            ((x) m0.j(this.f20102b)).F(s1Var);
            ((x) m0.j(this.f20102b)).e(s1Var, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(Object obj, long j7) {
            ((x) m0.j(this.f20102b)).f(obj, j7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(long j7, int i7) {
            ((x) m0.j(this.f20102b)).y(j7, i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(Exception exc) {
            ((x) m0.j(this.f20102b)).n(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(z zVar) {
            ((x) m0.j(this.f20102b)).r(zVar);
        }

        public void A(final Object obj) {
            if (this.f20101a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f20101a.post(new Runnable() { // from class: p2.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.w(obj, elapsedRealtime);
                    }
                });
            }
        }

        public void B(final long j7, final int i7) {
            Handler handler = this.f20101a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p2.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.x(j7, i7);
                    }
                });
            }
        }

        public void C(final Exception exc) {
            Handler handler = this.f20101a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p2.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.y(exc);
                    }
                });
            }
        }

        public void D(final z zVar) {
            Handler handler = this.f20101a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p2.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.z(zVar);
                    }
                });
            }
        }

        public void k(final String str, final long j7, final long j8) {
            Handler handler = this.f20101a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p2.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.q(str, j7, j8);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f20101a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p2.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.r(str);
                    }
                });
            }
        }

        public void m(final u0.e eVar) {
            eVar.c();
            Handler handler = this.f20101a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p2.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.s(eVar);
                    }
                });
            }
        }

        public void n(final int i7, final long j7) {
            Handler handler = this.f20101a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p2.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.t(i7, j7);
                    }
                });
            }
        }

        public void o(final u0.e eVar) {
            Handler handler = this.f20101a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p2.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.u(eVar);
                    }
                });
            }
        }

        public void p(final s1 s1Var, final u0.i iVar) {
            Handler handler = this.f20101a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: p2.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.a.this.v(s1Var, iVar);
                    }
                });
            }
        }
    }

    @Deprecated
    void F(s1 s1Var);

    void d(String str);

    void e(s1 s1Var, u0.i iVar);

    void f(Object obj, long j7);

    void g(String str, long j7, long j8);

    void n(Exception exc);

    void o(u0.e eVar);

    void r(z zVar);

    void v(u0.e eVar);

    void x(int i7, long j7);

    void y(long j7, int i7);
}
