package c7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class q0 extends t {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f1731k = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f1732h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1733i;

    /* renamed from: j, reason: collision with root package name */
    public e6.j f1734j;

    public final void Z(boolean z8) {
        long j8 = this.f1732h - (z8 ? 4294967296L : 1L);
        this.f1732h = j8;
        if (j8 <= 0 && this.f1733i) {
            shutdown();
        }
    }

    public final void a0(f0 f0Var) {
        e6.j jVar = this.f1734j;
        if (jVar == null) {
            jVar = new e6.j();
            this.f1734j = jVar;
        }
        jVar.addLast(f0Var);
    }

    public abstract Thread b0();

    public final void c0(boolean z8) {
        this.f1732h = (z8 ? 4294967296L : 1L) + this.f1732h;
        if (z8) {
            return;
        }
        this.f1733i = true;
    }

    public abstract long d0();

    public final boolean e0() {
        e6.j jVar = this.f1734j;
        if (jVar == null) {
            return false;
        }
        f0 f0Var = (f0) (jVar.isEmpty() ? null : jVar.removeFirst());
        if (f0Var == null) {
            return false;
        }
        f0Var.run();
        return true;
    }

    public void f0(long j8, n0 n0Var) {
        b0.f1672o.k0(j8, n0Var);
    }

    public abstract void shutdown();
}
