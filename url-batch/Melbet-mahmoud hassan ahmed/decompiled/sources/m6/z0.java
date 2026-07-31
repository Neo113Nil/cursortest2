package m6;

/* loaded from: classes.dex */
public abstract class z0 extends f0 {

    /* renamed from: g, reason: collision with root package name */
    private long f19369g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19370h;

    /* renamed from: i, reason: collision with root package name */
    private kotlinx.coroutines.internal.a<t0<?>> f19371i;

    private final long S(boolean z6) {
        return z6 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void W(z0 z0Var, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        z0Var.V(z6);
    }

    public final void R(boolean z6) {
        long S = this.f19369g - S(z6);
        this.f19369g = S;
        if (S > 0) {
            return;
        }
        if (p0.a()) {
            if (!(this.f19369g == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f19370h) {
            shutdown();
        }
    }

    public final void T(t0<?> t0Var) {
        kotlinx.coroutines.internal.a<t0<?>> aVar = this.f19371i;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a<>();
            this.f19371i = aVar;
        }
        aVar.a(t0Var);
    }

    protected long U() {
        kotlinx.coroutines.internal.a<t0<?>> aVar = this.f19371i;
        return (aVar == null || aVar.c()) ? Long.MAX_VALUE : 0L;
    }

    public final void V(boolean z6) {
        this.f19369g += S(z6);
        if (z6) {
            return;
        }
        this.f19370h = true;
    }

    public final boolean X() {
        return this.f19369g >= S(true);
    }

    public final boolean Y() {
        kotlinx.coroutines.internal.a<t0<?>> aVar = this.f19371i;
        if (aVar == null) {
            return true;
        }
        return aVar.c();
    }

    public final boolean Z() {
        t0<?> d7;
        kotlinx.coroutines.internal.a<t0<?>> aVar = this.f19371i;
        if (aVar == null || (d7 = aVar.d()) == null) {
            return false;
        }
        d7.run();
        return true;
    }

    protected void shutdown() {
    }
}
