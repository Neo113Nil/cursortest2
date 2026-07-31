package F;

import G.AbstractC0136c;
import I.C0167p;
import e2.InterfaceC0426e;
import r.InterfaceC0849K;

/* loaded from: classes.dex */
public final class G extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f1155f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1156g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1157h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(long j3, Object obj, InterfaceC0426e interfaceC0426e, int i3) {
        super(2);
        this.f1154e = i3;
        this.f1155f = j3;
        this.f1156g = obj;
        this.f1157h = interfaceC0426e;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f1154e) {
            case 0:
                C0167p c0167p = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
                    c0167p.L();
                } else {
                    AbstractC0136c.a(this.f1155f, ((A1) c0167p.k(B1.f1124a)).f1112m, Q.f.b(1327513942, new C0087c((InterfaceC0849K) this.f1156g, 2, (Q.a) this.f1157h), c0167p), c0167p, 384);
                }
                break;
            default:
                C0167p c0167p2 = (C0167p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0167p2.x()) {
                    c0167p2.L();
                } else {
                    G.z.b(this.f1155f, (C0.K) this.f1156g, this.f1157h, c0167p2, 0);
                }
                break;
        }
        return R1.y.f4171a;
    }
}
