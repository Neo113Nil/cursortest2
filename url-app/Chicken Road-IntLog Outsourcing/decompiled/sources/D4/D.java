package D4;

import f4.AbstractC0432i;
import java.util.concurrent.CancellationException;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public abstract class D extends K4.h {

    /* renamed from: c, reason: collision with root package name */
    public int f458c;

    public D(int i2) {
        super(0L, K4.k.f1451g);
        this.f458c = i2;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract InterfaceC1218d c();

    public Throwable e(Object obj) {
        C0016p c0016p = obj instanceof C0016p ? (C0016p) obj : null;
        if (c0016p != null) {
            return c0016p.f526a;
        }
        return null;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            K1.b.C(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.i.b(th);
        AbstractC0024y.j(new C0023x("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = f4.v.f5689a;
        K4.i iVar = this.f1442b;
        try {
            InterfaceC1218d c2 = c();
            kotlin.jvm.internal.i.c(c2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            I4.h hVar = (I4.h) c2;
            AbstractC1295c abstractC1295c = hVar.f1295e;
            Object obj2 = hVar.f1297g;
            InterfaceC1223i context = abstractC1295c.getContext();
            Object n6 = I4.a.n(context, obj2);
            v0 v4 = n6 != I4.a.f1285f ? AbstractC0024y.v(abstractC1295c, context, n6) : null;
            try {
                InterfaceC1223i context2 = abstractC1295c.getContext();
                Object i2 = i();
                Throwable e3 = e(i2);
                X x5 = (e3 == null && AbstractC0024y.m(this.f458c)) ? (X) context2.o(C0021v.f545b) : null;
                if (x5 != null && !x5.a()) {
                    CancellationException x6 = ((g0) x5).x();
                    b(i2, x6);
                    abstractC1295c.resumeWith(e5.g.l(x6));
                } else if (e3 != null) {
                    abstractC1295c.resumeWith(e5.g.l(e3));
                } else {
                    abstractC1295c.resumeWith(g(i2));
                }
                if (v4 == null || v4.Z()) {
                    I4.a.h(context, n6);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = e5.g.l(th);
                }
                h(null, AbstractC0432i.a(obj));
            } catch (Throwable th2) {
                if (v4 == null || v4.Z()) {
                    I4.a.h(context, n6);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = e5.g.l(th4);
            }
            h(th3, AbstractC0432i.a(obj));
        }
    }

    public Object g(Object obj) {
        return obj;
    }
}
