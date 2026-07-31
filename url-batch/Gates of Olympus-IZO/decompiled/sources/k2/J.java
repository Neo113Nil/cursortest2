package k2;

/* loaded from: classes.dex */
public final class J extends L {

    /* renamed from: f, reason: collision with root package name */
    public final C0536h f5317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N f5318g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(N n3, long j3, C0536h c0536h) {
        super(j3);
        this.f5318g = n3;
        this.f5317f = c0536h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5317f.B(this.f5318g);
    }

    @Override // k2.L
    public final String toString() {
        return super.toString() + this.f5317f;
    }
}
