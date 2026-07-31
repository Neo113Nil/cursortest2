package H5;

import java.util.concurrent.CancellationException;
import k5.AbstractC0479i;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public abstract class E extends O5.h {

    /* renamed from: h, reason: collision with root package name */
    public int f1026h;

    public E(int i7) {
        super(0L, O5.j.f1828g);
        this.f1026h = i7;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract InterfaceC0564d c();

    public Throwable d(Object obj) {
        C0156p c0156p = obj instanceof C0156p ? (C0156p) obj : null;
        if (c0156p != null) {
            return c0156p.f1093a;
        }
        return null;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            i6.g.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.i.b(th);
        AbstractC0165z.i(c().getContext(), new C0164y("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (H5.X) r7.m(H5.C0162w.f1110g);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = k5.v.f5219a;
        D3.A a7 = this.f1820g;
        try {
            InterfaceC0564d c7 = c();
            kotlin.jvm.internal.i.c(c7, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            M5.h hVar = (M5.h) c7;
            AbstractC0607c abstractC0607c = hVar.f1597j;
            Object obj2 = hVar.f1599l;
            InterfaceC0569i context = abstractC0607c.getContext();
            Object m4 = M5.a.m(context, obj2);
            v0 s6 = m4 != M5.a.f1587f ? AbstractC0165z.s(abstractC0607c, context, m4) : null;
            try {
                InterfaceC0569i context2 = abstractC0607c.getContext();
                Object h7 = h();
                Throwable d7 = d(h7);
                if (d7 == null) {
                    int i7 = this.f1026h;
                    boolean z5 = true;
                    if (i7 != 1 && i7 != 2) {
                        z5 = false;
                    }
                }
                X x6 = null;
                if (x6 != null && !x6.a()) {
                    CancellationException w5 = ((g0) x6).w();
                    b(h7, w5);
                    abstractC0607c.resumeWith(AbstractC0676f.f(w5));
                } else if (d7 != null) {
                    abstractC0607c.resumeWith(AbstractC0676f.f(d7));
                } else {
                    abstractC0607c.resumeWith(e(h7));
                }
                if (s6 == null || s6.W()) {
                    M5.a.g(context, m4);
                }
                try {
                    a7.getClass();
                } catch (Throwable th) {
                    obj = AbstractC0676f.f(th);
                }
                g(null, AbstractC0479i.a(obj));
            } catch (Throwable th2) {
                if (s6 == null || s6.W()) {
                    M5.a.g(context, m4);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                a7.getClass();
            } catch (Throwable th4) {
                obj = AbstractC0676f.f(th4);
            }
            g(th3, AbstractC0479i.a(obj));
        }
    }

    public Object e(Object obj) {
        return obj;
    }
}
