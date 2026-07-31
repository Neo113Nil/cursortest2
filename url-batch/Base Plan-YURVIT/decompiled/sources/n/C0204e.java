package n;

import androidx.datastore.preferences.protobuf.k0;

/* renamed from: n.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204e extends k0 {
    @Override // androidx.datastore.preferences.protobuf.k0
    public final boolean e(AbstractFutureC0206g abstractFutureC0206g, C0202c c0202c) {
        C0202c c0202c2 = C0202c.f2894b;
        synchronized (abstractFutureC0206g) {
            try {
                if (abstractFutureC0206g.f2909f != c0202c) {
                    return false;
                }
                abstractFutureC0206g.f2909f = c0202c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final boolean f(AbstractFutureC0206g abstractFutureC0206g, Object obj, Object obj2) {
        synchronized (abstractFutureC0206g) {
            try {
                if (abstractFutureC0206g.f2908e != obj) {
                    return false;
                }
                abstractFutureC0206g.f2908e = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final boolean g(AbstractFutureC0206g abstractFutureC0206g, C0205f c0205f, C0205f c0205f2) {
        synchronized (abstractFutureC0206g) {
            try {
                if (abstractFutureC0206g.f2910g != c0205f) {
                    return false;
                }
                abstractFutureC0206g.f2910g = c0205f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void y(C0205f c0205f, C0205f c0205f2) {
        c0205f.f2903b = c0205f2;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void z(C0205f c0205f, Thread thread) {
        c0205f.f2902a = thread;
    }
}
