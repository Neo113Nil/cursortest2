package p;

import a0.C0238c;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class A0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7477h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X1.i f7478i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T f7479j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n0.s f7480k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public A0(InterfaceC0427f interfaceC0427f, T t3, n0.s sVar, V1.d dVar) {
        super(2, dVar);
        this.f7478i = (X1.i) interfaceC0427f;
        this.f7479j = t3;
        this.f7480k = sVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((A0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X1.i, e2.f] */
    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new A0(this.f7478i, this.f7479j, this.f7480k, dVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X1.i, e2.f] */
    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7477h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0238c c0238c = new C0238c(this.f7480k.f7310c);
            this.f7477h = 1;
            if (this.f7478i.g(this.f7479j, c0238c, this) == aVar) {
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
