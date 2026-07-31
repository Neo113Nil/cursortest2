package l;

import B.C0022x;
import I.C0143d;
import I.C0167p;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import m.l0;
import o.C0740b;

/* loaded from: classes.dex */
public final class r extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6530e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U.q f6531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6532g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6533h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6534i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6535j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ R1.e f6536k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(l0 l0Var, U.q qVar, G g3, H h3, Q.a aVar, int i3) {
        super(2);
        this.f6533h = l0Var;
        this.f6531f = qVar;
        this.f6534i = g3;
        this.f6535j = h3;
        this.f6536k = aVar;
        this.f6532g = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        switch (this.f6530e) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0143d.U(this.f6532g | 1);
                Q.a aVar = (Q.a) this.f6536k;
                androidx.compose.animation.a.c((l0) this.f6533h, this.f6531f, (G) this.f6534i, (H) this.f6535j, aVar, (C0167p) obj, U3);
                break;
            default:
                ((Number) obj2).intValue();
                int U4 = C0143d.U(this.f6532g | 1);
                C0022x c0022x = (C0022x) this.f6536k;
                InterfaceC0422a interfaceC0422a = (InterfaceC0422a) this.f6534i;
                U.q qVar = this.f6531f;
                o.p.d((o.g) this.f6533h, interfaceC0422a, qVar, (C0740b) this.f6535j, c0022x, (C0167p) obj, U4);
                break;
        }
        return R1.y.f4171a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(o.g gVar, InterfaceC0422a interfaceC0422a, U.q qVar, C0740b c0740b, C0022x c0022x, int i3) {
        super(2);
        this.f6533h = gVar;
        this.f6534i = interfaceC0422a;
        this.f6531f = qVar;
        this.f6535j = c0740b;
        this.f6536k = c0022x;
        this.f6532g = i3;
    }
}
