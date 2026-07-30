package M0;

/* loaded from: classes.dex */
public abstract class H extends AbstractC0060s {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f623j = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f624g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f625h;

    /* renamed from: i, reason: collision with root package name */
    public v0.b f626i;

    public final void e(boolean z2) {
        long j2 = this.f624g - (z2 ? 4294967296L : 1L);
        this.f624g = j2;
        if (j2 <= 0 && this.f625h) {
            n();
        }
    }

    public abstract Thread g();

    public final void j(boolean z2) {
        this.f624g = (z2 ? 4294967296L : 1L) + this.f624g;
        if (z2) {
            return;
        }
        this.f625h = true;
    }

    public abstract long l();

    public final boolean m() {
        v0.b bVar = this.f626i;
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
