package F;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;

/* renamed from: F.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097h extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q.a f1554f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1555g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0097h(Q.a aVar, int i3, int i4) {
        super(2);
        this.f1553e = i4;
        switch (i4) {
            case 1:
                this.f1554f = aVar;
                this.f1555g = i3;
                super(2);
                break;
            default:
                float f3 = AbstractC0107m.f1658a;
                float f4 = AbstractC0107m.f1658a;
                this.f1554f = aVar;
                this.f1555g = i3;
                break;
        }
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        R1.y yVar = R1.y.f4171a;
        Q.a aVar = this.f1554f;
        int i3 = this.f1555g;
        int i4 = this.f1553e;
        C0167p c0167p = (C0167p) obj;
        ((Number) obj2).intValue();
        switch (i4) {
            case 0:
                int U3 = C0143d.U(i3 | 1);
                float f3 = AbstractC0107m.f1658a;
                float f4 = AbstractC0107m.f1658a;
                AbstractC0107m.b(aVar, c0167p, U3);
                break;
            default:
                n.t0.a(aVar, c0167p, C0143d.U(i3 | 1));
                break;
        }
        return yVar;
    }
}
