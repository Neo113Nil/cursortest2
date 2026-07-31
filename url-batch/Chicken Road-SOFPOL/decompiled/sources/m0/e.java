package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f4900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f4901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q6.q f4902f;

    public e(d dVar, f fVar, q6.q qVar) {
        this.f4900d = dVar;
        this.f4901e = fVar;
        this.f4902f = qVar;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        int i;
        d dVar = this.f4900d;
        dVar.f4887a = null;
        dVar.f4888b = null;
        u0.a aVar = this.f4901e.f4923g;
        int i8 = this.f4902f.f6203d;
        do {
            i = aVar.get();
        } while (!aVar.compareAndSet(i, ((i >>> 27) & 15) == i8 ? i - 1 : i));
        return c6.m.f1757a;
    }
}
