package p;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;
import n0.C0702C;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class E0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7505h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7506i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0702C f7507j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X1.i f7508k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f2.k f7509l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T f7510m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public E0(C0702C c0702c, InterfaceC0427f interfaceC0427f, InterfaceC0424c interfaceC0424c, T t3, V1.d dVar) {
        super(2, dVar);
        this.f7507j = c0702c;
        this.f7508k = (X1.i) interfaceC0427f;
        this.f7509l = (f2.k) interfaceC0424c;
        this.f7510m = t3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((E0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X1.i, e2.f] */
    /* JADX WARN: Type inference failed for: r3v0, types: [e2.c, f2.k] */
    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        ?? r3 = this.f7509l;
        T t3 = this.f7510m;
        E0 e02 = new E0(this.f7507j, this.f7508k, r3, t3, dVar);
        e02.f7506i = obj;
        return e02;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X1.i, e2.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [e2.c, f2.k] */
    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7505h;
        if (i3 == 0) {
            R1.a.e(obj);
            D0 d02 = new D0((InterfaceC0835w) this.f7506i, this.f7508k, this.f7509l, this.f7510m, null);
            this.f7505h = 1;
            if (n.r.g(this.f7507j, d02, this) == aVar) {
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
