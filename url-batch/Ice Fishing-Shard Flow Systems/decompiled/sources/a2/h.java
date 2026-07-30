package a2;

/* loaded from: classes.dex */
public final class h implements X1.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3097a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3098b = false;

    /* renamed from: c, reason: collision with root package name */
    public X1.c f3099c;

    /* renamed from: d, reason: collision with root package name */
    public final f f3100d;

    public h(f fVar) {
        this.f3100d = fVar;
    }

    @Override // X1.g
    public final X1.g c(String str) {
        if (this.f3097a) {
            throw new X1.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f3097a = true;
        this.f3100d.d(this.f3099c, str, this.f3098b);
        return this;
    }

    @Override // X1.g
    public final X1.g d(boolean z7) {
        if (this.f3097a) {
            throw new X1.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f3097a = true;
        this.f3100d.c(this.f3099c, z7 ? 1 : 0, this.f3098b);
        return this;
    }
}
