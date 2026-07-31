package u;

import I.C0089d;
import I.C0113p;
import h.AbstractC0416e;

/* renamed from: u.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0952u extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8093e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8095g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8096h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f8097i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f8098j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0952u(Object obj, int i3, C0922D c0922d, Q.a aVar, int i4) {
        super(2);
        this.f8094f = obj;
        this.f8095g = i3;
        this.f8097i = c0922d;
        this.f8098j = aVar;
        this.f8096h = i4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f8093e) {
            case 0:
                ((Number) obj2).intValue();
                int T2 = C0089d.T(this.f8096h | 1);
                int i3 = this.f8095g;
                Object obj3 = this.f8098j;
                AbstractC0416e.k((InterfaceC0953v) this.f8097i, this.f8094f, i3, obj3, (C0113p) obj, T2);
                break;
            default:
                ((Number) obj2).intValue();
                int T3 = C0089d.T(this.f8096h | 1);
                Q.a aVar = (Q.a) this.f8098j;
                g2.i.C(this.f8094f, this.f8095g, (C0922D) this.f8097i, aVar, (C0113p) obj, T3);
                break;
        }
        return L1.z.f2729a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0952u(InterfaceC0953v interfaceC0953v, Object obj, int i3, Object obj2, int i4) {
        super(2);
        this.f8097i = interfaceC0953v;
        this.f8094f = obj;
        this.f8095g = i3;
        this.f8098j = obj2;
        this.f8096h = i4;
    }
}
