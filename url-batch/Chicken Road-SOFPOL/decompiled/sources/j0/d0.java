package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d0 implements p6.e {

    /* renamed from: e, reason: collision with root package name */
    public static final d0 f3611e = new d0(0);

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f3612f = new d0(1);

    /* renamed from: g, reason: collision with root package name */
    public static final d0 f3613g = new d0(2);

    /* renamed from: h, reason: collision with root package name */
    public static final d0 f3614h = new d0(3);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3615d;

    public /* synthetic */ d0(int i) {
        this.f3615d = i;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f3615d) {
            case 0:
                m0.s sVar = (m0.s) obj;
                int intValue = ((Number) obj2).intValue();
                if (!sVar.N(intValue & 1, (intValue & 3) != 2)) {
                    sVar.Q();
                }
                break;
            case 1:
                m0.s sVar2 = (m0.s) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!sVar2.N(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sVar2.Q();
                }
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                m0.s sVar3 = (m0.s) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (!sVar3.N(intValue3 & 1, (intValue3 & 3) != 2)) {
                    sVar3.Q();
                }
                break;
            default:
                m0.s sVar4 = (m0.s) obj;
                int intValue4 = ((Number) obj2).intValue();
                if (!sVar4.N(intValue4 & 1, (intValue4 & 3) != 2)) {
                    sVar4.Q();
                }
                break;
        }
        return c6.m.f1757a;
    }
}
