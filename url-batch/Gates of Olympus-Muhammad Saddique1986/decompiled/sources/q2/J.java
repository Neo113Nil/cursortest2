package q2;

/* loaded from: classes.dex */
public final class J extends L {

    /* renamed from: f, reason: collision with root package name */
    public final C0821h f7856f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N f7857g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(N n3, long j3, C0821h c0821h) {
        super(j3);
        this.f7857g = n3;
        this.f7856f = c0821h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7856f.E(this.f7857g);
    }

    @Override // q2.L
    public final String toString() {
        return super.toString() + this.f7856f;
    }
}
