package R0;

import M0.g0;

/* loaded from: classes.dex */
public final class y extends F0.j implements E0.p {

    /* renamed from: g, reason: collision with root package name */
    public static final y f941g = new y(2, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final y f942h = new y(2, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final y f943i = new y(2, 2);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f944f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i2, int i3) {
        super(i2);
        this.f944f = i3;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        switch (this.f944f) {
            case 0:
                w0.g gVar = (w0.g) obj2;
                if (!(gVar instanceof g0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? gVar : Integer.valueOf(intValue + 1);
            case 1:
                g0 g0Var = (g0) obj;
                w0.g gVar2 = (w0.g) obj2;
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
