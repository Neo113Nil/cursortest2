package d1;

import Y0.g0;

/* loaded from: classes.dex */
public final class y extends Q0.i implements P0.p {

    /* renamed from: g, reason: collision with root package name */
    public static final y f2110g = new y(2, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final y f2111h = new y(2, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final y f2112i = new y(2, 2);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2113f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i2, int i3) {
        super(i2);
        this.f2113f = i3;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        switch (this.f2113f) {
            case 0:
                H0.g gVar = (H0.g) obj2;
                if (!(gVar instanceof g0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? gVar : Integer.valueOf(intValue + 1);
            case 1:
                g0 g0Var = (g0) obj;
                H0.g gVar2 = (H0.g) obj2;
                if (g0Var != null) {
                    return g0Var;
                }
                if (gVar2 instanceof g0) {
                    return (g0) gVar2;
                }
                return null;
            default:
                return (A) obj;
        }
    }
}
