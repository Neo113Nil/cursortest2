package o2;

import kotlin.collections.C3218h;

/* renamed from: o2.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3328f0 extends AbstractC3313G {

    /* renamed from: d, reason: collision with root package name */
    private long f42067d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f42068e;

    /* renamed from: f, reason: collision with root package name */
    private C3218h f42069f;

    private final long U(boolean z4) {
        return z4 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void Y(AbstractC3328f0 abstractC3328f0, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        abstractC3328f0.X(z4);
    }

    public static /* synthetic */ void p(AbstractC3328f0 abstractC3328f0, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        abstractC3328f0.k(z4);
    }

    public final void V(W w4) {
        C3218h c3218h = this.f42069f;
        if (c3218h == null) {
            c3218h = new C3218h();
            this.f42069f = c3218h;
        }
        c3218h.addLast(w4);
    }

    protected long W() {
        C3218h c3218h = this.f42069f;
        return (c3218h == null || c3218h.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void X(boolean z4) {
        this.f42067d += U(z4);
        if (z4) {
            return;
        }
        this.f42068e = true;
    }

    public final boolean Z() {
        return this.f42067d >= U(true);
    }

    public final boolean a0() {
        C3218h c3218h = this.f42069f;
        if (c3218h != null) {
            return c3218h.isEmpty();
        }
        return true;
    }

    public abstract long b0();

    public final boolean c0() {
        W w4;
        C3218h c3218h = this.f42069f;
        if (c3218h == null || (w4 = (W) c3218h.p()) == null) {
            return false;
        }
        w4.run();
        return true;
    }

    public boolean d0() {
        return false;
    }

    public final void k(boolean z4) {
        long U3 = this.f42067d - U(z4);
        this.f42067d = U3;
        if (U3 <= 0 && this.f42068e) {
            shutdown();
        }
    }

    public abstract void shutdown();
}
