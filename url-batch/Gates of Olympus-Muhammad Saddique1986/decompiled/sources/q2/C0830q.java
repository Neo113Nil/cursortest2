package q2;

import e2.InterfaceC0426e;

/* renamed from: q2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0830q implements InterfaceC0426e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7919d;

    public /* synthetic */ C0830q(int i3) {
        this.f7919d = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f7919d) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((V1.i) obj).d((V1.g) obj2);
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return ((V1.i) obj).d((V1.g) obj2);
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                V1.g gVar = (V1.g) obj2;
                if (!(gVar instanceof o0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? gVar : Integer.valueOf(intValue + 1);
            case 5:
                o0 o0Var = (o0) obj;
                V1.g gVar2 = (V1.g) obj2;
                if (o0Var != null) {
                    return o0Var;
                }
                if (gVar2 instanceof o0) {
                    return (o0) gVar2;
                }
                return null;
            default:
                return (v2.v) obj;
        }
    }
}
