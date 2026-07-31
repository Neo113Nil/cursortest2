package F;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;
import n.C0694u;

/* loaded from: classes.dex */
public final class L extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1211e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1212f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q.a f1213g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1214h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1215i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1216j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1217k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1218l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1219m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(int i3, InterfaceC0426e interfaceC0426e, Q.a aVar, InterfaceC0426e interfaceC0426e2, InterfaceC0426e interfaceC0426e3, r.X x3, InterfaceC0426e interfaceC0426e4, int i4) {
        super(2);
        this.f1212f = i3;
        this.f1215i = interfaceC0426e;
        this.f1213g = aVar;
        this.f1216j = interfaceC0426e2;
        this.f1217k = interfaceC0426e3;
        this.f1218l = x3;
        this.f1219m = interfaceC0426e4;
        this.f1214h = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f1211e) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0143d.U(this.f1212f | 1);
                Q.a aVar = this.f1213g;
                J j3 = (J) this.f1218l;
                d1.c((U.q) this.f1215i, (b0.Q) this.f1216j, (I) this.f1217k, j3, (C0694u) this.f1219m, aVar, (C0167p) obj, U3, this.f1214h);
                break;
            default:
                ((Number) obj2).intValue();
                int U4 = C0143d.U(this.f1214h | 1);
                Q.a aVar2 = this.f1213g;
                InterfaceC0426e interfaceC0426e = (InterfaceC0426e) this.f1216j;
                InterfaceC0426e interfaceC0426e2 = (InterfaceC0426e) this.f1217k;
                j1.b(this.f1212f, (InterfaceC0426e) this.f1215i, aVar2, interfaceC0426e, interfaceC0426e2, (r.X) this.f1218l, (InterfaceC0426e) this.f1219m, (C0167p) obj, U4);
                break;
        }
        return R1.y.f4171a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(U.q qVar, b0.Q q3, I i3, J j3, C0694u c0694u, Q.a aVar, int i4, int i5) {
        super(2);
        this.f1215i = qVar;
        this.f1216j = q3;
        this.f1217k = i3;
        this.f1218l = j3;
        this.f1219m = c0694u;
        this.f1213g = aVar;
        this.f1212f = i4;
        this.f1214h = i5;
    }
}
