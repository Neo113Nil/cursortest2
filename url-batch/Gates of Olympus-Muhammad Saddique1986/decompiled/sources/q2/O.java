package q2;

/* loaded from: classes.dex */
public abstract class O extends AbstractC0831s {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f7865i = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f7866f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7867g;

    /* renamed from: h, reason: collision with root package name */
    public S1.j f7868h;

    public final void H(boolean z3) {
        long j3 = this.f7866f - (z3 ? 4294967296L : 1L);
        this.f7866f = j3;
        if (j3 <= 0 && this.f7867g) {
            P();
        }
    }

    public final void I(D d3) {
        S1.j jVar = this.f7868h;
        if (jVar == null) {
            jVar = new S1.j();
            this.f7868h = jVar;
        }
        jVar.addLast(d3);
    }

    public abstract Thread J();

    public final void K(boolean z3) {
        this.f7866f = (z3 ? 4294967296L : 1L) + this.f7866f;
        if (z3) {
            return;
        }
        this.f7867g = true;
    }

    public final boolean L() {
        return this.f7866f >= 4294967296L;
    }

    public abstract long M();

    public final boolean N() {
        S1.j jVar = this.f7868h;
        if (jVar == null) {
            return false;
        }
        D d3 = (D) (jVar.isEmpty() ? null : jVar.removeFirst());
        if (d3 == null) {
            return false;
        }
        d3.run();
        return true;
    }

    public void O(long j3, L l3) {
        RunnableC0838z.f7950m.U(j3, l3);
    }

    public abstract void P();
}
