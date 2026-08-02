package D2;

/* loaded from: classes.dex */
public final class g implements A2.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f367a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f368b = false;

    /* renamed from: c, reason: collision with root package name */
    public A2.c f369c;

    /* renamed from: d, reason: collision with root package name */
    public final e f370d;

    public g(e eVar) {
        this.f370d = eVar;
    }

    @Override // A2.g
    public final A2.g c(String str) {
        if (this.f367a) {
            throw new A2.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f367a = true;
        this.f370d.d(this.f369c, str, this.f368b);
        return this;
    }

    @Override // A2.g
    public final A2.g d(boolean z) {
        if (this.f367a) {
            throw new A2.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f367a = true;
        this.f370d.c(this.f369c, z ? 1 : 0, this.f368b);
        return this;
    }
}
