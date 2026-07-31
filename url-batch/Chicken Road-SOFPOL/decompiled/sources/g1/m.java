package g1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f2864b;

    public /* synthetic */ m(q qVar, int i) {
        this.f2863a = i;
        this.f2864b = qVar;
    }

    @Override // g1.i
    public final double b(double d8) {
        switch (this.f2863a) {
            case 0:
                return r2.o.r(this.f2864b.f2878k.b(d8), r10.f2873e, r10.f2874f);
            default:
                return this.f2864b.f2881n.b(r2.o.r(d8, r0.f2873e, r0.f2874f));
        }
    }
}
