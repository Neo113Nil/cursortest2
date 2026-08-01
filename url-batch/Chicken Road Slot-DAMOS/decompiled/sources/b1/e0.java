package b1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e0 extends h0 {

    /* renamed from: c, reason: collision with root package name */
    public t0.b f971c;

    /* renamed from: d, reason: collision with root package name */
    public int f972d;

    /* renamed from: e, reason: collision with root package name */
    public int f973e;

    public e0(long j, t0.b bVar) {
        super(j);
        this.f971c = bVar;
    }

    @Override // b1.h0
    public final void a(h0 h0Var) {
        synchronized (x.f1043a) {
            h0Var.getClass();
            this.f971c = ((e0) h0Var).f971c;
            this.f972d = ((e0) h0Var).f972d;
            this.f973e = ((e0) h0Var).f973e;
        }
    }

    @Override // b1.h0
    public final h0 b(long j) {
        return new e0(j, this.f971c);
    }
}
