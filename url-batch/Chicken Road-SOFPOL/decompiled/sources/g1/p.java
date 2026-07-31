package g1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f2870f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i) {
        super(1);
        this.f2869e = i;
        this.f2870f = qVar;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f2869e) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f2870f.f2881n.b(r2.o.r(doubleValue, r10.f2873e, r10.f2874f)));
            default:
                return Double.valueOf(r2.o.r(this.f2870f.f2878k.b(((Number) obj).doubleValue()), r10.f2873e, r10.f2874f));
        }
    }
}
