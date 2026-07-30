package n6;

import kotlin.collections.C0633l;

/* loaded from: classes.dex */
public abstract class P extends AbstractC0786t {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f7026n = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f7027i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7028l;

    /* renamed from: m, reason: collision with root package name */
    public C0633l f7029m;

    public final void I(boolean z7) {
        long j = this.f7027i - (z7 ? 4294967296L : 1L);
        this.f7027i = j;
        if (j <= 0 && this.f7028l) {
            shutdown();
        }
    }

    public final void J(AbstractC0767E abstractC0767E) {
        C0633l c0633l = this.f7029m;
        if (c0633l == null) {
            c0633l = new C0633l();
            this.f7029m = c0633l;
        }
        c0633l.addLast(abstractC0767E);
    }

    public abstract Thread K();

    public final void L(boolean z7) {
        this.f7027i = (z7 ? 4294967296L : 1L) + this.f7027i;
        if (z7) {
            return;
        }
        this.f7028l = true;
    }

    public abstract long M();

    public final boolean N() {
        C0633l c0633l = this.f7029m;
        if (c0633l == null) {
            return false;
        }
        AbstractC0767E abstractC0767E = (AbstractC0767E) (c0633l.isEmpty() ? null : c0633l.removeFirst());
        if (abstractC0767E == null) {
            return false;
        }
        abstractC0767E.run();
        return true;
    }

    public void O(long j, M m2) {
        RunnableC0763A.f7006r.T(j, m2);
    }

    public abstract void shutdown();
}
