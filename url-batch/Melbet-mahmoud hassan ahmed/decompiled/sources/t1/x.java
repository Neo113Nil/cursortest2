package t1;

import android.os.Handler;
import r0.a2;
import r0.r3;
import s0.u1;

/* loaded from: classes.dex */
public interface x {

    public interface a {
    }

    public static final class b extends v {
        public b(Object obj) {
            super(obj);
        }

        public b(Object obj, int i7, int i8, long j7) {
            super(obj, i7, i8, j7);
        }

        public b(Object obj, long j7) {
            super(obj, j7);
        }

        public b(Object obj, long j7, int i7) {
            super(obj, j7, i7);
        }

        public b(v vVar) {
            super(vVar);
        }

        public b c(Object obj) {
            return new b(super.a(obj));
        }
    }

    public interface c {
        void a(x xVar, r3 r3Var);
    }

    a2 a();

    void b(e0 e0Var);

    void c();

    void d(Handler handler, e0 e0Var);

    void e(u uVar);

    boolean f();

    r3 g();

    void i(c cVar, n2.p0 p0Var, u1 u1Var);

    u j(b bVar, n2.b bVar2, long j7);

    void k(c cVar);

    void n(c cVar);

    void p(c cVar);

    void q(v0.w wVar);

    void r(Handler handler, v0.w wVar);
}
