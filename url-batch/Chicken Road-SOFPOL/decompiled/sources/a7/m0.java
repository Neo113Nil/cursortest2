package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class m0 extends q {
    public static final /* synthetic */ int i = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f275f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f276g;

    /* renamed from: h, reason: collision with root package name */
    public d6.k f277h;

    public final void m(boolean z3) {
        long j7 = this.f275f - (z3 ? 4294967296L : 1L);
        this.f275f = j7;
        if (j7 <= 0 && this.f276g) {
            shutdown();
        }
    }

    public final void o(c0 c0Var) {
        d6.k kVar = this.f277h;
        if (kVar == null) {
            kVar = new d6.k();
            this.f277h = kVar;
        }
        kVar.addLast(c0Var);
    }

    public abstract Thread s();

    public abstract void shutdown();

    public final void t(boolean z3) {
        this.f275f = (z3 ? 4294967296L : 1L) + this.f275f;
        if (z3) {
            return;
        }
        this.f276g = true;
    }

    public abstract long x();

    public final boolean y() {
        d6.k kVar = this.f277h;
        if (kVar == null) {
            return false;
        }
        c0 c0Var = (c0) (kVar.isEmpty() ? null : kVar.removeFirst());
        if (c0Var == null) {
            return false;
        }
        c0Var.run();
        return true;
    }

    public void z(long j7, j0 j0Var) {
        y.f320m.E(j7, j0Var);
    }
}
