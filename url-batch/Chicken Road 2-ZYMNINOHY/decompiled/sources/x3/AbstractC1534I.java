package x3;

/* renamed from: x3.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1534I extends AbstractC1558s {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f15996f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f15997c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15998d;

    /* renamed from: e, reason: collision with root package name */
    public d3.f f15999e;

    public abstract void shutdown();

    public final void u(boolean z) {
        long j4 = this.f15997c - (z ? 4294967296L : 1L);
        this.f15997c = j4;
        if (j4 <= 0 && this.f15998d) {
            shutdown();
        }
    }

    public abstract Thread v();

    public final void w(boolean z) {
        this.f15997c = (z ? 4294967296L : 1L) + this.f15997c;
        if (z) {
            return;
        }
        this.f15998d = true;
    }

    public abstract long x();

    public final boolean y() {
        d3.f fVar = this.f15999e;
        if (fVar == null) {
            return false;
        }
        AbstractC1527B abstractC1527B = (AbstractC1527B) (fVar.isEmpty() ? null : fVar.removeFirst());
        if (abstractC1527B == null) {
            return false;
        }
        abstractC1527B.run();
        return true;
    }
}
