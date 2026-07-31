package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h implements p6.e {

    /* renamed from: e, reason: collision with root package name */
    public static final h f4942e = new h(0);

    /* renamed from: f, reason: collision with root package name */
    public static final h f4943f = new h(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4944d;

    public /* synthetic */ h(int i) {
        this.f4944d = i;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f4944d) {
            case 0:
                s sVar = (s) obj;
                int intValue = ((Number) obj2).intValue();
                if (!sVar.N(intValue & 1, (intValue & 3) != 2)) {
                    sVar.Q();
                }
                break;
            default:
                s sVar2 = (s) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!sVar2.N(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sVar2.Q();
                }
                break;
        }
        return c6.m.f1757a;
    }
}
