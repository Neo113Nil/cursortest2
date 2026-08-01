package s1;

/* loaded from: classes.dex */
public abstract class D extends AbstractC0332o {

    /* renamed from: c, reason: collision with root package name */
    public long f4011c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public Y0.h f4012e;

    public final void t() {
        long j2 = this.f4011c - 4294967296L;
        this.f4011c = j2;
        if (j2 <= 0 && this.d) {
            x();
        }
    }

    public abstract Thread u();

    public final void v(boolean z2) {
        this.f4011c = (z2 ? 4294967296L : 1L) + this.f4011c;
        if (z2) {
            return;
        }
        this.d = true;
    }

    public final boolean w() {
        Y0.h hVar = this.f4012e;
        if (hVar == null) {
            return false;
        }
        AbstractC0340x abstractC0340x = (AbstractC0340x) (hVar.isEmpty() ? null : hVar.removeFirst());
        if (abstractC0340x == null) {
            return false;
        }
        abstractC0340x.run();
        return true;
    }

    public abstract void x();
}
