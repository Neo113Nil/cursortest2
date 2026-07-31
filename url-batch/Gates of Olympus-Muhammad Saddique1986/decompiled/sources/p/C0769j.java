package p;

import e2.InterfaceC0426e;
import java.util.concurrent.CancellationException;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* renamed from: p.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769j extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7684h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7685i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0771k f7686j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X0 f7687k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0757d f7688l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0769j(C0771k c0771k, X0 x02, InterfaceC0757d interfaceC0757d, V1.d dVar) {
        super(2, dVar);
        this.f7686j = c0771k;
        this.f7687k = x02;
        this.f7688l = interfaceC0757d;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0769j) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0769j c0769j = new C0769j(this.f7686j, this.f7687k, this.f7688l, dVar);
        c0769j.f7685i = obj;
        return c0769j;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7684h;
        C0771k c0771k = this.f7686j;
        try {
            try {
                if (i3 == 0) {
                    R1.a.e(obj);
                    q2.X k3 = AbstractC0837y.k(((InterfaceC0835w) this.f7685i).q());
                    c0771k.f7701z = true;
                    C0793v0 c0793v0 = c0771k.f7693r;
                    n.e0 e0Var = n.e0.f7122d;
                    C0767i c0767i = new C0767i(this.f7687k, c0771k, this.f7688l, k3, null);
                    this.f7684h = 1;
                    if (c0793v0.e(e0Var, c0767i, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R1.a.e(obj);
                }
                c0771k.f7696u.e();
                c0771k.f7701z = false;
                c0771k.f7696u.b(null);
                c0771k.f7699x = false;
                return R1.y.f4171a;
            } catch (CancellationException e3) {
                throw e3;
            }
        } catch (Throwable th) {
            c0771k.f7701z = false;
            c0771k.f7696u.b(null);
            c0771k.f7699x = false;
            throw th;
        }
    }
}
