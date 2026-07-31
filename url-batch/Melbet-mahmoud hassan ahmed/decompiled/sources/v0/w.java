package v0;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import t1.x;
import v0.w;

/* loaded from: classes.dex */
public interface w {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f22710a;

        /* renamed from: b, reason: collision with root package name */
        public final x.b f22711b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0145a> f22712c;

        /* renamed from: v0.w$a$a, reason: collision with other inner class name */
        private static final class C0145a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f22713a;

            /* renamed from: b, reason: collision with root package name */
            public w f22714b;

            public C0145a(Handler handler, w wVar) {
                this.f22713a = handler;
                this.f22714b = wVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList<C0145a> copyOnWriteArrayList, int i7, x.b bVar) {
            this.f22712c = copyOnWriteArrayList;
            this.f22710a = i7;
            this.f22711b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(w wVar) {
            wVar.S(this.f22710a, this.f22711b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(w wVar) {
            wVar.N(this.f22710a, this.f22711b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(w wVar) {
            wVar.g0(this.f22710a, this.f22711b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(w wVar, int i7) {
            wVar.U(this.f22710a, this.f22711b);
            wVar.q0(this.f22710a, this.f22711b, i7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(w wVar, Exception exc) {
            wVar.h0(this.f22710a, this.f22711b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(w wVar) {
            wVar.d0(this.f22710a, this.f22711b);
        }

        public void g(Handler handler, w wVar) {
            o2.a.e(handler);
            o2.a.e(wVar);
            this.f22712c.add(new C0145a(handler, wVar));
        }

        public void h() {
            Iterator<C0145a> it = this.f22712c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                final w wVar = next.f22714b;
                o2.m0.K0(next.f22713a, new Runnable() { // from class: v0.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.n(wVar);
                    }
                });
            }
        }

        public void i() {
            Iterator<C0145a> it = this.f22712c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                final w wVar = next.f22714b;
                o2.m0.K0(next.f22713a, new Runnable() { // from class: v0.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.o(wVar);
                    }
                });
            }
        }

        public void j() {
            Iterator<C0145a> it = this.f22712c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                final w wVar = next.f22714b;
                o2.m0.K0(next.f22713a, new Runnable() { // from class: v0.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.p(wVar);
                    }
                });
            }
        }

        public void k(final int i7) {
            Iterator<C0145a> it = this.f22712c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                final w wVar = next.f22714b;
                o2.m0.K0(next.f22713a, new Runnable() { // from class: v0.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.q(wVar, i7);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Iterator<C0145a> it = this.f22712c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                final w wVar = next.f22714b;
                o2.m0.K0(next.f22713a, new Runnable() { // from class: v0.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.r(wVar, exc);
                    }
                });
            }
        }

        public void m() {
            Iterator<C0145a> it = this.f22712c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                final w wVar = next.f22714b;
                o2.m0.K0(next.f22713a, new Runnable() { // from class: v0.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a.this.s(wVar);
                    }
                });
            }
        }

        public void t(w wVar) {
            Iterator<C0145a> it = this.f22712c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                if (next.f22714b == wVar) {
                    this.f22712c.remove(next);
                }
            }
        }

        public a u(int i7, x.b bVar) {
            return new a(this.f22712c, i7, bVar);
        }
    }

    void N(int i7, x.b bVar);

    void S(int i7, x.b bVar);

    @Deprecated
    void U(int i7, x.b bVar);

    void d0(int i7, x.b bVar);

    void g0(int i7, x.b bVar);

    void h0(int i7, x.b bVar, Exception exc);

    void q0(int i7, x.b bVar, int i8);
}
