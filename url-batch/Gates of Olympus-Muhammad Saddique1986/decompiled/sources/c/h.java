package c;

import B.a0;
import I.C0143d;
import I.C0167p;
import R1.y;
import e2.InterfaceC0426e;
import f2.k;
import x.N;

/* loaded from: classes.dex */
public final class h extends k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5460e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f5461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5462g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5463h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a0 a0Var, boolean z3, int i3) {
        super(2);
        this.f5463h = a0Var;
        this.f5461f = z3;
        this.f5462g = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        int i3 = this.f5460e;
        C0167p c0167p = (C0167p) obj;
        ((Number) obj2).intValue();
        switch (i3) {
            case 0:
                O2.d.f(this.f5461f, (InterfaceC0426e) this.f5463h, c0167p, this.f5462g | 1);
                break;
            default:
                N.f((a0) this.f5463h, this.f5461f, c0167p, C0143d.U(this.f5462g | 1));
                break;
        }
        return y.f4171a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z3, InterfaceC0426e interfaceC0426e, int i3) {
        super(2);
        this.f5461f = z3;
        this.f5463h = interfaceC0426e;
        this.f5462g = i3;
    }
}
