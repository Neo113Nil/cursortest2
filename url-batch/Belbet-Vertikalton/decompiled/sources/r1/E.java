package r1;

/* loaded from: classes.dex */
public abstract class E extends AbstractC0366p {

    /* renamed from: c, reason: collision with root package name */
    public long f4040c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4041d;
    public X0.i e;

    public final void F() {
        long j = this.f4040c - 4294967296L;
        this.f4040c = j;
        if (j <= 0 && this.f4041d) {
            J();
        }
    }

    public abstract Thread G();

    public final void H(boolean z2) {
        this.f4040c = (z2 ? 4294967296L : 1L) + this.f4040c;
        if (z2) {
            return;
        }
        this.f4041d = true;
    }

    public final boolean I() {
        X0.i iVar = this.e;
        if (iVar == null) {
            return false;
        }
        AbstractC0374y abstractC0374y = (AbstractC0374y) (iVar.isEmpty() ? null : iVar.removeFirst());
        if (abstractC0374y == null) {
            return false;
        }
        abstractC0374y.run();
        return true;
    }

    public abstract void J();
}
