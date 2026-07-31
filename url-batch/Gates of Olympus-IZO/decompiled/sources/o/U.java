package o;

import I.C0113p;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import q1.C0784h;
import u0.AbstractC0963b0;
import u0.C0997t;

/* loaded from: classes.dex */
public final class U extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6465f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6466g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6467h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(Object obj, Object obj2, Object obj3, int i3) {
        super(2);
        this.f6464e = i3;
        this.f6465f = obj;
        this.f6466g = obj2;
        this.f6467h = obj3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f6464e) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                Z1.q qVar = (Z1.q) this.f6465f;
                float f3 = floatValue - qVar.f3477d;
                o0 o0Var = (o0) this.f6466g;
                long g3 = o0Var.g(o0Var.c(f3));
                o0 o0Var2 = ((l0) this.f6467h).f6573a;
                qVar.f3477d += o0Var.c(o0Var.f(o0.a(o0Var2, o0Var2.f6599h, g3, 1)));
                break;
            case 1:
                float floatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                AbstractC0552y.q((InterfaceC0550w) this.f6465f, null, null, new r1.v(floatValue2, (m.Z) this.f6466g, (C0784h) this.f6467h, null), 3);
                break;
            default:
                C0113p c0113p = (C0113p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
                    c0113p.L();
                } else {
                    AbstractC0963b0.a((C0997t) this.f6465f, (u0.T) this.f6466g, (Q.a) this.f6467h, c0113p, 0);
                }
                break;
        }
        return L1.z.f2729a;
    }
}
