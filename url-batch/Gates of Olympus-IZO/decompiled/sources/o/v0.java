package o;

import F.C0047j0;
import k2.InterfaceC0550w;
import n.C0666v;

/* loaded from: classes.dex */
public final class v0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6642e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6643f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v f6644g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0666v f6645h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0047j0 f6646i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M f6647j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(n0.v vVar, C0666v c0666v, C0047j0 c0047j0, M m3, P1.d dVar) {
        super(2, dVar);
        this.f6644g = vVar;
        this.f6645h = c0666v;
        this.f6646i = c0047j0;
        this.f6647j = m3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0047j0 c0047j0 = this.f6646i;
        M m3 = this.f6647j;
        v0 v0Var = new v0(this.f6644g, this.f6645h, c0047j0, m3, dVar);
        v0Var.f6643f = obj;
        return v0Var;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((v0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6642e;
        if (i3 == 0) {
            I2.l.Q(obj);
            u0 u0Var = new u0((InterfaceC0550w) this.f6643f, this.f6645h, this.f6646i, this.f6647j, null);
            this.f6642e = 1;
            if (g2.i.J(this.f6644g, u0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return L1.z.f2729a;
    }
}
