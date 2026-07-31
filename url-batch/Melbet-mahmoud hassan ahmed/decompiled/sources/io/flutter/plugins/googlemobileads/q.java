package io.flutter.plugins.googlemobileads;

/* loaded from: classes.dex */
class q extends e implements g {

    /* renamed from: b, reason: collision with root package name */
    private final a f17565b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17566c;

    /* renamed from: d, reason: collision with root package name */
    private final m f17567d;

    /* renamed from: e, reason: collision with root package name */
    private final l f17568e;

    /* renamed from: f, reason: collision with root package name */
    private final c f17569f;

    /* renamed from: g, reason: collision with root package name */
    private r2.j f17570g;

    public q(int i7, a aVar, String str, l lVar, m mVar, c cVar) {
        super(i7);
        u5.c.a(aVar);
        u5.c.a(str);
        u5.c.a(lVar);
        u5.c.a(mVar);
        this.f17565b = aVar;
        this.f17566c = str;
        this.f17568e = lVar;
        this.f17567d = mVar;
        this.f17569f = cVar;
    }

    @Override // io.flutter.plugins.googlemobileads.g
    public void a() {
        r2.j jVar = this.f17570g;
        if (jVar != null) {
            this.f17565b.m(this.f17467a, jVar.getResponseInfo());
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e
    void b() {
        r2.j jVar = this.f17570g;
        if (jVar != null) {
            jVar.a();
            this.f17570g = null;
        }
    }

    @Override // io.flutter.plugins.googlemobileads.e
    public io.flutter.plugin.platform.d c() {
        r2.j jVar = this.f17570g;
        if (jVar == null) {
            return null;
        }
        return new b0(jVar);
    }

    m d() {
        r2.j jVar = this.f17570g;
        if (jVar == null || jVar.getAdSize() == null) {
            return null;
        }
        return new m(this.f17570g.getAdSize());
    }

    void e() {
        r2.j b7 = this.f17569f.b();
        this.f17570g = b7;
        b7.setAdUnitId(this.f17566c);
        this.f17570g.setAdSize(this.f17567d.a());
        this.f17570g.setOnPaidEventListener(new a0(this.f17565b, this));
        this.f17570g.setAdListener(new r(this.f17467a, this.f17565b, this));
        this.f17570g.b(this.f17568e.b(this.f17566c));
    }
}
