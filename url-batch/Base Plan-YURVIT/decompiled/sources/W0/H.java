package W0;

/* loaded from: classes.dex */
public abstract class H extends AbstractC0078s {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f912j = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f913g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f914h;

    /* renamed from: i, reason: collision with root package name */
    public E0.d f915i;

    public final void e(boolean z2) {
        long j2 = this.f913g - (z2 ? 4294967296L : 1L);
        this.f913g = j2;
        if (j2 <= 0 && this.f914h) {
            shutdown();
        }
    }

    public abstract Thread f();

    public final void g(boolean z2) {
        this.f913g = (z2 ? 4294967296L : 1L) + this.f913g;
        if (z2) {
            return;
        }
        this.f914h = true;
    }

    public abstract long k();

    public final boolean l() {
        E0.d dVar = this.f915i;
        if (dVar == null) {
            return false;
        }
        A a2 = (A) (dVar.isEmpty() ? null : dVar.removeFirst());
        if (a2 == null) {
            return false;
        }
        a2.run();
        return true;
    }

    public abstract void shutdown();
}
