package k2;

/* loaded from: classes.dex */
public abstract class O extends AbstractC0546s {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f5326i = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f5327f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5328g;

    /* renamed from: h, reason: collision with root package name */
    public M1.j f5329h;

    public final void S(boolean z3) {
        long j3 = this.f5327f - (z3 ? 4294967296L : 1L);
        this.f5327f = j3;
        if (j3 <= 0 && this.f5328g) {
            a0();
        }
    }

    public final void T(D d3) {
        M1.j jVar = this.f5329h;
        if (jVar == null) {
            jVar = new M1.j();
            this.f5329h = jVar;
        }
        jVar.addLast(d3);
    }

    public abstract Thread U();

    public final void V(boolean z3) {
        this.f5327f = (z3 ? 4294967296L : 1L) + this.f5327f;
        if (z3) {
            return;
        }
        this.f5328g = true;
    }

    public final boolean W() {
        return this.f5327f >= 4294967296L;
    }

    public abstract long X();

    public final boolean Y() {
        M1.j jVar = this.f5329h;
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

    public void Z(long j3, L l3) {
        RunnableC0553z.f5410m.f0(j3, l3);
    }

    public abstract void a0();
}
