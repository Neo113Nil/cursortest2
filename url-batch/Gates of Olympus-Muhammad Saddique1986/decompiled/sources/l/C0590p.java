package l;

import F.C0090d0;
import I.C0166o0;
import I.InterfaceC0142c0;
import I.U0;
import e2.InterfaceC0426e;
import m.l0;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590p extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f6517h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6518i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l0 f6519j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f6520k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0590p(l0 l0Var, InterfaceC0142c0 interfaceC0142c0, V1.d dVar) {
        super(2, dVar);
        this.f6519j = l0Var;
        this.f6520k = interfaceC0142c0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0590p) o((V1.d) obj2, (C0166o0) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0590p c0590p = new C0590p(this.f6519j, this.f6520k, dVar);
        c0590p.f6518i = obj;
        return c0590p;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6517h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0166o0 c0166o0 = (C0166o0) this.f6518i;
            l0 l0Var = this.f6519j;
            H1.c cVar = new H1.c(new U0(new C0589o(l0Var, 0), null));
            C0090d0 c0090d0 = new C0090d0(c0166o0, l0Var, this.f6520k, 1);
            this.f6517h = 1;
            if (cVar.d(c0090d0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return R1.y.f4171a;
    }
}
