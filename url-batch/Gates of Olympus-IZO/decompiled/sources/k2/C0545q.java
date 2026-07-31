package k2;

import h1.C0438i;

/* renamed from: k2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0545q implements Y1.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5380d;

    public /* synthetic */ C0545q(int i3) {
        this.f5380d = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f5380d) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((P1.i) obj).o((P1.g) obj2);
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return ((P1.i) obj).o((P1.g) obj2);
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                P1.g gVar = (P1.g) obj2;
                if (!(gVar instanceof o0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? gVar : Integer.valueOf(intValue + 1);
            case 5:
                o0 o0Var = (o0) obj;
                P1.g gVar2 = (P1.g) obj2;
                if (o0Var != null) {
                    return o0Var;
                }
                if (gVar2 instanceof o0) {
                    return (o0) gVar2;
                }
                return null;
            default:
                return (p2.w) obj;
        }
    }
}
