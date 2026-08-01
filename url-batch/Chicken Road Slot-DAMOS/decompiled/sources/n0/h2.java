package n0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h2 extends b1.h0 {

    /* renamed from: c, reason: collision with root package name */
    public long f6697c;

    public h2(long j, long j3) {
        super(j);
        this.f6697c = j3;
    }

    @Override // b1.h0
    public final void a(b1.h0 h0Var) {
        h0Var.getClass();
        this.f6697c = ((h2) h0Var).f6697c;
    }

    @Override // b1.h0
    public final b1.h0 b(long j) {
        return new h2(j, this.f6697c);
    }
}
