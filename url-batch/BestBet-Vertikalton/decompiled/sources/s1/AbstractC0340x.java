package s1;

import d1.AbstractC0095c;
import java.util.concurrent.CancellationException;

/* renamed from: s1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0340x extends y1.h {

    /* renamed from: c, reason: collision with root package name */
    public int f4071c;

    public AbstractC0340x(int i) {
        super(0L, y1.k.f4605g);
        this.f4071c = i;
    }

    public abstract void a(Object obj, CancellationException cancellationException);

    public abstract b1.d c();

    public Throwable d(Object obj) {
        C0327j c0327j = obj instanceof C0327j ? (C0327j) obj : null;
        if (c0327j != null) {
            return c0327j.f4051a;
        }
        return null;
    }

    public Object f(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            H1.d.b(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        k1.e.b(th);
        AbstractC0335s.d(c().h(), new r("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    /* JADX WARN: Can't wrap try/catch for region: R(10:6|7|(1:32)(1:11)|(1:(1:30)(1:31))(1:15)|(6:17|(1:19)|20|21|22|23)|28|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        r0 = H1.l.w(r0);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = X0.g.f1277c;
        y1.i iVar = this.f4597b;
        try {
            b1.d c2 = c();
            k1.e.c(c2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            w1.f fVar = (w1.f) c2;
            AbstractC0095c abstractC0095c = fVar.f4496e;
            Object obj2 = fVar.f4498g;
            b1.j jVar = abstractC0095c.f2474b;
            k1.e.b(jVar);
            Object g2 = w1.a.g(jVar, obj2);
            e0 k2 = g2 != w1.a.f4491e ? AbstractC0335s.k(abstractC0095c, jVar, g2) : null;
            try {
                b1.j jVar2 = abstractC0095c.f2474b;
                k1.e.b(jVar2);
                Object i = i();
                Throwable d = d(i);
                M m2 = (d == null && AbstractC0335s.f(this.f4071c)) ? (M) jVar2.p(C0333p.f4061b) : null;
                if (m2 != null && !m2.a()) {
                    CancellationException u2 = ((U) m2).u();
                    a(i, u2);
                    abstractC0095c.b(H1.l.w(u2));
                } else if (d != null) {
                    abstractC0095c.b(H1.l.w(d));
                } else {
                    abstractC0095c.b(f(i));
                }
                if (k2 != null) {
                    if (k2.K()) {
                    }
                    iVar.getClass();
                    g(null, X0.e.a(obj));
                }
                w1.a.b(jVar, g2);
                iVar.getClass();
                g(null, X0.e.a(obj));
            } catch (Throwable th) {
                if (k2 == null || k2.K()) {
                    w1.a.b(jVar, g2);
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                iVar.getClass();
            } catch (Throwable th3) {
                obj = H1.l.w(th3);
            }
            g(th2, X0.e.a(obj));
        }
    }
}
