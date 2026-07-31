package x;

import I.InterfaceC0142c0;
import a0.C0238c;
import e2.InterfaceC0427f;
import q2.AbstractC0837y;

/* loaded from: classes.dex */
public final class h0 extends X1.i implements InterfaceC0427f {

    /* renamed from: h, reason: collision with root package name */
    public int f10136h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ p.T f10137i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ long f10138j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v2.c f10139k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f10140l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q.k f10141m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(v2.c cVar, InterfaceC0142c0 interfaceC0142c0, q.k kVar, V1.d dVar) {
        super(3, dVar);
        this.f10139k = cVar;
        this.f10140l = interfaceC0142c0;
        this.f10141m = kVar;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        long j3 = ((C0238c) obj2).f4722a;
        h0 h0Var = new h0(this.f10139k, this.f10140l, this.f10141m, (V1.d) obj3);
        h0Var.f10137i = (p.T) obj;
        h0Var.f10138j = j3;
        return h0Var.q(R1.y.f4171a);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10136h;
        v2.c cVar = this.f10139k;
        if (i3 == 0) {
            R1.a.e(obj);
            p.T t3 = this.f10137i;
            AbstractC0837y.r(cVar, null, null, new f0(this.f10140l, this.f10138j, this.f10141m, null), 3);
            this.f10136h = 1;
            obj = t3.c(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        AbstractC0837y.r(cVar, null, null, new g0(this.f10140l, ((Boolean) obj).booleanValue(), this.f10141m, null), 3);
        return R1.y.f4171a;
    }
}
