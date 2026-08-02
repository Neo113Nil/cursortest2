package t2;

import a.AbstractC0129a;
import b2.C0192f;
import b2.C0195i;
import d2.InterfaceC0300c;
import f2.AbstractC0326c;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class C extends A2.i {

    /* renamed from: c, reason: collision with root package name */
    public int f10376c;

    public C(int i3) {
        super(0L, A2.l.f66g);
        this.f10376c = i3;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract InterfaceC0300c e();

    public Throwable g(Object obj) {
        C1204n c1204n = obj instanceof C1204n ? (C1204n) obj : null;
        if (c1204n != null) {
            return c1204n.f10431a;
        }
        return null;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0129a.e(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.j.b(th);
        AbstractC1212w.e(e().getContext(), new k2.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (t2.U) r7.h(t2.C1209t.f10441b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = C0195i.f2555a;
        A2.j jVar = this.f58b;
        try {
            InterfaceC0300c e3 = e();
            kotlin.jvm.internal.j.c(e3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            y2.h hVar = (y2.h) e3;
            AbstractC0326c abstractC0326c = hVar.f10845e;
            Object obj2 = hVar.f10846g;
            d2.h context = abstractC0326c.getContext();
            Object l3 = y2.a.l(context, obj2);
            n0 n3 = l3 != y2.a.f ? AbstractC1212w.n(abstractC0326c, context, l3) : null;
            try {
                d2.h context2 = abstractC0326c.getContext();
                Object j3 = j();
                Throwable g3 = g(j3);
                if (g3 == null) {
                    int i3 = this.f10376c;
                    boolean z = true;
                    if (i3 != 1 && i3 != 2) {
                        z = false;
                    }
                }
                U u3 = null;
                if (u3 != null && !u3.a()) {
                    CancellationException z2 = ((e0) u3).z();
                    b(j3, z2);
                    abstractC0326c.f(android.support.v4.media.session.a.k(z2));
                } else if (g3 != null) {
                    abstractC0326c.f(android.support.v4.media.session.a.k(g3));
                } else {
                    abstractC0326c.f(h(j3));
                }
                if (n3 == null || n3.W()) {
                    y2.a.f(context, l3);
                }
                try {
                    jVar.getClass();
                } catch (Throwable th) {
                    obj = android.support.v4.media.session.a.k(th);
                }
                i(null, C0192f.a(obj));
            } catch (Throwable th2) {
                if (n3 == null || n3.W()) {
                    y2.a.f(context, l3);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                jVar.getClass();
            } catch (Throwable th4) {
                obj = android.support.v4.media.session.a.k(th4);
            }
            i(th3, C0192f.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
