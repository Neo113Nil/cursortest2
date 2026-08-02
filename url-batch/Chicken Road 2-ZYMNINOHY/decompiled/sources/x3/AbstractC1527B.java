package x3;

import c3.C0294f;
import c3.C0297i;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import java.util.concurrent.CancellationException;
import n3.C1321a;

/* renamed from: x3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1527B extends E3.i {

    /* renamed from: c, reason: collision with root package name */
    public int f15988c;

    public AbstractC1527B(int i4) {
        super(0L, E3.l.f724g);
        this.f15988c = i4;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract InterfaceC0425c d();

    public Throwable e(Object obj) {
        C1554n c1554n = obj instanceof C1554n ? (C1554n) obj : null;
        if (c1554n != null) {
            return c1554n.f16048a;
        }
        return null;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            O3.d.c(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.i.b(th);
        AbstractC1562w.e(d().getContext(), new C1321a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (x3.T) r7.n(x3.C1559t.f16059b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = C0297i.f5732a;
        E3.j jVar = this.f715b;
        try {
            InterfaceC0425c d4 = d();
            kotlin.jvm.internal.i.c(d4, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C3.h hVar = (C3.h) d4;
            h3.c cVar = hVar.f294e;
            Object obj2 = hVar.f296g;
            InterfaceC0430h context = cVar.getContext();
            Object l4 = C3.a.l(context, obj2);
            n0 m4 = l4 != C3.a.f284f ? AbstractC1562w.m(cVar, context, l4) : null;
            try {
                InterfaceC0430h context2 = cVar.getContext();
                Object h2 = h();
                Throwable e4 = e(h2);
                if (e4 == null) {
                    int i4 = this.f15988c;
                    boolean z = true;
                    if (i4 != 1 && i4 != 2) {
                        z = false;
                    }
                }
                T t4 = null;
                if (t4 != null && !t4.a()) {
                    CancellationException w4 = ((d0) t4).w();
                    b(h2, w4);
                    cVar.resumeWith(O3.l.h(w4));
                } else if (e4 != null) {
                    cVar.resumeWith(O3.l.h(e4));
                } else {
                    cVar.resumeWith(f(h2));
                }
                if (m4 == null || m4.T()) {
                    C3.a.f(context, l4);
                }
                try {
                    jVar.getClass();
                } catch (Throwable th) {
                    obj = O3.l.h(th);
                }
                g(null, C0294f.a(obj));
            } catch (Throwable th2) {
                if (m4 == null || m4.T()) {
                    C3.a.f(context, l4);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                jVar.getClass();
            } catch (Throwable th4) {
                obj = O3.l.h(th4);
            }
            g(th3, C0294f.a(obj));
        }
    }

    public Object f(Object obj) {
        return obj;
    }
}
