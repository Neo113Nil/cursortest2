package n0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i2 extends b1.h0 {

    /* renamed from: c, reason: collision with root package name */
    public Object f6722c;

    public i2(long j, Object obj) {
        super(j);
        this.f6722c = obj;
    }

    @Override // b1.h0
    public final void a(b1.h0 h0Var) {
        h0Var.getClass();
        this.f6722c = ((i2) h0Var).f6722c;
    }

    @Override // b1.h0
    public final b1.h0 b(long j) {
        return new i2(b1.r.j().g(), this.f6722c);
    }
}
