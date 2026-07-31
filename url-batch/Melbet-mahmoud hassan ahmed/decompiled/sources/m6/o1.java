package m6;

import java.util.concurrent.CancellationException;
import y5.g;

/* loaded from: classes.dex */
public interface o1 extends g.b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f19317c = b.f19318f;

    public static final class a {
        public static /* synthetic */ void a(o1 o1Var, CancellationException cancellationException, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i7 & 1) != 0) {
                cancellationException = null;
            }
            o1Var.D(cancellationException);
        }

        public static <R> R b(o1 o1Var, R r7, f6.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(o1Var, r7, pVar);
        }

        public static <E extends g.b> E c(o1 o1Var, g.c<E> cVar) {
            return (E) g.b.a.b(o1Var, cVar);
        }

        public static /* synthetic */ x0 d(o1 o1Var, boolean z6, boolean z7, f6.l lVar, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i7 & 1) != 0) {
                z6 = false;
            }
            if ((i7 & 2) != 0) {
                z7 = true;
            }
            return o1Var.q(z6, z7, lVar);
        }

        public static y5.g e(o1 o1Var, g.c<?> cVar) {
            return g.b.a.c(o1Var, cVar);
        }

        public static y5.g f(o1 o1Var, y5.g gVar) {
            return g.b.a.d(o1Var, gVar);
        }
    }

    public static final class b implements g.c<o1> {

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ b f19318f = new b();

        private b() {
        }
    }

    void D(CancellationException cancellationException);

    boolean b();

    boolean f();

    q i(s sVar);

    x0 q(boolean z6, boolean z7, f6.l<? super Throwable, v5.q> lVar);

    CancellationException x();
}
