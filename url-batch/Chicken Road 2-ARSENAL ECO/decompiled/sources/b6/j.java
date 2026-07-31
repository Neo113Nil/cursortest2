package b6;

/* loaded from: classes.dex */
public final class j implements w {

    /* renamed from: a, reason: collision with root package name */
    public final v f3665a;

    public j(Throwable th) {
        this.f3665a = new v(this, th, 2);
    }

    @Override // b6.w
    public final w a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // b6.w
    public final v c() {
        return this.f3665a;
    }

    @Override // b6.w, c6.e
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // b6.w
    public final r d() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // b6.w
    public final boolean e() {
        return false;
    }

    @Override // b6.w
    public final v g() {
        return this.f3665a;
    }
}
