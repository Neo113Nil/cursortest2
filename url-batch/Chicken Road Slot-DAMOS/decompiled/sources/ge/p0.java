package ge;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class p0 extends t {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f4389t = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f4390i;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4391r;

    /* renamed from: s, reason: collision with root package name */
    public kotlin.collections.s f4392s;

    public final void P(boolean z10) {
        long j = this.f4390i - (z10 ? 4294967296L : 1L);
        this.f4390i = j;
        if (j <= 0 && this.f4391r) {
            shutdown();
        }
    }

    public final void Q(i0 i0Var) {
        kotlin.collections.s sVar = this.f4392s;
        if (sVar == null) {
            sVar = new kotlin.collections.s();
            this.f4392s = sVar;
        }
        sVar.addLast(i0Var);
    }

    public final void R(boolean z10) {
        this.f4390i = (z10 ? 4294967296L : 1L) + this.f4390i;
        if (z10) {
            return;
        }
        this.f4391r = true;
    }

    public abstract long S();

    public final boolean T() {
        kotlin.collections.s sVar = this.f4392s;
        if (sVar == null) {
            return false;
        }
        i0 i0Var = (i0) (sVar.isEmpty() ? null : sVar.removeFirst());
        if (i0Var == null) {
            return false;
        }
        i0Var.run();
        return true;
    }

    public abstract void shutdown();
}
