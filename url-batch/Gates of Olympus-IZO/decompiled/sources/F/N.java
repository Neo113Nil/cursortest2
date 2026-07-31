package F;

import I.C0113p;
import h1.C0438i;

/* loaded from: classes.dex */
public final class N extends Z1.j implements Y1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final N f1060f = new N(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final N f1061g = new N(2, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final N f1062h = new N(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final N f1063i = new N(2, 3);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1064e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(int i3, int i4) {
        super(i3);
        this.f1064e = i4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1064e) {
            case 0:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
                    c0113p.L();
                }
                break;
            case 1:
                C0113p c0113p2 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p2.x()) {
                    c0113p2.L();
                }
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                C0113p c0113p3 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p3.x()) {
                    c0113p3.L();
                }
                break;
            default:
                C0113p c0113p4 = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p4.x()) {
                    c0113p4.L();
                }
                break;
        }
        return L1.z.f2729a;
    }
}
