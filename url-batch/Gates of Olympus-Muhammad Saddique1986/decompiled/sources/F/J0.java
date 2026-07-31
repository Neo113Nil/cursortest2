package F;

import G.AbstractC0136c;
import I.C0167p;
import b0.C0352v;
import e2.InterfaceC0426e;
import m.AbstractC0620e;

/* loaded from: classes.dex */
public final class J0 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F0 f1202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1203f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1204g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1205h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(F0 f02, boolean z3, boolean z4, InterfaceC0426e interfaceC0426e) {
        super(2);
        this.f1202e = f02;
        this.f1203f = z3;
        this.f1204g = z4;
        this.f1205h = interfaceC0426e;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            C0.K a3 = B1.a(H.n.f2435g, c0167p);
            boolean z3 = this.f1204g;
            F0 f02 = this.f1202e;
            AbstractC0136c.a(((C0352v) l.M.a(!z3 ? f02.f1153g : this.f1203f ? f02.f1148b : f02.f1151e, AbstractC0620e.j(100, 0, null, 6), c0167p).getValue()).f5441a, a3, this.f1205h, c0167p, 0);
        }
        return R1.y.f4171a;
    }
}
