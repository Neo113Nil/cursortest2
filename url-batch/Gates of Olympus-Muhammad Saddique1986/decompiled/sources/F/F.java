package F;

import e2.InterfaceC0424c;
import l2.InterfaceC0604e;

/* loaded from: classes.dex */
public final class F extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final F f1140f = new F(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final F f1141g = new F(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final F f1142h = new F(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final F f1143i = new F(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final F f1144j = new F(1, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final F f1145k = new F(1, 5);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1146e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(int i3, int i4) {
        super(i3);
        this.f1146e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        R1.y yVar = R1.y.f4171a;
        switch (this.f1146e) {
            case 0:
                A0.u.d((A0.i) obj, 0);
                break;
            case 1:
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                A0.u.d((A0.i) obj, 0);
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                break;
            default:
                InterfaceC0604e[] interfaceC0604eArr = A0.u.f193a;
                A0.v vVar = A0.s.f177l;
                InterfaceC0604e interfaceC0604e = A0.u.f193a[5];
                vVar.a((A0.i) obj, Boolean.TRUE);
                break;
        }
        return yVar;
    }
}
