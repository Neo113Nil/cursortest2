package R0;

import I.C0167p;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class q extends f2.k implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public static final q f4110f = new q(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final q f4111g = new q(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4112e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i3, int i4) {
        super(i3);
        this.f4112e = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f4112e) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                }
                break;
            default:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p2.x()) {
                    c0167p2.L();
                }
                break;
        }
        return R1.y.f4171a;
    }
}
