package u1;

import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class j extends t1.v {

    /* renamed from: f, reason: collision with root package name */
    public final i f9594f;

    /* renamed from: g, reason: collision with root package name */
    public final Q.a f9595g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0424c f9596h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0424c f9597i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0424c f9598j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0424c f9599k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0424c f9600l;

    public j(i iVar, String str, Q.a aVar) {
        super(iVar, str);
        this.f9594f = iVar;
        this.f9595g = aVar;
    }

    @Override // t1.v
    public final t1.u a() {
        h hVar = (h) super.a();
        hVar.f9588n = this.f9596h;
        hVar.f9589o = this.f9597i;
        hVar.f9590p = this.f9598j;
        hVar.f9591q = this.f9599k;
        hVar.f9592r = this.f9600l;
        return hVar;
    }

    @Override // t1.v
    public final t1.u b() {
        return new h(this.f9594f, this.f9595g);
    }
}
