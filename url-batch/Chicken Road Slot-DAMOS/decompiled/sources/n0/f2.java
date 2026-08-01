package n0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f2 extends b1.h0 {

    /* renamed from: c, reason: collision with root package name */
    public float f6680c;

    public f2(long j, float f3) {
        super(j);
        this.f6680c = f3;
    }

    @Override // b1.h0
    public final void a(b1.h0 h0Var) {
        h0Var.getClass();
        this.f6680c = ((f2) h0Var).f6680c;
    }

    @Override // b1.h0
    public final b1.h0 b(long j) {
        return new f2(j, this.f6680c);
    }
}
