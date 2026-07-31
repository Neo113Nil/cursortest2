package R0;

import e2.InterfaceC0424c;
import l2.InterfaceC0604e;

/* renamed from: R0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215d extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0215d f4069f = new C0215d(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0215d f4070g = new C0215d(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C0215d f4071h = new C0215d(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0215d f4072i = new C0215d(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final C0215d f4073j = new C0215d(1, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final C0215d f4074k = new C0215d(1, 5);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0215d(int i3, int i4) {
        super(i3);
        this.f4075e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        R1.y yVar = R1.y.f4171a;
        switch (this.f4075e) {
            case 0:
                InterfaceC0604e[] interfaceC0604eArr = A0.u.f193a;
                ((A0.i) obj).c(A0.s.f183r, yVar);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                InterfaceC0604e[] interfaceC0604eArr2 = A0.u.f193a;
                ((A0.i) obj).c(A0.s.f182q, yVar);
                break;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                break;
            default:
                A a3 = (A) obj;
                if (a3.isAttachedToWindow()) {
                    a3.l();
                    break;
                }
                break;
        }
        return yVar;
    }
}
