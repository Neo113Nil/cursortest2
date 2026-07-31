package I;

/* loaded from: classes.dex */
public final class H implements B0 {

    /* renamed from: d, reason: collision with root package name */
    public final Y1.c f2128d;

    /* renamed from: e, reason: collision with root package name */
    public I f2129e;

    public H(Y1.c cVar) {
        this.f2128d = cVar;
    }

    @Override // I.B0
    public final void a() {
        I i3 = this.f2129e;
        if (i3 != null) {
            i3.a();
        }
        this.f2129e = null;
    }

    @Override // I.B0
    public final void b() {
        this.f2129e = (I) this.f2128d.j(C0089d.f2245h);
    }

    @Override // I.B0
    public final void c() {
    }
}
