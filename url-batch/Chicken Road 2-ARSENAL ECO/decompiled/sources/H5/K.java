package H5;

/* loaded from: classes.dex */
public final class K extends M {

    /* renamed from: h, reason: collision with root package name */
    public final C0147g f1034h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O f1035i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(O o7, long j4, C0147g c0147g) {
        super(j4);
        this.f1035i = o7;
        this.f1034h = c0147g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1034h.B(this.f1035i);
    }

    @Override // H5.M
    public final String toString() {
        return super.toString() + this.f1034h;
    }
}
