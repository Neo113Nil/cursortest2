package D;

import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p0.InterfaceC0944E;

/* loaded from: classes.dex */
public final class O extends M2.p implements Function2 {

    /* renamed from: e, reason: collision with root package name */
    public static final O f1525e = new O(2, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final O f1526i = new O(2, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final O f1527j = new O(2, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final O f1528k = new O(2, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final O f1529l = new O(2, 4);

    /* renamed from: m, reason: collision with root package name */
    public static final O f1530m = new O(2, 5);

    /* renamed from: n, reason: collision with root package name */
    public static final O f1531n = new O(2, 6);

    /* renamed from: o, reason: collision with root package name */
    public static final O f1532o = new O(2, 7);

    /* renamed from: p, reason: collision with root package name */
    public static final O f1533p = new O(2, 8);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(int i2, int i4) {
        super(i2);
        this.f1534d = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f1534d) {
            case 0:
                C0216p c0216p = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
                    c0216p.N();
                }
                return Unit.f7487a;
            case 1:
                C0216p c0216p2 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p2.z()) {
                    c0216p2.N();
                }
                return Unit.f7487a;
            case 2:
                C0216p c0216p3 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p3.z()) {
                    c0216p3.N();
                }
                return Unit.f7487a;
            case 3:
                C0216p c0216p4 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p4.z()) {
                    c0216p4.N();
                }
                return Unit.f7487a;
            case 4:
                C0216p c0216p5 = (C0216p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0216p5.z()) {
                    c0216p5.N();
                } else {
                    W0.e(null, 0.0f, 0L, c0216p5, 0);
                }
                return Unit.f7487a;
            case 5:
                return Integer.valueOf(((InterfaceC0944E) obj).b(((Number) obj2).intValue()));
            case 6:
                return Integer.valueOf(((InterfaceC0944E) obj).X(((Number) obj2).intValue()));
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return Integer.valueOf(((InterfaceC0944E) obj).Z(((Number) obj2).intValue()));
            default:
                return Integer.valueOf(((InterfaceC0944E) obj).S(((Number) obj2).intValue()));
        }
    }
}
