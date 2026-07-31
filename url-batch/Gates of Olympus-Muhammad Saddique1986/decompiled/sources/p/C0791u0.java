package p;

import e2.InterfaceC0426e;

/* renamed from: p.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0791u0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7774h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7775i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0793v0 f7776j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X1.i f7777k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0791u0(C0793v0 c0793v0, InterfaceC0426e interfaceC0426e, V1.d dVar) {
        super(2, dVar);
        this.f7776j = c0793v0;
        this.f7777k = (X1.i) interfaceC0426e;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0791u0) o((V1.d) obj2, (U) obj)).q(R1.y.f4171a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X1.i, e2.e] */
    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0791u0 c0791u0 = new C0791u0(this.f7776j, this.f7777k, dVar);
        c0791u0.f7775i = obj;
        return c0791u0;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [X1.i, e2.e] */
    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7774h;
        if (i3 == 0) {
            R1.a.e(obj);
            U u3 = (U) this.f7775i;
            C0793v0 c0793v0 = this.f7776j;
            c0793v0.f7785h = u3;
            this.f7774h = 1;
            if (this.f7777k.h(c0793v0.f7786i, this) == aVar) {
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
