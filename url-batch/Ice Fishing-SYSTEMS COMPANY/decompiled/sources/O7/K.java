package O7;

/* loaded from: classes2.dex */
public final class K extends M {

    /* renamed from: v, reason: collision with root package name */
    public final C0382g f2558v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ O f2559w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(O o9, long j9, C0382g c0382g) {
        super(j9);
        this.f2559w = o9;
        this.f2558v = c0382g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2558v.B(this.f2559w);
    }

    @Override // O7.M
    public final String toString() {
        return super.toString() + this.f2558v;
    }
}
