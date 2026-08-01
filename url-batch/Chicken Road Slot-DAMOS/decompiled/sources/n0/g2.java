package n0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g2 extends b1.h0 {

    /* renamed from: c, reason: collision with root package name */
    public int f6684c;

    public g2(int i3, long j) {
        super(j);
        this.f6684c = i3;
    }

    @Override // b1.h0
    public final void a(b1.h0 h0Var) {
        h0Var.getClass();
        this.f6684c = ((g2) h0Var).f6684c;
    }

    @Override // b1.h0
    public final b1.h0 b(long j) {
        return new g2(this.f6684c, j);
    }
}
