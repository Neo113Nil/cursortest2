package h1;

import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* renamed from: h1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0482F extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f6068h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X1.i f6069i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0485c f6070j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0482F(InterfaceC0426e interfaceC0426e, C0485c c0485c, V1.d dVar) {
        super(2, dVar);
        this.f6069i = (X1.i) interfaceC0426e;
        this.f6070j = c0485c;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0482F) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X1.i, e2.e] */
    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0482F(this.f6069i, this.f6070j, dVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X1.i, e2.e] */
    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f6068h;
        if (i3 == 0) {
            R1.a.e(obj);
            Object obj2 = this.f6070j.f6137b;
            this.f6068h = 1;
            obj = this.f6069i.h(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return obj;
    }
}
