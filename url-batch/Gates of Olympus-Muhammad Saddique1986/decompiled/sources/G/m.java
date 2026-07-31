package G;

import B.InterfaceC0013n;
import C0.K;
import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;
import x.AbstractC1191d;

/* loaded from: classes.dex */
public final class m extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f2008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2009g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2010h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2011i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(long j3, K k3, InterfaceC0426e interfaceC0426e, int i3, int i4) {
        super(2);
        this.f2007e = i4;
        this.f2008f = j3;
        this.f2009g = k3;
        this.f2010h = interfaceC0426e;
        this.f2011i = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f2007e) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0143d.U(this.f2011i | 1);
                K k3 = (K) this.f2009g;
                InterfaceC0426e interfaceC0426e = (InterfaceC0426e) this.f2010h;
                AbstractC0136c.a(this.f2008f, k3, interfaceC0426e, (C0167p) obj, U3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int U4 = C0143d.U(this.f2011i | 1);
                K k4 = (K) this.f2009g;
                InterfaceC0426e interfaceC0426e2 = (InterfaceC0426e) this.f2010h;
                z.b(this.f2008f, k4, interfaceC0426e2, (C0167p) obj, U4);
                break;
            default:
                ((Number) obj2).intValue();
                int U5 = C0143d.U(this.f2011i | 1);
                long j3 = this.f2008f;
                AbstractC1191d.a((InterfaceC0013n) this.f2009g, (U.q) this.f2010h, j3, (C0167p) obj, U5);
                break;
        }
        return R1.y.f4171a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC0013n interfaceC0013n, U.q qVar, long j3, int i3) {
        super(2);
        this.f2007e = 2;
        this.f2009g = interfaceC0013n;
        this.f2010h = qVar;
        this.f2008f = j3;
        this.f2011i = i3;
    }
}
