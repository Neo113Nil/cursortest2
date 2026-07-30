package w;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0985e extends P0.f {
    @Override // P0.f
    public final void C(C0986f c0986f, C0986f c0986f2) {
        c0986f.f8271b = c0986f2;
    }

    @Override // P0.f
    public final void E(C0986f c0986f, Thread thread) {
        c0986f.f8270a = thread;
    }

    @Override // P0.f
    public final boolean g(AbstractC0987g abstractC0987g, C0983c c0983c, C0983c c0983c2) {
        synchronized (abstractC0987g) {
            try {
                if (abstractC0987g.f8277e != c0983c) {
                    return false;
                }
                abstractC0987g.f8277e = c0983c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // P0.f
    public final boolean i(AbstractC0987g abstractC0987g, Object obj, Object obj2) {
        synchronized (abstractC0987g) {
            try {
                if (abstractC0987g.f8276d != obj) {
                    return false;
                }
                abstractC0987g.f8276d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // P0.f
    public final boolean k(AbstractC0987g abstractC0987g, C0986f c0986f, C0986f c0986f2) {
        synchronized (abstractC0987g) {
            try {
                if (abstractC0987g.f8278i != c0986f) {
                    return false;
                }
                abstractC0987g.f8278i = c0986f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
