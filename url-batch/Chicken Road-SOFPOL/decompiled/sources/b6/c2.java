package b6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class c2 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p6.e f1290f;

    public /* synthetic */ c2(boolean z3, p6.e eVar, int i, int i8) {
        this.f1288d = i8;
        this.f1289e = z3;
        this.f1290f = eVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1288d) {
            case 0:
                ((Integer) obj2).getClass();
                int w7 = m0.b.w(49);
                d2.a(this.f1289e, (u0.c) this.f1290f, (m0.s) obj, w7);
                break;
            default:
                ((Integer) obj2).getClass();
                int w8 = m0.b.w(1);
                m.a.g(this.f1289e, this.f1290f, (m0.s) obj, w8);
                break;
        }
        return c6.m.f1757a;
    }
}
