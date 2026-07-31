package b6;

/* loaded from: classes.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final r f3735a;

    public u(r rVar) {
        this.f3735a = rVar;
    }

    @Override // b6.w
    public final w a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // b6.w
    public final v c() {
        throw new IllegalStateException("already connected");
    }

    @Override // b6.w, c6.e
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // b6.w
    public final r d() {
        return this.f3735a;
    }

    @Override // b6.w
    public final boolean e() {
        return true;
    }

    @Override // b6.w
    public final v g() {
        throw new IllegalStateException("already connected");
    }
}
