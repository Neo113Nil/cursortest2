package t0;

import android.os.Handler;
import o2.m0;
import r0.s1;
import t0.s;

/* loaded from: classes.dex */
public interface s {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f21827a;

        /* renamed from: b, reason: collision with root package name */
        private final s f21828b;

        public a(Handler handler, s sVar) {
            this.f21827a = sVar != null ? (Handler) o2.a.e(handler) : null;
            this.f21828b = sVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void A(int i7, long j7, long j8) {
            ((s) m0.j(this.f21828b)).w(i7, j7, j8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(Exception exc) {
            ((s) m0.j(this.f21828b)).l(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(Exception exc) {
            ((s) m0.j(this.f21828b)).c(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(String str, long j7, long j8) {
            ((s) m0.j(this.f21828b)).q(str, j7, j8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(String str) {
            ((s) m0.j(this.f21828b)).p(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(u0.e eVar) {
            eVar.c();
            ((s) m0.j(this.f21828b)).t(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(u0.e eVar) {
            ((s) m0.j(this.f21828b)).h(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(s1 s1Var, u0.i iVar) {
            ((s) m0.j(this.f21828b)).C(s1Var);
            ((s) m0.j(this.f21828b)).m(s1Var, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(long j7) {
            ((s) m0.j(this.f21828b)).k(j7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(boolean z6) {
            ((s) m0.j(this.f21828b)).b(z6);
        }

        public void B(final long j7) {
            Handler handler = this.f21827a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t0.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.y(j7);
                    }
                });
            }
        }

        public void C(final boolean z6) {
            Handler handler = this.f21827a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t0.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.z(z6);
                    }
                });
            }
        }

        public void D(final int i7, final long j7, final long j8) {
            Handler handler = this.f21827a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t0.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.A(i7, j7, j8);
                    }
                });
            }
        }

        public void k(final Exception exc) {
            Handler handler = this.f21827a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t0.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.r(exc);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Handler handler = this.f21827a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t0.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.s(exc);
                    }
                });
            }
        }

        public void m(final String str, final long j7, final long j8) {
            Handler handler = this.f21827a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t0.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.t(str, j7, j8);
                    }
                });
            }
        }

        public void n(final String str) {
            Handler handler = this.f21827a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t0.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.u(str);
                    }
                });
            }
        }

        public void o(final u0.e eVar) {
            eVar.c();
            Handler handler = this.f21827a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t0.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.v(eVar);
                    }
                });
            }
        }

        public void p(final u0.e eVar) {
            Handler handler = this.f21827a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t0.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.w(eVar);
                    }
                });
            }
        }

        public void q(final s1 s1Var, final u0.i iVar) {
            Handler handler = this.f21827a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t0.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        s.a.this.x(s1Var, iVar);
                    }
                });
            }
        }
    }

    @Deprecated
    void C(s1 s1Var);

    void b(boolean z6);

    void c(Exception exc);

    void h(u0.e eVar);

    void k(long j7);

    void l(Exception exc);

    void m(s1 s1Var, u0.i iVar);

    void p(String str);

    void q(String str, long j7, long j8);

    void t(u0.e eVar);

    void w(int i7, long j7, long j8);
}
