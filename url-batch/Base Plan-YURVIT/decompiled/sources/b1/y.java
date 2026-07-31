package b1;

import W0.g0;

/* loaded from: classes.dex */
public final class y extends P0.i implements O0.p {

    /* renamed from: g, reason: collision with root package name */
    public static final y f1780g;

    /* renamed from: h, reason: collision with root package name */
    public static final y f1781h;

    /* renamed from: i, reason: collision with root package name */
    public static final y f1782i;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1783f;

    static {
        int i2 = 2;
        f1780g = new y(i2, 0);
        f1781h = new y(i2, 1);
        f1782i = new y(i2, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i2, int i3) {
        super(i2);
        this.f1783f = i3;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        switch (this.f1783f) {
            case 0:
                G0.g gVar = (G0.g) obj2;
                if (!(gVar instanceof g0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? gVar : Integer.valueOf(intValue + 1);
            case 1:
                g0 g0Var = (g0) obj;
                G0.g gVar2 = (G0.g) obj2;
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
