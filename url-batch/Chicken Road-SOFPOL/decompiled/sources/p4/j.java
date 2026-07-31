package p4;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j extends o4.p {

    /* renamed from: f, reason: collision with root package name */
    public final i f5747f;

    /* renamed from: g, reason: collision with root package name */
    public final u0.c f5748g;

    public j(i iVar, String str, u0.c cVar) {
        super(iVar, str);
        this.f5747f = iVar;
        this.f5748g = cVar;
    }

    @Override // o4.p
    public final o4.o a() {
        return (h) super.a();
    }

    @Override // o4.p
    public final o4.o b() {
        return new h(this.f5747f, this.f5748g);
    }
}
