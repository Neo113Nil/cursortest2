package k0;

/* loaded from: classes.dex */
public abstract class D extends AbstractC0055p {

    /* renamed from: d, reason: collision with root package name */
    public long f880d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f881e;

    /* renamed from: f, reason: collision with root package name */
    public V.c f882f;

    public final void h() {
        long j2 = this.f880d - 4294967296L;
        this.f880d = j2;
        if (j2 <= 0 && this.f881e) {
            m();
        }
    }

    public abstract Thread i();

    public final void j(boolean z) {
        this.f880d = (z ? 4294967296L : 1L) + this.f880d;
        if (z) {
            return;
        }
        this.f881e = true;
    }

    public final boolean l() {
        V.c cVar = this.f882f;
        if (cVar == null) {
            return false;
        }
        AbstractC0062x abstractC0062x = (AbstractC0062x) (cVar.isEmpty() ? null : cVar.removeFirst());
        if (abstractC0062x == null) {
            return false;
        }
        abstractC0062x.run();
        return true;
    }

    public abstract void m();
}
