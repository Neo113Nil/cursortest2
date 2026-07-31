package R0;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class m extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f4101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0422a f4102f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ E f4103g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Q.a f4104h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4105i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f4106j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(D d3, InterfaceC0422a interfaceC0422a, E e3, Q.a aVar, int i3, int i4) {
        super(2);
        this.f4101e = d3;
        this.f4102f = interfaceC0422a;
        this.f4103g = e3;
        this.f4104h = aVar;
        this.f4105i = i3;
        this.f4106j = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0143d.U(this.f4105i | 1);
        Q.a aVar = this.f4104h;
        InterfaceC0422a interfaceC0422a = this.f4102f;
        n.a(this.f4101e, interfaceC0422a, this.f4103g, aVar, (C0167p) obj, U3, this.f4106j);
        return R1.y.f4171a;
    }
}
