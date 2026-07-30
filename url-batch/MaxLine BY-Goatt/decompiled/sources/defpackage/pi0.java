package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class pi0 extends t40 {
    public static final /* synthetic */ int r = 0;
    public long o;
    public boolean p;
    public bi q;

    @Override // defpackage.t40
    public final t40 Q(int i) {
        l41.u(1);
        return this;
    }

    public final void R(boolean z) {
        long j = this.o - (z ? 4294967296L : 1L);
        this.o = j;
        if (j <= 0 && this.p) {
            shutdown();
        }
    }

    public final void S(rb0 rb0Var) {
        bi biVar = this.q;
        if (biVar == null) {
            biVar = new bi();
            this.q = biVar;
        }
        biVar.addLast(rb0Var);
    }

    public final void T(boolean z) {
        this.o = (z ? 4294967296L : 1L) + this.o;
        if (z) {
            return;
        }
        this.p = true;
    }

    public abstract long U();

    public final boolean V() {
        bi biVar = this.q;
        if (biVar == null) {
            return false;
        }
        rb0 rb0Var = (rb0) (biVar.isEmpty() ? null : biVar.removeFirst());
        if (rb0Var == null) {
            return false;
        }
        rb0Var.run();
        return true;
    }

    public abstract void shutdown();
}
