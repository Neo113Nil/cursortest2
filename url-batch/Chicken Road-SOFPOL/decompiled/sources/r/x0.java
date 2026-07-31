package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p6.c f6454e;

    public /* synthetic */ x0(p6.c cVar, int i) {
        this.f6453d = i;
        this.f6454e = cVar;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f6453d) {
            case 0:
                p6.c cVar = this.f6454e;
                Long l3 = (Long) obj;
                l3.longValue();
                return cVar.i(l3);
            default:
                w0.f fVar = (w0.f) this.f6454e.i((w0.k) obj);
                synchronized (w0.m.f7537c) {
                    w0.m.f7538d = w0.m.f7538d.f(fVar.g());
                }
                return fVar;
        }
    }
}
