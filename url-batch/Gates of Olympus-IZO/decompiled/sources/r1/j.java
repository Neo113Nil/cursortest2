package r1;

/* loaded from: classes.dex */
public final class j extends q1.x {

    /* renamed from: f, reason: collision with root package name */
    public final C0857i f7224f;

    /* renamed from: g, reason: collision with root package name */
    public final Q.a f7225g;

    /* renamed from: h, reason: collision with root package name */
    public Y1.c f7226h;

    /* renamed from: i, reason: collision with root package name */
    public Y1.c f7227i;

    /* renamed from: j, reason: collision with root package name */
    public Y1.c f7228j;

    /* renamed from: k, reason: collision with root package name */
    public Y1.c f7229k;

    /* renamed from: l, reason: collision with root package name */
    public Y1.c f7230l;

    public j(C0857i c0857i, String str, Q.a aVar) {
        super(c0857i, str);
        this.f7224f = c0857i;
        this.f7225g = aVar;
    }

    @Override // q1.x
    public final q1.w a() {
        C0856h c0856h = (C0856h) super.a();
        c0856h.f7219n = this.f7226h;
        c0856h.f7220o = this.f7227i;
        c0856h.p = this.f7228j;
        c0856h.f7221q = this.f7229k;
        c0856h.f7222r = this.f7230l;
        return c0856h;
    }

    @Override // q1.x
    public final q1.w b() {
        return new C0856h(this.f7224f, this.f7225g);
    }
}
