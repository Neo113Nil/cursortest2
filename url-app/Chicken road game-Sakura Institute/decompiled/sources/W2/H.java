package W2;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public abstract class H extends d3.i {

    /* renamed from: i, reason: collision with root package name */
    public int f4224i;

    public H(int i2) {
        super(0L, false);
        this.f4224i = i2;
    }

    public void b(CancellationException cancellationException) {
    }

    public abstract C2.a d();

    public Throwable f(Object obj) {
        C0294p c0294p = obj instanceof C0294p ? (C0294p) obj : null;
        if (c0294p != null) {
            return c0294p.f4291a;
        }
        return null;
    }

    public Object g(Object obj) {
        return obj;
    }

    public final void h(Throwable th) {
        B.i(new A("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), d().p());
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C2.a d4 = d();
            Intrinsics.d(d4, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            b3.f fVar = (b3.f) d4;
            E2.c cVar = fVar.f5656k;
            Object obj = fVar.f5658m;
            CoroutineContext p4 = cVar.p();
            Object c4 = b3.v.c(p4, obj);
            InterfaceC0280c0 interfaceC0280c0 = null;
            A0 b4 = c4 != b3.v.f5691a ? AbstractC0296s.b(cVar, p4, c4) : null;
            try {
                CoroutineContext p5 = cVar.p();
                Object i2 = i();
                Throwable f4 = f(i2);
                if (f4 == null && I.a(this.f4224i)) {
                    interfaceC0280c0 = (InterfaceC0280c0) p5.k(C0299v.f4296e);
                }
                if (interfaceC0280c0 != null && !interfaceC0280c0.b()) {
                    CancellationException g4 = interfaceC0280c0.g();
                    b(g4);
                    AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                    cVar.u(AbstractC1343r.a(g4));
                } else if (f4 != null) {
                    AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                    cVar.u(AbstractC1343r.a(f4));
                } else {
                    AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
                    cVar.u(g(i2));
                }
                Unit unit = Unit.f7487a;
                if (b4 == null || b4.k0()) {
                    b3.v.a(p4, c4);
                }
            } catch (Throwable th) {
                if (b4 == null || b4.k0()) {
                    b3.v.a(p4, c4);
                }
                throw th;
            }
        } catch (Throwable th2) {
            h(th2);
        }
    }
}
