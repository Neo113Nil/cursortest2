package n2;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import n2.f;

/* loaded from: classes.dex */
public interface f {

    public interface a {

        /* renamed from: n2.f$a$a, reason: collision with other inner class name */
        public static final class C0112a {

            /* renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C0113a> f19410a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: n2.f$a$a$a, reason: collision with other inner class name */
            static final class C0113a {

                /* renamed from: a, reason: collision with root package name */
                private final Handler f19411a;

                /* renamed from: b, reason: collision with root package name */
                private final a f19412b;

                /* renamed from: c, reason: collision with root package name */
                private boolean f19413c;

                public C0113a(Handler handler, a aVar) {
                    this.f19411a = handler;
                    this.f19412b = aVar;
                }

                public void d() {
                    this.f19413c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void d(C0113a c0113a, int i7, long j7, long j8) {
                c0113a.f19412b.Y(i7, j7, j8);
            }

            public void b(Handler handler, a aVar) {
                o2.a.e(handler);
                o2.a.e(aVar);
                e(aVar);
                this.f19410a.add(new C0113a(handler, aVar));
            }

            public void c(final int i7, final long j7, final long j8) {
                Iterator<C0113a> it = this.f19410a.iterator();
                while (it.hasNext()) {
                    final C0113a next = it.next();
                    if (!next.f19413c) {
                        next.f19411a.post(new Runnable() { // from class: n2.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.a.C0112a.d(f.a.C0112a.C0113a.this, i7, j7, j8);
                            }
                        });
                    }
                }
            }

            public void e(a aVar) {
                Iterator<C0113a> it = this.f19410a.iterator();
                while (it.hasNext()) {
                    C0113a next = it.next();
                    if (next.f19412b == aVar) {
                        next.d();
                        this.f19410a.remove(next);
                    }
                }
            }
        }

        void Y(int i7, long j7, long j8);
    }

    void b(Handler handler, a aVar);

    p0 c();

    long e();

    long f();

    void i(a aVar);
}
