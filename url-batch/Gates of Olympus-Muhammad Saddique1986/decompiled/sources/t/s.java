package t;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;
import n.T;
import n.z0;
import s.C0939h;

/* loaded from: classes.dex */
public final class s extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8505e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8507g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8508h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f8509i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f8510j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Object obj, int i3, x xVar, Q.a aVar, int i4) {
        super(2);
        this.f8506f = obj;
        this.f8507g = i3;
        this.f8509i = xVar;
        this.f8510j = aVar;
        this.f8508h = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f8505e) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0143d.U(this.f8508h | 1);
                Object obj3 = this.f8510j;
                z0.f((C0939h) this.f8509i, this.f8506f, this.f8507g, obj3, (C0167p) obj, U3);
                break;
            default:
                ((Number) obj2).intValue();
                int U4 = C0143d.U(this.f8508h | 1);
                Q.a aVar = (Q.a) this.f8510j;
                T.b(this.f8506f, this.f8507g, (x) this.f8509i, aVar, (C0167p) obj, U4);
                break;
        }
        return R1.y.f4171a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C0939h c0939h, Object obj, int i3, Object obj2, int i4) {
        super(2);
        this.f8509i = c0939h;
        this.f8506f = obj;
        this.f8507g = i3;
        this.f8510j = obj2;
        this.f8508h = i4;
    }
}
