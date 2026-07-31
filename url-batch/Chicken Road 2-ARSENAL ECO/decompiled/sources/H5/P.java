package H5;

import l5.C0504h;

/* loaded from: classes.dex */
public abstract class P extends AbstractC0161v {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f1043k = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f1044h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1045i;

    /* renamed from: j, reason: collision with root package name */
    public C0504h f1046j;

    public final void I(boolean z5) {
        long j4 = this.f1044h - (z5 ? 4294967296L : 1L);
        this.f1044h = j4;
        if (j4 <= 0 && this.f1045i) {
            shutdown();
        }
    }

    public final void J(E e4) {
        C0504h c0504h = this.f1046j;
        if (c0504h == null) {
            c0504h = new C0504h();
            this.f1046j = c0504h;
        }
        c0504h.addLast(e4);
    }

    public abstract Thread K();

    public final void L(boolean z5) {
        this.f1044h = (z5 ? 4294967296L : 1L) + this.f1044h;
        if (z5) {
            return;
        }
        this.f1045i = true;
    }

    public abstract long M();

    public final boolean N() {
        C0504h c0504h = this.f1046j;
        if (c0504h == null) {
            return false;
        }
        E e4 = (E) (c0504h.isEmpty() ? null : c0504h.removeFirst());
        if (e4 == null) {
            return false;
        }
        e4.run();
        return true;
    }

    public void O(long j4, M m4) {
        A.f1022o.S(j4, m4);
    }

    public abstract void shutdown();
}
