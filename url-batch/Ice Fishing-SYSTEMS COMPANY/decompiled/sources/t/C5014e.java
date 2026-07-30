package t;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5014e extends com.bumptech.glide.e {
    @Override // com.bumptech.glide.e
    public final void A(C5015f c5015f, Thread thread) {
        c5015f.f40542a = thread;
    }

    @Override // com.bumptech.glide.e
    public final boolean c(AbstractC5016g abstractC5016g, C5012c c5012c, C5012c c5012c2) {
        synchronized (abstractC5016g) {
            try {
                if (abstractC5016g.f40549u != c5012c) {
                    return false;
                }
                abstractC5016g.f40549u = c5012c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.e
    public final boolean e(AbstractC5016g abstractC5016g, Object obj, Object obj2) {
        synchronized (abstractC5016g) {
            try {
                if (abstractC5016g.f40548n != obj) {
                    return false;
                }
                abstractC5016g.f40548n = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.e
    public final boolean g(AbstractC5016g abstractC5016g, C5015f c5015f, C5015f c5015f2) {
        synchronized (abstractC5016g) {
            try {
                if (abstractC5016g.f40550v != c5015f) {
                    return false;
                }
                abstractC5016g.f40550v = c5015f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.e
    public final void y(C5015f c5015f, C5015f c5015f2) {
        c5015f.f40543b = c5015f2;
    }
}
