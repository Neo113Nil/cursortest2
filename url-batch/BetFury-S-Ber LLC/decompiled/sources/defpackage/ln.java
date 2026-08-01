package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class ln extends tg {
    public static final /* synthetic */ int k = 0;
    public long h;
    public boolean i;
    public z6 j;

    @Override // defpackage.tg
    public final tg Q(int i) {
        mv.g(1);
        return this;
    }

    public final void R(boolean z) {
        long j = this.h - (z ? 4294967296L : 1L);
        this.h = j;
        if (j <= 0 && this.i) {
            shutdown();
        }
    }

    public final void S(boolean z) {
        this.h = (z ? 4294967296L : 1L) + this.h;
        if (z) {
            return;
        }
        this.i = true;
    }

    public abstract long T();

    public final boolean U() {
        z6 z6Var = this.j;
        if (z6Var == null) {
            return false;
        }
        gk gkVar = (gk) (z6Var.isEmpty() ? null : z6Var.removeFirst());
        if (gkVar == null) {
            return false;
        }
        gkVar.run();
        return true;
    }

    public abstract void shutdown();
}
