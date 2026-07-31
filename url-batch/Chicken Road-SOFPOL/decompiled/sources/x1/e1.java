package x1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e1 extends q6.j implements p6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f8403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x4.e f8404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f8405g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(boolean z3, x4.e eVar, String str) {
        super(0);
        this.f8403e = z3;
        this.f8404f = eVar;
        this.f8405g = str;
    }

    @Override // p6.a
    public final Object b() {
        if (this.f8403e) {
            x4.e eVar = this.f8404f;
            String str = this.f8405g;
            z4.a aVar = (z4.a) eVar.f8655a;
            synchronized (aVar.f9172c) {
            }
        }
        return c6.m.f1757a;
    }
}
