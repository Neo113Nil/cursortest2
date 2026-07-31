package N1;

import I.C0143d;
import I.C0167p;
import O2.l;
import R1.y;
import U.q;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import e2.InterfaceC0429h;
import h2.AbstractC0508a;
import java.util.List;
import k1.i;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC0426e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3571g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3572h;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i3, int i4) {
        this.f3568d = i4;
        this.f3570f = obj;
        this.f3571g = obj2;
        this.f3572h = obj3;
        this.f3569e = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        Integer num = (Integer) obj2;
        switch (this.f3568d) {
            case 0:
                num.getClass();
                AbstractC0508a.k((String) this.f3570f, (String) this.f3571g, (q) this.f3572h, c0167p, C0143d.U(this.f3569e | 1));
                break;
            case 1:
                num.intValue();
                AbstractC0508a.b((J1.a) this.f3570f, (InterfaceC0422a) this.f3571g, (InterfaceC0427f) this.f3572h, c0167p, C0143d.U(this.f3569e | 1));
                break;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                num.intValue();
                AbstractC0508a.a((J1.b) this.f3570f, (InterfaceC0422a) this.f3571g, (InterfaceC0422a) this.f3572h, c0167p, C0143d.U(this.f3569e | 1));
                break;
            default:
                num.intValue();
                l.H((List) this.f3570f, (InterfaceC0422a) this.f3571g, (InterfaceC0429h) this.f3572h, c0167p, C0143d.U(this.f3569e | 1));
                break;
        }
        return y.f4171a;
    }
}
