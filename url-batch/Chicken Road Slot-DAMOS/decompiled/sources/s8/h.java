package s8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements p8.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9164a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9165b = false;

    /* renamed from: c, reason: collision with root package name */
    public p8.c f9166c;

    /* renamed from: d, reason: collision with root package name */
    public final f f9167d;

    public h(f fVar) {
        this.f9167d = fVar;
    }

    @Override // p8.g
    public final p8.g b(String str) {
        if (this.f9164a) {
            throw new p8.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f9164a = true;
        this.f9167d.f(this.f9166c, str, this.f9165b);
        return this;
    }

    @Override // p8.g
    public final p8.g d(boolean z10) {
        if (this.f9164a) {
            throw new p8.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f9164a = true;
        this.f9167d.b(this.f9166c, z10 ? 1 : 0, this.f9165b);
        return this;
    }
}
