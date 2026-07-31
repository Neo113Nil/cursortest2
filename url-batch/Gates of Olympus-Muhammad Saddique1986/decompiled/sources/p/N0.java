package p;

import a0.C0238c;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class N0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7558h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0427f f7559i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T f7560j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n0.s f7561k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(InterfaceC0427f interfaceC0427f, T t3, n0.s sVar, V1.d dVar) {
        super(2, dVar);
        this.f7559i = interfaceC0427f;
        this.f7560j = t3;
        this.f7561k = sVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((N0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new N0(this.f7559i, this.f7560j, this.f7561k, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7558h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0238c c0238c = new C0238c(this.f7561k.f7310c);
            this.f7558h = 1;
            if (this.f7559i.g(this.f7560j, c0238c, this) == aVar) {
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
