package p;

import e2.InterfaceC0426e;

/* renamed from: p.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0760e0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7659h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7660i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J f7661j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0793v0 f7662k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0760e0(J j3, C0793v0 c0793v0, V1.d dVar) {
        super(2, dVar);
        this.f7661j = j3;
        this.f7662k = c0793v0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0760e0) o((V1.d) obj2, (C0787s0) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0760e0 c0760e0 = new C0760e0(this.f7661j, this.f7662k, dVar);
        c0760e0.f7660i = obj;
        return c0760e0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7659h;
        if (i3 == 0) {
            R1.a.e(obj);
            C0758d0 c0758d0 = new C0758d0((C0787s0) this.f7660i, 0, this.f7662k);
            this.f7659h = 1;
            if (this.f7661j.h(c0758d0, this) == aVar) {
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
