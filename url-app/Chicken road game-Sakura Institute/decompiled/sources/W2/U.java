package W2;

import z2.C1433q;

/* loaded from: classes.dex */
public abstract class U extends AbstractC0298u {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f4239l = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f4240i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4241j;

    /* renamed from: k, reason: collision with root package name */
    public C1433q f4242k;

    public final void A(boolean z4) {
        long j4 = this.f4240i - (z4 ? 4294967296L : 1L);
        this.f4240i = j4;
        if (j4 <= 0 && this.f4241j) {
            shutdown();
        }
    }

    public final void B(H h4) {
        C1433q c1433q = this.f4242k;
        if (c1433q == null) {
            c1433q = new C1433q();
            this.f4242k = c1433q;
        }
        c1433q.addLast(h4);
    }

    public abstract Thread C();

    public final void D(boolean z4) {
        this.f4240i = (z4 ? 4294967296L : 1L) + this.f4240i;
        if (z4) {
            return;
        }
        this.f4241j = true;
    }

    public final boolean E() {
        return this.f4240i >= 4294967296L;
    }

    public abstract long F();

    public final boolean G() {
        C1433q c1433q = this.f4242k;
        if (c1433q == null) {
            return false;
        }
        H h4 = (H) (c1433q.isEmpty() ? null : c1433q.removeFirst());
        if (h4 == null) {
            return false;
        }
        h4.run();
        return true;
    }

    public void H(long j4, Q q2) {
        C.f4219p.M(j4, q2);
    }

    public abstract void shutdown();
}
