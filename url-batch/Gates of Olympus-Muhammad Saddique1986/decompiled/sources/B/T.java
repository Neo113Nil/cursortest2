package B;

import I.C0143d;
import I.C0167p;
import a.AbstractC0235a;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class T extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U.q f314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q.a f315g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f316h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(U.q qVar, Q.a aVar, int i3, int i4) {
        super(2);
        this.f313e = i4;
        this.f314f = qVar;
        this.f315g = aVar;
        this.f316h = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        int i3 = this.f313e;
        C0167p c0167p = (C0167p) obj;
        ((Number) obj2).intValue();
        switch (i3) {
            case 0:
                int U3 = C0143d.U(this.f316h | 1);
                l0.c.f(this.f314f, this.f315g, c0167p, U3);
                break;
            default:
                int U4 = C0143d.U(this.f316h | 1);
                AbstractC0235a.h(this.f314f, this.f315g, c0167p, U4);
                break;
        }
        return R1.y.f4171a;
    }
}
