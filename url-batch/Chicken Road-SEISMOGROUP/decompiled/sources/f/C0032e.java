package f;

import a.AbstractC0016a;

/* renamed from: f.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032e extends AbstractC0016a {
    @Override // a.AbstractC0016a
    public final boolean e(AbstractFutureC0034g abstractFutureC0034g, C0030c c0030c) {
        C0030c c0030c2 = C0030c.f565b;
        synchronized (abstractFutureC0034g) {
            try {
                if (abstractFutureC0034g.f580b != c0030c) {
                    return false;
                }
                abstractFutureC0034g.f580b = c0030c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0016a
    public final boolean f(AbstractFutureC0034g abstractFutureC0034g, Object obj, Object obj2) {
        synchronized (abstractFutureC0034g) {
            try {
                if (abstractFutureC0034g.f579a != obj) {
                    return false;
                }
                abstractFutureC0034g.f579a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0016a
    public final boolean g(AbstractFutureC0034g abstractFutureC0034g, C0033f c0033f, C0033f c0033f2) {
        synchronized (abstractFutureC0034g) {
            try {
                if (abstractFutureC0034g.f581c != c0033f) {
                    return false;
                }
                abstractFutureC0034g.f581c = c0033f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0016a
    public final void y(C0033f c0033f, C0033f c0033f2) {
        c0033f.f574b = c0033f2;
    }

    @Override // a.AbstractC0016a
    public final void z(C0033f c0033f, Thread thread) {
        c0033f.f573a = thread;
    }
}
