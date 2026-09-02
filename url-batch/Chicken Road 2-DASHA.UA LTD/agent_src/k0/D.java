package k0;

/* loaded from: classes.dex */
public abstract class D extends AbstractC0057p {

    /* renamed from: d, reason: collision with root package name */
    public long f827d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f828e;

    /* renamed from: f, reason: collision with root package name */
    public V.c f829f;

    public final void h() {
        long j2 = this.f827d - 4294967296L;
        this.f827d = j2;
        if (j2 <= 0 && this.f828e) {
            m();
        }
    }

    public abstract Thread i();

    public final void j(boolean z2) {
        this.f827d = (z2 ? 4294967296L : 1L) + this.f827d;
        if (z2) {
            return;
        }
        this.f828e = true;
    }

    public final boolean l() {
        V.c cVar = this.f829f;
        if (cVar == null) {
            return false;
        }
        AbstractC0064x abstractC0064x = (AbstractC0064x) (cVar.isEmpty() ? null : cVar.removeFirst());
        if (abstractC0064x == null) {
            return false;
        }
        abstractC0064x.run();
        return true;
    }

    public abstract void m();
}
