package Y0;

/* loaded from: classes.dex */
public abstract class H extends AbstractC0124s {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f1166j = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f1167g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1168h;

    /* renamed from: i, reason: collision with root package name */
    public G0.b f1169i;

    public final void f(boolean z2) {
        long j2 = this.f1167g - (z2 ? 4294967296L : 1L);
        this.f1167g = j2;
        if (j2 <= 0 && this.f1168h) {
            n();
        }
    }

    public abstract Thread g();

    public final void h(boolean z2) {
        this.f1167g = (z2 ? 4294967296L : 1L) + this.f1167g;
        if (z2) {
            return;
        }
        this.f1168h = true;
    }

    public abstract long j();

    public final boolean l() {
        G0.b bVar = this.f1169i;
        if (bVar == null) {
            return false;
        }
        A a2 = (A) (bVar.isEmpty() ? null : bVar.removeFirst());
        if (a2 == null) {
            return false;
        }
        a2.run();
        return true;
    }

    public abstract void n();
}
