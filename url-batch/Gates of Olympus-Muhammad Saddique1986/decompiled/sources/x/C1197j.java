package x;

import I.InterfaceC0142c0;
import I.U0;
import e2.InterfaceC0426e;
import n.C0659B;
import q2.InterfaceC0835w;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1197j extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f10149h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Q f10150i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f10151j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I0.A f10152k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B.a0 f10153l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I0.m f10154m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1197j(Q q3, InterfaceC0142c0 interfaceC0142c0, I0.A a3, B.a0 a0Var, I0.m mVar, V1.d dVar) {
        super(2, dVar);
        this.f10150i = q3;
        this.f10151j = interfaceC0142c0;
        this.f10152k = a3;
        this.f10153l = a0Var;
        this.f10154m = mVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1197j) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C1197j(this.f10150i, this.f10151j, this.f10152k, this.f10153l, this.f10154m, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10149h;
        Q q3 = this.f10150i;
        try {
            if (i3 == 0) {
                R1.a.e(obj);
                H1.c cVar = new H1.c(new U0(new E.v(this.f10151j, 4), null));
                C0659B c0659b = new C0659B(q3, this.f10152k, this.f10153l, this.f10154m, 2);
                this.f10149h = 1;
                if (cVar.d(c0659b, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                R1.a.e(obj);
            }
            N.g(q3);
            return R1.y.f4171a;
        } catch (Throwable th) {
            N.g(q3);
            throw th;
        }
    }
}
