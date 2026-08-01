package o1;

/* loaded from: classes.dex */
public abstract class D extends AbstractC0296o {

    /* renamed from: c, reason: collision with root package name */
    public long f3308c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public V0.c f3309e;

    public final void A() {
        long j2 = this.f3308c - 4294967296L;
        this.f3308c = j2;
        if (j2 <= 0 && this.d) {
            E();
        }
    }

    public abstract Thread B();

    public final void C(boolean z2) {
        this.f3308c = (z2 ? 4294967296L : 1L) + this.f3308c;
        if (z2) {
            return;
        }
        this.d = true;
    }

    public final boolean D() {
        V0.c cVar = this.f3309e;
        if (cVar == null) {
            return false;
        }
        AbstractC0304x abstractC0304x = (AbstractC0304x) (cVar.isEmpty() ? null : cVar.removeFirst());
        if (abstractC0304x == null) {
            return false;
        }
        abstractC0304x.run();
        return true;
    }

    public abstract void E();
}
