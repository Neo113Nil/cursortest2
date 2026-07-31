package u1;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import n.z0;
import t1.C1013A;

/* renamed from: u1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1139A extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1013A f9565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t1.x f9566g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ U.q f9567h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U.d f9568i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f9569j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f9570k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f9571l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f9572m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f9573n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9574o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1139A(C1013A c1013a, t1.x xVar, U.q qVar, U.d dVar, InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2, InterfaceC0424c interfaceC0424c3, InterfaceC0424c interfaceC0424c4, InterfaceC0424c interfaceC0424c5, int i3, int i4) {
        super(2);
        this.f9564e = i4;
        this.f9565f = c1013a;
        this.f9566g = xVar;
        this.f9567h = qVar;
        this.f9568i = dVar;
        this.f9569j = interfaceC0424c;
        this.f9570k = interfaceC0424c2;
        this.f9571l = interfaceC0424c3;
        this.f9572m = interfaceC0424c4;
        this.f9573n = interfaceC0424c5;
        this.f9574o = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f9564e) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0143d.U(this.f9574o | 1);
                InterfaceC0424c interfaceC0424c = this.f9570k;
                InterfaceC0424c interfaceC0424c2 = this.f9571l;
                z0.d(this.f9565f, this.f9566g, this.f9567h, this.f9568i, this.f9569j, interfaceC0424c, interfaceC0424c2, this.f9572m, this.f9573n, (C0167p) obj, U3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int U4 = C0143d.U(this.f9574o | 1);
                InterfaceC0424c interfaceC0424c3 = this.f9570k;
                InterfaceC0424c interfaceC0424c4 = this.f9571l;
                z0.d(this.f9565f, this.f9566g, this.f9567h, this.f9568i, this.f9569j, interfaceC0424c3, interfaceC0424c4, this.f9572m, this.f9573n, (C0167p) obj, U4);
                break;
            default:
                ((Number) obj2).intValue();
                int U5 = C0143d.U(this.f9574o | 1);
                InterfaceC0424c interfaceC0424c5 = this.f9570k;
                InterfaceC0424c interfaceC0424c6 = this.f9571l;
                z0.d(this.f9565f, this.f9566g, this.f9567h, this.f9568i, this.f9569j, interfaceC0424c5, interfaceC0424c6, this.f9572m, this.f9573n, (C0167p) obj, U5);
                break;
        }
        return R1.y.f4171a;
    }
}
