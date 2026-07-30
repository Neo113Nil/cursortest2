package l;

import a.AbstractC0069a;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186e extends AbstractC0069a {
    @Override // a.AbstractC0069a
    public final boolean c(AbstractFutureC0188g abstractFutureC0188g, C0184c c0184c) {
        C0184c c0184c2 = C0184c.f2684b;
        synchronized (abstractFutureC0188g) {
            try {
                if (abstractFutureC0188g.f2699b != c0184c) {
                    return false;
                }
                abstractFutureC0188g.f2699b = c0184c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0069a
    public final boolean d(AbstractFutureC0188g abstractFutureC0188g, Object obj, Object obj2) {
        synchronized (abstractFutureC0188g) {
            try {
                if (abstractFutureC0188g.f2698a != obj) {
                    return false;
                }
                abstractFutureC0188g.f2698a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0069a
    public final boolean e(AbstractFutureC0188g abstractFutureC0188g, C0187f c0187f, C0187f c0187f2) {
        synchronized (abstractFutureC0188g) {
            try {
                if (abstractFutureC0188g.f2700c != c0187f) {
                    return false;
                }
                abstractFutureC0188g.f2700c = c0187f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0069a
    public final void y(C0187f c0187f, C0187f c0187f2) {
        c0187f.f2693b = c0187f2;
    }

    @Override // a.AbstractC0069a
    public final void z(C0187f c0187f, Thread thread) {
        c0187f.f2692a = thread;
    }
}
