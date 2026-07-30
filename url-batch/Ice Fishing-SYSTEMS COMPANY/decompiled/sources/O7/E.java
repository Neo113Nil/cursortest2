package O7;

import java.util.concurrent.CancellationException;
import q7.AbstractC4940i;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public abstract class E extends V7.i {

    /* renamed from: v, reason: collision with root package name */
    public int f2550v;

    public E(int i) {
        super(0L, V7.k.f3365g);
        this.f2550v = i;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract InterfaceC5133d c();

    public Throwable e(Object obj) {
        C0391p c0391p = obj instanceof C0391p ? (C0391p) obj : null;
        if (c0391p != null) {
            return c0391p.f2619a;
        }
        return null;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            com.bumptech.glide.d.b(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.h.b(th);
        AbstractC0399y.l(new D7.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (O7.Y) r7.i(O7.C0396v.f2634u);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = q7.v.f40183a;
        J6.i iVar = this.f3357u;
        try {
            InterfaceC5133d c4 = c();
            kotlin.jvm.internal.h.c(c4, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            T7.h hVar = (T7.h) c4;
            AbstractC5219c abstractC5219c = hVar.f3141x;
            Object obj2 = hVar.f3143z;
            InterfaceC5138i context = abstractC5219c.getContext();
            Object m8 = T7.a.m(context, obj2);
            w0 x3 = m8 != T7.a.f3131f ? AbstractC0399y.x(abstractC5219c, context, m8) : null;
            try {
                InterfaceC5138i context2 = abstractC5219c.getContext();
                Object i = i();
                Throwable e6 = e(i);
                if (e6 == null) {
                    int i4 = this.f2550v;
                    boolean z8 = true;
                    if (i4 != 1 && i4 != 2) {
                        z8 = false;
                    }
                }
                Y y6 = null;
                if (y6 != null && !y6.j()) {
                    CancellationException w9 = ((h0) y6).w();
                    b(i, w9);
                    abstractC5219c.resumeWith(com.bumptech.glide.f.e(w9));
                } else if (e6 != null) {
                    abstractC5219c.resumeWith(com.bumptech.glide.f.e(e6));
                } else {
                    abstractC5219c.resumeWith(g(i));
                }
                if (x3 == null || x3.X()) {
                    T7.a.g(context, m8);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = com.bumptech.glide.f.e(th);
                }
                h(null, AbstractC4940i.a(obj));
            } catch (Throwable th2) {
                if (x3 == null || x3.X()) {
                    T7.a.g(context, m8);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = com.bumptech.glide.f.e(th4);
            }
            h(th3, AbstractC4940i.a(obj));
        }
    }

    public Object g(Object obj) {
        return obj;
    }
}
