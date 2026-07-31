package x;

import I.InterfaceC0142c0;
import e2.InterfaceC0426e;
import n0.C0702C;
import p.C0780o0;
import p.E0;
import p.U0;
import q2.AbstractC0837y;

/* loaded from: classes.dex */
public final class i0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f10143h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10144i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v2.c f10145j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f10146k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q.k f10147l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f10148m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(v2.c cVar, InterfaceC0142c0 interfaceC0142c0, q.k kVar, InterfaceC0142c0 interfaceC0142c02, V1.d dVar) {
        super(2, dVar);
        this.f10145j = cVar;
        this.f10146k = interfaceC0142c0;
        this.f10147l = kVar;
        this.f10148m = interfaceC0142c02;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((i0) o((V1.d) obj2, (C0702C) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        i0 i0Var = new i0(this.f10145j, this.f10146k, this.f10147l, this.f10148m, dVar);
        i0Var.f10144i = obj;
        return i0Var;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10143h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            C0702C c0702c = (C0702C) this.f10144i;
            h0 h0Var = new h0(this.f10145j, this.f10146k, this.f10147l, null);
            C0780o0 c0780o0 = new C0780o0(this.f10148m, 2);
            this.f10143h = 1;
            p.L l3 = U0.f7613a;
            Object e3 = AbstractC0837y.e(new E0(c0702c, h0Var, c0780o0, new p.T(c0702c), null), this);
            if (e3 != aVar) {
                e3 = yVar;
            }
            if (e3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return yVar;
    }
}
